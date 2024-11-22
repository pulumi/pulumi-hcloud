// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a list of available Hetzner Cloud Datacenters.
//
// This resource may be useful to create highly available infrastructure, distributed across several Datacenters.
func GetDatacenters(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetDatacentersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDatacentersResult
	err := ctx.Invoke("hcloud:index/getDatacenters:getDatacenters", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getDatacenters.
type GetDatacentersResult struct {
	// Deprecated: Use datacenters list instead
	DatacenterIds []string                   `pulumi:"datacenterIds"`
	Datacenters   []GetDatacentersDatacenter `pulumi:"datacenters"`
	// Deprecated: Use datacenters list instead
	Descriptions []string `pulumi:"descriptions"`
	// The ID of this resource.
	Id string `pulumi:"id"`
	// Deprecated: Use datacenters list instead
	Names []string `pulumi:"names"`
}

func GetDatacentersOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetDatacentersResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetDatacentersResultOutput, error) {
		opts = internal.PkgInvokeDefaultOpts(opts)
		var rv GetDatacentersResult
		secret, err := ctx.InvokePackageRaw("hcloud:index/getDatacenters:getDatacenters", nil, &rv, "", opts...)
		if err != nil {
			return GetDatacentersResultOutput{}, err
		}

		output := pulumi.ToOutput(rv).(GetDatacentersResultOutput)
		if secret {
			return pulumi.ToSecret(output).(GetDatacentersResultOutput), nil
		}
		return output, nil
	}).(GetDatacentersResultOutput)
}

// A collection of values returned by getDatacenters.
type GetDatacentersResultOutput struct{ *pulumi.OutputState }

func (GetDatacentersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatacentersResult)(nil)).Elem()
}

func (o GetDatacentersResultOutput) ToGetDatacentersResultOutput() GetDatacentersResultOutput {
	return o
}

func (o GetDatacentersResultOutput) ToGetDatacentersResultOutputWithContext(ctx context.Context) GetDatacentersResultOutput {
	return o
}

// Deprecated: Use datacenters list instead
func (o GetDatacentersResultOutput) DatacenterIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDatacentersResult) []string { return v.DatacenterIds }).(pulumi.StringArrayOutput)
}

func (o GetDatacentersResultOutput) Datacenters() GetDatacentersDatacenterArrayOutput {
	return o.ApplyT(func(v GetDatacentersResult) []GetDatacentersDatacenter { return v.Datacenters }).(GetDatacentersDatacenterArrayOutput)
}

// Deprecated: Use datacenters list instead
func (o GetDatacentersResultOutput) Descriptions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDatacentersResult) []string { return v.Descriptions }).(pulumi.StringArrayOutput)
}

// The ID of this resource.
func (o GetDatacentersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatacentersResult) string { return v.Id }).(pulumi.StringOutput)
}

// Deprecated: Use datacenters list instead
func (o GetDatacentersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDatacentersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDatacentersResultOutput{})
}
