// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.hcloud.outputs.GetLoadBalancersLoadBalancerServiceHealthCheckHttp;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersLoadBalancerServiceHealthCheck {
    private List<GetLoadBalancersLoadBalancerServiceHealthCheckHttp> https;
    private Integer interval;
    private Integer port;
    private String protocol;
    private Integer retries;
    private Integer timeout;

    private GetLoadBalancersLoadBalancerServiceHealthCheck() {}
    public List<GetLoadBalancersLoadBalancerServiceHealthCheckHttp> https() {
        return this.https;
    }
    public Integer interval() {
        return this.interval;
    }
    public Integer port() {
        return this.port;
    }
    public String protocol() {
        return this.protocol;
    }
    public Integer retries() {
        return this.retries;
    }
    public Integer timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersLoadBalancerServiceHealthCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetLoadBalancersLoadBalancerServiceHealthCheckHttp> https;
        private Integer interval;
        private Integer port;
        private String protocol;
        private Integer retries;
        private Integer timeout;
        public Builder() {}
        public Builder(GetLoadBalancersLoadBalancerServiceHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.https = defaults.https;
    	      this.interval = defaults.interval;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.retries = defaults.retries;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder https(List<GetLoadBalancersLoadBalancerServiceHealthCheckHttp> https) {
            this.https = Objects.requireNonNull(https);
            return this;
        }
        public Builder https(GetLoadBalancersLoadBalancerServiceHealthCheckHttp... https) {
            return https(List.of(https));
        }
        @CustomType.Setter
        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder retries(Integer retries) {
            this.retries = Objects.requireNonNull(retries);
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public GetLoadBalancersLoadBalancerServiceHealthCheck build() {
            final var o = new GetLoadBalancersLoadBalancerServiceHealthCheck();
            o.https = https;
            o.interval = interval;
            o.port = port;
            o.protocol = protocol;
            o.retries = retries;
            o.timeout = timeout;
            return o;
        }
    }
}
