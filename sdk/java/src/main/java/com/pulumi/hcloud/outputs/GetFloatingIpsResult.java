// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.hcloud.outputs.GetFloatingIpsFloatingIp;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFloatingIpsResult {
    /**
     * @return (list) List of all matching floating ips. See `data.hcloud_floating_ip` for schema.
     * 
     */
    private List<GetFloatingIpsFloatingIp> floatingIps;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String withSelector;

    private GetFloatingIpsResult() {}
    /**
     * @return (list) List of all matching floating ips. See `data.hcloud_floating_ip` for schema.
     * 
     */
    public List<GetFloatingIpsFloatingIp> floatingIps() {
        return this.floatingIps;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFloatingIpsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFloatingIpsFloatingIp> floatingIps;
        private String id;
        private @Nullable String withSelector;
        public Builder() {}
        public Builder(GetFloatingIpsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.floatingIps = defaults.floatingIps;
    	      this.id = defaults.id;
    	      this.withSelector = defaults.withSelector;
        }

        @CustomType.Setter
        public Builder floatingIps(List<GetFloatingIpsFloatingIp> floatingIps) {
            this.floatingIps = Objects.requireNonNull(floatingIps);
            return this;
        }
        public Builder floatingIps(GetFloatingIpsFloatingIp... floatingIps) {
            return floatingIps(List.of(floatingIps));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {
            this.withSelector = withSelector;
            return this;
        }
        public GetFloatingIpsResult build() {
            final var o = new GetFloatingIpsResult();
            o.floatingIps = floatingIps;
            o.id = id;
            o.withSelector = withSelector;
            return o;
        }
    }
}
