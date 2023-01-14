// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.hcloud.inputs.ServerNetworkArgs;
import com.pulumi.hcloud.inputs.ServerPublicNetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerArgs Empty = new ServerArgs();

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
     * The datacenter name to create the server in.
     * 
     */
    @Import(name="datacenter")
    private @Nullable Output<String> datacenter;

    /**
     * @return The datacenter name to create the server in.
     * 
     */
    public Optional<Output<String>> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }

    /**
     * Enable or disable delete protection (Needs to be the same as `rebuild_protection`).
     * 
     */
    @Import(name="deleteProtection")
    private @Nullable Output<Boolean> deleteProtection;

    /**
     * @return Enable or disable delete protection (Needs to be the same as `rebuild_protection`).
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

    /**
     * (string) Name or ID of the image the server was created from.
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return (string) Name or ID of the image the server was created from.
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
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
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location name to create the server in. `nbg1`, `fsn1`, `hel1` or `ash`
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location name to create the server in. `nbg1`, `fsn1`, `hel1` or `ash`
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
     * Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` `linux32` or `freebsd64`
     * 
     */
    @Import(name="rescue")
    private @Nullable Output<String> rescue;

    /**
     * @return Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` `linux32` or `freebsd64`
     * 
     */
    public Optional<Output<String>> rescue() {
        return Optional.ofNullable(this.rescue);
    }

    /**
     * Name of the server type this server should be created with.
     * 
     */
    @Import(name="serverType", required=true)
    private Output<String> serverType;

    /**
     * @return Name of the server type this server should be created with.
     * 
     */
    public Output<String> serverType() {
        return this.serverType;
    }

    /**
     * SSH key IDs or names which should be injected into the server at creation time
     * 
     */
    @Import(name="sshKeys")
    private @Nullable Output<List<String>> sshKeys;

    /**
     * @return SSH key IDs or names which should be injected into the server at creation time
     * 
     */
    public Optional<Output<List<String>>> sshKeys() {
        return Optional.ofNullable(this.sshKeys);
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

    private ServerArgs() {}

    private ServerArgs(ServerArgs $) {
        this.allowDeprecatedImages = $.allowDeprecatedImages;
        this.backups = $.backups;
        this.datacenter = $.datacenter;
        this.deleteProtection = $.deleteProtection;
        this.firewallIds = $.firewallIds;
        this.ignoreRemoteFirewallIds = $.ignoreRemoteFirewallIds;
        this.image = $.image;
        this.iso = $.iso;
        this.keepDisk = $.keepDisk;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.networks = $.networks;
        this.placementGroupId = $.placementGroupId;
        this.publicNets = $.publicNets;
        this.rebuildProtection = $.rebuildProtection;
        this.rescue = $.rescue;
        this.serverType = $.serverType;
        this.sshKeys = $.sshKeys;
        this.userData = $.userData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerArgs $;

        public Builder() {
            $ = new ServerArgs();
        }

        public Builder(ServerArgs defaults) {
            $ = new ServerArgs(Objects.requireNonNull(defaults));
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
         * @param datacenter The datacenter name to create the server in.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(@Nullable Output<String> datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        /**
         * @param datacenter The datacenter name to create the server in.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(String datacenter) {
            return datacenter(Output.of(datacenter));
        }

        /**
         * @param deleteProtection Enable or disable delete protection (Needs to be the same as `rebuild_protection`).
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(@Nullable Output<Boolean> deleteProtection) {
            $.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * @param deleteProtection Enable or disable delete protection (Needs to be the same as `rebuild_protection`).
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

        /**
         * @param image (string) Name or ID of the image the server was created from.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image (string) Name or ID of the image the server was created from.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
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
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location name to create the server in. `nbg1`, `fsn1`, `hel1` or `ash`
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location name to create the server in. `nbg1`, `fsn1`, `hel1` or `ash`
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
         * @param rescue Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` `linux32` or `freebsd64`
         * 
         * @return builder
         * 
         */
        public Builder rescue(@Nullable Output<String> rescue) {
            $.rescue = rescue;
            return this;
        }

        /**
         * @param rescue Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` `linux32` or `freebsd64`
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
        public Builder serverType(Output<String> serverType) {
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
         * @param sshKeys SSH key IDs or names which should be injected into the server at creation time
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(@Nullable Output<List<String>> sshKeys) {
            $.sshKeys = sshKeys;
            return this;
        }

        /**
         * @param sshKeys SSH key IDs or names which should be injected into the server at creation time
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(List<String> sshKeys) {
            return sshKeys(Output.of(sshKeys));
        }

        /**
         * @param sshKeys SSH key IDs or names which should be injected into the server at creation time
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(String... sshKeys) {
            return sshKeys(List.of(sshKeys));
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

        public ServerArgs build() {
            $.serverType = Objects.requireNonNull($.serverType, "expected parameter 'serverType' to be non-null");
            return $;
        }
    }

}
