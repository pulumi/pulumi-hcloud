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
	_ "embed" // embed is used to store bridge-metadata.json in the compiled binary
	"fmt"
	"path"

	"github.com/hetznercloud/terraform-provider-hcloud/hcloud"
	"github.com/pulumi/pulumi-hcloud/provider/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
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
			shimv2.NewProvider(hcloud.Provider(), shimv2.WithDiffStrategy(shimv2.PlanState)),
			hcloud.NewPluginProvider()),
		Name:         "hcloud",
		Description:  "A Pulumi package for creating and managing hcloud cloud resources.",
		Keywords:     []string{"pulumi", "hcloud"},
		License:      "Apache-2.0",
		Homepage:     "https://pulumi.io",
		Repository:   "https://github.com/pulumi/pulumi-hcloud",
		GitHubOrg:    "hetznercloud",
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		Resources: map[string]*tfbridge.ResourceInfo{
			"hcloud_certificate": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"certificate": {
						CSharpName: "CertificateContents",
					},
				},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
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
		},

		CSharp: &tfbridge.CSharpInfo{
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

	prov.SetAutonaming(255, "-")

	return prov
}
