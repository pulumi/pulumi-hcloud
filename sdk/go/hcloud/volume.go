// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Hetzner Cloud volume resource to manage volumes.
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
// 		_, err = hcloud.NewVolume(ctx, "master", &hcloud.VolumeArgs{
// 			Size:      pulumi.Int(50),
// 			ServerId:  node1.ID(),
// 			Automount: pulumi.Bool(true),
// 			Format:    pulumi.String("ext4"),
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
// Volumes can be imported using their `id`
//
// ```sh
//  $ pulumi import hcloud:index/volume:Volume myvolume <id>
// ```
type Volume struct {
	pulumi.CustomResourceState

	// Automount the volume upon attaching it (server_id must be provided).
	Automount pulumi.BoolPtrOutput `pulumi:"automount"`
	// Enable or disable delete protection.
	DeleteProtection pulumi.BoolPtrOutput `pulumi:"deleteProtection"`
	// Format volume after creation. `xfs` or `ext4`
	Format pulumi.StringPtrOutput `pulumi:"format"`
	// (map) User-defined labels (key-value pairs).
	Labels pulumi.MapOutput `pulumi:"labels"`
	// (string) Device path on the file system for the Volume.
	LinuxDevice pulumi.StringOutput `pulumi:"linuxDevice"`
	// Location of the volume to create, not allowed if serverId argument is passed.
	Location pulumi.StringOutput `pulumi:"location"`
	// Name of the volume to create (must be unique per project).
	Name pulumi.StringOutput `pulumi:"name"`
	// Server to attach the Volume to, not allowed if location argument is passed.
	ServerId pulumi.IntOutput `pulumi:"serverId"`
	// Size of the volume (in GB).
	Size pulumi.IntOutput `pulumi:"size"`
}

// NewVolume registers a new resource with the given unique name, arguments, and options.
func NewVolume(ctx *pulumi.Context,
	name string, args *VolumeArgs, opts ...pulumi.ResourceOption) (*Volume, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Size == nil {
		return nil, errors.New("invalid value for required argument 'Size'")
	}
	var resource Volume
	err := ctx.RegisterResource("hcloud:index/volume:Volume", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVolume gets an existing Volume resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVolume(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VolumeState, opts ...pulumi.ResourceOption) (*Volume, error) {
	var resource Volume
	err := ctx.ReadResource("hcloud:index/volume:Volume", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Volume resources.
type volumeState struct {
	// Automount the volume upon attaching it (server_id must be provided).
	Automount *bool `pulumi:"automount"`
	// Enable or disable delete protection.
	DeleteProtection *bool `pulumi:"deleteProtection"`
	// Format volume after creation. `xfs` or `ext4`
	Format *string `pulumi:"format"`
	// (map) User-defined labels (key-value pairs).
	Labels map[string]interface{} `pulumi:"labels"`
	// (string) Device path on the file system for the Volume.
	LinuxDevice *string `pulumi:"linuxDevice"`
	// Location of the volume to create, not allowed if serverId argument is passed.
	Location *string `pulumi:"location"`
	// Name of the volume to create (must be unique per project).
	Name *string `pulumi:"name"`
	// Server to attach the Volume to, not allowed if location argument is passed.
	ServerId *int `pulumi:"serverId"`
	// Size of the volume (in GB).
	Size *int `pulumi:"size"`
}

type VolumeState struct {
	// Automount the volume upon attaching it (server_id must be provided).
	Automount pulumi.BoolPtrInput
	// Enable or disable delete protection.
	DeleteProtection pulumi.BoolPtrInput
	// Format volume after creation. `xfs` or `ext4`
	Format pulumi.StringPtrInput
	// (map) User-defined labels (key-value pairs).
	Labels pulumi.MapInput
	// (string) Device path on the file system for the Volume.
	LinuxDevice pulumi.StringPtrInput
	// Location of the volume to create, not allowed if serverId argument is passed.
	Location pulumi.StringPtrInput
	// Name of the volume to create (must be unique per project).
	Name pulumi.StringPtrInput
	// Server to attach the Volume to, not allowed if location argument is passed.
	ServerId pulumi.IntPtrInput
	// Size of the volume (in GB).
	Size pulumi.IntPtrInput
}

func (VolumeState) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeState)(nil)).Elem()
}

type volumeArgs struct {
	// Automount the volume upon attaching it (server_id must be provided).
	Automount *bool `pulumi:"automount"`
	// Enable or disable delete protection.
	DeleteProtection *bool `pulumi:"deleteProtection"`
	// Format volume after creation. `xfs` or `ext4`
	Format *string `pulumi:"format"`
	// (map) User-defined labels (key-value pairs).
	Labels map[string]interface{} `pulumi:"labels"`
	// Location of the volume to create, not allowed if serverId argument is passed.
	Location *string `pulumi:"location"`
	// Name of the volume to create (must be unique per project).
	Name *string `pulumi:"name"`
	// Server to attach the Volume to, not allowed if location argument is passed.
	ServerId *int `pulumi:"serverId"`
	// Size of the volume (in GB).
	Size int `pulumi:"size"`
}

// The set of arguments for constructing a Volume resource.
type VolumeArgs struct {
	// Automount the volume upon attaching it (server_id must be provided).
	Automount pulumi.BoolPtrInput
	// Enable or disable delete protection.
	DeleteProtection pulumi.BoolPtrInput
	// Format volume after creation. `xfs` or `ext4`
	Format pulumi.StringPtrInput
	// (map) User-defined labels (key-value pairs).
	Labels pulumi.MapInput
	// Location of the volume to create, not allowed if serverId argument is passed.
	Location pulumi.StringPtrInput
	// Name of the volume to create (must be unique per project).
	Name pulumi.StringPtrInput
	// Server to attach the Volume to, not allowed if location argument is passed.
	ServerId pulumi.IntPtrInput
	// Size of the volume (in GB).
	Size pulumi.IntInput
}

func (VolumeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeArgs)(nil)).Elem()
}

