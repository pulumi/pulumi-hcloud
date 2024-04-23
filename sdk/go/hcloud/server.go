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

// Provides an Hetzner Cloud server resource. This can be used to create, modify, and delete servers. Servers also support provisioning.
//
// ## Example Usage
//
// ### Basic server creation
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
//			// Create a new server running debian
//			_, err := hcloud.NewServer(ctx, "node1", &hcloud.ServerArgs{
//				Name:       pulumi.String("node1"),
//				Image:      pulumi.String("debian-11"),
//				ServerType: pulumi.String("cx11"),
//				PublicNets: hcloud.ServerPublicNetArray{
//					&hcloud.ServerPublicNetArgs{
//						Ipv4Enabled: pulumi.Bool(true),
//						Ipv6Enabled: pulumi.Bool(true),
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
//			// ## Server creation with one linked primary ip (ipv4)
//			primaryIp1, err := hcloud.NewPrimaryIp(ctx, "primary_ip_1", &hcloud.PrimaryIpArgs{
//				Name:         pulumi.String("primary_ip_test"),
//				Datacenter:   pulumi.String("fsn1-dc14"),
//				Type:         pulumi.String("ipv4"),
//				AssigneeType: pulumi.String("server"),
//				AutoDelete:   pulumi.Bool(true),
//				Labels: pulumi.Map{
//					"hallo": pulumi.Any("welt"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewServer(ctx, "server_test", &hcloud.ServerArgs{
//				Name:       pulumi.String("test-server"),
//				Image:      pulumi.String("ubuntu-20.04"),
//				ServerType: pulumi.String("cx11"),
//				Datacenter: pulumi.String("fsn1-dc14"),
//				Labels: pulumi.Map{
//					"test": pulumi.Any("tessst1"),
//				},
//				PublicNets: hcloud.ServerPublicNetArray{
//					&hcloud.ServerPublicNetArgs{
//						Ipv4Enabled: pulumi.Bool(true),
//						Ipv4:        primaryIp1.ID(),
//						Ipv6Enabled: pulumi.Bool(false),
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
// ### Server creation with network
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
//			network, err := hcloud.NewNetwork(ctx, "network", &hcloud.NetworkArgs{
//				Name:    pulumi.String("network"),
//				IpRange: pulumi.String("10.0.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewNetworkSubnet(ctx, "network-subnet", &hcloud.NetworkSubnetArgs{
//				Type:        pulumi.String("cloud"),
//				NetworkId:   network.ID(),
//				NetworkZone: pulumi.String("eu-central"),
//				IpRange:     pulumi.String("10.0.1.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewServer(ctx, "server", &hcloud.ServerArgs{
//				Name:       pulumi.String("server"),
//				ServerType: pulumi.String("cx11"),
//				Image:      pulumi.String("ubuntu-20.04"),
//				Location:   pulumi.String("nbg1"),
//				Networks: hcloud.ServerNetworkTypeArray{
//					&hcloud.ServerNetworkTypeArgs{
//						NetworkId: network.ID(),
//						Ip:        pulumi.String("10.0.1.5"),
//						AliasIps: pulumi.StringArray{
//							pulumi.String("10.0.1.6"),
//							pulumi.String("10.0.1.7"),
//						},
//					},
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				network_subnet,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Server creation from snapshot
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
//			// Get image infos because we need the ID
//			packerSnapshot, err := hcloud.GetImage(ctx, &hcloud.GetImageArgs{
//				WithSelector: pulumi.StringRef("app=foobar"),
//				MostRecent:   pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// Create a new server from the snapshot
//			_, err = hcloud.NewServer(ctx, "from_snapshot", &hcloud.ServerArgs{
//				Name:       pulumi.String("from-snapshot"),
//				Image:      pulumi.Int(packerSnapshot.Id),
//				ServerType: pulumi.String("cx11"),
//				PublicNets: hcloud.ServerPublicNetArray{
//					&hcloud.ServerPublicNetArgs{
//						Ipv4Enabled: pulumi.Bool(true),
//						Ipv6Enabled: pulumi.Bool(true),
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
// ## Primary IPs
//
// When creating a server without linking at least one ´primary_ip´, it automatically creates & assigns two (ipv4 & ipv6).
// With the publicNet block, you can enable or link primary ips. If you don't define this block, two primary ips (ipv4, ipv6) will be created and assigned to the server automatically.
//
// ## Import
//
// Servers can be imported using the server `id`:
//
// ```sh
// $ pulumi import hcloud:index/server:Server myserver id
// ```
type Server struct {
	pulumi.CustomResourceState

	// Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
	AllowDeprecatedImages pulumi.BoolPtrOutput `pulumi:"allowDeprecatedImages"`
	// (string) The backup window of the server, if enabled.
	//
	// Deprecated: You should remove this property from your terraform configuration.
	BackupWindow pulumi.StringOutput `pulumi:"backupWindow"`
	// Enable or disable backups.
	Backups pulumi.BoolPtrOutput `pulumi:"backups"`
	// The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
	Datacenter pulumi.StringOutput `pulumi:"datacenter"`
	// Enable or disable delete protection (Needs to be the same as `rebuildProtection`). See "Delete Protection" in the Provider Docs for details.
	DeleteProtection pulumi.BoolPtrOutput `pulumi:"deleteProtection"`
	// Firewall IDs the server should be attached to on creation.
	FirewallIds pulumi.IntArrayOutput `pulumi:"firewallIds"`
	// Ignores any updates
	// to the `firewallIds` argument which were received from the server.
	// This should not be used in normal cases. See the documentation of the
	// `FirewallAttachment` resource for a reason to use this
	// argument.
	IgnoreRemoteFirewallIds pulumi.BoolPtrOutput   `pulumi:"ignoreRemoteFirewallIds"`
	Image                   pulumi.StringPtrOutput `pulumi:"image"`
	// (string) The IPv4 address.
	Ipv4Address pulumi.StringOutput `pulumi:"ipv4Address"`
	// (string) The first IPv6 address of the assigned network.
	Ipv6Address pulumi.StringOutput `pulumi:"ipv6Address"`
	// (string) The IPv6 network.
	Ipv6Network pulumi.StringOutput `pulumi:"ipv6Network"`
	// ID or Name of an ISO image to mount.
	Iso pulumi.StringPtrOutput `pulumi:"iso"`
	// If true, do not upgrade the disk. This allows downgrading the server type later.
	KeepDisk pulumi.BoolPtrOutput `pulumi:"keepDisk"`
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.MapOutput `pulumi:"labels"`
	// The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
	Location pulumi.StringOutput `pulumi:"location"`
	// Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
	Name pulumi.StringOutput `pulumi:"name"`
	// Network the server should be attached to on creation. (Can be specified multiple times)
	Networks ServerNetworkTypeArrayOutput `pulumi:"networks"`
	// Placement Group ID the server added to on creation.
	PlacementGroupId pulumi.IntPtrOutput `pulumi:"placementGroupId"`
	// (int) The size of the primary disk in GB.
	PrimaryDiskSize pulumi.IntOutput `pulumi:"primaryDiskSize"`
	// In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
	// If this block is not defined, two primary (ipv4 & ipv6) ips getting auto generated.
	PublicNets ServerPublicNetArrayOutput `pulumi:"publicNets"`
	// Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
	RebuildProtection pulumi.BoolPtrOutput `pulumi:"rebuildProtection"`
	// Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
	Rescue pulumi.StringPtrOutput `pulumi:"rescue"`
	// Name of the server type this server should be created with.
	ServerType pulumi.StringOutput `pulumi:"serverType"`
	// Whether to try shutting the server down gracefully before deleting it.
	ShutdownBeforeDeletion pulumi.BoolPtrOutput `pulumi:"shutdownBeforeDeletion"`
	// SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ sshKeys ]`.
	SshKeys pulumi.StringArrayOutput `pulumi:"sshKeys"`
	// (string) The status of the server.
	Status pulumi.StringOutput `pulumi:"status"`
	// Cloud-Init user data to use during server creation
	UserData pulumi.StringPtrOutput `pulumi:"userData"`
}

