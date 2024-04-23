// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about multiple Hetzner Cloud Floating IPs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const ip2 = hcloud.getFloatingIps({
 *     withSelector: "key=value",
 * });
 * ```
 */
export function getFloatingIps(args?: GetFloatingIpsArgs, opts?: pulumi.InvokeOptions): Promise<GetFloatingIpsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getFloatingIps:getFloatingIps", {
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getFloatingIps.
 */
export interface GetFloatingIpsArgs {
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: string;
}

/**
 * A collection of values returned by getFloatingIps.
 */
export interface GetFloatingIpsResult {
    /**
     * (list) List of all matching floating ips. See `data.hcloud_floating_ip` for schema.
     */
    readonly floatingIps: outputs.GetFloatingIpsFloatingIp[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly withSelector?: string;
}
/**
 * Provides details about multiple Hetzner Cloud Floating IPs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const ip2 = hcloud.getFloatingIps({
 *     withSelector: "key=value",
 * });
 * ```
 */
export function getFloatingIpsOutput(args?: GetFloatingIpsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFloatingIpsResult> {
    return pulumi.output(args).apply((a: any) => getFloatingIps(a, opts))
}

/**
 * A collection of arguments for invoking getFloatingIps.
 */
export interface GetFloatingIpsOutputArgs {
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: pulumi.Input<string>;
}
