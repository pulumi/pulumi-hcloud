// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.hcloud.outputs.GetLoadBalancerTypesLoadBalancerType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerTypesResult {
    private String id;
    /**
     * @return (list) List of all load balancer types. See `data.hcloud_load_balancer_type` for the schema.
     * 
     */
    private List<GetLoadBalancerTypesLoadBalancerType> loadBalancerTypes;

    private GetLoadBalancerTypesResult() {}
    public String id() {
        return this.id;
    }
    /**
     * @return (list) List of all load balancer types. See `data.hcloud_load_balancer_type` for the schema.
     * 
     */
    public List<GetLoadBalancerTypesLoadBalancerType> loadBalancerTypes() {
        return this.loadBalancerTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerTypesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetLoadBalancerTypesLoadBalancerType> loadBalancerTypes;
        public Builder() {}
        public Builder(GetLoadBalancerTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.loadBalancerTypes = defaults.loadBalancerTypes;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerTypesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerTypes(List<GetLoadBalancerTypesLoadBalancerType> loadBalancerTypes) {
            if (loadBalancerTypes == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerTypesResult", "loadBalancerTypes");
            }
            this.loadBalancerTypes = loadBalancerTypes;
            return this;
        }
        public Builder loadBalancerTypes(GetLoadBalancerTypesLoadBalancerType... loadBalancerTypes) {
            return loadBalancerTypes(List.of(loadBalancerTypes));
        }
        public GetLoadBalancerTypesResult build() {
            final var _resultValue = new GetLoadBalancerTypesResult();
            _resultValue.id = id;
            _resultValue.loadBalancerTypes = loadBalancerTypes;
            return _resultValue;
        }
    }
}