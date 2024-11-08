// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RdnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RdnsArgs Empty = new RdnsArgs();

    /**
     * The DNS address the `ip_address` should resolve to.
     * 
     */
    @Import(name="dnsPtr", required=true)
    private Output<String> dnsPtr;

    /**
     * @return The DNS address the `ip_address` should resolve to.
     * 
     */
    public Output<String> dnsPtr() {
        return this.dnsPtr;
    }

    /**
     * The Floating IP the `ip_address` belongs to.
     * 
     */
    @Import(name="floatingIpId")
    private @Nullable Output<Integer> floatingIpId;

    /**
     * @return The Floating IP the `ip_address` belongs to.
     * 
     */
    public Optional<Output<Integer>> floatingIpId() {
        return Optional.ofNullable(this.floatingIpId);
    }

    /**
     * The IP address that should point to `dns_ptr`.
     * 
     */
    @Import(name="ipAddress", required=true)
    private Output<String> ipAddress;

    /**
     * @return The IP address that should point to `dns_ptr`.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }

    /**
     * The Load Balancer the `ip_address` belongs to.
     * 
     */
    @Import(name="loadBalancerId")
    private @Nullable Output<Integer> loadBalancerId;

    /**
     * @return The Load Balancer the `ip_address` belongs to.
     * 
     */
    public Optional<Output<Integer>> loadBalancerId() {
        return Optional.ofNullable(this.loadBalancerId);
    }

    /**
     * The Primary IP the `ip_address` belongs to.
     * 
     */
    @Import(name="primaryIpId")
    private @Nullable Output<Integer> primaryIpId;

    /**
     * @return The Primary IP the `ip_address` belongs to.
     * 
     */
    public Optional<Output<Integer>> primaryIpId() {
        return Optional.ofNullable(this.primaryIpId);
    }

    /**
     * The server the `ip_address` belongs to.
     * 
     */
    @Import(name="serverId")
    private @Nullable Output<Integer> serverId;

    /**
     * @return The server the `ip_address` belongs to.
     * 
     */
    public Optional<Output<Integer>> serverId() {
        return Optional.ofNullable(this.serverId);
    }

    private RdnsArgs() {}

    private RdnsArgs(RdnsArgs $) {
        this.dnsPtr = $.dnsPtr;
        this.floatingIpId = $.floatingIpId;
        this.ipAddress = $.ipAddress;
        this.loadBalancerId = $.loadBalancerId;
        this.primaryIpId = $.primaryIpId;
        this.serverId = $.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RdnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RdnsArgs $;

        public Builder() {
            $ = new RdnsArgs();
        }

        public Builder(RdnsArgs defaults) {
            $ = new RdnsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsPtr The DNS address the `ip_address` should resolve to.
         * 
         * @return builder
         * 
         */
        public Builder dnsPtr(Output<String> dnsPtr) {
            $.dnsPtr = dnsPtr;
            return this;
        }

        /**
         * @param dnsPtr The DNS address the `ip_address` should resolve to.
         * 
         * @return builder
         * 
         */
        public Builder dnsPtr(String dnsPtr) {
            return dnsPtr(Output.of(dnsPtr));
        }

        /**
         * @param floatingIpId The Floating IP the `ip_address` belongs to.
         * 
         * @return builder
         * 
         */
        public Builder floatingIpId(@Nullable Output<Integer> floatingIpId) {
            $.floatingIpId = floatingIpId;
            return this;
        }

        /**
         * @param floatingIpId The Floating IP the `ip_address` belongs to.
         * 
         * @return builder
         * 
         */
        public Builder floatingIpId(Integer floatingIpId) {
            return floatingIpId(Output.of(floatingIpId));
        }

        /**
         * @param ipAddress The IP address that should point to `dns_ptr`.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP address that should point to `dns_ptr`.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param loadBalancerId The Load Balancer the `ip_address` belongs to.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(@Nullable Output<Integer> loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * @param loadBalancerId The Load Balancer the `ip_address` belongs to.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(Integer loadBalancerId) {
            return loadBalancerId(Output.of(loadBalancerId));
        }

        /**
         * @param primaryIpId The Primary IP the `ip_address` belongs to.
         * 
         * @return builder
         * 
         */
        public Builder primaryIpId(@Nullable Output<Integer> primaryIpId) {
            $.primaryIpId = primaryIpId;
            return this;
        }

        /**
         * @param primaryIpId The Primary IP the `ip_address` belongs to.
         * 
         * @return builder
         * 
         */
        public Builder primaryIpId(Integer primaryIpId) {
            return primaryIpId(Output.of(primaryIpId));
        }

        /**
         * @param serverId The server the `ip_address` belongs to.
         * 
         * @return builder
         * 
         */
        public Builder serverId(@Nullable Output<Integer> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId The server the `ip_address` belongs to.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Integer serverId) {
            return serverId(Output.of(serverId));
        }

        public RdnsArgs build() {
            if ($.dnsPtr == null) {
                throw new MissingRequiredPropertyException("RdnsArgs", "dnsPtr");
            }
            if ($.ipAddress == null) {
                throw new MissingRequiredPropertyException("RdnsArgs", "ipAddress");
            }
            return $;
        }
    }

}