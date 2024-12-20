// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.hcloud.inputs.LoadBalancerAlgorithmArgs;
import com.pulumi.hcloud.inputs.LoadBalancerTargetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerState extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerState Empty = new LoadBalancerState();

    /**
     * Configuration of the algorithm the Load Balancer use.
     * 
     */
    @Import(name="algorithm")
    private @Nullable Output<LoadBalancerAlgorithmArgs> algorithm;

    /**
     * @return Configuration of the algorithm the Load Balancer use.
     * 
     */
    public Optional<Output<LoadBalancerAlgorithmArgs>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    /**
     * Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    @Import(name="deleteProtection")
    private @Nullable Output<Boolean> deleteProtection;

    /**
     * @return Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    public Optional<Output<Boolean>> deleteProtection() {
        return Optional.ofNullable(this.deleteProtection);
    }

    /**
     * (string) IPv4 Address of the Load Balancer.
     * 
     */
    @Import(name="ipv4")
    private @Nullable Output<String> ipv4;

    /**
     * @return (string) IPv4 Address of the Load Balancer.
     * 
     */
    public Optional<Output<String>> ipv4() {
        return Optional.ofNullable(this.ipv4);
    }

    /**
     * (string) IPv6 Address of the Load Balancer.
     * 
     */
    @Import(name="ipv6")
    private @Nullable Output<String> ipv6;

    /**
     * @return (string) IPv6 Address of the Load Balancer.
     * 
     */
    public Optional<Output<String>> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }

    /**
     * User-defined labels (key-value pairs) should be created with.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Type of the Load Balancer.
     * 
     */
    @Import(name="loadBalancerType")
    private @Nullable Output<String> loadBalancerType;

    /**
     * @return Type of the Load Balancer.
     * 
     */
    public Optional<Output<String>> loadBalancerType() {
        return Optional.ofNullable(this.loadBalancerType);
    }

    /**
     * The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the Load Balancer.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Load Balancer.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (int) ID of the first private network that this Load Balancer is connected to.
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<Integer> networkId;

    /**
     * @return (int) ID of the first private network that this Load Balancer is connected to.
     * 
     */
    public Optional<Output<Integer>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * (string) IP of the Load Balancer in the first private network that it is connected to.
     * 
     */
    @Import(name="networkIp")
    private @Nullable Output<String> networkIp;

    /**
     * @return (string) IP of the Load Balancer in the first private network that it is connected to.
     * 
     */
    public Optional<Output<String>> networkIp() {
        return Optional.ofNullable(this.networkIp);
    }

    /**
     * The Network Zone of the Load Balancer. Require when no location is set.
     * 
     */
    @Import(name="networkZone")
    private @Nullable Output<String> networkZone;

    /**
     * @return The Network Zone of the Load Balancer. Require when no location is set.
     * 
     */
    public Optional<Output<String>> networkZone() {
        return Optional.ofNullable(this.networkZone);
    }

    /**
     * @deprecated
     * Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets.
     * 
     */
    @Deprecated /* Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets. */
    @Import(name="targets")
    private @Nullable Output<List<LoadBalancerTargetArgs>> targets;

    /**
     * @deprecated
     * Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets.
     * 
     */
    @Deprecated /* Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets. */
    public Optional<Output<List<LoadBalancerTargetArgs>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    private LoadBalancerState() {}

    private LoadBalancerState(LoadBalancerState $) {
        this.algorithm = $.algorithm;
        this.deleteProtection = $.deleteProtection;
        this.ipv4 = $.ipv4;
        this.ipv6 = $.ipv6;
        this.labels = $.labels;
        this.loadBalancerType = $.loadBalancerType;
        this.location = $.location;
        this.name = $.name;
        this.networkId = $.networkId;
        this.networkIp = $.networkIp;
        this.networkZone = $.networkZone;
        this.targets = $.targets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerState $;

        public Builder() {
            $ = new LoadBalancerState();
        }

        public Builder(LoadBalancerState defaults) {
            $ = new LoadBalancerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm Configuration of the algorithm the Load Balancer use.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(@Nullable Output<LoadBalancerAlgorithmArgs> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm Configuration of the algorithm the Load Balancer use.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(LoadBalancerAlgorithmArgs algorithm) {
            return algorithm(Output.of(algorithm));
        }

        /**
         * @param deleteProtection Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(@Nullable Output<Boolean> deleteProtection) {
            $.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * @param deleteProtection Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(Boolean deleteProtection) {
            return deleteProtection(Output.of(deleteProtection));
        }

        /**
         * @param ipv4 (string) IPv4 Address of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(@Nullable Output<String> ipv4) {
            $.ipv4 = ipv4;
            return this;
        }

        /**
         * @param ipv4 (string) IPv4 Address of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(String ipv4) {
            return ipv4(Output.of(ipv4));
        }

        /**
         * @param ipv6 (string) IPv6 Address of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(@Nullable Output<String> ipv6) {
            $.ipv6 = ipv6;
            return this;
        }

        /**
         * @param ipv6 (string) IPv6 Address of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(String ipv6) {
            return ipv6(Output.of(ipv6));
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param loadBalancerType Type of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerType(@Nullable Output<String> loadBalancerType) {
            $.loadBalancerType = loadBalancerType;
            return this;
        }

        /**
         * @param loadBalancerType Type of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerType(String loadBalancerType) {
            return loadBalancerType(Output.of(loadBalancerType));
        }

        /**
         * @param location The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Name of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkId (int) ID of the first private network that this Load Balancer is connected to.
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<Integer> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId (int) ID of the first private network that this Load Balancer is connected to.
         * 
         * @return builder
         * 
         */
        public Builder networkId(Integer networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param networkIp (string) IP of the Load Balancer in the first private network that it is connected to.
         * 
         * @return builder
         * 
         */
        public Builder networkIp(@Nullable Output<String> networkIp) {
            $.networkIp = networkIp;
            return this;
        }

        /**
         * @param networkIp (string) IP of the Load Balancer in the first private network that it is connected to.
         * 
         * @return builder
         * 
         */
        public Builder networkIp(String networkIp) {
            return networkIp(Output.of(networkIp));
        }

        /**
         * @param networkZone The Network Zone of the Load Balancer. Require when no location is set.
         * 
         * @return builder
         * 
         */
        public Builder networkZone(@Nullable Output<String> networkZone) {
            $.networkZone = networkZone;
            return this;
        }

        /**
         * @param networkZone The Network Zone of the Load Balancer. Require when no location is set.
         * 
         * @return builder
         * 
         */
        public Builder networkZone(String networkZone) {
            return networkZone(Output.of(networkZone));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets.
         * 
         */
        @Deprecated /* Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets. */
        public Builder targets(@Nullable Output<List<LoadBalancerTargetArgs>> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets.
         * 
         */
        @Deprecated /* Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets. */
        public Builder targets(List<LoadBalancerTargetArgs> targets) {
            return targets(Output.of(targets));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets.
         * 
         */
        @Deprecated /* Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets. */
        public Builder targets(LoadBalancerTargetArgs... targets) {
            return targets(List.of(targets));
        }

        public LoadBalancerState build() {
            return $;
        }
    }

}