// NewServer registers a new resource with the given unique name, arguments, and options.
func NewServer(ctx *pulumi.Context,
	name string, args *ServerArgs, opts ...pulumi.ResourceOption) (*Server, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServerType == nil {
		return nil, errors.New("invalid value for required argument 'ServerType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Server
	err := ctx.RegisterResource("hcloud:index/server:Server", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServer gets an existing Server resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServerState, opts ...pulumi.ResourceOption) (*Server, error) {
	var resource Server
	err := ctx.ReadResource("hcloud:index/server:Server", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Server resources.
type serverState struct {
	// Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
	AllowDeprecatedImages *bool `pulumi:"allowDeprecatedImages"`
	// (string) The backup window of the server, if enabled.
	//
	// Deprecated: You should remove this property from your terraform configuration.
	BackupWindow *string `pulumi:"backupWindow"`
	// Enable or disable backups.
	Backups *bool `pulumi:"backups"`
	// The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
	Datacenter *string `pulumi:"datacenter"`
	// Enable or disable delete protection (Needs to be the same as `rebuildProtection`). See "Delete Protection" in the Provider Docs for details.
	DeleteProtection *bool `pulumi:"deleteProtection"`
	// Firewall IDs the server should be attached to on creation.
	FirewallIds []int `pulumi:"firewallIds"`
	// Ignores any updates
	// to the `firewallIds` argument which were received from the server.
	// This should not be used in normal cases. See the documentation of the
	// `FirewallAttachment` resource for a reason to use this
	// argument.
	IgnoreRemoteFirewallIds *bool   `pulumi:"ignoreRemoteFirewallIds"`
	Image                   *string `pulumi:"image"`
	// (string) The IPv4 address.
	Ipv4Address *string `pulumi:"ipv4Address"`
	// (string) The first IPv6 address of the assigned network.
	Ipv6Address *string `pulumi:"ipv6Address"`
	// (string) The IPv6 network.
	Ipv6Network *string `pulumi:"ipv6Network"`
	// ID or Name of an ISO image to mount.
	Iso *string `pulumi:"iso"`
	// If true, do not upgrade the disk. This allows downgrading the server type later.
	KeepDisk *bool `pulumi:"keepDisk"`
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]interface{} `pulumi:"labels"`
	// The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
	Location *string `pulumi:"location"`
	// Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
	Name *string `pulumi:"name"`
	// Network the server should be attached to on creation. (Can be specified multiple times)
	Networks []ServerNetworkType `pulumi:"networks"`
	// Placement Group ID the server added to on creation.
	PlacementGroupId *int `pulumi:"placementGroupId"`
	// (int) The size of the primary disk in GB.
	PrimaryDiskSize *int `pulumi:"primaryDiskSize"`
	// In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
	// If this block is not defined, two primary (ipv4 & ipv6) ips getting auto generated.
	PublicNets []ServerPublicNet `pulumi:"publicNets"`
	// Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
	RebuildProtection *bool `pulumi:"rebuildProtection"`
	// Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
	Rescue *string `pulumi:"rescue"`
	// Name of the server type this server should be created with.
	ServerType *string `pulumi:"serverType"`
	// Whether to try shutting the server down gracefully before deleting it.
	ShutdownBeforeDeletion *bool `pulumi:"shutdownBeforeDeletion"`
	// SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ sshKeys ]`.
	SshKeys []string `pulumi:"sshKeys"`
	// (string) The status of the server.
	Status *string `pulumi:"status"`
	// Cloud-Init user data to use during server creation
	UserData *string `pulumi:"userData"`
}

type ServerState struct {
	// Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
	AllowDeprecatedImages pulumi.BoolPtrInput
	// (string) The backup window of the server, if enabled.
	//
	// Deprecated: You should remove this property from your terraform configuration.
	BackupWindow pulumi.StringPtrInput
	// Enable or disable backups.
	Backups pulumi.BoolPtrInput
	// The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
	Datacenter pulumi.StringPtrInput
	// Enable or disable delete protection (Needs to be the same as `rebuildProtection`). See "Delete Protection" in the Provider Docs for details.
	DeleteProtection pulumi.BoolPtrInput
	// Firewall IDs the server should be attached to on creation.
	FirewallIds pulumi.IntArrayInput
	// Ignores any updates
	// to the `firewallIds` argument which were received from the server.
	// This should not be used in normal cases. See the documentation of the
	// `FirewallAttachment` resource for a reason to use this
	// argument.
	IgnoreRemoteFirewallIds pulumi.BoolPtrInput
	Image                   pulumi.StringPtrInput
	// (string) The IPv4 address.
	Ipv4Address pulumi.StringPtrInput
	// (string) The first IPv6 address of the assigned network.
	Ipv6Address pulumi.StringPtrInput
	// (string) The IPv6 network.
	Ipv6Network pulumi.StringPtrInput
	// ID or Name of an ISO image to mount.
	Iso pulumi.StringPtrInput
	// If true, do not upgrade the disk. This allows downgrading the server type later.
	KeepDisk pulumi.BoolPtrInput
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.MapInput
	// The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
	Location pulumi.StringPtrInput
	// Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
	Name pulumi.StringPtrInput
	// Network the server should be attached to on creation. (Can be specified multiple times)
	Networks ServerNetworkTypeArrayInput
	// Placement Group ID the server added to on creation.
	PlacementGroupId pulumi.IntPtrInput
	// (int) The size of the primary disk in GB.
	PrimaryDiskSize pulumi.IntPtrInput
	// In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
	// If this block is not defined, two primary (ipv4 & ipv6) ips getting auto generated.
	PublicNets ServerPublicNetArrayInput
	// Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
	RebuildProtection pulumi.BoolPtrInput
	// Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
	Rescue pulumi.StringPtrInput
	// Name of the server type this server should be created with.
	ServerType pulumi.StringPtrInput
	// Whether to try shutting the server down gracefully before deleting it.
	ShutdownBeforeDeletion pulumi.BoolPtrInput
	// SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ sshKeys ]`.
	SshKeys pulumi.StringArrayInput
	// (string) The status of the server.
	Status pulumi.StringPtrInput
	// Cloud-Init user data to use during server creation
	UserData pulumi.StringPtrInput
}

func (ServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverState)(nil)).Elem()
}

type serverArgs struct {
	// Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
	AllowDeprecatedImages *bool `pulumi:"allowDeprecatedImages"`
	// Enable or disable backups.
	Backups *bool `pulumi:"backups"`
	// The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
	Datacenter *string `pulumi:"datacenter"`
	// Enable or disable delete protection (Needs to be the same as `rebuildProtection`). See "Delete Protection" in the Provider Docs for details.
	DeleteProtection *bool `pulumi:"deleteProtection"`
	// Firewall IDs the server should be attached to on creation.
	FirewallIds []int `pulumi:"firewallIds"`
	// Ignores any updates
	// to the `firewallIds` argument which were received from the server.
	// This should not be used in normal cases. See the documentation of the
	// `FirewallAttachment` resource for a reason to use this
	// argument.
	IgnoreRemoteFirewallIds *bool   `pulumi:"ignoreRemoteFirewallIds"`
	Image                   *string `pulumi:"image"`
	// ID or Name of an ISO image to mount.
	Iso *string `pulumi:"iso"`
	// If true, do not upgrade the disk. This allows downgrading the server type later.
	KeepDisk *bool `pulumi:"keepDisk"`
	// User-defined labels (key-value pairs) should be created with.
	Labels map[string]interface{} `pulumi:"labels"`
	// The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
	Location *string `pulumi:"location"`
	// Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
	Name *string `pulumi:"name"`
	// Network the server should be attached to on creation. (Can be specified multiple times)
	Networks []ServerNetworkType `pulumi:"networks"`
	// Placement Group ID the server added to on creation.
	PlacementGroupId *int `pulumi:"placementGroupId"`
	// In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
	// If this block is not defined, two primary (ipv4 & ipv6) ips getting auto generated.
	PublicNets []ServerPublicNet `pulumi:"publicNets"`
	// Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
	RebuildProtection *bool `pulumi:"rebuildProtection"`
	// Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
	Rescue *string `pulumi:"rescue"`
	// Name of the server type this server should be created with.
	ServerType string `pulumi:"serverType"`
	// Whether to try shutting the server down gracefully before deleting it.
	ShutdownBeforeDeletion *bool `pulumi:"shutdownBeforeDeletion"`
	// SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ sshKeys ]`.
	SshKeys []string `pulumi:"sshKeys"`
	// Cloud-Init user data to use during server creation
	UserData *string `pulumi:"userData"`
}

// The set of arguments for constructing a Server resource.
type ServerArgs struct {
	// Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
	AllowDeprecatedImages pulumi.BoolPtrInput
	// Enable or disable backups.
	Backups pulumi.BoolPtrInput
	// The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
	Datacenter pulumi.StringPtrInput
	// Enable or disable delete protection (Needs to be the same as `rebuildProtection`). See "Delete Protection" in the Provider Docs for details.
	DeleteProtection pulumi.BoolPtrInput
	// Firewall IDs the server should be attached to on creation.
	FirewallIds pulumi.IntArrayInput
	// Ignores any updates
	// to the `firewallIds` argument which were received from the server.
	// This should not be used in normal cases. See the documentation of the
	// `FirewallAttachment` resource for a reason to use this
	// argument.
	IgnoreRemoteFirewallIds pulumi.BoolPtrInput
	Image                   pulumi.StringPtrInput
	// ID or Name of an ISO image to mount.
	Iso pulumi.StringPtrInput
	// If true, do not upgrade the disk. This allows downgrading the server type later.
	KeepDisk pulumi.BoolPtrInput
	// User-defined labels (key-value pairs) should be created with.
	Labels pulumi.MapInput
	// The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
	Location pulumi.StringPtrInput
	// Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
	Name pulumi.StringPtrInput
	// Network the server should be attached to on creation. (Can be specified multiple times)
	Networks ServerNetworkTypeArrayInput
	// Placement Group ID the server added to on creation.
	PlacementGroupId pulumi.IntPtrInput
	// In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
	// If this block is not defined, two primary (ipv4 & ipv6) ips getting auto generated.
	PublicNets ServerPublicNetArrayInput
	// Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
	RebuildProtection pulumi.BoolPtrInput
	// Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
	Rescue pulumi.StringPtrInput
	// Name of the server type this server should be created with.
	ServerType pulumi.StringInput
	// Whether to try shutting the server down gracefully before deleting it.
	ShutdownBeforeDeletion pulumi.BoolPtrInput
	// SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ sshKeys ]`.
	SshKeys pulumi.StringArrayInput
	// Cloud-Init user data to use during server creation
	UserData pulumi.StringPtrInput
}

func (ServerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverArgs)(nil)).Elem()
}

