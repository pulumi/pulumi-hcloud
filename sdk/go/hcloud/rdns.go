// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Hetzner Cloud Reverse DNS Entry to create, modify and reset reverse dns entries for Hetzner Cloud Servers, Floating IPs or Load Balancers.
//
// ## Example Usage
//
// For servers:
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
//				Image:      pulumi.String("debian-11"),
//				ServerType: pulumi.String("cx11"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewRdns(ctx, "master", &hcloud.RdnsArgs{
//				ServerId:  node1.ID(),
//				IpAddress: node1.Ipv4Address,
//				DnsPtr:    pulumi.String("example.com"),
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
// For Floating IPs:
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
//			floating1, err := hcloud.NewFloatingIp(ctx, "floating1", &hcloud.FloatingIpArgs{
//				HomeLocation: pulumi.String("nbg1"),
//				Type:         pulumi.String("ipv4"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewRdns(ctx, "floatingMaster", &hcloud.RdnsArgs{
//				DnsPtr:       pulumi.String("example.com"),
//				FloatingIpId: floating1.ID(),
//				IpAddress:    floating1.IpAddress,
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
// For Load Balancers:
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
//			loadBalancer1, err := hcloud.NewLoadBalancer(ctx, "loadBalancer1", &hcloud.LoadBalancerArgs{
//				LoadBalancerType: pulumi.String("lb11"),
//				Location:         pulumi.String("fsn1"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewRdns(ctx, "loadBalancerMaster", &hcloud.RdnsArgs{
//				DnsPtr:         pulumi.String("example.com"),
//				IpAddress:      loadBalancer1.Ipv4,
//				LoadBalancerId: loadBalancer1.ID(),
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
// Reverse DNS entries can be imported using a compound ID with the following format`<prefix (s for server/ f for floating ip / l for load balancer)>-<server, floating ip or load balancer ID>-<IP address>` import reverse dns entry on server with id 123, ip 192.168.100.1
//
// ```sh
//
//	$ pulumi import hcloud:index/rdns:Rdns myrdns s-123-192.168.100.1
//
// ```
//
//	import reverse dns entry on floating ip with id 123, ip 2001:db8::1
//
// ```sh
//
//	$ pulumi import hcloud:index/rdns:Rdns myrdns f-123-2001:db8::1
//
// ```
//
//	import reverse dns entry on load balancer with id 123, ip 2001:db8::1
//
// ```sh
//
//	$ pulumi import hcloud:index/rdns:Rdns myrdns l-123-2001:db8::1
//
// ```
type Rdns struct {
	pulumi.CustomResourceState

	// The DNS address the `ipAddress` should resolve to.
	DnsPtr pulumi.StringOutput `pulumi:"dnsPtr"`
	// The Floating IP the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	FloatingIpId pulumi.IntPtrOutput `pulumi:"floatingIpId"`
	// The IP address that should point to `dnsPtr`.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// The Load Balancer the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	LoadBalancerId pulumi.IntPtrOutput `pulumi:"loadBalancerId"`
	// The server the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	ServerId pulumi.IntPtrOutput `pulumi:"serverId"`
}

// NewRdns registers a new resource with the given unique name, arguments, and options.
func NewRdns(ctx *pulumi.Context,
	name string, args *RdnsArgs, opts ...pulumi.ResourceOption) (*Rdns, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DnsPtr == nil {
		return nil, errors.New("invalid value for required argument 'DnsPtr'")
	}
	if args.IpAddress == nil {
		return nil, errors.New("invalid value for required argument 'IpAddress'")
	}
	var resource Rdns
	err := ctx.RegisterResource("hcloud:index/rdns:Rdns", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRdns gets an existing Rdns resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRdns(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RdnsState, opts ...pulumi.ResourceOption) (*Rdns, error) {
	var resource Rdns
	err := ctx.ReadResource("hcloud:index/rdns:Rdns", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Rdns resources.
type rdnsState struct {
	// The DNS address the `ipAddress` should resolve to.
	DnsPtr *string `pulumi:"dnsPtr"`
	// The Floating IP the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	FloatingIpId *int `pulumi:"floatingIpId"`
	// The IP address that should point to `dnsPtr`.
	IpAddress *string `pulumi:"ipAddress"`
	// The Load Balancer the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	LoadBalancerId *int `pulumi:"loadBalancerId"`
	// The server the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	ServerId *int `pulumi:"serverId"`
}

type RdnsState struct {
	// The DNS address the `ipAddress` should resolve to.
	DnsPtr pulumi.StringPtrInput
	// The Floating IP the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	FloatingIpId pulumi.IntPtrInput
	// The IP address that should point to `dnsPtr`.
	IpAddress pulumi.StringPtrInput
	// The Load Balancer the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	LoadBalancerId pulumi.IntPtrInput
	// The server the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	ServerId pulumi.IntPtrInput
}

func (RdnsState) ElementType() reflect.Type {
	return reflect.TypeOf((*rdnsState)(nil)).Elem()
}

type rdnsArgs struct {
	// The DNS address the `ipAddress` should resolve to.
	DnsPtr string `pulumi:"dnsPtr"`
	// The Floating IP the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	FloatingIpId *int `pulumi:"floatingIpId"`
	// The IP address that should point to `dnsPtr`.
	IpAddress string `pulumi:"ipAddress"`
	// The Load Balancer the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	LoadBalancerId *int `pulumi:"loadBalancerId"`
	// The server the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	ServerId *int `pulumi:"serverId"`
}

// The set of arguments for constructing a Rdns resource.
type RdnsArgs struct {
	// The DNS address the `ipAddress` should resolve to.
	DnsPtr pulumi.StringInput
	// The Floating IP the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	FloatingIpId pulumi.IntPtrInput
	// The IP address that should point to `dnsPtr`.
	IpAddress pulumi.StringInput
	// The Load Balancer the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	LoadBalancerId pulumi.IntPtrInput
	// The server the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
	ServerId pulumi.IntPtrInput
}

func (RdnsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rdnsArgs)(nil)).Elem()
}

type RdnsInput interface {
	pulumi.Input

	ToRdnsOutput() RdnsOutput
	ToRdnsOutputWithContext(ctx context.Context) RdnsOutput
}

func (*Rdns) ElementType() reflect.Type {
	return reflect.TypeOf((**Rdns)(nil)).Elem()
}

func (i *Rdns) ToRdnsOutput() RdnsOutput {
	return i.ToRdnsOutputWithContext(context.Background())
}

func (i *Rdns) ToRdnsOutputWithContext(ctx context.Context) RdnsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RdnsOutput)
}

