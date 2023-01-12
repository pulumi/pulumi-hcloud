// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Hetzner Cloud SSH key resource to manage SSH keys for server access.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"io/ioutil"
//
//	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := ioutil.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := hcloud.NewSshKey(ctx, "default", &hcloud.SshKeyArgs{
//				PublicKey: readFileOrPanic("~/.ssh/id_rsa.pub"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// SSH keys can be imported using the SSH key `id`
//
// ```sh
//
//	$ pulumi import hcloud:index/sshKey:SshKey mykey id
//
// ```
type SshKey struct {
	pulumi.CustomResourceState

	// (string) The fingerprint of the SSH key
	Fingerprint pulumi.StringOutput `pulumi:"fingerprint"`
	// User-defined labels (key-value pairs) should be created with.
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
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the SSH key.
	Name *string `pulumi:"name"`
	// The public key. If this is a file, it can be read using the file interpolation function
	PublicKey *string `pulumi:"publicKey"`
}

type SshKeyState struct {
	// (string) The fingerprint of the SSH key
	Fingerprint pulumi.StringPtrInput
	// User-defined labels (key-value pairs) should be created with.
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
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the SSH key.
	Name *string `pulumi:"name"`
	// The public key. If this is a file, it can be read using the file interpolation function
	PublicKey string `pulumi:"publicKey"`
}

// The set of arguments for constructing a SshKey resource.
type SshKeyArgs struct {
	// User-defined labels (key-value pairs) should be created with.
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
	return reflect.TypeOf((**SshKey)(nil)).Elem()
}

func (i *SshKey) ToSshKeyOutput() SshKeyOutput {
	return i.ToSshKeyOutputWithContext(context.Background())
}

func (i *SshKey) ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyOutput)
}

// SshKeyArrayInput is an input type that accepts SshKeyArray and SshKeyArrayOutput values.
// You can construct a concrete instance of `SshKeyArrayInput` via:
//
//	SshKeyArray{ SshKeyArgs{...} }
type SshKeyArrayInput interface {
	pulumi.Input

	ToSshKeyArrayOutput() SshKeyArrayOutput
	ToSshKeyArrayOutputWithContext(context.Context) SshKeyArrayOutput
}

type SshKeyArray []SshKeyInput

func (SshKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SshKey)(nil)).Elem()
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
//	SshKeyMap{ "key": SshKeyArgs{...} }
type SshKeyMapInput interface {
	pulumi.Input

	ToSshKeyMapOutput() SshKeyMapOutput
	ToSshKeyMapOutputWithContext(context.Context) SshKeyMapOutput
}

type SshKeyMap map[string]SshKeyInput

func (SshKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SshKey)(nil)).Elem()
}

func (i SshKeyMap) ToSshKeyMapOutput() SshKeyMapOutput {
	return i.ToSshKeyMapOutputWithContext(context.Background())
}

func (i SshKeyMap) ToSshKeyMapOutputWithContext(ctx context.Context) SshKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyMapOutput)
}

type SshKeyOutput struct{ *pulumi.OutputState }

func (SshKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SshKey)(nil)).Elem()
}

func (o SshKeyOutput) ToSshKeyOutput() SshKeyOutput {
	return o
}

func (o SshKeyOutput) ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput {
	return o
}

// (string) The fingerprint of the SSH key
func (o SshKeyOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v *SshKey) pulumi.StringOutput { return v.Fingerprint }).(pulumi.StringOutput)
}

// User-defined labels (key-value pairs) should be created with.
func (o SshKeyOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *SshKey) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Name of the SSH key.
func (o SshKeyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SshKey) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The public key. If this is a file, it can be read using the file interpolation function
func (o SshKeyOutput) PublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v *SshKey) pulumi.StringOutput { return v.PublicKey }).(pulumi.StringOutput)
}

type SshKeyArrayOutput struct{ *pulumi.OutputState }

func (SshKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SshKey)(nil)).Elem()
}

func (o SshKeyArrayOutput) ToSshKeyArrayOutput() SshKeyArrayOutput {
	return o
}

func (o SshKeyArrayOutput) ToSshKeyArrayOutputWithContext(ctx context.Context) SshKeyArrayOutput {
	return o
}

func (o SshKeyArrayOutput) Index(i pulumi.IntInput) SshKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SshKey {
		return vs[0].([]*SshKey)[vs[1].(int)]
	}).(SshKeyOutput)
}

type SshKeyMapOutput struct{ *pulumi.OutputState }

func (SshKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SshKey)(nil)).Elem()
}

func (o SshKeyMapOutput) ToSshKeyMapOutput() SshKeyMapOutput {
	return o
}

func (o SshKeyMapOutput) ToSshKeyMapOutputWithContext(ctx context.Context) SshKeyMapOutput {
	return o
}

func (o SshKeyMapOutput) MapIndex(k pulumi.StringInput) SshKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SshKey {
		return vs[0].(map[string]*SshKey)[vs[1].(string)]
	}).(SshKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SshKeyInput)(nil)).Elem(), &SshKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshKeyArrayInput)(nil)).Elem(), SshKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshKeyMapInput)(nil)).Elem(), SshKeyMap{})
	pulumi.RegisterOutputType(SshKeyOutput{})
	pulumi.RegisterOutputType(SshKeyArrayOutput{})
	pulumi.RegisterOutputType(SshKeyMapOutput{})
}
