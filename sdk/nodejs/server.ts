// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * Servers can be imported using the server `id`
 *
 * ```sh
 *  $ pulumi import hcloud:index/server:Server myserver <id>
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
     * The datacenter name to create the server in.
     */
    public readonly datacenter!: pulumi.Output<string>;
    /**
     * Enable or disable delete protection (Needs to be the same as `rebuildProtection`).
     */
    public readonly deleteProtection!: pulumi.Output<boolean | undefined>;
    /**
     * Firewall IDs the server should be attached to on creation.
     */
    public readonly firewallIds!: pulumi.Output<number[]>;
    /**
     * Name or ID of the image the server is created from.
     */
    public readonly image!: pulumi.Output<string>;
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
    public readonly labels!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The location name to create the server in. `nbg1`, `fsn1` or `hel1`
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
     * Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
     */
    public readonly rebuildProtection!: pulumi.Output<boolean | undefined>;
    /**
     * Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` `linux32` or `freebsd64`
     */
    public readonly rescue!: pulumi.Output<string | undefined>;
    /**
     * Name of the server type this server should be created with.
     */
    public readonly serverType!: pulumi.Output<string>;
    /**
     * SSH key IDs or names which should be injected into the server at creation time
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
            resourceInputs["backupWindow"] = state ? state.backupWindow : undefined;
            resourceInputs["backups"] = state ? state.backups : undefined;
            resourceInputs["datacenter"] = state ? state.datacenter : undefined;
            resourceInputs["deleteProtection"] = state ? state.deleteProtection : undefined;
            resourceInputs["firewallIds"] = state ? state.firewallIds : undefined;
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
            resourceInputs["rebuildProtection"] = state ? state.rebuildProtection : undefined;
            resourceInputs["rescue"] = state ? state.rescue : undefined;
            resourceInputs["serverType"] = state ? state.serverType : undefined;
            resourceInputs["sshKeys"] = state ? state.sshKeys : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
        } else {
            const args = argsOrState as ServerArgs | undefined;
            if ((!args || args.image === undefined) && !opts.urn) {
                throw new Error("Missing required property 'image'");
            }
            if ((!args || args.serverType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverType'");
            }
            resourceInputs["backups"] = args ? args.backups : undefined;
            resourceInputs["datacenter"] = args ? args.datacenter : undefined;
            resourceInputs["deleteProtection"] = args ? args.deleteProtection : undefined;
            resourceInputs["firewallIds"] = args ? args.firewallIds : undefined;
            resourceInputs["image"] = args ? args.image : undefined;
            resourceInputs["iso"] = args ? args.iso : undefined;
            resourceInputs["keepDisk"] = args ? args.keepDisk : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networks"] = args ? args.networks : undefined;
            resourceInputs["placementGroupId"] = args ? args.placementGroupId : undefined;
            resourceInputs["rebuildProtection"] = args ? args.rebuildProtection : undefined;
            resourceInputs["rescue"] = args ? args.rescue : undefined;
            resourceInputs["serverType"] = args ? args.serverType : undefined;
            resourceInputs["sshKeys"] = args ? args.sshKeys : undefined;
            resourceInputs["userData"] = args ? args.userData : undefined;
            resourceInputs["backupWindow"] = undefined /*out*/;
            resourceInputs["ipv4Address"] = undefined /*out*/;
            resourceInputs["ipv6Address"] = undefined /*out*/;
            resourceInputs["ipv6Network"] = undefined /*out*/;
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
     * The datacenter name to create the server in.
     */
    datacenter?: pulumi.Input<string>;
    /**
     * Enable or disable delete protection (Needs to be the same as `rebuildProtection`).
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * Firewall IDs the server should be attached to on creation.
     */
    firewallIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * Name or ID of the image the server is created from.
     */
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
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The location name to create the server in. `nbg1`, `fsn1` or `hel1`
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
     * Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
     */
    rebuildProtection?: pulumi.Input<boolean>;
    /**
     * Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` `linux32` or `freebsd64`
     */
    rescue?: pulumi.Input<string>;
    /**
     * Name of the server type this server should be created with.
     */
    serverType?: pulumi.Input<string>;
    /**
     * SSH key IDs or names which should be injected into the server at creation time
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
     * Enable or disable backups.
     */
    backups?: pulumi.Input<boolean>;
    /**
     * The datacenter name to create the server in.
     */
    datacenter?: pulumi.Input<string>;
    /**
     * Enable or disable delete protection (Needs to be the same as `rebuildProtection`).
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * Firewall IDs the server should be attached to on creation.
     */
    firewallIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * Name or ID of the image the server is created from.
     */
    image: pulumi.Input<string>;
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
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * The location name to create the server in. `nbg1`, `fsn1` or `hel1`
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
     * Enable or disable rebuild protection (Needs to be the same as `deleteProtection`).
     */
    rebuildProtection?: pulumi.Input<boolean>;
    /**
     * Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` `linux32` or `freebsd64`
     */
    rescue?: pulumi.Input<string>;
    /**
     * Name of the server type this server should be created with.
     */
    serverType: pulumi.Input<string>;
    /**
     * SSH key IDs or names which should be injected into the server at creation time
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Cloud-Init user data to use during server creation
     */
    userData?: pulumi.Input<string>;
}
