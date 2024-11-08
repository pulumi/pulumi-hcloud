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
public final class GetVolumesVolume {
    private Boolean deleteProtection;
    private Integer id;
    private Map<String,String> labels;
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
    public Map<String,String> labels() {
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
        private Map<String,String> labels;
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
            if (deleteProtection == null) {
              throw new MissingRequiredPropertyException("GetVolumesVolume", "deleteProtection");
            }
            this.deleteProtection = deleteProtection;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVolumesVolume", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetVolumesVolume", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder linuxDevice(String linuxDevice) {
            if (linuxDevice == null) {
              throw new MissingRequiredPropertyException("GetVolumesVolume", "linuxDevice");
            }
            this.linuxDevice = linuxDevice;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {

            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetVolumesVolume", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder serverId(@Nullable Integer serverId) {

            this.serverId = serverId;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("GetVolumesVolume", "size");
            }
            this.size = size;
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