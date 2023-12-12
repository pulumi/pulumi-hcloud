// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLocationResult {
    /**
     * @return (string) City of the location.
     * 
     */
    private String city;
    /**
     * @return (string) Country of the location.
     * 
     */
    private String country;
    /**
     * @return (string) Description of the location.
     * 
     */
    private String description;
    /**
     * @return (int) Unique ID of the location.
     * 
     */
    private Integer id;
    /**
     * @return (float) Latitude of the city.
     * 
     */
    private Double latitude;
    /**
     * @return (float) Longitude of the city.
     * 
     */
    private Double longitude;
    /**
     * @return (string) Name of the location.
     * 
     */
    private String name;
    /**
     * @return (string) Network Zone of the location.
     * 
     */
    private String networkZone;

    private GetLocationResult() {}
    /**
     * @return (string) City of the location.
     * 
     */
    public String city() {
        return this.city;
    }
    /**
     * @return (string) Country of the location.
     * 
     */
    public String country() {
        return this.country;
    }
    /**
     * @return (string) Description of the location.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (int) Unique ID of the location.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return (float) Latitude of the city.
     * 
     */
    public Double latitude() {
        return this.latitude;
    }
    /**
     * @return (float) Longitude of the city.
     * 
     */
    public Double longitude() {
        return this.longitude;
    }
    /**
     * @return (string) Name of the location.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (string) Network Zone of the location.
     * 
     */
    public String networkZone() {
        return this.networkZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String city;
        private String country;
        private String description;
        private Integer id;
        private Double latitude;
        private Double longitude;
        private String name;
        private String networkZone;
        public Builder() {}
        public Builder(GetLocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.country = defaults.country;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.latitude = defaults.latitude;
    	      this.longitude = defaults.longitude;
    	      this.name = defaults.name;
    	      this.networkZone = defaults.networkZone;
        }

        @CustomType.Setter
        public Builder city(String city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }
        @CustomType.Setter
        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
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
        public Builder latitude(Double latitude) {
            this.latitude = Objects.requireNonNull(latitude);
            return this;
        }
        @CustomType.Setter
        public Builder longitude(Double longitude) {
            this.longitude = Objects.requireNonNull(longitude);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder networkZone(String networkZone) {
            this.networkZone = Objects.requireNonNull(networkZone);
            return this;
        }
        public GetLocationResult build() {
            final var _resultValue = new GetLocationResult();
            _resultValue.city = city;
            _resultValue.country = country;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.latitude = latitude;
            _resultValue.longitude = longitude;
            _resultValue.name = name;
            _resultValue.networkZone = networkZone;
            return _resultValue;
        }
    }
}
