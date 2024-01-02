// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.hcloud.outputs.GetLoadBalancersLoadBalancer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLoadBalancersResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (list) List of all matching load balancers. See `data.hcloud_load_balancer` for schema.
     * 
     */
    private List<GetLoadBalancersLoadBalancer> loadBalancers;
    private @Nullable String withSelector;

    private GetLoadBalancersResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (list) List of all matching load balancers. See `data.hcloud_load_balancer` for schema.
     * 
     */
    public List<GetLoadBalancersLoadBalancer> loadBalancers() {
        return this.loadBalancers;
    }
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetLoadBalancersLoadBalancer> loadBalancers;
        private @Nullable String withSelector;
        public Builder() {}
        public Builder(GetLoadBalancersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.withSelector = defaults.withSelector;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancers(List<GetLoadBalancersLoadBalancer> loadBalancers) {
            if (loadBalancers == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersResult", "loadBalancers");
            }
            this.loadBalancers = loadBalancers;
            return this;
        }
        public Builder loadBalancers(GetLoadBalancersLoadBalancer... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {

            this.withSelector = withSelector;
            return this;
        }
        public GetLoadBalancersResult build() {
            final var _resultValue = new GetLoadBalancersResult();
            _resultValue.id = id;
            _resultValue.loadBalancers = loadBalancers;
            _resultValue.withSelector = withSelector;
            return _resultValue;
        }
    }
}
