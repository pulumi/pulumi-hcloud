// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFloatingIpResult {
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    private Boolean deleteProtection;
    /**
     * @return (string) Description of the Floating IP.
     * 
     */
    private String description;
    /**
     * @return (string) Home location.
     * 
     */
    private String homeLocation;
    /**
     * @return (int) Unique ID of the Floating IP.
     * 
     */
    private Integer id;
    /**
     * @return (string) IP Address of the Floating IP.
     * 
     */
    private String ipAddress;
    /**
     * @return (string) IPv6 subnet. (Only set if `type` is `ipv6`)
     * 
     */
    private String ipNetwork;
    /**
     * @return (map) User-defined labels (key-value pairs).
     * 
     */
    private Map<String,String> labels;
    /**
     * @return (string) Name of the Floating IP.
     * 
     */
    private @Nullable String name;
    /**
     * @deprecated
     * Please use the with_selector property instead.
     * 
     */
    @Deprecated /* Please use the with_selector property instead. */
    private @Nullable String selector;
    /**
     * @return (int) Server to assign the Floating IP is assigned to.
     * 
     */
    private Integer serverId;
    /**
     * @return (string) Type of the Floating IP.
     * 
     */
    private String type;
    private @Nullable String withSelector;

    private GetFloatingIpResult() {}
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    public Boolean deleteProtection() {
        return this.deleteProtection;
    }
    /**
     * @return (string) Description of the Floating IP.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (string) Home location.
     * 
     */
    public String homeLocation() {
        return this.homeLocation;
    }
    /**
     * @return (int) Unique ID of the Floating IP.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return (string) IP Address of the Floating IP.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return (string) IPv6 subnet. (Only set if `type` is `ipv6`)
     * 
     */
    public String ipNetwork() {
        return this.ipNetwork;
    }
    /**
     * @return (map) User-defined labels (key-value pairs).
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return (string) Name of the Floating IP.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @deprecated
     * Please use the with_selector property instead.
     * 
     */
    @Deprecated /* Please use the with_selector property instead. */
    public Optional<String> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return (int) Server to assign the Floating IP is assigned to.
     * 
     */
    public Integer serverId() {
        return this.serverId;
    }
    /**
     * @return (string) Type of the Floating IP.
     * 
     */
    public String type() {
        return this.type;
    }
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFloatingIpResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean deleteProtection;
        private String description;
        private String homeLocation;
        private Integer id;
        private String ipAddress;
        private String ipNetwork;
        private Map<String,String> labels;
        private @Nullable String name;
        private @Nullable String selector;
        private Integer serverId;
        private String type;
        private @Nullable String withSelector;
        public Builder() {}
        public Builder(GetFloatingIpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteProtection = defaults.deleteProtection;
    	      this.description = defaults.description;
    	      this.homeLocation = defaults.homeLocation;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipNetwork = defaults.ipNetwork;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.selector = defaults.selector;
    	      this.serverId = defaults.serverId;
    	      this.type = defaults.type;
    	      this.withSelector = defaults.withSelector;
        }

        @CustomType.Setter
        public Builder deleteProtection(Boolean deleteProtection) {
            if (deleteProtection == null) {
              throw new MissingRequiredPropertyException("GetFloatingIpResult", "deleteProtection");
            }
            this.deleteProtection = deleteProtection;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetFloatingIpResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder homeLocation(String homeLocation) {
            if (homeLocation == null) {
              throw new MissingRequiredPropertyException("GetFloatingIpResult", "homeLocation");
            }
            this.homeLocation = homeLocation;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFloatingIpResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            if (ipAddress == null) {
              throw new MissingRequiredPropertyException("GetFloatingIpResult", "ipAddress");
            }
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder ipNetwork(String ipNetwork) {
            if (ipNetwork == null) {
              throw new MissingRequiredPropertyException("GetFloatingIpResult", "ipNetwork");
            }
            this.ipNetwork = ipNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetFloatingIpResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable String selector) {

            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder serverId(Integer serverId) {
            if (serverId == null) {
              throw new MissingRequiredPropertyException("GetFloatingIpResult", "serverId");
            }
            this.serverId = serverId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetFloatingIpResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {

            this.withSelector = withSelector;
            return this;
        }
        public GetFloatingIpResult build() {
            final var _resultValue = new GetFloatingIpResult();
            _resultValue.deleteProtection = deleteProtection;
            _resultValue.description = description;
            _resultValue.homeLocation = homeLocation;
            _resultValue.id = id;
            _resultValue.ipAddress = ipAddress;
            _resultValue.ipNetwork = ipNetwork;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.selector = selector;
            _resultValue.serverId = serverId;
            _resultValue.type = type;
            _resultValue.withSelector = withSelector;
            return _resultValue;
        }
    }
}
