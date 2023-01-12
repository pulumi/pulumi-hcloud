// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageResult {
    /**
     * @return (string) Date when the Image was created (in ISO-8601 format).
     * 
     */
    private String created;
    /**
     * @return (string) Point in time when the image is considered to be deprecated (in ISO-8601 format).
     * 
     */
    private String deprecated;
    /**
     * @return (string) Description of the Image.
     * 
     */
    private String description;
    /**
     * @return (int) Unique ID of the Image.
     * 
     */
    private Integer id;
    private Map<String,Object> labels;
    private @Nullable Boolean mostRecent;
    /**
     * @return (string) Name of the Image, only present when the Image is of type `system`.
     * 
     */
    private String name;
    /**
     * @return (string) Flavor of operating system contained in the image, could be `ubuntu`, `centos`, `debian`, `fedora` or `unknown`.
     * 
     */
    private String osFlavor;
    /**
     * @return (string) Operating system version.
     * 
     */
    private String osVersion;
    /**
     * @return (bool) Indicates that rapid deploy of the image is available.
     * 
     */
    private Boolean rapidDeploy;
    /**
     * @deprecated
     * Please use the with_selector property instead.
     * 
     */
    @Deprecated /* Please use the with_selector property instead. */
    private @Nullable String selector;
    /**
     * @return (string) Type of the Image, could be `system`, `backup` or `snapshot`.
     * 
     */
    private String type;
    private @Nullable String withSelector;
    private @Nullable List<String> withStatuses;

    private GetImageResult() {}
    /**
     * @return (string) Date when the Image was created (in ISO-8601 format).
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return (string) Point in time when the image is considered to be deprecated (in ISO-8601 format).
     * 
     */
    public String deprecated() {
        return this.deprecated;
    }
    /**
     * @return (string) Description of the Image.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (int) Unique ID of the Image.
     * 
     */
    public Integer id() {
        return this.id;
    }
    public Map<String,Object> labels() {
        return this.labels;
    }
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * @return (string) Name of the Image, only present when the Image is of type `system`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (string) Flavor of operating system contained in the image, could be `ubuntu`, `centos`, `debian`, `fedora` or `unknown`.
     * 
     */
    public String osFlavor() {
        return this.osFlavor;
    }
    /**
     * @return (string) Operating system version.
     * 
     */
    public String osVersion() {
        return this.osVersion;
    }
    /**
     * @return (bool) Indicates that rapid deploy of the image is available.
     * 
     */
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
    /**
     * @return (string) Type of the Image, could be `system`, `backup` or `snapshot`.
     * 
     */
    public String type() {
        return this.type;
    }
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }
    public List<String> withStatuses() {
        return this.withStatuses == null ? List.of() : this.withStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String created;
        private String deprecated;
        private String description;
        private Integer id;
        private Map<String,Object> labels;
        private @Nullable Boolean mostRecent;
        private String name;
        private String osFlavor;
        private String osVersion;
        private Boolean rapidDeploy;
        private @Nullable String selector;
        private String type;
        private @Nullable String withSelector;
        private @Nullable List<String> withStatuses;
        public Builder() {}
        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.deprecated = defaults.deprecated;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.mostRecent = defaults.mostRecent;
    	      this.name = defaults.name;
    	      this.osFlavor = defaults.osFlavor;
    	      this.osVersion = defaults.osVersion;
    	      this.rapidDeploy = defaults.rapidDeploy;
    	      this.selector = defaults.selector;
    	      this.type = defaults.type;
    	      this.withSelector = defaults.withSelector;
    	      this.withStatuses = defaults.withStatuses;
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
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
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
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {
            this.withSelector = withSelector;
            return this;
        }
        @CustomType.Setter
        public Builder withStatuses(@Nullable List<String> withStatuses) {
            this.withStatuses = withStatuses;
            return this;
        }
        public Builder withStatuses(String... withStatuses) {
            return withStatuses(List.of(withStatuses));
        }
        public GetImageResult build() {
            final var o = new GetImageResult();
            o.created = created;
            o.deprecated = deprecated;
            o.description = description;
            o.id = id;
            o.labels = labels;
            o.mostRecent = mostRecent;
            o.name = name;
            o.osFlavor = osFlavor;
            o.osVersion = osVersion;
            o.rapidDeploy = rapidDeploy;
            o.selector = selector;
            o.type = type;
            o.withSelector = withSelector;
            o.withStatuses = withStatuses;
            return o;
        }
    }
}
