// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides details about a specific Hetzner Cloud Server Type.
 * Use this resource to get detailed information about specific Server Type.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const ds1 = hcloud.getServerType({
 *     name: "cx11",
 * });
 * const ds2 = hcloud.getServerType({
 *     id: 1,
 * });
 * ```
 */
export function getServerType(args?: GetServerTypeArgs, opts?: pulumi.InvokeOptions): Promise<GetServerTypeResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getServerType:getServerType", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerType.
 */
export interface GetServerTypeArgs {
    /**
     * ID of the server_type.
     */
    id?: number;
    /**
     * Name of the server_type.
     */
    name?: string;
}

/**
 * A collection of values returned by getServerType.
 */
export interface GetServerTypeResult {
    /**
     * (int) Number of cpu cores a Server of this type will have.
     */
    readonly cores: number;
    readonly cpuType: string;
    /**
     * (string) Description of the server_type.
     */
    readonly description: string;
    /**
     * (int) Disk size a Server of this type will have in GB.
     */
    readonly disk: number;
    /**
     * (int) Unique ID of the server_type.
     */
    readonly id: number;
    /**
     * (int) Memory a Server of this type will have in GB.
     */
    readonly memory: number;
    /**
     * (string) Name of the server_type.
     */
    readonly name: string;
    readonly storageType: string;
}
/**
 * Provides details about a specific Hetzner Cloud Server Type.
 * Use this resource to get detailed information about specific Server Type.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const ds1 = hcloud.getServerType({
 *     name: "cx11",
 * });
 * const ds2 = hcloud.getServerType({
 *     id: 1,
 * });
 * ```
 */
export function getServerTypeOutput(args?: GetServerTypeOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServerTypeResult> {
    return pulumi.output(args).apply((a: any) => getServerType(a, opts))
}

/**
 * A collection of arguments for invoking getServerType.
 */
export interface GetServerTypeOutputArgs {
    /**
     * ID of the server_type.
     */
    id?: pulumi.Input<number>;
    /**
     * Name of the server_type.
     */
    name?: pulumi.Input<string>;
}
