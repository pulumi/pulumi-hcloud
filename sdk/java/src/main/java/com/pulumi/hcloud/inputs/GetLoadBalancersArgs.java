// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoadBalancersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancersArgs Empty = new GetLoadBalancersArgs();

    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     * 
     */
    @Import(name="withSelector")
    private @Nullable Output<String> withSelector;

    /**
     * @return [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     * 
     */
    public Optional<Output<String>> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    private GetLoadBalancersArgs() {}

    private GetLoadBalancersArgs(GetLoadBalancersArgs $) {
        this.withSelector = $.withSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancersArgs $;

        public Builder() {
            $ = new GetLoadBalancersArgs();
        }

        public Builder(GetLoadBalancersArgs defaults) {
            $ = new GetLoadBalancersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param withSelector [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
         * 
         * @return builder
         * 
         */
        public Builder withSelector(@Nullable Output<String> withSelector) {
            $.withSelector = withSelector;
            return this;
        }

        /**
         * @param withSelector [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
         * 
         * @return builder
         * 
         */
        public Builder withSelector(String withSelector) {
            return withSelector(Output.of(withSelector));
        }

        public GetLoadBalancersArgs build() {
            return $;
        }
    }

}
