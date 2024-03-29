// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFirewallsFirewallRule {
    private @Nullable String description;
    private @Nullable List<String> destinationIps;
    private String direction;
    private @Nullable String port;
    private @Nullable String protocol;
    private @Nullable List<String> sourceIps;

    private GetFirewallsFirewallRule() {}
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public List<String> destinationIps() {
        return this.destinationIps == null ? List.of() : this.destinationIps;
    }
    public String direction() {
        return this.direction;
    }
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    public List<String> sourceIps() {
        return this.sourceIps == null ? List.of() : this.sourceIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallsFirewallRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationIps;
        private String direction;
        private @Nullable String port;
        private @Nullable String protocol;
        private @Nullable List<String> sourceIps;
        public Builder() {}
        public Builder(GetFirewallsFirewallRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationIps = defaults.destinationIps;
    	      this.direction = defaults.direction;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sourceIps = defaults.sourceIps;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder destinationIps(@Nullable List<String> destinationIps) {

            this.destinationIps = destinationIps;
            return this;
        }
        public Builder destinationIps(String... destinationIps) {
            return destinationIps(List.of(destinationIps));
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            if (direction == null) {
              throw new MissingRequiredPropertyException("GetFirewallsFirewallRule", "direction");
            }
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIps(@Nullable List<String> sourceIps) {

            this.sourceIps = sourceIps;
            return this;
        }
        public Builder sourceIps(String... sourceIps) {
            return sourceIps(List.of(sourceIps));
        }
        public GetFirewallsFirewallRule build() {
            final var _resultValue = new GetFirewallsFirewallRule();
            _resultValue.description = description;
            _resultValue.destinationIps = destinationIps;
            _resultValue.direction = direction;
            _resultValue.port = port;
            _resultValue.protocol = protocol;
            _resultValue.sourceIps = sourceIps;
            return _resultValue;
        }
    }
}
