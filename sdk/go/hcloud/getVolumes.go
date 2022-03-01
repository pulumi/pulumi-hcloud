// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about multiple Hetzner Cloud volumes.
//
// ## Example Usage
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
// 		_, err := hcloud.GetVolumes(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hcloud.GetVolumes(ctx, &GetVolumesArgs{
// 			WithSelector: pulumi.StringRef("key=value"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetVolumes(ctx *pulumi.Context, args *GetVolumesArgs, opts ...pulumi.InvokeOption) (*GetVolumesResult, error) {
	var rv GetVolumesResult
	err := ctx.Invoke("hcloud:index/getVolumes:getVolumes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVolumes.
type GetVolumesArgs struct {
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
	// List only volumes with the specified status, could contain `creating` or `available`.
	WithStatuses []string `pulumi:"withStatuses"`
}

// A collection of values returned by getVolumes.
type GetVolumesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (list) List of all matching volumes. See `data.hcloud_volume` for schema.
	Volumes      []GetVolumesVolume `pulumi:"volumes"`
	WithSelector *string            `pulumi:"withSelector"`
	WithStatuses []string           `pulumi:"withStatuses"`
}

func GetVolumesOutput(ctx *pulumi.Context, args GetVolumesOutputArgs, opts ...pulumi.InvokeOption) GetVolumesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVolumesResult, error) {
			args := v.(GetVolumesArgs)
			r, err := GetVolumes(ctx, &args, opts...)
			return *r, err
		}).(GetVolumesResultOutput)
}

// A collection of arguments for invoking getVolumes.
type GetVolumesOutputArgs struct {
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
	// List only volumes with the specified status, could contain `creating` or `available`.
	WithStatuses pulumi.StringArrayInput `pulumi:"withStatuses"`
}

func (GetVolumesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumesArgs)(nil)).Elem()
}

// A collection of values returned by getVolumes.
type GetVolumesResultOutput struct{ *pulumi.OutputState }

func (GetVolumesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumesResult)(nil)).Elem()
}

func (o GetVolumesResultOutput) ToGetVolumesResultOutput() GetVolumesResultOutput {
	return o
}

func (o GetVolumesResultOutput) ToGetVolumesResultOutputWithContext(ctx context.Context) GetVolumesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetVolumesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumesResult) string { return v.Id }).(pulumi.StringOutput)
}

// (list) List of all matching volumes. See `data.hcloud_volume` for schema.
func (o GetVolumesResultOutput) Volumes() GetVolumesVolumeArrayOutput {
	return o.ApplyT(func(v GetVolumesResult) []GetVolumesVolume { return v.Volumes }).(GetVolumesVolumeArrayOutput)
}

func (o GetVolumesResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVolumesResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func (o GetVolumesResultOutput) WithStatuses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVolumesResult) []string { return v.WithStatuses }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVolumesResultOutput{})
}
