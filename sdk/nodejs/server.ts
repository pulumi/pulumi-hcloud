// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides an Hetzner Cloud server resource. This can be used to create, modify, and delete servers. Servers also support provisioning.
 *
 * ## Example Usage
 *
 * ### Basic server creation
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * // Create a new server running debian
 * const node1 = new hcloud.Server("node1", {
 *     name: "node1",
 *     image: "debian-11",
 *     serverType: "cx22",
 *     publicNets: [{
 *         ipv4Enabled: true,
 *         ipv6Enabled: true,
 *     }],
 * });
 * ```
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * //## Server creation with one linked primary ip (ipv4)
 * const primaryIp1 = new hcloud.PrimaryIp("primary_ip_1", {
 *     name: "primary_ip_test",
 *     datacenter: "fsn1-dc14",
 *     type: "ipv4",
 *     assigneeType: "server",
 *     autoDelete: true,
 *     labels: {
 *         hallo: "welt",
 *     },
 * });
 * const serverTest = new hcloud.Server("server_test", {
 *     name: "test-server",
 *     image: "ubuntu-20.04",
 *     serverType: "cx22",
 *     datacenter: "fsn1-dc14",
 *     labels: {
 *         test: "tessst1",
 *     },
 *     publicNets: [{
 *         ipv4Enabled: true,
 *         ipv4: primaryIp1.id,
 *         ipv6Enabled: false,
 *     }],
 * });
 * ```
 *
 * ### Server creation with network
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const network = new hcloud.Network("network", {
 *     name: "network",
 *     ipRange: "10.0.0.0/16",
 * });
 * const network_subnet = new hcloud.NetworkSubnet("network-subnet", {
 *     type: "cloud",
 *     networkId: network.id,
 *     networkZone: "eu-central",
 *     ipRange: "10.0.1.0/24",
 * });
 * const server = new hcloud.Server("server", {
 *     name: "server",
 *     serverType: "cx22",
 *     image: "ubuntu-20.04",
 *     location: "nbg1",
 *     networks: [{
 *         networkId: network.id,
 *         ip: "10.0.1.5",
 *         aliasIps: [
 *             "10.0.1.6",
 *             "10.0.1.7",
 *         ],
 *     }],
 * }, {
 *     dependsOn: [network_subnet],
 * });
 * ```
 *
 * ### Server creation from snapshot
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * // Get image infos because we need the ID
 * const packerSnapshot = hcloud.getImage({
 *     withSelector: "app=foobar",
 *     mostRecent: true,
 * });
 * // Create a new server from the snapshot
 * const fromSnapshot = new hcloud.Server("from_snapshot", {
 *     name: "from-snapshot",
 *     image: packerSnapshot.then(packerSnapshot => packerSnapshot.id),
 *     serverType: "cx22",
 *     publicNets: [{
 *         ipv4Enabled: true,
 *         ipv6Enabled: true,
 *     }],
 * });
 * ```
 *
 * ## Primary IPs
 *
 * When creating a server without linking at least one ´primary_ip´, it automatically creates & assigns two (ipv4 & ipv6).
 * With the publicNet block, you can enable or link primary ips. If you don't define this block, two primary ips (ipv4, ipv6) will be created and assigned to the server automatically.
 *
 * ## Import
 *
 * Servers can be imported using the server `id`:
 *
 * ```sh
 * $ pulumi import hcloud:index/server:Server myserver id
 * ```
 */
