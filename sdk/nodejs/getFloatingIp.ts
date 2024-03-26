// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides details about a Hetzner Cloud Floating IP.
 *
 * This resource can be useful when you need to determine a Floating IP ID based on the IP address.
 *
 * ## Example Usage
 *
 * # Data Source: hcloud.FloatingIp
 * Provides details about a Hetzner Cloud Floating IP.
 * This resource can be useful when you need to determine a Floating IP ID based on the IP address.
 *
 * ### Additional Examples
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const ip1 = hcloud.getFloatingIp({
 *     ipAddress: "1.2.3.4",
 * });
 * const ip2 = hcloud.getFloatingIp({
 *     withSelector: "key=value",
 * });
 * const main: hcloud.FloatingIpAssignment[] = [];
 * for (const range = {value: 0}; range.value < _var.counter; range.value++) {
 *     main.push(new hcloud.FloatingIpAssignment(`main-${range.value}`, {
 *         floatingIpId: ip1.then(ip1 => ip1.id),
 *         serverId: hcloud_server.main.id,
 *     }));
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFloatingIp(args?: GetFloatingIpArgs, opts?: pulumi.InvokeOptions): Promise<GetFloatingIpResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getFloatingIp:getFloatingIp", {
        "id": args.id,
        "ipAddress": args.ipAddress,
        "name": args.name,
        "selector": args.selector,
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getFloatingIp.
 */
export interface GetFloatingIpArgs {
    /**
     * ID of the Floating IP.
     */
    id?: number;
    /**
     * IP address of the Floating IP.
     */
    ipAddress?: string;
    /**
     * Name of the Floating IP.
     */
    name?: string;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    selector?: string;
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: string;
}

/**
 * A collection of values returned by getFloatingIp.
 */
export interface GetFloatingIpResult {
    /**
     * (bool) Whether delete protection is enabled.
     */
    readonly deleteProtection: boolean;
    /**
     * (string) Description of the Floating IP.
     */
    readonly description: string;
    /**
     * (string) Home location.
     */
    readonly homeLocation: string;
    /**
     * (int) Unique ID of the Floating IP.
     */
    readonly id: number;
    /**
     * (string) IP Address of the Floating IP.
     */
    readonly ipAddress: string;
    /**
     * (string) IPv6 subnet. (Only set if `type` is `ipv6`)
     */
    readonly ipNetwork: string;
    /**
     * (map) User-defined labels (key-value pairs).
     */
    readonly labels: {[key: string]: any};
    /**
     * (string) Name of the Floating IP.
     */
    readonly name?: string;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    readonly selector?: string;
    /**
     * (int) Server to assign the Floating IP is assigned to.
     */
    readonly serverId: number;
    /**
     * (string) Type of the Floating IP.
     */
    readonly type: string;
    readonly withSelector?: string;
}
/**
 * Provides details about a Hetzner Cloud Floating IP.
 *
 * This resource can be useful when you need to determine a Floating IP ID based on the IP address.
 *
 * ## Example Usage
 *
 * # Data Source: hcloud.FloatingIp
 * Provides details about a Hetzner Cloud Floating IP.
 * This resource can be useful when you need to determine a Floating IP ID based on the IP address.
 *
 * ### Additional Examples
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const ip1 = hcloud.getFloatingIp({
 *     ipAddress: "1.2.3.4",
 * });
 * const ip2 = hcloud.getFloatingIp({
 *     withSelector: "key=value",
 * });
 * const main: hcloud.FloatingIpAssignment[] = [];
 * for (const range = {value: 0}; range.value < _var.counter; range.value++) {
 *     main.push(new hcloud.FloatingIpAssignment(`main-${range.value}`, {
 *         floatingIpId: ip1.then(ip1 => ip1.id),
 *         serverId: hcloud_server.main.id,
 *     }));
 * }
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFloatingIpOutput(args?: GetFloatingIpOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFloatingIpResult> {
    return pulumi.output(args).apply((a: any) => getFloatingIp(a, opts))
}

/**
 * A collection of arguments for invoking getFloatingIp.
 */
export interface GetFloatingIpOutputArgs {
    /**
     * ID of the Floating IP.
     */
    id?: pulumi.Input<number>;
    /**
     * IP address of the Floating IP.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * Name of the Floating IP.
     */
    name?: pulumi.Input<string>;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    selector?: pulumi.Input<string>;
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: pulumi.Input<string>;
}
