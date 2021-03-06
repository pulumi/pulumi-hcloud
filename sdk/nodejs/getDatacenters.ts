// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a list of available Hetzner Cloud Datacenters.
 * This resource may be useful to create highly available infrastructure, distributed across several datacenters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const ds = hcloud.getDatacenters({});
 * const workers: hcloud.Server[];
 * for (const range = {value: 0}; range.value < 3; range.value++) {
 *     workers.push(new hcloud.Server(`workers-${range.value}`, {
 *         image: "debian-9",
 *         serverType: "cx31",
 *         datacenter: ds.then(ds => ds.names)[range.value],
 *     }));
 * }
 * ```
 */
export function getDatacenters(args?: GetDatacentersArgs, opts?: pulumi.InvokeOptions): Promise<GetDatacentersResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("hcloud:index/getDatacenters:getDatacenters", {
        "datacenterIds": args.datacenterIds,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatacenters.
 */
export interface GetDatacentersArgs {
    /**
     * (list) List of unique datacenter identifiers.
     */
    readonly datacenterIds?: string[];
}

/**
 * A collection of values returned by getDatacenters.
 */
export interface GetDatacentersResult {
    /**
     * (list) List of unique datacenter identifiers.
     */
    readonly datacenterIds?: string[];
    /**
     * (list) List of all datacenter descriptions.
     */
    readonly descriptions: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (list) List of datacenter names.
     */
    readonly names: string[];
}
