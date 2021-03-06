// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
 *     image: "debian-9",
 *     serverType: "cx11",
 * });
 * const master = new hcloud.Volume("master", {
 *     size: 50,
 *     serverId: node1.id,
 *     automount: true,
 * });
 * ```
 *
 * ## Import
 *
 * Volumes can be imported using their `id`
 *
 * ```sh
 *  $ pulumi import hcloud:index/volume:Volume myvolume <id>
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
     * Format volume after creation. `xfs` or `ext4`
     */
    public readonly format!: pulumi.Output<string | undefined>;
    /**
     * User-defined labels (key-value pairs).
     */
    public readonly labels!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Device path on the file system for the Volume.
     */
    public /*out*/ readonly linuxDevice!: pulumi.Output<string>;
    /**
     * Location of the volume to create, not allowed if serverId argument is passed.
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
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VolumeState | undefined;
            inputs["automount"] = state ? state.automount : undefined;
            inputs["format"] = state ? state.format : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["linuxDevice"] = state ? state.linuxDevice : undefined;
            inputs["location"] = state ? state.location : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["serverId"] = state ? state.serverId : undefined;
            inputs["size"] = state ? state.size : undefined;
        } else {
            const args = argsOrState as VolumeArgs | undefined;
            if ((!args || args.size === undefined) && !opts.urn) {
                throw new Error("Missing required property 'size'");
            }
            inputs["automount"] = args ? args.automount : undefined;
            inputs["format"] = args ? args.format : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["location"] = args ? args.location : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["serverId"] = args ? args.serverId : undefined;
            inputs["size"] = args ? args.size : undefined;
            inputs["linuxDevice"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Volume.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Volume resources.
 */
export interface VolumeState {
    /**
     * Automount the volume upon attaching it (server_id must be provided).
     */
    readonly automount?: pulumi.Input<boolean>;
    /**
     * Format volume after creation. `xfs` or `ext4`
     */
    readonly format?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs).
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Device path on the file system for the Volume.
     */
    readonly linuxDevice?: pulumi.Input<string>;
    /**
     * Location of the volume to create, not allowed if serverId argument is passed.
     */
    readonly location?: pulumi.Input<string>;
    /**
     * Name of the volume to create (must be unique per project).
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Server to attach the Volume to, not allowed if location argument is passed.
     */
    readonly serverId?: pulumi.Input<number>;
    /**
     * Size of the volume (in GB).
     */
    readonly size?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Volume resource.
 */
export interface VolumeArgs {
    /**
     * Automount the volume upon attaching it (server_id must be provided).
     */
    readonly automount?: pulumi.Input<boolean>;
    /**
     * Format volume after creation. `xfs` or `ext4`
     */
    readonly format?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs).
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Location of the volume to create, not allowed if serverId argument is passed.
     */
    readonly location?: pulumi.Input<string>;
    /**
     * Name of the volume to create (must be unique per project).
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Server to attach the Volume to, not allowed if location argument is passed.
     */
    readonly serverId?: pulumi.Input<number>;
    /**
     * Size of the volume (in GB).
     */
    readonly size: pulumi.Input<number>;
}
