// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
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
        private String description;
        private Integer disk;
        private Integer id;
        private Integer memory;
        private String name;
        private String storageType;
        public Builder() {}
        public Builder(GetServerTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.cores = defaults.cores;
    	      this.cpuType = defaults.cpuType;
    	      this.description = defaults.description;
    	      this.disk = defaults.disk;
    	      this.id = defaults.id;
    	      this.memory = defaults.memory;
    	      this.name = defaults.name;
    	      this.storageType = defaults.storageType;
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
        public GetServerTypeResult build() {
            final var o = new GetServerTypeResult();
            o.architecture = architecture;
            o.cores = cores;
            o.cpuType = cpuType;
            o.description = description;
            o.disk = disk;
            o.id = id;
            o.memory = memory;
            o.name = name;
            o.storageType = storageType;
            return o;
        }
    }
}
