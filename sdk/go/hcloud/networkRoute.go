// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Hetzner Cloud Network Route to represent a Network route in the Hetzner Cloud.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		mynet, err := hcloud.NewNetwork(ctx, "mynet", &hcloud.NetworkArgs{
// 			IpRange: pulumi.String("10.0.0.0/8"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hcloud.NewNetworkRoute(ctx, "privNet", &hcloud.NetworkRouteArgs{
// 			NetworkId:   mynet.ID(),
// 			Destination: pulumi.String("10.100.1.0/24"),
// 			Gateway:     pulumi.String("10.0.1.1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Network Route entries can be imported using a compound ID with the following format`<network-id>-<destination>`
//
// ```sh
//  $ pulumi import hcloud:index/networkRoute:NetworkRoute myroute 123-10.0.0.0/16
// ```
type NetworkRoute struct {
	pulumi.CustomResourceState

	// Destination network or host of this route. Must be a subnet of the ipRange of the Network. Must not overlap with an existing ipRange in any subnets or with any destinations in other routes or with the first ip of the networks ipRange or with 172.31.1.1.
	Destination pulumi.StringOutput `pulumi:"destination"`
	// Gateway for the route. Cannot be the first ip of the networks ipRange and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
	Gateway pulumi.StringOutput `pulumi:"gateway"`
	// ID of the Network the route should be added to.
	NetworkId pulumi.IntOutput `pulumi:"networkId"`
}

// NewNetworkRoute registers a new resource with the given unique name, arguments, and options.
func NewNetworkRoute(ctx *pulumi.Context,
	name string, args *NetworkRouteArgs, opts ...pulumi.ResourceOption) (*NetworkRoute, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Destination == nil {
		return nil, errors.New("invalid value for required argument 'Destination'")
	}
	if args.Gateway == nil {
		return nil, errors.New("invalid value for required argument 'Gateway'")
	}
	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	var resource NetworkRoute
	err := ctx.RegisterResource("hcloud:index/networkRoute:NetworkRoute", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkRoute gets an existing NetworkRoute resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkRoute(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkRouteState, opts ...pulumi.ResourceOption) (*NetworkRoute, error) {
	var resource NetworkRoute
	err := ctx.ReadResource("hcloud:index/networkRoute:NetworkRoute", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkRoute resources.
type networkRouteState struct {
	// Destination network or host of this route. Must be a subnet of the ipRange of the Network. Must not overlap with an existing ipRange in any subnets or with any destinations in other routes or with the first ip of the networks ipRange or with 172.31.1.1.
	Destination *string `pulumi:"destination"`
	// Gateway for the route. Cannot be the first ip of the networks ipRange and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
	Gateway *string `pulumi:"gateway"`
	// ID of the Network the route should be added to.
	NetworkId *int `pulumi:"networkId"`
}

type NetworkRouteState struct {
	// Destination network or host of this route. Must be a subnet of the ipRange of the Network. Must not overlap with an existing ipRange in any subnets or with any destinations in other routes or with the first ip of the networks ipRange or with 172.31.1.1.
	Destination pulumi.StringPtrInput
	// Gateway for the route. Cannot be the first ip of the networks ipRange and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
	Gateway pulumi.StringPtrInput
	// ID of the Network the route should be added to.
	NetworkId pulumi.IntPtrInput
}

func (NetworkRouteState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkRouteState)(nil)).Elem()
}

type networkRouteArgs struct {
	// Destination network or host of this route. Must be a subnet of the ipRange of the Network. Must not overlap with an existing ipRange in any subnets or with any destinations in other routes or with the first ip of the networks ipRange or with 172.31.1.1.
	Destination string `pulumi:"destination"`
	// Gateway for the route. Cannot be the first ip of the networks ipRange and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
	Gateway string `pulumi:"gateway"`
	// ID of the Network the route should be added to.
	NetworkId int `pulumi:"networkId"`
}

// The set of arguments for constructing a NetworkRoute resource.
type NetworkRouteArgs struct {
	// Destination network or host of this route. Must be a subnet of the ipRange of the Network. Must not overlap with an existing ipRange in any subnets or with any destinations in other routes or with the first ip of the networks ipRange or with 172.31.1.1.
	Destination pulumi.StringInput
	// Gateway for the route. Cannot be the first ip of the networks ipRange and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
	Gateway pulumi.StringInput
	// ID of the Network the route should be added to.
	NetworkId pulumi.IntInput
}

func (NetworkRouteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkRouteArgs)(nil)).Elem()
}

type NetworkRouteInput interface {
	pulumi.Input

	ToNetworkRouteOutput() NetworkRouteOutput
	ToNetworkRouteOutputWithContext(ctx context.Context) NetworkRouteOutput
}

func (*NetworkRoute) ElementType() reflect.Type {
	return reflect.TypeOf((*NetworkRoute)(nil))
}

func (i *NetworkRoute) ToNetworkRouteOutput() NetworkRouteOutput {
	return i.ToNetworkRouteOutputWithContext(context.Background())
}

func (i *NetworkRoute) ToNetworkRouteOutputWithContext(ctx context.Context) NetworkRouteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkRouteOutput)
}

type NetworkRouteOutput struct {
	*pulumi.OutputState
}

func (NetworkRouteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NetworkRoute)(nil))
}

func (o NetworkRouteOutput) ToNetworkRouteOutput() NetworkRouteOutput {
	return o
}

func (o NetworkRouteOutput) ToNetworkRouteOutputWithContext(ctx context.Context) NetworkRouteOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(NetworkRouteOutput{})
}
