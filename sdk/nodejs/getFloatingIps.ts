// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
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
 * const ip2 = pulumi.output(hcloud.getFloatingIps({
 *     withSelector: "key=value",
 * }, { async: true }));
 * ```
 */
export function getFloatingIps(args?: GetFloatingIpsArgs, opts?: pulumi.InvokeOptions): Promise<GetFloatingIpsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
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
    readonly withSelector?: string;
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