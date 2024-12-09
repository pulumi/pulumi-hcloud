// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about a specific Hetzner Cloud Load Balancer.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const lb1 = hcloud.getLoadBalancer({
 *     name: "my-load-balancer",
 * });
 * const lb2 = hcloud.getLoadBalancer({
 *     id: 123,
 * });
 * const lb3 = hcloud.getLoadBalancer({
 *     withSelector: "key=value",
 * });
 * ```
 */
export function getLoadBalancer(args?: GetLoadBalancerArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadBalancerResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getLoadBalancer:getLoadBalancer", {
        "id": args.id,
        "name": args.name,
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancer.
 */
export interface GetLoadBalancerArgs {
    /**
     * ID of the Load Balancer.
     */
    id?: number;
    /**
     * Name of the Load Balancer.
     */
    name?: string;
    /**
     * Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     */
    withSelector?: string;
}

/**
 * A collection of values returned by getLoadBalancer.
 */
export interface GetLoadBalancerResult {
    /**
     * (Optional) Configuration of the algorithm the Load Balancer use.
     */
    readonly algorithms: outputs.GetLoadBalancerAlgorithm[];
    /**
     * (bool) Whether delete protection is enabled.
     */
    readonly deleteProtection: boolean;
    /**
     * (int) Unique ID of the Load Balancer.
     */
    readonly id: number;
    /**
     * (string) IPv4 Address of the Load Balancer.
     */
    readonly ipv4: string;
    /**
     * (string) IPv4 Address of the Load Balancer.
     */
    readonly ipv6: string;
    /**
     * (map) User-defined labels (key-value pairs) .
     */
    readonly labels: {[key: string]: string};
    /**
     * (string) Name of the Type of the Load Balancer.
     */
    readonly loadBalancerType: string;
    /**
     * (string) Name of the location the Load Balancer is in. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     */
    readonly location: string;
    /**
     * (string) Name of the Load Balancer.
     */
    readonly name?: string;
    /**
     * (int) ID of the first private network that this Load Balancer is connected to.
     */
    readonly networkId: number;
    /**
     * (string) IP of the Load Balancer in the first private network that it is connected to.
     */
    readonly networkIp: string;
    readonly networkZone: string;
    /**
     * (list) List of services a Load Balancer provides.
     */
    readonly services: outputs.GetLoadBalancerService[];
    /**
     * (list) List of targets of the Load Balancer.
     */
    readonly targets: outputs.GetLoadBalancerTarget[];
    readonly withSelector?: string;
}
/**
 * Provides details about a specific Hetzner Cloud Load Balancer.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const lb1 = hcloud.getLoadBalancer({
 *     name: "my-load-balancer",
 * });
 * const lb2 = hcloud.getLoadBalancer({
 *     id: 123,
 * });
 * const lb3 = hcloud.getLoadBalancer({
 *     withSelector: "key=value",
 * });
 * ```
 */
export function getLoadBalancerOutput(args?: GetLoadBalancerOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLoadBalancerResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("hcloud:index/getLoadBalancer:getLoadBalancer", {
        "id": args.id,
        "name": args.name,
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancer.
 */
export interface GetLoadBalancerOutputArgs {
    /**
     * ID of the Load Balancer.
     */
    id?: pulumi.Input<number>;
    /**
     * Name of the Load Balancer.
     */
    name?: pulumi.Input<string>;
    /**
     * Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     */
    withSelector?: pulumi.Input<string>;
}
