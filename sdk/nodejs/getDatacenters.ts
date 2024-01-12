// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a list of available Hetzner Cloud Datacenters.
 * This resource may be useful to create highly available infrastructure, distributed across several datacenters.
 */
export function getDatacenters(args?: GetDatacentersArgs, opts?: pulumi.InvokeOptions): Promise<GetDatacentersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getDatacenters:getDatacenters", {
        "datacenterIds": args.datacenterIds,
        "descriptions": args.descriptions,
        "id": args.id,
        "names": args.names,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatacenters.
 */
export interface GetDatacentersArgs {
    /**
     * (list) List of unique datacenter identifiers. **Deprecated**: Use `datacenters` attribute instead.
     *
     * @deprecated Use datacenters list instead
     */
    datacenterIds?: string[];
    /**
     * (list) List of all datacenter descriptions. **Deprecated**: Use `datacenters` attribute instead.
     *
     * @deprecated Use datacenters list instead
     */
    descriptions?: string[];
    id?: string;
    /**
     * (list) List of datacenter names. **Deprecated**: Use `datacenters` attribute instead.
     *
     * @deprecated Use datacenters list instead
     */
    names?: string[];
}

/**
 * A collection of values returned by getDatacenters.
 */
export interface GetDatacentersResult {
    /**
     * (list) List of unique datacenter identifiers. **Deprecated**: Use `datacenters` attribute instead.
     *
     * @deprecated Use datacenters list instead
     */
    readonly datacenterIds?: string[];
    /**
     * (list) List of all datacenters. See `data.hcloud_datacenter` for schema.
     */
    readonly datacenters: outputs.GetDatacentersDatacenter[];
    /**
     * (list) List of all datacenter descriptions. **Deprecated**: Use `datacenters` attribute instead.
     *
     * @deprecated Use datacenters list instead
     */
    readonly descriptions?: string[];
    readonly id?: string;
    /**
     * (list) List of datacenter names. **Deprecated**: Use `datacenters` attribute instead.
     *
     * @deprecated Use datacenters list instead
     */
    readonly names?: string[];
}
/**
 * Provides a list of available Hetzner Cloud Datacenters.
 * This resource may be useful to create highly available infrastructure, distributed across several datacenters.
 */
export function getDatacentersOutput(args?: GetDatacentersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatacentersResult> {
    return pulumi.output(args).apply((a: any) => getDatacenters(a, opts))
}

/**
 * A collection of arguments for invoking getDatacenters.
 */
export interface GetDatacentersOutputArgs {
    /**
     * (list) List of unique datacenter identifiers. **Deprecated**: Use `datacenters` attribute instead.
     *
     * @deprecated Use datacenters list instead
     */
    datacenterIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list) List of all datacenter descriptions. **Deprecated**: Use `datacenters` attribute instead.
     *
     * @deprecated Use datacenters list instead
     */
    descriptions?: pulumi.Input<pulumi.Input<string>[]>;
    id?: pulumi.Input<string>;
    /**
     * (list) List of datacenter names. **Deprecated**: Use `datacenters` attribute instead.
     *
     * @deprecated Use datacenters list instead
     */
    names?: pulumi.Input<pulumi.Input<string>[]>;
}
