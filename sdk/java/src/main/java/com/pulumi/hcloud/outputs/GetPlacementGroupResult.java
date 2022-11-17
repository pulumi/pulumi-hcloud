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
public final class GetPlacementGroupResult {
    /**
     * @return (int) Unique ID of the Placement Group.
     * 
     */
    private @Nullable Integer id;
    /**
     * @return (map) User-defined labels (key-value pairs)
     * 
     */
    private @Nullable Map<String,Object> labels;
    private @Nullable Boolean mostRecent;
    /**
     * @return (string) Name of the Placement Group.
     * 
     */
    private String name;
    private List<Integer> servers;
    /**
     * @return (string)  Type of the Placement Group.
     * 
     */
    private @Nullable String type;
    private @Nullable String withSelector;

    private GetPlacementGroupResult() {}
    /**
     * @return (int) Unique ID of the Placement Group.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return (map) User-defined labels (key-value pairs)
     * 
     */
    public Map<String,Object> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * @return (string) Name of the Placement Group.
     * 
     */
    public String name() {
        return this.name;
    }
    public List<Integer> servers() {
        return this.servers;
    }
    /**
     * @return (string)  Type of the Placement Group.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPlacementGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer id;
        private @Nullable Map<String,Object> labels;
        private @Nullable Boolean mostRecent;
        private String name;
        private List<Integer> servers;
        private @Nullable String type;
        private @Nullable String withSelector;
        public Builder() {}
        public Builder(GetPlacementGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.mostRecent = defaults.mostRecent;
    	      this.name = defaults.name;
    	      this.servers = defaults.servers;
    	      this.type = defaults.type;
    	      this.withSelector = defaults.withSelector;
        }

        @CustomType.Setter
        public Builder id(@Nullable Integer id) {
            this.id = id;
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder servers(List<Integer> servers) {
            this.servers = Objects.requireNonNull(servers);
            return this;
        }
        public Builder servers(Integer... servers) {
            return servers(List.of(servers));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {
            this.withSelector = withSelector;
            return this;
        }
        public GetPlacementGroupResult build() {
            final var o = new GetPlacementGroupResult();
            o.id = id;
            o.labels = labels;
            o.mostRecent = mostRecent;
            o.name = name;
            o.servers = servers;
            o.type = type;
            o.withSelector = withSelector;
            return o;
        }
    }
}
