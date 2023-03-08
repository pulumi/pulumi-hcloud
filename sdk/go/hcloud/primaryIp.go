// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Hetzner Cloud Primary IP to represent a publicly-accessible static IP address that can be mapped to one of your servers.
//
// If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created & attached.
// Currently, Primary IPs can be only attached to servers.
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
//			main, err := hcloud.NewPrimaryIp(ctx, "main", &hcloud.PrimaryIpArgs{
//				Datacenter:   pulumi.String("fsn1-dc14"),
//				Type:         pulumi.String("ipv4"),
//				AssigneeType: pulumi.String("server"),
//				AutoDelete:   pulumi.Bool(true),
//				Labels: pulumi.AnyMap{
//					"hallo": pulumi.Any("welt"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewServer(ctx, "serverTest", &hcloud.ServerArgs{
//				Image:      pulumi.String("ubuntu-20.04"),
//				ServerType: pulumi.String("cx11"),
//				Datacenter: pulumi.String("fsn1-dc14"),
//				Labels: pulumi.AnyMap{
//					"test": pulumi.Any("tessst1"),
//				},
//				PublicNets: hcloud.ServerPublicNetArray{
//					&hcloud.ServerPublicNetArgs{
//						Ipv4: main.ID(),
//					},
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
// Primary IPs can be imported using its `id`
//
// ```sh
//
//	$ pulumi import hcloud:index/primaryIp:PrimaryIp myip id
//
// ```
type PrimaryIp struct {
	pulumi.CustomResourceState

	// ID of the assigned resource
	AssigneeId pulumi.IntOutput `pulumi:"assigneeId"`
	// The type of the assigned resource. Currently supported: `server`
	AssigneeType pulumi.StringOutput `pulumi:"assigneeType"`
	// Whether auto delete is enabled.
	// `Important note:`It is recommended to set `autoDelete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
	AutoDelete pulumi.BoolOutput `pulumi:"autoDelete"`
	// The datacenter name to create the resource in.
	Datacenter pulumi.StringOutput `pulumi:"datacenter"`
	// Whether delete protection is enabled.
	DeleteProtection pulumi.BoolPtrOutput `pulumi:"deleteProtection"`
	// (string) IP Address of the Primary IP.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	IpNetwork pulumi.StringOutput `pulumi:"ipNetwork"`
	// Description of the Primary IP.
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Name of the Primary IP.
	Name pulumi.StringOutput `pulumi:"name"`
	// Type of the Primary IP. `ipv4` or `ipv6`
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewPrimaryIp registers a new resource with the given unique name, arguments, and options.
func NewPrimaryIp(ctx *pulumi.Context,
	name string, args *PrimaryIpArgs, opts ...pulumi.ResourceOption) (*PrimaryIp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AssigneeType == nil {
		return nil, errors.New("invalid value for required argument 'AssigneeType'")
	}
	if args.AutoDelete == nil {
		return nil, errors.New("invalid value for required argument 'AutoDelete'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource PrimaryIp
	err := ctx.RegisterResource("hcloud:index/primaryIp:PrimaryIp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrimaryIp gets an existing PrimaryIp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrimaryIp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrimaryIpState, opts ...pulumi.ResourceOption) (*PrimaryIp, error) {
	var resource PrimaryIp
	err := ctx.ReadResource("hcloud:index/primaryIp:PrimaryIp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrimaryIp resources.
type primaryIpState struct {
	// ID of the assigned resource
	AssigneeId *int `pulumi:"assigneeId"`
	// The type of the assigned resource. Currently supported: `server`
	AssigneeType *string `pulumi:"assigneeType"`
	// Whether auto delete is enabled.
	// `Important note:`It is recommended to set `autoDelete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
	AutoDelete *bool `pulumi:"autoDelete"`
	// The datacenter name to create the resource in.
	Datacenter *string `pulumi:"datacenter"`
	// Whether delete protection is enabled.
	DeleteProtection *bool `pulumi:"deleteProtection"`
	// (string) IP Address of the Primary IP.
	IpAddress *string `pulumi:"ipAddress"`
	IpNetwork *string `pulumi:"ipNetwork"`
	// Description of the Primary IP.
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the Primary IP.
	Name *string `pulumi:"name"`
	// Type of the Primary IP. `ipv4` or `ipv6`
	Type *string `pulumi:"type"`
}

type PrimaryIpState struct {
	// ID of the assigned resource
	AssigneeId pulumi.IntPtrInput
	// The type of the assigned resource. Currently supported: `server`
	AssigneeType pulumi.StringPtrInput
	// Whether auto delete is enabled.
	// `Important note:`It is recommended to set `autoDelete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
	AutoDelete pulumi.BoolPtrInput
	// The datacenter name to create the resource in.
	Datacenter pulumi.StringPtrInput
	// Whether delete protection is enabled.
	DeleteProtection pulumi.BoolPtrInput
	// (string) IP Address of the Primary IP.
	IpAddress pulumi.StringPtrInput
	IpNetwork pulumi.StringPtrInput
	// Description of the Primary IP.
	Labels pulumi.MapInput
	// Name of the Primary IP.
	Name pulumi.StringPtrInput
	// Type of the Primary IP. `ipv4` or `ipv6`
	Type pulumi.StringPtrInput
}

func (PrimaryIpState) ElementType() reflect.Type {
	return reflect.TypeOf((*primaryIpState)(nil)).Elem()
}

type primaryIpArgs struct {
	// ID of the assigned resource
	AssigneeId *int `pulumi:"assigneeId"`
	// The type of the assigned resource. Currently supported: `server`
	AssigneeType string `pulumi:"assigneeType"`
	// Whether auto delete is enabled.
	// `Important note:`It is recommended to set `autoDelete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
	AutoDelete bool `pulumi:"autoDelete"`
	// The datacenter name to create the resource in.
	Datacenter *string `pulumi:"datacenter"`
	// Whether delete protection is enabled.
	DeleteProtection *bool `pulumi:"deleteProtection"`
	// Description of the Primary IP.
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the Primary IP.
	Name *string `pulumi:"name"`
	// Type of the Primary IP. `ipv4` or `ipv6`
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a PrimaryIp resource.
type PrimaryIpArgs struct {
	// ID of the assigned resource
	AssigneeId pulumi.IntPtrInput
	// The type of the assigned resource. Currently supported: `server`
	AssigneeType pulumi.StringInput
	// Whether auto delete is enabled.
	// `Important note:`It is recommended to set `autoDelete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
	AutoDelete pulumi.BoolInput
	// The datacenter name to create the resource in.
	Datacenter pulumi.StringPtrInput
	// Whether delete protection is enabled.
	DeleteProtection pulumi.BoolPtrInput
	// Description of the Primary IP.
	Labels pulumi.MapInput
	// Name of the Primary IP.
	Name pulumi.StringPtrInput
	// Type of the Primary IP. `ipv4` or `ipv6`
	Type pulumi.StringInput
}

func (PrimaryIpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*primaryIpArgs)(nil)).Elem()
}

type PrimaryIpInput interface {
	pulumi.Input

	ToPrimaryIpOutput() PrimaryIpOutput
	ToPrimaryIpOutputWithContext(ctx context.Context) PrimaryIpOutput
}

func (*PrimaryIp) ElementType() reflect.Type {
	return reflect.TypeOf((**PrimaryIp)(nil)).Elem()
}

func (i *PrimaryIp) ToPrimaryIpOutput() PrimaryIpOutput {
	return i.ToPrimaryIpOutputWithContext(context.Background())
}

func (i *PrimaryIp) ToPrimaryIpOutputWithContext(ctx context.Context) PrimaryIpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrimaryIpOutput)
}

// PrimaryIpArrayInput is an input type that accepts PrimaryIpArray and PrimaryIpArrayOutput values.
// You can construct a concrete instance of `PrimaryIpArrayInput` via:
//
//	PrimaryIpArray{ PrimaryIpArgs{...} }
type PrimaryIpArrayInput interface {
	pulumi.Input

	ToPrimaryIpArrayOutput() PrimaryIpArrayOutput
	ToPrimaryIpArrayOutputWithContext(context.Context) PrimaryIpArrayOutput
}

type PrimaryIpArray []PrimaryIpInput

func (PrimaryIpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrimaryIp)(nil)).Elem()
}

func (i PrimaryIpArray) ToPrimaryIpArrayOutput() PrimaryIpArrayOutput {
	return i.ToPrimaryIpArrayOutputWithContext(context.Background())
}

func (i PrimaryIpArray) ToPrimaryIpArrayOutputWithContext(ctx context.Context) PrimaryIpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrimaryIpArrayOutput)
}

