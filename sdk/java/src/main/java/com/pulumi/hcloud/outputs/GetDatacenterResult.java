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
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatacenterResult {
    /**
     * @return List of currently available Server Types in the Datacenter.
     * 
     */
    private List<Integer> availableServerTypeIds;
    /**
     * @return Description of the Datacenter.
     * 
     */
    private String description;
    /**
     * @return ID of the Datacenter.
     * 
     */
    private @Nullable Integer id;
    /**
     * @return Location of the Datacenter. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    private Map<String,String> location;
    /**
     * @return Name of the Datacenter.
     * 
     */
    private @Nullable String name;
    /**
     * @return List of supported Server Types in the Datacenter.
     * 
     */
    private List<Integer> supportedServerTypeIds;

    private GetDatacenterResult() {}
    /**
     * @return List of currently available Server Types in the Datacenter.
     * 
     */
    public List<Integer> availableServerTypeIds() {
        return this.availableServerTypeIds;
    }
    /**
     * @return Description of the Datacenter.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ID of the Datacenter.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Location of the Datacenter. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    public Map<String,String> location() {
        return this.location;
    }
    /**
     * @return Name of the Datacenter.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return List of supported Server Types in the Datacenter.
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
        private @Nullable Integer id;
        private Map<String,String> location;
        private @Nullable String name;
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
        public Builder id(@Nullable Integer id) {

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
        public Builder name(@Nullable String name) {

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
