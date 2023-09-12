// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Attaches resource to a Hetzner Cloud Firewall.
//
// *Note*: only one `FirewallAttachment` per Firewall is allowed.
// Any resources that should be attached to that Firewall need to be
// specified in that `FirewallAttachment`.
//
// ## Example Usage
// ### Attach Servers
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
//			testServer, err := hcloud.NewServer(ctx, "testServer", &hcloud.ServerArgs{
//				ServerType: pulumi.String("cx11"),
//				Image:      pulumi.String("ubuntu-20.04"),
//			})
//			if err != nil {
//				return err
//			}
//			basicFirewall, err := hcloud.NewFirewall(ctx, "basicFirewall", nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewFirewallAttachment(ctx, "fwRef", &hcloud.FirewallAttachmentArgs{
//				FirewallId: basicFirewall.ID(),
//				ServerIds: pulumi.IntArray{
//					testServer.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Attach Label Selectors
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
//			_, err := hcloud.NewServer(ctx, "testServer", &hcloud.ServerArgs{
//				ServerType: pulumi.String("cx11"),
//				Image:      pulumi.String("ubuntu-20.04"),
//				Labels: pulumi.AnyMap{
//					"firewall-attachment": pulumi.Any("test-server"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			basicFirewall, err := hcloud.NewFirewall(ctx, "basicFirewall", nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewFirewallAttachment(ctx, "fwRef", &hcloud.FirewallAttachmentArgs{
//				FirewallId: basicFirewall.ID(),
//				LabelSelectors: pulumi.StringArray{
//					pulumi.String("firewall-attachment=test-server"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type FirewallAttachment struct {
	pulumi.CustomResourceState

	// ID of the firewall the resources
	// should be attached to.
	FirewallId pulumi.IntOutput `pulumi:"firewallId"`
	// List of label selectors used to
	// select resources to attach to the firewall.
	LabelSelectors pulumi.StringArrayOutput `pulumi:"labelSelectors"`
	// List of Server IDs to attach to the
	// firewall.
	ServerIds pulumi.IntArrayOutput `pulumi:"serverIds"`
}

// NewFirewallAttachment registers a new resource with the given unique name, arguments, and options.
func NewFirewallAttachment(ctx *pulumi.Context,
	name string, args *FirewallAttachmentArgs, opts ...pulumi.ResourceOption) (*FirewallAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FirewallId == nil {
		return nil, errors.New("invalid value for required argument 'FirewallId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FirewallAttachment
	err := ctx.RegisterResource("hcloud:index/firewallAttachment:FirewallAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirewallAttachment gets an existing FirewallAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirewallAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirewallAttachmentState, opts ...pulumi.ResourceOption) (*FirewallAttachment, error) {
	var resource FirewallAttachment
	err := ctx.ReadResource("hcloud:index/firewallAttachment:FirewallAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FirewallAttachment resources.
type firewallAttachmentState struct {
	// ID of the firewall the resources
	// should be attached to.
	FirewallId *int `pulumi:"firewallId"`
	// List of label selectors used to
	// select resources to attach to the firewall.
	LabelSelectors []string `pulumi:"labelSelectors"`
	// List of Server IDs to attach to the
	// firewall.
	ServerIds []int `pulumi:"serverIds"`
}

type FirewallAttachmentState struct {
	// ID of the firewall the resources
	// should be attached to.
	FirewallId pulumi.IntPtrInput
	// List of label selectors used to
	// select resources to attach to the firewall.
	LabelSelectors pulumi.StringArrayInput
	// List of Server IDs to attach to the
	// firewall.
	ServerIds pulumi.IntArrayInput
}

func (FirewallAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallAttachmentState)(nil)).Elem()
}

type firewallAttachmentArgs struct {
	// ID of the firewall the resources
	// should be attached to.
	FirewallId int `pulumi:"firewallId"`
	// List of label selectors used to
	// select resources to attach to the firewall.
	LabelSelectors []string `pulumi:"labelSelectors"`
	// List of Server IDs to attach to the
	// firewall.
	ServerIds []int `pulumi:"serverIds"`
}

// The set of arguments for constructing a FirewallAttachment resource.
type FirewallAttachmentArgs struct {
	// ID of the firewall the resources
	// should be attached to.
	FirewallId pulumi.IntInput
	// List of label selectors used to
	// select resources to attach to the firewall.
	LabelSelectors pulumi.StringArrayInput
	// List of Server IDs to attach to the
	// firewall.
	ServerIds pulumi.IntArrayInput
}

func (FirewallAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallAttachmentArgs)(nil)).Elem()
}

type FirewallAttachmentInput interface {
	pulumi.Input

	ToFirewallAttachmentOutput() FirewallAttachmentOutput
	ToFirewallAttachmentOutputWithContext(ctx context.Context) FirewallAttachmentOutput
}

func (*FirewallAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallAttachment)(nil)).Elem()
}