type ServerInput interface {
	pulumi.Input

	ToServerOutput() ServerOutput
	ToServerOutputWithContext(ctx context.Context) ServerOutput
}

func (*Server) ElementType() reflect.Type {
	return reflect.TypeOf((**Server)(nil)).Elem()
}

func (i *Server) ToServerOutput() ServerOutput {
	return i.ToServerOutputWithContext(context.Background())
}

func (i *Server) ToServerOutputWithContext(ctx context.Context) ServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerOutput)
}

// ServerArrayInput is an input type that accepts ServerArray and ServerArrayOutput values.
// You can construct a concrete instance of `ServerArrayInput` via:
//
//	ServerArray{ ServerArgs{...} }
type ServerArrayInput interface {
	pulumi.Input

	ToServerArrayOutput() ServerArrayOutput
	ToServerArrayOutputWithContext(context.Context) ServerArrayOutput
}

type ServerArray []ServerInput

func (ServerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Server)(nil)).Elem()
}

func (i ServerArray) ToServerArrayOutput() ServerArrayOutput {
	return i.ToServerArrayOutputWithContext(context.Background())
}

func (i ServerArray) ToServerArrayOutputWithContext(ctx context.Context) ServerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerArrayOutput)
}

// ServerMapInput is an input type that accepts ServerMap and ServerMapOutput values.
// You can construct a concrete instance of `ServerMapInput` via:
//
//	ServerMap{ "key": ServerArgs{...} }
type ServerMapInput interface {
	pulumi.Input

	ToServerMapOutput() ServerMapOutput
	ToServerMapOutputWithContext(context.Context) ServerMapOutput
}

