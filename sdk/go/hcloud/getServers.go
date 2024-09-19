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
//			_, err := hcloud.GetServers(ctx, &hcloud.GetServersArgs{
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
func GetServers(ctx *pulumi.Context, args *GetServersArgs, opts ...pulumi.InvokeOption) (*GetServersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServersResult
	err := ctx.Invoke("hcloud:index/getServers:getServers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServers.
type GetServersArgs struct {
	// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
	WithSelector *string `pulumi:"withSelector"`
	// List only servers with the specified status, could contain `initializing`, `starting`, `running`, `stopping`, `off`, `deleting`, `rebuilding`, `migrating`, `unknown`.
	WithStatuses []string `pulumi:"withStatuses"`
}

// A collection of values returned by getServers.
type GetServersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (list) List of all matching servers. See `data.hcloud_server` for schema.
	Servers      []GetServersServer `pulumi:"servers"`
	WithSelector *string            `pulumi:"withSelector"`
	WithStatuses []string           `pulumi:"withStatuses"`
}

func GetServersOutput(ctx *pulumi.Context, args GetServersOutputArgs, opts ...pulumi.InvokeOption) GetServersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServersResultOutput, error) {
			args := v.(GetServersArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetServersResult
			secret, err := ctx.InvokePackageRaw("hcloud:index/getServers:getServers", args, &rv, "", opts...)
			if err != nil {
				return GetServersResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetServersResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetServersResultOutput), nil
			}
			return output, nil
		}).(GetServersResultOutput)
}

// A collection of arguments for invoking getServers.
type GetServersOutputArgs struct {
	// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
	// List only servers with the specified status, could contain `initializing`, `starting`, `running`, `stopping`, `off`, `deleting`, `rebuilding`, `migrating`, `unknown`.
	WithStatuses pulumi.StringArrayInput `pulumi:"withStatuses"`
}

func (GetServersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServersArgs)(nil)).Elem()
}

// A collection of values returned by getServers.
type GetServersResultOutput struct{ *pulumi.OutputState }

func (GetServersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServersResult)(nil)).Elem()
}

func (o GetServersResultOutput) ToGetServersResultOutput() GetServersResultOutput {
	return o
}

func (o GetServersResultOutput) ToGetServersResultOutputWithContext(ctx context.Context) GetServersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetServersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServersResult) string { return v.Id }).(pulumi.StringOutput)
}

// (list) List of all matching servers. See `data.hcloud_server` for schema.
func (o GetServersResultOutput) Servers() GetServersServerArrayOutput {
	return o.ApplyT(func(v GetServersResult) []GetServersServer { return v.Servers }).(GetServersServerArrayOutput)
}

func (o GetServersResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServersResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func (o GetServersResultOutput) WithStatuses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServersResult) []string { return v.WithStatuses }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServersResultOutput{})
}
