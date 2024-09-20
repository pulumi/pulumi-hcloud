// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a list of available Hetzner Cloud Server Types.
 */
export function getServerTypes(args?: GetServerTypesArgs, opts?: pulumi.InvokeOptions): Promise<GetServerTypesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getServerTypes:getServerTypes", {
        "serverTypeIds": args.serverTypeIds,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerTypes.
 */
export interface GetServerTypesArgs {
    /**
     * @deprecated Use serverTypes list instead
     */
    serverTypeIds?: string[];
}

/**
 * A collection of values returned by getServerTypes.
 */
export interface GetServerTypesResult {
    /**
     * @deprecated Use serverTypes list instead
     */
    readonly descriptions: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * @deprecated Use serverTypes list instead
     */
    readonly names: string[];
    /**
     * @deprecated Use serverTypes list instead
     */
    readonly serverTypeIds?: string[];
    /**
     * (list) List of all server types. See `data.hcloud_server_type` for schema.
     */
    readonly serverTypes: outputs.GetServerTypesServerType[];
}
/**
 * Provides a list of available Hetzner Cloud Server Types.
 */
export function getServerTypesOutput(args?: GetServerTypesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServerTypesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("hcloud:index/getServerTypes:getServerTypes", {
        "serverTypeIds": args.serverTypeIds,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerTypes.
 */
export interface GetServerTypesOutputArgs {
    /**
     * @deprecated Use serverTypes list instead
     */
    serverTypeIds?: pulumi.Input<pulumi.Input<string>[]>;
}
