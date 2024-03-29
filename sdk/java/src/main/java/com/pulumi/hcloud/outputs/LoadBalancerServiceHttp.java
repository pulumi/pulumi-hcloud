// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerServiceHttp {
    /**
     * @return List of IDs from certificates which the Load Balancer has.
     * 
     */
    private @Nullable List<Integer> certificates;
    /**
     * @return Lifetime of the cookie for sticky session (in seconds). Default: `300`
     * 
     */
    private @Nullable Integer cookieLifetime;
    /**
     * @return Name of the cookie for sticky session. Default: `HCLBSTICKY`
     * 
     */
    private @Nullable String cookieName;
    /**
     * @return Redirect HTTP to HTTPS traffic. Only supported for services with `protocol` `https` using the default HTTP port `80`.
     * 
     */
    private @Nullable Boolean redirectHttp;
    /**
     * @return Enable sticky sessions
     * 
     */
    private @Nullable Boolean stickySessions;

    private LoadBalancerServiceHttp() {}
    /**
     * @return List of IDs from certificates which the Load Balancer has.
     * 
     */
    public List<Integer> certificates() {
        return this.certificates == null ? List.of() : this.certificates;
    }
    /**
     * @return Lifetime of the cookie for sticky session (in seconds). Default: `300`
     * 
     */
    public Optional<Integer> cookieLifetime() {
        return Optional.ofNullable(this.cookieLifetime);
    }
    /**
     * @return Name of the cookie for sticky session. Default: `HCLBSTICKY`
     * 
     */
    public Optional<String> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }
    /**
     * @return Redirect HTTP to HTTPS traffic. Only supported for services with `protocol` `https` using the default HTTP port `80`.
     * 
     */
    public Optional<Boolean> redirectHttp() {
        return Optional.ofNullable(this.redirectHttp);
    }
    /**
     * @return Enable sticky sessions
     * 
     */
    public Optional<Boolean> stickySessions() {
        return Optional.ofNullable(this.stickySessions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerServiceHttp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Integer> certificates;
        private @Nullable Integer cookieLifetime;
        private @Nullable String cookieName;
        private @Nullable Boolean redirectHttp;
        private @Nullable Boolean stickySessions;
        public Builder() {}
        public Builder(LoadBalancerServiceHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.cookieLifetime = defaults.cookieLifetime;
    	      this.cookieName = defaults.cookieName;
    	      this.redirectHttp = defaults.redirectHttp;
    	      this.stickySessions = defaults.stickySessions;
        }

        @CustomType.Setter
        public Builder certificates(@Nullable List<Integer> certificates) {

            this.certificates = certificates;
            return this;
        }
        public Builder certificates(Integer... certificates) {
            return certificates(List.of(certificates));
        }
        @CustomType.Setter
        public Builder cookieLifetime(@Nullable Integer cookieLifetime) {

            this.cookieLifetime = cookieLifetime;
            return this;
        }
        @CustomType.Setter
        public Builder cookieName(@Nullable String cookieName) {

            this.cookieName = cookieName;
            return this;
        }
        @CustomType.Setter
        public Builder redirectHttp(@Nullable Boolean redirectHttp) {

            this.redirectHttp = redirectHttp;
            return this;
        }
        @CustomType.Setter
        public Builder stickySessions(@Nullable Boolean stickySessions) {

            this.stickySessions = stickySessions;
            return this;
        }
        public LoadBalancerServiceHttp build() {
            final var _resultValue = new LoadBalancerServiceHttp();
            _resultValue.certificates = certificates;
            _resultValue.cookieLifetime = cookieLifetime;
            _resultValue.cookieName = cookieName;
            _resultValue.redirectHttp = redirectHttp;
            _resultValue.stickySessions = stickySessions;
            return _resultValue;
        }
    }
}