type ServerMap map[string]ServerInput

func (ServerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Server)(nil)).Elem()
}

func (i ServerMap) ToServerMapOutput() ServerMapOutput {
	return i.ToServerMapOutputWithContext(context.Background())
}

func (i ServerMap) ToServerMapOutputWithContext(ctx context.Context) ServerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerMapOutput)
}

type ServerOutput struct{ *pulumi.OutputState }

func (ServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Server)(nil)).Elem()
}

func (o ServerOutput) ToServerOutput() ServerOutput {
	return o
}

func (o ServerOutput) ToServerOutputWithContext(ctx context.Context) ServerOutput {
	return o
}

// Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
func (o ServerOutput) AllowDeprecatedImages() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.BoolPtrOutput { return v.AllowDeprecatedImages }).(pulumi.BoolPtrOutput)
}

// (string) The backup window of the server, if enabled.
//
// Deprecated: You should remove this property from your terraform configuration.
func (o ServerOutput) BackupWindow() pulumi.StringOutput {
	return o.ApplyT(func(v *Server) pulumi.StringOutput { return v.BackupWindow }).(pulumi.StringOutput)
}

// Enable or disable backups.
func (o ServerOutput) Backups() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.BoolPtrOutput { return v.Backups }).(pulumi.BoolPtrOutput)
}

