// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides details about multiple Hetzner Cloud Networks.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := hcloud.LookupNetwork(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.LookupNetwork(ctx, &hcloud.LookupNetworkArgs{
//				WithSelector: pulumi.StringRef("key=value"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetNetworks(ctx *pulumi.Context, args *GetNetworksArgs, opts ...pulumi.InvokeOption) (*GetNetworksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
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

func GetNetworksOutput(ctx *pulumi.Context, args GetNetworksOutputArgs, opts ...pulumi.InvokeOption) GetNetworksResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNetworksResult, error) {
			args := v.(GetNetworksArgs)
			r, err := GetNetworks(ctx, &args, opts...)
			var s GetNetworksResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNetworksResultOutput)
}

// A collection of arguments for invoking getNetworks.
type GetNetworksOutputArgs struct {
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
}

func (GetNetworksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworksArgs)(nil)).Elem()
}

// A collection of values returned by getNetworks.
type GetNetworksResultOutput struct{ *pulumi.OutputState }

func (GetNetworksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworksResult)(nil)).Elem()
}

func (o GetNetworksResultOutput) ToGetNetworksResultOutput() GetNetworksResultOutput {
	return o
}

func (o GetNetworksResultOutput) ToGetNetworksResultOutputWithContext(ctx context.Context) GetNetworksResultOutput {
	return o
}

func (o GetNetworksResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetNetworksResult] {
	return pulumix.Output[GetNetworksResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetNetworksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworksResult) string { return v.Id }).(pulumi.StringOutput)
}

// (list) List of all matching networks. See `data.hcloud_network` for schema.
func (o GetNetworksResultOutput) Networks() GetNetworksNetworkArrayOutput {
	return o.ApplyT(func(v GetNetworksResult) []GetNetworksNetwork { return v.Networks }).(GetNetworksNetworkArrayOutput)
}

func (o GetNetworksResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworksResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNetworksResultOutput{})
}
