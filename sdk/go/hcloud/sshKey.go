// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Hetzner Cloud SSH key resource to manage SSH keys for server access.
//
// ## Import
//
// SSH keys can be imported using the SSH key `id`
//
// ```sh
//  $ pulumi import hcloud:index/sshKey:SshKey mykey <id>
// ```
type SshKey struct {
	pulumi.CustomResourceState

	// (string) The fingerprint of the SSH key
	Fingerprint pulumi.StringOutput `pulumi:"fingerprint"`
	// (map) User-defined labels (key-value pairs)
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Name of the SSH key.
	Name pulumi.StringOutput `pulumi:"name"`
	// The public key. If this is a file, it can be read using the file interpolation function
	PublicKey pulumi.StringOutput `pulumi:"publicKey"`
}

// NewSshKey registers a new resource with the given unique name, arguments, and options.
func NewSshKey(ctx *pulumi.Context,
	name string, args *SshKeyArgs, opts ...pulumi.ResourceOption) (*SshKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PublicKey == nil {
		return nil, errors.New("invalid value for required argument 'PublicKey'")
	}
	var resource SshKey
	err := ctx.RegisterResource("hcloud:index/sshKey:SshKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSshKey gets an existing SshKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSshKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SshKeyState, opts ...pulumi.ResourceOption) (*SshKey, error) {
	var resource SshKey
	err := ctx.ReadResource("hcloud:index/sshKey:SshKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SshKey resources.
type sshKeyState struct {
	// (string) The fingerprint of the SSH key
	Fingerprint *string `pulumi:"fingerprint"`
	// (map) User-defined labels (key-value pairs)
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the SSH key.
	Name *string `pulumi:"name"`
	// The public key. If this is a file, it can be read using the file interpolation function
	PublicKey *string `pulumi:"publicKey"`
}

type SshKeyState struct {
	// (string) The fingerprint of the SSH key
	Fingerprint pulumi.StringPtrInput
	// (map) User-defined labels (key-value pairs)
	Labels pulumi.MapInput
	// Name of the SSH key.
	Name pulumi.StringPtrInput
	// The public key. If this is a file, it can be read using the file interpolation function
	PublicKey pulumi.StringPtrInput
}

func (SshKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*sshKeyState)(nil)).Elem()
}

type sshKeyArgs struct {
	// (map) User-defined labels (key-value pairs)
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the SSH key.
	Name *string `pulumi:"name"`
	// The public key. If this is a file, it can be read using the file interpolation function
	PublicKey string `pulumi:"publicKey"`
}

// The set of arguments for constructing a SshKey resource.
type SshKeyArgs struct {
	// (map) User-defined labels (key-value pairs)
	Labels pulumi.MapInput
	// Name of the SSH key.
	Name pulumi.StringPtrInput
	// The public key. If this is a file, it can be read using the file interpolation function
	PublicKey pulumi.StringInput
}

func (SshKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sshKeyArgs)(nil)).Elem()
}

type SshKeyInput interface {
	pulumi.Input

	ToSshKeyOutput() SshKeyOutput
	ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput
}

func (*SshKey) ElementType() reflect.Type {
	return reflect.TypeOf((*SshKey)(nil))
}

func (i *SshKey) ToSshKeyOutput() SshKeyOutput {
	return i.ToSshKeyOutputWithContext(context.Background())
}

func (i *SshKey) ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyOutput)
}

func (i *SshKey) ToSshKeyPtrOutput() SshKeyPtrOutput {
	return i.ToSshKeyPtrOutputWithContext(context.Background())
}

func (i *SshKey) ToSshKeyPtrOutputWithContext(ctx context.Context) SshKeyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyPtrOutput)
}

type SshKeyPtrInput interface {
	pulumi.Input

	ToSshKeyPtrOutput() SshKeyPtrOutput
	ToSshKeyPtrOutputWithContext(ctx context.Context) SshKeyPtrOutput
}

type sshKeyPtrType SshKeyArgs

func (*sshKeyPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**SshKey)(nil))
}

func (i *sshKeyPtrType) ToSshKeyPtrOutput() SshKeyPtrOutput {
	return i.ToSshKeyPtrOutputWithContext(context.Background())
}

func (i *sshKeyPtrType) ToSshKeyPtrOutputWithContext(ctx context.Context) SshKeyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyPtrOutput)
}

