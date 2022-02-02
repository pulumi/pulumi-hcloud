// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
// 			NetworkId:   mynet.ID(),
// 			Type:        pulumi.String("cloud"),
// 			NetworkZone: pulumi.String("eu-central"),
// 			IpRange:     pulumi.String("10.0.1.0/24"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hcloud.NewServerNetwork(ctx, "srvnetwork", &hcloud.ServerNetworkArgs{
// 			ServerId:  node1.ID(),
// 			NetworkId: mynet.ID(),
// 			Ip:        pulumi.String("10.0.1.5"),
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
// Server Network entries can be imported using a compound ID with the following format`<server-id>-<network-id>`
//
// ```sh
//  $ pulumi import hcloud:index/serverNetwork:ServerNetwork myservernetwork 123-654
// ```
type ServerNetwork struct {
	pulumi.CustomResourceState

	// Additional IPs to be assigned
	// to this server.
	AliasIps pulumi.StringArrayOutput `pulumi:"aliasIps"`
	// IP to request to be assigned to this server.
	// If you do not provide this then you will be auto assigned an IP
	// address.
	Ip         pulumi.StringOutput `pulumi:"ip"`
	MacAddress pulumi.StringOutput `pulumi:"macAddress"`
	// ID of the network which should be added
	// to the server. Required if `subnetId` is not set. Successful creation
	// of the resource depends on the existence of a subnet in the Hetzner
	// Cloud Backend. Using `networkId` will not create an explicit
	// dependency between server and subnet. Therefore `dependsOn` may need
	// to be used. Alternatively the `subnetId` property can be used, which
	// will create an explicit dependency between `ServerNetwork` and
	// the existence of a subnet.
	NetworkId pulumi.IntPtrOutput `pulumi:"networkId"`
	// ID of the server.
	ServerId pulumi.IntOutput `pulumi:"serverId"`
	// ID of the sub-network which should be
	// added to the Server. Required if `networkId` is not set.
	// *Note*: if the `ip` property is missing, the Server is currently added
	// to the last created subnet.
	SubnetId pulumi.StringPtrOutput `pulumi:"subnetId"`
}

// NewServerNetwork registers a new resource with the given unique name, arguments, and options.
func NewServerNetwork(ctx *pulumi.Context,
	name string, args *ServerNetworkArgs, opts ...pulumi.ResourceOption) (*ServerNetwork, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServerId == nil {
		return nil, errors.New("invalid value for required argument 'ServerId'")
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
	// Additional IPs to be assigned
	// to this server.
	AliasIps []string `pulumi:"aliasIps"`
	// IP to request to be assigned to this server.
	// If you do not provide this then you will be auto assigned an IP
	// address.
	Ip         *string `pulumi:"ip"`
	MacAddress *string `pulumi:"macAddress"`
	// ID of the network which should be added
	// to the server. Required if `subnetId` is not set. Successful creation
	// of the resource depends on the existence of a subnet in the Hetzner
	// Cloud Backend. Using `networkId` will not create an explicit
	// dependency between server and subnet. Therefore `dependsOn` may need
	// to be used. Alternatively the `subnetId` property can be used, which
	// will create an explicit dependency between `ServerNetwork` and
	// the existence of a subnet.
	NetworkId *int `pulumi:"networkId"`
	// ID of the server.
	ServerId *int `pulumi:"serverId"`
	// ID of the sub-network which should be
	// added to the Server. Required if `networkId` is not set.
	// *Note*: if the `ip` property is missing, the Server is currently added
	// to the last created subnet.
	SubnetId *string `pulumi:"subnetId"`
}

type ServerNetworkState struct {
	// Additional IPs to be assigned
	// to this server.
	AliasIps pulumi.StringArrayInput
	// IP to request to be assigned to this server.
	// If you do not provide this then you will be auto assigned an IP
	// address.
	Ip         pulumi.StringPtrInput
	MacAddress pulumi.StringPtrInput
	// ID of the network which should be added
	// to the server. Required if `subnetId` is not set. Successful creation
	// of the resource depends on the existence of a subnet in the Hetzner
	// Cloud Backend. Using `networkId` will not create an explicit
	// dependency between server and subnet. Therefore `dependsOn` may need
	// to be used. Alternatively the `subnetId` property can be used, which
	// will create an explicit dependency between `ServerNetwork` and
	// the existence of a subnet.
	NetworkId pulumi.IntPtrInput
	// ID of the server.
	ServerId pulumi.IntPtrInput
	// ID of the sub-network which should be
	// added to the Server. Required if `networkId` is not set.
	// *Note*: if the `ip` property is missing, the Server is currently added
	// to the last created subnet.
	SubnetId pulumi.StringPtrInput
}

func (ServerNetworkState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverNetworkState)(nil)).Elem()
}