// RdnsArrayInput is an input type that accepts RdnsArray and RdnsArrayOutput values.
// You can construct a concrete instance of `RdnsArrayInput` via:
//
//	RdnsArray{ RdnsArgs{...} }
type RdnsArrayInput interface {
	pulumi.Input

	ToRdnsArrayOutput() RdnsArrayOutput
	ToRdnsArrayOutputWithContext(context.Context) RdnsArrayOutput
}

type RdnsArray []RdnsInput

func (RdnsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rdns)(nil)).Elem()
}

func (i RdnsArray) ToRdnsArrayOutput() RdnsArrayOutput {
	return i.ToRdnsArrayOutputWithContext(context.Background())
}

func (i RdnsArray) ToRdnsArrayOutputWithContext(ctx context.Context) RdnsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RdnsArrayOutput)
}

// RdnsMapInput is an input type that accepts RdnsMap and RdnsMapOutput values.
// You can construct a concrete instance of `RdnsMapInput` via:
//
//	RdnsMap{ "key": RdnsArgs{...} }
type RdnsMapInput interface {
	pulumi.Input

	ToRdnsMapOutput() RdnsMapOutput
	ToRdnsMapOutputWithContext(context.Context) RdnsMapOutput
}

type RdnsMap map[string]RdnsInput

func (RdnsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rdns)(nil)).Elem()
}

func (i RdnsMap) ToRdnsMapOutput() RdnsMapOutput {
	return i.ToRdnsMapOutputWithContext(context.Background())
}

func (i RdnsMap) ToRdnsMapOutputWithContext(ctx context.Context) RdnsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RdnsMapOutput)
}

type RdnsOutput struct{ *pulumi.OutputState }

func (RdnsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Rdns)(nil)).Elem()
}

func (o RdnsOutput) ToRdnsOutput() RdnsOutput {
	return o
}

func (o RdnsOutput) ToRdnsOutputWithContext(ctx context.Context) RdnsOutput {
	return o
}

// The DNS address the `ipAddress` should resolve to.
func (o RdnsOutput) DnsPtr() pulumi.StringOutput {
	return o.ApplyT(func(v *Rdns) pulumi.StringOutput { return v.DnsPtr }).(pulumi.StringOutput)
}

// The Floating IP the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
func (o RdnsOutput) FloatingIpId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Rdns) pulumi.IntPtrOutput { return v.FloatingIpId }).(pulumi.IntPtrOutput)
}

// The IP address that should point to `dnsPtr`.
func (o RdnsOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *Rdns) pulumi.StringOutput { return v.IpAddress }).(pulumi.StringOutput)
}

// The Load Balancer the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
func (o RdnsOutput) LoadBalancerId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Rdns) pulumi.IntPtrOutput { return v.LoadBalancerId }).(pulumi.IntPtrOutput)
}

// The server the `ipAddress` belongs to. Specify only one of `serverId`, `floatingIpId` and `loadBalancerId`.
func (o RdnsOutput) ServerId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Rdns) pulumi.IntPtrOutput { return v.ServerId }).(pulumi.IntPtrOutput)
}

type RdnsArrayOutput struct{ *pulumi.OutputState }

func (RdnsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rdns)(nil)).Elem()
}

func (o RdnsArrayOutput) ToRdnsArrayOutput() RdnsArrayOutput {
	return o
}

func (o RdnsArrayOutput) ToRdnsArrayOutputWithContext(ctx context.Context) RdnsArrayOutput {
	return o
}

func (o RdnsArrayOutput) Index(i pulumi.IntInput) RdnsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Rdns {
		return vs[0].([]*Rdns)[vs[1].(int)]
	}).(RdnsOutput)
}

type RdnsMapOutput struct{ *pulumi.OutputState }

func (RdnsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rdns)(nil)).Elem()
}

func (o RdnsMapOutput) ToRdnsMapOutput() RdnsMapOutput {
	return o
}

func (o RdnsMapOutput) ToRdnsMapOutputWithContext(ctx context.Context) RdnsMapOutput {
	return o
}

func (o RdnsMapOutput) MapIndex(k pulumi.StringInput) RdnsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Rdns {
		return vs[0].(map[string]*Rdns)[vs[1].(string)]
	}).(RdnsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RdnsInput)(nil)).Elem(), &Rdns{})
	pulumi.RegisterInputType(reflect.TypeOf((*RdnsArrayInput)(nil)).Elem(), RdnsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RdnsMapInput)(nil)).Elem(), RdnsMap{})
	pulumi.RegisterOutputType(RdnsOutput{})
	pulumi.RegisterOutputType(RdnsArrayOutput{})
	pulumi.RegisterOutputType(RdnsMapOutput{})
}
