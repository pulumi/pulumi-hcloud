// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerTypesServerType {
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

    private GetServerTypesServerType() {}
    public String architecture() {
        return this.architecture;
    }
    public Integer cores() {
        return this.cores;
    }
    public String cpuType() {
        return this.cpuType;
    }
    public String deprecationAnnounced() {
        return this.deprecationAnnounced;
    }
    public String description() {
        return this.description;
    }
    public Integer disk() {
        return this.disk;
    }
    public Integer id() {
        return this.id;
    }
    public Integer includedTraffic() {
        return this.includedTraffic;
    }
    public Boolean isDeprecated() {
        return this.isDeprecated;
    }
    public Integer memory() {
        return this.memory;
    }
    public String name() {
        return this.name;
    }
    public String storageType() {
        return this.storageType;
    }
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
        public GetServerTypesServerType build() {
            final var o = new GetServerTypesServerType();
            o.architecture = architecture;
            o.cores = cores;
            o.cpuType = cpuType;
            o.deprecationAnnounced = deprecationAnnounced;
            o.description = description;
            o.disk = disk;
            o.id = id;
            o.includedTraffic = includedTraffic;
            o.isDeprecated = isDeprecated;
            o.memory = memory;
            o.name = name;
            o.storageType = storageType;
            o.unavailableAfter = unavailableAfter;
            return o;
        }
    }
}
