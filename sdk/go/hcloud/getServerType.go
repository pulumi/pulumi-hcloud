// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific Hetzner Cloud Server Type.
// Use this resource to get detailed information about specific Server Type.
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
// 		opt0 := "cx11"
// 		_, err := hcloud.GetServerType(ctx, &GetServerTypeArgs{
// 			Name: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt1 := 1
// 		_, err = hcloud.GetServerType(ctx, &GetServerTypeArgs{
// 			Id: &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetServerType(ctx *pulumi.Context, args *GetServerTypeArgs, opts ...pulumi.InvokeOption) (*GetServerTypeResult, error) {
	var rv GetServerTypeResult
	err := ctx.Invoke("hcloud:index/getServerType:getServerType", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServerType.
type GetServerTypeArgs struct {
	// ID of the server_type.
	Id *int `pulumi:"id"`
	// Name of the server_type.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getServerType.
type GetServerTypeResult struct {
	// (int) Number of cpu cores a Server of this type will have.
	Cores   int    `pulumi:"cores"`
	CpuType string `pulumi:"cpuType"`
	// (string) Description of the server_type.
	Description string `pulumi:"description"`
	// (int) Disk size a Server of this type will have in GB.
	Disk int `pulumi:"disk"`
	// (int) Unique ID of the server_type.
	Id int `pulumi:"id"`
	// (int) Memory a Server of this type will have in GB.
	Memory int `pulumi:"memory"`
	// (string) Name of the server_type.
	Name        string `pulumi:"name"`
	StorageType string `pulumi:"storageType"`
}

func GetServerTypeOutput(ctx *pulumi.Context, args GetServerTypeOutputArgs, opts ...pulumi.InvokeOption) GetServerTypeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServerTypeResult, error) {
			args := v.(GetServerTypeArgs)
			r, err := GetServerType(ctx, &args, opts...)
			return *r, err
		}).(GetServerTypeResultOutput)
}

// A collection of arguments for invoking getServerType.
type GetServerTypeOutputArgs struct {
	// ID of the server_type.
	Id pulumi.IntPtrInput `pulumi:"id"`
	// Name of the server_type.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (GetServerTypeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerTypeArgs)(nil)).Elem()
}

// A collection of values returned by getServerType.
type GetServerTypeResultOutput struct{ *pulumi.OutputState }

func (GetServerTypeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerTypeResult)(nil)).Elem()
}

func (o GetServerTypeResultOutput) ToGetServerTypeResultOutput() GetServerTypeResultOutput {
	return o
}

func (o GetServerTypeResultOutput) ToGetServerTypeResultOutputWithContext(ctx context.Context) GetServerTypeResultOutput {
	return o
}

// (int) Number of cpu cores a Server of this type will have.
func (o GetServerTypeResultOutput) Cores() pulumi.IntOutput {
	return o.ApplyT(func(v GetServerTypeResult) int { return v.Cores }).(pulumi.IntOutput)
}

func (o GetServerTypeResultOutput) CpuType() pulumi.StringOutput {
	return o.ApplyT(func(v GetServerTypeResult) string { return v.CpuType }).(pulumi.StringOutput)
}

// (string) Description of the server_type.
func (o GetServerTypeResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetServerTypeResult) string { return v.Description }).(pulumi.StringOutput)
}

// (int) Disk size a Server of this type will have in GB.
func (o GetServerTypeResultOutput) Disk() pulumi.IntOutput {
	return o.ApplyT(func(v GetServerTypeResult) int { return v.Disk }).(pulumi.IntOutput)
}

// (int) Unique ID of the server_type.
func (o GetServerTypeResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v GetServerTypeResult) int { return v.Id }).(pulumi.IntOutput)
}

// (int) Memory a Server of this type will have in GB.
func (o GetServerTypeResultOutput) Memory() pulumi.IntOutput {
	return o.ApplyT(func(v GetServerTypeResult) int { return v.Memory }).(pulumi.IntOutput)
}

// (string) Name of the server_type.
func (o GetServerTypeResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetServerTypeResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetServerTypeResultOutput) StorageType() pulumi.StringOutput {
	return o.ApplyT(func(v GetServerTypeResult) string { return v.StorageType }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServerTypeResultOutput{})
}