// The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
func (o ServerOutput) Datacenter() pulumi.StringOutput {
	return o.ApplyT(func(v *Server) pulumi.StringOutput { return v.Datacenter }).(pulumi.StringOutput)
}

// Enable or disable delete protection (Needs to be the same as `rebuildProtection`). See "Delete Protection" in the Provider Docs for details.
func (o ServerOutput) DeleteProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.BoolPtrOutput { return v.DeleteProtection }).(pulumi.BoolPtrOutput)
}

// Firewall IDs the server should be attached to on creation.
func (o ServerOutput) FirewallIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *Server) pulumi.IntArrayOutput { return v.FirewallIds }).(pulumi.IntArrayOutput)
}

// Ignores any updates
// to the `firewallIds` argument which were received from the server.
// This should not be used in normal cases. See the documentation of the
// `FirewallAttachment` resource for a reason to use this
// argument.
func (o ServerOutput) IgnoreRemoteFirewallIds() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.BoolPtrOutput { return v.IgnoreRemoteFirewallIds }).(pulumi.BoolPtrOutput)
}

func (o ServerOutput) Image() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.StringPtrOutput { return v.Image }).(pulumi.StringPtrOutput)
}

// (string) The IPv4 address.
func (o ServerOutput) Ipv4Address() pulumi.StringOutput {
	return o.ApplyT(func(v *Server) pulumi.StringOutput { return v.Ipv4Address }).(pulumi.StringOutput)
}