// SshKeyArrayInput is an input type that accepts SshKeyArray and SshKeyArrayOutput values.
// You can construct a concrete instance of `SshKeyArrayInput` via:
//
//          SshKeyArray{ SshKeyArgs{...} }
type SshKeyArrayInput interface {
	pulumi.Input

	ToSshKeyArrayOutput() SshKeyArrayOutput
	ToSshKeyArrayOutputWithContext(context.Context) SshKeyArrayOutput
}

type SshKeyArray []SshKeyInput

func (SshKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*SshKey)(nil))
}

func (i SshKeyArray) ToSshKeyArrayOutput() SshKeyArrayOutput {
	return i.ToSshKeyArrayOutputWithContext(context.Background())
}

func (i SshKeyArray) ToSshKeyArrayOutputWithContext(ctx context.Context) SshKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyArrayOutput)
}

// SshKeyMapInput is an input type that accepts SshKeyMap and SshKeyMapOutput values.
// You can construct a concrete instance of `SshKeyMapInput` via:
//
//          SshKeyMap{ "key": SshKeyArgs{...} }
type SshKeyMapInput interface {
	pulumi.Input

	ToSshKeyMapOutput() SshKeyMapOutput
	ToSshKeyMapOutputWithContext(context.Context) SshKeyMapOutput
}

type SshKeyMap map[string]SshKeyInput

func (SshKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*SshKey)(nil))
}

func (i SshKeyMap) ToSshKeyMapOutput() SshKeyMapOutput {
	return i.ToSshKeyMapOutputWithContext(context.Background())
}

func (i SshKeyMap) ToSshKeyMapOutputWithContext(ctx context.Context) SshKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyMapOutput)
}

type SshKeyOutput struct {
	*pulumi.OutputState
}

func (SshKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*SshKey)(nil))
}

func (o SshKeyOutput) ToSshKeyOutput() SshKeyOutput {
	return o
}

func (o SshKeyOutput) ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput {
	return o
}

func (o SshKeyOutput) ToSshKeyPtrOutput() SshKeyPtrOutput {
	return o.ToSshKeyPtrOutputWithContext(context.Background())
}

func (o SshKeyOutput) ToSshKeyPtrOutputWithContext(ctx context.Context) SshKeyPtrOutput {
	return o.ApplyT(func(v SshKey) *SshKey {
		return &v
	}).(SshKeyPtrOutput)
}

type SshKeyPtrOutput struct {
	*pulumi.OutputState
}

func (SshKeyPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SshKey)(nil))
}

func (o SshKeyPtrOutput) ToSshKeyPtrOutput() SshKeyPtrOutput {
	return o
}

func (o SshKeyPtrOutput) ToSshKeyPtrOutputWithContext(ctx context.Context) SshKeyPtrOutput {
	return o
}

type SshKeyArrayOutput struct{ *pulumi.OutputState }

func (SshKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]SshKey)(nil))
}

func (o SshKeyArrayOutput) ToSshKeyArrayOutput() SshKeyArrayOutput {
	return o
}

func (o SshKeyArrayOutput) ToSshKeyArrayOutputWithContext(ctx context.Context) SshKeyArrayOutput {
	return o
}

func (o SshKeyArrayOutput) Index(i pulumi.IntInput) SshKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) SshKey {
		return vs[0].([]SshKey)[vs[1].(int)]
	}).(SshKeyOutput)
}

type SshKeyMapOutput struct{ *pulumi.OutputState }

func (SshKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]SshKey)(nil))
}

func (o SshKeyMapOutput) ToSshKeyMapOutput() SshKeyMapOutput {
	return o
}

func (o SshKeyMapOutput) ToSshKeyMapOutputWithContext(ctx context.Context) SshKeyMapOutput {
	return o
}

func (o SshKeyMapOutput) MapIndex(k pulumi.StringInput) SshKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) SshKey {
		return vs[0].(map[string]SshKey)[vs[1].(string)]
	}).(SshKeyOutput)
}

func init() {
	pulumi.RegisterOutputType(SshKeyOutput{})
	pulumi.RegisterOutputType(SshKeyPtrOutput{})
	pulumi.RegisterOutputType(SshKeyArrayOutput{})
	pulumi.RegisterOutputType(SshKeyMapOutput{})
}
