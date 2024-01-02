// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.hcloud.outputs.GetVolumesVolume;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVolumesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (list) List of all matching volumes. See `data.hcloud_volume` for schema.
     * 
     */
    private List<GetVolumesVolume> volumes;
    private @Nullable String withSelector;
    private @Nullable List<String> withStatuses;

    private GetVolumesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (list) List of all matching volumes. See `data.hcloud_volume` for schema.
     * 
     */
    public List<GetVolumesVolume> volumes() {
        return this.volumes;
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

    public static Builder builder(GetVolumesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetVolumesVolume> volumes;
        private @Nullable String withSelector;
        private @Nullable List<String> withStatuses;
        public Builder() {}
        public Builder(GetVolumesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.volumes = defaults.volumes;
    	      this.withSelector = defaults.withSelector;
    	      this.withStatuses = defaults.withStatuses;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVolumesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(List<GetVolumesVolume> volumes) {
            if (volumes == null) {
              throw new MissingRequiredPropertyException("GetVolumesResult", "volumes");
            }
            this.volumes = volumes;
            return this;
        }
        public Builder volumes(GetVolumesVolume... volumes) {
            return volumes(List.of(volumes));
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
        public GetVolumesResult build() {
            final var _resultValue = new GetVolumesResult();
            _resultValue.id = id;
            _resultValue.volumes = volumes;
            _resultValue.withSelector = withSelector;
            _resultValue.withStatuses = withStatuses;
            return _resultValue;
        }
    }
}
