// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Hetzner Cloud Network Subnet to represent a Subnet in the Hetzner Cloud.
//
// ## Example Usage
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
// 		mynet, err := hcloud.NewNetwork(ctx, "mynet", &hcloud.NetworkArgs{
// 			IpRange: pulumi.String("10.0.0.0/8"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hcloud.NewNetworkSubnet(ctx, "foonet", &hcloud.NetworkSubnetArgs{
// 			NetworkId:   mynet.ID(),
// 			Type:        pulumi.String("cloud"),
// 			NetworkZone: pulumi.String("eu-central"),
// 			IpRange:     pulumi.String("10.0.1.0/24"),
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
// Network Subnet entries can be imported using a compound ID with the following format`<network-id>-<ip_range>`
//
// ```sh
//  $ pulumi import hcloud:index/networkSubnet:NetworkSubnet mysubnet 123-10.0.0.0/24
// ```
type NetworkSubnet struct {
	pulumi.CustomResourceState

	Gateway pulumi.StringOutput `pulumi:"gateway"`
	// Range to allocate IPs from. Must be a subnet of the ipRange of the Network and must not overlap with any other subnets or with any destinations in routes.
	IpRange pulumi.StringOutput `pulumi:"ipRange"`
	// ID of the Network the subnet should be added to.
	NetworkId pulumi.IntOutput `pulumi:"networkId"`
	// Name of network zone.
	NetworkZone pulumi.StringOutput `pulumi:"networkZone"`
	// Type of subnet. `server`, `cloud` or `vswitch`
	Type pulumi.StringOutput `pulumi:"type"`
	// ID of the vswitch, Required if type is `vswitch`
	VswitchId pulumi.IntPtrOutput `pulumi:"vswitchId"`
}

// NewNetworkSubnet registers a new resource with the given unique name, arguments, and options.
func NewNetworkSubnet(ctx *pulumi.Context,
	name string, args *NetworkSubnetArgs, opts ...pulumi.ResourceOption) (*NetworkSubnet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IpRange == nil {
		return nil, errors.New("invalid value for required argument 'IpRange'")
	}
	if args.NetworkId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkId'")
	}
	if args.NetworkZone == nil {
		return nil, errors.New("invalid value for required argument 'NetworkZone'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource NetworkSubnet
	err := ctx.RegisterResource("hcloud:index/networkSubnet:NetworkSubnet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkSubnet gets an existing NetworkSubnet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkSubnet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkSubnetState, opts ...pulumi.ResourceOption) (*NetworkSubnet, error) {
	var resource NetworkSubnet
	err := ctx.ReadResource("hcloud:index/networkSubnet:NetworkSubnet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkSubnet resources.
type networkSubnetState struct {
	Gateway *string `pulumi:"gateway"`
	// Range to allocate IPs from. Must be a subnet of the ipRange of the Network and must not overlap with any other subnets or with any destinations in routes.
	IpRange *string `pulumi:"ipRange"`
	// ID of the Network the subnet should be added to.
	NetworkId *int `pulumi:"networkId"`
	// Name of network zone.
	NetworkZone *string `pulumi:"networkZone"`
	// Type of subnet. `server`, `cloud` or `vswitch`
	Type *string `pulumi:"type"`
	// ID of the vswitch, Required if type is `vswitch`
	VswitchId *int `pulumi:"vswitchId"`
}

type NetworkSubnetState struct {
	Gateway pulumi.StringPtrInput
	// Range to allocate IPs from. Must be a subnet of the ipRange of the Network and must not overlap with any other subnets or with any destinations in routes.
	IpRange pulumi.StringPtrInput
	// ID of the Network the subnet should be added to.
	NetworkId pulumi.IntPtrInput
	// Name of network zone.
	NetworkZone pulumi.StringPtrInput
	// Type of subnet. `server`, `cloud` or `vswitch`
	Type pulumi.StringPtrInput
	// ID of the vswitch, Required if type is `vswitch`
	VswitchId pulumi.IntPtrInput
}

func (NetworkSubnetState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkSubnetState)(nil)).Elem()
}

type networkSubnetArgs struct {
	// Range to allocate IPs from. Must be a subnet of the ipRange of the Network and must not overlap with any other subnets or with any destinations in routes.
	IpRange string `pulumi:"ipRange"`
	// ID of the Network the subnet should be added to.
	NetworkId int `pulumi:"networkId"`
	// Name of network zone.
	NetworkZone string `pulumi:"networkZone"`
	// Type of subnet. `server`, `cloud` or `vswitch`
	Type string `pulumi:"type"`
	// ID of the vswitch, Required if type is `vswitch`
	VswitchId *int `pulumi:"vswitchId"`
}

// The set of arguments for constructing a NetworkSubnet resource.
type NetworkSubnetArgs struct {
	// Range to allocate IPs from. Must be a subnet of the ipRange of the Network and must not overlap with any other subnets or with any destinations in routes.
	IpRange pulumi.StringInput
	// ID of the Network the subnet should be added to.
	NetworkId pulumi.IntInput
	// Name of network zone.
	NetworkZone pulumi.StringInput
	// Type of subnet. `server`, `cloud` or `vswitch`
	Type pulumi.StringInput
	// ID of the vswitch, Required if type is `vswitch`
	VswitchId pulumi.IntPtrInput
}

func (NetworkSubnetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkSubnetArgs)(nil)).Elem()
}

type NetworkSubnetInput interface {
	pulumi.Input

	ToNetworkSubnetOutput() NetworkSubnetOutput
	ToNetworkSubnetOutputWithContext(ctx context.Context) NetworkSubnetOutput
}

func (NetworkSubnet) ElementType() reflect.Type {
	return reflect.TypeOf((*NetworkSubnet)(nil)).Elem()
}

func (i NetworkSubnet) ToNetworkSubnetOutput() NetworkSubnetOutput {
	return i.ToNetworkSubnetOutputWithContext(context.Background())
}

func (i NetworkSubnet) ToNetworkSubnetOutputWithContext(ctx context.Context) NetworkSubnetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkSubnetOutput)
}

type NetworkSubnetOutput struct {
	*pulumi.OutputState
}

func (NetworkSubnetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NetworkSubnetOutput)(nil)).Elem()
}

func (o NetworkSubnetOutput) ToNetworkSubnetOutput() NetworkSubnetOutput {
	return o
}

func (o NetworkSubnetOutput) ToNetworkSubnetOutputWithContext(ctx context.Context) NetworkSubnetOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(NetworkSubnetOutput{})
}
