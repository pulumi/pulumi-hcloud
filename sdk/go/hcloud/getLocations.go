// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a list of available Hetzner Cloud Locations.
//
// This resource may be useful to create highly available infrastructure, distributed across several locations.
func GetLocations(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetLocationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLocationsResult
	err := ctx.Invoke("hcloud:index/getLocations:getLocations", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getLocations.
type GetLocationsResult struct {
	// Deprecated: Use locations list instead
	Descriptions []string `pulumi:"descriptions"`
	// The ID of this resource.
	Id string `pulumi:"id"`
	// Deprecated: Use locations list instead
	LocationIds []string               `pulumi:"locationIds"`
	Locations   []GetLocationsLocation `pulumi:"locations"`
	// Deprecated: Use locations list instead
	Names []string `pulumi:"names"`
}

func GetLocationsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetLocationsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetLocationsResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("hcloud:index/getLocations:getLocations", nil, GetLocationsResultOutput{}, options).(GetLocationsResultOutput), nil
	}).(GetLocationsResultOutput)
}

// A collection of values returned by getLocations.
type GetLocationsResultOutput struct{ *pulumi.OutputState }

func (GetLocationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLocationsResult)(nil)).Elem()
}

func (o GetLocationsResultOutput) ToGetLocationsResultOutput() GetLocationsResultOutput {
	return o
}

func (o GetLocationsResultOutput) ToGetLocationsResultOutputWithContext(ctx context.Context) GetLocationsResultOutput {
	return o
}

// Deprecated: Use locations list instead
func (o GetLocationsResultOutput) Descriptions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLocationsResult) []string { return v.Descriptions }).(pulumi.StringArrayOutput)
}

// The ID of this resource.
func (o GetLocationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLocationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Deprecated: Use locations list instead
func (o GetLocationsResultOutput) LocationIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLocationsResult) []string { return v.LocationIds }).(pulumi.StringArrayOutput)
}

func (o GetLocationsResultOutput) Locations() GetLocationsLocationArrayOutput {
	return o.ApplyT(func(v GetLocationsResult) []GetLocationsLocation { return v.Locations }).(GetLocationsLocationArrayOutput)
}

// Deprecated: Use locations list instead
func (o GetLocationsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLocationsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLocationsResultOutput{})
}
