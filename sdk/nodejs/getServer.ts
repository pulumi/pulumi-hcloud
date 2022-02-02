// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getServer(args?: GetServerArgs, opts?: pulumi.InvokeOptions): Promise<GetServerResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("hcloud:index/getServer:getServer", {
        "id": args.id,
        "name": args.name,
        "placementGroupId": args.placementGroupId,
        "selector": args.selector,
        "withSelector": args.withSelector,
        "withStatuses": args.withStatuses,
    }, opts);
}

/**
 * A collection of arguments for invoking getServer.
 */
export interface GetServerArgs {
    /**
     * ID of the server.
     */
    id?: number;
    /**
     * Name of the server.
     */
    name?: string;
    /**
     * (Optional, string) Placement Group ID the server is assigned to.
     */
    placementGroupId?: number;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    selector?: string;
    /**
     * Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     */
    withSelector?: string;
    /**
     * List only servers with the specified status, could contain `initializing`, `starting`, `running`, `stopping`, `off`, `deleting`, `rebuilding`, `migrating`, `unknown`.
     */
    withStatuses?: string[];
}

/**
 * A collection of values returned by getServer.
 */
export interface GetServerResult {
    /**
     * (string) The backup window of the server, if enabled.
     */
    readonly backupWindow: string;
    /**
     * (boolean) Whether backups are enabled.
     */
    readonly backups: boolean;
    /**
     * (string) The datacenter name.
     */
    readonly datacenter: string;
    /**
     * (boolean) Whether delete protection is enabled.
     */
    readonly deleteProtection: boolean;
    /**
     * (Optional, list) Firewall IDs the server is attached to.
     */
    readonly firewallIds: number[];
    /**
     * (int) Unique ID of the server.
     */
    readonly id: number;
    /**
     * (string) Name or ID of the image the server was created from.
     */
    readonly image: string;
    /**
     * (string) The IPv4 address.
     */
    readonly ipv4Address: string;
    /**
     * (string) The first IPv6 address of the assigned network.
     */
    readonly ipv6Address: string;
    /**
     * (string) The IPv6 network.
     */
    readonly ipv6Network: string;
    /**
     * (string) ID or Name of the mounted ISO image.
     */
    readonly iso: string;
    /**
     * (map) User-defined labels (key-value pairs)
     */
    readonly labels: {[key: string]: any};
    /**
     * (string) The location name.
     */
    readonly location: string;
    /**
     * (string) Name of the server.
     */
    readonly name: string;
    /**
     * (Optional, string) Placement Group ID the server is assigned to.
     */
    readonly placementGroupId?: number;
    /**
     * (boolean) Whether rebuild protection is enabled.
     */
    readonly rebuildProtection: boolean;
    readonly rescue: string;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    readonly selector?: string;
    /**
     * (string) Name of the server type.
     */
    readonly serverType: string;
    /**
     * (string) The status of the server.
     */
    readonly status: string;
    readonly withSelector?: string;
    readonly withStatuses?: string[];
}

export function getServerOutput(args?: GetServerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServerResult> {
    return pulumi.output(args).apply(a => getServer(a, opts))
}

/**
 * A collection of arguments for invoking getServer.
 */
export interface GetServerOutputArgs {
    /**
     * ID of the server.
     */
    id?: pulumi.Input<number>;
    /**
     * Name of the server.
     */
    name?: pulumi.Input<string>;
    /**
     * (Optional, string) Placement Group ID the server is assigned to.
     */
    placementGroupId?: pulumi.Input<number>;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    selector?: pulumi.Input<string>;
    /**
     * Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     */
    withSelector?: pulumi.Input<string>;
    /**
     * List only servers with the specified status, could contain `initializing`, `starting`, `running`, `stopping`, `off`, `deleting`, `rebuilding`, `migrating`, `unknown`.
     */
    withStatuses?: pulumi.Input<pulumi.Input<string>[]>;
}
