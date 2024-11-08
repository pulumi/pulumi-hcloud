// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerTypesLoadBalancerType {
    private String description;
    private Integer id;
    private Integer maxAssignedCertificates;
    private Integer maxConnections;
    private Integer maxServices;
    private Integer maxTargets;
    private String name;

    private GetLoadBalancerTypesLoadBalancerType() {}
    public String description() {
        return this.description;
    }
    public Integer id() {
        return this.id;
    }
    public Integer maxAssignedCertificates() {
        return this.maxAssignedCertificates;
    }
    public Integer maxConnections() {
        return this.maxConnections;
    }
    public Integer maxServices() {
        return this.maxServices;
    }
    public Integer maxTargets() {
        return this.maxTargets;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerTypesLoadBalancerType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private Integer id;
        private Integer maxAssignedCertificates;
        private Integer maxConnections;
        private Integer maxServices;
        private Integer maxTargets;
        private String name;
        public Builder() {}
        public Builder(GetLoadBalancerTypesLoadBalancerType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.maxAssignedCertificates = defaults.maxAssignedCertificates;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxServices = defaults.maxServices;
    	      this.maxTargets = defaults.maxTargets;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerTypesLoadBalancerType", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerTypesLoadBalancerType", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder maxAssignedCertificates(Integer maxAssignedCertificates) {
            if (maxAssignedCertificates == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerTypesLoadBalancerType", "maxAssignedCertificates");
            }
            this.maxAssignedCertificates = maxAssignedCertificates;
            return this;
        }
        @CustomType.Setter
        public Builder maxConnections(Integer maxConnections) {
            if (maxConnections == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerTypesLoadBalancerType", "maxConnections");
            }
            this.maxConnections = maxConnections;
            return this;
        }
        @CustomType.Setter
        public Builder maxServices(Integer maxServices) {
            if (maxServices == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerTypesLoadBalancerType", "maxServices");
            }
            this.maxServices = maxServices;
            return this;
        }
        @CustomType.Setter
        public Builder maxTargets(Integer maxTargets) {
            if (maxTargets == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerTypesLoadBalancerType", "maxTargets");
            }
            this.maxTargets = maxTargets;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerTypesLoadBalancerType", "name");
            }
            this.name = name;
            return this;
        }
        public GetLoadBalancerTypesLoadBalancerType build() {
            final var _resultValue = new GetLoadBalancerTypesLoadBalancerType();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.maxAssignedCertificates = maxAssignedCertificates;
            _resultValue.maxConnections = maxConnections;
            _resultValue.maxServices = maxServices;
            _resultValue.maxTargets = maxTargets;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}