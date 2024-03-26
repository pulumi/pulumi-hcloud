// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const volume1 = hcloud.getVolume({
 *     id: 1234,
 * });
 * const volume2 = hcloud.getVolume({
 *     name: "my-volume",
 * });
 * const volume3 = hcloud.getVolume({
 *     withSelector: "key=value",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getVolume(args?: GetVolumeArgs, opts?: pulumi.InvokeOptions): Promise<GetVolumeResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getVolume:getVolume", {
        "id": args.id,
        "location": args.location,
        "name": args.name,
        "selector": args.selector,
        "serverId": args.serverId,
        "withSelector": args.withSelector,
        "withStatuses": args.withStatuses,
    }, opts);
}

/**
 * A collection of arguments for invoking getVolume.
 */
export interface GetVolumeArgs {
    /**
     * ID of the volume.
     */
    id?: number;
    /**
     * (string) The location name.
     */
    location?: string;
    /**
     * Name of the volume.
     */
    name?: string;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    selector?: string;
    /**
     * (Optional, int) Server ID the volume is attached to
     */
    serverId?: number;
    /**
     * Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     */
    withSelector?: string;
    /**
     * List only volumes with the specified status, could contain `creating` or `available`.
     */
    withStatuses?: string[];
}

/**
 * A collection of values returned by getVolume.
 */
export interface GetVolumeResult {
    /**
     * (bool) Whether delete protection is enabled.
     */
    readonly deleteProtection: boolean;
    /**
     * (int) Unique ID of the volume.
     */
    readonly id: number;
    /**
     * (map) User-defined labels (key-value pairs).
     */
    readonly labels: {[key: string]: any};
    /**
     * (string) Device path on the file system for the Volume.
     */
    readonly linuxDevice: string;
    /**
     * (string) The location name.
     */
    readonly location?: string;
    /**
     * (string) Name of the volume.
     */
    readonly name: string;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    readonly selector?: string;
    /**
     * (Optional, int) Server ID the volume is attached to
     */
    readonly serverId?: number;
    /**
     * (int) Size of the volume.
     */
    readonly size: number;
    readonly withSelector?: string;
    readonly withStatuses?: string[];
}
/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const volume1 = hcloud.getVolume({
 *     id: 1234,
 * });
 * const volume2 = hcloud.getVolume({
 *     name: "my-volume",
 * });
 * const volume3 = hcloud.getVolume({
 *     withSelector: "key=value",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getVolumeOutput(args?: GetVolumeOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVolumeResult> {
    return pulumi.output(args).apply((a: any) => getVolume(a, opts))
}

/**
 * A collection of arguments for invoking getVolume.
 */
export interface GetVolumeOutputArgs {
    /**
     * ID of the volume.
     */
    id?: pulumi.Input<number>;
    /**
     * (string) The location name.
     */
    location?: pulumi.Input<string>;
    /**
     * Name of the volume.
     */
    name?: pulumi.Input<string>;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    selector?: pulumi.Input<string>;
    /**
     * (Optional, int) Server ID the volume is attached to
     */
    serverId?: pulumi.Input<number>;
    /**
     * Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     */
    withSelector?: pulumi.Input<string>;
    /**
     * List only volumes with the specified status, could contain `creating` or `available`.
     */
    withStatuses?: pulumi.Input<pulumi.Input<string>[]>;
}
