// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Adds a target to a Hetzner Cloud Load Balancer.
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
// 		myServer, err := hcloud.NewServer(ctx, "myServer", &hcloud.ServerArgs{
// 			ServerType: pulumi.String("cx11"),
// 			Image:      pulumi.String("ubuntu-18.04"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		loadBalancer, err := hcloud.NewLoadBalancer(ctx, "loadBalancer", &hcloud.LoadBalancerArgs{
// 			LoadBalancerType: pulumi.String("lb11"),
// 			Location:         pulumi.String("nbg1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hcloud.NewLoadBalancerTarget(ctx, "loadBalancerTarget", &hcloud.LoadBalancerTargetArgs{
// 			Type:           pulumi.String("server"),
// 			LoadBalancerId: loadBalancer.ID(),
// 			ServerId:       myServer.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type LoadBalancerTarget struct {
	pulumi.CustomResourceState

	// IP address for an IP Target. Required if
	// `type` is `ip`.
	Ip pulumi.StringPtrOutput `pulumi:"ip"`
	// Label Selector selecting targets
	// for this Load Balancer. Required if `type` is `labelSelector`.
	LabelSelector pulumi.StringPtrOutput `pulumi:"labelSelector"`
	// ID of the Load Balancer to which
	// the target gets attached.
	LoadBalancerId pulumi.IntOutput `pulumi:"loadBalancerId"`
	// ID of the server which should be a
	// target for this Load Balancer. Required if `type` is `server`
	ServerId pulumi.IntPtrOutput `pulumi:"serverId"`
	// Type of the target. Possible values
	// `server`, `labelSelector`, `ip`.
	Type pulumi.StringOutput `pulumi:"type"`
	// use the private IP to connect to
	// Load Balancer targets. Only allowed if type is `server` or
	// `labelSelector`.
	UsePrivateIp pulumi.BoolOutput `pulumi:"usePrivateIp"`
}

// NewLoadBalancerTarget registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancerTarget(ctx *pulumi.Context,
	name string, args *LoadBalancerTargetArgs, opts ...pulumi.ResourceOption) (*LoadBalancerTarget, error) {
	if args == nil || args.LoadBalancerId == nil {
		return nil, errors.New("missing required argument 'LoadBalancerId'")
	}
	if args == nil || args.Type == nil {
		return nil, errors.New("missing required argument 'Type'")
	}
	if args == nil {
		args = &LoadBalancerTargetArgs{}
	}
	var resource LoadBalancerTarget
	err := ctx.RegisterResource("hcloud:index/loadBalancerTarget:LoadBalancerTarget", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancerTarget gets an existing LoadBalancerTarget resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancerTarget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerTargetState, opts ...pulumi.ResourceOption) (*LoadBalancerTarget, error) {
	var resource LoadBalancerTarget
	err := ctx.ReadResource("hcloud:index/loadBalancerTarget:LoadBalancerTarget", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancerTarget resources.
type loadBalancerTargetState struct {
	// IP address for an IP Target. Required if
	// `type` is `ip`.
	Ip *string `pulumi:"ip"`
	// Label Selector selecting targets
	// for this Load Balancer. Required if `type` is `labelSelector`.
	LabelSelector *string `pulumi:"labelSelector"`
	// ID of the Load Balancer to which
	// the target gets attached.
	LoadBalancerId *int `pulumi:"loadBalancerId"`
	// ID of the server which should be a
	// target for this Load Balancer. Required if `type` is `server`
	ServerId *int `pulumi:"serverId"`
	// Type of the target. Possible values
	// `server`, `labelSelector`, `ip`.
	Type *string `pulumi:"type"`
	// use the private IP to connect to
	// Load Balancer targets. Only allowed if type is `server` or
	// `labelSelector`.
	UsePrivateIp *bool `pulumi:"usePrivateIp"`
}

type LoadBalancerTargetState struct {
	// IP address for an IP Target. Required if
	// `type` is `ip`.
	Ip pulumi.StringPtrInput
	// Label Selector selecting targets
	// for this Load Balancer. Required if `type` is `labelSelector`.
	LabelSelector pulumi.StringPtrInput
	// ID of the Load Balancer to which
	// the target gets attached.
	LoadBalancerId pulumi.IntPtrInput
	// ID of the server which should be a
	// target for this Load Balancer. Required if `type` is `server`
	ServerId pulumi.IntPtrInput
	// Type of the target. Possible values
	// `server`, `labelSelector`, `ip`.
	Type pulumi.StringPtrInput
	// use the private IP to connect to
	// Load Balancer targets. Only allowed if type is `server` or
	// `labelSelector`.
	UsePrivateIp pulumi.BoolPtrInput
}

func (LoadBalancerTargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerTargetState)(nil)).Elem()
}

type loadBalancerTargetArgs struct {
	// IP address for an IP Target. Required if
	// `type` is `ip`.
	Ip *string `pulumi:"ip"`
	// Label Selector selecting targets
	// for this Load Balancer. Required if `type` is `labelSelector`.
	LabelSelector *string `pulumi:"labelSelector"`
	// ID of the Load Balancer to which
	// the target gets attached.
	LoadBalancerId int `pulumi:"loadBalancerId"`
	// ID of the server which should be a
	// target for this Load Balancer. Required if `type` is `server`
	ServerId *int `pulumi:"serverId"`
	// Type of the target. Possible values
	// `server`, `labelSelector`, `ip`.
	Type string `pulumi:"type"`
	// use the private IP to connect to
	// Load Balancer targets. Only allowed if type is `server` or
	// `labelSelector`.
	UsePrivateIp *bool `pulumi:"usePrivateIp"`
}

// The set of arguments for constructing a LoadBalancerTarget resource.
type LoadBalancerTargetArgs struct {
	// IP address for an IP Target. Required if
	// `type` is `ip`.
	Ip pulumi.StringPtrInput
	// Label Selector selecting targets
	// for this Load Balancer. Required if `type` is `labelSelector`.
	LabelSelector pulumi.StringPtrInput
	// ID of the Load Balancer to which
	// the target gets attached.
	LoadBalancerId pulumi.IntInput
	// ID of the server which should be a
	// target for this Load Balancer. Required if `type` is `server`
	ServerId pulumi.IntPtrInput
	// Type of the target. Possible values
	// `server`, `labelSelector`, `ip`.
	Type pulumi.StringInput
	// use the private IP to connect to
	// Load Balancer targets. Only allowed if type is `server` or
	// `labelSelector`.
	UsePrivateIp pulumi.BoolPtrInput
}

func (LoadBalancerTargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerTargetArgs)(nil)).Elem()
}
