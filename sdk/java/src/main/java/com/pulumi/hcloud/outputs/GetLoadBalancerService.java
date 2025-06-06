// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.hcloud.outputs.GetLoadBalancerServiceHealthCheck;
import com.pulumi.hcloud.outputs.GetLoadBalancerServiceHttp;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerService {
    /**
     * @return (int) Port the service connects to the targets on. Can be everything between `1` and `65535`.
     * 
     */
    private Integer destinationPort;
    /**
     * @return (list) List of http configurations when `protocol` is `http` or `https`.
     * 
     */
    private List<GetLoadBalancerServiceHealthCheck> healthChecks;
    /**
     * @return (list) List of http configurations when `protocol` is `http` or `https`.
     * 
     */
    private List<GetLoadBalancerServiceHttp> https;
    /**
     * @return (int) Port the service listen on. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     * 
     */
    private Integer listenPort;
    /**
     * @return (string) Protocol the health check uses. `http`, `https` or `tcp`
     * 
     */
    private String protocol;
    /**
     * @return (bool) Enable proxyprotocol.
     * 
     */
    private Boolean proxyprotocol;

    private GetLoadBalancerService() {}
    /**
     * @return (int) Port the service connects to the targets on. Can be everything between `1` and `65535`.
     * 
     */
    public Integer destinationPort() {
        return this.destinationPort;
    }
    /**
     * @return (list) List of http configurations when `protocol` is `http` or `https`.
     * 
     */
    public List<GetLoadBalancerServiceHealthCheck> healthChecks() {
        return this.healthChecks;
    }
    /**
     * @return (list) List of http configurations when `protocol` is `http` or `https`.
     * 
     */
    public List<GetLoadBalancerServiceHttp> https() {
        return this.https;
    }
    /**
     * @return (int) Port the service listen on. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     * 
     */
    public Integer listenPort() {
        return this.listenPort;
    }
    /**
     * @return (string) Protocol the health check uses. `http`, `https` or `tcp`
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return (bool) Enable proxyprotocol.
     * 
     */
    public Boolean proxyprotocol() {
        return this.proxyprotocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer destinationPort;
        private List<GetLoadBalancerServiceHealthCheck> healthChecks;
        private List<GetLoadBalancerServiceHttp> https;
        private Integer listenPort;
        private String protocol;
        private Boolean proxyprotocol;
        public Builder() {}
        public Builder(GetLoadBalancerService defaults) {
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
              throw new MissingRequiredPropertyException("GetLoadBalancerService", "destinationPort");
            }
            this.destinationPort = destinationPort;
            return this;
        }
        @CustomType.Setter
        public Builder healthChecks(List<GetLoadBalancerServiceHealthCheck> healthChecks) {
            if (healthChecks == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerService", "healthChecks");
            }
            this.healthChecks = healthChecks;
            return this;
        }
        public Builder healthChecks(GetLoadBalancerServiceHealthCheck... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }
        @CustomType.Setter
        public Builder https(List<GetLoadBalancerServiceHttp> https) {
            if (https == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerService", "https");
            }
            this.https = https;
            return this;
        }
        public Builder https(GetLoadBalancerServiceHttp... https) {
            return https(List.of(https));
        }
        @CustomType.Setter
        public Builder listenPort(Integer listenPort) {
            if (listenPort == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerService", "listenPort");
            }
            this.listenPort = listenPort;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerService", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder proxyprotocol(Boolean proxyprotocol) {
            if (proxyprotocol == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerService", "proxyprotocol");
            }
            this.proxyprotocol = proxyprotocol;
            return this;
        }
        public GetLoadBalancerService build() {
            final var _resultValue = new GetLoadBalancerService();
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
