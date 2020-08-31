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
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/hashicorp/terraform-plugin-sdk/terraform"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v2/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
	"github.com/terraform-providers/terraform-provider-hcloud/hcloud"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "hcloud"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c *terraform.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := hcloud.Provider().(*schema.Provider)

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                    p,
		Name:                 "hcloud",
		Description:          "A Pulumi package for creating and managing hcloud cloud resources.",
		Keywords:             []string{"pulumi", "hcloud"},
		License:              "Apache-2.0",
		Homepage:             "https://pulumi.io",
		Repository:           "https://github.com/pulumi/pulumi-hcloud",
		Config:               map[string]*tfbridge.SchemaInfo{},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			"hcloud_certificate": {
				Tok: makeResource(mainMod, "Certificate"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"certificate": {
						CSharpName: "CertificateContents",
					},
				},
			},
			"hcloud_server":                 {Tok: makeResource(mainMod, "Server")},
			"hcloud_server_network":         {Tok: makeResource(mainMod, "ServerNetwork")},
			"hcloud_floating_ip":            {Tok: makeResource(mainMod, "FloatingIp")},
			"hcloud_floating_ip_assignment": {Tok: makeResource(mainMod, "FloatingIpAssignment")},
			"hcloud_rdns":                   {Tok: makeResource(mainMod, "Rdns")},
			"hcloud_ssh_key":                {Tok: makeResource(mainMod, "SshKey")},
			"hcloud_volume":                 {Tok: makeResource(mainMod, "Volume")},
			"hcloud_volume_attachment":      {Tok: makeResource(mainMod, "VolumeAttachment")},
			"hcloud_network":                {Tok: makeResource(mainMod, "Network")},
			"hcloud_network_route":          {Tok: makeResource(mainMod, "NetworkRoute")},
			"hcloud_network_subnet":         {Tok: makeResource(mainMod, "NetworkSubnet")},
			"hcloud_load_balancer":          {Tok: makeResource(mainMod, "LoadBalancer")},
			"hcloud_load_balancer_network":  {Tok: makeResource(mainMod, "LoadBalancerNetwork")},
			"hcloud_load_balancer_service":  {Tok: makeResource(mainMod, "LoadBalancerService")},
			"hcloud_load_balancer_target":   {Tok: makeResource(mainMod, "LoadBalancerTarget")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"hcloud_certificate":   {Tok: makeDataSource(mainMod, "getCertificate")},
			"hcloud_datacenter":    {Tok: makeDataSource(mainMod, "getDatacenter")},
			"hcloud_datacenters":   {Tok: makeDataSource(mainMod, "getDatacenters")},
			"hcloud_floating_ip":   {Tok: makeDataSource(mainMod, "getFloatingIp")},
			"hcloud_image":         {Tok: makeDataSource(mainMod, "getImage")},
			"hcloud_location":      {Tok: makeDataSource(mainMod, "getLocation")},
			"hcloud_locations":     {Tok: makeDataSource(mainMod, "getLocations")},
			"hcloud_server":        {Tok: makeDataSource(mainMod, "getServer")},
			"hcloud_ssh_key":       {Tok: makeDataSource(mainMod, "getSshKey")},
			"hcloud_network":       {Tok: makeDataSource(mainMod, "getNetwork")},
			"hcloud_ssh_keys":      {Tok: makeDataSource(mainMod, "getSshKeys")},
			"hcloud_volume":        {Tok: makeDataSource(mainMod, "getVolume")},
			"hcloud_load_balancer": {Tok: makeDataSource(mainMod, "getLoadBalancer")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^2.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=2.9.0,<3.0.0",
			},
			UsesIOClasses: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: map[string]string{
				mainPkg: "HCloud",
			},
		},
	}

	// For all resources with name properties, we will add an auto-name property.  Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	const nameProperty = "name"
	for resname, res := range prov.Resources {
		if schema := p.ResourcesMap[resname]; schema != nil {
			// Only apply auto-name to input properties (Optional || Required) named `name`
			if tfs, has := schema.Schema[nameProperty]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[nameProperty]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					res.Fields[nameProperty] = tfbridge.AutoName(nameProperty, 255)
				}
			}
		}
	}

	return prov
}
