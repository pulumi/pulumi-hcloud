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

// Provides a Hetzner Cloud Load Balancer to represent a Load Balancer in the Hetzner Cloud.
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
//			myserver, err := hcloud.NewServer(ctx, "myserver", &hcloud.ServerArgs{
//				ServerType: pulumi.String("cx11"),
//				Image:      pulumi.String("ubuntu-18.04"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewLoadBalancer(ctx, "loadBalancer", &hcloud.LoadBalancerArgs{
//				LoadBalancerType: pulumi.String("lb11"),
//				Location:         pulumi.String("nbg1"),
//				Targets: hcloud.LoadBalancerTargetTypeArray{
//					&hcloud.LoadBalancerTargetTypeArgs{
//						Type:     pulumi.String("server"),
//						ServerId: myserver.ID(),
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
// Load Balancers can be imported using its `id`
//
// ```sh
//
//	$ pulumi import hcloud:index/loadBalancer:LoadBalancer my_load_balancer id
//
// ```
type LoadBalancer struct {
	pulumi.CustomResourceState

	// Configuration of the algorithm the Load Balancer use.
	Algorithm LoadBalancerAlgorithmOutput `pulumi:"algorithm"`
	// Enable or disable delete protection.
	DeleteProtection pulumi.BoolPtrOutput `pulumi:"deleteProtection"`
	// (string) IPv4 Address of the Load Balancer.
	Ipv4 pulumi.StringOutput `pulumi:"ipv4"`
	// (string) IPv6 Address of the Load Balancer.
	Ipv6 pulumi.StringOutput `pulumi:"ipv6"`
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Type of the Load Balancer.
	LoadBalancerType pulumi.StringOutput `pulumi:"loadBalancerType"`
	// The location name of the Load Balancer. Require when no networkZone is set.
	Location pulumi.StringOutput `pulumi:"location"`
	// Name of the Load Balancer.
	Name pulumi.StringOutput `pulumi:"name"`
	// (int) ID of the first private network that this Load Balancer is connected to.
	NetworkId pulumi.IntOutput `pulumi:"networkId"`
	// (string) IP of the Load Balancer in the first private network that it is connected to.
	NetworkIp pulumi.StringOutput `pulumi:"networkIp"`
	// The Network Zone of the Load Balancer. Require when no location is set.
	NetworkZone pulumi.StringOutput `pulumi:"networkZone"`
	// Deprecated: Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets.
	Targets LoadBalancerTargetTypeArrayOutput `pulumi:"targets"`
}

// NewLoadBalancer registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancer(ctx *pulumi.Context,
	name string, args *LoadBalancerArgs, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LoadBalancerType == nil {
		return nil, errors.New("invalid value for required argument 'LoadBalancerType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoadBalancer
	err := ctx.RegisterResource("hcloud:index/loadBalancer:LoadBalancer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancer gets an existing LoadBalancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerState, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	var resource LoadBalancer
	err := ctx.ReadResource("hcloud:index/loadBalancer:LoadBalancer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancer resources.
type loadBalancerState struct {
	// Configuration of the algorithm the Load Balancer use.
	Algorithm *LoadBalancerAlgorithm `pulumi:"algorithm"`
	// Enable or disable delete protection.
	DeleteProtection *bool `pulumi:"deleteProtection"`
	// (string) IPv4 Address of the Load Balancer.
	Ipv4 *string `pulumi:"ipv4"`
	// (string) IPv6 Address of the Load Balancer.
	Ipv6 *string `pulumi:"ipv6"`
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]interface{} `pulumi:"labels"`
	// Type of the Load Balancer.
	LoadBalancerType *string `pulumi:"loadBalancerType"`
	// The location name of the Load Balancer. Require when no networkZone is set.
	Location *string `pulumi:"location"`
	// Name of the Load Balancer.
	Name *string `pulumi:"name"`
	// (int) ID of the first private network that this Load Balancer is connected to.
	NetworkId *int `pulumi:"networkId"`
	// (string) IP of the Load Balancer in the first private network that it is connected to.
	NetworkIp *string `pulumi:"networkIp"`
	// The Network Zone of the Load Balancer. Require when no location is set.
	NetworkZone *string `pulumi:"networkZone"`
	// Deprecated: Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets.
	Targets []LoadBalancerTargetType `pulumi:"targets"`
}

type LoadBalancerState struct {
	// Configuration of the algorithm the Load Balancer use.
	Algorithm LoadBalancerAlgorithmPtrInput
	// Enable or disable delete protection.
	DeleteProtection pulumi.BoolPtrInput
	// (string) IPv4 Address of the Load Balancer.
	Ipv4 pulumi.StringPtrInput
	// (string) IPv6 Address of the Load Balancer.
	Ipv6 pulumi.StringPtrInput
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.MapInput
	// Type of the Load Balancer.
	LoadBalancerType pulumi.StringPtrInput
	// The location name of the Load Balancer. Require when no networkZone is set.
	Location pulumi.StringPtrInput
	// Name of the Load Balancer.
	Name pulumi.StringPtrInput
	// (int) ID of the first private network that this Load Balancer is connected to.
	NetworkId pulumi.IntPtrInput
	// (string) IP of the Load Balancer in the first private network that it is connected to.
	NetworkIp pulumi.StringPtrInput
	// The Network Zone of the Load Balancer. Require when no location is set.
	NetworkZone pulumi.StringPtrInput
	// Deprecated: Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets.
	Targets LoadBalancerTargetTypeArrayInput
}

func (LoadBalancerState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerState)(nil)).Elem()
}

type loadBalancerArgs struct {
	// Configuration of the algorithm the Load Balancer use.
	Algorithm *LoadBalancerAlgorithm `pulumi:"algorithm"`
	// Enable or disable delete protection.
	DeleteProtection *bool `pulumi:"deleteProtection"`
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]interface{} `pulumi:"labels"`
	// Type of the Load Balancer.
	LoadBalancerType string `pulumi:"loadBalancerType"`
	// The location name of the Load Balancer. Require when no networkZone is set.
	Location *string `pulumi:"location"`
	// Name of the Load Balancer.
	Name *string `pulumi:"name"`
	// The Network Zone of the Load Balancer. Require when no location is set.
	NetworkZone *string `pulumi:"networkZone"`
	// Deprecated: Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets.
	Targets []LoadBalancerTargetType `pulumi:"targets"`
}

