// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about multiple Hetzner Cloud Images.
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
//			_, err := hcloud.GetImages(ctx, &hcloud.GetImagesArgs{
//				WithArchitectures: []string{
//					"x86",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.GetImages(ctx, &hcloud.GetImagesArgs{
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
func GetImages(ctx *pulumi.Context, args *GetImagesArgs, opts ...pulumi.InvokeOption) (*GetImagesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetImagesResult
	err := ctx.Invoke("hcloud:index/getImages:getImages", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImages.
type GetImagesArgs struct {
	// Also list images that are marked as deprecated.
	IncludeDeprecated *bool `pulumi:"includeDeprecated"`
	// Sorts list by date.
	MostRecent *bool `pulumi:"mostRecent"`
	// List only images with this architecture, could contain `x86` or `arm`.
	WithArchitectures []string `pulumi:"withArchitectures"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
	// List only images with the specified status, could contain `creating` or `available`.
	WithStatuses []string `pulumi:"withStatuses"`
}

// A collection of values returned by getImages.
type GetImagesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (list) List of all matching images. See `data.hcloud_image` for schema.
	Images            []GetImagesImage `pulumi:"images"`
	IncludeDeprecated *bool            `pulumi:"includeDeprecated"`
	MostRecent        *bool            `pulumi:"mostRecent"`
	WithArchitectures []string         `pulumi:"withArchitectures"`
	WithSelector      *string          `pulumi:"withSelector"`
	WithStatuses      []string         `pulumi:"withStatuses"`
}

func GetImagesOutput(ctx *pulumi.Context, args GetImagesOutputArgs, opts ...pulumi.InvokeOption) GetImagesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetImagesResultOutput, error) {
			args := v.(GetImagesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("hcloud:index/getImages:getImages", args, GetImagesResultOutput{}, options).(GetImagesResultOutput), nil
		}).(GetImagesResultOutput)
}

// A collection of arguments for invoking getImages.
type GetImagesOutputArgs struct {
	// Also list images that are marked as deprecated.
	IncludeDeprecated pulumi.BoolPtrInput `pulumi:"includeDeprecated"`
	// Sorts list by date.
	MostRecent pulumi.BoolPtrInput `pulumi:"mostRecent"`
	// List only images with this architecture, could contain `x86` or `arm`.
	WithArchitectures pulumi.StringArrayInput `pulumi:"withArchitectures"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
	// List only images with the specified status, could contain `creating` or `available`.
	WithStatuses pulumi.StringArrayInput `pulumi:"withStatuses"`
}

func (GetImagesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImagesArgs)(nil)).Elem()
}

// A collection of values returned by getImages.
type GetImagesResultOutput struct{ *pulumi.OutputState }

func (GetImagesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImagesResult)(nil)).Elem()
}

func (o GetImagesResultOutput) ToGetImagesResultOutput() GetImagesResultOutput {
	return o
}

func (o GetImagesResultOutput) ToGetImagesResultOutputWithContext(ctx context.Context) GetImagesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetImagesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetImagesResult) string { return v.Id }).(pulumi.StringOutput)
}

// (list) List of all matching images. See `data.hcloud_image` for schema.
func (o GetImagesResultOutput) Images() GetImagesImageArrayOutput {
	return o.ApplyT(func(v GetImagesResult) []GetImagesImage { return v.Images }).(GetImagesImageArrayOutput)
}

func (o GetImagesResultOutput) IncludeDeprecated() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetImagesResult) *bool { return v.IncludeDeprecated }).(pulumi.BoolPtrOutput)
}

func (o GetImagesResultOutput) MostRecent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetImagesResult) *bool { return v.MostRecent }).(pulumi.BoolPtrOutput)
}

func (o GetImagesResultOutput) WithArchitectures() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetImagesResult) []string { return v.WithArchitectures }).(pulumi.StringArrayOutput)
}

func (o GetImagesResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImagesResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func (o GetImagesResultOutput) WithStatuses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetImagesResult) []string { return v.WithStatuses }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetImagesResultOutput{})
}
