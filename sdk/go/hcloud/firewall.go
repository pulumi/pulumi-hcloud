// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Hetzner Cloud Firewall to represent a Firewall in the Hetzner Cloud.
//
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
//			myfirewall, err := hcloud.NewFirewall(ctx, "myfirewall", &hcloud.FirewallArgs{
//				Name: pulumi.String("my-firewall"),
//				Rules: hcloud.FirewallRuleArray{
//					&hcloud.FirewallRuleArgs{
//						Direction: pulumi.String("in"),
//						Protocol:  pulumi.String("icmp"),
//						SourceIps: pulumi.StringArray{
//							pulumi.String("0.0.0.0/0"),
//							pulumi.String("::/0"),
//						},
//					},
//					&hcloud.FirewallRuleArgs{
//						Direction: pulumi.String("in"),
//						Protocol:  pulumi.String("tcp"),
//						Port:      pulumi.String("80-85"),
//						SourceIps: pulumi.StringArray{
//							pulumi.String("0.0.0.0/0"),
//							pulumi.String("::/0"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewServer(ctx, "node1", &hcloud.ServerArgs{
//				Name:       pulumi.String("node1"),
//				Image:      pulumi.String("debian-11"),
//				ServerType: pulumi.String("cx22"),
//				FirewallIds: pulumi.IntArray{
//					myfirewall.ID(),
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
//
// ## Import
//
// Firewalls can be imported using its `id`:
//
// ```sh
// $ pulumi import hcloud:index/firewall:Firewall example "$FIREWALL_ID"
// ```
type Firewall struct {
	pulumi.CustomResourceState

	// Resources the firewall should be assigned to
	ApplyTos FirewallApplyToArrayOutput `pulumi:"applyTos"`
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Name of the Firewall.
	Name pulumi.StringOutput `pulumi:"name"`
	// Configuration of a Rule from this Firewall.
	Rules FirewallRuleArrayOutput `pulumi:"rules"`
}

// NewFirewall registers a new resource with the given unique name, arguments, and options.
func NewFirewall(ctx *pulumi.Context,
	name string, args *FirewallArgs, opts ...pulumi.ResourceOption) (*Firewall, error) {
	if args == nil {
		args = &FirewallArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Firewall
	err := ctx.RegisterResource("hcloud:index/firewall:Firewall", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirewall gets an existing Firewall resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirewall(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirewallState, opts ...pulumi.ResourceOption) (*Firewall, error) {
	var resource Firewall
	err := ctx.ReadResource("hcloud:index/firewall:Firewall", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Firewall resources.
type firewallState struct {
	// Resources the firewall should be assigned to
	ApplyTos []FirewallApplyTo `pulumi:"applyTos"`
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]string `pulumi:"labels"`
	// Name of the Firewall.
	Name *string `pulumi:"name"`
	// Configuration of a Rule from this Firewall.
	Rules []FirewallRule `pulumi:"rules"`
}

type FirewallState struct {
	// Resources the firewall should be assigned to
	ApplyTos FirewallApplyToArrayInput
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.StringMapInput
	// Name of the Firewall.
	Name pulumi.StringPtrInput
	// Configuration of a Rule from this Firewall.
	Rules FirewallRuleArrayInput
}

func (FirewallState) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallState)(nil)).Elem()
}

type firewallArgs struct {
	// Resources the firewall should be assigned to
	ApplyTos []FirewallApplyTo `pulumi:"applyTos"`
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]string `pulumi:"labels"`
	// Name of the Firewall.
	Name *string `pulumi:"name"`
	// Configuration of a Rule from this Firewall.
	Rules []FirewallRule `pulumi:"rules"`
}

// The set of arguments for constructing a Firewall resource.
type FirewallArgs struct {
	// Resources the firewall should be assigned to
	ApplyTos FirewallApplyToArrayInput
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.StringMapInput
	// Name of the Firewall.
	Name pulumi.StringPtrInput
	// Configuration of a Rule from this Firewall.
	Rules FirewallRuleArrayInput
}

func (FirewallArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallArgs)(nil)).Elem()
}

type FirewallInput interface {
	pulumi.Input

	ToFirewallOutput() FirewallOutput
	ToFirewallOutputWithContext(ctx context.Context) FirewallOutput
}

func (*Firewall) ElementType() reflect.Type {
	return reflect.TypeOf((**Firewall)(nil)).Elem()
}

