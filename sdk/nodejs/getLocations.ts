// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a list of available Hetzner Cloud Locations.
 *
 * This resource may be useful to create highly available infrastructure, distributed across several locations.
 */
export function getLocations(opts?: pulumi.InvokeOptions): Promise<GetLocationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getLocations:getLocations", {
    }, opts);
}

/**
 * A collection of values returned by getLocations.
 */
export interface GetLocationsResult {
    /**
     * @deprecated Use locations list instead
     */
    readonly descriptions: string[];
    /**
     * The ID of this resource.
     */
    readonly id: string;
    /**
     * @deprecated Use locations list instead
     */
    readonly locationIds: string[];
    readonly locations: outputs.GetLocationsLocation[];
    /**
     * @deprecated Use locations list instead
     */
    readonly names: string[];
}
/**
 * Provides a list of available Hetzner Cloud Locations.
 *
 * This resource may be useful to create highly available infrastructure, distributed across several locations.
 */
export function getLocationsOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetLocationsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("hcloud:index/getLocations:getLocations", {
    }, opts);
}
