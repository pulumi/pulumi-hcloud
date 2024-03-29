// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerServiceHealthCheckHttp {
    /**
     * @return string) Domain we try to access when performing the Health Check.
     * 
     */
    private String domain;
    /**
     * @return (string) Path we try to access when performing the Health Check.
     * 
     */
    private String path;
    /**
     * @return (string) Response we expect to be included in the Target response when a Health Check was performed.
     * 
     */
    private String response;
    /**
     * @return (list[int]) We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
     * 
     */
    private List<Integer> statusCodes;
    /**
     * @return (bool) Enable TLS certificate checking.
     * 
     */
    private Boolean tls;

    private GetLoadBalancerServiceHealthCheckHttp() {}
    /**
     * @return string) Domain we try to access when performing the Health Check.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return (string) Path we try to access when performing the Health Check.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return (string) Response we expect to be included in the Target response when a Health Check was performed.
     * 
     */
    public String response() {
        return this.response;
    }
    /**
     * @return (list[int]) We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
     * 
     */
    public List<Integer> statusCodes() {
        return this.statusCodes;
    }
    /**
     * @return (bool) Enable TLS certificate checking.
     * 
     */
    public Boolean tls() {
        return this.tls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerServiceHealthCheckHttp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domain;
        private String path;
        private String response;
        private List<Integer> statusCodes;
        private Boolean tls;
        public Builder() {}
        public Builder(GetLoadBalancerServiceHealthCheckHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.path = defaults.path;
    	      this.response = defaults.response;
    	      this.statusCodes = defaults.statusCodes;
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder domain(String domain) {
            if (domain == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerServiceHealthCheckHttp", "domain");
            }
            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerServiceHealthCheckHttp", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder response(String response) {
            if (response == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerServiceHealthCheckHttp", "response");
            }
            this.response = response;
            return this;
        }
        @CustomType.Setter
        public Builder statusCodes(List<Integer> statusCodes) {
            if (statusCodes == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerServiceHealthCheckHttp", "statusCodes");
            }
            this.statusCodes = statusCodes;
            return this;
        }
        public Builder statusCodes(Integer... statusCodes) {
            return statusCodes(List.of(statusCodes));
        }
        @CustomType.Setter
        public Builder tls(Boolean tls) {
            if (tls == null) {
              throw new MissingRequiredPropertyException("GetLoadBalancerServiceHealthCheckHttp", "tls");
            }
            this.tls = tls;
            return this;
        }
        public GetLoadBalancerServiceHealthCheckHttp build() {
            final var _resultValue = new GetLoadBalancerServiceHealthCheckHttp();
            _resultValue.domain = domain;
            _resultValue.path = path;
            _resultValue.response = response;
            _resultValue.statusCodes = statusCodes;
            _resultValue.tls = tls;
            return _resultValue;
        }
    }
}