func (i *Firewall) ToFirewallOutput() FirewallOutput {
	return i.ToFirewallOutputWithContext(context.Background())
}

func (i *Firewall) ToFirewallOutputWithContext(ctx context.Context) FirewallOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallOutput)
}

// FirewallArrayInput is an input type that accepts FirewallArray and FirewallArrayOutput values.
// You can construct a concrete instance of `FirewallArrayInput` via:
//
//	FirewallArray{ FirewallArgs{...} }
type FirewallArrayInput interface {
	pulumi.Input

	ToFirewallArrayOutput() FirewallArrayOutput
	ToFirewallArrayOutputWithContext(context.Context) FirewallArrayOutput
}

type FirewallArray []FirewallInput

func (FirewallArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Firewall)(nil)).Elem()
}

func (i FirewallArray) ToFirewallArrayOutput() FirewallArrayOutput {
	return i.ToFirewallArrayOutputWithContext(context.Background())
}

func (i FirewallArray) ToFirewallArrayOutputWithContext(ctx context.Context) FirewallArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallArrayOutput)
}

// FirewallMapInput is an input type that accepts FirewallMap and FirewallMapOutput values.
// You can construct a concrete instance of `FirewallMapInput` via:
//
//	FirewallMap{ "key": FirewallArgs{...} }
type FirewallMapInput interface {
	pulumi.Input

	ToFirewallMapOutput() FirewallMapOutput
	ToFirewallMapOutputWithContext(context.Context) FirewallMapOutput
}

type FirewallMap map[string]FirewallInput

func (FirewallMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Firewall)(nil)).Elem()
}

func (i FirewallMap) ToFirewallMapOutput() FirewallMapOutput {
	return i.ToFirewallMapOutputWithContext(context.Background())
}

func (i FirewallMap) ToFirewallMapOutputWithContext(ctx context.Context) FirewallMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallMapOutput)
}

type FirewallOutput struct{ *pulumi.OutputState }

func (FirewallOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Firewall)(nil)).Elem()
}

func (o FirewallOutput) ToFirewallOutput() FirewallOutput {
	return o
}

func (o FirewallOutput) ToFirewallOutputWithContext(ctx context.Context) FirewallOutput {
	return o
}

// Resources the firewall should be assigned to
func (o FirewallOutput) ApplyTos() FirewallApplyToArrayOutput {
	return o.ApplyT(func(v *Firewall) FirewallApplyToArrayOutput { return v.ApplyTos }).(FirewallApplyToArrayOutput)
}

// User-defined labels (key-value pairs) should be created with.
func (o FirewallOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Firewall) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Name of the Firewall.
func (o FirewallOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Firewall) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Configuration of a Rule from this Firewall.
func (o FirewallOutput) Rules() FirewallRuleArrayOutput {
	return o.ApplyT(func(v *Firewall) FirewallRuleArrayOutput { return v.Rules }).(FirewallRuleArrayOutput)
}

type FirewallArrayOutput struct{ *pulumi.OutputState }

func (FirewallArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Firewall)(nil)).Elem()
}

func (o FirewallArrayOutput) ToFirewallArrayOutput() FirewallArrayOutput {
	return o
}

func (o FirewallArrayOutput) ToFirewallArrayOutputWithContext(ctx context.Context) FirewallArrayOutput {
	return o
}

func (o FirewallArrayOutput) Index(i pulumi.IntInput) FirewallOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Firewall {
		return vs[0].([]*Firewall)[vs[1].(int)]
	}).(FirewallOutput)
}

type FirewallMapOutput struct{ *pulumi.OutputState }

func (FirewallMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Firewall)(nil)).Elem()
}

func (o FirewallMapOutput) ToFirewallMapOutput() FirewallMapOutput {
	return o
}

func (o FirewallMapOutput) ToFirewallMapOutputWithContext(ctx context.Context) FirewallMapOutput {
	return o
}

func (o FirewallMapOutput) MapIndex(k pulumi.StringInput) FirewallOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Firewall {
		return vs[0].(map[string]*Firewall)[vs[1].(string)]
	}).(FirewallOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallInput)(nil)).Elem(), &Firewall{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallArrayInput)(nil)).Elem(), FirewallArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallMapInput)(nil)).Elem(), FirewallMap{})
	pulumi.RegisterOutputType(FirewallOutput{})
	pulumi.RegisterOutputType(FirewallArrayOutput{})
	pulumi.RegisterOutputType(FirewallMapOutput{})
}
