// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerNetworkState extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerNetworkState Empty = new LoadBalancerNetworkState();

    /**
     * Enable or disable the
     * Load Balancers public interface. Default: `true`
     * 
     */
    @Import(name="enablePublicInterface")
    private @Nullable Output<Boolean> enablePublicInterface;

    /**
     * @return Enable or disable the
     * Load Balancers public interface. Default: `true`
     * 
     */
    public Optional<Output<Boolean>> enablePublicInterface() {
        return Optional.ofNullable(this.enablePublicInterface);
    }

    /**
     * IP to request to be assigned to this Load
     * Balancer. If you do not provide this then you will be auto assigned an
     * IP address.
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return IP to request to be assigned to this Load
     * Balancer. If you do not provide this then you will be auto assigned an
     * IP address.
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * ID of the Load Balancer.
     * 
     */
    @Import(name="loadBalancerId")
    private @Nullable Output<Integer> loadBalancerId;

    /**
     * @return ID of the Load Balancer.
     * 
     */
    public Optional<Output<Integer>> loadBalancerId() {
        return Optional.ofNullable(this.loadBalancerId);
    }

    /**
     * ID of the network which should be added
     * to the Load Balancer. Required if `subnet_id` is not set. Successful
     * creation of the resource depends on the existence of a subnet in the
     * Hetzner Cloud Backend. Using `network_id` will not create an explicit
     * dependency between the Load Balancer and the subnet. Therefore
     * `depends_on` may need to be used. Alternatively the `subnet_id`
     * property can be used, which will create an explicit dependency between
     * `hcloud.LoadBalancerNetwork` and the existence of a subnet.
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<Integer> networkId;

    /**
     * @return ID of the network which should be added
     * to the Load Balancer. Required if `subnet_id` is not set. Successful
     * creation of the resource depends on the existence of a subnet in the
     * Hetzner Cloud Backend. Using `network_id` will not create an explicit
     * dependency between the Load Balancer and the subnet. Therefore
     * `depends_on` may need to be used. Alternatively the `subnet_id`
     * property can be used, which will create an explicit dependency between
     * `hcloud.LoadBalancerNetwork` and the existence of a subnet.
     * 
     */
    public Optional<Output<Integer>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * ID of the sub-network which should be
     * added to the Load Balancer. Required if `network_id` is not set.
     * *Note*: if the `ip` property is missing, the Load Balancer is
     * currently added to the last created subnet.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return ID of the sub-network which should be
     * added to the Load Balancer. Required if `network_id` is not set.
     * *Note*: if the `ip` property is missing, the Load Balancer is
     * currently added to the last created subnet.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    private LoadBalancerNetworkState() {}

    private LoadBalancerNetworkState(LoadBalancerNetworkState $) {
        this.enablePublicInterface = $.enablePublicInterface;
        this.ip = $.ip;
        this.loadBalancerId = $.loadBalancerId;
        this.networkId = $.networkId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerNetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerNetworkState $;

        public Builder() {
            $ = new LoadBalancerNetworkState();
        }

        public Builder(LoadBalancerNetworkState defaults) {
            $ = new LoadBalancerNetworkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enablePublicInterface Enable or disable the
         * Load Balancers public interface. Default: `true`
         * 
         * @return builder
         * 
         */
        public Builder enablePublicInterface(@Nullable Output<Boolean> enablePublicInterface) {
            $.enablePublicInterface = enablePublicInterface;
            return this;
        }

        /**
         * @param enablePublicInterface Enable or disable the
         * Load Balancers public interface. Default: `true`
         * 
         * @return builder
         * 
         */
        public Builder enablePublicInterface(Boolean enablePublicInterface) {
            return enablePublicInterface(Output.of(enablePublicInterface));
        }

        /**
         * @param ip IP to request to be assigned to this Load
         * Balancer. If you do not provide this then you will be auto assigned an
         * IP address.
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip IP to request to be assigned to this Load
         * Balancer. If you do not provide this then you will be auto assigned an
         * IP address.
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param loadBalancerId ID of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(@Nullable Output<Integer> loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * @param loadBalancerId ID of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(Integer loadBalancerId) {
            return loadBalancerId(Output.of(loadBalancerId));
        }

        /**
         * @param networkId ID of the network which should be added
         * to the Load Balancer. Required if `subnet_id` is not set. Successful
         * creation of the resource depends on the existence of a subnet in the
         * Hetzner Cloud Backend. Using `network_id` will not create an explicit
         * dependency between the Load Balancer and the subnet. Therefore
         * `depends_on` may need to be used. Alternatively the `subnet_id`
         * property can be used, which will create an explicit dependency between
         * `hcloud.LoadBalancerNetwork` and the existence of a subnet.
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<Integer> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId ID of the network which should be added
         * to the Load Balancer. Required if `subnet_id` is not set. Successful
         * creation of the resource depends on the existence of a subnet in the
         * Hetzner Cloud Backend. Using `network_id` will not create an explicit
         * dependency between the Load Balancer and the subnet. Therefore
         * `depends_on` may need to be used. Alternatively the `subnet_id`
         * property can be used, which will create an explicit dependency between
         * `hcloud.LoadBalancerNetwork` and the existence of a subnet.
         * 
         * @return builder
         * 
         */
        public Builder networkId(Integer networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param subnetId ID of the sub-network which should be
         * added to the Load Balancer. Required if `network_id` is not set.
         * *Note*: if the `ip` property is missing, the Load Balancer is
         * currently added to the last created subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId ID of the sub-network which should be
         * added to the Load Balancer. Required if `network_id` is not set.
         * *Note*: if the `ip` property is missing, the Load Balancer is
         * currently added to the last created subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public LoadBalancerNetworkState build() {
            return $;
        }
    }

}
