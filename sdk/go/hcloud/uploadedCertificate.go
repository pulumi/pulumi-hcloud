// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Upload a TLS certificate to Hetzner Cloud.
//
// ## Import
//
// # Uploaded certificates can be imported using their `id`hcl
//
// ```sh
//
//	$ pulumi import hcloud:index/uploadedCertificate:UploadedCertificate sample_certificate id
//
// ```
type UploadedCertificate struct {
	pulumi.CustomResourceState

	// PEM encoded TLS certificate.
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
	// PEM encoded private key belonging to the certificate.
	PrivateKey pulumi.StringOutput `pulumi:"privateKey"`
	Type       pulumi.StringOutput `pulumi:"type"`
}

// NewUploadedCertificate registers a new resource with the given unique name, arguments, and options.
func NewUploadedCertificate(ctx *pulumi.Context,
	name string, args *UploadedCertificateArgs, opts ...pulumi.ResourceOption) (*UploadedCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Certificate == nil {
		return nil, errors.New("invalid value for required argument 'Certificate'")
	}
	if args.PrivateKey == nil {
		return nil, errors.New("invalid value for required argument 'PrivateKey'")
	}
	if args.PrivateKey != nil {
		args.PrivateKey = pulumi.ToSecret(args.PrivateKey).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"privateKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UploadedCertificate
	err := ctx.RegisterResource("hcloud:index/uploadedCertificate:UploadedCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUploadedCertificate gets an existing UploadedCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUploadedCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UploadedCertificateState, opts ...pulumi.ResourceOption) (*UploadedCertificate, error) {
	var resource UploadedCertificate
	err := ctx.ReadResource("hcloud:index/uploadedCertificate:UploadedCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UploadedCertificate resources.
type uploadedCertificateState struct {
	// PEM encoded TLS certificate.
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
	// PEM encoded private key belonging to the certificate.
	PrivateKey *string `pulumi:"privateKey"`
	Type       *string `pulumi:"type"`
}

type UploadedCertificateState struct {
	// PEM encoded TLS certificate.
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
	// PEM encoded private key belonging to the certificate.
	PrivateKey pulumi.StringPtrInput
	Type       pulumi.StringPtrInput
}

func (UploadedCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*uploadedCertificateState)(nil)).Elem()
}

type uploadedCertificateArgs struct {
	// PEM encoded TLS certificate.
	Certificate string `pulumi:"certificate"`
	// User-defined labels (key-value pairs) the
	// certificate should be created with.
	Labels map[string]interface{} `pulumi:"labels"`
	// Name of the Certificate.
	Name *string `pulumi:"name"`
	// PEM encoded private key belonging to the certificate.
	PrivateKey string `pulumi:"privateKey"`
}

// The set of arguments for constructing a UploadedCertificate resource.
type UploadedCertificateArgs struct {
	// PEM encoded TLS certificate.
	Certificate pulumi.StringInput
	// User-defined labels (key-value pairs) the
	// certificate should be created with.
	Labels pulumi.MapInput
	// Name of the Certificate.
	Name pulumi.StringPtrInput
	// PEM encoded private key belonging to the certificate.
	PrivateKey pulumi.StringInput
}

func (UploadedCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*uploadedCertificateArgs)(nil)).Elem()
}

type UploadedCertificateInput interface {
	pulumi.Input

	ToUploadedCertificateOutput() UploadedCertificateOutput
	ToUploadedCertificateOutputWithContext(ctx context.Context) UploadedCertificateOutput
}

func (*UploadedCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**UploadedCertificate)(nil)).Elem()
}

func (i *UploadedCertificate) ToUploadedCertificateOutput() UploadedCertificateOutput {
	return i.ToUploadedCertificateOutputWithContext(context.Background())
}

func (i *UploadedCertificate) ToUploadedCertificateOutputWithContext(ctx context.Context) UploadedCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UploadedCertificateOutput)
}

func (i *UploadedCertificate) ToOutput(ctx context.Context) pulumix.Output[*UploadedCertificate] {
	return pulumix.Output[*UploadedCertificate]{
		OutputState: i.ToUploadedCertificateOutputWithContext(ctx).OutputState,
	}
}

// UploadedCertificateArrayInput is an input type that accepts UploadedCertificateArray and UploadedCertificateArrayOutput values.
// You can construct a concrete instance of `UploadedCertificateArrayInput` via:
//
//	UploadedCertificateArray{ UploadedCertificateArgs{...} }
type UploadedCertificateArrayInput interface {
	pulumi.Input

	ToUploadedCertificateArrayOutput() UploadedCertificateArrayOutput
	ToUploadedCertificateArrayOutputWithContext(context.Context) UploadedCertificateArrayOutput
}

type UploadedCertificateArray []UploadedCertificateInput

func (UploadedCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UploadedCertificate)(nil)).Elem()
}

func (i UploadedCertificateArray) ToUploadedCertificateArrayOutput() UploadedCertificateArrayOutput {
	return i.ToUploadedCertificateArrayOutputWithContext(context.Background())
}

func (i UploadedCertificateArray) ToUploadedCertificateArrayOutputWithContext(ctx context.Context) UploadedCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UploadedCertificateArrayOutput)
}

func (i UploadedCertificateArray) ToOutput(ctx context.Context) pulumix.Output[[]*UploadedCertificate] {
	return pulumix.Output[[]*UploadedCertificate]{
		OutputState: i.ToUploadedCertificateArrayOutputWithContext(ctx).OutputState,
	}
}

