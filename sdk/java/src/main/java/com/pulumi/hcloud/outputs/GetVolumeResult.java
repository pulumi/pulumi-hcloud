// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVolumeResult {
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    private Boolean deleteProtection;
    /**
     * @return (int) Unique ID of the volume.
     * 
     */
    private Integer id;
    /**
     * @return (map) User-defined labels (key-value pairs).
     * 
     */
    private Map<String,Object> labels;
    /**
     * @return (string) Device path on the file system for the Volume.
     * 
     */
    private String linuxDevice;
    /**
     * @return (string) The location name.
     * 
     */
    private @Nullable String location;
    /**
     * @return (string) Name of the volume.
     * 
     */
    private String name;
    /**
     * @deprecated
     * Please use the with_selector property instead.
     * 
     */
    @Deprecated /* Please use the with_selector property instead. */
    private @Nullable String selector;
    /**
     * @return (Optional, int) Server ID the volume is attached to
     * 
     */
    private @Nullable Integer serverId;
    /**
     * @return (int) Size of the volume.
     * 
     */
    private Integer size;
    private @Nullable String withSelector;
    private @Nullable List<String> withStatuses;

    private GetVolumeResult() {}
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    public Boolean deleteProtection() {
        return this.deleteProtection;
    }
    /**
     * @return (int) Unique ID of the volume.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return (map) User-defined labels (key-value pairs).
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    /**
     * @return (string) Device path on the file system for the Volume.
     * 
     */
    public String linuxDevice() {
        return this.linuxDevice;
    }
    /**
     * @return (string) The location name.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return (string) Name of the volume.
     * 
     */
    public String name() {
        return this.name;
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
     * @return (Optional, int) Server ID the volume is attached to
     * 
     */
    public Optional<Integer> serverId() {
        return Optional.ofNullable(this.serverId);
    }
    /**
     * @return (int) Size of the volume.
     * 
     */
    public Integer size() {
        return this.size;
    }
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }
    public List<String> withStatuses() {
        return this.withStatuses == null ? List.of() : this.withStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean deleteProtection;
        private Integer id;
        private Map<String,Object> labels;
        private String linuxDevice;
        private @Nullable String location;
        private String name;
        private @Nullable String selector;
        private @Nullable Integer serverId;
        private Integer size;
        private @Nullable String withSelector;
        private @Nullable List<String> withStatuses;
        public Builder() {}
        public Builder(GetVolumeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteProtection = defaults.deleteProtection;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.linuxDevice = defaults.linuxDevice;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.selector = defaults.selector;
    	      this.serverId = defaults.serverId;
    	      this.size = defaults.size;
    	      this.withSelector = defaults.withSelector;
    	      this.withStatuses = defaults.withStatuses;
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
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder linuxDevice(String linuxDevice) {
            this.linuxDevice = Objects.requireNonNull(linuxDevice);
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable String selector) {
            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder serverId(@Nullable Integer serverId) {
            this.serverId = serverId;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {
            this.withSelector = withSelector;
            return this;
        }
        @CustomType.Setter
        public Builder withStatuses(@Nullable List<String> withStatuses) {
            this.withStatuses = withStatuses;
            return this;
        }
        public Builder withStatuses(String... withStatuses) {
            return withStatuses(List.of(withStatuses));
        }
        public GetVolumeResult build() {
            final var o = new GetVolumeResult();
            o.deleteProtection = deleteProtection;
            o.id = id;
            o.labels = labels;
            o.linuxDevice = linuxDevice;
            o.location = location;
            o.name = name;
            o.selector = selector;
            o.serverId = serverId;
            o.size = size;
            o.withSelector = withSelector;
            o.withStatuses = withStatuses;
            return o;
        }
    }
}
