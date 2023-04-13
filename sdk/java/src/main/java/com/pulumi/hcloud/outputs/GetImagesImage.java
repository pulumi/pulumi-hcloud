// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagesImage {
    private String architecture;
    private String created;
    private String deprecated;
    private String description;
    private Integer id;
    private Map<String,Object> labels;
    private String name;
    private String osFlavor;
    private String osVersion;
    private Boolean rapidDeploy;
    /**
     * @deprecated
     * Please use the with_selector property instead.
     * 
     */
    @Deprecated /* Please use the with_selector property instead. */
    private @Nullable String selector;
    private String type;

    private GetImagesImage() {}
    public String architecture() {
        return this.architecture;
    }
    public String created() {
        return this.created;
    }
    public String deprecated() {
        return this.deprecated;
    }
    public String description() {
        return this.description;
    }
    public Integer id() {
        return this.id;
    }
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    public String osFlavor() {
        return this.osFlavor;
    }
    public String osVersion() {
        return this.osVersion;
    }
    public Boolean rapidDeploy() {
        return this.rapidDeploy;
    }
    /**
     * @deprecated
     * Please use the with_selector property instead.
     * 
     */
    @Deprecated /* Please use the with_selector property instead. */
    public Optional<String> selector() {
        return Optional.ofNullable(this.selector);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagesImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String architecture;
        private String created;
        private String deprecated;
        private String description;
        private Integer id;
        private Map<String,Object> labels;
        private String name;
        private String osFlavor;
        private String osVersion;
        private Boolean rapidDeploy;
        private @Nullable String selector;
        private String type;
        public Builder() {}
        public Builder(GetImagesImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.created = defaults.created;
    	      this.deprecated = defaults.deprecated;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.osFlavor = defaults.osFlavor;
    	      this.osVersion = defaults.osVersion;
    	      this.rapidDeploy = defaults.rapidDeploy;
    	      this.selector = defaults.selector;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder deprecated(String deprecated) {
            this.deprecated = Objects.requireNonNull(deprecated);
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
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder osFlavor(String osFlavor) {
            this.osFlavor = Objects.requireNonNull(osFlavor);
            return this;
        }
        @CustomType.Setter
        public Builder osVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }
        @CustomType.Setter
        public Builder rapidDeploy(Boolean rapidDeploy) {
            this.rapidDeploy = Objects.requireNonNull(rapidDeploy);
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable String selector) {
            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetImagesImage build() {
            final var o = new GetImagesImage();
            o.architecture = architecture;
            o.created = created;
            o.deprecated = deprecated;
            o.description = description;
            o.id = id;
            o.labels = labels;
            o.name = name;
            o.osFlavor = osFlavor;
            o.osVersion = osVersion;
            o.rapidDeploy = rapidDeploy;
            o.selector = selector;
            o.type = type;
            return o;
        }
    }
}
