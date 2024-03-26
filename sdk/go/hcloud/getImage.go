// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			image1, err := hcloud.GetImage(ctx, &hcloud.GetImageArgs{
//				Id: pulumi.IntRef(1234),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.GetImage(ctx, &hcloud.GetImageArgs{
//				Name:             pulumi.StringRef("ubuntu-18.04"),
//				WithArchitecture: pulumi.StringRef("x86"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.GetImage(ctx, &hcloud.GetImageArgs{
//				WithSelector: pulumi.StringRef("key=value"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewServer(ctx, "main", &hcloud.ServerArgs{
//				Image: pulumi.Int(image1.Id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetImage(ctx *pulumi.Context, args *GetImageArgs, opts ...pulumi.InvokeOption) (*GetImageResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetImageResult
	err := ctx.Invoke("hcloud:index/getImage:getImage", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImage.
type GetImageArgs struct {
	// ID of the Image.
	Id *int `pulumi:"id"`
	// Also return the image if it is marked as deprecated.
	IncludeDeprecated *bool `pulumi:"includeDeprecated"`
	// If more than one result is returned, use the most recent Image.
	MostRecent *bool `pulumi:"mostRecent"`
	// Name of the Image.
	Name *string `pulumi:"name"`
	// Deprecated: Please use the with_selector property instead.
	Selector *string `pulumi:"selector"`
	// Select only images with this architecture, could be `x86` (default) or `arm`.
	WithArchitecture *string `pulumi:"withArchitecture"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
	// Select only images with the specified status, could contain `creating` or `available`.
	WithStatuses []string `pulumi:"withStatuses"`
}

// A collection of values returned by getImage.
type GetImageResult struct {
	// (string) Architecture of the Image.
	Architecture string `pulumi:"architecture"`
	// (string) Date when the Image was created (in ISO-8601 format).
	Created string `pulumi:"created"`
	// (string) Point in time when the image is considered to be deprecated (in ISO-8601 format).
	Deprecated string `pulumi:"deprecated"`
	// (string) Description of the Image.
	Description string `pulumi:"description"`
	// (int) Unique ID of the Image.
	Id                int                    `pulumi:"id"`
	IncludeDeprecated *bool                  `pulumi:"includeDeprecated"`
	Labels            map[string]interface{} `pulumi:"labels"`
	MostRecent        *bool                  `pulumi:"mostRecent"`
	// (string) Name of the Image, only present when the Image is of type `system`.
	Name string `pulumi:"name"`
	// (string) Flavor of operating system contained in the image, could be `ubuntu`, `centos`, `debian`, `fedora` or `unknown`.
	OsFlavor string `pulumi:"osFlavor"`
	// (string) Operating system version.
	OsVersion string `pulumi:"osVersion"`
	// (bool) Indicates that rapid deploy of the image is available.
	RapidDeploy bool `pulumi:"rapidDeploy"`
	// Deprecated: Please use the with_selector property instead.
	Selector *string `pulumi:"selector"`
	// (string) Type of the Image, could be `system`, `backup` or `snapshot`.
	Type             string   `pulumi:"type"`
	WithArchitecture *string  `pulumi:"withArchitecture"`
	WithSelector     *string  `pulumi:"withSelector"`
	WithStatuses     []string `pulumi:"withStatuses"`
}

func GetImageOutput(ctx *pulumi.Context, args GetImageOutputArgs, opts ...pulumi.InvokeOption) GetImageResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetImageResult, error) {
			args := v.(GetImageArgs)
			r, err := GetImage(ctx, &args, opts...)
			var s GetImageResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetImageResultOutput)
}

// A collection of arguments for invoking getImage.
type GetImageOutputArgs struct {
	// ID of the Image.
	Id pulumi.IntPtrInput `pulumi:"id"`
	// Also return the image if it is marked as deprecated.
	IncludeDeprecated pulumi.BoolPtrInput `pulumi:"includeDeprecated"`
	// If more than one result is returned, use the most recent Image.
	MostRecent pulumi.BoolPtrInput `pulumi:"mostRecent"`
	// Name of the Image.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Deprecated: Please use the with_selector property instead.
	Selector pulumi.StringPtrInput `pulumi:"selector"`
	// Select only images with this architecture, could be `x86` (default) or `arm`.
	WithArchitecture pulumi.StringPtrInput `pulumi:"withArchitecture"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
	// Select only images with the specified status, could contain `creating` or `available`.
	WithStatuses pulumi.StringArrayInput `pulumi:"withStatuses"`
}

func (GetImageOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImageArgs)(nil)).Elem()
}

// A collection of values returned by getImage.
type GetImageResultOutput struct{ *pulumi.OutputState }

func (GetImageResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImageResult)(nil)).Elem()
}

func (o GetImageResultOutput) ToGetImageResultOutput() GetImageResultOutput {
	return o
}

func (o GetImageResultOutput) ToGetImageResultOutputWithContext(ctx context.Context) GetImageResultOutput {
	return o
}

// (string) Architecture of the Image.
func (o GetImageResultOutput) Architecture() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Architecture }).(pulumi.StringOutput)
}

// (string) Date when the Image was created (in ISO-8601 format).
func (o GetImageResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Created }).(pulumi.StringOutput)
}

// (string) Point in time when the image is considered to be deprecated (in ISO-8601 format).
func (o GetImageResultOutput) Deprecated() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Deprecated }).(pulumi.StringOutput)
}

// (string) Description of the Image.
func (o GetImageResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Description }).(pulumi.StringOutput)
}

// (int) Unique ID of the Image.
func (o GetImageResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v GetImageResult) int { return v.Id }).(pulumi.IntOutput)
}

func (o GetImageResultOutput) IncludeDeprecated() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetImageResult) *bool { return v.IncludeDeprecated }).(pulumi.BoolPtrOutput)
}

func (o GetImageResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v GetImageResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

func (o GetImageResultOutput) MostRecent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetImageResult) *bool { return v.MostRecent }).(pulumi.BoolPtrOutput)
}

// (string) Name of the Image, only present when the Image is of type `system`.
func (o GetImageResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Name }).(pulumi.StringOutput)
}

// (string) Flavor of operating system contained in the image, could be `ubuntu`, `centos`, `debian`, `fedora` or `unknown`.
func (o GetImageResultOutput) OsFlavor() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.OsFlavor }).(pulumi.StringOutput)
}

// (string) Operating system version.
func (o GetImageResultOutput) OsVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.OsVersion }).(pulumi.StringOutput)
}

// (bool) Indicates that rapid deploy of the image is available.
func (o GetImageResultOutput) RapidDeploy() pulumi.BoolOutput {
	return o.ApplyT(func(v GetImageResult) bool { return v.RapidDeploy }).(pulumi.BoolOutput)
}

// Deprecated: Please use the with_selector property instead.
func (o GetImageResultOutput) Selector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImageResult) *string { return v.Selector }).(pulumi.StringPtrOutput)
}

// (string) Type of the Image, could be `system`, `backup` or `snapshot`.
func (o GetImageResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageResult) string { return v.Type }).(pulumi.StringOutput)
}

func (o GetImageResultOutput) WithArchitecture() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImageResult) *string { return v.WithArchitecture }).(pulumi.StringPtrOutput)
}

func (o GetImageResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImageResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func (o GetImageResultOutput) WithStatuses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetImageResult) []string { return v.WithStatuses }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetImageResultOutput{})
}
