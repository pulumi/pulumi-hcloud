// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPlacementGroupsPlacementGroup {
    private @Nullable Integer id;
    private @Nullable Map<String,Object> labels;
    private String name;
    private List<Integer> servers;
    private @Nullable String type;

    private GetPlacementGroupsPlacementGroup() {}
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    public Map<String,Object> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public String name() {
        return this.name;
    }
    public List<Integer> servers() {
        return this.servers;
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPlacementGroupsPlacementGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer id;
        private @Nullable Map<String,Object> labels;
        private String name;
        private List<Integer> servers;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetPlacementGroupsPlacementGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.servers = defaults.servers;
    	      this.type = defaults.type;
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
        public GetPlacementGroupsPlacementGroup build() {
            final var o = new GetPlacementGroupsPlacementGroup();
            o.id = id;
            o.labels = labels;
            o.name = name;
            o.servers = servers;
            o.type = type;
            return o;
        }
    }
}
