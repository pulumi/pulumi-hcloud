// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
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
 * const lb1 = pulumi.output(hcloud.getLoadBalancer({
 *     name: "my-load-balancer",
 * }));
 * const lb2 = pulumi.output(hcloud.getLoadBalancer({
 *     id: 123,
 * }));
 * const lb3 = pulumi.output(hcloud.getLoadBalancer({
 *     withSelector: "key=value",
 * }));
 * ```
 */
export function getLoadBalancer(args?: GetLoadBalancerArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadBalancerResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
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
     * (boolean) Whether delete protection is enabled.
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
    readonly labels: {[key: string]: any};
    /**
     * (string) Name of the Type of the Load Balancer.
     */
    readonly loadBalancerType: string;
    /**
     * (string) Name of the location the Load Balancer is in.
     */
    readonly location: string;
    /**
     * (string) Name of the Load Balancer.
     */
    readonly name?: string;
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

export function getLoadBalancerOutput(args?: GetLoadBalancerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLoadBalancerResult> {
    return pulumi.output(args).apply(a => getLoadBalancer(a, opts))
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
