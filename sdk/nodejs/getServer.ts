// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

export function getServer(args?: GetServerArgs, opts?: pulumi.InvokeOptions): Promise<GetServerResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("hcloud:index/getServer:getServer", {
        "id": args.id,
        "name": args.name,
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
    readonly id?: number;
    /**
     * Name of the server.
     */
    readonly name?: string;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    readonly selector?: string;
    /**
     * Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     */
    readonly withSelector?: string;
    /**
     * List only servers with the specified status, could contain `initializing`, `starting`, `running`, `stopping`, `off`, `deleting`, `rebuilding`, `migrating`, `unknown`.
     */
    readonly withStatuses?: string[];
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
