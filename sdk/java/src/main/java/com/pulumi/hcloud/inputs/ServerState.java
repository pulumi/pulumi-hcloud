// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.hcloud.inputs.ServerNetworkArgs;
import com.pulumi.hcloud.inputs.ServerPublicNetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerState extends com.pulumi.resources.ResourceArgs {

    public static final ServerState Empty = new ServerState();

    /**
     * Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
     * 
     */
    @Import(name="allowDeprecatedImages")
    private @Nullable Output<Boolean> allowDeprecatedImages;

    /**
     * @return Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
     * 
     */
    public Optional<Output<Boolean>> allowDeprecatedImages() {
        return Optional.ofNullable(this.allowDeprecatedImages);
    }

    /**
     * (string) The backup window of the server, if enabled.
     * 
     * @deprecated
     * You should remove this property from your terraform configuration.
     * 
     */
    @Deprecated /* You should remove this property from your terraform configuration. */
    @Import(name="backupWindow")
    private @Nullable Output<String> backupWindow;

    /**
     * @return (string) The backup window of the server, if enabled.
     * 
     * @deprecated
     * You should remove this property from your terraform configuration.
     * 
     */
    @Deprecated /* You should remove this property from your terraform configuration. */
    public Optional<Output<String>> backupWindow() {
        return Optional.ofNullable(this.backupWindow);
    }

    /**
     * Enable or disable backups.
     * 
     */
    @Import(name="backups")
    private @Nullable Output<Boolean> backups;

    /**
     * @return Enable or disable backups.
     * 
     */
    public Optional<Output<Boolean>> backups() {
        return Optional.ofNullable(this.backups);
    }

    /**
     * The datacenter name to create the server in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
     * 
     */
    @Import(name="datacenter")
    private @Nullable Output<String> datacenter;

    /**
     * @return The datacenter name to create the server in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
     * 
     */
    public Optional<Output<String>> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }

    /**
     * Enable or disable delete protection (Needs to be the same as `rebuild_protection`). See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    @Import(name="deleteProtection")
    private @Nullable Output<Boolean> deleteProtection;

    /**
     * @return Enable or disable delete protection (Needs to be the same as `rebuild_protection`). See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    public Optional<Output<Boolean>> deleteProtection() {
        return Optional.ofNullable(this.deleteProtection);
    }

    /**
     * Firewall IDs the server should be attached to on creation.
     * 
     */
    @Import(name="firewallIds")
    private @Nullable Output<List<Integer>> firewallIds;

    /**
     * @return Firewall IDs the server should be attached to on creation.
     * 
     */
    public Optional<Output<List<Integer>>> firewallIds() {
        return Optional.ofNullable(this.firewallIds);
    }

    /**
     * Ignores any updates
     * to the `firewall_ids` argument which were received from the server.
     * This should not be used in normal cases. See the documentation of the
     * `hcloud.FirewallAttachment` resource for a reason to use this
     * argument.
     * 
     */
    @Import(name="ignoreRemoteFirewallIds")
    private @Nullable Output<Boolean> ignoreRemoteFirewallIds;

    /**
     * @return Ignores any updates
     * to the `firewall_ids` argument which were received from the server.
     * This should not be used in normal cases. See the documentation of the
     * `hcloud.FirewallAttachment` resource for a reason to use this
     * argument.
     * 
     */
    public Optional<Output<Boolean>> ignoreRemoteFirewallIds() {
        return Optional.ofNullable(this.ignoreRemoteFirewallIds);
    }

    @Import(name="image")
    private @Nullable Output<String> image;

    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * (string) The IPv4 address.
     * 
     */
    @Import(name="ipv4Address")
    private @Nullable Output<String> ipv4Address;

    /**
     * @return (string) The IPv4 address.
     * 
     */
    public Optional<Output<String>> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    /**
     * (string) The first IPv6 address of the assigned network.
     * 
     */
    @Import(name="ipv6Address")
    private @Nullable Output<String> ipv6Address;

    /**
     * @return (string) The first IPv6 address of the assigned network.
     * 
     */
    public Optional<Output<String>> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }

    /**
     * (string) The IPv6 network.
     * 
     */
    @Import(name="ipv6Network")
    private @Nullable Output<String> ipv6Network;

    /**
     * @return (string) The IPv6 network.
     * 
     */
    public Optional<Output<String>> ipv6Network() {
        return Optional.ofNullable(this.ipv6Network);
    }

    /**
     * ID or Name of an ISO image to mount.
     * 
     */
    @Import(name="iso")
    private @Nullable Output<String> iso;

    /**
     * @return ID or Name of an ISO image to mount.
     * 
     */
    public Optional<Output<String>> iso() {
        return Optional.ofNullable(this.iso);
    }

    /**
     * If true, do not upgrade the disk. This allows downgrading the server type later.
     * 
     */
    @Import(name="keepDisk")
    private @Nullable Output<Boolean> keepDisk;

    /**
     * @return If true, do not upgrade the disk. This allows downgrading the server type later.
     * 
     */
    public Optional<Output<Boolean>> keepDisk() {
        return Optional.ofNullable(this.keepDisk);
    }

    /**
     * User-defined labels (key-value pairs) should be created with.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location name to create the server in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location name to create the server in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Network the server should be attached to on creation. (Can be specified multiple times)
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<ServerNetworkArgs>> networks;

    /**
     * @return Network the server should be attached to on creation. (Can be specified multiple times)
     * 
     */
    public Optional<Output<List<ServerNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * Placement Group ID the server added to on creation.
     * 
     */
    @Import(name="placementGroupId")
    private @Nullable Output<Integer> placementGroupId;

    /**
     * @return Placement Group ID the server added to on creation.
     * 
     */
    public Optional<Output<Integer>> placementGroupId() {
        return Optional.ofNullable(this.placementGroupId);
    }

    /**
     * (int) The size of the primary disk in GB.
     * 
     */
    @Import(name="primaryDiskSize")
    private @Nullable Output<Integer> primaryDiskSize;

    /**
     * @return (int) The size of the primary disk in GB.
     * 
     */
    public Optional<Output<Integer>> primaryDiskSize() {
        return Optional.ofNullable(this.primaryDiskSize);
    }

    /**
     * In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
     * If this block is not defined, two primary (ipv4 &amp; ipv6) ips getting auto generated.
     * 
     */
    @Import(name="publicNets")
    private @Nullable Output<List<ServerPublicNetArgs>> publicNets;

    /**
     * @return In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
     * If this block is not defined, two primary (ipv4 &amp; ipv6) ips getting auto generated.
     * 
     */
    public Optional<Output<List<ServerPublicNetArgs>>> publicNets() {
        return Optional.ofNullable(this.publicNets);
    }

    /**
     * Enable or disable rebuild protection (Needs to be the same as `delete_protection`).
     * 
     */
    @Import(name="rebuildProtection")
    private @Nullable Output<Boolean> rebuildProtection;

    /**
     * @return Enable or disable rebuild protection (Needs to be the same as `delete_protection`).
     * 
     */
    public Optional<Output<Boolean>> rebuildProtection() {
        return Optional.ofNullable(this.rebuildProtection);
    }

    /**
     * Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
     * 
     */
    @Import(name="rescue")
    private @Nullable Output<String> rescue;

    /**
     * @return Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
     * 
     */
    public Optional<Output<String>> rescue() {
        return Optional.ofNullable(this.rescue);
    }

    /**
     * Name of the server type this server should be created with.
     * 
     */
    @Import(name="serverType")
    private @Nullable Output<String> serverType;

    /**
     * @return Name of the server type this server should be created with.
     * 
     */
    public Optional<Output<String>> serverType() {
        return Optional.ofNullable(this.serverType);
    }

    /**
     * Whether to try shutting the server down gracefully before deleting it.
     * 
     */
    @Import(name="shutdownBeforeDeletion")
    private @Nullable Output<Boolean> shutdownBeforeDeletion;

    /**
     * @return Whether to try shutting the server down gracefully before deleting it.
     * 
     */
    public Optional<Output<Boolean>> shutdownBeforeDeletion() {
        return Optional.ofNullable(this.shutdownBeforeDeletion);
    }

    /**
     * SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ ssh_keys ]`.
     * 
     */
    @Import(name="sshKeys")
    private @Nullable Output<List<String>> sshKeys;

    /**
     * @return SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ ssh_keys ]`.
     * 
     */
    public Optional<Output<List<String>>> sshKeys() {
        return Optional.ofNullable(this.sshKeys);
    }

    /**
     * (string) The status of the server.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return (string) The status of the server.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Cloud-Init user data to use during server creation
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return Cloud-Init user data to use during server creation
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    private ServerState() {}

    private ServerState(ServerState $) {
        this.allowDeprecatedImages = $.allowDeprecatedImages;
        this.backupWindow = $.backupWindow;
        this.backups = $.backups;
        this.datacenter = $.datacenter;
        this.deleteProtection = $.deleteProtection;
        this.firewallIds = $.firewallIds;
        this.ignoreRemoteFirewallIds = $.ignoreRemoteFirewallIds;
        this.image = $.image;
        this.ipv4Address = $.ipv4Address;
        this.ipv6Address = $.ipv6Address;
        this.ipv6Network = $.ipv6Network;
        this.iso = $.iso;
        this.keepDisk = $.keepDisk;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.networks = $.networks;
        this.placementGroupId = $.placementGroupId;
        this.primaryDiskSize = $.primaryDiskSize;
        this.publicNets = $.publicNets;
        this.rebuildProtection = $.rebuildProtection;
        this.rescue = $.rescue;
        this.serverType = $.serverType;
        this.shutdownBeforeDeletion = $.shutdownBeforeDeletion;
        this.sshKeys = $.sshKeys;
        this.status = $.status;
        this.userData = $.userData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerState $;

        public Builder() {
            $ = new ServerState();
        }

        public Builder(ServerState defaults) {
            $ = new ServerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowDeprecatedImages Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
         * 
         * @return builder
         * 
         */
        public Builder allowDeprecatedImages(@Nullable Output<Boolean> allowDeprecatedImages) {
            $.allowDeprecatedImages = allowDeprecatedImages;
            return this;
        }

        /**
         * @param allowDeprecatedImages Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
         * 
         * @return builder
         * 
         */
        public Builder allowDeprecatedImages(Boolean allowDeprecatedImages) {
            return allowDeprecatedImages(Output.of(allowDeprecatedImages));
        }

        /**
         * @param backupWindow (string) The backup window of the server, if enabled.
         * 
         * @return builder
         * 
         * @deprecated
         * You should remove this property from your terraform configuration.
         * 
         */
        @Deprecated /* You should remove this property from your terraform configuration. */
        public Builder backupWindow(@Nullable Output<String> backupWindow) {
            $.backupWindow = backupWindow;
            return this;
        }

        /**
         * @param backupWindow (string) The backup window of the server, if enabled.
         * 
         * @return builder
         * 
         * @deprecated
         * You should remove this property from your terraform configuration.
         * 
         */
        @Deprecated /* You should remove this property from your terraform configuration. */
        public Builder backupWindow(String backupWindow) {
            return backupWindow(Output.of(backupWindow));
        }

        /**
         * @param backups Enable or disable backups.
         * 
         * @return builder
         * 
         */
        public Builder backups(@Nullable Output<Boolean> backups) {
            $.backups = backups;
            return this;
        }

        /**
         * @param backups Enable or disable backups.
         * 
         * @return builder
         * 
         */
        public Builder backups(Boolean backups) {
            return backups(Output.of(backups));
        }

        /**
         * @param datacenter The datacenter name to create the server in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(@Nullable Output<String> datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        /**
         * @param datacenter The datacenter name to create the server in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(String datacenter) {
            return datacenter(Output.of(datacenter));
        }

        /**
         * @param deleteProtection Enable or disable delete protection (Needs to be the same as `rebuild_protection`). See &#34;Delete Protection&#34; in the Provider Docs for details.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(@Nullable Output<Boolean> deleteProtection) {
            $.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * @param deleteProtection Enable or disable delete protection (Needs to be the same as `rebuild_protection`). See &#34;Delete Protection&#34; in the Provider Docs for details.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(Boolean deleteProtection) {
            return deleteProtection(Output.of(deleteProtection));
        }

        /**
         * @param firewallIds Firewall IDs the server should be attached to on creation.
         * 
         * @return builder
         * 
         */
        public Builder firewallIds(@Nullable Output<List<Integer>> firewallIds) {
            $.firewallIds = firewallIds;
            return this;
        }

        /**
         * @param firewallIds Firewall IDs the server should be attached to on creation.
         * 
         * @return builder
         * 
         */
        public Builder firewallIds(List<Integer> firewallIds) {
            return firewallIds(Output.of(firewallIds));
        }

        /**
         * @param firewallIds Firewall IDs the server should be attached to on creation.
         * 
         * @return builder
         * 
         */
        public Builder firewallIds(Integer... firewallIds) {
            return firewallIds(List.of(firewallIds));
        }

        /**
         * @param ignoreRemoteFirewallIds Ignores any updates
         * to the `firewall_ids` argument which were received from the server.
         * This should not be used in normal cases. See the documentation of the
         * `hcloud.FirewallAttachment` resource for a reason to use this
         * argument.
         * 
         * @return builder
         * 
         */
        public Builder ignoreRemoteFirewallIds(@Nullable Output<Boolean> ignoreRemoteFirewallIds) {
            $.ignoreRemoteFirewallIds = ignoreRemoteFirewallIds;
            return this;
        }

        /**
         * @param ignoreRemoteFirewallIds Ignores any updates
         * to the `firewall_ids` argument which were received from the server.
         * This should not be used in normal cases. See the documentation of the
         * `hcloud.FirewallAttachment` resource for a reason to use this
         * argument.
         * 
         * @return builder
         * 
         */
        public Builder ignoreRemoteFirewallIds(Boolean ignoreRemoteFirewallIds) {
            return ignoreRemoteFirewallIds(Output.of(ignoreRemoteFirewallIds));
        }

        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param ipv4Address (string) The IPv4 address.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            $.ipv4Address = ipv4Address;
            return this;
        }

        /**
         * @param ipv4Address (string) The IPv4 address.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(String ipv4Address) {
            return ipv4Address(Output.of(ipv4Address));
        }

        /**
         * @param ipv6Address (string) The first IPv6 address of the assigned network.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            $.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * @param ipv6Address (string) The first IPv6 address of the assigned network.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(String ipv6Address) {
            return ipv6Address(Output.of(ipv6Address));
        }

        /**
         * @param ipv6Network (string) The IPv6 network.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Network(@Nullable Output<String> ipv6Network) {
            $.ipv6Network = ipv6Network;
            return this;
        }

        /**
         * @param ipv6Network (string) The IPv6 network.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Network(String ipv6Network) {
            return ipv6Network(Output.of(ipv6Network));
        }

        /**
         * @param iso ID or Name of an ISO image to mount.
         * 
         * @return builder
         * 
         */
        public Builder iso(@Nullable Output<String> iso) {
            $.iso = iso;
            return this;
        }

        /**
         * @param iso ID or Name of an ISO image to mount.
         * 
         * @return builder
         * 
         */
        public Builder iso(String iso) {
            return iso(Output.of(iso));
        }

        /**
         * @param keepDisk If true, do not upgrade the disk. This allows downgrading the server type later.
         * 
         * @return builder
         * 
         */
        public Builder keepDisk(@Nullable Output<Boolean> keepDisk) {
            $.keepDisk = keepDisk;
            return this;
        }

        /**
         * @param keepDisk If true, do not upgrade the disk. This allows downgrading the server type later.
         * 
         * @return builder
         * 
         */
        public Builder keepDisk(Boolean keepDisk) {
            return keepDisk(Output.of(keepDisk));
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location name to create the server in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location name to create the server in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networks Network the server should be attached to on creation. (Can be specified multiple times)
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<ServerNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks Network the server should be attached to on creation. (Can be specified multiple times)
         * 
         * @return builder
         * 
         */
        public Builder networks(List<ServerNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks Network the server should be attached to on creation. (Can be specified multiple times)
         * 
         * @return builder
         * 
         */
        public Builder networks(ServerNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param placementGroupId Placement Group ID the server added to on creation.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupId(@Nullable Output<Integer> placementGroupId) {
            $.placementGroupId = placementGroupId;
            return this;
        }

        /**
         * @param placementGroupId Placement Group ID the server added to on creation.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupId(Integer placementGroupId) {
            return placementGroupId(Output.of(placementGroupId));
        }

        /**
         * @param primaryDiskSize (int) The size of the primary disk in GB.
         * 
         * @return builder
         * 
         */
        public Builder primaryDiskSize(@Nullable Output<Integer> primaryDiskSize) {
            $.primaryDiskSize = primaryDiskSize;
            return this;
        }

        /**
         * @param primaryDiskSize (int) The size of the primary disk in GB.
         * 
         * @return builder
         * 
         */
        public Builder primaryDiskSize(Integer primaryDiskSize) {
            return primaryDiskSize(Output.of(primaryDiskSize));
        }

        /**
         * @param publicNets In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
         * If this block is not defined, two primary (ipv4 &amp; ipv6) ips getting auto generated.
         * 
         * @return builder
         * 
         */
        public Builder publicNets(@Nullable Output<List<ServerPublicNetArgs>> publicNets) {
            $.publicNets = publicNets;
            return this;
        }

        /**
         * @param publicNets In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
         * If this block is not defined, two primary (ipv4 &amp; ipv6) ips getting auto generated.
         * 
         * @return builder
         * 
         */
        public Builder publicNets(List<ServerPublicNetArgs> publicNets) {
            return publicNets(Output.of(publicNets));
        }

        /**
         * @param publicNets In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
         * If this block is not defined, two primary (ipv4 &amp; ipv6) ips getting auto generated.
         * 
         * @return builder
         * 
         */
        public Builder publicNets(ServerPublicNetArgs... publicNets) {
            return publicNets(List.of(publicNets));
        }

        /**
         * @param rebuildProtection Enable or disable rebuild protection (Needs to be the same as `delete_protection`).
         * 
         * @return builder
         * 
         */
        public Builder rebuildProtection(@Nullable Output<Boolean> rebuildProtection) {
            $.rebuildProtection = rebuildProtection;
            return this;
        }

        /**
         * @param rebuildProtection Enable or disable rebuild protection (Needs to be the same as `delete_protection`).
         * 
         * @return builder
         * 
         */
        public Builder rebuildProtection(Boolean rebuildProtection) {
            return rebuildProtection(Output.of(rebuildProtection));
        }

        /**
         * @param rescue Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
         * 
         * @return builder
         * 
         */
        public Builder rescue(@Nullable Output<String> rescue) {
            $.rescue = rescue;
            return this;
        }

        /**
         * @param rescue Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
         * 
         * @return builder
         * 
         */
        public Builder rescue(String rescue) {
            return rescue(Output.of(rescue));
        }

        /**
         * @param serverType Name of the server type this server should be created with.
         * 
         * @return builder
         * 
         */
        public Builder serverType(@Nullable Output<String> serverType) {
            $.serverType = serverType;
            return this;
        }

        /**
         * @param serverType Name of the server type this server should be created with.
         * 
         * @return builder
         * 
         */
        public Builder serverType(String serverType) {
            return serverType(Output.of(serverType));
        }

        /**
         * @param shutdownBeforeDeletion Whether to try shutting the server down gracefully before deleting it.
         * 
         * @return builder
         * 
         */
        public Builder shutdownBeforeDeletion(@Nullable Output<Boolean> shutdownBeforeDeletion) {
            $.shutdownBeforeDeletion = shutdownBeforeDeletion;
            return this;
        }

        /**
         * @param shutdownBeforeDeletion Whether to try shutting the server down gracefully before deleting it.
         * 
         * @return builder
         * 
         */
        public Builder shutdownBeforeDeletion(Boolean shutdownBeforeDeletion) {
            return shutdownBeforeDeletion(Output.of(shutdownBeforeDeletion));
        }

        /**
         * @param sshKeys SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ ssh_keys ]`.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(@Nullable Output<List<String>> sshKeys) {
            $.sshKeys = sshKeys;
            return this;
        }

        /**
         * @param sshKeys SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ ssh_keys ]`.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(List<String> sshKeys) {
            return sshKeys(Output.of(sshKeys));
        }

        /**
         * @param sshKeys SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ ssh_keys ]`.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(String... sshKeys) {
            return sshKeys(List.of(sshKeys));
        }

        /**
         * @param status (string) The status of the server.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status (string) The status of the server.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param userData Cloud-Init user data to use during server creation
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData Cloud-Init user data to use during server creation
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        public ServerState build() {
            return $;
        }
    }

}
