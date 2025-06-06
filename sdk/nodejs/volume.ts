// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Hetzner Cloud volume resource to manage volumes.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const node1 = new hcloud.Server("node1", {
 *     name: "node1",
 *     image: "debian-11",
 *     serverType: "cx22",
 * });
 * const master = new hcloud.Volume("master", {
 *     name: "volume1",
 *     size: 50,
 *     serverId: node1.id,
 *     automount: true,
 *     format: "ext4",
 * });
 * ```
 *
 * ## Import
 *
 * Volumes can be imported using their `id`:
 *
 * ```sh
 * $ pulumi import hcloud:index/volume:Volume example "$VOLUME_ID"
 * ```
 */
export class Volume extends pulumi.CustomResource {
    /**
     * Get an existing Volume resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VolumeState, opts?: pulumi.CustomResourceOptions): Volume {
        return new Volume(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/volume:Volume';

    /**
     * Returns true if the given object is an instance of Volume.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Volume {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Volume.__pulumiType;
    }

    /**
     * Automount the volume upon attaching it (server_id must be provided).
     */
    public readonly automount!: pulumi.Output<boolean | undefined>;
    /**
     * Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
     *
     * **Note:** When you want to attach multiple volumes to a server, please use the `hcloud.VolumeAttachment` resource and the `location` argument instead of the `serverId` argument.
     */
    public readonly deleteProtection!: pulumi.Output<boolean | undefined>;
    /**
     * Format volume after creation. `xfs` or `ext4`
     */
    public readonly format!: pulumi.Output<string | undefined>;
    /**
     * User-defined labels (key-value pairs).
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * (string) Device path on the file system for the Volume.
     */
    public /*out*/ readonly linuxDevice!: pulumi.Output<string>;
    /**
     * The location name of the volume to create, not allowed if serverId argument is passed. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Name of the volume to create (must be unique per project).
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Server to attach the Volume to, not allowed if location argument is passed.
     */
    public readonly serverId!: pulumi.Output<number>;
    /**
     * Size of the volume (in GB).
     */
    public readonly size!: pulumi.Output<number>;

    /**
     * Create a Volume resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VolumeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VolumeArgs | VolumeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VolumeState | undefined;
            resourceInputs["automount"] = state ? state.automount : undefined;
            resourceInputs["deleteProtection"] = state ? state.deleteProtection : undefined;
            resourceInputs["format"] = state ? state.format : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["linuxDevice"] = state ? state.linuxDevice : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["serverId"] = state ? state.serverId : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
        } else {
            const args = argsOrState as VolumeArgs | undefined;
            if ((!args || args.size === undefined) && !opts.urn) {
                throw new Error("Missing required property 'size'");
            }
            resourceInputs["automount"] = args ? args.automount : undefined;
            resourceInputs["deleteProtection"] = args ? args.deleteProtection : undefined;
            resourceInputs["format"] = args ? args.format : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["serverId"] = args ? args.serverId : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["linuxDevice"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Volume.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Volume resources.
 */
export interface VolumeState {
    /**
     * Automount the volume upon attaching it (server_id must be provided).
     */
    automount?: pulumi.Input<boolean>;
    /**
     * Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
     *
     * **Note:** When you want to attach multiple volumes to a server, please use the `hcloud.VolumeAttachment` resource and the `location` argument instead of the `serverId` argument.
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * Format volume after creation. `xfs` or `ext4`
     */
    format?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs).
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * (string) Device path on the file system for the Volume.
     */
    linuxDevice?: pulumi.Input<string>;
    /**
     * The location name of the volume to create, not allowed if serverId argument is passed. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     */
    location?: pulumi.Input<string>;
    /**
     * Name of the volume to create (must be unique per project).
     */
    name?: pulumi.Input<string>;
    /**
     * Server to attach the Volume to, not allowed if location argument is passed.
     */
    serverId?: pulumi.Input<number>;
    /**
     * Size of the volume (in GB).
     */
    size?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Volume resource.
 */
export interface VolumeArgs {
    /**
     * Automount the volume upon attaching it (server_id must be provided).
     */
    automount?: pulumi.Input<boolean>;
    /**
     * Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
     *
     * **Note:** When you want to attach multiple volumes to a server, please use the `hcloud.VolumeAttachment` resource and the `location` argument instead of the `serverId` argument.
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * Format volume after creation. `xfs` or `ext4`
     */
    format?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs).
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location name of the volume to create, not allowed if serverId argument is passed. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     */
    location?: pulumi.Input<string>;
    /**
     * Name of the volume to create (must be unique per project).
     */
    name?: pulumi.Input<string>;
    /**
     * Server to attach the Volume to, not allowed if location argument is passed.
     */
    serverId?: pulumi.Input<number>;
    /**
     * Size of the volume (in GB).
     */
    size: pulumi.Input<number>;
}
