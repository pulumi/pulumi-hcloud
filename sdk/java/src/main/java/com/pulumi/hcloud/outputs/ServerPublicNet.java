// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerPublicNet {
    private @Nullable Integer ipv4;
    private @Nullable Boolean ipv4Enabled;
    private @Nullable Integer ipv6;
    private @Nullable Boolean ipv6Enabled;

    private ServerPublicNet() {}
    public Optional<Integer> ipv4() {
        return Optional.ofNullable(this.ipv4);
    }
    public Optional<Boolean> ipv4Enabled() {
        return Optional.ofNullable(this.ipv4Enabled);
    }
    public Optional<Integer> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }
    public Optional<Boolean> ipv6Enabled() {
        return Optional.ofNullable(this.ipv6Enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPublicNet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer ipv4;
        private @Nullable Boolean ipv4Enabled;
        private @Nullable Integer ipv6;
        private @Nullable Boolean ipv6Enabled;
        public Builder() {}
        public Builder(ServerPublicNet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4 = defaults.ipv4;
    	      this.ipv4Enabled = defaults.ipv4Enabled;
    	      this.ipv6 = defaults.ipv6;
    	      this.ipv6Enabled = defaults.ipv6Enabled;
        }

        @CustomType.Setter
        public Builder ipv4(@Nullable Integer ipv4) {

            this.ipv4 = ipv4;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Enabled(@Nullable Boolean ipv4Enabled) {

            this.ipv4Enabled = ipv4Enabled;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(@Nullable Integer ipv6) {

            this.ipv6 = ipv6;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Enabled(@Nullable Boolean ipv6Enabled) {

            this.ipv6Enabled = ipv6Enabled;
            return this;
        }
        public ServerPublicNet build() {
            final var _resultValue = new ServerPublicNet();
            _resultValue.ipv4 = ipv4;
            _resultValue.ipv4Enabled = ipv4Enabled;
            _resultValue.ipv6 = ipv6;
            _resultValue.ipv6Enabled = ipv6Enabled;
            return _resultValue;
        }
    }
}
