// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type PlacementGroup struct {
	pulumi.CustomResourceState

	Labels  pulumi.MapOutput      `pulumi:"labels"`
	Name    pulumi.StringOutput   `pulumi:"name"`
	Servers pulumi.IntArrayOutput `pulumi:"servers"`
	Type    pulumi.StringOutput   `pulumi:"type"`
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
	Labels  map[string]interface{} `pulumi:"labels"`
	Name    *string                `pulumi:"name"`
	Servers []int                  `pulumi:"servers"`
	Type    *string                `pulumi:"type"`
}

type PlacementGroupState struct {
	Labels  pulumi.MapInput
	Name    pulumi.StringPtrInput
	Servers pulumi.IntArrayInput
	Type    pulumi.StringPtrInput
}

func (PlacementGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*placementGroupState)(nil)).Elem()
}

type placementGroupArgs struct {
	Labels map[string]interface{} `pulumi:"labels"`
	Name   *string                `pulumi:"name"`
	Type   string                 `pulumi:"type"`
}

// The set of arguments for constructing a PlacementGroup resource.
type PlacementGroupArgs struct {
	Labels pulumi.MapInput
	Name   pulumi.StringPtrInput
	Type   pulumi.StringInput
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
	return reflect.TypeOf((*PlacementGroup)(nil))
}

func (i *PlacementGroup) ToPlacementGroupOutput() PlacementGroupOutput {
	return i.ToPlacementGroupOutputWithContext(context.Background())
}

func (i *PlacementGroup) ToPlacementGroupOutputWithContext(ctx context.Context) PlacementGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlacementGroupOutput)
}

func (i *PlacementGroup) ToPlacementGroupPtrOutput() PlacementGroupPtrOutput {
	return i.ToPlacementGroupPtrOutputWithContext(context.Background())
}

func (i *PlacementGroup) ToPlacementGroupPtrOutputWithContext(ctx context.Context) PlacementGroupPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlacementGroupPtrOutput)
}

type PlacementGroupPtrInput interface {
	pulumi.Input

	ToPlacementGroupPtrOutput() PlacementGroupPtrOutput
	ToPlacementGroupPtrOutputWithContext(ctx context.Context) PlacementGroupPtrOutput
}

type placementGroupPtrType PlacementGroupArgs

func (*placementGroupPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**PlacementGroup)(nil))
}

func (i *placementGroupPtrType) ToPlacementGroupPtrOutput() PlacementGroupPtrOutput {
	return i.ToPlacementGroupPtrOutputWithContext(context.Background())
}

func (i *placementGroupPtrType) ToPlacementGroupPtrOutputWithContext(ctx context.Context) PlacementGroupPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlacementGroupPtrOutput)
}

// PlacementGroupArrayInput is an input type that accepts PlacementGroupArray and PlacementGroupArrayOutput values.
// You can construct a concrete instance of `PlacementGroupArrayInput` via:
//
//          PlacementGroupArray{ PlacementGroupArgs{...} }
type PlacementGroupArrayInput interface {
	pulumi.Input

	ToPlacementGroupArrayOutput() PlacementGroupArrayOutput
	ToPlacementGroupArrayOutputWithContext(context.Context) PlacementGroupArrayOutput
}

type PlacementGroupArray []PlacementGroupInput

func (PlacementGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*PlacementGroup)(nil))
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
//          PlacementGroupMap{ "key": PlacementGroupArgs{...} }
type PlacementGroupMapInput interface {
	pulumi.Input

	ToPlacementGroupMapOutput() PlacementGroupMapOutput
	ToPlacementGroupMapOutputWithContext(context.Context) PlacementGroupMapOutput
}

type PlacementGroupMap map[string]PlacementGroupInput

func (PlacementGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*PlacementGroup)(nil))
}

func (i PlacementGroupMap) ToPlacementGroupMapOutput() PlacementGroupMapOutput {
	return i.ToPlacementGroupMapOutputWithContext(context.Background())
}

func (i PlacementGroupMap) ToPlacementGroupMapOutputWithContext(ctx context.Context) PlacementGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlacementGroupMapOutput)
}

type PlacementGroupOutput struct {
	*pulumi.OutputState
}

func (PlacementGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PlacementGroup)(nil))
}

func (o PlacementGroupOutput) ToPlacementGroupOutput() PlacementGroupOutput {
	return o
}

func (o PlacementGroupOutput) ToPlacementGroupOutputWithContext(ctx context.Context) PlacementGroupOutput {
	return o
}

func (o PlacementGroupOutput) ToPlacementGroupPtrOutput() PlacementGroupPtrOutput {
	return o.ToPlacementGroupPtrOutputWithContext(context.Background())
}

func (o PlacementGroupOutput) ToPlacementGroupPtrOutputWithContext(ctx context.Context) PlacementGroupPtrOutput {
	return o.ApplyT(func(v PlacementGroup) *PlacementGroup {
		return &v
	}).(PlacementGroupPtrOutput)
}

type PlacementGroupPtrOutput struct {
	*pulumi.OutputState
}

func (PlacementGroupPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PlacementGroup)(nil))
}

func (o PlacementGroupPtrOutput) ToPlacementGroupPtrOutput() PlacementGroupPtrOutput {
	return o
}

func (o PlacementGroupPtrOutput) ToPlacementGroupPtrOutputWithContext(ctx context.Context) PlacementGroupPtrOutput {
	return o
}

type PlacementGroupArrayOutput struct{ *pulumi.OutputState }

func (PlacementGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]PlacementGroup)(nil))
}

func (o PlacementGroupArrayOutput) ToPlacementGroupArrayOutput() PlacementGroupArrayOutput {
	return o
}

func (o PlacementGroupArrayOutput) ToPlacementGroupArrayOutputWithContext(ctx context.Context) PlacementGroupArrayOutput {
	return o
}

func (o PlacementGroupArrayOutput) Index(i pulumi.IntInput) PlacementGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) PlacementGroup {
		return vs[0].([]PlacementGroup)[vs[1].(int)]
	}).(PlacementGroupOutput)
}

type PlacementGroupMapOutput struct{ *pulumi.OutputState }

func (PlacementGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]PlacementGroup)(nil))
}

func (o PlacementGroupMapOutput) ToPlacementGroupMapOutput() PlacementGroupMapOutput {
	return o
}

func (o PlacementGroupMapOutput) ToPlacementGroupMapOutputWithContext(ctx context.Context) PlacementGroupMapOutput {
	return o
}

func (o PlacementGroupMapOutput) MapIndex(k pulumi.StringInput) PlacementGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) PlacementGroup {
		return vs[0].(map[string]PlacementGroup)[vs[1].(string)]
	}).(PlacementGroupOutput)
}

func init() {
	pulumi.RegisterOutputType(PlacementGroupOutput{})
	pulumi.RegisterOutputType(PlacementGroupPtrOutput{})
	pulumi.RegisterOutputType(PlacementGroupArrayOutput{})
	pulumi.RegisterOutputType(PlacementGroupMapOutput{})
}
