// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServerResult {
    /**
     * @return (string) The backup window of the server, if enabled.
     * 
     */
    private String backupWindow;
    /**
     * @return (bool) Whether backups are enabled.
     * 
     */
    private Boolean backups;
    /**
     * @return (string) The datacenter name. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
     * 
     */
    private String datacenter;
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    private Boolean deleteProtection;
    /**
     * @return (Optional, list) Firewall IDs the server is attached to.
     * 
     */
    private List<Integer> firewallIds;
    /**
     * @return (int) Unique ID of the server.
     * 
     */
    private Integer id;
    /**
     * @return (string) Name or ID of the image the server was created from.
     * 
     */
    private String image;
    /**
     * @return (string) The IPv4 address.
     * 
     */
    private String ipv4Address;
    /**
     * @return (string) The first IPv6 address of the assigned network.
     * 
     */
    private String ipv6Address;
    /**
     * @return (string) The IPv6 network.
     * 
     */
    private String ipv6Network;
    /**
     * @return (string) ID or Name of the mounted ISO image. Architecture of ISO must equal the server (type) architecture.
     * 
     */
    private String iso;
    /**
     * @return (map) User-defined labels (key-value pairs)
     * 
     */
    private Map<String,String> labels;
    /**
     * @return (string) The location name. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    private String location;
    /**
     * @return (string) Name of the server.
     * 
     */
    private String name;
    /**
     * @return (Optional, string) Placement Group ID the server is assigned to.
     * 
     */
    private @Nullable Integer placementGroupId;
    /**
     * @return (int) The size of the primary disk in GB.
     * 
     */
    private Integer primaryDiskSize;
    /**
     * @return (bool) Whether rebuild protection is enabled.
     * 
     */
    private Boolean rebuildProtection;
    private String rescue;
    /**
     * @deprecated
     * Please use the with_selector property instead.
     * 
     */
    @Deprecated /* Please use the with_selector property instead. */
    private @Nullable String selector;
    /**
     * @return (string) Name of the server type.
     * 
     */
    private String serverType;
    /**
     * @return (string) The status of the server.
     * 
     */
    private String status;
    private @Nullable String withSelector;
    private @Nullable List<String> withStatuses;

    private GetServerResult() {}
    /**
     * @return (string) The backup window of the server, if enabled.
     * 
     */
    public String backupWindow() {
        return this.backupWindow;
    }
    /**
     * @return (bool) Whether backups are enabled.
     * 
     */
    public Boolean backups() {
        return this.backups;
    }
    /**
     * @return (string) The datacenter name. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
     * 
     */
    public String datacenter() {
        return this.datacenter;
    }
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    public Boolean deleteProtection() {
        return this.deleteProtection;
    }
    /**
     * @return (Optional, list) Firewall IDs the server is attached to.
     * 
     */
    public List<Integer> firewallIds() {
        return this.firewallIds;
    }
    /**
     * @return (int) Unique ID of the server.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return (string) Name or ID of the image the server was created from.
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return (string) The IPv4 address.
     * 
     */
    public String ipv4Address() {
        return this.ipv4Address;
    }
    /**
     * @return (string) The first IPv6 address of the assigned network.
     * 
     */
    public String ipv6Address() {
        return this.ipv6Address;
    }
    /**
     * @return (string) The IPv6 network.
     * 
     */
    public String ipv6Network() {
        return this.ipv6Network;
    }
    /**
     * @return (string) ID or Name of the mounted ISO image. Architecture of ISO must equal the server (type) architecture.
     * 
     */
    public String iso() {
        return this.iso;
    }
    /**
     * @return (map) User-defined labels (key-value pairs)
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return (string) The location name. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return (string) Name of the server.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Optional, string) Placement Group ID the server is assigned to.
     * 
     */
    public Optional<Integer> placementGroupId() {
        return Optional.ofNullable(this.placementGroupId);
    }
    /**
     * @return (int) The size of the primary disk in GB.
     * 
     */
    public Integer primaryDiskSize() {
        return this.primaryDiskSize;
    }
    /**
     * @return (bool) Whether rebuild protection is enabled.
     * 
     */
    public Boolean rebuildProtection() {
        return this.rebuildProtection;
    }
    public String rescue() {
        return this.rescue;
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
     * @return (string) Name of the server type.
     * 
     */
    public String serverType() {
        return this.serverType;
    }
    /**
     * @return (string) The status of the server.
     * 
     */
    public String status() {
        return this.status;
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

    public static Builder builder(GetServerResult defaults) {
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
        private Map<String,String> labels;
        private String location;
        private String name;
        private @Nullable Integer placementGroupId;
        private Integer primaryDiskSize;
        private Boolean rebuildProtection;
        private String rescue;
        private @Nullable String selector;
        private String serverType;
        private String status;
        private @Nullable String withSelector;
        private @Nullable List<String> withStatuses;
        public Builder() {}
        public Builder(GetServerResult defaults) {
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
    	      this.primaryDiskSize = defaults.primaryDiskSize;
    	      this.rebuildProtection = defaults.rebuildProtection;
    	      this.rescue = defaults.rescue;
    	      this.selector = defaults.selector;
    	      this.serverType = defaults.serverType;
    	      this.status = defaults.status;
    	      this.withSelector = defaults.withSelector;
    	      this.withStatuses = defaults.withStatuses;
        }

        @CustomType.Setter
        public Builder backupWindow(String backupWindow) {
            if (backupWindow == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "backupWindow");
            }
            this.backupWindow = backupWindow;
            return this;
        }
        @CustomType.Setter
        public Builder backups(Boolean backups) {
            if (backups == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "backups");
            }
            this.backups = backups;
            return this;
        }
        @CustomType.Setter
        public Builder datacenter(String datacenter) {
            if (datacenter == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "datacenter");
            }
            this.datacenter = datacenter;
            return this;
        }
        @CustomType.Setter
        public Builder deleteProtection(Boolean deleteProtection) {
            if (deleteProtection == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "deleteProtection");
            }
            this.deleteProtection = deleteProtection;
            return this;
        }
        @CustomType.Setter
        public Builder firewallIds(List<Integer> firewallIds) {
            if (firewallIds == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "firewallIds");
            }
            this.firewallIds = firewallIds;
            return this;
        }
        public Builder firewallIds(Integer... firewallIds) {
            return firewallIds(List.of(firewallIds));
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            if (image == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "image");
            }
            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Address(String ipv4Address) {
            if (ipv4Address == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "ipv4Address");
            }
            this.ipv4Address = ipv4Address;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Address(String ipv6Address) {
            if (ipv6Address == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "ipv6Address");
            }
            this.ipv6Address = ipv6Address;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Network(String ipv6Network) {
            if (ipv6Network == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "ipv6Network");
            }
            this.ipv6Network = ipv6Network;
            return this;
        }
        @CustomType.Setter
        public Builder iso(String iso) {
            if (iso == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "iso");
            }
            this.iso = iso;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder placementGroupId(@Nullable Integer placementGroupId) {

            this.placementGroupId = placementGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder primaryDiskSize(Integer primaryDiskSize) {
            if (primaryDiskSize == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "primaryDiskSize");
            }
            this.primaryDiskSize = primaryDiskSize;
            return this;
        }
        @CustomType.Setter
        public Builder rebuildProtection(Boolean rebuildProtection) {
            if (rebuildProtection == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "rebuildProtection");
            }
            this.rebuildProtection = rebuildProtection;
            return this;
        }
        @CustomType.Setter
        public Builder rescue(String rescue) {
            if (rescue == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "rescue");
            }
            this.rescue = rescue;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable String selector) {

            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder serverType(String serverType) {
            if (serverType == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "serverType");
            }
            this.serverType = serverType;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "status");
            }
            this.status = status;
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
        public GetServerResult build() {
            final var _resultValue = new GetServerResult();
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
            _resultValue.primaryDiskSize = primaryDiskSize;
            _resultValue.rebuildProtection = rebuildProtection;
            _resultValue.rescue = rescue;
            _resultValue.selector = selector;
            _resultValue.serverType = serverType;
            _resultValue.status = status;
            _resultValue.withSelector = withSelector;
            _resultValue.withStatuses = withStatuses;
            return _resultValue;
        }
    }
}
