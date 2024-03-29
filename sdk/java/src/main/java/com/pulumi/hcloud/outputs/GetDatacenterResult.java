// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDatacenterResult {
    /**
     * @return (list) List of available server types.
     * 
     */
    private List<Integer> availableServerTypeIds;
    /**
     * @return (string) Description of the datacenter.
     * 
     */
    private String description;
    /**
     * @return (int) Unique ID of the datacenter.
     * 
     */
    private Integer id;
    /**
     * @return (map) Physical datacenter location.
     * 
     */
    private Map<String,String> location;
    /**
     * @return (string) Name of the datacenter.
     * 
     */
    private String name;
    /**
     * @return (list) List of server types supported by the datacenter.
     * 
     */
    private List<Integer> supportedServerTypeIds;

    private GetDatacenterResult() {}
    /**
     * @return (list) List of available server types.
     * 
     */
    public List<Integer> availableServerTypeIds() {
        return this.availableServerTypeIds;
    }
    /**
     * @return (string) Description of the datacenter.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (int) Unique ID of the datacenter.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return (map) Physical datacenter location.
     * 
     */
    public Map<String,String> location() {
        return this.location;
    }
    /**
     * @return (string) Name of the datacenter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (list) List of server types supported by the datacenter.
     * 
     */
    public List<Integer> supportedServerTypeIds() {
        return this.supportedServerTypeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatacenterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Integer> availableServerTypeIds;
        private String description;
        private Integer id;
        private Map<String,String> location;
        private String name;
        private List<Integer> supportedServerTypeIds;
        public Builder() {}
        public Builder(GetDatacenterResult defaults) {
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
              throw new MissingRequiredPropertyException("GetDatacenterResult", "availableServerTypeIds");
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
              throw new MissingRequiredPropertyException("GetDatacenterResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDatacenterResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(Map<String,String> location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetDatacenterResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDatacenterResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder supportedServerTypeIds(List<Integer> supportedServerTypeIds) {
            if (supportedServerTypeIds == null) {
              throw new MissingRequiredPropertyException("GetDatacenterResult", "supportedServerTypeIds");
            }
            this.supportedServerTypeIds = supportedServerTypeIds;
            return this;
        }
        public Builder supportedServerTypeIds(Integer... supportedServerTypeIds) {
            return supportedServerTypeIds(List.of(supportedServerTypeIds));
        }
        public GetDatacenterResult build() {
            final var _resultValue = new GetDatacenterResult();
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
