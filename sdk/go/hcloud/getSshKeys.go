// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetSshKeys(ctx *pulumi.Context, args *GetSshKeysArgs, opts ...pulumi.InvokeOption) (*GetSshKeysResult, error) {
	var rv GetSshKeysResult
	err := ctx.Invoke("hcloud:index/getSshKeys:getSshKeys", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSshKeys.
type GetSshKeysArgs struct {
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getSshKeys.
type GetSshKeysResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (list) List of all matches SSH keys. See `data.hcloud_ssh_key` for schema.
	SshKeys      []GetSshKeysSshKey `pulumi:"sshKeys"`
	WithSelector *string            `pulumi:"withSelector"`
}

func GetSshKeysOutput(ctx *pulumi.Context, args GetSshKeysOutputArgs, opts ...pulumi.InvokeOption) GetSshKeysResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSshKeysResult, error) {
			args := v.(GetSshKeysArgs)
			r, err := GetSshKeys(ctx, &args, opts...)
			var s GetSshKeysResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSshKeysResultOutput)
}

// A collection of arguments for invoking getSshKeys.
type GetSshKeysOutputArgs struct {
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
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

// The provider-assigned unique ID for this managed resource.
func (o GetSshKeysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSshKeysResult) string { return v.Id }).(pulumi.StringOutput)
}

// (list) List of all matches SSH keys. See `data.hcloud_ssh_key` for schema.
func (o GetSshKeysResultOutput) SshKeys() GetSshKeysSshKeyArrayOutput {
	return o.ApplyT(func(v GetSshKeysResult) []GetSshKeysSshKey { return v.SshKeys }).(GetSshKeysSshKeyArrayOutput)
}

func (o GetSshKeysResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSshKeysResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSshKeysResultOutput{})
}
