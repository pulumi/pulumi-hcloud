// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := hcloud.LookupNetwork(ctx, &hcloud.LookupNetworkArgs{
//				Id: pulumi.IntRef(1234),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.LookupNetwork(ctx, &hcloud.LookupNetworkArgs{
//				Name: pulumi.StringRef("my-network"),
//			}, nil)
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
func LookupNetwork(ctx *pulumi.Context, args *LookupNetworkArgs, opts ...pulumi.InvokeOption) (*LookupNetworkResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkResult
	err := ctx.Invoke("hcloud:index/getNetwork:getNetwork", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetwork.
type LookupNetworkArgs struct {
	// ID of the Network.
	Id *int `pulumi:"id"`
	// IPv4 prefix of the Network.
	IpRange *string           `pulumi:"ipRange"`
	Labels  map[string]string `pulumi:"labels"`
	// Deprecated: This attribute has no purpose.
	MostRecent *bool `pulumi:"mostRecent"`
	// Name of the Network.
	Name *string `pulumi:"name"`
	// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/reference/cloud#label-selector).
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getNetwork.
type LookupNetworkResult struct {
	// (bool) Whether delete protection is enabled.
	DeleteProtection bool `pulumi:"deleteProtection"`
	// (bool) Indicates if the routes from this network should be exposed to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
	ExposeRoutesToVswitch bool `pulumi:"exposeRoutesToVswitch"`
	// Unique ID of the Network.
	Id int `pulumi:"id"`
	// IPv4 prefix of the Network.
	IpRange string            `pulumi:"ipRange"`
	Labels  map[string]string `pulumi:"labels"`
	// Deprecated: This attribute has no purpose.
	MostRecent *bool `pulumi:"mostRecent"`
	// Name of the Network.
	Name         string  `pulumi:"name"`
	WithSelector *string `pulumi:"withSelector"`
}

func LookupNetworkOutput(ctx *pulumi.Context, args LookupNetworkOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupNetworkResultOutput, error) {
			args := v.(LookupNetworkArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("hcloud:index/getNetwork:getNetwork", args, LookupNetworkResultOutput{}, options).(LookupNetworkResultOutput), nil
		}).(LookupNetworkResultOutput)
}

// A collection of arguments for invoking getNetwork.
type LookupNetworkOutputArgs struct {
	// ID of the Network.
	Id pulumi.IntPtrInput `pulumi:"id"`
	// IPv4 prefix of the Network.
	IpRange pulumi.StringPtrInput `pulumi:"ipRange"`
	Labels  pulumi.StringMapInput `pulumi:"labels"`
	// Deprecated: This attribute has no purpose.
	MostRecent pulumi.BoolPtrInput `pulumi:"mostRecent"`
	// Name of the Network.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/reference/cloud#label-selector).
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
}

func (LookupNetworkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkArgs)(nil)).Elem()
}

// A collection of values returned by getNetwork.
type LookupNetworkResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkResult)(nil)).Elem()
}

func (o LookupNetworkResultOutput) ToLookupNetworkResultOutput() LookupNetworkResultOutput {
	return o
}

func (o LookupNetworkResultOutput) ToLookupNetworkResultOutputWithContext(ctx context.Context) LookupNetworkResultOutput {
	return o
}

// (bool) Whether delete protection is enabled.
func (o LookupNetworkResultOutput) DeleteProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNetworkResult) bool { return v.DeleteProtection }).(pulumi.BoolOutput)
}

// (bool) Indicates if the routes from this network should be exposed to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
func (o LookupNetworkResultOutput) ExposeRoutesToVswitch() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNetworkResult) bool { return v.ExposeRoutesToVswitch }).(pulumi.BoolOutput)
}

// Unique ID of the Network.
func (o LookupNetworkResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupNetworkResult) int { return v.Id }).(pulumi.IntOutput)
}

// IPv4 prefix of the Network.
func (o LookupNetworkResultOutput) IpRange() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.IpRange }).(pulumi.StringOutput)
}

func (o LookupNetworkResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNetworkResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

// Deprecated: This attribute has no purpose.
func (o LookupNetworkResultOutput) MostRecent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupNetworkResult) *bool { return v.MostRecent }).(pulumi.BoolPtrOutput)
}

// Name of the Network.
func (o LookupNetworkResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupNetworkResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupNetworkResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkResultOutput{})
}
