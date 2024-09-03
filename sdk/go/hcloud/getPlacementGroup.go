// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// layout: "hcloud"
// page_title: "Hetzner Cloud: PlacementGroup"
// sidebar_current: "docs-hcloud-datasource-placement-group"
// description: |-
// Provides details about a specific Hetzner Cloud Placement Group.
// <!-- yaml: line 6: could not find expected ':' -->
//
// # PlacementGroup
//
// Provides details about a specific Hetzner Cloud Placement Group.
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
//			_, err := hcloud.LookupPlacementGroup(ctx, &hcloud.LookupPlacementGroupArgs{
//				Name: pulumi.StringRef("sample-placement-group-1"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.LookupPlacementGroup(ctx, &hcloud.LookupPlacementGroupArgs{
//				Id: pulumi.IntRef(4711),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupPlacementGroup(ctx *pulumi.Context, args *LookupPlacementGroupArgs, opts ...pulumi.InvokeOption) (*LookupPlacementGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPlacementGroupResult
	err := ctx.Invoke("hcloud:index/getPlacementGroup:getPlacementGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPlacementGroup.
type LookupPlacementGroupArgs struct {
	// ID of the placement group.
	Id *int `pulumi:"id"`
	// (map) User-defined labels (key-value pairs)
	Labels map[string]string `pulumi:"labels"`
	// Return most recent placement group if multiple are found.
	MostRecent *bool `pulumi:"mostRecent"`
	// Name of the placement group.
	Name *string `pulumi:"name"`
	// (string)  Type of the Placement Group.
	Type *string `pulumi:"type"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getPlacementGroup.
type LookupPlacementGroupResult struct {
	// (int) Unique ID of the Placement Group.
	Id int `pulumi:"id"`
	// (map) User-defined labels (key-value pairs)
	Labels     map[string]string `pulumi:"labels"`
	MostRecent *bool             `pulumi:"mostRecent"`
	// (string) Name of the Placement Group.
	Name    string `pulumi:"name"`
	Servers []int  `pulumi:"servers"`
	// (string)  Type of the Placement Group.
	Type         string  `pulumi:"type"`
	WithSelector *string `pulumi:"withSelector"`
}

func LookupPlacementGroupOutput(ctx *pulumi.Context, args LookupPlacementGroupOutputArgs, opts ...pulumi.InvokeOption) LookupPlacementGroupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPlacementGroupResult, error) {
			args := v.(LookupPlacementGroupArgs)
			r, err := LookupPlacementGroup(ctx, &args, opts...)
			var s LookupPlacementGroupResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPlacementGroupResultOutput)
}

// A collection of arguments for invoking getPlacementGroup.
type LookupPlacementGroupOutputArgs struct {
	// ID of the placement group.
	Id pulumi.IntPtrInput `pulumi:"id"`
	// (map) User-defined labels (key-value pairs)
	Labels pulumi.StringMapInput `pulumi:"labels"`
	// Return most recent placement group if multiple are found.
	MostRecent pulumi.BoolPtrInput `pulumi:"mostRecent"`
	// Name of the placement group.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// (string)  Type of the Placement Group.
	Type pulumi.StringPtrInput `pulumi:"type"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
}

func (LookupPlacementGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPlacementGroupArgs)(nil)).Elem()
}

// A collection of values returned by getPlacementGroup.
type LookupPlacementGroupResultOutput struct{ *pulumi.OutputState }

func (LookupPlacementGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPlacementGroupResult)(nil)).Elem()
}

func (o LookupPlacementGroupResultOutput) ToLookupPlacementGroupResultOutput() LookupPlacementGroupResultOutput {
	return o
}

func (o LookupPlacementGroupResultOutput) ToLookupPlacementGroupResultOutputWithContext(ctx context.Context) LookupPlacementGroupResultOutput {
	return o
}

// (int) Unique ID of the Placement Group.
func (o LookupPlacementGroupResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) int { return v.Id }).(pulumi.IntOutput)
}

// (map) User-defined labels (key-value pairs)
func (o LookupPlacementGroupResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

func (o LookupPlacementGroupResultOutput) MostRecent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) *bool { return v.MostRecent }).(pulumi.BoolPtrOutput)
}

// (string) Name of the Placement Group.
func (o LookupPlacementGroupResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupPlacementGroupResultOutput) Servers() pulumi.IntArrayOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) []int { return v.Servers }).(pulumi.IntArrayOutput)
}

// (string)  Type of the Placement Group.
func (o LookupPlacementGroupResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) string { return v.Type }).(pulumi.StringOutput)
}

func (o LookupPlacementGroupResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPlacementGroupResultOutput{})
}
