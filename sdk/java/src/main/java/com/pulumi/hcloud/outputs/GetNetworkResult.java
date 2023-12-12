// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkResult {
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    private Boolean deleteProtection;
    /**
     * @return (bool) Indicates if the routes from this network should be exposed to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
     * 
     */
    private Boolean exposeRoutesToVswitch;
    /**
     * @return Unique ID of the Network.
     * 
     */
    private Integer id;
    /**
     * @return IPv4 prefix of the Network.
     * 
     */
    private @Nullable String ipRange;
    private @Nullable Map<String,Object> labels;
    private @Nullable Boolean mostRecent;
    /**
     * @return Name of the Network.
     * 
     */
    private @Nullable String name;
    private @Nullable String withSelector;

    private GetNetworkResult() {}
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    public Boolean deleteProtection() {
        return this.deleteProtection;
    }
    /**
     * @return (bool) Indicates if the routes from this network should be exposed to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
     * 
     */
    public Boolean exposeRoutesToVswitch() {
        return this.exposeRoutesToVswitch;
    }
    /**
     * @return Unique ID of the Network.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return IPv4 prefix of the Network.
     * 
     */
    public Optional<String> ipRange() {
        return Optional.ofNullable(this.ipRange);
    }
    public Map<String,Object> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * @return Name of the Network.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean deleteProtection;
        private Boolean exposeRoutesToVswitch;
        private Integer id;
        private @Nullable String ipRange;
        private @Nullable Map<String,Object> labels;
        private @Nullable Boolean mostRecent;
        private @Nullable String name;
        private @Nullable String withSelector;
        public Builder() {}
        public Builder(GetNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteProtection = defaults.deleteProtection;
    	      this.exposeRoutesToVswitch = defaults.exposeRoutesToVswitch;
    	      this.id = defaults.id;
    	      this.ipRange = defaults.ipRange;
    	      this.labels = defaults.labels;
    	      this.mostRecent = defaults.mostRecent;
    	      this.name = defaults.name;
    	      this.withSelector = defaults.withSelector;
        }

        @CustomType.Setter
        public Builder deleteProtection(Boolean deleteProtection) {
            this.deleteProtection = Objects.requireNonNull(deleteProtection);
            return this;
        }
        @CustomType.Setter
        public Builder exposeRoutesToVswitch(Boolean exposeRoutesToVswitch) {
            this.exposeRoutesToVswitch = Objects.requireNonNull(exposeRoutesToVswitch);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipRange(@Nullable String ipRange) {
            this.ipRange = ipRange;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,Object> labels) {
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {
            this.withSelector = withSelector;
            return this;
        }
        public GetNetworkResult build() {
            final var _resultValue = new GetNetworkResult();
            _resultValue.deleteProtection = deleteProtection;
            _resultValue.exposeRoutesToVswitch = exposeRoutesToVswitch;
            _resultValue.id = id;
            _resultValue.ipRange = ipRange;
            _resultValue.labels = labels;
            _resultValue.mostRecent = mostRecent;
            _resultValue.name = name;
            _resultValue.withSelector = withSelector;
            return _resultValue;
        }
    }
}
