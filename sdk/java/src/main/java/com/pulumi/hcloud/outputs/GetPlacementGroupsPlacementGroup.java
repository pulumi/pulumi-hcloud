// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPlacementGroupsPlacementGroup {
    private Integer id;
    private Map<String,Object> labels;
    private String name;
    private List<Integer> servers;
    private String type;

    private GetPlacementGroupsPlacementGroup() {}
    public Integer id() {
        return this.id;
    }
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    public List<Integer> servers() {
        return this.servers;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPlacementGroupsPlacementGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer id;
        private Map<String,Object> labels;
        private String name;
        private List<Integer> servers;
        private String type;
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
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroup", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroup", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder servers(List<Integer> servers) {
            if (servers == null) {
              throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroup", "servers");
            }
            this.servers = servers;
            return this;
        }
        public Builder servers(Integer... servers) {
            return servers(List.of(servers));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroup", "type");
            }
            this.type = type;
            return this;
        }
        public GetPlacementGroupsPlacementGroup build() {
            final var _resultValue = new GetPlacementGroupsPlacementGroup();
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.servers = servers;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
