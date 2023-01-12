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
public final class GetPrimaryIpResult {
    /**
     * @return (int) ID of the assigned resource.
     * 
     */
    private Integer assigneeId;
    /**
     * @return (string) The type of the assigned resource.
     * 
     */
    private String assigneeType;
    /**
     * @return (bool) Whether auto delete is enabled.
     * 
     */
    private Boolean autoDelete;
    /**
     * @return (string) The datacenter name of the Primary IP.
     * 
     */
    private String datacenter;
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    private Boolean deleteProtection;
    /**
     * @return (int) Unique ID of the Primary IP.
     * 
     */
    private Integer id;
    /**
     * @return (string) IP Address of the Primary IP.
     * 
     */
    private String ipAddress;
    private String ipNetwork;
    /**
     * @return (string) Description of the Primary IP.
     * 
     */
    private Map<String,Object> labels;
    /**
     * @return (string) Name of the Primary IP.
     * 
     */
    private @Nullable String name;
    /**
     * @return (string) Type of the Primary IP.
     * 
     */
    private String type;
    private @Nullable String withSelector;

    private GetPrimaryIpResult() {}
    /**
     * @return (int) ID of the assigned resource.
     * 
     */
    public Integer assigneeId() {
        return this.assigneeId;
    }
    /**
     * @return (string) The type of the assigned resource.
     * 
     */
    public String assigneeType() {
        return this.assigneeType;
    }
    /**
     * @return (bool) Whether auto delete is enabled.
     * 
     */
    public Boolean autoDelete() {
        return this.autoDelete;
    }
    /**
     * @return (string) The datacenter name of the Primary IP.
     * 
     */
    public String datacenter() {
        return this.datacenter;
    }
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    public Boolean deleteProtection() {
        return this.deleteProtection;
    }
    /**
     * @return (int) Unique ID of the Primary IP.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return (string) IP Address of the Primary IP.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    public String ipNetwork() {
        return this.ipNetwork;
    }
    /**
     * @return (string) Description of the Primary IP.
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    /**
     * @return (string) Name of the Primary IP.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return (string) Type of the Primary IP.
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

    public static Builder builder(GetPrimaryIpResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer assigneeId;
        private String assigneeType;
        private Boolean autoDelete;
        private String datacenter;
        private Boolean deleteProtection;
        private Integer id;
        private String ipAddress;
        private String ipNetwork;
        private Map<String,Object> labels;
        private @Nullable String name;
        private String type;
        private @Nullable String withSelector;
        public Builder() {}
        public Builder(GetPrimaryIpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assigneeId = defaults.assigneeId;
    	      this.assigneeType = defaults.assigneeType;
    	      this.autoDelete = defaults.autoDelete;
    	      this.datacenter = defaults.datacenter;
    	      this.deleteProtection = defaults.deleteProtection;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipNetwork = defaults.ipNetwork;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.withSelector = defaults.withSelector;
        }

        @CustomType.Setter
        public Builder assigneeId(Integer assigneeId) {
            this.assigneeId = Objects.requireNonNull(assigneeId);
            return this;
        }
        @CustomType.Setter
        public Builder assigneeType(String assigneeType) {
            this.assigneeType = Objects.requireNonNull(assigneeType);
            return this;
        }
        @CustomType.Setter
        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }
        @CustomType.Setter
        public Builder datacenter(String datacenter) {
            this.datacenter = Objects.requireNonNull(datacenter);
            return this;
        }
        @CustomType.Setter
        public Builder deleteProtection(Boolean deleteProtection) {
            this.deleteProtection = Objects.requireNonNull(deleteProtection);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        @CustomType.Setter
        public Builder ipNetwork(String ipNetwork) {
            this.ipNetwork = Objects.requireNonNull(ipNetwork);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {
            this.withSelector = withSelector;
            return this;
        }
        public GetPrimaryIpResult build() {
            final var o = new GetPrimaryIpResult();
            o.assigneeId = assigneeId;
            o.assigneeType = assigneeType;
            o.autoDelete = autoDelete;
            o.datacenter = datacenter;
            o.deleteProtection = deleteProtection;
            o.id = id;
            o.ipAddress = ipAddress;
            o.ipNetwork = ipNetwork;
            o.labels = labels;
            o.name = name;
            o.type = type;
            o.withSelector = withSelector;
            return o;
        }
    }
}
