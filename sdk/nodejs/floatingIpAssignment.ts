// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Hetzner Cloud Floating IP Assignment to assign a Floating IP to a Hetzner Cloud Server. Deleting a Floating IP Assignment will unassign the Floating IP from the Server.
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
 *     datacenter: "fsn1-dc8",
 * });
 * const master = new hcloud.FloatingIp("master", {
 *     type: "ipv4",
 *     homeLocation: "nbg1",
 * });
 * const main = new hcloud.FloatingIpAssignment("main", {
 *     floatingIpId: master.id,
 *     serverId: node1.id,
 * });
 * ```
 *
 * ## Import
 *
 * Floating IP Assignments can be imported using the `floating_ip_id`
 *
 * ```sh
 *  $ pulumi import hcloud:index/floatingIpAssignment:FloatingIpAssignment myfloatingipassignment <floating_ip_id>
 * ```
 */
export class FloatingIpAssignment extends pulumi.CustomResource {
    /**
     * Get an existing FloatingIpAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FloatingIpAssignmentState, opts?: pulumi.CustomResourceOptions): FloatingIpAssignment {
        return new FloatingIpAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/floatingIpAssignment:FloatingIpAssignment';

    /**
     * Returns true if the given object is an instance of FloatingIpAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FloatingIpAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FloatingIpAssignment.__pulumiType;
    }

    /**
     * ID of the Floating IP.
     */
    public readonly floatingIpId!: pulumi.Output<number>;
    /**
     * Server to assign the Floating IP to.
     */
    public readonly serverId!: pulumi.Output<number>;

    /**
     * Create a FloatingIpAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FloatingIpAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FloatingIpAssignmentArgs | FloatingIpAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FloatingIpAssignmentState | undefined;
            resourceInputs["floatingIpId"] = state ? state.floatingIpId : undefined;
            resourceInputs["serverId"] = state ? state.serverId : undefined;
        } else {
            const args = argsOrState as FloatingIpAssignmentArgs | undefined;
            if ((!args || args.floatingIpId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'floatingIpId'");
            }
            if ((!args || args.serverId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverId'");
            }
            resourceInputs["floatingIpId"] = args ? args.floatingIpId : undefined;
            resourceInputs["serverId"] = args ? args.serverId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FloatingIpAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FloatingIpAssignment resources.
 */
export interface FloatingIpAssignmentState {
    /**
     * ID of the Floating IP.
     */
    floatingIpId?: pulumi.Input<number>;
    /**
     * Server to assign the Floating IP to.
     */
    serverId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a FloatingIpAssignment resource.
 */
export interface FloatingIpAssignmentArgs {
    /**
     * ID of the Floating IP.
     */
    floatingIpId: pulumi.Input<number>;
    /**
     * Server to assign the Floating IP to.
     */
    serverId: pulumi.Input<number>;
}
