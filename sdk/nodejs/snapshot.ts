// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Hetzner Cloud snapshot to represent a image with type snapshot in the Hetzner Cloud. This resource makes it easy to create
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
 * const my_snapshot = new hcloud.Snapshot("my-snapshot", {serverId: node1.id});
 * ```
 *
 * ## Import
 *
 * Snapshots can be imported using its image `id`
 *
 * ```sh
 *  $ pulumi import hcloud:index/snapshot:Snapshot myip <id>
 * ```
 */
export class Snapshot extends pulumi.CustomResource {
    /**
     * Get an existing Snapshot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotState, opts?: pulumi.CustomResourceOptions): Snapshot {
        return new Snapshot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/snapshot:Snapshot';

    /**
     * Returns true if the given object is an instance of Snapshot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Snapshot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Snapshot.__pulumiType;
    }

    /**
     * Description of the Floating IP.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    public readonly labels!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Server to the snapshot should be created from.
     */
    public readonly serverId!: pulumi.Output<number>;

    /**
     * Create a Snapshot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnapshotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnapshotArgs | SnapshotState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["serverId"] = state ? state.serverId : undefined;
        } else {
            const args = argsOrState as SnapshotArgs | undefined;
            if ((!args || args.serverId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverId'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["serverId"] = args ? args.serverId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Snapshot.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Snapshot resources.
 */
export interface SnapshotState {
    /**
     * Description of the Floating IP.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Server to the snapshot should be created from.
     */
    readonly serverId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Snapshot resource.
 */
export interface SnapshotArgs {
    /**
     * Description of the Floating IP.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Server to the snapshot should be created from.
     */
    readonly serverId: pulumi.Input<number>;
}