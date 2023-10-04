// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

var _ = internal.GetEnvOrDefault

// The Hetzner Cloud API endpoint, can be used to override the default API Endpoint https://api.hetzner.cloud/v1.
func GetEndpoint(ctx *pulumi.Context) string {
	return config.Get(ctx, "hcloud:endpoint")
}

// The interval at which actions are polled by the client. Default `500ms`. Increase this interval if you run into rate
// limiting errors.
func GetPollInterval(ctx *pulumi.Context) string {
	return config.Get(ctx, "hcloud:pollInterval")
}

// The Hetzner Cloud API token, can also be specified with the HCLOUD_TOKEN environment variable.
func GetToken(ctx *pulumi.Context) string {
	return config.Get(ctx, "hcloud:token")
}
