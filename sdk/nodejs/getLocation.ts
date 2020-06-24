// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about a specific Hetzner Cloud Location.
 * Use this resource to get detailed information about specific location.
 */
export function getLocation(args?: GetLocationArgs, opts?: pulumi.InvokeOptions): Promise<GetLocationResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("hcloud:index/getLocation:getLocation", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getLocation.
 */
export interface GetLocationArgs {
    readonly id?: number;
    readonly name?: string;
}

/**
 * A collection of values returned by getLocation.
 */
export interface GetLocationResult {
    readonly city: string;
    readonly country: string;
    readonly description: string;
    readonly id: number;
    readonly latitude: number;
    readonly longitude: number;
    readonly name: string;
}