type serverNetworkArgs struct {
	// Additional IPs to be assigned
	// to this server.
	AliasIps []string `pulumi:"aliasIps"`
	// IP to request to be assigned to this server.
	// If you do not provide this then you will be auto assigned an IP
	// address.
	Ip *string `pulumi:"ip"`
	// ID of the network which should be added
	// to the server. Required if `subnetId` is not set. Successful creation
	// of the resource depends on the existence of a subnet in the Hetzner
	// Cloud Backend. Using `networkId` will not create an explicit
	// dependency between server and subnet. Therefore `dependsOn` may need
	// to be used. Alternatively the `subnetId` property can be used, which
	// will create an explicit dependency between `ServerNetwork` and
	// the existence of a subnet.
	NetworkId *int `pulumi:"networkId"`
	// ID of the server.
	ServerId int `pulumi:"serverId"`
	// ID of the sub-network which should be
	// added to the Server. Required if `networkId` is not set.
	// *Note*: if the `ip` property is missing, the Server is currently added
	// to the last created subnet.
	SubnetId *string `pulumi:"subnetId"`
}

// The set of arguments for constructing a ServerNetwork resource.
type ServerNetworkArgs struct {
	// Additional IPs to be assigned
	// to this server.
	AliasIps pulumi.StringArrayInput
	// IP to request to be assigned to this server.
	// If you do not provide this then you will be auto assigned an IP
	// address.
	Ip pulumi.StringPtrInput
	// ID of the network which should be added
	// to the server. Required if `subnetId` is not set. Successful creation
	// of the resource depends on the existence of a subnet in the Hetzner
	// Cloud Backend. Using `networkId` will not create an explicit
	// dependency between server and subnet. Therefore `dependsOn` may need
	// to be used. Alternatively the `subnetId` property can be used, which
	// will create an explicit dependency between `ServerNetwork` and
	// the existence of a subnet.
	NetworkId pulumi.IntPtrInput
	// ID of the server.
	ServerId pulumi.IntInput
	// ID of the sub-network which should be
	// added to the Server. Required if `networkId` is not set.
	// *Note*: if the `ip` property is missing, the Server is currently added
	// to the last created subnet.
	SubnetId pulumi.StringPtrInput
}

func (ServerNetworkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverNetworkArgs)(nil)).Elem()
}

type ServerNetworkInput interface {
	pulumi.Input

	ToServerNetworkOutput() ServerNetworkOutput
	ToServerNetworkOutputWithContext(ctx context.Context) ServerNetworkOutput
}

func (*ServerNetwork) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerNetwork)(nil)).Elem()
}

func (i *ServerNetwork) ToServerNetworkOutput() ServerNetworkOutput {
	return i.ToServerNetworkOutputWithContext(context.Background())
}

func (i *ServerNetwork) ToServerNetworkOutputWithContext(ctx context.Context) ServerNetworkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerNetworkOutput)
}

