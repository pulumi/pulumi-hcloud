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
    private Map<String,Object> location;
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
    public Map<String,Object> location() {
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
        private Map<String,Object> location;
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
            this.availableServerTypeIds = Objects.requireNonNull(availableServerTypeIds);
            return this;
        }
        public Builder availableServerTypeIds(Integer... availableServerTypeIds) {
            return availableServerTypeIds(List.of(availableServerTypeIds));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(Map<String,Object> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder supportedServerTypeIds(List<Integer> supportedServerTypeIds) {
            this.supportedServerTypeIds = Objects.requireNonNull(supportedServerTypeIds);
            return this;
        }
        public Builder supportedServerTypeIds(Integer... supportedServerTypeIds) {
            return supportedServerTypeIds(List.of(supportedServerTypeIds));
        }
        public GetDatacenterResult build() {
            final var o = new GetDatacenterResult();
            o.availableServerTypeIds = availableServerTypeIds;
            o.description = description;
            o.id = id;
            o.location = location;
            o.name = name;
            o.supportedServerTypeIds = supportedServerTypeIds;
            return o;
        }
    }
}