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
 *     name: "cx22",
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
        "deprecationAnnounced": args.deprecationAnnounced,
        "id": args.id,
        "name": args.name,
        "unavailableAfter": args.unavailableAfter,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerType.
 */
export interface GetServerTypeArgs {
    /**
     * (Optional, string) Date when the deprecation of the server type was announced. Only set when the server type is deprecated.
     */
    deprecationAnnounced?: string;
    /**
     * ID of the server_type.
     */
    id?: number;
    /**
     * Name of the server_type.
     */
    name?: string;
    /**
     * (Optional, string) Date when the server type will not be available for new servers. Only set when the server type is deprecated.
     */
    unavailableAfter?: string;
}

/**
 * A collection of values returned by getServerType.
 */
export interface GetServerTypeResult {
    /**
     * (string) Architecture of the server_type.
     */
    readonly architecture: string;
    /**
     * (int) Number of cpu cores a Server of this type will have.
     */
    readonly cores: number;
    readonly cpuType: string;
    /**
     * (Optional, string) Date when the deprecation of the server type was announced. Only set when the server type is deprecated.
     */
    readonly deprecationAnnounced: string;
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
     * (int) Free traffic per month in bytes. **Warning**: This field is deprecated and will report `0` after 2024-08-05.
     *
     * @deprecated The field is deprecated and will always report 0 after 2024-08-05.
     */
    readonly includedTraffic: number;
    /**
     * (bool) Deprecation status of server type.
     */
    readonly isDeprecated: boolean;
    /**
     * (int) Memory a Server of this type will have in GB.
     */
    readonly memory: number;
    /**
     * (string) Name of the server_type.
     */
    readonly name: string;
    readonly storageType: string;
    /**
     * (Optional, string) Date when the server type will not be available for new servers. Only set when the server type is deprecated.
     */
    readonly unavailableAfter: string;
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
 *     name: "cx22",
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
     * (Optional, string) Date when the deprecation of the server type was announced. Only set when the server type is deprecated.
     */
    deprecationAnnounced?: pulumi.Input<string>;
    /**
     * ID of the server_type.
     */
    id?: pulumi.Input<number>;
    /**
     * Name of the server_type.
     */
    name?: pulumi.Input<string>;
    /**
     * (Optional, string) Date when the server type will not be available for new servers. Only set when the server type is deprecated.
     */
    unavailableAfter?: pulumi.Input<string>;
}