// (string) The first IPv6 address of the assigned network.
func (o ServerOutput) Ipv6Address() pulumi.StringOutput {
	return o.ApplyT(func(v *Server) pulumi.StringOutput { return v.Ipv6Address }).(pulumi.StringOutput)
}

// (string) The IPv6 network.
func (o ServerOutput) Ipv6Network() pulumi.StringOutput {
	return o.ApplyT(func(v *Server) pulumi.StringOutput { return v.Ipv6Network }).(pulumi.StringOutput)
}

// ID or Name of an ISO image to mount.
func (o ServerOutput) Iso() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.StringPtrOutput { return v.Iso }).(pulumi.StringPtrOutput)
}

// If true, do not upgrade the disk. This allows downgrading the server type later.
func (o ServerOutput) KeepDisk() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.BoolPtrOutput { return v.KeepDisk }).(pulumi.BoolPtrOutput)
}

// User-defined labels (key-value pairs) should be created with.
func (o ServerOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *Server) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
func (o ServerOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Server) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
func (o ServerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Server) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Network the server should be attached to on creation. (Can be specified multiple times)
func (o ServerOutput) Networks() ServerNetworkTypeArrayOutput {
	return o.ApplyT(func(v *Server) ServerNetworkTypeArrayOutput { return v.Networks }).(ServerNetworkTypeArrayOutput)
}

