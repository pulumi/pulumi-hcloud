// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific Hetzner Cloud Certificate.
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := hcloud.LookupCertificate(ctx, &hcloud.LookupCertificateArgs{
//				Name: pulumi.StringRef("sample-certificate-1"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = hcloud.LookupCertificate(ctx, &hcloud.LookupCertificateArgs{
//				Id: pulumi.IntRef(4711),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupCertificate(ctx *pulumi.Context, args *LookupCertificateArgs, opts ...pulumi.InvokeOption) (*LookupCertificateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCertificateResult
	err := ctx.Invoke("hcloud:index/getCertificate:getCertificate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCertificate.
type LookupCertificateArgs struct {
	// ID of the certificate.
	Id *int `pulumi:"id"`
	// Name of the certificate.
	Name *string `pulumi:"name"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector *string `pulumi:"withSelector"`
}

// A collection of values returned by getCertificate.
type LookupCertificateResult struct {
	// (string) PEM encoded TLS certificate.
	Certificate string `pulumi:"certificate"`
	// (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
	Created string `pulumi:"created"`
	// (list) Domains and subdomains covered by the certificate.
	DomainNames []string `pulumi:"domainNames"`
	// (string) Fingerprint of the certificate.
	Fingerprint string `pulumi:"fingerprint"`
	// (int) Unique ID of the certificate.
	Id int `pulumi:"id"`
	// (map) User-defined labels (key-value pairs) assigned to the certificate.
	Labels map[string]interface{} `pulumi:"labels"`
	// (string) Name of the Certificate.
	Name *string `pulumi:"name"`
	// (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
	NotValidAfter string `pulumi:"notValidAfter"`
	// (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
	NotValidBefore string  `pulumi:"notValidBefore"`
	Type           string  `pulumi:"type"`
	WithSelector   *string `pulumi:"withSelector"`
}

func LookupCertificateOutput(ctx *pulumi.Context, args LookupCertificateOutputArgs, opts ...pulumi.InvokeOption) LookupCertificateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCertificateResult, error) {
			args := v.(LookupCertificateArgs)
			r, err := LookupCertificate(ctx, &args, opts...)
			var s LookupCertificateResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCertificateResultOutput)
}

// A collection of arguments for invoking getCertificate.
type LookupCertificateOutputArgs struct {
	// ID of the certificate.
	Id pulumi.IntPtrInput `pulumi:"id"`
	// Name of the certificate.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
	WithSelector pulumi.StringPtrInput `pulumi:"withSelector"`
}

func (LookupCertificateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCertificateArgs)(nil)).Elem()
}

// A collection of values returned by getCertificate.
type LookupCertificateResultOutput struct{ *pulumi.OutputState }

func (LookupCertificateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCertificateResult)(nil)).Elem()
}

func (o LookupCertificateResultOutput) ToLookupCertificateResultOutput() LookupCertificateResultOutput {
	return o
}

func (o LookupCertificateResultOutput) ToLookupCertificateResultOutputWithContext(ctx context.Context) LookupCertificateResultOutput {
	return o
}

// (string) PEM encoded TLS certificate.
func (o LookupCertificateResultOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Certificate }).(pulumi.StringOutput)
}

// (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
func (o LookupCertificateResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Created }).(pulumi.StringOutput)
}

// (list) Domains and subdomains covered by the certificate.
func (o LookupCertificateResultOutput) DomainNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupCertificateResult) []string { return v.DomainNames }).(pulumi.StringArrayOutput)
}

// (string) Fingerprint of the certificate.
func (o LookupCertificateResultOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Fingerprint }).(pulumi.StringOutput)
}

// (int) Unique ID of the certificate.
func (o LookupCertificateResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCertificateResult) int { return v.Id }).(pulumi.IntOutput)
}

// (map) User-defined labels (key-value pairs) assigned to the certificate.
func (o LookupCertificateResultOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v LookupCertificateResult) map[string]interface{} { return v.Labels }).(pulumi.MapOutput)
}

// (string) Name of the Certificate.
func (o LookupCertificateResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupCertificateResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
func (o LookupCertificateResultOutput) NotValidAfter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.NotValidAfter }).(pulumi.StringOutput)
}

// (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
func (o LookupCertificateResultOutput) NotValidBefore() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.NotValidBefore }).(pulumi.StringOutput)
}

func (o LookupCertificateResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateResult) string { return v.Type }).(pulumi.StringOutput)
}

func (o LookupCertificateResultOutput) WithSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupCertificateResult) *string { return v.WithSelector }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCertificateResultOutput{})
}
