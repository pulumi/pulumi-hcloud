// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Hetzner Cloud Network to represent a Network in the Hetzner Cloud.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const privNet = new hcloud.Network("privNet", {ipRange: "10.0.1.0/24"});
 * ```
 *
 * ## Import
 *
 * Networks can be imported using its `id`
 *
 * ```sh
 *  $ pulumi import hcloud:index/network:Network myip id
 * ```
 */
export class Network extends pulumi.CustomResource {
    /**
     * Get an existing Network resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkState, opts?: pulumi.CustomResourceOptions): Network {
        return new Network(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/network:Network';

    /**
     * Returns true if the given object is an instance of Network.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Network {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Network.__pulumiType;
    }

    /**
     * Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
     */
    public readonly deleteProtection!: pulumi.Output<boolean | undefined>;
    /**
     * Enable or disable exposing the routes to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
     */
    public readonly exposeRoutesToVswitch!: pulumi.Output<boolean | undefined>;
    /**
     * IP Range of the whole Network which must span all included subnets and route destinations. Must be one of the private ipv4 ranges of RFC1918.
     */
    public readonly ipRange!: pulumi.Output<string>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    public readonly labels!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Name of the Network to create (must be unique per project).
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a Network resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkArgs | NetworkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkState | undefined;
            resourceInputs["deleteProtection"] = state ? state.deleteProtection : undefined;
            resourceInputs["exposeRoutesToVswitch"] = state ? state.exposeRoutesToVswitch : undefined;
            resourceInputs["ipRange"] = state ? state.ipRange : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as NetworkArgs | undefined;
            if ((!args || args.ipRange === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipRange'");
            }
            resourceInputs["deleteProtection"] = args ? args.deleteProtection : undefined;
            resourceInputs["exposeRoutesToVswitch"] = args ? args.exposeRoutesToVswitch : undefined;
            resourceInputs["ipRange"] = args ? args.ipRange : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Network.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Network resources.
 */
export interface NetworkState {
    /**
     * Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * Enable or disable exposing the routes to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
     */
    exposeRoutesToVswitch?: pulumi.Input<boolean>;
    /**
     * IP Range of the whole Network which must span all included subnets and route destinations. Must be one of the private ipv4 ranges of RFC1918.
     */
    ipRange?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the Network to create (must be unique per project).
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Network resource.
 */
export interface NetworkArgs {
    /**
     * Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * Enable or disable exposing the routes to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
     */
    exposeRoutesToVswitch?: pulumi.Input<boolean>;
    /**
     * IP Range of the whole Network which must span all included subnets and route destinations. Must be one of the private ipv4 ranges of RFC1918.
     */
    ipRange: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the Network to create (must be unique per project).
     */
    name?: pulumi.Input<string>;
}
