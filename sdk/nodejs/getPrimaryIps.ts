// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about multiple Hetzner Cloud Primary IPs.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const ip2 = hcloud.getPrimaryIps({
 *     withSelector: "key=value",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPrimaryIps(args?: GetPrimaryIpsArgs, opts?: pulumi.InvokeOptions): Promise<GetPrimaryIpsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getPrimaryIps:getPrimaryIps", {
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrimaryIps.
 */
export interface GetPrimaryIpsArgs {
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: string;
}

/**
 * A collection of values returned by getPrimaryIps.
 */
export interface GetPrimaryIpsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (list) List of all matching primary ips. See `data.hcloud_primary_ip` for schema.
     */
    readonly primaryIps: outputs.GetPrimaryIpsPrimaryIp[];
    readonly withSelector?: string;
}
/**
 * Provides details about multiple Hetzner Cloud Primary IPs.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const ip2 = hcloud.getPrimaryIps({
 *     withSelector: "key=value",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getPrimaryIpsOutput(args?: GetPrimaryIpsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrimaryIpsResult> {
    return pulumi.output(args).apply((a: any) => getPrimaryIps(a, opts))
}

/**
 * A collection of arguments for invoking getPrimaryIps.
 */
export interface GetPrimaryIpsOutputArgs {
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: pulumi.Input<string>;
}