// The set of arguments for constructing a LoadBalancer resource.
type LoadBalancerArgs struct {
	// Configuration of the algorithm the Load Balancer use.
	Algorithm LoadBalancerAlgorithmPtrInput
	// Enable or disable delete protection.
	DeleteProtection pulumi.BoolPtrInput
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.MapInput
	// Type of the Load Balancer.
	LoadBalancerType pulumi.StringInput
	// The location name of the Load Balancer. Require when no networkZone is set.
	Location pulumi.StringPtrInput
	// Name of the Load Balancer.
	Name pulumi.StringPtrInput
	// The Network Zone of the Load Balancer. Require when no location is set.
	NetworkZone pulumi.StringPtrInput
	// Deprecated: Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets.
	Targets LoadBalancerTargetTypeArrayInput
}

func (LoadBalancerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerArgs)(nil)).Elem()
}

type LoadBalancerInput interface {
	pulumi.Input

	ToLoadBalancerOutput() LoadBalancerOutput
	ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput
}

func (*LoadBalancer) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancer)(nil)).Elem()
}

func (i *LoadBalancer) ToLoadBalancerOutput() LoadBalancerOutput {
	return i.ToLoadBalancerOutputWithContext(context.Background())
}

func (i *LoadBalancer) ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerOutput)
}

// LoadBalancerArrayInput is an input type that accepts LoadBalancerArray and LoadBalancerArrayOutput values.
// You can construct a concrete instance of `LoadBalancerArrayInput` via:
//
//	LoadBalancerArray{ LoadBalancerArgs{...} }
type LoadBalancerArrayInput interface {
	pulumi.Input

	ToLoadBalancerArrayOutput() LoadBalancerArrayOutput
	ToLoadBalancerArrayOutputWithContext(context.Context) LoadBalancerArrayOutput
}

type LoadBalancerArray []LoadBalancerInput

func (LoadBalancerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadBalancer)(nil)).Elem()
}

func (i LoadBalancerArray) ToLoadBalancerArrayOutput() LoadBalancerArrayOutput {
	return i.ToLoadBalancerArrayOutputWithContext(context.Background())
}

func (i LoadBalancerArray) ToLoadBalancerArrayOutputWithContext(ctx context.Context) LoadBalancerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerArrayOutput)
}

// LoadBalancerMapInput is an input type that accepts LoadBalancerMap and LoadBalancerMapOutput values.
// You can construct a concrete instance of `LoadBalancerMapInput` via:
//
//	LoadBalancerMap{ "key": LoadBalancerArgs{...} }
type LoadBalancerMapInput interface {
	pulumi.Input

	ToLoadBalancerMapOutput() LoadBalancerMapOutput
	ToLoadBalancerMapOutputWithContext(context.Context) LoadBalancerMapOutput
}

type LoadBalancerMap map[string]LoadBalancerInput

