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
import java.lang.Object;
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
 * Uploaded certificates can be imported using their `id`hcl
 * 
 * ```sh
 *  $ pulumi import hcloud:index/uploadedCertificate:UploadedCertificate sample_certificate id
 * ```
 * 
 */
@ResourceType(type="hcloud:index/uploadedCertificate:UploadedCertificate")
public class UploadedCertificate extends com.pulumi.resources.CustomResource {
    /**
     * PEM encoded TLS certificate.
     * 
     */
    @Export(name="certificate", type=String.class, parameters={})
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
    @Export(name="created", type=String.class, parameters={})
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
    @Export(name="domainNames", type=List.class, parameters={String.class})
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
    @Export(name="fingerprint", type=String.class, parameters={})
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
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> labels;

    /**
     * @return User-defined labels (key-value pairs) the
     * certificate should be created with.
     * 
     */
    public Output<Optional<Map<String,Object>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Name of the Certificate.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="notValidAfter", type=String.class, parameters={})
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
    @Export(name="notValidBefore", type=String.class, parameters={})
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
    @Export(name="privateKey", type=String.class, parameters={})
    private Output<String> privateKey;

    /**
     * @return PEM encoded private key belonging to the certificate.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UploadedCertificate(String name) {
        this(name, UploadedCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UploadedCertificate(String name, UploadedCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UploadedCertificate(String name, UploadedCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/uploadedCertificate:UploadedCertificate", name, args == null ? UploadedCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UploadedCertificate(String name, Output<String> id, @Nullable UploadedCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/uploadedCertificate:UploadedCertificate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static UploadedCertificate get(String name, Output<String> id, @Nullable UploadedCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UploadedCertificate(name, id, state, options);
    }
}
