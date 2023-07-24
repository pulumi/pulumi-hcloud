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

// Obtain a Hetzner Cloud managed TLS certificate.
//
// ## Import
//
// # Managed certificates can be imported using their `id`hcl
//
// ```sh
//
//	$ pulumi import hcloud:index/managedCertificate:ManagedCertificate sample_certificate id
//
// ```
type ManagedCertificate struct {
	pulumi.CustomResourceState

	// (string) PEM encoded TLS certificate.
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
	Created pulumi.StringOutput `pulumi:"created"`
	// (list) Domains and subdomains covered by the certificate.
	DomainNames pulumi.StringArrayOutput `pulumi:"domainNames"`
	// (string) Fingerprint of the certificate.
	Fingerprint pulumi.StringOutput `pulumi:"fingerprint"`
	// User-defined labels (key-value pairs) the
	// certificate should be created with.
	Labels pulumi.MapOutput `pulumi:"labels"`
	// Name of the Certificate.
	Name pulumi.StringOutput `pulumi:"name"`
	// (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
	NotValidAfter pulumi.StringOutput `pulumi:"notValidAfter"`
	// (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
	NotValidBefore pulumi.StringOutput `pulumi:"notValidBefore"`
	Type           pulumi.StringOutput `pulumi:"type"`
}

// NewManagedCertificate registers a new resource with the given unique name, arguments, and options.
func NewManagedCertificate(ctx *pulumi.Context,
	name string, args *ManagedCertificateArgs, opts ...pulumi.ResourceOption) (*ManagedCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DomainNames == nil {
		return nil, errors.New("invalid value for required argument 'DomainNames'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ManagedCertificate
	err := ctx.RegisterResource("hcloud:index/managedCertificate:ManagedCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetManagedCertificate gets an existing ManagedCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetManagedCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ManagedCertificateState, opts ...pulumi.ResourceOption) (*ManagedCertificate, error) {
	var resource ManagedCertificate
	err := ctx.ReadResource("hcloud:index/managedCertificate:ManagedCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ManagedCertificate resources.
type managedCertificateState struct {
	// (string) PEM encoded TLS certificate.
	Certificate *string `pulumi:"certificate"`
	// (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
	Created *string `pulumi:"created"`
	// (list) Domains and subdomains covered by the certificate.
	DomainNames []string `pulumi:"domainNames"`
	// (string) Fingerprint of the certificate.
	Fingerprint *string `pulumi:"fingerprint"`
	// User-defined labels (key-value pairs) the
	// certificate should be created with.
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the Certificate.
	Name *string `pulumi:"name"`
	// (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
	NotValidAfter *string `pulumi:"notValidAfter"`
	// (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
	NotValidBefore *string `pulumi:"notValidBefore"`
	Type           *string `pulumi:"type"`
}

type ManagedCertificateState struct {
	// (string) PEM encoded TLS certificate.
	Certificate pulumi.StringPtrInput
	// (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
	Created pulumi.StringPtrInput
	// (list) Domains and subdomains covered by the certificate.
	DomainNames pulumi.StringArrayInput
	// (string) Fingerprint of the certificate.
	Fingerprint pulumi.StringPtrInput
	// User-defined labels (key-value pairs) the
	// certificate should be created with.
	Labels pulumi.MapInput
	// Name of the Certificate.
	Name pulumi.StringPtrInput
	// (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
	NotValidAfter pulumi.StringPtrInput
	// (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
	NotValidBefore pulumi.StringPtrInput
	Type           pulumi.StringPtrInput
}

func (ManagedCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*managedCertificateState)(nil)).Elem()
}

type managedCertificateArgs struct {
	// (list) Domains and subdomains covered by the certificate.
	DomainNames []string `pulumi:"domainNames"`
	// User-defined labels (key-value pairs) the
	// certificate should be created with.
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the Certificate.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a ManagedCertificate resource.
type ManagedCertificateArgs struct {
	// (list) Domains and subdomains covered by the certificate.
	DomainNames pulumi.StringArrayInput
	// User-defined labels (key-value pairs) the
	// certificate should be created with.
	Labels pulumi.MapInput
	// Name of the Certificate.
	Name pulumi.StringPtrInput
}

func (ManagedCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*managedCertificateArgs)(nil)).Elem()
}

type ManagedCertificateInput interface {
	pulumi.Input

	ToManagedCertificateOutput() ManagedCertificateOutput
	ToManagedCertificateOutputWithContext(ctx context.Context) ManagedCertificateOutput
}

func (*ManagedCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedCertificate)(nil)).Elem()
}

func (i *ManagedCertificate) ToManagedCertificateOutput() ManagedCertificateOutput {
	return i.ToManagedCertificateOutputWithContext(context.Background())
}

func (i *ManagedCertificate) ToManagedCertificateOutputWithContext(ctx context.Context) ManagedCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedCertificateOutput)
}

// ManagedCertificateArrayInput is an input type that accepts ManagedCertificateArray and ManagedCertificateArrayOutput values.
// You can construct a concrete instance of `ManagedCertificateArrayInput` via:
//
//	ManagedCertificateArray{ ManagedCertificateArgs{...} }
type ManagedCertificateArrayInput interface {
	pulumi.Input

	ToManagedCertificateArrayOutput() ManagedCertificateArrayOutput
	ToManagedCertificateArrayOutputWithContext(context.Context) ManagedCertificateArrayOutput
}

