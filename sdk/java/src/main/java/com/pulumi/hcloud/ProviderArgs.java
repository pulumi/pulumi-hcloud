// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    @Import(name="pollInterval")
    private @Nullable Output<String> pollInterval;

    public Optional<Output<String>> pollInterval() {
        return Optional.ofNullable(this.pollInterval);
    }

    /**
     * The API token to access the Hetzner cloud.
     * 
     */
    @Import(name="token", required=true)
    private Output<String> token;

    /**
     * @return The API token to access the Hetzner cloud.
     * 
     */
    public Output<String> token() {
        return this.token;
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.endpoint = $.endpoint;
        this.pollInterval = $.pollInterval;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder pollInterval(@Nullable Output<String> pollInterval) {
            $.pollInterval = pollInterval;
            return this;
        }

        public Builder pollInterval(String pollInterval) {
            return pollInterval(Output.of(pollInterval));
        }

        /**
         * @param token The API token to access the Hetzner cloud.
         * 
         * @return builder
         * 
         */
        public Builder token(Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The API token to access the Hetzner cloud.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public ProviderArgs build() {
            $.token = Objects.requireNonNull($.token, "expected parameter 'token' to be non-null");
            return $;
        }
    }

}