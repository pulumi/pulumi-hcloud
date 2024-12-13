// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific Hetzner Cloud Location.
//
// Use this resource to get detailed information about a specific Location.
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
//			_, err := hcloud.GetLocation(ctx, &hcloud.GetLocationArgs{
//				Id: pulumi.IntRef(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.GetLocation(ctx, &hcloud.GetLocationArgs{
//				Name: pulumi.StringRef("fsn1"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetLocation(ctx *pulumi.Context, args *GetLocationArgs, opts ...pulumi.InvokeOption) (*GetLocationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLocationResult
	err := ctx.Invoke("hcloud:index/getLocation:getLocation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLocation.
type GetLocationArgs struct {
	// ID of the Location.
	Id *int `pulumi:"id"`
	// Name of the Location.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getLocation.
type GetLocationResult struct {
	// Name of the closest city to the Location. City name and optionally state in short form.
	City string `pulumi:"city"`
	// Country the Location resides in. ISO 3166-1 alpha-2 code of the country.
	Country string `pulumi:"country"`
	// Description of the Location.
	Description string `pulumi:"description"`
	// ID of the Location.
	Id *int `pulumi:"id"`
	// Latitude of the city closest to the Location.
	Latitude float64 `pulumi:"latitude"`
	// Longitude of the city closest to the Location.
	Longitude float64 `pulumi:"longitude"`
	// Name of the Location.
	Name *string `pulumi:"name"`
	// Name of the Network Zone this Location resides in.
	NetworkZone string `pulumi:"networkZone"`
}

func GetLocationOutput(ctx *pulumi.Context, args GetLocationOutputArgs, opts ...pulumi.InvokeOption) GetLocationResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetLocationResultOutput, error) {
			args := v.(GetLocationArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("hcloud:index/getLocation:getLocation", args, GetLocationResultOutput{}, options).(GetLocationResultOutput), nil
		}).(GetLocationResultOutput)
}

// A collection of arguments for invoking getLocation.
type GetLocationOutputArgs struct {
	// ID of the Location.
	Id pulumi.IntPtrInput `pulumi:"id"`
	// Name of the Location.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (GetLocationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLocationArgs)(nil)).Elem()
}

// A collection of values returned by getLocation.
type GetLocationResultOutput struct{ *pulumi.OutputState }

func (GetLocationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLocationResult)(nil)).Elem()
}

func (o GetLocationResultOutput) ToGetLocationResultOutput() GetLocationResultOutput {
	return o
}

func (o GetLocationResultOutput) ToGetLocationResultOutputWithContext(ctx context.Context) GetLocationResultOutput {
	return o
}

// Name of the closest city to the Location. City name and optionally state in short form.
func (o GetLocationResultOutput) City() pulumi.StringOutput {
	return o.ApplyT(func(v GetLocationResult) string { return v.City }).(pulumi.StringOutput)
}

// Country the Location resides in. ISO 3166-1 alpha-2 code of the country.
func (o GetLocationResultOutput) Country() pulumi.StringOutput {
	return o.ApplyT(func(v GetLocationResult) string { return v.Country }).(pulumi.StringOutput)
}

// Description of the Location.
func (o GetLocationResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetLocationResult) string { return v.Description }).(pulumi.StringOutput)
}

// ID of the Location.
func (o GetLocationResultOutput) Id() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetLocationResult) *int { return v.Id }).(pulumi.IntPtrOutput)
}

// Latitude of the city closest to the Location.
func (o GetLocationResultOutput) Latitude() pulumi.Float64Output {
	return o.ApplyT(func(v GetLocationResult) float64 { return v.Latitude }).(pulumi.Float64Output)
}

// Longitude of the city closest to the Location.
func (o GetLocationResultOutput) Longitude() pulumi.Float64Output {
	return o.ApplyT(func(v GetLocationResult) float64 { return v.Longitude }).(pulumi.Float64Output)
}

// Name of the Location.
func (o GetLocationResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLocationResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Name of the Network Zone this Location resides in.
func (o GetLocationResultOutput) NetworkZone() pulumi.StringOutput {
	return o.ApplyT(func(v GetLocationResult) string { return v.NetworkZone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLocationResultOutput{})
}
