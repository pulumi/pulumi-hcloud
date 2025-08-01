// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about multiple Hetzner Cloud Volumes.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const volume_ = hcloud.getVolumes({});
 * const volume3 = hcloud.getVolumes({
 *     withSelector: "key=value",
 * });
 * ```
 */
export function getVolumes(args?: GetVolumesArgs, opts?: pulumi.InvokeOptions): Promise<GetVolumesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getVolumes:getVolumes", {
        "withSelector": args.withSelector,
        "withStatuses": args.withStatuses,
    }, opts);
}

/**
 * A collection of arguments for invoking getVolumes.
 */
export interface GetVolumesArgs {
    /**
     * [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
     */
    withSelector?: string;
    /**
     * List only volumes with the specified status, could contain `creating` or `available`.
     */
    withStatuses?: string[];
}

/**
 * A collection of values returned by getVolumes.
 */
export interface GetVolumesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (list) List of all matching volumes. See `data.hcloud_volume` for schema.
     */
    readonly volumes: outputs.GetVolumesVolume[];
    readonly withSelector?: string;
    readonly withStatuses?: string[];
}
/**
 * Provides details about multiple Hetzner Cloud Volumes.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const volume_ = hcloud.getVolumes({});
 * const volume3 = hcloud.getVolumes({
 *     withSelector: "key=value",
 * });
 * ```
 */
export function getVolumesOutput(args?: GetVolumesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetVolumesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("hcloud:index/getVolumes:getVolumes", {
        "withSelector": args.withSelector,
        "withStatuses": args.withStatuses,
    }, opts);
}

/**
 * A collection of arguments for invoking getVolumes.
 */
export interface GetVolumesOutputArgs {
    /**
     * [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
     */
    withSelector?: pulumi.Input<string>;
    /**
     * List only volumes with the specified status, could contain `creating` or `available`.
     */
    withStatuses?: pulumi.Input<pulumi.Input<string>[]>;
}
