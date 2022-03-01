// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const network1 = pulumi.output(hcloud.getNetwork({
 *     id: 1234,
 * }));
 * const network2 = pulumi.output(hcloud.getNetwork({
 *     name: "my-network",
 * }));
 * const network3 = pulumi.output(hcloud.getNetwork({
 *     withSelector: "key=value",
 * }));
 * ```
 */
export function getNetwork(args?: GetNetworkArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("hcloud:index/getNetwork:getNetwork", {
        "id": args.id,
        "ipRange": args.ipRange,
        "labels": args.labels,
        "mostRecent": args.mostRecent,
        "name": args.name,
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetwork.
 */
export interface GetNetworkArgs {
    /**
     * ID of the Network.
     */
    id?: number;
    /**
     * IPv4 prefix of the Network.
     */
    ipRange?: string;
    labels?: {[key: string]: any};
    mostRecent?: boolean;
    /**
     * Name of the Network.
     */
    name?: string;
    /**
     * Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     */
    withSelector?: string;
}

/**
 * A collection of values returned by getNetwork.
 */
export interface GetNetworkResult {
    /**
     * (boolean) Whether delete protection is enabled.
     */
    readonly deleteProtection: boolean;
    /**
     * Unique ID of the Network.
     */
    readonly id: number;
    /**
     * IPv4 prefix of the Network.
     */
    readonly ipRange?: string;
    readonly labels?: {[key: string]: any};
    readonly mostRecent?: boolean;
    /**
     * Name of the Network.
     */
    readonly name?: string;
    readonly withSelector?: string;
}

export function getNetworkOutput(args?: GetNetworkOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkResult> {
    return pulumi.output(args).apply(a => getNetwork(a, opts))
}

/**
 * A collection of arguments for invoking getNetwork.
 */
export interface GetNetworkOutputArgs {
    /**
     * ID of the Network.
     */
    id?: pulumi.Input<number>;
    /**
     * IPv4 prefix of the Network.
     */
    ipRange?: pulumi.Input<string>;
    labels?: pulumi.Input<{[key: string]: any}>;
    mostRecent?: pulumi.Input<boolean>;
    /**
     * Name of the Network.
     */
    name?: pulumi.Input<string>;
    /**
     * Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     */
    withSelector?: pulumi.Input<string>;
}
