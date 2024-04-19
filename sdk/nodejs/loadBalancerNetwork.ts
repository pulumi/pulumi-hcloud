// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Hetzner Cloud Load Balancer Network to represent a private network on a Load Balancer in the Hetzner Cloud.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const lb1 = new hcloud.LoadBalancer("lb1", {
 *     name: "lb1",
 *     loadBalancerType: "lb11",
 *     networkZone: "eu-central",
 * });
 * const mynet = new hcloud.Network("mynet", {
 *     name: "my-net",
 *     ipRange: "10.0.0.0/8",
 * });
 * const foonet = new hcloud.NetworkSubnet("foonet", {
 *     networkId: mynet.id,
 *     type: "cloud",
 *     networkZone: "eu-central",
 *     ipRange: "10.0.1.0/24",
 * });
 * const srvnetwork = new hcloud.LoadBalancerNetwork("srvnetwork", {
 *     loadBalancerId: lb1.id,
 *     networkId: mynet.id,
 *     ip: "10.0.1.5",
 * }, {
 *     dependsOn: [srvnetworkHcloudNetworkSubnet],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Load Balancer Network entries can be imported using a compound ID with the following format:
 *
 * `<load-balancer-id>-<network-id>`
 *
 * ```sh
 * $ pulumi import hcloud:index/loadBalancerNetwork:LoadBalancerNetwork myloadbalancernetwork 123-654
 * ```
 */
export class LoadBalancerNetwork extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancerNetwork resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerNetworkState, opts?: pulumi.CustomResourceOptions): LoadBalancerNetwork {
        return new LoadBalancerNetwork(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/loadBalancerNetwork:LoadBalancerNetwork';

    /**
     * Returns true if the given object is an instance of LoadBalancerNetwork.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancerNetwork {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancerNetwork.__pulumiType;
    }

    /**
     * Enable or disable the
     * Load Balancers public interface. Default: `true`
     */
    public readonly enablePublicInterface!: pulumi.Output<boolean | undefined>;
    /**
     * IP to request to be assigned to this Load
     * Balancer. If you do not provide this then you will be auto assigned an
     * IP address.
     */
    public readonly ip!: pulumi.Output<string>;
    /**
     * ID of the Load Balancer.
     */
    public readonly loadBalancerId!: pulumi.Output<number>;
    /**
     * ID of the network which should be added
     * to the Load Balancer. Required if `subnetId` is not set. Successful
     * creation of the resource depends on the existence of a subnet in the
     * Hetzner Cloud Backend. Using `networkId` will not create an explicit
     * dependency between the Load Balancer and the subnet. Therefore
     * `dependsOn` may need to be used. Alternatively the `subnetId`
     * property can be used, which will create an explicit dependency between
     * `hcloud.LoadBalancerNetwork` and the existence of a subnet.
     */
    public readonly networkId!: pulumi.Output<number | undefined>;
    /**
     * ID of the sub-network which should be
     * added to the Load Balancer. Required if `networkId` is not set.
     * *Note*: if the `ip` property is missing, the Load Balancer is
     * currently added to the last created subnet.
     */
    public readonly subnetId!: pulumi.Output<string | undefined>;

    /**
     * Create a LoadBalancerNetwork resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerNetworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerNetworkArgs | LoadBalancerNetworkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerNetworkState | undefined;
            resourceInputs["enablePublicInterface"] = state ? state.enablePublicInterface : undefined;
            resourceInputs["ip"] = state ? state.ip : undefined;
            resourceInputs["loadBalancerId"] = state ? state.loadBalancerId : undefined;
            resourceInputs["networkId"] = state ? state.networkId : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
        } else {
            const args = argsOrState as LoadBalancerNetworkArgs | undefined;
            if ((!args || args.loadBalancerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadBalancerId'");
            }
            resourceInputs["enablePublicInterface"] = args ? args.enablePublicInterface : undefined;
            resourceInputs["ip"] = args ? args.ip : undefined;
            resourceInputs["loadBalancerId"] = args ? args.loadBalancerId : undefined;
            resourceInputs["networkId"] = args ? args.networkId : undefined;
            resourceInputs["subnetId"] = args ? args.subnetId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadBalancerNetwork.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancerNetwork resources.
 */
export interface LoadBalancerNetworkState {
    /**
     * Enable or disable the
     * Load Balancers public interface. Default: `true`
     */
    enablePublicInterface?: pulumi.Input<boolean>;
    /**
     * IP to request to be assigned to this Load
     * Balancer. If you do not provide this then you will be auto assigned an
     * IP address.
     */
    ip?: pulumi.Input<string>;
    /**
     * ID of the Load Balancer.
     */
    loadBalancerId?: pulumi.Input<number>;
    /**
     * ID of the network which should be added
     * to the Load Balancer. Required if `subnetId` is not set. Successful
     * creation of the resource depends on the existence of a subnet in the
     * Hetzner Cloud Backend. Using `networkId` will not create an explicit
     * dependency between the Load Balancer and the subnet. Therefore
     * `dependsOn` may need to be used. Alternatively the `subnetId`
     * property can be used, which will create an explicit dependency between
     * `hcloud.LoadBalancerNetwork` and the existence of a subnet.
     */
    networkId?: pulumi.Input<number>;
    /**
     * ID of the sub-network which should be
     * added to the Load Balancer. Required if `networkId` is not set.
     * *Note*: if the `ip` property is missing, the Load Balancer is
     * currently added to the last created subnet.
     */
    subnetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadBalancerNetwork resource.
 */
export interface LoadBalancerNetworkArgs {
    /**
     * Enable or disable the
     * Load Balancers public interface. Default: `true`
     */
    enablePublicInterface?: pulumi.Input<boolean>;
    /**
     * IP to request to be assigned to this Load
     * Balancer. If you do not provide this then you will be auto assigned an
     * IP address.
     */
    ip?: pulumi.Input<string>;
    /**
     * ID of the Load Balancer.
     */
    loadBalancerId: pulumi.Input<number>;
    /**
     * ID of the network which should be added
     * to the Load Balancer. Required if `subnetId` is not set. Successful
     * creation of the resource depends on the existence of a subnet in the
     * Hetzner Cloud Backend. Using `networkId` will not create an explicit
     * dependency between the Load Balancer and the subnet. Therefore
     * `dependsOn` may need to be used. Alternatively the `subnetId`
     * property can be used, which will create an explicit dependency between
     * `hcloud.LoadBalancerNetwork` and the existence of a subnet.
     */
    networkId?: pulumi.Input<number>;
    /**
     * ID of the sub-network which should be
     * added to the Load Balancer. Required if `networkId` is not set.
     * *Note*: if the `ip` property is missing, the Load Balancer is
     * currently added to the last created subnet.
     */
    subnetId?: pulumi.Input<string>;
}
