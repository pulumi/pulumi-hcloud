// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Hetzner Cloud Floating IP to represent a publicly-accessible static IP address that can be mapped to one of your servers.
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
//			node1, err := hcloud.NewServer(ctx, "node1", &hcloud.ServerArgs{
//				Name:       pulumi.String("node1"),
//				Image:      pulumi.String("debian-11"),
//				ServerType: pulumi.String("cx11"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewFloatingIp(ctx, "master", &hcloud.FloatingIpArgs{
//				Type:     pulumi.String("ipv4"),
//				ServerId: node1.ID(),
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
// Floating IPs can be imported using its `id`:
//
// ```sh
// $ pulumi import hcloud:index/floatingIp:FloatingIp myip id
// ```
type FloatingIp struct {
	pulumi.CustomResourceState

	// Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
	DeleteProtection pulumi.BoolPtrOutput `pulumi:"deleteProtection"`
	// Description of the Floating IP.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of home location (routing is optimized for that location). Optional if serverId argument is passed.
	HomeLocation pulumi.StringOutput `pulumi:"homeLocation"`
	// (string) IP Address of the Floating IP.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// (string) IPv6 subnet. (Only set if `type` is `ipv6`)
	IpNetwork pulumi.StringOutput `pulumi:"ipNetwork"`
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Name of the Floating IP.
	Name pulumi.StringOutput `pulumi:"name"`
	// Server to assign the Floating IP to.
	ServerId pulumi.IntOutput `pulumi:"serverId"`
	// Type of the Floating IP. `ipv4` `ipv6`
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewFloatingIp registers a new resource with the given unique name, arguments, and options.
func NewFloatingIp(ctx *pulumi.Context,
	name string, args *FloatingIpArgs, opts ...pulumi.ResourceOption) (*FloatingIp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FloatingIp
	err := ctx.RegisterResource("hcloud:index/floatingIp:FloatingIp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFloatingIp gets an existing FloatingIp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFloatingIp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FloatingIpState, opts ...pulumi.ResourceOption) (*FloatingIp, error) {
	var resource FloatingIp
	err := ctx.ReadResource("hcloud:index/floatingIp:FloatingIp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FloatingIp resources.
type floatingIpState struct {
	// Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
	DeleteProtection *bool `pulumi:"deleteProtection"`
	// Description of the Floating IP.
	Description *string `pulumi:"description"`
	// Name of home location (routing is optimized for that location). Optional if serverId argument is passed.
	HomeLocation *string `pulumi:"homeLocation"`
	// (string) IP Address of the Floating IP.
	IpAddress *string `pulumi:"ipAddress"`
	// (string) IPv6 subnet. (Only set if `type` is `ipv6`)
	IpNetwork *string `pulumi:"ipNetwork"`
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the Floating IP.
	Name *string `pulumi:"name"`
	// Server to assign the Floating IP to.
	ServerId *int `pulumi:"serverId"`
	// Type of the Floating IP. `ipv4` `ipv6`
	Type *string `pulumi:"type"`
}

type FloatingIpState struct {
	// Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
	DeleteProtection pulumi.BoolPtrInput
	// Description of the Floating IP.
	Description pulumi.StringPtrInput
	// Name of home location (routing is optimized for that location). Optional if serverId argument is passed.
	HomeLocation pulumi.StringPtrInput
	// (string) IP Address of the Floating IP.
	IpAddress pulumi.StringPtrInput
	// (string) IPv6 subnet. (Only set if `type` is `ipv6`)
	IpNetwork pulumi.StringPtrInput
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.MapInput
	// Name of the Floating IP.
	Name pulumi.StringPtrInput
	// Server to assign the Floating IP to.
	ServerId pulumi.IntPtrInput
	// Type of the Floating IP. `ipv4` `ipv6`
	Type pulumi.StringPtrInput
}

func (FloatingIpState) ElementType() reflect.Type {
	return reflect.TypeOf((*floatingIpState)(nil)).Elem()
}

type floatingIpArgs struct {
	// Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
	DeleteProtection *bool `pulumi:"deleteProtection"`
	// Description of the Floating IP.
	Description *string `pulumi:"description"`
	// Name of home location (routing is optimized for that location). Optional if serverId argument is passed.
	HomeLocation *string `pulumi:"homeLocation"`
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the Floating IP.
	Name *string `pulumi:"name"`
	// Server to assign the Floating IP to.
	ServerId *int `pulumi:"serverId"`
	// Type of the Floating IP. `ipv4` `ipv6`
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a FloatingIp resource.
type FloatingIpArgs struct {
	// Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
	DeleteProtection pulumi.BoolPtrInput
	// Description of the Floating IP.
	Description pulumi.StringPtrInput
	// Name of home location (routing is optimized for that location). Optional if serverId argument is passed.
	HomeLocation pulumi.StringPtrInput
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.MapInput
	// Name of the Floating IP.
	Name pulumi.StringPtrInput
	// Server to assign the Floating IP to.
	ServerId pulumi.IntPtrInput
	// Type of the Floating IP. `ipv4` `ipv6`
	Type pulumi.StringInput
}

func (FloatingIpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*floatingIpArgs)(nil)).Elem()
}

type FloatingIpInput interface {
	pulumi.Input

	ToFloatingIpOutput() FloatingIpOutput
	ToFloatingIpOutputWithContext(ctx context.Context) FloatingIpOutput
}

func (*FloatingIp) ElementType() reflect.Type {
	return reflect.TypeOf((**FloatingIp)(nil)).Elem()
}

func (i *FloatingIp) ToFloatingIpOutput() FloatingIpOutput {
	return i.ToFloatingIpOutputWithContext(context.Background())
}

func (i *FloatingIp) ToFloatingIpOutputWithContext(ctx context.Context) FloatingIpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FloatingIpOutput)
}

// FloatingIpArrayInput is an input type that accepts FloatingIpArray and FloatingIpArrayOutput values.
// You can construct a concrete instance of `FloatingIpArrayInput` via:
//
//	FloatingIpArray{ FloatingIpArgs{...} }
type FloatingIpArrayInput interface {
	pulumi.Input

	ToFloatingIpArrayOutput() FloatingIpArrayOutput
	ToFloatingIpArrayOutputWithContext(context.Context) FloatingIpArrayOutput
}

type FloatingIpArray []FloatingIpInput

func (FloatingIpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FloatingIp)(nil)).Elem()
}