// PrimaryIpMapInput is an input type that accepts PrimaryIpMap and PrimaryIpMapOutput values.
// You can construct a concrete instance of `PrimaryIpMapInput` via:
//
//	PrimaryIpMap{ "key": PrimaryIpArgs{...} }
type PrimaryIpMapInput interface {
	pulumi.Input

	ToPrimaryIpMapOutput() PrimaryIpMapOutput
	ToPrimaryIpMapOutputWithContext(context.Context) PrimaryIpMapOutput
}

type PrimaryIpMap map[string]PrimaryIpInput

func (PrimaryIpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrimaryIp)(nil)).Elem()
}

func (i PrimaryIpMap) ToPrimaryIpMapOutput() PrimaryIpMapOutput {
	return i.ToPrimaryIpMapOutputWithContext(context.Background())
}

func (i PrimaryIpMap) ToPrimaryIpMapOutputWithContext(ctx context.Context) PrimaryIpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrimaryIpMapOutput)
}

type PrimaryIpOutput struct{ *pulumi.OutputState }

func (PrimaryIpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrimaryIp)(nil)).Elem()
}

func (o PrimaryIpOutput) ToPrimaryIpOutput() PrimaryIpOutput {
	return o
}

func (o PrimaryIpOutput) ToPrimaryIpOutputWithContext(ctx context.Context) PrimaryIpOutput {
	return o
}

