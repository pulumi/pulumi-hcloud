// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerAlgorithm {
    /**
     * @return Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
     * 
     */
    private @Nullable String type;

    private LoadBalancerAlgorithm() {}
    /**
     * @return Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerAlgorithm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String type;
        public Builder() {}
        public Builder(LoadBalancerAlgorithm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public LoadBalancerAlgorithm build() {
            final var _resultValue = new LoadBalancerAlgorithm();
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
