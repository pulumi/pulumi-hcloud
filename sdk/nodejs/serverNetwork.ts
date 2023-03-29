// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Hetzner Cloud Server Network to represent a private network on a server in the Hetzner Cloud.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const node1 = new hcloud.Server("node1", {
 *     image: "debian-11",
 *     serverType: "cx11",
 * });
 * const mynet = new hcloud.Network("mynet", {ipRange: "10.0.0.0/8"});
 * const foonet = new hcloud.NetworkSubnet("foonet", {
 *     networkId: mynet.id,
 *     type: "cloud",
 *     networkZone: "eu-central",
 *     ipRange: "10.0.1.0/24",
 * });
 * const srvnetwork = new hcloud.ServerNetwork("srvnetwork", {
 *     serverId: node1.id,
 *     networkId: mynet.id,
 *     ip: "10.0.1.5",
 * });
 * ```
 *
 * ## Import
 *
 * Server Network entries can be imported using a compound ID with the following format`<server-id>-<network-id>`
 *
 * ```sh
 *  $ pulumi import hcloud:index/serverNetwork:ServerNetwork myservernetwork 123-654
 * ```
 */
export class ServerNetwork extends pulumi.CustomResource {
    /**
     * Get an existing ServerNetwork resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerNetworkState, opts?: pulumi.CustomResourceOptions): ServerNetwork {
        return new ServerNetwork(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/serverNetwork:ServerNetwork';

    /**
     * Returns true if the given object is an instance of ServerNetwork.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerNetwork {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerNetwork.__pulumiType;
    }

    /**
     * Additional IPs to be assigned
     * to this server.
     */
    public readonly aliasIps!: pulumi.Output<string[] | undefined>;
    /**
     * IP to request to be assigned to this server.
     * If you do not provide this then you will be auto assigned an IP
     * address.
     */
    public readonly ip!: pulumi.Output<string>;
    public /*out*/ readonly macAddress!: pulumi.Output<string>;
    /**
     * ID of the network which should be added
     * to the server. Required if `subnetId` is not set. Successful creation
     * of the resource depends on the existence of a subnet in the Hetzner
     * Cloud Backend. Using `networkId` will not create an explicit
     * dependency between server and subnet. Therefore `dependsOn` may need
     * to be used. Alternatively the `subnetId` property can be used, which
     * will create an explicit dependency between `hcloud.ServerNetwork` and
     * the existence of a subnet.
     */
    public readonly networkId!: pulumi.Output<number | undefined>;
    /**
     * ID of the server.
     */
    public readonly serverId!: pulumi.Output<number>;
    /**
     * ID of the sub-network which should be
     * added to the Server. Required if `networkId` is not set.
     * *Note*: if the `ip` property is missing, the Server is currently added
     * to the last created subnet.
     */
    public readonly subnetId!: pulumi.Output<string | undefined>;

    /**
     * Create a ServerNetwork resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerNetworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerNetworkArgs | ServerNetworkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerNetworkState | undefined;
            resourceInputs["aliasIps"] = state ? state.aliasIps : undefined;
            resourceInputs["ip"] = state ? state.ip : undefined;
            resourceInputs["macAddress"] = state ? state.macAddress : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["serverId"] = state ? state.serverId : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
        } else {
            const args = argsOrState as ServerNetworkArgs | undefined;
            if ((!args || args.serverId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverId'");
            }
            resourceInputs["aliasIps"] = args ? args.aliasIps : undefined;
            resourceInputs["ip"] = args ? args.ip : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["serverId"] = args ? args.serverId : undefined;
            resourceInputs["subnetId"] = args ? args.subnetId : undefined;
            resourceInputs["macAddress"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServerNetwork.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerNetwork resources.
 */
export interface ServerNetworkState {
    /**
     * Additional IPs to be assigned
     * to this server.
     */
    aliasIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * IP to request to be assigned to this server.
     * If you do not provide this then you will be auto assigned an IP
     * address.
     */
    ip?: pulumi.Input<string>;
    macAddress?: pulumi.Input<string>;
    /**
     * ID of the network which should be added
     * to the server. Required if `subnetId` is not set. Successful creation
     * of the resource depends on the existence of a subnet in the Hetzner
     * Cloud Backend. Using `networkId` will not create an explicit
     * dependency between server and subnet. Therefore `dependsOn` may need
     * to be used. Alternatively the `subnetId` property can be used, which
     * will create an explicit dependency between `hcloud.ServerNetwork` and
     * the existence of a subnet.
     */
    networkId?: pulumi.Input<number>;
    /**
     * ID of the server.
     */
    serverId?: pulumi.Input<number>;
    /**
     * ID of the sub-network which should be
     * added to the Server. Required if `networkId` is not set.
     * *Note*: if the `ip` property is missing, the Server is currently added
     * to the last created subnet.
     */
    subnetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServerNetwork resource.
 */
export interface ServerNetworkArgs {
    /**
     * Additional IPs to be assigned
     * to this server.
     */
    aliasIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * IP to request to be assigned to this server.
     * If you do not provide this then you will be auto assigned an IP
     * address.
     */
    ip?: pulumi.Input<string>;
    /**
     * ID of the network which should be added
     * to the server. Required if `subnetId` is not set. Successful creation
     * of the resource depends on the existence of a subnet in the Hetzner
     * Cloud Backend. Using `networkId` will not create an explicit
     * dependency between server and subnet. Therefore `dependsOn` may need
     * to be used. Alternatively the `subnetId` property can be used, which
     * will create an explicit dependency between `hcloud.ServerNetwork` and
     * the existence of a subnet.
     */
    networkId?: pulumi.Input<number>;
    /**
     * ID of the server.
     */
    serverId: pulumi.Input<number>;
    /**
     * ID of the sub-network which should be
     * added to the Server. Required if `networkId` is not set.
     * *Note*: if the `ip` property is missing, the Server is currently added
     * to the last created subnet.
     */
    subnetId?: pulumi.Input<string>;
}