export class Server extends pulumi.CustomResource {
    /**
     * Get an existing Server resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerState, opts?: pulumi.CustomResourceOptions): Server {
        return new Server(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/server:Server';

    /**
     * Returns true if the given object is an instance of Server.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Server {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Server.__pulumiType;
    }

    /**
     * Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
     */
    public readonly allowDeprecatedImages!: pulumi.Output<boolean | undefined>;
    /**
     * (string) The backup window of the server, if enabled.
     *
     * @deprecated You should remove this property from your terraform configuration.
     */
    public /*out*/ readonly backupWindow!: pulumi.Output<string>;
    /**
     * Enable or disable backups.
     */
    public readonly backups!: pulumi.Output<boolean | undefined>;
    /**
     * The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
     */
    public readonly datacenter!: pulumi.Output<string>;
    /**
     * Enable or disable delete protection (Needs to be the same as `rebuildProtection`). See "Delete Protection" in the Provider Docs for details.
     */
    public readonly deleteProtection!: pulumi.Output<boolean | undefined>;
    /**
     * Firewall IDs the server should be attached to on creation.
     */
    public readonly firewallIds!: pulumi.Output<number[]>;
    /**
     * Ignores any updates
     * to the `firewallIds` argument which were received from the server.
     * This should not be used in normal cases. See the documentation of the
     * `hcloud.FirewallAttachment` resource for a reason to use this
     * argument.
     */
    public readonly ignoreRemoteFirewallIds!: pulumi.Output<boolean | undefined>;
    public readonly image!: pulumi.Output<string | undefined>;
    /**
     * (string) The IPv4 address.
     */
    public /*out*/ readonly ipv4Address!: pulumi.Output<string>;
    /**
     * (string) The first IPv6 address of the assigned network.
     */
    public /*out*/ readonly ipv6Address!: pulumi.Output<string>;
    /**
     * (string) The IPv6 network.
     */
    public /*out*/ readonly ipv6Network!: pulumi.Output<string>;
    /**
     * ID or Name of an ISO image to mount.
     */
    public readonly iso!: pulumi.Output<string | undefined>;
    /**
     * If true, do not upgrade the disk. This allows downgrading the server type later.
     */
    public readonly keepDisk!: pulumi.Output<boolean | undefined>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Network the server should be attached to on creation. (Can be specified multiple times)
     */
    public readonly networks!: pulumi.Output<outputs.ServerNetwork[] | undefined>;
    /**
     * Placement Group ID the server added to on creation.
     */
    public readonly placementGroupId!: pulumi.Output<number | undefined>;
    /**
     * (int) The size of the primary disk in GB.
     */
    public /*out*/ readonly primaryDiskSize!: pulumi.Output<number>;
    /**
     * In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
     * If this block is not defined, two primary (ipv4 & ipv6) ips getting auto generated.
     */
    public readonly publicNets!: pulumi.Output<outputs.ServerPublicNet[] | undefined>;
    /**
     * Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
     */
    public readonly rebuildProtection!: pulumi.Output<boolean | undefined>;
    /**
     * Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
     */
    public readonly rescue!: pulumi.Output<string | undefined>;
    /**
     * Name of the server type this server should be created with.
     */
    public readonly serverType!: pulumi.Output<string>;
    /**
     * Whether to try shutting the server down gracefully before deleting it.
     */
    public readonly shutdownBeforeDeletion!: pulumi.Output<boolean | undefined>;
    /**
     * SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ sshKeys ]`.
     */
    public readonly sshKeys!: pulumi.Output<string[] | undefined>;
    /**
     * (string) The status of the server.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Cloud-Init user data to use during server creation
     */
    public readonly userData!: pulumi.Output<string | undefined>;

