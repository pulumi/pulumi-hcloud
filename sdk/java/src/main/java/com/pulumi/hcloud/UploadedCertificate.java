// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.UploadedCertificateArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.UploadedCertificateState;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Upload a TLS certificate to Hetzner Cloud.
 * 
 * ## Import
 * 
 * Uploaded certificates can be imported using their `id`:
 * 
 * hcl
 * 
 * ```sh
 * $ pulumi import hcloud:index/uploadedCertificate:UploadedCertificate sample_certificate id
 * ```
 * 
 */
@ResourceType(type="hcloud:index/uploadedCertificate:UploadedCertificate")
public class UploadedCertificate extends com.pulumi.resources.CustomResource {
    /**
     * PEM encoded TLS certificate.
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output<String> certificate;

    /**
     * @return PEM encoded TLS certificate.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    /**
     * (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * (list) Domains and subdomains covered by the certificate.
     * 
     */
    @Export(name="domainNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> domainNames;

    /**
     * @return (list) Domains and subdomains covered by the certificate.
     * 
     */
    public Output<List<String>> domainNames() {
        return this.domainNames;
    }
    /**
     * (string) Fingerprint of the certificate.
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output<String> fingerprint;

    /**
     * @return (string) Fingerprint of the certificate.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * User-defined labels (key-value pairs) the
     * certificate should be created with.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User-defined labels (key-value pairs) the
     * certificate should be created with.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Name of the Certificate.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Certificate.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
     * 
     */
    @Export(name="notValidAfter", refs={String.class}, tree="[0]")
    private Output<String> notValidAfter;

    /**
     * @return (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
     * 
     */
    public Output<String> notValidAfter() {
        return this.notValidAfter;
    }
    /**
     * (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
     * 
     */
    @Export(name="notValidBefore", refs={String.class}, tree="[0]")
    private Output<String> notValidBefore;

    /**
     * @return (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
     * 
     */
    public Output<String> notValidBefore() {
        return this.notValidBefore;
    }
    /**
     * PEM encoded private key belonging to the certificate.
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output<String> privateKey;

    /**
     * @return PEM encoded private key belonging to the certificate.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UploadedCertificate(java.lang.String name) {
        this(name, UploadedCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UploadedCertificate(java.lang.String name, UploadedCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UploadedCertificate(java.lang.String name, UploadedCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/uploadedCertificate:UploadedCertificate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private UploadedCertificate(java.lang.String name, Output<java.lang.String> id, @Nullable UploadedCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/uploadedCertificate:UploadedCertificate", name, state, makeResourceOptions(options, id), false);
    }

    private static UploadedCertificateArgs makeArgs(UploadedCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UploadedCertificateArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "privateKey"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static UploadedCertificate get(java.lang.String name, Output<java.lang.String> id, @Nullable UploadedCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UploadedCertificate(name, id, state, options);
    }
}