func (i *FirewallAttachment) ToFirewallAttachmentOutput() FirewallAttachmentOutput {
	return i.ToFirewallAttachmentOutputWithContext(context.Background())
}

func (i *FirewallAttachment) ToFirewallAttachmentOutputWithContext(ctx context.Context) FirewallAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallAttachmentOutput)
}

func (i *FirewallAttachment) ToOutput(ctx context.Context) pulumix.Output[*FirewallAttachment] {
	return pulumix.Output[*FirewallAttachment]{
		OutputState: i.ToFirewallAttachmentOutputWithContext(ctx).OutputState,
	}
}

// FirewallAttachmentArrayInput is an input type that accepts FirewallAttachmentArray and FirewallAttachmentArrayOutput values.
// You can construct a concrete instance of `FirewallAttachmentArrayInput` via:
//
//	FirewallAttachmentArray{ FirewallAttachmentArgs{...} }
type FirewallAttachmentArrayInput interface {
	pulumi.Input

	ToFirewallAttachmentArrayOutput() FirewallAttachmentArrayOutput
	ToFirewallAttachmentArrayOutputWithContext(context.Context) FirewallAttachmentArrayOutput
}

type FirewallAttachmentArray []FirewallAttachmentInput

func (FirewallAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallAttachment)(nil)).Elem()
}

func (i FirewallAttachmentArray) ToFirewallAttachmentArrayOutput() FirewallAttachmentArrayOutput {
	return i.ToFirewallAttachmentArrayOutputWithContext(context.Background())
}

func (i FirewallAttachmentArray) ToFirewallAttachmentArrayOutputWithContext(ctx context.Context) FirewallAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallAttachmentArrayOutput)
}

func (i FirewallAttachmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*FirewallAttachment] {
	return pulumix.Output[[]*FirewallAttachment]{
		OutputState: i.ToFirewallAttachmentArrayOutputWithContext(ctx).OutputState,
	}
}

// FirewallAttachmentMapInput is an input type that accepts FirewallAttachmentMap and FirewallAttachmentMapOutput values.
// You can construct a concrete instance of `FirewallAttachmentMapInput` via:
//
//	FirewallAttachmentMap{ "key": FirewallAttachmentArgs{...} }
type FirewallAttachmentMapInput interface {
	pulumi.Input

	ToFirewallAttachmentMapOutput() FirewallAttachmentMapOutput
	ToFirewallAttachmentMapOutputWithContext(context.Context) FirewallAttachmentMapOutput
}

type FirewallAttachmentMap map[string]FirewallAttachmentInput

func (FirewallAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallAttachment)(nil)).Elem()
}

func (i FirewallAttachmentMap) ToFirewallAttachmentMapOutput() FirewallAttachmentMapOutput {
	return i.ToFirewallAttachmentMapOutputWithContext(context.Background())
}

func (i FirewallAttachmentMap) ToFirewallAttachmentMapOutputWithContext(ctx context.Context) FirewallAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallAttachmentMapOutput)
}

