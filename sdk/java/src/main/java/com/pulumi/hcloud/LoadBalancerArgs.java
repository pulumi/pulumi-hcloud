// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.hcloud.inputs.LoadBalancerAlgorithmArgs;
import com.pulumi.hcloud.inputs.LoadBalancerTargetArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

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
     * Enable or disable delete protection.
     * 
     */
    @Import(name="deleteProtection")
    private @Nullable Output<Boolean> deleteProtection;

    /**
     * @return Enable or disable delete protection.
     * 
     */
    public Optional<Output<Boolean>> deleteProtection() {
        return Optional.ofNullable(this.deleteProtection);
    }

    /**
     * User-defined labels (key-value pairs) should be created with.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Type of the Load Balancer.
     * 
     */
    @Import(name="loadBalancerType", required=true)
    private Output<String> loadBalancerType;

    /**
     * @return Type of the Load Balancer.
     * 
     */
    public Output<String> loadBalancerType() {
        return this.loadBalancerType;
    }

    /**
     * The location name of the Load Balancer. Require when no network_zone is set.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location name of the Load Balancer. Require when no network_zone is set.
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
     * Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets.
     * 
     */
    @Deprecated /* Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets. */
    @Import(name="targets")
    private @Nullable Output<List<LoadBalancerTargetArgs>> targets;

    /**
     * @deprecated
     * Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets.
     * 
     */
    @Deprecated /* Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets. */
    public Optional<Output<List<LoadBalancerTargetArgs>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    private LoadBalancerArgs() {}

    private LoadBalancerArgs(LoadBalancerArgs $) {
        this.algorithm = $.algorithm;
        this.deleteProtection = $.deleteProtection;
        this.labels = $.labels;
        this.loadBalancerType = $.loadBalancerType;
        this.location = $.location;
        this.name = $.name;
        this.networkZone = $.networkZone;
        this.targets = $.targets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerArgs $;

        public Builder() {
            $ = new LoadBalancerArgs();
        }

        public Builder(LoadBalancerArgs defaults) {
            $ = new LoadBalancerArgs(Objects.requireNonNull(defaults));
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
         * @param deleteProtection Enable or disable delete protection.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(@Nullable Output<Boolean> deleteProtection) {
            $.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * @param deleteProtection Enable or disable delete protection.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(Boolean deleteProtection) {
            return deleteProtection(Output.of(deleteProtection));
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param loadBalancerType Type of the Load Balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerType(Output<String> loadBalancerType) {
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
         * @param location The location name of the Load Balancer. Require when no network_zone is set.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location name of the Load Balancer. Require when no network_zone is set.
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
         * Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets.
         * 
         */
        @Deprecated /* Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets. */
        public Builder targets(@Nullable Output<List<LoadBalancerTargetArgs>> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets.
         * 
         */
        @Deprecated /* Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets. */
        public Builder targets(List<LoadBalancerTargetArgs> targets) {
            return targets(Output.of(targets));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets.
         * 
         */
        @Deprecated /* Use hcloud_load_balancer_target resource instead. This allows the full control over the selected targets. */
        public Builder targets(LoadBalancerTargetArgs... targets) {
            return targets(List.of(targets));
        }

        public LoadBalancerArgs build() {
            $.loadBalancerType = Objects.requireNonNull($.loadBalancerType, "expected parameter 'loadBalancerType' to be non-null");
            return $;
        }
    }

}