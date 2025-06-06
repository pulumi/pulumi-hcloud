// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Hetzner Cloud Reverse DNS Entry to create, modify and reset reverse dns entries for Hetzner Cloud Servers, Primary IPs, Floating IPs or Load Balancers.
 *
 * ## Example Usage
 *
 * For servers:
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
 * const master = new hcloud.Rdns("master", {
 *     serverId: node1.id,
 *     ipAddress: node1.ipv4Address,
 *     dnsPtr: "example.com",
 * });
 * ```
 *
 * For Primary IPs:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const primary1 = new hcloud.PrimaryIp("primary1", {
 *     datacenter: "nbg1-dc3",
 *     type: "ipv4",
 * });
 * const primary1Rdns = new hcloud.Rdns("primary1", {
 *     primaryIpId: primary1.id,
 *     ipAddress: primary1.ipAddress,
 *     dnsPtr: "example.com",
 * });
 * ```
 *
 * For Floating IPs:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const floating1 = new hcloud.FloatingIp("floating1", {
 *     homeLocation: "nbg1",
 *     type: "ipv4",
 * });
 * const floatingMaster = new hcloud.Rdns("floating_master", {
 *     floatingIpId: floating1.id,
 *     ipAddress: floating1.ipAddress,
 *     dnsPtr: "example.com",
 * });
 * ```
 *
 * For Load Balancers:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const loadBalancer1 = new hcloud.LoadBalancer("load_balancer1", {
 *     name: "load_balancer1",
 *     loadBalancerType: "lb11",
 *     location: "fsn1",
 * });
 * const loadBalancerMaster = new hcloud.Rdns("load_balancer_master", {
 *     loadBalancerId: loadBalancer1.id,
 *     ipAddress: loadBalancer1.ipv4,
 *     dnsPtr: "example.com",
 * });
 * ```
 *
 * ## Import
 *
 * Reverse DNS entries can be imported using a compound ID with the following format:
 *
 * `<prefix (s for server/ f for floating ip / l for load balancer)>-<server, floating ip or load balancer ID>-<IP address>`
 *
 * ```sh
 * $ pulumi import hcloud:index/rdns:Rdns example "$PREFIX-$ID-$IP"
 * ```
 *
 * import reverse dns entry on server with id 123, ip 192.168.100.1
 *
 * ```sh
 * $ pulumi import hcloud:index/rdns:Rdns myrdns s-123-192.168.100.1
 * ```
 *
 * import reverse dns entry on primary ip with id 123, ip 2001:db8::1
 *
 * ```sh
 * $ pulumi import hcloud:index/rdns:Rdns myrdns p-123-2001:db8::1
 * ```
 *
 * import reverse dns entry on floating ip with id 123, ip 2001:db8::1
 *
 * ```sh
 * $ pulumi import hcloud:index/rdns:Rdns myrdns f-123-2001:db8::1
 * ```
 *
 * import reverse dns entry on load balancer with id 123, ip 2001:db8::1
 *
 * ```sh
 * $ pulumi import hcloud:index/rdns:Rdns myrdns l-123-2001:db8::1
 * ```
 */
export class Rdns extends pulumi.CustomResource {
    /**
     * Get an existing Rdns resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RdnsState, opts?: pulumi.CustomResourceOptions): Rdns {
        return new Rdns(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/rdns:Rdns';

    /**
     * Returns true if the given object is an instance of Rdns.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Rdns {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Rdns.__pulumiType;
    }

    /**
     * The DNS address the `ipAddress` should resolve to.
     */
    public readonly dnsPtr!: pulumi.Output<string>;
    /**
     * The Floating IP the `ipAddress` belongs to.
     */
    public readonly floatingIpId!: pulumi.Output<number | undefined>;
    /**
     * The IP address that should point to `dnsPtr`.
     */
    public readonly ipAddress!: pulumi.Output<string>;
    /**
     * The Load Balancer the `ipAddress` belongs to.
     */
    public readonly loadBalancerId!: pulumi.Output<number | undefined>;
    /**
     * The Primary IP the `ipAddress` belongs to.
     */
    public readonly primaryIpId!: pulumi.Output<number | undefined>;
    /**
     * The server the `ipAddress` belongs to.
     */
    public readonly serverId!: pulumi.Output<number | undefined>;

    /**
     * Create a Rdns resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RdnsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RdnsArgs | RdnsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RdnsState | undefined;
            resourceInputs["dnsPtr"] = state ? state.dnsPtr : undefined;
            resourceInputs["floatingIpId"] = state ? state.floatingIpId : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["loadBalancerId"] = state ? state.loadBalancerId : undefined;
            resourceInputs["primaryIpId"] = state ? state.primaryIpId : undefined;
            resourceInputs["serverId"] = state ? state.serverId : undefined;
        } else {
            const args = argsOrState as RdnsArgs | undefined;
            if ((!args || args.dnsPtr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dnsPtr'");
            }
            if ((!args || args.ipAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipAddress'");
            }
            resourceInputs["dnsPtr"] = args ? args.dnsPtr : undefined;
            resourceInputs["floatingIpId"] = args ? args.floatingIpId : undefined;
            resourceInputs["ipAddress"] = args ? args.ipAddress : undefined;
            resourceInputs["loadBalancerId"] = args ? args.loadBalancerId : undefined;
            resourceInputs["primaryIpId"] = args ? args.primaryIpId : undefined;
            resourceInputs["serverId"] = args ? args.serverId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Rdns.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Rdns resources.
 */
export interface RdnsState {
    /**
     * The DNS address the `ipAddress` should resolve to.
     */
    dnsPtr?: pulumi.Input<string>;
    /**
     * The Floating IP the `ipAddress` belongs to.
     */
    floatingIpId?: pulumi.Input<number>;
    /**
     * The IP address that should point to `dnsPtr`.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * The Load Balancer the `ipAddress` belongs to.
     */
    loadBalancerId?: pulumi.Input<number>;
    /**
     * The Primary IP the `ipAddress` belongs to.
     */
    primaryIpId?: pulumi.Input<number>;
    /**
     * The server the `ipAddress` belongs to.
     */
    serverId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Rdns resource.
 */
export interface RdnsArgs {
    /**
     * The DNS address the `ipAddress` should resolve to.
     */
    dnsPtr: pulumi.Input<string>;
    /**
     * The Floating IP the `ipAddress` belongs to.
     */
    floatingIpId?: pulumi.Input<number>;
    /**
     * The IP address that should point to `dnsPtr`.
     */
    ipAddress: pulumi.Input<string>;
    /**
     * The Load Balancer the `ipAddress` belongs to.
     */
    loadBalancerId?: pulumi.Input<number>;
    /**
     * The Primary IP the `ipAddress` belongs to.
     */
    primaryIpId?: pulumi.Input<number>;
    /**
     * The server the `ipAddress` belongs to.
     */
    serverId?: pulumi.Input<number>;
}
