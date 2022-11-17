// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific Hetzner Cloud Load Balancer.
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
//			_, err := hcloud.LookupLoadBalancer(ctx, &GetLoadBalancerArgs{
//				Name: pulumi.StringRef("my-load-balancer"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.LookupLoadBalancer(ctx, &GetLoadBalancerArgs{
//				Id: pulumi.IntRef(123),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.LookupLoadBalancer(ctx, &GetLoadBalancerArgs{
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
func LookupLoadBalancer(ctx *pulumi.Context, args *LookupLoadBalancerArgs, opts ...pulumi.InvokeOption) (*LookupLoadBalancerResult, error) {
	var rv LookupLoadBalancerResult
	err := ctx.Invoke("hcloud:index/getLoadBalancer:getLoadBalancer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLoadBalancer.
type LookupLoadBalancerArgs struct {
	// ID of the Load Balancer.
	Id *int `pulumi:"id"`
	// Name of the Load Balancer.
	Name *string `pulumi:"name"`
	// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getLoadBalancer.
type LookupLoadBalancerResult struct {
	// (Optional) Configuration of the algorithm the Load Balancer use.
	Algorithms []GetLoadBalancerAlgorithm `pulumi:"algorithms"`
	// (boolean) Whether delete protection is enabled.
	DeleteProtection bool `pulumi:"deleteProtection"`
	// (int) Unique ID of the Load Balancer.
	Id int `pulumi:"id"`
	// (string) IPv4 Address of the Load Balancer.
	Ipv4 string `pulumi:"ipv4"`
	// (string) IPv4 Address of the Load Balancer.
	Ipv6 string `pulumi:"ipv6"`
	// (map) User-defined labels (key-value pairs) .
	Labels map[string]interface{} `pulumi:"labels"`
	// (string) Name of the Type of the Load Balancer.
	LoadBalancerType string `pulumi:"loadBalancerType"`
	// (string) Name of the location the Load Balancer is in.
	Location string `pulumi:"location"`
	// (string) Name of the Load Balancer.
	Name        *string `pulumi:"name"`
	NetworkZone string  `pulumi:"networkZone"`
	// (list) List of services a Load Balancer provides.
	Services []GetLoadBalancerServiceType `pulumi:"services"`
	// (list) List of targets of the Load Balancer.
	Targets      []GetLoadBalancerTargetType `pulumi:"targets"`
	WithSelector *string                     `pulumi:"withSelector"`
}

func LookupLoadBalancerOutput(ctx *pulumi.Context, args LookupLoadBalancerOutputArgs, opts ...pulumi.InvokeOption) LookupLoadBalancerResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupLoadBalancerResult, error) {
			args := v.(LookupLoadBalancerArgs)
			r, err := LookupLoadBalancer(ctx, &args, opts...)
			var s LookupLoadBalancerResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupLoadBalancerResultOutput)
}

// A collection of arguments for invoking getLoadBalancer.
type LookupLoadBalancerOutputArgs struct {
	// ID of the Load Balancer.
	Id pulumi.IntPtrInput `pulumi:"id"`
	// Name of the Load Balancer.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
}

func (LookupLoadBalancerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancerArgs)(nil)).Elem()
}

// A collection of values returned by getLoadBalancer.
type LookupLoadBalancerResultOutput struct{ *pulumi.OutputState }

func (LookupLoadBalancerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancerResult)(nil)).Elem()
}

func (o LookupLoadBalancerResultOutput) ToLookupLoadBalancerResultOutput() LookupLoadBalancerResultOutput {
	return o
}

func (o LookupLoadBalancerResultOutput) ToLookupLoadBalancerResultOutputWithContext(ctx context.Context) LookupLoadBalancerResultOutput {
	return o
}

// (Optional) Configuration of the algorithm the Load Balancer use.
func (o LookupLoadBalancerResultOutput) Algorithms() GetLoadBalancerAlgorithmArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []GetLoadBalancerAlgorithm { return v.Algorithms }).(GetLoadBalancerAlgorithmArrayOutput)
}

// (boolean) Whether delete protection is enabled.
func (o LookupLoadBalancerResultOutput) DeleteProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) bool { return v.DeleteProtection }).(pulumi.BoolOutput)
}

// (int) Unique ID of the Load Balancer.
func (o LookupLoadBalancerResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) int { return v.Id }).(pulumi.IntOutput)
}

// (string) IPv4 Address of the Load Balancer.
func (o LookupLoadBalancerResultOutput) Ipv4() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Ipv4 }).(pulumi.StringOutput)
}

// (string) IPv4 Address of the Load Balancer.
func (o LookupLoadBalancerResultOutput) Ipv6() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Ipv6 }).(pulumi.StringOutput)
}

// (map) User-defined labels (key-value pairs) .
func (o LookupLoadBalancerResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

// (string) Name of the Type of the Load Balancer.
func (o LookupLoadBalancerResultOutput) LoadBalancerType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.LoadBalancerType }).(pulumi.StringOutput)
}

// (string) Name of the location the Load Balancer is in.
func (o LookupLoadBalancerResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Location }).(pulumi.StringOutput)
}

// (string) Name of the Load Balancer.
func (o LookupLoadBalancerResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o LookupLoadBalancerResultOutput) NetworkZone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.NetworkZone }).(pulumi.StringOutput)
}

// (list) List of services a Load Balancer provides.
func (o LookupLoadBalancerResultOutput) Services() GetLoadBalancerServiceTypeArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []GetLoadBalancerServiceType { return v.Services }).(GetLoadBalancerServiceTypeArrayOutput)
}

// (list) List of targets of the Load Balancer.
func (o LookupLoadBalancerResultOutput) Targets() GetLoadBalancerTargetTypeArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []GetLoadBalancerTargetType { return v.Targets }).(GetLoadBalancerTargetTypeArrayOutput)
}

func (o LookupLoadBalancerResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLoadBalancerResultOutput{})
}