    /**
     * Create a Server resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerArgs | ServerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerState | undefined;
            resourceInputs["allowDeprecatedImages"] = state ? state.allowDeprecatedImages : undefined;
            resourceInputs["backupWindow"] = state ? state.backupWindow : undefined;
            resourceInputs["backups"] = state ? state.backups : undefined;
            resourceInputs["datacenter"] = state ? state.datacenter : undefined;
            resourceInputs["deleteProtection"] = state ? state.deleteProtection : undefined;
            resourceInputs["firewallIds"] = state ? state.firewallIds : undefined;
            resourceInputs["ignoreRemoteFirewallIds"] = state ? state.ignoreRemoteFirewallIds : undefined;
            resourceInputs["image"] = state ? state.image : undefined;
            resourceInputs["ipv4Address"] = state ? state.ipv4Address : undefined;
            resourceInputs["ipv6Address"] = state ? state.ipv6Address : undefined;
            resourceInputs["ipv6Network"] = state ? state.ipv6Network : undefined;
            resourceInputs["iso"] = state ? state.iso : undefined;
            resourceInputs["keepDisk"] = state ? state.keepDisk : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networks"] = state ? state.networks : undefined;
            resourceInputs["placementGroupId"] = state ? state.placementGroupId : undefined;
            resourceInputs["primaryDiskSize"] = state ? state.primaryDiskSize : undefined;
            resourceInputs["publicNets"] = state ? state.publicNets : undefined;
            resourceInputs["rebuildProtection"] = state ? state.rebuildProtection : undefined;
            resourceInputs["rescue"] = state ? state.rescue : undefined;
            resourceInputs["serverType"] = state ? state.serverType : undefined;
            resourceInputs["shutdownBeforeDeletion"] = state ? state.shutdownBeforeDeletion : undefined;
            resourceInputs["sshKeys"] = state ? state.sshKeys : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
        } else {
            const args = argsOrState as ServerArgs | undefined;
            if ((!args || args.serverType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverType'");
            }
            resourceInputs["allowDeprecatedImages"] = args ? args.allowDeprecatedImages : undefined;
            resourceInputs["backups"] = args ? args.backups : undefined;
            resourceInputs["datacenter"] = args ? args.datacenter : undefined;
            resourceInputs["deleteProtection"] = args ? args.deleteProtection : undefined;
            resourceInputs["firewallIds"] = args ? args.firewallIds : undefined;
            resourceInputs["ignoreRemoteFirewallIds"] = args ? args.ignoreRemoteFirewallIds : undefined;
            resourceInputs["image"] = args ? args.image : undefined;
            resourceInputs["iso"] = args ? args.iso : undefined;
            resourceInputs["keepDisk"] = args ? args.keepDisk : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networks"] = args ? args.networks : undefined;
            resourceInputs["placementGroupId"] = args ? args.placementGroupId : undefined;
            resourceInputs["publicNets"] = args ? args.publicNets : undefined;
            resourceInputs["rebuildProtection"] = args ? args.rebuildProtection : undefined;
            resourceInputs["rescue"] = args ? args.rescue : undefined;
            resourceInputs["serverType"] = args ? args.serverType : undefined;
            resourceInputs["shutdownBeforeDeletion"] = args ? args.shutdownBeforeDeletion : undefined;
            resourceInputs["sshKeys"] = args ? args.sshKeys : undefined;
            resourceInputs["userData"] = args ? args.userData : undefined;
            resourceInputs["backupWindow"] = undefined /*out*/;
            resourceInputs["ipv4Address"] = undefined /*out*/;
            resourceInputs["ipv6Address"] = undefined /*out*/;
            resourceInputs["ipv6Network"] = undefined /*out*/;
            resourceInputs["primaryDiskSize"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Server.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Server resources.
 */
export interface ServerState {
    /**
     * Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
     */
    allowDeprecatedImages?: pulumi.Input<boolean>;
    /**
     * (string) The backup window of the server, if enabled.
     *
     * @deprecated You should remove this property from your terraform configuration.
     */
    backupWindow?: pulumi.Input<string>;
    /**
     * Enable or disable backups.
     */
    backups?: pulumi.Input<boolean>;
    /**
     * The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
     */
    datacenter?: pulumi.Input<string>;
    /**
     * Enable or disable delete protection (Needs to be the same as `rebuildProtection`). See "Delete Protection" in the Provider Docs for details.
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * Firewall IDs the server should be attached to on creation.
     */
    firewallIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * Ignores any updates
     * to the `firewallIds` argument which were received from the server.
     * This should not be used in normal cases. See the documentation of the
     * `hcloud.FirewallAttachment` resource for a reason to use this
     * argument.
     */
    ignoreRemoteFirewallIds?: pulumi.Input<boolean>;
    image?: pulumi.Input<string>;
    /**
     * (string) The IPv4 address.
     */
    ipv4Address?: pulumi.Input<string>;
    /**
     * (string) The first IPv6 address of the assigned network.
     */
    ipv6Address?: pulumi.Input<string>;
    /**
     * (string) The IPv6 network.
     */
    ipv6Network?: pulumi.Input<string>;
    /**
     * ID or Name of an ISO image to mount.
     */
    iso?: pulumi.Input<string>;
    /**
     * If true, do not upgrade the disk. This allows downgrading the server type later.
     */
    keepDisk?: pulumi.Input<boolean>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
     */
    location?: pulumi.Input<string>;
    /**
     * Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
     */
    name?: pulumi.Input<string>;
    /**
     * Network the server should be attached to on creation. (Can be specified multiple times)
     */
    networks?: pulumi.Input<pulumi.Input<inputs.ServerNetwork>[]>;
    /**
     * Placement Group ID the server added to on creation.
     */
    placementGroupId?: pulumi.Input<number>;
    /**
     * (int) The size of the primary disk in GB.
     */
    primaryDiskSize?: pulumi.Input<number>;
    /**
     * In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
     * If this block is not defined, two primary (ipv4 & ipv6) ips getting auto generated.
     */
    publicNets?: pulumi.Input<pulumi.Input<inputs.ServerPublicNet>[]>;
    /**
     * Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
     */
    rebuildProtection?: pulumi.Input<boolean>;
    /**
     * Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
     */
    rescue?: pulumi.Input<string>;
    /**
     * Name of the server type this server should be created with.
     */
    serverType?: pulumi.Input<string>;
    /**
     * Whether to try shutting the server down gracefully before deleting it.
     */
    shutdownBeforeDeletion?: pulumi.Input<boolean>;
    /**
     * SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ sshKeys ]`.
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (string) The status of the server.
     */
    status?: pulumi.Input<string>;
    /**
     * Cloud-Init user data to use during server creation
     */
    userData?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Server resource.
 */
export interface ServerArgs {
    /**
     * Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
     */
    allowDeprecatedImages?: pulumi.Input<boolean>;
    /**
     * Enable or disable backups.
     */
    backups?: pulumi.Input<boolean>;
    /**
     * The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
     */
    datacenter?: pulumi.Input<string>;
    /**
     * Enable or disable delete protection (Needs to be the same as `rebuildProtection`). See "Delete Protection" in the Provider Docs for details.
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * Firewall IDs the server should be attached to on creation.
     */
    firewallIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * Ignores any updates
     * to the `firewallIds` argument which were received from the server.
     * This should not be used in normal cases. See the documentation of the
     * `hcloud.FirewallAttachment` resource for a reason to use this
     * argument.
     */
    ignoreRemoteFirewallIds?: pulumi.Input<boolean>;
    image?: pulumi.Input<string>;
    /**
     * ID or Name of an ISO image to mount.
     */
    iso?: pulumi.Input<string>;
    /**
     * If true, do not upgrade the disk. This allows downgrading the server type later.
     */
    keepDisk?: pulumi.Input<boolean>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
     */
    location?: pulumi.Input<string>;
    /**
     * Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
     */
    name?: pulumi.Input<string>;
    /**
     * Network the server should be attached to on creation. (Can be specified multiple times)
     */
    networks?: pulumi.Input<pulumi.Input<inputs.ServerNetwork>[]>;
    /**
     * Placement Group ID the server added to on creation.
     */
    placementGroupId?: pulumi.Input<number>;
    /**
     * In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
     * If this block is not defined, two primary (ipv4 & ipv6) ips getting auto generated.
     */
    publicNets?: pulumi.Input<pulumi.Input<inputs.ServerPublicNet>[]>;
    /**
     * Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
     */
    rebuildProtection?: pulumi.Input<boolean>;
    /**
     * Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
     */
    rescue?: pulumi.Input<string>;
    /**
     * Name of the server type this server should be created with.
     */
    serverType: pulumi.Input<string>;
    /**
     * Whether to try shutting the server down gracefully before deleting it.
     */
    shutdownBeforeDeletion?: pulumi.Input<boolean>;
    /**
     * SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ sshKeys ]`.
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Cloud-Init user data to use during server creation
     */
    userData?: pulumi.Input<string>;
}
