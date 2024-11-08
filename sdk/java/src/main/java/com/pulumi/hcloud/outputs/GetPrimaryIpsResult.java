// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.hcloud.outputs.GetPrimaryIpsPrimaryIp;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrimaryIpsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (list) List of all matching primary ips. See `data.hcloud_primary_ip` for schema.
     * 
     */
    private List<GetPrimaryIpsPrimaryIp> primaryIps;
    private @Nullable String withSelector;

    private GetPrimaryIpsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (list) List of all matching primary ips. See `data.hcloud_primary_ip` for schema.
     * 
     */
    public List<GetPrimaryIpsPrimaryIp> primaryIps() {
        return this.primaryIps;
    }
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrimaryIpsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetPrimaryIpsPrimaryIp> primaryIps;
        private @Nullable String withSelector;
        public Builder() {}
        public Builder(GetPrimaryIpsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.primaryIps = defaults.primaryIps;
    	      this.withSelector = defaults.withSelector;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPrimaryIpsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder primaryIps(List<GetPrimaryIpsPrimaryIp> primaryIps) {
            if (primaryIps == null) {
              throw new MissingRequiredPropertyException("GetPrimaryIpsResult", "primaryIps");
            }
            this.primaryIps = primaryIps;
            return this;
        }
        public Builder primaryIps(GetPrimaryIpsPrimaryIp... primaryIps) {
            return primaryIps(List.of(primaryIps));
        }
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {

            this.withSelector = withSelector;
            return this;
        }
        public GetPrimaryIpsResult build() {
            final var _resultValue = new GetPrimaryIpsResult();
            _resultValue.id = id;
            _resultValue.primaryIps = primaryIps;
            _resultValue.withSelector = withSelector;
            return _resultValue;
        }
    }
}