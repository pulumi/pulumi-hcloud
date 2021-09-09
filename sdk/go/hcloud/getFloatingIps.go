// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about multiple Hetzner Cloud Floating IPs.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "key=value"
// 		_, err := hcloud.GetFloatingIps(ctx, &hcloud.GetFloatingIpsArgs{
// 			WithSelector: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetFloatingIps(ctx *pulumi.Context, args *GetFloatingIpsArgs, opts ...pulumi.InvokeOption) (*GetFloatingIpsResult, error) {
	var rv GetFloatingIpsResult
	err := ctx.Invoke("hcloud:index/getFloatingIps:getFloatingIps", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFloatingIps.
type GetFloatingIpsArgs struct {
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getFloatingIps.
type GetFloatingIpsResult struct {
	// (list) List of all matching floating ips. See `data.hcloud_floating_ip` for schema.
	FloatingIps []GetFloatingIpsFloatingIp `pulumi:"floatingIps"`
	// The provider-assigned unique ID for this managed resource.
	Id           string  `pulumi:"id"`
	WithSelector *string `pulumi:"withSelector"`
}