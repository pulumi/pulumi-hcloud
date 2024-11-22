// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerTypesServerType {
    /**
     * @return Architecture of the cpu for a Server of this type.
     * 
     */
    private String architecture;
    /**
     * @return Number of cpu cores for a Server of this type.
     * 
     */
    private Double cores;
    /**
     * @return Type of cpu for a Server of this type.
     * 
     */
    private String cpuType;
    /**
     * @return Date of the Server Type deprecation announcement.
     * 
     */
    private String deprecationAnnounced;
    /**
     * @return Description of the Server Type.
     * 
     */
    private String description;
    /**
     * @return Disk size in GB for a Server of this type.
     * 
     */
    private Double disk;
    /**
     * @return ID of the Server Type.
     * 
     */
    private Integer id;
    /**
     * @deprecated
     * The field is deprecated and will always report 0 after 2024-08-05.
     * 
     */
    @Deprecated /* The field is deprecated and will always report 0 after 2024-08-05. */
    private Integer includedTraffic;
    /**
     * @return Whether the Server Type is deprecated.
     * 
     */
    private Boolean isDeprecated;
    /**
     * @return Memory in GB for a Server of this type.
     * 
     */
    private Double memory;
    /**
     * @return Name of the Server Type.
     * 
     */
    private String name;
    /**
     * @return Type of boot drive for a Server of this type.
     * 
     */
    private String storageType;
    /**
     * @return Date of the Server Type removal. After this date, the Server Type cannot be used anymore.
     * 
     */
    private String unavailableAfter;

    private GetServerTypesServerType() {}
    /**
     * @return Architecture of the cpu for a Server of this type.
     * 
     */
    public String architecture() {
        return this.architecture;
    }
    /**
     * @return Number of cpu cores for a Server of this type.
     * 
     */
    public Double cores() {
        return this.cores;
    }
    /**
     * @return Type of cpu for a Server of this type.
     * 
     */
    public String cpuType() {
        return this.cpuType;
    }
    /**
     * @return Date of the Server Type deprecation announcement.
     * 
     */
    public String deprecationAnnounced() {
        return this.deprecationAnnounced;
    }
    /**
     * @return Description of the Server Type.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Disk size in GB for a Server of this type.
     * 
     */
    public Double disk() {
        return this.disk;
    }
    /**
     * @return ID of the Server Type.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @deprecated
     * The field is deprecated and will always report 0 after 2024-08-05.
     * 
     */
    @Deprecated /* The field is deprecated and will always report 0 after 2024-08-05. */
    public Integer includedTraffic() {
        return this.includedTraffic;
    }
    /**
     * @return Whether the Server Type is deprecated.
     * 
     */
    public Boolean isDeprecated() {
        return this.isDeprecated;
    }
    /**
     * @return Memory in GB for a Server of this type.
     * 
     */
    public Double memory() {
        return this.memory;
    }
    /**
     * @return Name of the Server Type.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Type of boot drive for a Server of this type.
     * 
     */
    public String storageType() {
        return this.storageType;
    }
    /**
     * @return Date of the Server Type removal. After this date, the Server Type cannot be used anymore.
     * 
     */
    public String unavailableAfter() {
        return this.unavailableAfter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerTypesServerType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String architecture;
        private Double cores;
        private String cpuType;
        private String deprecationAnnounced;
        private String description;
        private Double disk;
        private Integer id;
        private Integer includedTraffic;
        private Boolean isDeprecated;
        private Double memory;
        private String name;
        private String storageType;
        private String unavailableAfter;
        public Builder() {}
        public Builder(GetServerTypesServerType defaults) {
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
            if (architecture == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "architecture");
            }
            this.architecture = architecture;
            return this;
        }
        @CustomType.Setter
        public Builder cores(Double cores) {
            if (cores == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "cores");
            }
            this.cores = cores;
            return this;
        }
        @CustomType.Setter
        public Builder cpuType(String cpuType) {
            if (cpuType == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "cpuType");
            }
            this.cpuType = cpuType;
            return this;
        }
        @CustomType.Setter
        public Builder deprecationAnnounced(String deprecationAnnounced) {
            if (deprecationAnnounced == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "deprecationAnnounced");
            }
            this.deprecationAnnounced = deprecationAnnounced;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder disk(Double disk) {
            if (disk == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "disk");
            }
            this.disk = disk;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder includedTraffic(Integer includedTraffic) {
            if (includedTraffic == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "includedTraffic");
            }
            this.includedTraffic = includedTraffic;
            return this;
        }
        @CustomType.Setter
        public Builder isDeprecated(Boolean isDeprecated) {
            if (isDeprecated == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "isDeprecated");
            }
            this.isDeprecated = isDeprecated;
            return this;
        }
        @CustomType.Setter
        public Builder memory(Double memory) {
            if (memory == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "memory");
            }
            this.memory = memory;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder storageType(String storageType) {
            if (storageType == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "storageType");
            }
            this.storageType = storageType;
            return this;
        }
        @CustomType.Setter
        public Builder unavailableAfter(String unavailableAfter) {
            if (unavailableAfter == null) {
              throw new MissingRequiredPropertyException("GetServerTypesServerType", "unavailableAfter");
            }
            this.unavailableAfter = unavailableAfter;
            return this;
        }
        public GetServerTypesServerType build() {
            final var _resultValue = new GetServerTypesServerType();
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
