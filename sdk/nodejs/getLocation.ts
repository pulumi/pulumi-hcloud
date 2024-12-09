// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides details about a specific Hetzner Cloud Location.
 *
 * Use this resource to get detailed information about a specific Location.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const byId = hcloud.getLocation({
 *     id: 1,
 * });
 * const byName = hcloud.getLocation({
 *     name: "fsn1",
 * });
 * ```
 */
export function getLocation(args?: GetLocationArgs, opts?: pulumi.InvokeOptions): Promise<GetLocationResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getLocation:getLocation", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getLocation.
 */
export interface GetLocationArgs {
    /**
     * ID of the Location.
     */
    id?: number;
    /**
     * Name of the Location.
     */
    name?: string;
}

/**
 * A collection of values returned by getLocation.
 */
export interface GetLocationResult {
    /**
     * Name of the closest city to the Location. City name and optionally state in short form.
     */
    readonly city: string;
    /**
     * Country the Location resides in. ISO 3166-1 alpha-2 code of the country.
     */
    readonly country: string;
    /**
     * Description of the Location.
     */
    readonly description: string;
    /**
     * ID of the Location.
     */
    readonly id?: number;
    /**
     * Latitude of the city closest to the Location.
     */
    readonly latitude: number;
    /**
     * Longitude of the city closest to the Location.
     */
    readonly longitude: number;
    /**
     * Name of the Location.
     */
    readonly name?: string;
    /**
     * Name of the Network Zone this Location resides in.
     */
    readonly networkZone: string;
}
/**
 * Provides details about a specific Hetzner Cloud Location.
 *
 * Use this resource to get detailed information about a specific Location.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const byId = hcloud.getLocation({
 *     id: 1,
 * });
 * const byName = hcloud.getLocation({
 *     name: "fsn1",
 * });
 * ```
 */
export function getLocationOutput(args?: GetLocationOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLocationResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("hcloud:index/getLocation:getLocation", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getLocation.
 */
export interface GetLocationOutputArgs {
    /**
     * ID of the Location.
     */
    id?: pulumi.Input<number>;
    /**
     * Name of the Location.
     */
    name?: pulumi.Input<string>;
}
