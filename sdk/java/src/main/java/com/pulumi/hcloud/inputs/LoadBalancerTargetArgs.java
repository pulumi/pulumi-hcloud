// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerTargetArgs Empty = new LoadBalancerTargetArgs();

    @Import(name="serverId")
    private @Nullable Output<Integer> serverId;

    public Optional<Output<Integer>> serverId() {
        return Optional.ofNullable(this.serverId);
    }

    /**
     * Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * @deprecated
     * Does not work. Use the hcloud.LoadBalancerTarget resource instead.
     * 
     */
    @Deprecated /* Does not work. Use the hcloud.LoadBalancerTarget resource instead. */
    @Import(name="usePrivateIp")
    private @Nullable Output<Boolean> usePrivateIp;

    /**
     * @deprecated
     * Does not work. Use the hcloud.LoadBalancerTarget resource instead.
     * 
     */
    @Deprecated /* Does not work. Use the hcloud.LoadBalancerTarget resource instead. */
    public Optional<Output<Boolean>> usePrivateIp() {
        return Optional.ofNullable(this.usePrivateIp);
    }

    private LoadBalancerTargetArgs() {}

    private LoadBalancerTargetArgs(LoadBalancerTargetArgs $) {
        this.serverId = $.serverId;
        this.type = $.type;
        this.usePrivateIp = $.usePrivateIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerTargetArgs $;

        public Builder() {
            $ = new LoadBalancerTargetArgs();
        }

        public Builder(LoadBalancerTargetArgs defaults) {
            $ = new LoadBalancerTargetArgs(Objects.requireNonNull(defaults));
        }

        public Builder serverId(@Nullable Output<Integer> serverId) {
            $.serverId = serverId;
            return this;
        }

        public Builder serverId(Integer serverId) {
            return serverId(Output.of(serverId));
        }

        /**
         * @param type Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Does not work. Use the hcloud.LoadBalancerTarget resource instead.
         * 
         */
        @Deprecated /* Does not work. Use the hcloud.LoadBalancerTarget resource instead. */
        public Builder usePrivateIp(@Nullable Output<Boolean> usePrivateIp) {
            $.usePrivateIp = usePrivateIp;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Does not work. Use the hcloud.LoadBalancerTarget resource instead.
         * 
         */
        @Deprecated /* Does not work. Use the hcloud.LoadBalancerTarget resource instead. */
        public Builder usePrivateIp(Boolean usePrivateIp) {
            return usePrivateIp(Output.of(usePrivateIp));
        }

        public LoadBalancerTargetArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("LoadBalancerTargetArgs", "type");
            }
            return $;
        }
    }

}
