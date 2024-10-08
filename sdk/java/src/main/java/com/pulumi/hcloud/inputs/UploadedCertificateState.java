// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UploadedCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final UploadedCertificateState Empty = new UploadedCertificateState();

    /**
     * PEM encoded TLS certificate.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return PEM encoded TLS certificate.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * (list) Domains and subdomains covered by the certificate.
     * 
     */
    @Import(name="domainNames")
    private @Nullable Output<List<String>> domainNames;

    /**
     * @return (list) Domains and subdomains covered by the certificate.
     * 
     */
    public Optional<Output<List<String>>> domainNames() {
        return Optional.ofNullable(this.domainNames);
    }

    /**
     * (string) Fingerprint of the certificate.
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    /**
     * @return (string) Fingerprint of the certificate.
     * 
     */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * User-defined labels (key-value pairs) the
     * certificate should be created with.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels (key-value pairs) the
     * certificate should be created with.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the Certificate.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Certificate.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
     * 
     */
    @Import(name="notValidAfter")
    private @Nullable Output<String> notValidAfter;

    /**
     * @return (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
     * 
     */
    public Optional<Output<String>> notValidAfter() {
        return Optional.ofNullable(this.notValidAfter);
    }

    /**
     * (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
     * 
     */
    @Import(name="notValidBefore")
    private @Nullable Output<String> notValidBefore;

    /**
     * @return (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
     * 
     */
    public Optional<Output<String>> notValidBefore() {
        return Optional.ofNullable(this.notValidBefore);
    }

    /**
     * PEM encoded private key belonging to the certificate.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return PEM encoded private key belonging to the certificate.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private UploadedCertificateState() {}

    private UploadedCertificateState(UploadedCertificateState $) {
        this.certificate = $.certificate;
        this.created = $.created;
        this.domainNames = $.domainNames;
        this.fingerprint = $.fingerprint;
        this.labels = $.labels;
        this.name = $.name;
        this.notValidAfter = $.notValidAfter;
        this.notValidBefore = $.notValidBefore;
        this.privateKey = $.privateKey;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UploadedCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UploadedCertificateState $;

        public Builder() {
            $ = new UploadedCertificateState();
        }

        public Builder(UploadedCertificateState defaults) {
            $ = new UploadedCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate PEM encoded TLS certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate PEM encoded TLS certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param created (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param domainNames (list) Domains and subdomains covered by the certificate.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(@Nullable Output<List<String>> domainNames) {
            $.domainNames = domainNames;
            return this;
        }

        /**
         * @param domainNames (list) Domains and subdomains covered by the certificate.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(List<String> domainNames) {
            return domainNames(Output.of(domainNames));
        }

        /**
         * @param domainNames (list) Domains and subdomains covered by the certificate.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }

        /**
         * @param fingerprint (string) Fingerprint of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint (string) Fingerprint of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param labels User-defined labels (key-value pairs) the
         * certificate should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels (key-value pairs) the
         * certificate should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the Certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notValidAfter (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
         * 
         * @return builder
         * 
         */
        public Builder notValidAfter(@Nullable Output<String> notValidAfter) {
            $.notValidAfter = notValidAfter;
            return this;
        }

        /**
         * @param notValidAfter (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
         * 
         * @return builder
         * 
         */
        public Builder notValidAfter(String notValidAfter) {
            return notValidAfter(Output.of(notValidAfter));
        }

        /**
         * @param notValidBefore (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
         * 
         * @return builder
         * 
         */
        public Builder notValidBefore(@Nullable Output<String> notValidBefore) {
            $.notValidBefore = notValidBefore;
            return this;
        }

        /**
         * @param notValidBefore (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
         * 
         * @return builder
         * 
         */
        public Builder notValidBefore(String notValidBefore) {
            return notValidBefore(Output.of(notValidBefore));
        }

        /**
         * @param privateKey PEM encoded private key belonging to the certificate.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey PEM encoded private key belonging to the certificate.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public UploadedCertificateState build() {
            return $;
        }
    }

}
