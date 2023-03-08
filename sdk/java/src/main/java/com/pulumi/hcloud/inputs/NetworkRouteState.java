// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkRouteState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkRouteState Empty = new NetworkRouteState();

    /**
     * Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<String> destination;

    /**
     * @return Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
     * 
     */
    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * ID of the Network the route should be added to.
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<Integer> networkId;

    /**
     * @return ID of the Network the route should be added to.
     * 
     */
    public Optional<Output<Integer>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    private NetworkRouteState() {}

    private NetworkRouteState(NetworkRouteState $) {
        this.destination = $.destination;
        this.gateway = $.gateway;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkRouteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkRouteState $;

        public Builder() {
            $ = new NetworkRouteState();
        }

        public Builder(NetworkRouteState defaults) {
            $ = new NetworkRouteState(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param gateway Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param networkId ID of the Network the route should be added to.
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<Integer> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId ID of the Network the route should be added to.
         * 
         * @return builder
         * 
         */
        public Builder networkId(Integer networkId) {
            return networkId(Output.of(networkId));
        }

        public NetworkRouteState build() {
            return $;
        }
    }

}