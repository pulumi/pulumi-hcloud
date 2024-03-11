// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about multiple Hetzner Cloud Firewall.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const sampleFirewall1 = hcloud.getFirewalls({
 *     withSelector: "key=value",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFirewalls(args?: GetFirewallsArgs, opts?: pulumi.InvokeOptions): Promise<GetFirewallsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getFirewalls:getFirewalls", {
        "mostRecent": args.mostRecent,
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirewalls.
 */
export interface GetFirewallsArgs {
    /**
     * Sorts list by date.
     */
    mostRecent?: boolean;
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: string;
}

/**
 * A collection of values returned by getFirewalls.
 */
export interface GetFirewallsResult {
    /**
     * (list) List of all matching firewalls. See `data.hcloud_firewall` for schema.
     */
    readonly firewalls: outputs.GetFirewallsFirewall[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly mostRecent?: boolean;
    readonly withSelector?: string;
}
/**
 * Provides details about multiple Hetzner Cloud Firewall.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const sampleFirewall1 = hcloud.getFirewalls({
 *     withSelector: "key=value",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFirewallsOutput(args?: GetFirewallsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFirewallsResult> {
    return pulumi.output(args).apply((a: any) => getFirewalls(a, opts))
}

/**
 * A collection of arguments for invoking getFirewalls.
 */
export interface GetFirewallsOutputArgs {
    /**
     * Sorts list by date.
     */
    mostRecent?: pulumi.Input<boolean>;
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: pulumi.Input<string>;
}
