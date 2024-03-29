// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersLoadBalancerTarget {
    private String labelSelector;
    private Integer serverId;
    private String type;

    private GetLoadBalancersLoadBalancerTarget() {}
    public String labelSelector() {
        return this.labelSelector;
    }
    public Integer serverId() {
        return this.serverId;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersLoadBalancerTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String labelSelector;
        private Integer serverId;
        private String type;
        public Builder() {}
        public Builder(GetLoadBalancersLoadBalancerTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelSelector = defaults.labelSelector;
    	      this.serverId = defaults.serverId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder labelSelector(String labelSelector) {
            if (labelSelector == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersLoadBalancerTarget", "labelSelector");
            }
            this.labelSelector = labelSelector;
            return this;
        }
        @CustomType.Setter
        public Builder serverId(Integer serverId) {
            if (serverId == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersLoadBalancerTarget", "serverId");
            }
            this.serverId = serverId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersLoadBalancerTarget", "type");
            }
            this.type = type;
            return this;
        }
        public GetLoadBalancersLoadBalancerTarget build() {
            final var _resultValue = new GetLoadBalancersLoadBalancerTarget();
            _resultValue.labelSelector = labelSelector;
            _resultValue.serverId = serverId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