type ManagedCertificateArray []ManagedCertificateInput

func (ManagedCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedCertificate)(nil)).Elem()
}

func (i ManagedCertificateArray) ToManagedCertificateArrayOutput() ManagedCertificateArrayOutput {
	return i.ToManagedCertificateArrayOutputWithContext(context.Background())
}

func (i ManagedCertificateArray) ToManagedCertificateArrayOutputWithContext(ctx context.Context) ManagedCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedCertificateArrayOutput)
}

// ManagedCertificateMapInput is an input type that accepts ManagedCertificateMap and ManagedCertificateMapOutput values.
// You can construct a concrete instance of `ManagedCertificateMapInput` via:
//
//	ManagedCertificateMap{ "key": ManagedCertificateArgs{...} }
type ManagedCertificateMapInput interface {
	pulumi.Input

	ToManagedCertificateMapOutput() ManagedCertificateMapOutput
	ToManagedCertificateMapOutputWithContext(context.Context) ManagedCertificateMapOutput
}

type ManagedCertificateMap map[string]ManagedCertificateInput

func (ManagedCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedCertificate)(nil)).Elem()
}

func (i ManagedCertificateMap) ToManagedCertificateMapOutput() ManagedCertificateMapOutput {
	return i.ToManagedCertificateMapOutputWithContext(context.Background())
}

func (i ManagedCertificateMap) ToManagedCertificateMapOutputWithContext(ctx context.Context) ManagedCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ManagedCertificateMapOutput)
}

type ManagedCertificateOutput struct{ *pulumi.OutputState }

func (ManagedCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ManagedCertificate)(nil)).Elem()
}

func (o ManagedCertificateOutput) ToManagedCertificateOutput() ManagedCertificateOutput {
	return o
}

func (o ManagedCertificateOutput) ToManagedCertificateOutputWithContext(ctx context.Context) ManagedCertificateOutput {
	return o
}

// (string) PEM encoded TLS certificate.
func (o ManagedCertificateOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedCertificate) pulumi.StringOutput { return v.Certificate }).(pulumi.StringOutput)
}

// (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
func (o ManagedCertificateOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedCertificate) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// (list) Domains and subdomains covered by the certificate.
func (o ManagedCertificateOutput) DomainNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ManagedCertificate) pulumi.StringArrayOutput { return v.DomainNames }).(pulumi.StringArrayOutput)
}

// (string) Fingerprint of the certificate.
func (o ManagedCertificateOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedCertificate) pulumi.StringOutput { return v.Fingerprint }).(pulumi.StringOutput)
}

// User-defined labels (key-value pairs) the
// certificate should be created with.
func (o ManagedCertificateOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *ManagedCertificate) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Name of the Certificate.
func (o ManagedCertificateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedCertificate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
func (o ManagedCertificateOutput) NotValidAfter() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedCertificate) pulumi.StringOutput { return v.NotValidAfter }).(pulumi.StringOutput)
}

// (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
func (o ManagedCertificateOutput) NotValidBefore() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedCertificate) pulumi.StringOutput { return v.NotValidBefore }).(pulumi.StringOutput)
}

func (o ManagedCertificateOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ManagedCertificate) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ManagedCertificateArrayOutput struct{ *pulumi.OutputState }

func (ManagedCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ManagedCertificate)(nil)).Elem()
}

func (o ManagedCertificateArrayOutput) ToManagedCertificateArrayOutput() ManagedCertificateArrayOutput {
	return o
}

func (o ManagedCertificateArrayOutput) ToManagedCertificateArrayOutputWithContext(ctx context.Context) ManagedCertificateArrayOutput {
	return o
}

func (o ManagedCertificateArrayOutput) Index(i pulumi.IntInput) ManagedCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ManagedCertificate {
		return vs[0].([]*ManagedCertificate)[vs[1].(int)]
	}).(ManagedCertificateOutput)
}

type ManagedCertificateMapOutput struct{ *pulumi.OutputState }

func (ManagedCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ManagedCertificate)(nil)).Elem()
}

func (o ManagedCertificateMapOutput) ToManagedCertificateMapOutput() ManagedCertificateMapOutput {
	return o
}

func (o ManagedCertificateMapOutput) ToManagedCertificateMapOutputWithContext(ctx context.Context) ManagedCertificateMapOutput {
	return o
}

func (o ManagedCertificateMapOutput) MapIndex(k pulumi.StringInput) ManagedCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ManagedCertificate {
		return vs[0].(map[string]*ManagedCertificate)[vs[1].(string)]
	}).(ManagedCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedCertificateInput)(nil)).Elem(), &ManagedCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedCertificateArrayInput)(nil)).Elem(), ManagedCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ManagedCertificateMapInput)(nil)).Elem(), ManagedCertificateMap{})
	pulumi.RegisterOutputType(ManagedCertificateOutput{})
	pulumi.RegisterOutputType(ManagedCertificateArrayOutput{})
	pulumi.RegisterOutputType(ManagedCertificateMapOutput{})
}