func (LoadBalancerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadBalancer)(nil)).Elem()
}

func (i LoadBalancerMap) ToLoadBalancerMapOutput() LoadBalancerMapOutput {
	return i.ToLoadBalancerMapOutputWithContext(context.Background())
}

func (i LoadBalancerMap) ToLoadBalancerMapOutputWithContext(ctx context.Context) LoadBalancerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerMapOutput)
}

type LoadBalancerOutput struct{ *pulumi.OutputState }

func (LoadBalancerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancer)(nil)).Elem()
}

func (o LoadBalancerOutput) ToLoadBalancerOutput() LoadBalancerOutput {
	return o
}

func (o LoadBalancerOutput) ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput {
	return o
}

// Configuration of the algorithm the Load Balancer use.
func (o LoadBalancerOutput) Algorithm() LoadBalancerAlgorithmOutput {
	return o.ApplyT(func(v *LoadBalancer) LoadBalancerAlgorithmOutput { return v.Algorithm }).(LoadBalancerAlgorithmOutput)
}

// Enable or disable delete protection.
func (o LoadBalancerOutput) DeleteProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.BoolPtrOutput { return v.DeleteProtection }).(pulumi.BoolPtrOutput)
}

// (string) IPv4 Address of the Load Balancer.
func (o LoadBalancerOutput) Ipv4() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.Ipv4 }).(pulumi.StringOutput)
}

// (string) IPv6 Address of the Load Balancer.
func (o LoadBalancerOutput) Ipv6() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.Ipv6 }).(pulumi.StringOutput)
}

// User-defined labels (key-value pairs) should be created with.
func (o LoadBalancerOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Type of the Load Balancer.
func (o LoadBalancerOutput) LoadBalancerType() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.LoadBalancerType }).(pulumi.StringOutput)
}

// The location name of the Load Balancer. Require when no networkZone is set.
func (o LoadBalancerOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Name of the Load Balancer.
func (o LoadBalancerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (int) ID of the first private network that this Load Balancer is connected to.
func (o LoadBalancerOutput) NetworkId() pulumi.IntOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.IntOutput { return v.NetworkId }).(pulumi.IntOutput)
}

// (string) IP of the Load Balancer in the first private network that it is connected to.
func (o LoadBalancerOutput) NetworkIp() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.NetworkIp }).(pulumi.StringOutput)
}

// The Network Zone of the Load Balancer. Require when no location is set.
func (o LoadBalancerOutput) NetworkZone() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancer) pulumi.StringOutput { return v.NetworkZone }).(pulumi.StringOutput)
}

// Deprecated: Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets.
func (o LoadBalancerOutput) Targets() LoadBalancerTargetTypeArrayOutput {
	return o.ApplyT(func(v *LoadBalancer) LoadBalancerTargetTypeArrayOutput { return v.Targets }).(LoadBalancerTargetTypeArrayOutput)
}

type LoadBalancerArrayOutput struct{ *pulumi.OutputState }

func (LoadBalancerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadBalancer)(nil)).Elem()
}

func (o LoadBalancerArrayOutput) ToLoadBalancerArrayOutput() LoadBalancerArrayOutput {
	return o
}

func (o LoadBalancerArrayOutput) ToLoadBalancerArrayOutputWithContext(ctx context.Context) LoadBalancerArrayOutput {
	return o
}

func (o LoadBalancerArrayOutput) Index(i pulumi.IntInput) LoadBalancerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoadBalancer {
		return vs[0].([]*LoadBalancer)[vs[1].(int)]
	}).(LoadBalancerOutput)
}

type LoadBalancerMapOutput struct{ *pulumi.OutputState }

func (LoadBalancerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadBalancer)(nil)).Elem()
}

func (o LoadBalancerMapOutput) ToLoadBalancerMapOutput() LoadBalancerMapOutput {
	return o
}

func (o LoadBalancerMapOutput) ToLoadBalancerMapOutputWithContext(ctx context.Context) LoadBalancerMapOutput {
	return o
}

func (o LoadBalancerMapOutput) MapIndex(k pulumi.StringInput) LoadBalancerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoadBalancer {
		return vs[0].(map[string]*LoadBalancer)[vs[1].(string)]
	}).(LoadBalancerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerInput)(nil)).Elem(), &LoadBalancer{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerArrayInput)(nil)).Elem(), LoadBalancerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerMapInput)(nil)).Elem(), LoadBalancerMap{})
	pulumi.RegisterOutputType(LoadBalancerOutput{})
	pulumi.RegisterOutputType(LoadBalancerArrayOutput{})
	pulumi.RegisterOutputType(LoadBalancerMapOutput{})
}
