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
public final class GetVolumesVolume {
    private Boolean deleteProtection;
    private Integer id;
    private Map<String,Object> labels;
    private String linuxDevice;
    private @Nullable String location;
    private String name;
    private @Nullable Integer serverId;
    private Integer size;

    private GetVolumesVolume() {}
    public Boolean deleteProtection() {
        return this.deleteProtection;
    }
    public Integer id() {
        return this.id;
    }
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String linuxDevice() {
        return this.linuxDevice;
    }
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    public String name() {
        return this.name;
    }
    public Optional<Integer> serverId() {
        return Optional.ofNullable(this.serverId);
    }
    public Integer size() {
        return this.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumesVolume defaults) {
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
        private @Nullable Integer serverId;
        private Integer size;
        public Builder() {}
        public Builder(GetVolumesVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteProtection = defaults.deleteProtection;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.linuxDevice = defaults.linuxDevice;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.serverId = defaults.serverId;
    	      this.size = defaults.size;
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
        public Builder serverId(@Nullable Integer serverId) {
            this.serverId = serverId;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public GetVolumesVolume build() {
            final var _resultValue = new GetVolumesVolume();
            _resultValue.deleteProtection = deleteProtection;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.linuxDevice = linuxDevice;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.serverId = serverId;
            _resultValue.size = size;
            return _resultValue;
        }
    }
}
