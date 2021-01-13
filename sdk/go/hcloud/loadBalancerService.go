// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Define services for Hetzner Cloud Load Balancers.
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
// 		_, err := hcloud.NewLoadBalancer(ctx, "loadBalancer", &hcloud.LoadBalancerArgs{
// 			LoadBalancerType: pulumi.String("lb11"),
// 			Location:         pulumi.String("nbg1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hcloud.NewLoadBalancerService(ctx, "loadBalancerService", &hcloud.LoadBalancerServiceArgs{
// 			LoadBalancerId: pulumi.Any(hcloud_load_balancer.Test_load_balancer.Id),
// 			Protocol:       pulumi.String("http"),
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
// Load Balancer Service entries can be imported using a compound ID with the following format`<load-balancer-id>__<listen-port>`
//
// ```sh
//  $ pulumi import hcloud:index/loadBalancerService:LoadBalancerService myloadbalancernetwork 123__80
// ```
type LoadBalancerService struct {
	pulumi.CustomResourceState

	// Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
	DestinationPort pulumi.IntOutput `pulumi:"destinationPort"`
	// List of health check configurations when `protocol` is `http` or `https`.
	HealthCheck LoadBalancerServiceHealthCheckOutput `pulumi:"healthCheck"`
	// List of http configurations when `protocol` is `http` or `https`.
	Http LoadBalancerServiceHttpOutput `pulumi:"http"`
	// Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
	ListenPort pulumi.IntOutput `pulumi:"listenPort"`
	// Id of the load balancer this service belongs to.
	LoadBalancerId pulumi.StringOutput `pulumi:"loadBalancerId"`
	// Protocol of the service. `http`, `https` or `tcp`
	Protocol pulumi.StringOutput `pulumi:"protocol"`
	// Enable proxyprotocol.
	Proxyprotocol pulumi.BoolOutput `pulumi:"proxyprotocol"`
}

// NewLoadBalancerService registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancerService(ctx *pulumi.Context,
	name string, args *LoadBalancerServiceArgs, opts ...pulumi.ResourceOption) (*LoadBalancerService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LoadBalancerId == nil {
		return nil, errors.New("invalid value for required argument 'LoadBalancerId'")
	}
	if args.Protocol == nil {
		return nil, errors.New("invalid value for required argument 'Protocol'")
	}
	var resource LoadBalancerService
	err := ctx.RegisterResource("hcloud:index/loadBalancerService:LoadBalancerService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancerService gets an existing LoadBalancerService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancerService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerServiceState, opts ...pulumi.ResourceOption) (*LoadBalancerService, error) {
	var resource LoadBalancerService
	err := ctx.ReadResource("hcloud:index/loadBalancerService:LoadBalancerService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancerService resources.
type loadBalancerServiceState struct {
	// Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
	DestinationPort *int `pulumi:"destinationPort"`
	// List of health check configurations when `protocol` is `http` or `https`.
	HealthCheck *LoadBalancerServiceHealthCheck `pulumi:"healthCheck"`
	// List of http configurations when `protocol` is `http` or `https`.
	Http *LoadBalancerServiceHttp `pulumi:"http"`
	// Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
	ListenPort *int `pulumi:"listenPort"`
	// Id of the load balancer this service belongs to.
	LoadBalancerId *string `pulumi:"loadBalancerId"`
	// Protocol of the service. `http`, `https` or `tcp`
	Protocol *string `pulumi:"protocol"`
	// Enable proxyprotocol.
	Proxyprotocol *bool `pulumi:"proxyprotocol"`
}

type LoadBalancerServiceState struct {
	// Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
	DestinationPort pulumi.IntPtrInput
	// List of health check configurations when `protocol` is `http` or `https`.
	HealthCheck LoadBalancerServiceHealthCheckPtrInput
	// List of http configurations when `protocol` is `http` or `https`.
	Http LoadBalancerServiceHttpPtrInput
	// Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
	ListenPort pulumi.IntPtrInput
	// Id of the load balancer this service belongs to.
	LoadBalancerId pulumi.StringPtrInput
	// Protocol of the service. `http`, `https` or `tcp`
	Protocol pulumi.StringPtrInput
	// Enable proxyprotocol.
	Proxyprotocol pulumi.BoolPtrInput
}

func (LoadBalancerServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerServiceState)(nil)).Elem()
}

type loadBalancerServiceArgs struct {
	// Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
	DestinationPort *int `pulumi:"destinationPort"`
	// List of health check configurations when `protocol` is `http` or `https`.
	HealthCheck *LoadBalancerServiceHealthCheck `pulumi:"healthCheck"`
	// List of http configurations when `protocol` is `http` or `https`.
	Http *LoadBalancerServiceHttp `pulumi:"http"`
	// Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
	ListenPort *int `pulumi:"listenPort"`
	// Id of the load balancer this service belongs to.
	LoadBalancerId string `pulumi:"loadBalancerId"`
	// Protocol of the service. `http`, `https` or `tcp`
	Protocol string `pulumi:"protocol"`
	// Enable proxyprotocol.
	Proxyprotocol *bool `pulumi:"proxyprotocol"`
}

// The set of arguments for constructing a LoadBalancerService resource.
type LoadBalancerServiceArgs struct {
	// Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
	DestinationPort pulumi.IntPtrInput
	// List of health check configurations when `protocol` is `http` or `https`.
	HealthCheck LoadBalancerServiceHealthCheckPtrInput
	// List of http configurations when `protocol` is `http` or `https`.
	Http LoadBalancerServiceHttpPtrInput
	// Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
	ListenPort pulumi.IntPtrInput
	// Id of the load balancer this service belongs to.
	LoadBalancerId pulumi.StringInput
	// Protocol of the service. `http`, `https` or `tcp`
	Protocol pulumi.StringInput
	// Enable proxyprotocol.
	Proxyprotocol pulumi.BoolPtrInput
}

func (LoadBalancerServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerServiceArgs)(nil)).Elem()
}

type LoadBalancerServiceInput interface {
	pulumi.Input

	ToLoadBalancerServiceOutput() LoadBalancerServiceOutput
	ToLoadBalancerServiceOutputWithContext(ctx context.Context) LoadBalancerServiceOutput
}

func (LoadBalancerService) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadBalancerService)(nil)).Elem()
}

func (i LoadBalancerService) ToLoadBalancerServiceOutput() LoadBalancerServiceOutput {
	return i.ToLoadBalancerServiceOutputWithContext(context.Background())
}

func (i LoadBalancerService) ToLoadBalancerServiceOutputWithContext(ctx context.Context) LoadBalancerServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerServiceOutput)
}

type LoadBalancerServiceOutput struct {
	*pulumi.OutputState
}

func (LoadBalancerServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadBalancerServiceOutput)(nil)).Elem()
}

func (o LoadBalancerServiceOutput) ToLoadBalancerServiceOutput() LoadBalancerServiceOutput {
	return o
}

func (o LoadBalancerServiceOutput) ToLoadBalancerServiceOutputWithContext(ctx context.Context) LoadBalancerServiceOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(LoadBalancerServiceOutput{})
}
