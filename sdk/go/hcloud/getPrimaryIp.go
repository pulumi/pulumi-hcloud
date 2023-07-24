// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a Hetzner Cloud Primary IP.
//
// This resource can be useful when you need to determine a Primary IP ID based on the IP address.
//
// Side note:
//
// If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created & attached.
// Currently, Primary IPs can be only attached to servers.
//
// ## Example Usage
//
// # Data Source: PrimaryIp
//
// Provides details about a Hetzner Cloud Primary IP.
// This resource can be useful when you need to determine a Primary IP ID based on the IP address.
// ### Additional Examples
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
//			_, err := hcloud.LookupPrimaryIp(ctx, &hcloud.LookupPrimaryIpArgs{
//				IpAddress: pulumi.StringRef("1.2.3.4"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.LookupPrimaryIp(ctx, &hcloud.LookupPrimaryIpArgs{
//				Name: pulumi.StringRef("primary_ip_1"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.LookupPrimaryIp(ctx, &hcloud.LookupPrimaryIpArgs{
//				WithSelector: pulumi.StringRef("key=value"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.NewServer(ctx, "serverTest", &hcloud.ServerArgs{
//				Image:      pulumi.String("ubuntu-20.04"),
//				ServerType: pulumi.String("cx11"),
//				Datacenter: pulumi.String("fsn1-dc14"),
//				Labels: pulumi.AnyMap{
//					"test": pulumi.Any("tessst1"),
//				},
//				PublicNets: hcloud.ServerPublicNetArray{
//					&hcloud.ServerPublicNetArgs{
//						Ipv4: pulumi.Any(hcloud_primary_ip.Ip_1.Id),
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
func LookupPrimaryIp(ctx *pulumi.Context, args *LookupPrimaryIpArgs, opts ...pulumi.InvokeOption) (*LookupPrimaryIpResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPrimaryIpResult
	err := ctx.Invoke("hcloud:index/getPrimaryIp:getPrimaryIp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrimaryIp.
type LookupPrimaryIpArgs struct {
	// (int) ID of the assigned resource.
	AssigneeId *int `pulumi:"assigneeId"`
	// ID of the Primary IP.
	Id *int `pulumi:"id"`
	// IP address of the Primary IP.
	IpAddress *string `pulumi:"ipAddress"`
	// Name of the Primary IP.
	Name *string `pulumi:"name"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getPrimaryIp.
type LookupPrimaryIpResult struct {
	// (int) ID of the assigned resource.
	AssigneeId int `pulumi:"assigneeId"`
	// (string) The type of the assigned resource.
	AssigneeType string `pulumi:"assigneeType"`
	// (bool) Whether auto delete is enabled.
	AutoDelete bool `pulumi:"autoDelete"`
	// (string) The datacenter name of the Primary IP.
	Datacenter string `pulumi:"datacenter"`
	// (bool) Whether delete protection is enabled.
	DeleteProtection bool `pulumi:"deleteProtection"`
	// (int) Unique ID of the Primary IP.
	Id int `pulumi:"id"`
	// (string) IP Address of the Primary IP.
	IpAddress string `pulumi:"ipAddress"`
	// (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
	IpNetwork string `pulumi:"ipNetwork"`
	// (string) Description of the Primary IP.
	Labels map[string]interface{} `pulumi:"labels"`
	// (string) Name of the Primary IP.
	Name *string `pulumi:"name"`
	// (string) Type of the Primary IP.
	Type         string  `pulumi:"type"`
	WithSelector *string `pulumi:"withSelector"`
}

func LookupPrimaryIpOutput(ctx *pulumi.Context, args LookupPrimaryIpOutputArgs, opts ...pulumi.InvokeOption) LookupPrimaryIpResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPrimaryIpResult, error) {
			args := v.(LookupPrimaryIpArgs)
			r, err := LookupPrimaryIp(ctx, &args, opts...)
			var s LookupPrimaryIpResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPrimaryIpResultOutput)
}

// A collection of arguments for invoking getPrimaryIp.
type LookupPrimaryIpOutputArgs struct {
	// (int) ID of the assigned resource.
	AssigneeId pulumi.IntPtrInput `pulumi:"assigneeId"`
	// ID of the Primary IP.
	Id pulumi.IntPtrInput `pulumi:"id"`
	// IP address of the Primary IP.
	IpAddress pulumi.StringPtrInput `pulumi:"ipAddress"`
	// Name of the Primary IP.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
}

func (LookupPrimaryIpOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrimaryIpArgs)(nil)).Elem()
}

// A collection of values returned by getPrimaryIp.
type LookupPrimaryIpResultOutput struct{ *pulumi.OutputState }

func (LookupPrimaryIpResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrimaryIpResult)(nil)).Elem()
}

func (o LookupPrimaryIpResultOutput) ToLookupPrimaryIpResultOutput() LookupPrimaryIpResultOutput {
	return o
}

func (o LookupPrimaryIpResultOutput) ToLookupPrimaryIpResultOutputWithContext(ctx context.Context) LookupPrimaryIpResultOutput {
	return o
}

// (int) ID of the assigned resource.
func (o LookupPrimaryIpResultOutput) AssigneeId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) int { return v.AssigneeId }).(pulumi.IntOutput)
}

// (string) The type of the assigned resource.
func (o LookupPrimaryIpResultOutput) AssigneeType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) string { return v.AssigneeType }).(pulumi.StringOutput)
}

// (bool) Whether auto delete is enabled.
func (o LookupPrimaryIpResultOutput) AutoDelete() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) bool { return v.AutoDelete }).(pulumi.BoolOutput)
}

// (string) The datacenter name of the Primary IP.
func (o LookupPrimaryIpResultOutput) Datacenter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) string { return v.Datacenter }).(pulumi.StringOutput)
}

// (bool) Whether delete protection is enabled.
func (o LookupPrimaryIpResultOutput) DeleteProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) bool { return v.DeleteProtection }).(pulumi.BoolOutput)
}

// (int) Unique ID of the Primary IP.
func (o LookupPrimaryIpResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) int { return v.Id }).(pulumi.IntOutput)
}

// (string) IP Address of the Primary IP.
func (o LookupPrimaryIpResultOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) string { return v.IpAddress }).(pulumi.StringOutput)
}

// (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
func (o LookupPrimaryIpResultOutput) IpNetwork() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) string { return v.IpNetwork }).(pulumi.StringOutput)
}

// (string) Description of the Primary IP.
func (o LookupPrimaryIpResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

// (string) Name of the Primary IP.
func (o LookupPrimaryIpResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// (string) Type of the Primary IP.
func (o LookupPrimaryIpResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) string { return v.Type }).(pulumi.StringOutput)
}

func (o LookupPrimaryIpResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPrimaryIpResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrimaryIpResultOutput{})
}