type VolumeInput interface {
	pulumi.Input

	ToVolumeOutput() VolumeOutput
	ToVolumeOutputWithContext(ctx context.Context) VolumeOutput
}

func (*Volume) ElementType() reflect.Type {
	return reflect.TypeOf((**Volume)(nil)).Elem()
}

func (i *Volume) ToVolumeOutput() VolumeOutput {
	return i.ToVolumeOutputWithContext(context.Background())
}

func (i *Volume) ToVolumeOutputWithContext(ctx context.Context) VolumeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeOutput)
}

// VolumeArrayInput is an input type that accepts VolumeArray and VolumeArrayOutput values.
// You can construct a concrete instance of `VolumeArrayInput` via:
//
//          VolumeArray{ VolumeArgs{...} }
type VolumeArrayInput interface {
	pulumi.Input

	ToVolumeArrayOutput() VolumeArrayOutput
	ToVolumeArrayOutputWithContext(context.Context) VolumeArrayOutput
}

type VolumeArray []VolumeInput

func (VolumeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Volume)(nil)).Elem()
}

func (i VolumeArray) ToVolumeArrayOutput() VolumeArrayOutput {
	return i.ToVolumeArrayOutputWithContext(context.Background())
}

func (i VolumeArray) ToVolumeArrayOutputWithContext(ctx context.Context) VolumeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeArrayOutput)
}

// VolumeMapInput is an input type that accepts VolumeMap and VolumeMapOutput values.
// You can construct a concrete instance of `VolumeMapInput` via:
//
//          VolumeMap{ "key": VolumeArgs{...} }
type VolumeMapInput interface {
	pulumi.Input

	ToVolumeMapOutput() VolumeMapOutput
	ToVolumeMapOutputWithContext(context.Context) VolumeMapOutput
}

type VolumeMap map[string]VolumeInput

func (VolumeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Volume)(nil)).Elem()
}

func (i VolumeMap) ToVolumeMapOutput() VolumeMapOutput {
	return i.ToVolumeMapOutputWithContext(context.Background())
}

func (i VolumeMap) ToVolumeMapOutputWithContext(ctx context.Context) VolumeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeMapOutput)
}

type VolumeOutput struct{ *pulumi.OutputState }

func (VolumeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Volume)(nil)).Elem()
}

func (o VolumeOutput) ToVolumeOutput() VolumeOutput {
	return o
}

func (o VolumeOutput) ToVolumeOutputWithContext(ctx context.Context) VolumeOutput {
	return o
}

type VolumeArrayOutput struct{ *pulumi.OutputState }

func (VolumeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Volume)(nil)).Elem()
}

func (o VolumeArrayOutput) ToVolumeArrayOutput() VolumeArrayOutput {
	return o
}

func (o VolumeArrayOutput) ToVolumeArrayOutputWithContext(ctx context.Context) VolumeArrayOutput {
	return o
}

func (o VolumeArrayOutput) Index(i pulumi.IntInput) VolumeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Volume {
		return vs[0].([]*Volume)[vs[1].(int)]
	}).(VolumeOutput)
}

type VolumeMapOutput struct{ *pulumi.OutputState }

func (VolumeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Volume)(nil)).Elem()
}

func (o VolumeMapOutput) ToVolumeMapOutput() VolumeMapOutput {
	return o
}

func (o VolumeMapOutput) ToVolumeMapOutputWithContext(ctx context.Context) VolumeMapOutput {
	return o
}

func (o VolumeMapOutput) MapIndex(k pulumi.StringInput) VolumeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Volume {
		return vs[0].(map[string]*Volume)[vs[1].(string)]
	}).(VolumeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeInput)(nil)).Elem(), &Volume{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeArrayInput)(nil)).Elem(), VolumeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeMapInput)(nil)).Elem(), VolumeMap{})
	pulumi.RegisterOutputType(VolumeOutput{})
	pulumi.RegisterOutputType(VolumeArrayOutput{})
	pulumi.RegisterOutputType(VolumeMapOutput{})
}
