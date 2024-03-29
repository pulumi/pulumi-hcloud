// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.hcloud.outputs.GetLoadBalancersLoadBalancerServiceHealthCheck;
import com.pulumi.hcloud.outputs.GetLoadBalancersLoadBalancerServiceHttp;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersLoadBalancerService {
    private Integer destinationPort;
    private List<GetLoadBalancersLoadBalancerServiceHealthCheck> healthChecks;
    private List<GetLoadBalancersLoadBalancerServiceHttp> https;
    private Integer listenPort;
    private String protocol;
    private Boolean proxyprotocol;

    private GetLoadBalancersLoadBalancerService() {}
    public Integer destinationPort() {
        return this.destinationPort;
    }
    public List<GetLoadBalancersLoadBalancerServiceHealthCheck> healthChecks() {
        return this.healthChecks;
    }
    public List<GetLoadBalancersLoadBalancerServiceHttp> https() {
        return this.https;
    }
    public Integer listenPort() {
        return this.listenPort;
    }
    public String protocol() {
        return this.protocol;
    }
    public Boolean proxyprotocol() {
        return this.proxyprotocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersLoadBalancerService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer destinationPort;
        private List<GetLoadBalancersLoadBalancerServiceHealthCheck> healthChecks;
        private List<GetLoadBalancersLoadBalancerServiceHttp> https;
        private Integer listenPort;
        private String protocol;
        private Boolean proxyprotocol;
        public Builder() {}
        public Builder(GetLoadBalancersLoadBalancerService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPort = defaults.destinationPort;
    	      this.healthChecks = defaults.healthChecks;
    	      this.https = defaults.https;
    	      this.listenPort = defaults.listenPort;
    	      this.protocol = defaults.protocol;
    	      this.proxyprotocol = defaults.proxyprotocol;
        }

        @CustomType.Setter
        public Builder destinationPort(Integer destinationPort) {
            if (destinationPort == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersLoadBalancerService", "destinationPort");
            }
            this.destinationPort = destinationPort;
            return this;
        }
        @CustomType.Setter
        public Builder healthChecks(List<GetLoadBalancersLoadBalancerServiceHealthCheck> healthChecks) {
            if (healthChecks == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersLoadBalancerService", "healthChecks");
            }
            this.healthChecks = healthChecks;
            return this;
        }
        public Builder healthChecks(GetLoadBalancersLoadBalancerServiceHealthCheck... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }
        @CustomType.Setter
        public Builder https(List<GetLoadBalancersLoadBalancerServiceHttp> https) {
            if (https == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersLoadBalancerService", "https");
            }
            this.https = https;
            return this;
        }
        public Builder https(GetLoadBalancersLoadBalancerServiceHttp... https) {
            return https(List.of(https));
        }
        @CustomType.Setter
        public Builder listenPort(Integer listenPort) {
            if (listenPort == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersLoadBalancerService", "listenPort");
            }
            this.listenPort = listenPort;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersLoadBalancerService", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder proxyprotocol(Boolean proxyprotocol) {
            if (proxyprotocol == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancersLoadBalancerService", "proxyprotocol");
            }
            this.proxyprotocol = proxyprotocol;
            return this;
        }
        public GetLoadBalancersLoadBalancerService build() {
            final var _resultValue = new GetLoadBalancersLoadBalancerService();
            _resultValue.destinationPort = destinationPort;
            _resultValue.healthChecks = healthChecks;
            _resultValue.https = https;
            _resultValue.listenPort = listenPort;
            _resultValue.protocol = protocol;
            _resultValue.proxyprotocol = proxyprotocol;
            return _resultValue;
        }
    }
}
