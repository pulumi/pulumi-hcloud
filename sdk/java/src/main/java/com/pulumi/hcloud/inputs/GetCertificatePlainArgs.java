// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificatePlainArgs Empty = new GetCertificatePlainArgs();

    /**
     * ID of the certificate.
     * 
     */
    @Import(name="id")
    private @Nullable Integer id;

    /**
     * @return ID of the certificate.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the certificate.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the certificate.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     * 
     */
    @Import(name="withSelector")
    private @Nullable String withSelector;

    /**
     * @return [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     * 
     */
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    private GetCertificatePlainArgs() {}

    private GetCertificatePlainArgs(GetCertificatePlainArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.withSelector = $.withSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificatePlainArgs $;

        public Builder() {
            $ = new GetCertificatePlainArgs();
        }

        public Builder(GetCertificatePlainArgs defaults) {
            $ = new GetCertificatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param name Name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param withSelector [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
         * 
         * @return builder
         * 
         */
        public Builder withSelector(@Nullable String withSelector) {
            $.withSelector = withSelector;
            return this;
        }

        public GetCertificatePlainArgs build() {
            return $;
        }
    }

}