func (i FloatingIpArray) ToFloatingIpArrayOutput() FloatingIpArrayOutput {
	return i.ToFloatingIpArrayOutputWithContext(context.Background())
}

func (i FloatingIpArray) ToFloatingIpArrayOutputWithContext(ctx context.Context) FloatingIpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FloatingIpArrayOutput)
}

// FloatingIpMapInput is an input type that accepts FloatingIpMap and FloatingIpMapOutput values.
// You can construct a concrete instance of `FloatingIpMapInput` via:
//
//	FloatingIpMap{ "key": FloatingIpArgs{...} }
type FloatingIpMapInput interface {
	pulumi.Input

	ToFloatingIpMapOutput() FloatingIpMapOutput
	ToFloatingIpMapOutputWithContext(context.Context) FloatingIpMapOutput
}

type FloatingIpMap map[string]FloatingIpInput

func (FloatingIpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FloatingIp)(nil)).Elem()
}

func (i FloatingIpMap) ToFloatingIpMapOutput() FloatingIpMapOutput {
	return i.ToFloatingIpMapOutputWithContext(context.Background())
}

func (i FloatingIpMap) ToFloatingIpMapOutputWithContext(ctx context.Context) FloatingIpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FloatingIpMapOutput)
}

type FloatingIpOutput struct{ *pulumi.OutputState }

func (FloatingIpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FloatingIp)(nil)).Elem()
}

func (o FloatingIpOutput) ToFloatingIpOutput() FloatingIpOutput {
	return o
}

func (o FloatingIpOutput) ToFloatingIpOutputWithContext(ctx context.Context) FloatingIpOutput {
	return o
}

// Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
func (o FloatingIpOutput) DeleteProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FloatingIp) pulumi.BoolPtrOutput { return v.DeleteProtection }).(pulumi.BoolPtrOutput)
}

// Description of the Floating IP.
func (o FloatingIpOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FloatingIp) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of home location (routing is optimized for that location). Optional if serverId argument is passed.
func (o FloatingIpOutput) HomeLocation() pulumi.StringOutput {
	return o.ApplyT(func(v *FloatingIp) pulumi.StringOutput { return v.HomeLocation }).(pulumi.StringOutput)
}

// (string) IP Address of the Floating IP.
func (o FloatingIpOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *FloatingIp) pulumi.StringOutput { return v.IpAddress }).(pulumi.StringOutput)
}

// (string) IPv6 subnet. (Only set if `type` is `ipv6`)
func (o FloatingIpOutput) IpNetwork() pulumi.StringOutput {
	return o.ApplyT(func(v *FloatingIp) pulumi.StringOutput { return v.IpNetwork }).(pulumi.StringOutput)
}

// User-defined labels (key-value pairs) should be created with.
func (o FloatingIpOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *FloatingIp) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Name of the Floating IP.
func (o FloatingIpOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FloatingIp) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Server to assign the Floating IP to.
func (o FloatingIpOutput) ServerId() pulumi.IntOutput {
	return o.ApplyT(func(v *FloatingIp) pulumi.IntOutput { return v.ServerId }).(pulumi.IntOutput)
}

// Type of the Floating IP. `ipv4` `ipv6`
func (o FloatingIpOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *FloatingIp) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type FloatingIpArrayOutput struct{ *pulumi.OutputState }

func (FloatingIpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FloatingIp)(nil)).Elem()
}

func (o FloatingIpArrayOutput) ToFloatingIpArrayOutput() FloatingIpArrayOutput {
	return o
}

func (o FloatingIpArrayOutput) ToFloatingIpArrayOutputWithContext(ctx context.Context) FloatingIpArrayOutput {
	return o
}

func (o FloatingIpArrayOutput) Index(i pulumi.IntInput) FloatingIpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FloatingIp {
		return vs[0].([]*FloatingIp)[vs[1].(int)]
	}).(FloatingIpOutput)
}

type FloatingIpMapOutput struct{ *pulumi.OutputState }

func (FloatingIpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FloatingIp)(nil)).Elem()
}

func (o FloatingIpMapOutput) ToFloatingIpMapOutput() FloatingIpMapOutput {
	return o
}

func (o FloatingIpMapOutput) ToFloatingIpMapOutputWithContext(ctx context.Context) FloatingIpMapOutput {
	return o
}

func (o FloatingIpMapOutput) MapIndex(k pulumi.StringInput) FloatingIpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FloatingIp {
		return vs[0].(map[string]*FloatingIp)[vs[1].(string)]
	}).(FloatingIpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FloatingIpInput)(nil)).Elem(), &FloatingIp{})
	pulumi.RegisterInputType(reflect.TypeOf((*FloatingIpArrayInput)(nil)).Elem(), FloatingIpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FloatingIpMapInput)(nil)).Elem(), FloatingIpMap{})
	pulumi.RegisterOutputType(FloatingIpOutput{})
	pulumi.RegisterOutputType(FloatingIpArrayOutput{})
	pulumi.RegisterOutputType(FloatingIpMapOutput{})
}
