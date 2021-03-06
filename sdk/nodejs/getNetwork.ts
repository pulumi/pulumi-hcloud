// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

export function getNetwork(args?: GetNetworkArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("hcloud:index/getNetwork:getNetwork", {
        "id": args.id,
        "ipRange": args.ipRange,
        "labels": args.labels,
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
    readonly id?: number;
    /**
     * IPv4 prefix of the Network.
     */
    readonly ipRange?: string;
    readonly labels?: {[key: string]: any};
    /**
     * Name of the Network.
     */
    readonly name?: string;
    /**
     * Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     */
    readonly withSelector?: string;
}

/**
 * A collection of values returned by getNetwork.
 */
export interface GetNetworkResult {
    /**
     * Unique ID of the Network.
     */
    readonly id: number;
    /**
     * IPv4 prefix of the Network.
     */
    readonly ipRange?: string;
    readonly labels?: {[key: string]: any};
    /**
     * Name of the Network.
     */
    readonly name?: string;
    readonly withSelector?: string;
}
