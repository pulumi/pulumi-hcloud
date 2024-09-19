// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a list of available Hetzner Cloud Locations.
 * This resource may be useful to create highly available infrastructure, distributed across several locations.
 */
export function getLocations(args?: GetLocationsArgs, opts?: pulumi.InvokeOptions): Promise<GetLocationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getLocations:getLocations", {
        "descriptions": args.descriptions,
        "id": args.id,
        "locationIds": args.locationIds,
        "names": args.names,
    }, opts);
}

/**
 * A collection of arguments for invoking getLocations.
 */
export interface GetLocationsArgs {
    /**
     * (list) List of all location descriptions. **Deprecated**: Use `locations` attribute instead.
     *
     * @deprecated Use locations list instead
     */
    descriptions?: string[];
    id?: string;
    /**
     * (list) List of unique location identifiers. **Deprecated**: Use `locations` attribute instead.
     *
     * @deprecated Use locations list instead
     */
    locationIds?: string[];
    /**
     * (list) List of location names. **Deprecated**: Use `locations` attribute instead.
     *
     * @deprecated Use locations list instead
     */
    names?: string[];
}

/**
 * A collection of values returned by getLocations.
 */
export interface GetLocationsResult {
    /**
     * (list) List of all location descriptions. **Deprecated**: Use `locations` attribute instead.
     *
     * @deprecated Use locations list instead
     */
    readonly descriptions?: string[];
    readonly id?: string;
    /**
     * (list) List of unique location identifiers. **Deprecated**: Use `locations` attribute instead.
     *
     * @deprecated Use locations list instead
     */
    readonly locationIds?: string[];
    /**
     * (list) List of all locations. See `data.hcloud_location` for schema.
     */
    readonly locations: outputs.GetLocationsLocation[];
    /**
     * (list) List of location names. **Deprecated**: Use `locations` attribute instead.
     *
     * @deprecated Use locations list instead
     */
    readonly names?: string[];
}
/**
 * Provides a list of available Hetzner Cloud Locations.
 * This resource may be useful to create highly available infrastructure, distributed across several locations.
 */
export function getLocationsOutput(args?: GetLocationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLocationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("hcloud:index/getLocations:getLocations", {
        "descriptions": args.descriptions,
        "id": args.id,
        "locationIds": args.locationIds,
        "names": args.names,
    }, opts);
}

/**
 * A collection of arguments for invoking getLocations.
 */
export interface GetLocationsOutputArgs {
    /**
     * (list) List of all location descriptions. **Deprecated**: Use `locations` attribute instead.
     *
     * @deprecated Use locations list instead
     */
    descriptions?: pulumi.Input<pulumi.Input<string>[]>;
    id?: pulumi.Input<string>;
    /**
     * (list) List of unique location identifiers. **Deprecated**: Use `locations` attribute instead.
     *
     * @deprecated Use locations list instead
     */
    locationIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (list) List of location names. **Deprecated**: Use `locations` attribute instead.
     *
     * @deprecated Use locations list instead
     */
    names?: pulumi.Input<pulumi.Input<string>[]>;
}