func (i FirewallAttachmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*FirewallAttachment] {
	return pulumix.Output[map[string]*FirewallAttachment]{
		OutputState: i.ToFirewallAttachmentMapOutputWithContext(ctx).OutputState,
	}
}

type FirewallAttachmentOutput struct{ *pulumi.OutputState }

func (FirewallAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallAttachment)(nil)).Elem()
}

func (o FirewallAttachmentOutput) ToFirewallAttachmentOutput() FirewallAttachmentOutput {
	return o
}

func (o FirewallAttachmentOutput) ToFirewallAttachmentOutputWithContext(ctx context.Context) FirewallAttachmentOutput {
	return o
}

func (o FirewallAttachmentOutput) ToOutput(ctx context.Context) pulumix.Output[*FirewallAttachment] {
	return pulumix.Output[*FirewallAttachment]{
		OutputState: o.OutputState,
	}
}

// ID of the firewall the resources
// should be attached to.
func (o FirewallAttachmentOutput) FirewallId() pulumi.IntOutput {
	return o.ApplyT(func(v *FirewallAttachment) pulumi.IntOutput { return v.FirewallId }).(pulumi.IntOutput)
}

// List of label selectors used to
// select resources to attach to the firewall.
func (o FirewallAttachmentOutput) LabelSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FirewallAttachment) pulumi.StringArrayOutput { return v.LabelSelectors }).(pulumi.StringArrayOutput)
}

// List of Server IDs to attach to the
// firewall.
func (o FirewallAttachmentOutput) ServerIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *FirewallAttachment) pulumi.IntArrayOutput { return v.ServerIds }).(pulumi.IntArrayOutput)
}

type FirewallAttachmentArrayOutput struct{ *pulumi.OutputState }

func (FirewallAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallAttachment)(nil)).Elem()
}

func (o FirewallAttachmentArrayOutput) ToFirewallAttachmentArrayOutput() FirewallAttachmentArrayOutput {
	return o
}

func (o FirewallAttachmentArrayOutput) ToFirewallAttachmentArrayOutputWithContext(ctx context.Context) FirewallAttachmentArrayOutput {
	return o
}

func (o FirewallAttachmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*FirewallAttachment] {
	return pulumix.Output[[]*FirewallAttachment]{
		OutputState: o.OutputState,
	}
}

func (o FirewallAttachmentArrayOutput) Index(i pulumi.IntInput) FirewallAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FirewallAttachment {
		return vs[0].([]*FirewallAttachment)[vs[1].(int)]
	}).(FirewallAttachmentOutput)
}

type FirewallAttachmentMapOutput struct{ *pulumi.OutputState }

func (FirewallAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallAttachment)(nil)).Elem()
}

func (o FirewallAttachmentMapOutput) ToFirewallAttachmentMapOutput() FirewallAttachmentMapOutput {
	return o
}

func (o FirewallAttachmentMapOutput) ToFirewallAttachmentMapOutputWithContext(ctx context.Context) FirewallAttachmentMapOutput {
	return o
}

func (o FirewallAttachmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*FirewallAttachment] {
	return pulumix.Output[map[string]*FirewallAttachment]{
		OutputState: o.OutputState,
	}
}

func (o FirewallAttachmentMapOutput) MapIndex(k pulumi.StringInput) FirewallAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FirewallAttachment {
		return vs[0].(map[string]*FirewallAttachment)[vs[1].(string)]
	}).(FirewallAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallAttachmentInput)(nil)).Elem(), &FirewallAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallAttachmentArrayInput)(nil)).Elem(), FirewallAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallAttachmentMapInput)(nil)).Elem(), FirewallAttachmentMap{})
	pulumi.RegisterOutputType(FirewallAttachmentOutput{})
	pulumi.RegisterOutputType(FirewallAttachmentArrayOutput{})
	pulumi.RegisterOutputType(FirewallAttachmentMapOutput{})
}
