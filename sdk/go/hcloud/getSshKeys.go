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
//			all, err := hcloud.GetSshKeys(ctx, &hcloud.GetSshKeysArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.GetSshKeys(ctx, &hcloud.GetSshKeysArgs{
//				WithSelector: pulumi.StringRef("foo=bar"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			var splat0 []*string
//			for _, val0 := range all.SshKeys {
//				splat0 = append(splat0, val0.Name)
//			}
//			_, err = hcloud.NewServer(ctx, "main", &hcloud.ServerArgs{
//				SshKeys: splat0,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetSshKeys(ctx *pulumi.Context, args *GetSshKeysArgs, opts ...pulumi.InvokeOption) (*GetSshKeysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSshKeysResult
	err := ctx.Invoke("hcloud:index/getSshKeys:getSshKeys", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSshKeys.
type GetSshKeysArgs struct {
	// The ID of this resource.
	Id *string `pulumi:"id"`
	// Filter results using a [Label Selector](https://docs.hetzner.cloud/#label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getSshKeys.
type GetSshKeysResult struct {
	// The ID of this resource.
	Id      *string            `pulumi:"id"`
	SshKeys []GetSshKeysSshKey `pulumi:"sshKeys"`
	// Filter results using a [Label Selector](https://docs.hetzner.cloud/#label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

func GetSshKeysOutput(ctx *pulumi.Context, args GetSshKeysOutputArgs, opts ...pulumi.InvokeOption) GetSshKeysResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSshKeysResultOutput, error) {
			args := v.(GetSshKeysArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetSshKeysResult
			secret, err := ctx.InvokePackageRaw("hcloud:index/getSshKeys:getSshKeys", args, &rv, "", opts...)
			if err != nil {
				return GetSshKeysResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetSshKeysResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetSshKeysResultOutput), nil
			}
			return output, nil
		}).(GetSshKeysResultOutput)
}

// A collection of arguments for invoking getSshKeys.
type GetSshKeysOutputArgs struct {
	// The ID of this resource.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Filter results using a [Label Selector](https://docs.hetzner.cloud/#label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
}

func (GetSshKeysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSshKeysArgs)(nil)).Elem()
}

// A collection of values returned by getSshKeys.
type GetSshKeysResultOutput struct{ *pulumi.OutputState }

func (GetSshKeysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSshKeysResult)(nil)).Elem()
}

func (o GetSshKeysResultOutput) ToGetSshKeysResultOutput() GetSshKeysResultOutput {
	return o
}

func (o GetSshKeysResultOutput) ToGetSshKeysResultOutputWithContext(ctx context.Context) GetSshKeysResultOutput {
	return o
}

// The ID of this resource.
func (o GetSshKeysResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSshKeysResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

func (o GetSshKeysResultOutput) SshKeys() GetSshKeysSshKeyArrayOutput {
	return o.ApplyT(func(v GetSshKeysResult) []GetSshKeysSshKey { return v.SshKeys }).(GetSshKeysSshKeyArrayOutput)
}

// Filter results using a [Label Selector](https://docs.hetzner.cloud/#label-selector)
func (o GetSshKeysResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSshKeysResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSshKeysResultOutput{})
}
