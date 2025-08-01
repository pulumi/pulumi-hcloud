// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about multiple Hetzner Cloud Load Balancers.
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
//			_, err := hcloud.GetLoadBalancers(ctx, &hcloud.GetLoadBalancersArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.GetLoadBalancers(ctx, &hcloud.GetLoadBalancersArgs{
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
func GetLoadBalancers(ctx *pulumi.Context, args *GetLoadBalancersArgs, opts ...pulumi.InvokeOption) (*GetLoadBalancersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLoadBalancersResult
	err := ctx.Invoke("hcloud:index/getLoadBalancers:getLoadBalancers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLoadBalancers.
type GetLoadBalancersArgs struct {
	// [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getLoadBalancers.
type GetLoadBalancersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (list) List of all matching load balancers. See `data.hcloud_load_balancer` for schema.
	LoadBalancers []GetLoadBalancersLoadBalancer `pulumi:"loadBalancers"`
	WithSelector  *string                        `pulumi:"withSelector"`
}

func GetLoadBalancersOutput(ctx *pulumi.Context, args GetLoadBalancersOutputArgs, opts ...pulumi.InvokeOption) GetLoadBalancersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetLoadBalancersResultOutput, error) {
			args := v.(GetLoadBalancersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("hcloud:index/getLoadBalancers:getLoadBalancers", args, GetLoadBalancersResultOutput{}, options).(GetLoadBalancersResultOutput), nil
		}).(GetLoadBalancersResultOutput)
}

// A collection of arguments for invoking getLoadBalancers.
type GetLoadBalancersOutputArgs struct {
	// [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
}

func (GetLoadBalancersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLoadBalancersArgs)(nil)).Elem()
}

// A collection of values returned by getLoadBalancers.
type GetLoadBalancersResultOutput struct{ *pulumi.OutputState }

func (GetLoadBalancersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLoadBalancersResult)(nil)).Elem()
}

func (o GetLoadBalancersResultOutput) ToGetLoadBalancersResultOutput() GetLoadBalancersResultOutput {
	return o
}

func (o GetLoadBalancersResultOutput) ToGetLoadBalancersResultOutputWithContext(ctx context.Context) GetLoadBalancersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetLoadBalancersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLoadBalancersResult) string { return v.Id }).(pulumi.StringOutput)
}

// (list) List of all matching load balancers. See `data.hcloud_load_balancer` for schema.
func (o GetLoadBalancersResultOutput) LoadBalancers() GetLoadBalancersLoadBalancerArrayOutput {
	return o.ApplyT(func(v GetLoadBalancersResult) []GetLoadBalancersLoadBalancer { return v.LoadBalancers }).(GetLoadBalancersLoadBalancerArrayOutput)
}

func (o GetLoadBalancersResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLoadBalancersResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLoadBalancersResultOutput{})
}
