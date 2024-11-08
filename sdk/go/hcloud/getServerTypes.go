// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a list of available Hetzner Cloud Server Types.
func GetServerTypes(ctx *pulumi.Context, args *GetServerTypesArgs, opts ...pulumi.InvokeOption) (*GetServerTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServerTypesResult
	err := ctx.Invoke("hcloud:index/getServerTypes:getServerTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServerTypes.
type GetServerTypesArgs struct {
	// Deprecated: Use serverTypes list instead
	Descriptions []string `pulumi:"descriptions"`
	Id           *string  `pulumi:"id"`
	// Deprecated: Use serverTypes list instead
	Names []string `pulumi:"names"`
	// Deprecated: Use serverTypes list instead
	ServerTypeIds []string `pulumi:"serverTypeIds"`
}

// A collection of values returned by getServerTypes.
type GetServerTypesResult struct {
	// Deprecated: Use serverTypes list instead
	Descriptions []string `pulumi:"descriptions"`
	Id           *string  `pulumi:"id"`
	// Deprecated: Use serverTypes list instead
	Names []string `pulumi:"names"`
	// Deprecated: Use serverTypes list instead
	ServerTypeIds []string `pulumi:"serverTypeIds"`
	// (list) List of all server types. See `data.hcloud_server_type` for schema.
	ServerTypes []GetServerTypesServerType `pulumi:"serverTypes"`
}

func GetServerTypesOutput(ctx *pulumi.Context, args GetServerTypesOutputArgs, opts ...pulumi.InvokeOption) GetServerTypesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServerTypesResultOutput, error) {
			args := v.(GetServerTypesArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetServerTypesResult
			secret, err := ctx.InvokePackageRaw("hcloud:index/getServerTypes:getServerTypes", args, &rv, "", opts...)
			if err != nil {
				return GetServerTypesResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetServerTypesResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetServerTypesResultOutput), nil
			}
			return output, nil
		}).(GetServerTypesResultOutput)
}

// A collection of arguments for invoking getServerTypes.
type GetServerTypesOutputArgs struct {
	// Deprecated: Use serverTypes list instead
	Descriptions pulumi.StringArrayInput `pulumi:"descriptions"`
	Id           pulumi.StringPtrInput   `pulumi:"id"`
	// Deprecated: Use serverTypes list instead
	Names pulumi.StringArrayInput `pulumi:"names"`
	// Deprecated: Use serverTypes list instead
	ServerTypeIds pulumi.StringArrayInput `pulumi:"serverTypeIds"`
}

func (GetServerTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerTypesArgs)(nil)).Elem()
}

// A collection of values returned by getServerTypes.
type GetServerTypesResultOutput struct{ *pulumi.OutputState }

func (GetServerTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerTypesResult)(nil)).Elem()
}

func (o GetServerTypesResultOutput) ToGetServerTypesResultOutput() GetServerTypesResultOutput {
	return o
}

func (o GetServerTypesResultOutput) ToGetServerTypesResultOutputWithContext(ctx context.Context) GetServerTypesResultOutput {
	return o
}

// Deprecated: Use serverTypes list instead
func (o GetServerTypesResultOutput) Descriptions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerTypesResult) []string { return v.Descriptions }).(pulumi.StringArrayOutput)
}

func (o GetServerTypesResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerTypesResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// Deprecated: Use serverTypes list instead
func (o GetServerTypesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerTypesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

// Deprecated: Use serverTypes list instead
func (o GetServerTypesResultOutput) ServerTypeIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerTypesResult) []string { return v.ServerTypeIds }).(pulumi.StringArrayOutput)
}

// (list) List of all server types. See `data.hcloud_server_type` for schema.
func (o GetServerTypesResultOutput) ServerTypes() GetServerTypesServerTypeArrayOutput {
	return o.ApplyT(func(v GetServerTypesResult) []GetServerTypesServerType { return v.ServerTypes }).(GetServerTypesServerTypeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServerTypesResultOutput{})
}
