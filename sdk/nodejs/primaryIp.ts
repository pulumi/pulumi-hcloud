// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Hetzner Cloud Primary IP to represent a publicly-accessible static IP address that can be mapped to one of your servers.
 *
 * If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created & attached.
 * Currently, Primary IPs can be only attached to servers.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const main = new hcloud.PrimaryIp("main", {
 *     name: "primary_ip_test",
 *     datacenter: "fsn1-dc14",
 *     type: "ipv4",
 *     assigneeType: "server",
 *     autoDelete: true,
 *     labels: {
 *         hallo: "welt",
 *     },
 * });
 * // Link a server to a primary IP
 * const serverTest = new hcloud.Server("server_test", {
 *     name: "test-server",
 *     image: "ubuntu-20.04",
 *     serverType: "cx22",
 *     datacenter: "fsn1-dc14",
 *     labels: {
 *         test: "tessst1",
 *     },
 *     publicNets: [{
 *         ipv4: main.id,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Primary IPs can be imported using its `id`:
 *
 * ```sh
 * $ pulumi import hcloud:index/primaryIp:PrimaryIp myip id
 * ```
 */
export class PrimaryIp extends pulumi.CustomResource {
    /**
     * Get an existing PrimaryIp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrimaryIpState, opts?: pulumi.CustomResourceOptions): PrimaryIp {
        return new PrimaryIp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/primaryIp:PrimaryIp';

    /**
     * Returns true if the given object is an instance of PrimaryIp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrimaryIp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrimaryIp.__pulumiType;
    }

    /**
     * ID of the assigned resource.
     */
    public readonly assigneeId!: pulumi.Output<number>;
    /**
     * The type of the assigned resource. Currently supported: `server`
     */
    public readonly assigneeType!: pulumi.Output<string>;
    /**
     * Whether auto delete is enabled.
     * `Important note:`It is recommended to set `autoDelete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
     */
    public readonly autoDelete!: pulumi.Output<boolean>;
    /**
     * The datacenter name to create the resource in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
     */
    public readonly datacenter!: pulumi.Output<string>;
    /**
     * Whether delete protection is enabled. See "Delete Protection" in the Provider Docs for details.
     *
     * Note: At least one of `datacenter` or `assigneeId` is required.
     */
    public readonly deleteProtection!: pulumi.Output<boolean | undefined>;
    /**
     * (string) IP Address of the Primary IP.
     */
    public /*out*/ readonly ipAddress!: pulumi.Output<string>;
    /**
     * (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
     */
    public /*out*/ readonly ipNetwork!: pulumi.Output<string>;
    /**
     * User-defined labels (key-value pairs).
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Name of the Primary IP.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Type of the Primary IP. `ipv4` or `ipv6`
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a PrimaryIp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrimaryIpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrimaryIpArgs | PrimaryIpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrimaryIpState | undefined;
            resourceInputs["assigneeId"] = state ? state.assigneeId : undefined;
            resourceInputs["assigneeType"] = state ? state.assigneeType : undefined;
            resourceInputs["autoDelete"] = state ? state.autoDelete : undefined;
            resourceInputs["datacenter"] = state ? state.datacenter : undefined;
            resourceInputs["deleteProtection"] = state ? state.deleteProtection : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["ipNetwork"] = state ? state.ipNetwork : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as PrimaryIpArgs | undefined;
            if ((!args || args.assigneeType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'assigneeType'");
            }
            if ((!args || args.autoDelete === undefined) && !opts.urn) {
                throw new Error("Missing required property 'autoDelete'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["assigneeId"] = args ? args.assigneeId : undefined;
            resourceInputs["assigneeType"] = args ? args.assigneeType : undefined;
            resourceInputs["autoDelete"] = args ? args.autoDelete : undefined;
            resourceInputs["datacenter"] = args ? args.datacenter : undefined;
            resourceInputs["deleteProtection"] = args ? args.deleteProtection : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["ipAddress"] = undefined /*out*/;
            resourceInputs["ipNetwork"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PrimaryIp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrimaryIp resources.
 */
export interface PrimaryIpState {
    /**
     * ID of the assigned resource.
     */
    assigneeId?: pulumi.Input<number>;
    /**
     * The type of the assigned resource. Currently supported: `server`
     */
    assigneeType?: pulumi.Input<string>;
    /**
     * Whether auto delete is enabled.
     * `Important note:`It is recommended to set `autoDelete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
     */
    autoDelete?: pulumi.Input<boolean>;
    /**
     * The datacenter name to create the resource in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
     */
    datacenter?: pulumi.Input<string>;
    /**
     * Whether delete protection is enabled. See "Delete Protection" in the Provider Docs for details.
     *
     * Note: At least one of `datacenter` or `assigneeId` is required.
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * (string) IP Address of the Primary IP.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
     */
    ipNetwork?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs).
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the Primary IP.
     */
    name?: pulumi.Input<string>;
    /**
     * Type of the Primary IP. `ipv4` or `ipv6`
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrimaryIp resource.
 */
export interface PrimaryIpArgs {
    /**
     * ID of the assigned resource.
     */
    assigneeId?: pulumi.Input<number>;
    /**
     * The type of the assigned resource. Currently supported: `server`
     */
    assigneeType: pulumi.Input<string>;
    /**
     * Whether auto delete is enabled.
     * `Important note:`It is recommended to set `autoDelete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
     */
    autoDelete: pulumi.Input<boolean>;
    /**
     * The datacenter name to create the resource in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
     */
    datacenter?: pulumi.Input<string>;
    /**
     * Whether delete protection is enabled. See "Delete Protection" in the Provider Docs for details.
     *
     * Note: At least one of `datacenter` or `assigneeId` is required.
     */
    deleteProtection?: pulumi.Input<boolean>;
    /**
     * User-defined labels (key-value pairs).
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the Primary IP.
     */
    name?: pulumi.Input<string>;
    /**
     * Type of the Primary IP. `ipv4` or `ipv6`
     */
    type: pulumi.Input<string>;
}
