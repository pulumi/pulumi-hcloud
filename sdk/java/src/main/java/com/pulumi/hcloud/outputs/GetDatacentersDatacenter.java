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
public final class GetDatacentersDatacenter {
    private List<Integer> availableServerTypeIds;
    private String description;
    private Integer id;
    private Map<String,Object> location;
    private String name;
    private List<Integer> supportedServerTypeIds;

    private GetDatacentersDatacenter() {}
    public List<Integer> availableServerTypeIds() {
        return this.availableServerTypeIds;
    }
    public String description() {
        return this.description;
    }
    public Integer id() {
        return this.id;
    }
    public Map<String,Object> location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public List<Integer> supportedServerTypeIds() {
        return this.supportedServerTypeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatacentersDatacenter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Integer> availableServerTypeIds;
        private String description;
        private Integer id;
        private Map<String,Object> location;
        private String name;
        private List<Integer> supportedServerTypeIds;
        public Builder() {}
        public Builder(GetDatacentersDatacenter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableServerTypeIds = defaults.availableServerTypeIds;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.supportedServerTypeIds = defaults.supportedServerTypeIds;
        }

        @CustomType.Setter
        public Builder availableServerTypeIds(List<Integer> availableServerTypeIds) {
            if (availableServerTypeIds == null) {
              throw new MissingRequiredPropertyException("GetDatacentersDatacenter", "availableServerTypeIds");
            }
            this.availableServerTypeIds = availableServerTypeIds;
            return this;
        }
        public Builder availableServerTypeIds(Integer... availableServerTypeIds) {
            return availableServerTypeIds(List.of(availableServerTypeIds));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDatacentersDatacenter", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDatacentersDatacenter", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(Map<String,Object> location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetDatacentersDatacenter", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDatacentersDatacenter", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder supportedServerTypeIds(List<Integer> supportedServerTypeIds) {
            if (supportedServerTypeIds == null) {
              throw new MissingRequiredPropertyException("GetDatacentersDatacenter", "supportedServerTypeIds");
            }
            this.supportedServerTypeIds = supportedServerTypeIds;
            return this;
        }
        public Builder supportedServerTypeIds(Integer... supportedServerTypeIds) {
            return supportedServerTypeIds(List.of(supportedServerTypeIds));
        }
        public GetDatacentersDatacenter build() {
            final var _resultValue = new GetDatacentersDatacenter();
            _resultValue.availableServerTypeIds = availableServerTypeIds;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.supportedServerTypeIds = supportedServerTypeIds;
            return _resultValue;
        }
    }
}
