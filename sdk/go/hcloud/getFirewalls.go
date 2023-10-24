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

// Provides details about multiple Hetzner Cloud Firewall.
func GetFirewalls(ctx *pulumi.Context, args *GetFirewallsArgs, opts ...pulumi.InvokeOption) (*GetFirewallsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFirewallsResult
	err := ctx.Invoke("hcloud:index/getFirewalls:getFirewalls", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFirewalls.
type GetFirewallsArgs struct {
	// Sorts list by date.
	MostRecent *bool `pulumi:"mostRecent"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getFirewalls.
type GetFirewallsResult struct {
	// (list) List of all matching firewalls. See `data.hcloud_firewall` for schema.
	Firewalls []GetFirewallsFirewall `pulumi:"firewalls"`
	// The provider-assigned unique ID for this managed resource.
	Id           string  `pulumi:"id"`
	MostRecent   *bool   `pulumi:"mostRecent"`
	WithSelector *string `pulumi:"withSelector"`
}

func GetFirewallsOutput(ctx *pulumi.Context, args GetFirewallsOutputArgs, opts ...pulumi.InvokeOption) GetFirewallsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFirewallsResult, error) {
			args := v.(GetFirewallsArgs)
			r, err := GetFirewalls(ctx, &args, opts...)
			var s GetFirewallsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFirewallsResultOutput)
}

// A collection of arguments for invoking getFirewalls.
type GetFirewallsOutputArgs struct {
	// Sorts list by date.
	MostRecent pulumi.BoolPtrInput `pulumi:"mostRecent"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
}

func (GetFirewallsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFirewallsArgs)(nil)).Elem()
}

// A collection of values returned by getFirewalls.
type GetFirewallsResultOutput struct{ *pulumi.OutputState }

func (GetFirewallsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFirewallsResult)(nil)).Elem()
}

func (o GetFirewallsResultOutput) ToGetFirewallsResultOutput() GetFirewallsResultOutput {
	return o
}

func (o GetFirewallsResultOutput) ToGetFirewallsResultOutputWithContext(ctx context.Context) GetFirewallsResultOutput {
	return o
}

func (o GetFirewallsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetFirewallsResult] {
	return pulumix.Output[GetFirewallsResult]{
		OutputState: o.OutputState,
	}
}

// (list) List of all matching firewalls. See `data.hcloud_firewall` for schema.
func (o GetFirewallsResultOutput) Firewalls() GetFirewallsFirewallArrayOutput {
	return o.ApplyT(func(v GetFirewallsResult) []GetFirewallsFirewall { return v.Firewalls }).(GetFirewallsFirewallArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetFirewallsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFirewallsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetFirewallsResultOutput) MostRecent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetFirewallsResult) *bool { return v.MostRecent }).(pulumi.BoolPtrOutput)
}

func (o GetFirewallsResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetFirewallsResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFirewallsResultOutput{})
}
