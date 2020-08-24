// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
