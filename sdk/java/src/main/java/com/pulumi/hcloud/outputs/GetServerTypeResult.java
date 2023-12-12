// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerTypeResult {
    /**
     * @return (string) Architecture of the server_type.
     * 
     */
    private String architecture;
    /**
     * @return (int) Number of cpu cores a Server of this type will have.
     * 
     */
    private Integer cores;
    private String cpuType;
    /**
     * @return (Optional, string) Date when the deprecation of the server type was announced. Only set when the server type is deprecated.
     * 
     */
    private String deprecationAnnounced;
    /**
     * @return (string) Description of the server_type.
     * 
     */
    private String description;
    /**
     * @return (int) Disk size a Server of this type will have in GB.
     * 
     */
    private Integer disk;
    /**
     * @return (int) Unique ID of the server_type.
     * 
     */
    private Integer id;
    /**
     * @return (int) Free traffic per month in bytes.
     * 
     */
    private Integer includedTraffic;
    /**
     * @return (bool) Deprecation status of server type.
     * 
     */
    private Boolean isDeprecated;
    /**
     * @return (int) Memory a Server of this type will have in GB.
     * 
     */
    private Integer memory;
    /**
     * @return (string) Name of the server_type.
     * 
     */
    private String name;
    private String storageType;
    /**
     * @return (Optional, string) Date when the server type will not be available for new servers. Only set when the server type is deprecated.
     * 
     */
    private String unavailableAfter;

    private GetServerTypeResult() {}
    /**
     * @return (string) Architecture of the server_type.
     * 
     */
    public String architecture() {
        return this.architecture;
    }
    /**
     * @return (int) Number of cpu cores a Server of this type will have.
     * 
     */
    public Integer cores() {
        return this.cores;
    }
    public String cpuType() {
        return this.cpuType;
    }
    /**
     * @return (Optional, string) Date when the deprecation of the server type was announced. Only set when the server type is deprecated.
     * 
     */
    public String deprecationAnnounced() {
        return this.deprecationAnnounced;
    }
    /**
     * @return (string) Description of the server_type.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (int) Disk size a Server of this type will have in GB.
     * 
     */
    public Integer disk() {
        return this.disk;
    }
    /**
     * @return (int) Unique ID of the server_type.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return (int) Free traffic per month in bytes.
     * 
     */
    public Integer includedTraffic() {
        return this.includedTraffic;
    }
    /**
     * @return (bool) Deprecation status of server type.
     * 
     */
    public Boolean isDeprecated() {
        return this.isDeprecated;
    }
    /**
     * @return (int) Memory a Server of this type will have in GB.
     * 
     */
    public Integer memory() {
        return this.memory;
    }
    /**
     * @return (string) Name of the server_type.
     * 
     */
    public String name() {
        return this.name;
    }
    public String storageType() {
        return this.storageType;
    }
    /**
     * @return (Optional, string) Date when the server type will not be available for new servers. Only set when the server type is deprecated.
     * 
     */
    public String unavailableAfter() {
        return this.unavailableAfter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerTypeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String architecture;
        private Integer cores;
        private String cpuType;
        private String deprecationAnnounced;
        private String description;
        private Integer disk;
        private Integer id;
        private Integer includedTraffic;
        private Boolean isDeprecated;
        private Integer memory;
        private String name;
        private String storageType;
        private String unavailableAfter;
        public Builder() {}
        public Builder(GetServerTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.cores = defaults.cores;
    	      this.cpuType = defaults.cpuType;
    	      this.deprecationAnnounced = defaults.deprecationAnnounced;
    	      this.description = defaults.description;
    	      this.disk = defaults.disk;
    	      this.id = defaults.id;
    	      this.includedTraffic = defaults.includedTraffic;
    	      this.isDeprecated = defaults.isDeprecated;
    	      this.memory = defaults.memory;
    	      this.name = defaults.name;
    	      this.storageType = defaults.storageType;
    	      this.unavailableAfter = defaults.unavailableAfter;
        }

        @CustomType.Setter
        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }
        @CustomType.Setter
        public Builder cores(Integer cores) {
            this.cores = Objects.requireNonNull(cores);
            return this;
        }
        @CustomType.Setter
        public Builder cpuType(String cpuType) {
            this.cpuType = Objects.requireNonNull(cpuType);
            return this;
        }
        @CustomType.Setter
        public Builder deprecationAnnounced(String deprecationAnnounced) {
            this.deprecationAnnounced = Objects.requireNonNull(deprecationAnnounced);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder disk(Integer disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder includedTraffic(Integer includedTraffic) {
            this.includedTraffic = Objects.requireNonNull(includedTraffic);
            return this;
        }
        @CustomType.Setter
        public Builder isDeprecated(Boolean isDeprecated) {
            this.isDeprecated = Objects.requireNonNull(isDeprecated);
            return this;
        }
        @CustomType.Setter
        public Builder memory(Integer memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }
        @CustomType.Setter
        public Builder unavailableAfter(String unavailableAfter) {
            this.unavailableAfter = Objects.requireNonNull(unavailableAfter);
            return this;
        }
        public GetServerTypeResult build() {
            final var _resultValue = new GetServerTypeResult();
            _resultValue.architecture = architecture;
            _resultValue.cores = cores;
            _resultValue.cpuType = cpuType;
            _resultValue.deprecationAnnounced = deprecationAnnounced;
            _resultValue.description = description;
            _resultValue.disk = disk;
            _resultValue.id = id;
            _resultValue.includedTraffic = includedTraffic;
            _resultValue.isDeprecated = isDeprecated;
            _resultValue.memory = memory;
            _resultValue.name = name;
            _resultValue.storageType = storageType;
            _resultValue.unavailableAfter = unavailableAfter;
            return _resultValue;
        }
    }
}
