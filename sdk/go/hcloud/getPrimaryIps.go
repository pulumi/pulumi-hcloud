// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about multiple Hetzner Cloud Primary IPs.
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
// 		_, err := hcloud.GetPrimaryIps(ctx, &GetPrimaryIpsArgs{
// 			WithSelector: pulumi.StringRef("key=value"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetPrimaryIps(ctx *pulumi.Context, args *GetPrimaryIpsArgs, opts ...pulumi.InvokeOption) (*GetPrimaryIpsResult, error) {
	var rv GetPrimaryIpsResult
	err := ctx.Invoke("hcloud:index/getPrimaryIps:getPrimaryIps", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrimaryIps.
type GetPrimaryIpsArgs struct {
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getPrimaryIps.
type GetPrimaryIpsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (list) List of all matching primary ips. See `data.hcloud_primary_ip` for schema.
	PrimaryIps   []GetPrimaryIpsPrimaryIp `pulumi:"primaryIps"`
	WithSelector *string                  `pulumi:"withSelector"`
}

func GetPrimaryIpsOutput(ctx *pulumi.Context, args GetPrimaryIpsOutputArgs, opts ...pulumi.InvokeOption) GetPrimaryIpsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPrimaryIpsResult, error) {
			args := v.(GetPrimaryIpsArgs)
			r, err := GetPrimaryIps(ctx, &args, opts...)
			var s GetPrimaryIpsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPrimaryIpsResultOutput)
}

// A collection of arguments for invoking getPrimaryIps.
type GetPrimaryIpsOutputArgs struct {
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
}

func (GetPrimaryIpsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPrimaryIpsArgs)(nil)).Elem()
}

// A collection of values returned by getPrimaryIps.
type GetPrimaryIpsResultOutput struct{ *pulumi.OutputState }

func (GetPrimaryIpsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPrimaryIpsResult)(nil)).Elem()
}

func (o GetPrimaryIpsResultOutput) ToGetPrimaryIpsResultOutput() GetPrimaryIpsResultOutput {
	return o
}

func (o GetPrimaryIpsResultOutput) ToGetPrimaryIpsResultOutputWithContext(ctx context.Context) GetPrimaryIpsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetPrimaryIpsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPrimaryIpsResult) string { return v.Id }).(pulumi.StringOutput)
}

// (list) List of all matching primary ips. See `data.hcloud_primary_ip` for schema.
func (o GetPrimaryIpsResultOutput) PrimaryIps() GetPrimaryIpsPrimaryIpArrayOutput {
	return o.ApplyT(func(v GetPrimaryIpsResult) []GetPrimaryIpsPrimaryIp { return v.PrimaryIps }).(GetPrimaryIpsPrimaryIpArrayOutput)
}

func (o GetPrimaryIpsResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrimaryIpsResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPrimaryIpsResultOutput{})
}
