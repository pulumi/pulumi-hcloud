// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFloatingIpsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFloatingIpsPlainArgs Empty = new GetFloatingIpsPlainArgs();

    /**
     * [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
     * 
     */
    @Import(name="withSelector")
    private @Nullable String withSelector;

    /**
     * @return [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
     * 
     */
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    private GetFloatingIpsPlainArgs() {}

    private GetFloatingIpsPlainArgs(GetFloatingIpsPlainArgs $) {
        this.withSelector = $.withSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFloatingIpsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFloatingIpsPlainArgs $;

        public Builder() {
            $ = new GetFloatingIpsPlainArgs();
        }

        public Builder(GetFloatingIpsPlainArgs defaults) {
            $ = new GetFloatingIpsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param withSelector [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
         * 
         * @return builder
         * 
         */
        public Builder withSelector(@Nullable String withSelector) {
            $.withSelector = withSelector;
            return this;
        }

        public GetFloatingIpsPlainArgs build() {
            return $;
        }
    }

}
