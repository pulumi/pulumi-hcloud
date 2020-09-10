// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Hetzner Cloud Reverse DNS Entry to create, modify and reset reverse dns entries for Hetzner Cloud Floating IPs or servers.
//
// ## Example Usage
//
// For servers:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		node1, err := hcloud.NewServer(ctx, "node1", &hcloud.ServerArgs{
// 			Image:      pulumi.String("debian-9"),
// 			ServerType: pulumi.String("cx11"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hcloud.NewRdns(ctx, "master", &hcloud.RdnsArgs{
// 			ServerId:  node1.ID(),
// 			IpAddress: node1.Ipv4Address,
// 			DnsPtr:    pulumi.String("example.com"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// For Floating IPs:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		floating1, err := hcloud.NewFloatingIp(ctx, "floating1", &hcloud.FloatingIpArgs{
// 			HomeLocation: pulumi.String("nbg1"),
// 			Type:         pulumi.String("ipv4"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hcloud.NewRdns(ctx, "floatingMaster", &hcloud.RdnsArgs{
// 			DnsPtr:       pulumi.String("example.com"),
// 			FloatingIpId: floating1.ID(),
// 			IpAddress:    floating1.IpAddress,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Rdns struct {
	pulumi.CustomResourceState

	// The DNS address the `ipAddress` should resolve to.
	DnsPtr pulumi.StringOutput `pulumi:"dnsPtr"`
	// The Floating IP the `ipAddress` belongs to.
	FloatingIpId pulumi.IntPtrOutput `pulumi:"floatingIpId"`
	// The IP address that should point to `dnsPtr`.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// The server the `ipAddress` belongs to.
	ServerId pulumi.IntPtrOutput `pulumi:"serverId"`
}

// NewRdns registers a new resource with the given unique name, arguments, and options.
func NewRdns(ctx *pulumi.Context,
	name string, args *RdnsArgs, opts ...pulumi.ResourceOption) (*Rdns, error) {
	if args == nil || args.DnsPtr == nil {
		return nil, errors.New("missing required argument 'DnsPtr'")
	}
	if args == nil || args.IpAddress == nil {
		return nil, errors.New("missing required argument 'IpAddress'")
	}
	if args == nil {
		args = &RdnsArgs{}
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
	// The Floating IP the `ipAddress` belongs to.
	FloatingIpId *int `pulumi:"floatingIpId"`
	// The IP address that should point to `dnsPtr`.
	IpAddress *string `pulumi:"ipAddress"`
	// The server the `ipAddress` belongs to.
	ServerId *int `pulumi:"serverId"`
}

type RdnsState struct {
	// The DNS address the `ipAddress` should resolve to.
	DnsPtr pulumi.StringPtrInput
	// The Floating IP the `ipAddress` belongs to.
	FloatingIpId pulumi.IntPtrInput
	// The IP address that should point to `dnsPtr`.
	IpAddress pulumi.StringPtrInput
	// The server the `ipAddress` belongs to.
	ServerId pulumi.IntPtrInput
}

func (RdnsState) ElementType() reflect.Type {
	return reflect.TypeOf((*rdnsState)(nil)).Elem()
}

type rdnsArgs struct {
	// The DNS address the `ipAddress` should resolve to.
	DnsPtr string `pulumi:"dnsPtr"`
	// The Floating IP the `ipAddress` belongs to.
	FloatingIpId *int `pulumi:"floatingIpId"`
	// The IP address that should point to `dnsPtr`.
	IpAddress string `pulumi:"ipAddress"`
	// The server the `ipAddress` belongs to.
	ServerId *int `pulumi:"serverId"`
}

// The set of arguments for constructing a Rdns resource.
type RdnsArgs struct {
	// The DNS address the `ipAddress` should resolve to.
	DnsPtr pulumi.StringInput
	// The Floating IP the `ipAddress` belongs to.
	FloatingIpId pulumi.IntPtrInput
	// The IP address that should point to `dnsPtr`.
	IpAddress pulumi.StringInput
	// The server the `ipAddress` belongs to.
	ServerId pulumi.IntPtrInput
}

func (RdnsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rdnsArgs)(nil)).Elem()
}
