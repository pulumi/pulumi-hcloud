// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := hcloud.LookupServer(ctx, &hcloud.LookupServerArgs{
//				Name: pulumi.StringRef("my-server"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.LookupServer(ctx, &hcloud.LookupServerArgs{
//				Id: pulumi.IntRef(123),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.LookupServer(ctx, &hcloud.LookupServerArgs{
//				WithSelector: pulumi.StringRef("key=value"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupServer(ctx *pulumi.Context, args *LookupServerArgs, opts ...pulumi.InvokeOption) (*LookupServerResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServerResult
	err := ctx.Invoke("hcloud:index/getServer:getServer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServer.
type LookupServerArgs struct {
	// ID of the server.
	Id *int `pulumi:"id"`
	// Name of the server.
	Name *string `pulumi:"name"`
	// (map) Private Network the server is attached to.
	Networks []GetServerNetworkType `pulumi:"networks"`
	// (Optional, string) Placement Group ID the server is assigned to.
	PlacementGroupId *int `pulumi:"placementGroupId"`
	// Deprecated: Please use the withSelector property instead.
	Selector *string `pulumi:"selector"`
	// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/reference/cloud#label-selector).
	WithSelector *string `pulumi:"withSelector"`
	// List only servers with the specified status, could contain `initializing`, `starting`, `running`, `stopping`, `off`, `deleting`, `rebuilding`, `migrating`, `unknown`.
	WithStatuses []string `pulumi:"withStatuses"`
}

// A collection of values returned by getServer.
type LookupServerResult struct {
	// (string) The backup window of the server, if enabled.
	BackupWindow string `pulumi:"backupWindow"`
	// (bool) Whether backups are enabled.
	Backups bool `pulumi:"backups"`
	// (string) The datacenter name. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
	Datacenter string `pulumi:"datacenter"`
	// (bool) Whether delete protection is enabled.
	DeleteProtection bool `pulumi:"deleteProtection"`
	// (Optional, list) Firewall IDs the server is attached to.
	FirewallIds []int `pulumi:"firewallIds"`
	// (int) Unique ID of the server.
	Id int `pulumi:"id"`
	// (string) Name or ID of the image the server was created from.
	Image string `pulumi:"image"`
	// (string) The IPv4 address.
	Ipv4Address string `pulumi:"ipv4Address"`
	// (string) The first IPv6 address of the assigned network.
	Ipv6Address string `pulumi:"ipv6Address"`
	// (string) The IPv6 network.
	Ipv6Network string `pulumi:"ipv6Network"`
	// (string) ID or Name of the mounted ISO image. Architecture of ISO must equal the server (type) architecture.
	Iso string `pulumi:"iso"`
	// (map) User-defined labels (key-value pairs)
	Labels map[string]string `pulumi:"labels"`
	// (string) The location name. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
	Location string `pulumi:"location"`
	// (string) Name of the server.
	Name string `pulumi:"name"`
	// (map) Private Network the server is attached to.
	Networks []GetServerNetworkType `pulumi:"networks"`
	// (Optional, string) Placement Group ID the server is assigned to.
	PlacementGroupId *int `pulumi:"placementGroupId"`
	// (int) The size of the primary disk in GB.
	PrimaryDiskSize int `pulumi:"primaryDiskSize"`
	// (bool) Whether rebuild protection is enabled.
	RebuildProtection bool   `pulumi:"rebuildProtection"`
	Rescue            string `pulumi:"rescue"`
	// Deprecated: Please use the withSelector property instead.
	Selector *string `pulumi:"selector"`
	// (string) Name of the server type.
	ServerType string `pulumi:"serverType"`
	// (string) The status of the server.
	Status       string   `pulumi:"status"`
	WithSelector *string  `pulumi:"withSelector"`
	WithStatuses []string `pulumi:"withStatuses"`
}

func LookupServerOutput(ctx *pulumi.Context, args LookupServerOutputArgs, opts ...pulumi.InvokeOption) LookupServerResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupServerResultOutput, error) {
			args := v.(LookupServerArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("hcloud:index/getServer:getServer", args, LookupServerResultOutput{}, options).(LookupServerResultOutput), nil
		}).(LookupServerResultOutput)
}

// A collection of arguments for invoking getServer.
type LookupServerOutputArgs struct {
	// ID of the server.
	Id pulumi.IntPtrInput `pulumi:"id"`
	// Name of the server.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// (map) Private Network the server is attached to.
	Networks GetServerNetworkTypeArrayInput `pulumi:"networks"`
	// (Optional, string) Placement Group ID the server is assigned to.
	PlacementGroupId pulumi.IntPtrInput `pulumi:"placementGroupId"`
	// Deprecated: Please use the withSelector property instead.
	Selector pulumi.StringPtrInput `pulumi:"selector"`
	// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/reference/cloud#label-selector).
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
	// List only servers with the specified status, could contain `initializing`, `starting`, `running`, `stopping`, `off`, `deleting`, `rebuilding`, `migrating`, `unknown`.
	WithStatuses pulumi.StringArrayInput `pulumi:"withStatuses"`
}

