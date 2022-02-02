// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides details about a specific Hetzner Cloud Placement Group.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const samplePlacementGroup1 = pulumi.output(hcloud.getPlacementGroup({
 *     name: "sample-placement-group-1",
 * }));
 * const samplePlacementGroup2 = pulumi.output(hcloud.getPlacementGroup({
 *     id: 4711,
 * }));
 * ```
 */
export function getPlacementGroup(args?: GetPlacementGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetPlacementGroupResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("hcloud:index/getPlacementGroup:getPlacementGroup", {
        "id": args.id,
        "labels": args.labels,
        "mostRecent": args.mostRecent,
        "name": args.name,
        "type": args.type,
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getPlacementGroup.
 */
export interface GetPlacementGroupArgs {
    /**
     * ID of the placement group.
     */
    id?: number;
    /**
     * (map) User-defined labels (key-value pairs)
     */
    labels?: {[key: string]: any};
    /**
     * Return most recent placement group if multiple are found.
     */
    mostRecent?: boolean;
    /**
     * Name of the placement group.
     */
    name?: string;
    /**
     * (string)  Type of the Placement Group.
     */
    type?: string;
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: string;
}

/**
 * A collection of values returned by getPlacementGroup.
 */
export interface GetPlacementGroupResult {
    /**
     * (int) Unique ID of the Placement Group.
     */
    readonly id?: number;
    /**
     * (map) User-defined labels (key-value pairs)
     */
    readonly labels?: {[key: string]: any};
    readonly mostRecent?: boolean;
    /**
     * (string) Name of the Placement Group.
     */
    readonly name: string;
    readonly servers: number[];
    /**
     * (string)  Type of the Placement Group.
     */
    readonly type?: string;
    readonly withSelector?: string;
}

export function getPlacementGroupOutput(args?: GetPlacementGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPlacementGroupResult> {
    return pulumi.output(args).apply(a => getPlacementGroup(a, opts))
}

/**
 * A collection of arguments for invoking getPlacementGroup.
 */
export interface GetPlacementGroupOutputArgs {
    /**
     * ID of the placement group.
     */
    id?: pulumi.Input<number>;
    /**
     * (map) User-defined labels (key-value pairs)
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Return most recent placement group if multiple are found.
     */
    mostRecent?: pulumi.Input<boolean>;
    /**
     * Name of the placement group.
     */
    name?: pulumi.Input<string>;
    /**
     * (string)  Type of the Placement Group.
     */
    type?: pulumi.Input<string>;
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: pulumi.Input<string>;
}
