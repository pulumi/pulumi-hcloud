// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific Hetzner Cloud Firewall.
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
// 		opt0 := "sample-firewall-1"
// 		_, err := hcloud.LookupFirewall(ctx, &GetFirewallArgs{
// 			Name: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt1 := 4711
// 		_, err = hcloud.LookupFirewall(ctx, &GetFirewallArgs{
// 			Id: &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupFirewall(ctx *pulumi.Context, args *LookupFirewallArgs, opts ...pulumi.InvokeOption) (*LookupFirewallResult, error) {
	var rv LookupFirewallResult
	err := ctx.Invoke("hcloud:index/getFirewall:getFirewall", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFirewall.
type LookupFirewallArgs struct {
	// Configuration of the Applied Resources
	ApplyTos []GetFirewallApplyTo `pulumi:"applyTos"`
	// ID of the firewall.
	Id *int `pulumi:"id"`
	// (map) User-defined labels (key-value pairs)
	Labels map[string]interface{} `pulumi:"labels"`
	// Return most recent firewall if multiple are found.
	MostRecent *bool `pulumi:"mostRecent"`
	// Name of the firewall.
	Name *string `pulumi:"name"`
	// (string)  Configuration of a Rule from this Firewall.
	Rules []GetFirewallRule `pulumi:"rules"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getFirewall.
type LookupFirewallResult struct {
	// Configuration of the Applied Resources
	ApplyTos []GetFirewallApplyTo `pulumi:"applyTos"`
	// (int) Unique ID of the Firewall.
	Id *int `pulumi:"id"`
	// (map) User-defined labels (key-value pairs)
	Labels     map[string]interface{} `pulumi:"labels"`
	MostRecent *bool                  `pulumi:"mostRecent"`
	// (string) Name of the Firewall.
	Name string `pulumi:"name"`
	// (string)  Configuration of a Rule from this Firewall.
	Rules        []GetFirewallRule `pulumi:"rules"`
	WithSelector *string           `pulumi:"withSelector"`
}

func LookupFirewallOutput(ctx *pulumi.Context, args LookupFirewallOutputArgs, opts ...pulumi.InvokeOption) LookupFirewallResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFirewallResult, error) {
			args := v.(LookupFirewallArgs)
			r, err := LookupFirewall(ctx, &args, opts...)
			return *r, err
		}).(LookupFirewallResultOutput)
}

// A collection of arguments for invoking getFirewall.
type LookupFirewallOutputArgs struct {
	// Configuration of the Applied Resources
	ApplyTos GetFirewallApplyToArrayInput `pulumi:"applyTos"`
	// ID of the firewall.
	Id pulumi.IntPtrInput `pulumi:"id"`
	// (map) User-defined labels (key-value pairs)
	Labels pulumi.MapInput `pulumi:"labels"`
	// Return most recent firewall if multiple are found.
	MostRecent pulumi.BoolPtrInput `pulumi:"mostRecent"`
	// Name of the firewall.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// (string)  Configuration of a Rule from this Firewall.
	Rules GetFirewallRuleArrayInput `pulumi:"rules"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
}

func (LookupFirewallOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFirewallArgs)(nil)).Elem()
}

// A collection of values returned by getFirewall.
type LookupFirewallResultOutput struct{ *pulumi.OutputState }

func (LookupFirewallResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFirewallResult)(nil)).Elem()
}

func (o LookupFirewallResultOutput) ToLookupFirewallResultOutput() LookupFirewallResultOutput {
	return o
}

func (o LookupFirewallResultOutput) ToLookupFirewallResultOutputWithContext(ctx context.Context) LookupFirewallResultOutput {
	return o
}

// Configuration of the Applied Resources
func (o LookupFirewallResultOutput) ApplyTos() GetFirewallApplyToArrayOutput {
	return o.ApplyT(func(v LookupFirewallResult) []GetFirewallApplyTo { return v.ApplyTos }).(GetFirewallApplyToArrayOutput)
}

// (int) Unique ID of the Firewall.
func (o LookupFirewallResultOutput) Id() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupFirewallResult) *int { return v.Id }).(pulumi.IntPtrOutput)
}

// (map) User-defined labels (key-value pairs)
func (o LookupFirewallResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupFirewallResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o LookupFirewallResultOutput) MostRecent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupFirewallResult) *bool { return v.MostRecent }).(pulumi.BoolPtrOutput)
}

// (string) Name of the Firewall.
func (o LookupFirewallResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirewallResult) string { return v.Name }).(pulumi.StringOutput)
}

// (string)  Configuration of a Rule from this Firewall.
func (o LookupFirewallResultOutput) Rules() GetFirewallRuleArrayOutput {
	return o.ApplyT(func(v LookupFirewallResult) []GetFirewallRule { return v.Rules }).(GetFirewallRuleArrayOutput)
}

func (o LookupFirewallResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupFirewallResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFirewallResultOutput{})
}
