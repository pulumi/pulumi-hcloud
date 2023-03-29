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
	"fmt"
	"path/filepath"
	"unicode"
    _ "embed"

	"github.com/hetznercloud/terraform-provider-hcloud/hcloud"
	"github.com/pulumi/pulumi-hcloud/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
    "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/x"
    "github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

//go:embed cmd/pulumi-resource-hcloud/bridge-metadata.json
var metadata []byte


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

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(hcloud.Provider(),
		shimv2.WithDiffStrategy(shimv2.PlanState))

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
        MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		P:           p,
		Name:        "hcloud",
		Description: "A Pulumi package for creating and managing hcloud cloud resources.",
		Keywords:    []string{"pulumi", "hcloud"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-hcloud",
		GitHubOrg:   "hetznercloud",
		Config:      map[string]*tfbridge.SchemaInfo{},
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
			"hcloud_snapshot":               {Tok: makeResource(mainMod, "Snapshot")},
			"hcloud_firewall":               {Tok: makeResource(mainMod, "Firewall")},
			"hcloud_firewall_attachment":    {Tok: makeResource(mainMod, "FirewallAttachment")},
			"hcloud_managed_certificate":    {Tok: makeResource(mainMod, "ManagedCertificate")},
			"hcloud_uploaded_certificate":   {Tok: makeResource(mainMod, "UploadedCertificate")},
			"hcloud_placement_group":        {Tok: makeResource(mainMod, "PlacementGroup")},
			"hcloud_primary_ip":             {Tok: makeResource(mainMod, "PrimaryIp")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"hcloud_certificate":      {Tok: makeDataSource(mainMod, "getCertificate")},
			"hcloud_certificates":     {Tok: makeDataSource(mainMod, "getCertificates")},
			"hcloud_datacenter":       {Tok: makeDataSource(mainMod, "getDatacenter")},
			"hcloud_datacenters":      {Tok: makeDataSource(mainMod, "getDatacenters")},
			"hcloud_floating_ip":      {Tok: makeDataSource(mainMod, "getFloatingIp")},
			"hcloud_floating_ips":     {Tok: makeDataSource(mainMod, "getFloatingIps")},
			"hcloud_image":            {Tok: makeDataSource(mainMod, "getImage")},
			"hcloud_images":           {Tok: makeDataSource(mainMod, "getImages")},
			"hcloud_location":         {Tok: makeDataSource(mainMod, "getLocation")},
			"hcloud_locations":        {Tok: makeDataSource(mainMod, "getLocations")},
			"hcloud_server":           {Tok: makeDataSource(mainMod, "getServer")},
			"hcloud_servers":          {Tok: makeDataSource(mainMod, "getServers")},
			"hcloud_ssh_key":          {Tok: makeDataSource(mainMod, "getSshKey")},
			"hcloud_network":          {Tok: makeDataSource(mainMod, "getNetwork")},
			"hcloud_networks":         {Tok: makeDataSource(mainMod, "getNetworks")},
			"hcloud_ssh_keys":         {Tok: makeDataSource(mainMod, "getSshKeys")},
			"hcloud_volume":           {Tok: makeDataSource(mainMod, "getVolume")},
			"hcloud_volumes":          {Tok: makeDataSource(mainMod, "getVolumes")},
			"hcloud_load_balancer":    {Tok: makeDataSource(mainMod, "getLoadBalancer")},
			"hcloud_load_balancers":   {Tok: makeDataSource(mainMod, "getLoadBalancers")},
			"hcloud_server_type":      {Tok: makeDataSource(mainMod, "getServerType")},
			"hcloud_server_types":     {Tok: makeDataSource(mainMod, "getServerTypes")},
			"hcloud_firewall":         {Tok: makeDataSource(mainMod, "getFirewall")},
			"hcloud_firewalls":        {Tok: makeDataSource(mainMod, "getFirewalls")},
			"hcloud_placement_group":  {Tok: makeDataSource(mainMod, "getPlacementGroup")},
			"hcloud_placement_groups": {Tok: makeDataSource(mainMod, "getPlacementGroups")},
			"hcloud_primary_ip":       {Tok: makeDataSource(mainMod, "getPrimaryIp")},
			"hcloud_primary_ips":      {Tok: makeDataSource(mainMod, "getPrimaryIps")},
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
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
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

    err := x.AutoAliasing(&prov, prov.GetMetadata())
    contract.AssertNoError(err)
	prov.SetAutonaming(255, "-")

	return prov
}

