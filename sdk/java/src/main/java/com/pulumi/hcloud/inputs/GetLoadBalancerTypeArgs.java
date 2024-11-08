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


public final class GetLoadBalancerTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerTypeArgs Empty = new GetLoadBalancerTypeArgs();

    /**
     * ID of the load_balancer_type.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return ID of the load_balancer_type.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the load_balancer_type.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the load_balancer_type.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetLoadBalancerTypeArgs() {}

    private GetLoadBalancerTypeArgs(GetLoadBalancerTypeArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerTypeArgs $;

        public Builder() {
            $ = new GetLoadBalancerTypeArgs();
        }

        public Builder(GetLoadBalancerTypeArgs defaults) {
            $ = new GetLoadBalancerTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the load_balancer_type.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the load_balancer_type.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param name Name of the load_balancer_type.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the load_balancer_type.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetLoadBalancerTypeArgs build() {
            return $;
        }
    }

}
