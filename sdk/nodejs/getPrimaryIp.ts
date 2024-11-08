// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides details about a Hetzner Cloud Primary IP.
 *
 * This resource can be useful when you need to determine a Primary IP ID based on the IP address.
 *
 * Side note:
 *
 * If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created & attached.
 * Currently, Primary IPs can be only attached to servers.
 *
 * ## Example Usage
 *
 * # Data Source: hcloud.PrimaryIp
 *
 * Provides details about a Hetzner Cloud Primary IP.
 * This resource can be useful when you need to determine a Primary IP ID based on the IP address.
 *
 * ### Additional Examples
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const ip1 = hcloud.getPrimaryIp({
 *     ipAddress: "1.2.3.4",
 * });
 * const ip2 = hcloud.getPrimaryIp({
 *     name: "primary_ip_1",
 * });
 * const ip3 = hcloud.getPrimaryIp({
 *     withSelector: "key=value",
 * });
 * // Link a server to an existing primary IP
 * const serverTest = new hcloud.Server("server_test", {
 *     name: "test-server",
 *     image: "ubuntu-20.04",
 *     serverType: "cx22",
 *     datacenter: "fsn1-dc14",
 *     labels: {
 *         test: "tessst1",
 *     },
 *     publicNets: [{
 *         ipv4: ip1HcloudPrimaryIp.id,
 *     }],
 * });
 * ```
 */
export function getPrimaryIp(args?: GetPrimaryIpArgs, opts?: pulumi.InvokeOptions): Promise<GetPrimaryIpResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getPrimaryIp:getPrimaryIp", {
        "assigneeId": args.assigneeId,
        "id": args.id,
        "ipAddress": args.ipAddress,
        "name": args.name,
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrimaryIp.
 */
export interface GetPrimaryIpArgs {
    /**
     * (int) ID of the assigned resource.
     */
    assigneeId?: number;
    /**
     * ID of the Primary IP.
     */
    id?: number;
    /**
     * IP address of the Primary IP.
     */
    ipAddress?: string;
    /**
     * Name of the Primary IP.
     */
    name?: string;
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: string;
}

/**
 * A collection of values returned by getPrimaryIp.
 */
export interface GetPrimaryIpResult {
    /**
     * (int) ID of the assigned resource.
     */
    readonly assigneeId: number;
    /**
     * (string) The type of the assigned resource.
     */
    readonly assigneeType: string;
    /**
     * (bool) Whether auto delete is enabled.
     */
    readonly autoDelete: boolean;
    /**
     * (string) The datacenter name of the Primary IP. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-datacenters-are-there) for more details about datacenters.
     */
    readonly datacenter: string;
    /**
     * (bool) Whether delete protection is enabled.
     */
    readonly deleteProtection: boolean;
    /**
     * (int) Unique ID of the Primary IP.
     */
    readonly id: number;
    /**
     * (string) IP Address of the Primary IP.
     */
    readonly ipAddress: string;
    /**
     * (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
     */
    readonly ipNetwork: string;
    /**
     * (map) User-defined labels (key-value pairs).
     */
    readonly labels: {[key: string]: string};
    /**
     * (string) Name of the Primary IP.
     */
    readonly name?: string;
    /**
     * (string) Type of the Primary IP.
     */
    readonly type: string;
    readonly withSelector?: string;
}
/**
 * Provides details about a Hetzner Cloud Primary IP.
 *
 * This resource can be useful when you need to determine a Primary IP ID based on the IP address.
 *
 * Side note:
 *
 * If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created & attached.
 * Currently, Primary IPs can be only attached to servers.
 *
 * ## Example Usage
 *
 * # Data Source: hcloud.PrimaryIp
 *
 * Provides details about a Hetzner Cloud Primary IP.
 * This resource can be useful when you need to determine a Primary IP ID based on the IP address.
 *
 * ### Additional Examples
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const ip1 = hcloud.getPrimaryIp({
 *     ipAddress: "1.2.3.4",
 * });
 * const ip2 = hcloud.getPrimaryIp({
 *     name: "primary_ip_1",
 * });
 * const ip3 = hcloud.getPrimaryIp({
 *     withSelector: "key=value",
 * });
 * // Link a server to an existing primary IP
 * const serverTest = new hcloud.Server("server_test", {
 *     name: "test-server",
 *     image: "ubuntu-20.04",
 *     serverType: "cx22",
 *     datacenter: "fsn1-dc14",
 *     labels: {
 *         test: "tessst1",
 *     },
 *     publicNets: [{
 *         ipv4: ip1HcloudPrimaryIp.id,
 *     }],
 * });
 * ```
 */
export function getPrimaryIpOutput(args?: GetPrimaryIpOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrimaryIpResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("hcloud:index/getPrimaryIp:getPrimaryIp", {
        "assigneeId": args.assigneeId,
        "id": args.id,
        "ipAddress": args.ipAddress,
        "name": args.name,
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrimaryIp.
 */
export interface GetPrimaryIpOutputArgs {
    /**
     * (int) ID of the assigned resource.
     */
    assigneeId?: pulumi.Input<number>;
    /**
     * ID of the Primary IP.
     */
    id?: pulumi.Input<number>;
    /**
     * IP address of the Primary IP.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * Name of the Primary IP.
     */
    name?: pulumi.Input<string>;
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: pulumi.Input<string>;
}
