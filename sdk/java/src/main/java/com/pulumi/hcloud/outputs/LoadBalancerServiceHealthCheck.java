// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.hcloud.outputs.LoadBalancerServiceHealthCheckHttp;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerServiceHealthCheck {
    /**
     * @return List of http configurations. Required if `protocol` is `http`.
     * 
     */
    private @Nullable LoadBalancerServiceHealthCheckHttp http;
    /**
     * @return Interval how often the health check will be performed, in seconds.
     * 
     */
    private Integer interval;
    /**
     * @return Port the health check tries to connect to, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     * 
     */
    private Integer port;
    /**
     * @return Protocol the health check uses. `http` or `tcp`
     * 
     */
    private String protocol;
    /**
     * @return Number of tries a health check will be performed until a target will be listed as `unhealthy`.
     * 
     */
    private @Nullable Integer retries;
    /**
     * @return Timeout when a health check try will be canceled if there is no response, in seconds.
     * 
     */
    private Integer timeout;

    private LoadBalancerServiceHealthCheck() {}
    /**
     * @return List of http configurations. Required if `protocol` is `http`.
     * 
     */
    public Optional<LoadBalancerServiceHealthCheckHttp> http() {
        return Optional.ofNullable(this.http);
    }
    /**
     * @return Interval how often the health check will be performed, in seconds.
     * 
     */
    public Integer interval() {
        return this.interval;
    }
    /**
     * @return Port the health check tries to connect to, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Protocol the health check uses. `http` or `tcp`
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Number of tries a health check will be performed until a target will be listed as `unhealthy`.
     * 
     */
    public Optional<Integer> retries() {
        return Optional.ofNullable(this.retries);
    }
    /**
     * @return Timeout when a health check try will be canceled if there is no response, in seconds.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerServiceHealthCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LoadBalancerServiceHealthCheckHttp http;
        private Integer interval;
        private Integer port;
        private String protocol;
        private @Nullable Integer retries;
        private Integer timeout;
        public Builder() {}
        public Builder(LoadBalancerServiceHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.http = defaults.http;
    	      this.interval = defaults.interval;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.retries = defaults.retries;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder http(@Nullable LoadBalancerServiceHealthCheckHttp http) {
            this.http = http;
            return this;
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
        public Builder retries(@Nullable Integer retries) {
            this.retries = retries;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public LoadBalancerServiceHealthCheck build() {
            final var o = new LoadBalancerServiceHealthCheck();
            o.http = http;
            o.interval = interval;
            o.port = port;
            o.protocol = protocol;
            o.retries = retries;
            o.timeout = timeout;
            return o;
        }
    }
}
