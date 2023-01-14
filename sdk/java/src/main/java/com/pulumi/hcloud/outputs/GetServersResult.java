// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.hcloud.outputs.GetServersServer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServersResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (list) List of all matching servers. See `data.hcloud_server` for schema.
     * 
     */
    private List<GetServersServer> servers;
    private @Nullable String withSelector;
    private @Nullable List<String> withStatuses;

    private GetServersResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (list) List of all matching servers. See `data.hcloud_server` for schema.
     * 
     */
    public List<GetServersServer> servers() {
        return this.servers;
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

    public static Builder builder(GetServersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetServersServer> servers;
        private @Nullable String withSelector;
        private @Nullable List<String> withStatuses;
        public Builder() {}
        public Builder(GetServersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.servers = defaults.servers;
    	      this.withSelector = defaults.withSelector;
    	      this.withStatuses = defaults.withStatuses;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder servers(List<GetServersServer> servers) {
            this.servers = Objects.requireNonNull(servers);
            return this;
        }
        public Builder servers(GetServersServer... servers) {
            return servers(List.of(servers));
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
        public GetServersResult build() {
            final var o = new GetServersResult();
            o.id = id;
            o.servers = servers;
            o.withSelector = withSelector;
            o.withStatuses = withStatuses;
            return o;
        }
    }
}