// ServerNetworkArrayInput is an input type that accepts ServerNetworkArray and ServerNetworkArrayOutput values.
// You can construct a concrete instance of `ServerNetworkArrayInput` via:
//
//          ServerNetworkArray{ ServerNetworkArgs{...} }
type ServerNetworkArrayInput interface {
	pulumi.Input

	ToServerNetworkArrayOutput() ServerNetworkArrayOutput
	ToServerNetworkArrayOutputWithContext(context.Context) ServerNetworkArrayOutput
}

type ServerNetworkArray []ServerNetworkInput

func (ServerNetworkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerNetwork)(nil)).Elem()
}

func (i ServerNetworkArray) ToServerNetworkArrayOutput() ServerNetworkArrayOutput {
	return i.ToServerNetworkArrayOutputWithContext(context.Background())
}

func (i ServerNetworkArray) ToServerNetworkArrayOutputWithContext(ctx context.Context) ServerNetworkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerNetworkArrayOutput)
}

// ServerNetworkMapInput is an input type that accepts ServerNetworkMap and ServerNetworkMapOutput values.
// You can construct a concrete instance of `ServerNetworkMapInput` via:
//
//          ServerNetworkMap{ "key": ServerNetworkArgs{...} }
type ServerNetworkMapInput interface {
	pulumi.Input

	ToServerNetworkMapOutput() ServerNetworkMapOutput
	ToServerNetworkMapOutputWithContext(context.Context) ServerNetworkMapOutput
}

type ServerNetworkMap map[string]ServerNetworkInput

func (ServerNetworkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerNetwork)(nil)).Elem()
}

func (i ServerNetworkMap) ToServerNetworkMapOutput() ServerNetworkMapOutput {
	return i.ToServerNetworkMapOutputWithContext(context.Background())
}

func (i ServerNetworkMap) ToServerNetworkMapOutputWithContext(ctx context.Context) ServerNetworkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerNetworkMapOutput)
}

type ServerNetworkOutput struct{ *pulumi.OutputState }

func (ServerNetworkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerNetwork)(nil)).Elem()
}

func (o ServerNetworkOutput) ToServerNetworkOutput() ServerNetworkOutput {
	return o
}

func (o ServerNetworkOutput) ToServerNetworkOutputWithContext(ctx context.Context) ServerNetworkOutput {
	return o
}

type ServerNetworkArrayOutput struct{ *pulumi.OutputState }

func (ServerNetworkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerNetwork)(nil)).Elem()
}

func (o ServerNetworkArrayOutput) ToServerNetworkArrayOutput() ServerNetworkArrayOutput {
	return o
}

func (o ServerNetworkArrayOutput) ToServerNetworkArrayOutputWithContext(ctx context.Context) ServerNetworkArrayOutput {
	return o
}

func (o ServerNetworkArrayOutput) Index(i pulumi.IntInput) ServerNetworkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServerNetwork {
		return vs[0].([]*ServerNetwork)[vs[1].(int)]
	}).(ServerNetworkOutput)
}

type ServerNetworkMapOutput struct{ *pulumi.OutputState }

func (ServerNetworkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerNetwork)(nil)).Elem()
}

func (o ServerNetworkMapOutput) ToServerNetworkMapOutput() ServerNetworkMapOutput {
	return o
}

func (o ServerNetworkMapOutput) ToServerNetworkMapOutputWithContext(ctx context.Context) ServerNetworkMapOutput {
	return o
}

func (o ServerNetworkMapOutput) MapIndex(k pulumi.StringInput) ServerNetworkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServerNetwork {
		return vs[0].(map[string]*ServerNetwork)[vs[1].(string)]
	}).(ServerNetworkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerNetworkInput)(nil)).Elem(), &ServerNetwork{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerNetworkArrayInput)(nil)).Elem(), ServerNetworkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerNetworkMapInput)(nil)).Elem(), ServerNetworkMap{})
	pulumi.RegisterOutputType(ServerNetworkOutput{})
	pulumi.RegisterOutputType(ServerNetworkArrayOutput{})
	pulumi.RegisterOutputType(ServerNetworkMapOutput{})
}
