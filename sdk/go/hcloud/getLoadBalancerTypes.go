// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a list of available Hetzner Cloud Load Balancer Types.
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
//			_, err := hcloud.GetLoadBalancerTypes(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetLoadBalancerTypes(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetLoadBalancerTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLoadBalancerTypesResult
	err := ctx.Invoke("hcloud:index/getLoadBalancerTypes:getLoadBalancerTypes", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getLoadBalancerTypes.
type GetLoadBalancerTypesResult struct {
	Id string `pulumi:"id"`
	// (list) List of all load balancer types. See `data.hcloud_load_balancer_type` for the schema.
	LoadBalancerTypes []GetLoadBalancerTypesLoadBalancerType `pulumi:"loadBalancerTypes"`
}

func GetLoadBalancerTypesOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetLoadBalancerTypesResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetLoadBalancerTypesResultOutput, error) {
		opts = internal.PkgInvokeDefaultOpts(opts)
		var rv GetLoadBalancerTypesResult
		secret, err := ctx.InvokePackageRaw("hcloud:index/getLoadBalancerTypes:getLoadBalancerTypes", nil, &rv, "", opts...)
		if err != nil {
			return GetLoadBalancerTypesResultOutput{}, err
		}

		output := pulumi.ToOutput(rv).(GetLoadBalancerTypesResultOutput)
		if secret {
			return pulumi.ToSecret(output).(GetLoadBalancerTypesResultOutput), nil
		}
		return output, nil
	}).(GetLoadBalancerTypesResultOutput)
}

// A collection of values returned by getLoadBalancerTypes.
type GetLoadBalancerTypesResultOutput struct{ *pulumi.OutputState }

func (GetLoadBalancerTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLoadBalancerTypesResult)(nil)).Elem()
}

func (o GetLoadBalancerTypesResultOutput) ToGetLoadBalancerTypesResultOutput() GetLoadBalancerTypesResultOutput {
	return o
}

func (o GetLoadBalancerTypesResultOutput) ToGetLoadBalancerTypesResultOutputWithContext(ctx context.Context) GetLoadBalancerTypesResultOutput {
	return o
}

func (o GetLoadBalancerTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLoadBalancerTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

// (list) List of all load balancer types. See `data.hcloud_load_balancer_type` for the schema.
func (o GetLoadBalancerTypesResultOutput) LoadBalancerTypes() GetLoadBalancerTypesLoadBalancerTypeArrayOutput {
	return o.ApplyT(func(v GetLoadBalancerTypesResult) []GetLoadBalancerTypesLoadBalancerType { return v.LoadBalancerTypes }).(GetLoadBalancerTypesLoadBalancerTypeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLoadBalancerTypesResultOutput{})
}