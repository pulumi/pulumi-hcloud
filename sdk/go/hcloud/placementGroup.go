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

// Provides a Hetzner Cloud Placement Group to represent a Placement Group in the Hetzner Cloud.
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
//			_, err := hcloud.NewPlacementGroup(ctx, "my-placement-group", &hcloud.PlacementGroupArgs{
//				Name: pulumi.String("my-placement-group"),
//				Type: pulumi.String("spread"),
//				Labels: pulumi.StringMap{
//					"key": pulumi.String("value"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewServer(ctx, "node1", &hcloud.ServerArgs{
//				Name:             pulumi.String("node1"),
//				Image:            pulumi.String("debian-11"),
//				ServerType:       pulumi.String("cx22"),
//				PlacementGroupId: my_placement_group.ID(),
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
// Placement Groups can be imported using its `id`:
//
// ```sh
// $ pulumi import hcloud:index/placementGroup:PlacementGroup my-placement-group id
// ```
type PlacementGroup struct {
	pulumi.CustomResourceState

	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Name of the Placement Group.
	Name    pulumi.StringOutput   `pulumi:"name"`
	Servers pulumi.IntArrayOutput `pulumi:"servers"`
	// Type of the Placement Group.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewPlacementGroup registers a new resource with the given unique name, arguments, and options.
func NewPlacementGroup(ctx *pulumi.Context,
	name string, args *PlacementGroupArgs, opts ...pulumi.ResourceOption) (*PlacementGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PlacementGroup
	err := ctx.RegisterResource("hcloud:index/placementGroup:PlacementGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPlacementGroup gets an existing PlacementGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPlacementGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PlacementGroupState, opts ...pulumi.ResourceOption) (*PlacementGroup, error) {
	var resource PlacementGroup
	err := ctx.ReadResource("hcloud:index/placementGroup:PlacementGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PlacementGroup resources.
type placementGroupState struct {
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]string `pulumi:"labels"`
	// Name of the Placement Group.
	Name    *string `pulumi:"name"`
	Servers []int   `pulumi:"servers"`
	// Type of the Placement Group.
	Type *string `pulumi:"type"`
}

type PlacementGroupState struct {
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.StringMapInput
	// Name of the Placement Group.
	Name    pulumi.StringPtrInput
	Servers pulumi.IntArrayInput
	// Type of the Placement Group.
	Type pulumi.StringPtrInput
}

func (PlacementGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*placementGroupState)(nil)).Elem()
}

type placementGroupArgs struct {
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]string `pulumi:"labels"`
	// Name of the Placement Group.
	Name *string `pulumi:"name"`
	// Type of the Placement Group.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a PlacementGroup resource.
type PlacementGroupArgs struct {
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.StringMapInput
	// Name of the Placement Group.
	Name pulumi.StringPtrInput
	// Type of the Placement Group.
	Type pulumi.StringInput
}

func (PlacementGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*placementGroupArgs)(nil)).Elem()
}

type PlacementGroupInput interface {
	pulumi.Input

	ToPlacementGroupOutput() PlacementGroupOutput
	ToPlacementGroupOutputWithContext(ctx context.Context) PlacementGroupOutput
}

func (*PlacementGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**PlacementGroup)(nil)).Elem()
}

func (i *PlacementGroup) ToPlacementGroupOutput() PlacementGroupOutput {
	return i.ToPlacementGroupOutputWithContext(context.Background())
}

func (i *PlacementGroup) ToPlacementGroupOutputWithContext(ctx context.Context) PlacementGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlacementGroupOutput)
}

// PlacementGroupArrayInput is an input type that accepts PlacementGroupArray and PlacementGroupArrayOutput values.
// You can construct a concrete instance of `PlacementGroupArrayInput` via:
//
//	PlacementGroupArray{ PlacementGroupArgs{...} }
type PlacementGroupArrayInput interface {
	pulumi.Input

	ToPlacementGroupArrayOutput() PlacementGroupArrayOutput
	ToPlacementGroupArrayOutputWithContext(context.Context) PlacementGroupArrayOutput
}

