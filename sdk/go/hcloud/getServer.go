// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

func LookupServer(ctx *pulumi.Context, args *LookupServerArgs, opts ...pulumi.InvokeOption) (*LookupServerResult, error) {
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
	// Deprecated: Please use the with_selector property instead.
	Selector *string `pulumi:"selector"`
	// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
	WithSelector *string `pulumi:"withSelector"`
	// List only servers with the specified status, could contain `initializing`, `starting`, `running`, `stopping`, `off`, `deleting`, `rebuilding`, `migrating`, `unknown`.
	WithStatuses []string `pulumi:"withStatuses"`
}

// A collection of values returned by getServer.
type LookupServerResult struct {
	// (string) The backup window of the server, if enabled.
	BackupWindow string `pulumi:"backupWindow"`
	// (boolean) Whether backups are enabled.
	Backups bool `pulumi:"backups"`
	// (string) The datacenter name.
	Datacenter string `pulumi:"datacenter"`
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
	// (string) ID or Name of the mounted ISO image.
	Iso string `pulumi:"iso"`
	// (map) User-defined labels (key-value pairs)
	Labels map[string]interface{} `pulumi:"labels"`
	// (string) The location name.
	Location string `pulumi:"location"`
	// (string) Name of the server.
	Name   string `pulumi:"name"`
	Rescue string `pulumi:"rescue"`
	// Deprecated: Please use the with_selector property instead.
	Selector *string `pulumi:"selector"`
	// (string) Name of the server type.
	ServerType string `pulumi:"serverType"`
	// (string) The status of the server.
	Status       string   `pulumi:"status"`
	WithSelector *string  `pulumi:"withSelector"`
	WithStatuses []string `pulumi:"withStatuses"`
}