// UploadedCertificateMapInput is an input type that accepts UploadedCertificateMap and UploadedCertificateMapOutput values.
// You can construct a concrete instance of `UploadedCertificateMapInput` via:
//
//	UploadedCertificateMap{ "key": UploadedCertificateArgs{...} }
type UploadedCertificateMapInput interface {
	pulumi.Input

	ToUploadedCertificateMapOutput() UploadedCertificateMapOutput
	ToUploadedCertificateMapOutputWithContext(context.Context) UploadedCertificateMapOutput
}

type UploadedCertificateMap map[string]UploadedCertificateInput

func (UploadedCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UploadedCertificate)(nil)).Elem()
}

func (i UploadedCertificateMap) ToUploadedCertificateMapOutput() UploadedCertificateMapOutput {
	return i.ToUploadedCertificateMapOutputWithContext(context.Background())
}

func (i UploadedCertificateMap) ToUploadedCertificateMapOutputWithContext(ctx context.Context) UploadedCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UploadedCertificateMapOutput)
}

func (i UploadedCertificateMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*UploadedCertificate] {
	return pulumix.Output[map[string]*UploadedCertificate]{
		OutputState: i.ToUploadedCertificateMapOutputWithContext(ctx).OutputState,
	}
}

type UploadedCertificateOutput struct{ *pulumi.OutputState }

func (UploadedCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UploadedCertificate)(nil)).Elem()
}

func (o UploadedCertificateOutput) ToUploadedCertificateOutput() UploadedCertificateOutput {
	return o
}

func (o UploadedCertificateOutput) ToUploadedCertificateOutputWithContext(ctx context.Context) UploadedCertificateOutput {
	return o
}

func (o UploadedCertificateOutput) ToOutput(ctx context.Context) pulumix.Output[*UploadedCertificate] {
	return pulumix.Output[*UploadedCertificate]{
		OutputState: o.OutputState,
	}
}

// PEM encoded TLS certificate.
func (o UploadedCertificateOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v *UploadedCertificate) pulumi.StringOutput { return v.Certificate }).(pulumi.StringOutput)
}

// (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
func (o UploadedCertificateOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *UploadedCertificate) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// (list) Domains and subdomains covered by the certificate.
func (o UploadedCertificateOutput) DomainNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *UploadedCertificate) pulumi.StringArrayOutput { return v.DomainNames }).(pulumi.StringArrayOutput)
}

// (string) Fingerprint of the certificate.
func (o UploadedCertificateOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v *UploadedCertificate) pulumi.StringOutput { return v.Fingerprint }).(pulumi.StringOutput)
}

// User-defined labels (key-value pairs) the
// certificate should be created with.
func (o UploadedCertificateOutput) Labels() pulumi.MapOutput {
	return o.ApplyT(func(v *UploadedCertificate) pulumi.MapOutput { return v.Labels }).(pulumi.MapOutput)
}

// Name of the Certificate.
func (o UploadedCertificateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *UploadedCertificate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
func (o UploadedCertificateOutput) NotValidAfter() pulumi.StringOutput {
	return o.ApplyT(func(v *UploadedCertificate) pulumi.StringOutput { return v.NotValidAfter }).(pulumi.StringOutput)
}

// (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
func (o UploadedCertificateOutput) NotValidBefore() pulumi.StringOutput {
	return o.ApplyT(func(v *UploadedCertificate) pulumi.StringOutput { return v.NotValidBefore }).(pulumi.StringOutput)
}

// PEM encoded private key belonging to the certificate.
func (o UploadedCertificateOutput) PrivateKey() pulumi.StringOutput {
	return o.ApplyT(func(v *UploadedCertificate) pulumi.StringOutput { return v.PrivateKey }).(pulumi.StringOutput)
}

func (o UploadedCertificateOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *UploadedCertificate) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type UploadedCertificateArrayOutput struct{ *pulumi.OutputState }

func (UploadedCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UploadedCertificate)(nil)).Elem()
}

func (o UploadedCertificateArrayOutput) ToUploadedCertificateArrayOutput() UploadedCertificateArrayOutput {
	return o
}

func (o UploadedCertificateArrayOutput) ToUploadedCertificateArrayOutputWithContext(ctx context.Context) UploadedCertificateArrayOutput {
	return o
}

func (o UploadedCertificateArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*UploadedCertificate] {
	return pulumix.Output[[]*UploadedCertificate]{
		OutputState: o.OutputState,
	}
}

func (o UploadedCertificateArrayOutput) Index(i pulumi.IntInput) UploadedCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UploadedCertificate {
		return vs[0].([]*UploadedCertificate)[vs[1].(int)]
	}).(UploadedCertificateOutput)
}

type UploadedCertificateMapOutput struct{ *pulumi.OutputState }

func (UploadedCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UploadedCertificate)(nil)).Elem()
}

func (o UploadedCertificateMapOutput) ToUploadedCertificateMapOutput() UploadedCertificateMapOutput {
	return o
}

func (o UploadedCertificateMapOutput) ToUploadedCertificateMapOutputWithContext(ctx context.Context) UploadedCertificateMapOutput {
	return o
}

func (o UploadedCertificateMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*UploadedCertificate] {
	return pulumix.Output[map[string]*UploadedCertificate]{
		OutputState: o.OutputState,
	}
}

func (o UploadedCertificateMapOutput) MapIndex(k pulumi.StringInput) UploadedCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UploadedCertificate {
		return vs[0].(map[string]*UploadedCertificate)[vs[1].(string)]
	}).(UploadedCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UploadedCertificateInput)(nil)).Elem(), &UploadedCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*UploadedCertificateArrayInput)(nil)).Elem(), UploadedCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UploadedCertificateMapInput)(nil)).Elem(), UploadedCertificateMap{})
	pulumi.RegisterOutputType(UploadedCertificateOutput{})
	pulumi.RegisterOutputType(UploadedCertificateArrayOutput{})
	pulumi.RegisterOutputType(UploadedCertificateMapOutput{})
}
