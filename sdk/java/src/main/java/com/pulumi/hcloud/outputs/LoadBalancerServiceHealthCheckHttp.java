// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerServiceHealthCheckHttp {
    /**
     * @return Domain we try to access when performing the Health Check.
     * 
     */
    private @Nullable String domain;
    /**
     * @return Path we try to access when performing the Health Check.
     * 
     */
    private @Nullable String path;
    /**
     * @return Response we expect to be included in the Target response when a Health Check was performed.
     * 
     */
    private @Nullable String response;
    /**
     * @return We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
     * 
     */
    private @Nullable List<String> statusCodes;
    /**
     * @return Enable TLS certificate checking.
     * 
     */
    private @Nullable Boolean tls;

    private LoadBalancerServiceHealthCheckHttp() {}
    /**
     * @return Domain we try to access when performing the Health Check.
     * 
     */
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * @return Path we try to access when performing the Health Check.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Response we expect to be included in the Target response when a Health Check was performed.
     * 
     */
    public Optional<String> response() {
        return Optional.ofNullable(this.response);
    }
    /**
     * @return We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
     * 
     */
    public List<String> statusCodes() {
        return this.statusCodes == null ? List.of() : this.statusCodes;
    }
    /**
     * @return Enable TLS certificate checking.
     * 
     */
    public Optional<Boolean> tls() {
        return Optional.ofNullable(this.tls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerServiceHealthCheckHttp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String domain;
        private @Nullable String path;
        private @Nullable String response;
        private @Nullable List<String> statusCodes;
        private @Nullable Boolean tls;
        public Builder() {}
        public Builder(LoadBalancerServiceHealthCheckHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.path = defaults.path;
    	      this.response = defaults.response;
    	      this.statusCodes = defaults.statusCodes;
    	      this.tls = defaults.tls;
        }

        @CustomType.Setter
        public Builder domain(@Nullable String domain) {

            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder response(@Nullable String response) {

            this.response = response;
            return this;
        }
        @CustomType.Setter
        public Builder statusCodes(@Nullable List<String> statusCodes) {

            this.statusCodes = statusCodes;
            return this;
        }
        public Builder statusCodes(String... statusCodes) {
            return statusCodes(List.of(statusCodes));
        }
        @CustomType.Setter
        public Builder tls(@Nullable Boolean tls) {

            this.tls = tls;
            return this;
        }
        public LoadBalancerServiceHealthCheckHttp build() {
            final var _resultValue = new LoadBalancerServiceHealthCheckHttp();
            _resultValue.domain = domain;
            _resultValue.path = path;
            _resultValue.response = response;
            _resultValue.statusCodes = statusCodes;
            _resultValue.tls = tls;
            return _resultValue;
        }
    }
}
