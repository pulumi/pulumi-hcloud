// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Hetzner Cloud Floating IP Assignment to assign a Floating IP to a Hetzner Cloud Server. Deleting a Floating IP Assignment will unassign the Floating IP from the Server.
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
// 			Datacenter: pulumi.String("fsn1-dc8"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		master, err := hcloud.NewFloatingIp(ctx, "master", &hcloud.FloatingIpArgs{
// 			Type:         pulumi.String("ipv4"),
// 			HomeLocation: pulumi.String("nbg1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hcloud.NewFloatingIpAssignment(ctx, "main", &hcloud.FloatingIpAssignmentArgs{
// 			FloatingIpId: master.ID(),
// 			ServerId:     node1.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type FloatingIpAssignment struct {
	pulumi.CustomResourceState

	// ID of the Floating IP.
	FloatingIpId pulumi.IntOutput `pulumi:"floatingIpId"`
	// Server to assign the Floating IP to.
	ServerId pulumi.IntOutput `pulumi:"serverId"`
}

// NewFloatingIpAssignment registers a new resource with the given unique name, arguments, and options.
func NewFloatingIpAssignment(ctx *pulumi.Context,
	name string, args *FloatingIpAssignmentArgs, opts ...pulumi.ResourceOption) (*FloatingIpAssignment, error) {
	if args == nil || args.FloatingIpId == nil {
		return nil, errors.New("missing required argument 'FloatingIpId'")
	}
	if args == nil || args.ServerId == nil {
		return nil, errors.New("missing required argument 'ServerId'")
	}
	if args == nil {
		args = &FloatingIpAssignmentArgs{}
	}
	var resource FloatingIpAssignment
	err := ctx.RegisterResource("hcloud:index/floatingIpAssignment:FloatingIpAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFloatingIpAssignment gets an existing FloatingIpAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFloatingIpAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FloatingIpAssignmentState, opts ...pulumi.ResourceOption) (*FloatingIpAssignment, error) {
	var resource FloatingIpAssignment
	err := ctx.ReadResource("hcloud:index/floatingIpAssignment:FloatingIpAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FloatingIpAssignment resources.
type floatingIpAssignmentState struct {
	// ID of the Floating IP.
	FloatingIpId *int `pulumi:"floatingIpId"`
	// Server to assign the Floating IP to.
	ServerId *int `pulumi:"serverId"`
}

type FloatingIpAssignmentState struct {
	// ID of the Floating IP.
	FloatingIpId pulumi.IntPtrInput
	// Server to assign the Floating IP to.
	ServerId pulumi.IntPtrInput
}

func (FloatingIpAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*floatingIpAssignmentState)(nil)).Elem()
}

type floatingIpAssignmentArgs struct {
	// ID of the Floating IP.
	FloatingIpId int `pulumi:"floatingIpId"`
	// Server to assign the Floating IP to.
	ServerId int `pulumi:"serverId"`
}

// The set of arguments for constructing a FloatingIpAssignment resource.
type FloatingIpAssignmentArgs struct {
	// ID of the Floating IP.
	FloatingIpId pulumi.IntInput
	// Server to assign the Floating IP to.
	ServerId pulumi.IntInput
}

func (FloatingIpAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*floatingIpAssignmentArgs)(nil)).Elem()
}
