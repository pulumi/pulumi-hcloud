// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package hcloud

import (
	"context"
	"fmt"
	"path"

	_ "embed" // embed is used to store bridge-metadata.json in the compiled binary

	"github.com/hetznercloud/terraform-provider-hcloud/hcloud"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"

	"github.com/pulumi/pulumi-hcloud/provider/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "hcloud"
	// modules:
	mainMod = "index" // the y module
)

//go:embed cmd/pulumi-resource-hcloud/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	prov := tfbridge.ProviderInfo{
		P: pfbridge.MuxShimWithPF(context.Background(),
			shimv2.NewProvider(hcloud.Provider()),
			hcloud.NewPluginProvider()),
		Name:         "hcloud",
		Description:  "A Pulumi package for creating and managing hcloud cloud resources.",
		Keywords:     []string{"pulumi", "hcloud"},
		License:      "Apache-2.0",
		Homepage:     "https://pulumi.io",
		Repository:   "https://github.com/pulumi/pulumi-hcloud",
		GitHubOrg:    "hetznercloud",
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		Version:      version.Version,
		Resources: map[string]*tfbridge.ResourceInfo{
			"hcloud_certificate": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"certificate": {
						CSharpName: "CertificateContents",
					},
				},
			},
			"hcloud_server": {
				// Work around
				// https://github.com/hetznercloud/terraform-provider-hcloud/issues/650
				// by applying the fix described in
				// https://github.com/hetznercloud/terraform-provider-hcloud/issues/650#issuecomment-1497160625.
				PreCheckCallback: func(
					ctx context.Context, config resource.PropertyMap, _ resource.PropertyMap,
				) (resource.PropertyMap, error) {
					const debug = "Fixing up for https://github.com/hetznercloud/terraform-provider-hcloud/issues/650"
					networksProp, ok := config["networks"]
					if !ok || !networksProp.IsArray() {
						return config, nil
					}
					networks := networksProp.ArrayValue()
					for _, networkProp := range networks {
						if !networkProp.IsObject() {
							continue
						}
						const aliasIps = "aliasIps"
						network := networkProp.ObjectValue()
						if _, ok := network[aliasIps]; !ok {
							tfbridge.GetLogger(ctx).Debug(debug)
							network[aliasIps] = resource.NewProperty([]resource.PropertyValue{})
						}
					}
					return config, nil
				},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions

			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,

			PyProject: struct{ Enabled bool }{true},
		},

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},

		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "HCloud",
			},
		},
	}

	prov.MustComputeTokens(tks.SingleModule("hcloud_",
		mainMod, tks.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()

	prov.P.ResourcesMap().Range(func(key string, value shim.Resource) bool {
		if id, ok := value.Schema().GetOk("id"); ok && id.Type() != shim.TypeString {
			r := prov.Resources[key]
			if r.Fields == nil {
				r.Fields = make(map[string]*tfbridge.SchemaInfo, 1)
			}
			r.Fields["id"] = &tfbridge.SchemaInfo{Type: "string"}
		}
		return true
	})

	prov.SetAutonaming(255, "-")

	return prov
}
