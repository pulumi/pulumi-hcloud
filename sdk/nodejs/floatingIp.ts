// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Hetzner Cloud Floating IP to represent a publicly-accessible static IP address that can be mapped to one of your servers.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const node1 = new hcloud.Server("node1", {
 *     image: "debian-11",
 *     serverType: "cx11",
 * });
 * const master = new hcloud.FloatingIp("master", {
 *     type: "ipv4",
 *     serverId: node1.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Floating IPs can be imported using its `id`:
 *
 * ```sh
 * $ pulumi import hcloud:index/floatingIp:FloatingIp myip id
 * ```
 */
export class FloatingIp extends pulumi.CustomResource {
    /**
     * Get an existing FloatingIp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FloatingIpState, opts?: pulumi.CustomResourceOptions): FloatingIp {
        return new FloatingIp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/floatingIp:FloatingIp';

    /**
     * Returns true if the given object is an instance of FloatingIp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FloatingIp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FloatingIp.__pulumiType;
    }

    /**
     * Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
     */
    public readonly deleteProtection!: pulumi.Output<boolean | undefined>;
    /**
     * Description of the Floating IP.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of home location (routing is optimized for that location). Optional if serverId argument is passed.
     */
    public readonly homeLocation!: pulumi.Output<string>;
    /**
     * (string) IP Address of the Floating IP.
     */
    public /*out*/ readonly ipAddress!: pulumi.Output<string>;
    /**
     * (string) IPv6 subnet. (Only set if `type` is `ipv6`)
     */
    public /*out*/ readonly ipNetwork!: pulumi.Output<string>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    public readonly labels!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Name of the Floating IP.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Server to assign the Floating IP to.
     */
    public readonly serverId!: pulumi.Output<number>;
    /**
     * Type of the Floating IP. `ipv4` `ipv6`
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a FloatingIp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FloatingIpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FloatingIpArgs | FloatingIpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FloatingIpState | undefined;
            resourceInputs["deleteProtection"] = state ? state.deleteProtection : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["homeLocation"] = state ? state.homeLocation : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["ipNetwork"] = state ? state.ipNetwork : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["serverId"] = state ? state.serverId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as FloatingIpArgs | undefined;
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["deleteProtection"] = args ? args.deleteProtection : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["homeLocation"] = args ? args.homeLocation : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["serverId"] = args ? args.serverId : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["ipAddress"] = undefined /*out*/;
            resourceInputs["ipNetwork"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FloatingIp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FloatingIp resources.
 */
export interface FloatingIpState {
    /**
     * Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * Description of the Floating IP.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of home location (routing is optimized for that location). Optional if serverId argument is passed.
     */
    homeLocation?: pulumi.Input<string>;
    /**
     * (string) IP Address of the Floating IP.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * (string) IPv6 subnet. (Only set if `type` is `ipv6`)
     */
    ipNetwork?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the Floating IP.
     */
    name?: pulumi.Input<string>;
    /**
     * Server to assign the Floating IP to.
     */
    serverId?: pulumi.Input<number>;
    /**
     * Type of the Floating IP. `ipv4` `ipv6`
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FloatingIp resource.
 */
export interface FloatingIpArgs {
    /**
     * Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * Description of the Floating IP.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of home location (routing is optimized for that location). Optional if serverId argument is passed.
     */
    homeLocation?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the Floating IP.
     */
    name?: pulumi.Input<string>;
    /**
     * Server to assign the Floating IP to.
     */
    serverId?: pulumi.Input<number>;
    /**
     * Type of the Floating IP. `ipv4` `ipv6`
     */
    type: pulumi.Input<string>;
}
