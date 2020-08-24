// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Hetzner Cloud Server Network to represent a private network on a server in the Hetzner Cloud.
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
// 		node1, err := hcloud.NewServer(ctx, "node1", &hcloud.ServerArgs{
// 			Image:      pulumi.String("debian-9"),
// 			ServerType: pulumi.String("cx11"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		mynet, err := hcloud.NewNetwork(ctx, "mynet", &hcloud.NetworkArgs{
// 			IpRange: pulumi.String("10.0.0.0/8"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hcloud.NewNetworkSubnet(ctx, "foonet", &hcloud.NetworkSubnetArgs{
// 			IpRange:     pulumi.String("10.0.1.0/24"),
// 			NetworkId:   mynet.ID(),
// 			NetworkZone: pulumi.String("eu-central"),
// 			Type:        pulumi.String("cloud"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hcloud.NewServerNetwork(ctx, "srvnetwork", &hcloud.ServerNetworkArgs{
// 			Ip:        pulumi.String("10.0.1.5"),
// 			NetworkId: mynet.ID(),
// 			ServerId:  node1.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type ServerNetwork struct {
	pulumi.CustomResourceState

	// Additional IPs to be assigned to this server.
	AliasIps pulumi.StringArrayOutput `pulumi:"aliasIps"`
	// IP to request to be assigned to this server. If you do not provide this then you will be auto assigned an IP address.
	Ip         pulumi.StringOutput `pulumi:"ip"`
	MacAddress pulumi.StringOutput `pulumi:"macAddress"`
	// ID of the network which should be added to the server.
	NetworkId pulumi.IntOutput `pulumi:"networkId"`
	// ID of the server.
	ServerId pulumi.IntOutput `pulumi:"serverId"`
}

// NewServerNetwork registers a new resource with the given unique name, arguments, and options.
func NewServerNetwork(ctx *pulumi.Context,
	name string, args *ServerNetworkArgs, opts ...pulumi.ResourceOption) (*ServerNetwork, error) {
	if args == nil || args.NetworkId == nil {
		return nil, errors.New("missing required argument 'NetworkId'")
	}
	if args == nil || args.ServerId == nil {
		return nil, errors.New("missing required argument 'ServerId'")
	}
	if args == nil {
		args = &ServerNetworkArgs{}
	}
	var resource ServerNetwork
	err := ctx.RegisterResource("hcloud:index/serverNetwork:ServerNetwork", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServerNetwork gets an existing ServerNetwork resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServerNetwork(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServerNetworkState, opts ...pulumi.ResourceOption) (*ServerNetwork, error) {
	var resource ServerNetwork
	err := ctx.ReadResource("hcloud:index/serverNetwork:ServerNetwork", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServerNetwork resources.
type serverNetworkState struct {
	// Additional IPs to be assigned to this server.
	AliasIps []string `pulumi:"aliasIps"`
	// IP to request to be assigned to this server. If you do not provide this then you will be auto assigned an IP address.
	Ip         *string `pulumi:"ip"`
	MacAddress *string `pulumi:"macAddress"`
	// ID of the network which should be added to the server.
	NetworkId *int `pulumi:"networkId"`
	// ID of the server.
	ServerId *int `pulumi:"serverId"`
}

type ServerNetworkState struct {
	// Additional IPs to be assigned to this server.
	AliasIps pulumi.StringArrayInput
	// IP to request to be assigned to this server. If you do not provide this then you will be auto assigned an IP address.
	Ip         pulumi.StringPtrInput
	MacAddress pulumi.StringPtrInput
	// ID of the network which should be added to the server.
	NetworkId pulumi.IntPtrInput
	// ID of the server.
	ServerId pulumi.IntPtrInput
}

func (ServerNetworkState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverNetworkState)(nil)).Elem()
}

type serverNetworkArgs struct {
	// Additional IPs to be assigned to this server.
	AliasIps []string `pulumi:"aliasIps"`
	// IP to request to be assigned to this server. If you do not provide this then you will be auto assigned an IP address.
	Ip *string `pulumi:"ip"`
	// ID of the network which should be added to the server.
	NetworkId int `pulumi:"networkId"`
	// ID of the server.
	ServerId int `pulumi:"serverId"`
}

// The set of arguments for constructing a ServerNetwork resource.
type ServerNetworkArgs struct {
	// Additional IPs to be assigned to this server.
	AliasIps pulumi.StringArrayInput
	// IP to request to be assigned to this server. If you do not provide this then you will be auto assigned an IP address.
	Ip pulumi.StringPtrInput
	// ID of the network which should be added to the server.
	NetworkId pulumi.IntInput
	// ID of the server.
	ServerId pulumi.IntInput
}

func (ServerNetworkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverNetworkArgs)(nil)).Elem()
}
