// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about multiple Hetzner Cloud Networks.
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
// 		_, err := hcloud.LookupNetwork(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt0 := "key=value"
// 		_, err = hcloud.LookupNetwork(ctx, &hcloud.LookupNetworkArgs{
// 			WithSelector: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetNetworks(ctx *pulumi.Context, args *GetNetworksArgs, opts ...pulumi.InvokeOption) (*GetNetworksResult, error) {
	var rv GetNetworksResult
	err := ctx.Invoke("hcloud:index/getNetworks:getNetworks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworks.
type GetNetworksArgs struct {
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getNetworks.
type GetNetworksResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (list) List of all matching networks. See `data.hcloud_network` for schema.
	Networks     []GetNetworksNetwork `pulumi:"networks"`
	WithSelector *string              `pulumi:"withSelector"`
}