// Placement Group ID the server added to on creation.
func (o ServerOutput) PlacementGroupId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.IntPtrOutput { return v.PlacementGroupId }).(pulumi.IntPtrOutput)
}

// (int) The size of the primary disk in GB.
func (o ServerOutput) PrimaryDiskSize() pulumi.IntOutput {
	return o.ApplyT(func(v *Server) pulumi.IntOutput { return v.PrimaryDiskSize }).(pulumi.IntOutput)
}

// In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
// If this block is not defined, two primary (ipv4 & ipv6) ips getting auto generated.
func (o ServerOutput) PublicNets() ServerPublicNetArrayOutput {
	return o.ApplyT(func(v *Server) ServerPublicNetArrayOutput { return v.PublicNets }).(ServerPublicNetArrayOutput)
}

// Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
func (o ServerOutput) RebuildProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.BoolPtrOutput { return v.RebuildProtection }).(pulumi.BoolPtrOutput)
}

// Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
func (o ServerOutput) Rescue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.StringPtrOutput { return v.Rescue }).(pulumi.StringPtrOutput)
}

// Name of the server type this server should be created with.
func (o ServerOutput) ServerType() pulumi.StringOutput {
	return o.ApplyT(func(v *Server) pulumi.StringOutput { return v.ServerType }).(pulumi.StringOutput)
}

// Whether to try shutting the server down gracefully before deleting it.
func (o ServerOutput) ShutdownBeforeDeletion() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.BoolPtrOutput { return v.ShutdownBeforeDeletion }).(pulumi.BoolPtrOutput)
}

// SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ sshKeys ]`.
func (o ServerOutput) SshKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Server) pulumi.StringArrayOutput { return v.SshKeys }).(pulumi.StringArrayOutput)
}

// (string) The status of the server.
func (o ServerOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Server) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Cloud-Init user data to use during server creation
func (o ServerOutput) UserData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Server) pulumi.StringPtrOutput { return v.UserData }).(pulumi.StringPtrOutput)
}

type ServerArrayOutput struct{ *pulumi.OutputState }

func (ServerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Server)(nil)).Elem()
}

func (o ServerArrayOutput) ToServerArrayOutput() ServerArrayOutput {
	return o
}

func (o ServerArrayOutput) ToServerArrayOutputWithContext(ctx context.Context) ServerArrayOutput {
	return o
}

func (o ServerArrayOutput) Index(i pulumi.IntInput) ServerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Server {
		return vs[0].([]*Server)[vs[1].(int)]
	}).(ServerOutput)
}

type ServerMapOutput struct{ *pulumi.OutputState }

func (ServerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Server)(nil)).Elem()
}

func (o ServerMapOutput) ToServerMapOutput() ServerMapOutput {
	return o
}

func (o ServerMapOutput) ToServerMapOutputWithContext(ctx context.Context) ServerMapOutput {
	return o
}

func (o ServerMapOutput) MapIndex(k pulumi.StringInput) ServerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Server {
		return vs[0].(map[string]*Server)[vs[1].(string)]
	}).(ServerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerInput)(nil)).Elem(), &Server{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerArrayInput)(nil)).Elem(), ServerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerMapInput)(nil)).Elem(), ServerMap{})
	pulumi.RegisterOutputType(ServerOutput{})
	pulumi.RegisterOutputType(ServerArrayOutput{})
	pulumi.RegisterOutputType(ServerMapOutput{})
}
