// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.hcloud.outputs.GetPlacementGroupsPlacementGroup;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPlacementGroupsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Boolean mostRecent;
    /**
     * @return (list) List of all matching placement groups. See `data.hcloud_placement_group` for schema.
     * 
     */
    private List<GetPlacementGroupsPlacementGroup> placementGroups;
    private @Nullable String withSelector;

    private GetPlacementGroupsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * @return (list) List of all matching placement groups. See `data.hcloud_placement_group` for schema.
     * 
     */
    public List<GetPlacementGroupsPlacementGroup> placementGroups() {
        return this.placementGroups;
    }
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPlacementGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable Boolean mostRecent;
        private List<GetPlacementGroupsPlacementGroup> placementGroups;
        private @Nullable String withSelector;
        public Builder() {}
        public Builder(GetPlacementGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.mostRecent = defaults.mostRecent;
    	      this.placementGroups = defaults.placementGroups;
    	      this.withSelector = defaults.withSelector;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        @CustomType.Setter
        public Builder placementGroups(List<GetPlacementGroupsPlacementGroup> placementGroups) {
            this.placementGroups = Objects.requireNonNull(placementGroups);
            return this;
        }
        public Builder placementGroups(GetPlacementGroupsPlacementGroup... placementGroups) {
            return placementGroups(List.of(placementGroups));
        }
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {
            this.withSelector = withSelector;
            return this;
        }
        public GetPlacementGroupsResult build() {
            final var _resultValue = new GetPlacementGroupsResult();
            _resultValue.id = id;
            _resultValue.mostRecent = mostRecent;
            _resultValue.placementGroups = placementGroups;
            _resultValue.withSelector = withSelector;
            return _resultValue;
        }
    }
}