// ID of the assigned resource
func (o PrimaryIpOutput) AssigneeId() pulumi.IntOutput {
	return o.ApplyT(func(v *PrimaryIp) pulumi.IntOutput { return v.AssigneeId }).(pulumi.IntOutput)
}

// The type of the assigned resource. Currently supported: `server`
func (o PrimaryIpOutput) AssigneeType() pulumi.StringOutput {
	return o.ApplyT(func(v *PrimaryIp) pulumi.StringOutput { return v.AssigneeType }).(pulumi.StringOutput)
}

// Whether auto delete is enabled.
// `Important note:`It is recommended to set `autoDelete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
func (o PrimaryIpOutput) AutoDelete() pulumi.BoolOutput {
	return o.ApplyT(func(v *PrimaryIp) pulumi.BoolOutput { return v.AutoDelete }).(pulumi.BoolOutput)
}

// The datacenter name to create the resource in.
func (o PrimaryIpOutput) Datacenter() pulumi.StringOutput {
	return o.ApplyT(func(v *PrimaryIp) pulumi.StringOutput { return v.Datacenter }).(pulumi.StringOutput)
}

// Whether delete protection is enabled.
func (o PrimaryIpOutput) DeleteProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PrimaryIp) pulumi.BoolPtrOutput { return v.DeleteProtection }).(pulumi.BoolPtrOutput)
}

// (string) IP Address of the Primary IP.
func (o PrimaryIpOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *PrimaryIp) pulumi.StringOutput { return v.IpAddress }).(pulumi.StringOutput)
}

func (o PrimaryIpOutput) IpNetwork() pulumi.StringOutput {
	return o.ApplyT(func(v *PrimaryIp) pulumi.StringOutput { return v.IpNetwork }).(pulumi.StringOutput)
}

// Description of the Primary IP.
func (o PrimaryIpOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *PrimaryIp) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Name of the Primary IP.
func (o PrimaryIpOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PrimaryIp) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Type of the Primary IP. `ipv4` or `ipv6`
func (o PrimaryIpOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *PrimaryIp) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type PrimaryIpArrayOutput struct{ *pulumi.OutputState }

func (PrimaryIpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrimaryIp)(nil)).Elem()
}

func (o PrimaryIpArrayOutput) ToPrimaryIpArrayOutput() PrimaryIpArrayOutput {
	return o
}

func (o PrimaryIpArrayOutput) ToPrimaryIpArrayOutputWithContext(ctx context.Context) PrimaryIpArrayOutput {
	return o
}

func (o PrimaryIpArrayOutput) Index(i pulumi.IntInput) PrimaryIpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrimaryIp {
		return vs[0].([]*PrimaryIp)[vs[1].(int)]
	}).(PrimaryIpOutput)
}

type PrimaryIpMapOutput struct{ *pulumi.OutputState }

func (PrimaryIpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrimaryIp)(nil)).Elem()
}

func (o PrimaryIpMapOutput) ToPrimaryIpMapOutput() PrimaryIpMapOutput {
	return o
}

func (o PrimaryIpMapOutput) ToPrimaryIpMapOutputWithContext(ctx context.Context) PrimaryIpMapOutput {
	return o
}

func (o PrimaryIpMapOutput) MapIndex(k pulumi.StringInput) PrimaryIpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrimaryIp {
		return vs[0].(map[string]*PrimaryIp)[vs[1].(string)]
	}).(PrimaryIpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrimaryIpInput)(nil)).Elem(), &PrimaryIp{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrimaryIpArrayInput)(nil)).Elem(), PrimaryIpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrimaryIpMapInput)(nil)).Elem(), PrimaryIpMap{})
	pulumi.RegisterOutputType(PrimaryIpOutput{})
	pulumi.RegisterOutputType(PrimaryIpArrayOutput{})
	pulumi.RegisterOutputType(PrimaryIpMapOutput{})
}
