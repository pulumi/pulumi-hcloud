// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedCertificateArgs Empty = new ManagedCertificateArgs();

    /**
     * Domain names for which a certificate
     * should be obtained.
     * 
     */
    @Import(name="domainNames", required=true)
    private Output<List<String>> domainNames;

    /**
     * @return Domain names for which a certificate
     * should be obtained.
     * 
     */
    public Output<List<String>> domainNames() {
        return this.domainNames;
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

    private ManagedCertificateArgs() {}

    private ManagedCertificateArgs(ManagedCertificateArgs $) {
        this.domainNames = $.domainNames;
        this.labels = $.labels;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedCertificateArgs $;

        public Builder() {
            $ = new ManagedCertificateArgs();
        }

        public Builder(ManagedCertificateArgs defaults) {
            $ = new ManagedCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainNames Domain names for which a certificate
         * should be obtained.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(Output<List<String>> domainNames) {
            $.domainNames = domainNames;
            return this;
        }

        /**
         * @param domainNames Domain names for which a certificate
         * should be obtained.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(List<String> domainNames) {
            return domainNames(Output.of(domainNames));
        }

        /**
         * @param domainNames Domain names for which a certificate
         * should be obtained.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
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

        public ManagedCertificateArgs build() {
            if ($.domainNames == null) {
                throw new MissingRequiredPropertyException("ManagedCertificateArgs", "domainNames");
            }
            return $;
        }
    }

}