func (LookupServerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServerArgs)(nil)).Elem()
}

// A collection of values returned by getServer.
type LookupServerResultOutput struct{ *pulumi.OutputState }

func (LookupServerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServerResult)(nil)).Elem()
}

func (o LookupServerResultOutput) ToLookupServerResultOutput() LookupServerResultOutput {
	return o
}

func (o LookupServerResultOutput) ToLookupServerResultOutputWithContext(ctx context.Context) LookupServerResultOutput {
	return o
}

// (string) The backup window of the server, if enabled.
func (o LookupServerResultOutput) BackupWindow() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.BackupWindow }).(pulumi.StringOutput)
}

// (bool) Whether backups are enabled.
func (o LookupServerResultOutput) Backups() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServerResult) bool { return v.Backups }).(pulumi.BoolOutput)
}

// (string) The datacenter name. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
func (o LookupServerResultOutput) Datacenter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Datacenter }).(pulumi.StringOutput)
}

// (bool) Whether delete protection is enabled.
func (o LookupServerResultOutput) DeleteProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServerResult) bool { return v.DeleteProtection }).(pulumi.BoolOutput)
}

// (Optional, list) Firewall IDs the server is attached to.
func (o LookupServerResultOutput) FirewallIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v LookupServerResult) []int { return v.FirewallIds }).(pulumi.IntArrayOutput)
}

// (int) Unique ID of the server.
func (o LookupServerResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServerResult) int { return v.Id }).(pulumi.IntOutput)
}

// (string) Name or ID of the image the server was created from.
func (o LookupServerResultOutput) Image() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Image }).(pulumi.StringOutput)
}

// (string) The IPv4 address.
func (o LookupServerResultOutput) Ipv4Address() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Ipv4Address }).(pulumi.StringOutput)
}

// (string) The first IPv6 address of the assigned network.
func (o LookupServerResultOutput) Ipv6Address() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Ipv6Address }).(pulumi.StringOutput)
}

// (string) The IPv6 network.
func (o LookupServerResultOutput) Ipv6Network() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Ipv6Network }).(pulumi.StringOutput)
}

// (string) ID or Name of the mounted ISO image. Architecture of ISO must equal the server (type) architecture.
func (o LookupServerResultOutput) Iso() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Iso }).(pulumi.StringOutput)
}

// (map) User-defined labels (key-value pairs)
func (o LookupServerResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupServerResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

// (string) The location name. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
func (o LookupServerResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Location }).(pulumi.StringOutput)
}

// (string) Name of the server.
func (o LookupServerResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Name }).(pulumi.StringOutput)
}

// (map) Private Network the server is attached to.
func (o LookupServerResultOutput) Networks() GetServerNetworkTypeArrayOutput {
	return o.ApplyT(func(v LookupServerResult) []GetServerNetworkType { return v.Networks }).(GetServerNetworkTypeArrayOutput)
}

// (Optional, string) Placement Group ID the server is assigned to.
func (o LookupServerResultOutput) PlacementGroupId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupServerResult) *int { return v.PlacementGroupId }).(pulumi.IntPtrOutput)
}

// (int) The size of the primary disk in GB.
func (o LookupServerResultOutput) PrimaryDiskSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupServerResult) int { return v.PrimaryDiskSize }).(pulumi.IntOutput)
}

// (bool) Whether rebuild protection is enabled.
func (o LookupServerResultOutput) RebuildProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServerResult) bool { return v.RebuildProtection }).(pulumi.BoolOutput)
}

func (o LookupServerResultOutput) Rescue() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Rescue }).(pulumi.StringOutput)
}

// Deprecated: Please use the withSelector property instead.
func (o LookupServerResultOutput) Selector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServerResult) *string { return v.Selector }).(pulumi.StringPtrOutput)
}

// (string) Name of the server type.
func (o LookupServerResultOutput) ServerType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.ServerType }).(pulumi.StringOutput)
}

// (string) The status of the server.
func (o LookupServerResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Status }).(pulumi.StringOutput)
}

func (o LookupServerResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServerResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func (o LookupServerResultOutput) WithStatuses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServerResult) []string { return v.WithStatuses }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServerResultOutput{})
}