type PlacementGroupArray []PlacementGroupInput

func (PlacementGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PlacementGroup)(nil)).Elem()
}

func (i PlacementGroupArray) ToPlacementGroupArrayOutput() PlacementGroupArrayOutput {
	return i.ToPlacementGroupArrayOutputWithContext(context.Background())
}

func (i PlacementGroupArray) ToPlacementGroupArrayOutputWithContext(ctx context.Context) PlacementGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlacementGroupArrayOutput)
}

// PlacementGroupMapInput is an input type that accepts PlacementGroupMap and PlacementGroupMapOutput values.
// You can construct a concrete instance of `PlacementGroupMapInput` via:
//
//	PlacementGroupMap{ "key": PlacementGroupArgs{...} }
type PlacementGroupMapInput interface {
	pulumi.Input

	ToPlacementGroupMapOutput() PlacementGroupMapOutput
	ToPlacementGroupMapOutputWithContext(context.Context) PlacementGroupMapOutput
}

type PlacementGroupMap map[string]PlacementGroupInput

func (PlacementGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PlacementGroup)(nil)).Elem()
}

func (i PlacementGroupMap) ToPlacementGroupMapOutput() PlacementGroupMapOutput {
	return i.ToPlacementGroupMapOutputWithContext(context.Background())
}

func (i PlacementGroupMap) ToPlacementGroupMapOutputWithContext(ctx context.Context) PlacementGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlacementGroupMapOutput)
}

type PlacementGroupOutput struct{ *pulumi.OutputState }

func (PlacementGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PlacementGroup)(nil)).Elem()
}

func (o PlacementGroupOutput) ToPlacementGroupOutput() PlacementGroupOutput {
	return o
}

func (o PlacementGroupOutput) ToPlacementGroupOutputWithContext(ctx context.Context) PlacementGroupOutput {
	return o
}

// User-defined labels (key-value pairs) should be created with.
func (o PlacementGroupOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PlacementGroup) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// Name of the Placement Group.
func (o PlacementGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PlacementGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o PlacementGroupOutput) Servers() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *PlacementGroup) pulumi.IntArrayOutput { return v.Servers }).(pulumi.IntArrayOutput)
}

// Type of the Placement Group.
func (o PlacementGroupOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *PlacementGroup) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type PlacementGroupArrayOutput struct{ *pulumi.OutputState }

func (PlacementGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PlacementGroup)(nil)).Elem()
}

func (o PlacementGroupArrayOutput) ToPlacementGroupArrayOutput() PlacementGroupArrayOutput {
	return o
}

func (o PlacementGroupArrayOutput) ToPlacementGroupArrayOutputWithContext(ctx context.Context) PlacementGroupArrayOutput {
	return o
}

func (o PlacementGroupArrayOutput) Index(i pulumi.IntInput) PlacementGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PlacementGroup {
		return vs[0].([]*PlacementGroup)[vs[1].(int)]
	}).(PlacementGroupOutput)
}

type PlacementGroupMapOutput struct{ *pulumi.OutputState }

func (PlacementGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PlacementGroup)(nil)).Elem()
}

func (o PlacementGroupMapOutput) ToPlacementGroupMapOutput() PlacementGroupMapOutput {
	return o
}

func (o PlacementGroupMapOutput) ToPlacementGroupMapOutputWithContext(ctx context.Context) PlacementGroupMapOutput {
	return o
}

func (o PlacementGroupMapOutput) MapIndex(k pulumi.StringInput) PlacementGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PlacementGroup {
		return vs[0].(map[string]*PlacementGroup)[vs[1].(string)]
	}).(PlacementGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PlacementGroupInput)(nil)).Elem(), &PlacementGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*PlacementGroupArrayInput)(nil)).Elem(), PlacementGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PlacementGroupMapInput)(nil)).Elem(), PlacementGroupMap{})
	pulumi.RegisterOutputType(PlacementGroupOutput{})
	pulumi.RegisterOutputType(PlacementGroupArrayOutput{})
	pulumi.RegisterOutputType(PlacementGroupMapOutput{})
}
