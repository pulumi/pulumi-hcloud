// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.hcloud.outputs.GetDatacentersDatacenter;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatacentersResult {
    /**
     * @deprecated
     * Use datacenters list instead
     * 
     */
    @Deprecated /* Use datacenters list instead */
    private List<String> datacenterIds;
    private List<GetDatacentersDatacenter> datacenters;
    /**
     * @deprecated
     * Use datacenters list instead
     * 
     */
    @Deprecated /* Use datacenters list instead */
    private List<String> descriptions;
    /**
     * @return The ID of this resource.
     * 
     */
    private String id;
    /**
     * @deprecated
     * Use datacenters list instead
     * 
     */
    @Deprecated /* Use datacenters list instead */
    private List<String> names;

    private GetDatacentersResult() {}
    /**
     * @deprecated
     * Use datacenters list instead
     * 
     */
    @Deprecated /* Use datacenters list instead */
    public List<String> datacenterIds() {
        return this.datacenterIds;
    }
    public List<GetDatacentersDatacenter> datacenters() {
        return this.datacenters;
    }
    /**
     * @deprecated
     * Use datacenters list instead
     * 
     */
    @Deprecated /* Use datacenters list instead */
    public List<String> descriptions() {
        return this.descriptions;
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @deprecated
     * Use datacenters list instead
     * 
     */
    @Deprecated /* Use datacenters list instead */
    public List<String> names() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatacentersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> datacenterIds;
        private List<GetDatacentersDatacenter> datacenters;
        private List<String> descriptions;
        private String id;
        private List<String> names;
        public Builder() {}
        public Builder(GetDatacentersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenterIds = defaults.datacenterIds;
    	      this.datacenters = defaults.datacenters;
    	      this.descriptions = defaults.descriptions;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
        }

        @CustomType.Setter
        public Builder datacenterIds(List<String> datacenterIds) {
            if (datacenterIds == null) {
              throw new MissingRequiredPropertyException("GetDatacentersResult", "datacenterIds");
            }
            this.datacenterIds = datacenterIds;
            return this;
        }
        public Builder datacenterIds(String... datacenterIds) {
            return datacenterIds(List.of(datacenterIds));
        }
        @CustomType.Setter
        public Builder datacenters(List<GetDatacentersDatacenter> datacenters) {
            if (datacenters == null) {
              throw new MissingRequiredPropertyException("GetDatacentersResult", "datacenters");
            }
            this.datacenters = datacenters;
            return this;
        }
        public Builder datacenters(GetDatacentersDatacenter... datacenters) {
            return datacenters(List.of(datacenters));
        }
        @CustomType.Setter
        public Builder descriptions(List<String> descriptions) {
            if (descriptions == null) {
              throw new MissingRequiredPropertyException("GetDatacentersResult", "descriptions");
            }
            this.descriptions = descriptions;
            return this;
        }
        public Builder descriptions(String... descriptions) {
            return descriptions(List.of(descriptions));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDatacentersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetDatacentersResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public GetDatacentersResult build() {
            final var _resultValue = new GetDatacentersResult();
            _resultValue.datacenterIds = datacenterIds;
            _resultValue.datacenters = datacenters;
            _resultValue.descriptions = descriptions;
            _resultValue.id = id;
            _resultValue.names = names;
            return _resultValue;
        }
    }
}
