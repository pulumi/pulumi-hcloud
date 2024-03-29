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
public final class FirewallRule {
    /**
     * @return Description of the firewall rule
     * 
     */
    private @Nullable String description;
    /**
     * @return List of IPs or CIDRs that are allowed within this Firewall Rule (when `direction`
     * is `out`)
     * 
     */
    private @Nullable List<String> destinationIps;
    /**
     * @return Direction of the Firewall Rule. `in`
     * 
     */
    private String direction;
    /**
     * @return Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`. You can use `any`
     * to allow all ports for the specific protocol. Port ranges are also possible: `80-85` allows all ports between 80 and 85.
     * 
     */
    private @Nullable String port;
    /**
     * @return Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
     * 
     */
    private String protocol;
    /**
     * @return List of IPs or CIDRs that are allowed within this Firewall Rule (when `direction`
     * is `in`)
     * 
     */
    private @Nullable List<String> sourceIps;

    private FirewallRule() {}
    /**
     * @return Description of the firewall rule
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return List of IPs or CIDRs that are allowed within this Firewall Rule (when `direction`
     * is `out`)
     * 
     */
    public List<String> destinationIps() {
        return this.destinationIps == null ? List.of() : this.destinationIps;
    }
    /**
     * @return Direction of the Firewall Rule. `in`
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`. You can use `any`
     * to allow all ports for the specific protocol. Port ranges are also possible: `80-85` allows all ports between 80 and 85.
     * 
     */
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return List of IPs or CIDRs that are allowed within this Firewall Rule (when `direction`
     * is `in`)
     * 
     */
    public List<String> sourceIps() {
        return this.sourceIps == null ? List.of() : this.sourceIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationIps;
        private String direction;
        private @Nullable String port;
        private String protocol;
        private @Nullable List<String> sourceIps;
        public Builder() {}
        public Builder(FirewallRule defaults) {
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
              throw new MissingRequiredPropertyException("FirewallRule", "direction");
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
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("FirewallRule", "protocol");
            }
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
        public FirewallRule build() {
            final var _resultValue = new FirewallRule();
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
