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
public final class GetServersServer {
    private String backupWindow;
    private Boolean backups;
    private String datacenter;
    private Boolean deleteProtection;
    private List<Integer> firewallIds;
    private Integer id;
    private String image;
    private String ipv4Address;
    private String ipv6Address;
    private String ipv6Network;
    private String iso;
    private Map<String,Object> labels;
    private String location;
    private String name;
    private @Nullable Integer placementGroupId;
    private Boolean rebuildProtection;
    private String rescue;
    private String serverType;
    private String status;

    private GetServersServer() {}
    public String backupWindow() {
        return this.backupWindow;
    }
    public Boolean backups() {
        return this.backups;
    }
    public String datacenter() {
        return this.datacenter;
    }
    public Boolean deleteProtection() {
        return this.deleteProtection;
    }
    public List<Integer> firewallIds() {
        return this.firewallIds;
    }
    public Integer id() {
        return this.id;
    }
    public String image() {
        return this.image;
    }
    public String ipv4Address() {
        return this.ipv4Address;
    }
    public String ipv6Address() {
        return this.ipv6Address;
    }
    public String ipv6Network() {
        return this.ipv6Network;
    }
    public String iso() {
        return this.iso;
    }
    public Map<String,Object> labels() {
        return this.labels;
    }
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public Optional<Integer> placementGroupId() {
        return Optional.ofNullable(this.placementGroupId);
    }
    public Boolean rebuildProtection() {
        return this.rebuildProtection;
    }
    public String rescue() {
        return this.rescue;
    }
    public String serverType() {
        return this.serverType;
    }
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServersServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backupWindow;
        private Boolean backups;
        private String datacenter;
        private Boolean deleteProtection;
        private List<Integer> firewallIds;
        private Integer id;
        private String image;
        private String ipv4Address;
        private String ipv6Address;
        private String ipv6Network;
        private String iso;
        private Map<String,Object> labels;
        private String location;
        private String name;
        private @Nullable Integer placementGroupId;
        private Boolean rebuildProtection;
        private String rescue;
        private String serverType;
        private String status;
        public Builder() {}
        public Builder(GetServersServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupWindow = defaults.backupWindow;
    	      this.backups = defaults.backups;
    	      this.datacenter = defaults.datacenter;
    	      this.deleteProtection = defaults.deleteProtection;
    	      this.firewallIds = defaults.firewallIds;
    	      this.id = defaults.id;
    	      this.image = defaults.image;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.ipv6Network = defaults.ipv6Network;
    	      this.iso = defaults.iso;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.placementGroupId = defaults.placementGroupId;
    	      this.rebuildProtection = defaults.rebuildProtection;
    	      this.rescue = defaults.rescue;
    	      this.serverType = defaults.serverType;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder backupWindow(String backupWindow) {
            this.backupWindow = Objects.requireNonNull(backupWindow);
            return this;
        }
        @CustomType.Setter
        public Builder backups(Boolean backups) {
            this.backups = Objects.requireNonNull(backups);
            return this;
        }
        @CustomType.Setter
        public Builder datacenter(String datacenter) {
            this.datacenter = Objects.requireNonNull(datacenter);
            return this;
        }
        @CustomType.Setter
        public Builder deleteProtection(Boolean deleteProtection) {
            this.deleteProtection = Objects.requireNonNull(deleteProtection);
            return this;
        }
        @CustomType.Setter
        public Builder firewallIds(List<Integer> firewallIds) {
            this.firewallIds = Objects.requireNonNull(firewallIds);
            return this;
        }
        public Builder firewallIds(Integer... firewallIds) {
            return firewallIds(List.of(firewallIds));
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Address(String ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Network(String ipv6Network) {
            this.ipv6Network = Objects.requireNonNull(ipv6Network);
            return this;
        }
        @CustomType.Setter
        public Builder iso(String iso) {
            this.iso = Objects.requireNonNull(iso);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder placementGroupId(@Nullable Integer placementGroupId) {
            this.placementGroupId = placementGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder rebuildProtection(Boolean rebuildProtection) {
            this.rebuildProtection = Objects.requireNonNull(rebuildProtection);
            return this;
        }
        @CustomType.Setter
        public Builder rescue(String rescue) {
            this.rescue = Objects.requireNonNull(rescue);
            return this;
        }
        @CustomType.Setter
        public Builder serverType(String serverType) {
            this.serverType = Objects.requireNonNull(serverType);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetServersServer build() {
            final var _resultValue = new GetServersServer();
            _resultValue.backupWindow = backupWindow;
            _resultValue.backups = backups;
            _resultValue.datacenter = datacenter;
            _resultValue.deleteProtection = deleteProtection;
            _resultValue.firewallIds = firewallIds;
            _resultValue.id = id;
            _resultValue.image = image;
            _resultValue.ipv4Address = ipv4Address;
            _resultValue.ipv6Address = ipv6Address;
            _resultValue.ipv6Network = ipv6Network;
            _resultValue.iso = iso;
            _resultValue.labels = labels;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.placementGroupId = placementGroupId;
            _resultValue.rebuildProtection = rebuildProtection;
            _resultValue.rescue = rescue;
            _resultValue.serverType = serverType;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
