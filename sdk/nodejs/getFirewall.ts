// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about a specific Hetzner Cloud Firewall.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const sampleFirewall1 = hcloud.getFirewall({
 *     name: "sample-firewall-1",
 * });
 * const sampleFirewall2 = hcloud.getFirewall({
 *     id: 4711,
 * });
 * ```
 */
export function getFirewall(args?: GetFirewallArgs, opts?: pulumi.InvokeOptions): Promise<GetFirewallResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getFirewall:getFirewall", {
        "applyTos": args.applyTos,
        "id": args.id,
        "labels": args.labels,
        "mostRecent": args.mostRecent,
        "name": args.name,
        "rules": args.rules,
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirewall.
 */
export interface GetFirewallArgs {
    /**
     * Configuration of the Applied Resources
     */
    applyTos?: inputs.GetFirewallApplyTo[];
    /**
     * ID of the firewall.
     */
    id?: number;
    /**
     * (map) User-defined labels (key-value pairs)
     */
    labels?: {[key: string]: string};
    /**
     * Return most recent firewall if multiple are found.
     */
    mostRecent?: boolean;
    /**
     * Name of the firewall.
     */
    name?: string;
    /**
     * (string) Configuration of a Rule from this Firewall.
     */
    rules?: inputs.GetFirewallRule[];
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: string;
}

/**
 * A collection of values returned by getFirewall.
 */
export interface GetFirewallResult {
    /**
     * Configuration of the Applied Resources
     */
    readonly applyTos?: outputs.GetFirewallApplyTo[];
    /**
     * (int) Unique ID of the Firewall.
     */
    readonly id?: number;
    /**
     * (map) User-defined labels (key-value pairs)
     */
    readonly labels?: {[key: string]: string};
    readonly mostRecent?: boolean;
    /**
     * (string) Name of the Firewall.
     */
    readonly name: string;
    /**
     * (string) Configuration of a Rule from this Firewall.
     */
    readonly rules?: outputs.GetFirewallRule[];
    readonly withSelector?: string;
}
/**
 * Provides details about a specific Hetzner Cloud Firewall.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const sampleFirewall1 = hcloud.getFirewall({
 *     name: "sample-firewall-1",
 * });
 * const sampleFirewall2 = hcloud.getFirewall({
 *     id: 4711,
 * });
 * ```
 */
export function getFirewallOutput(args?: GetFirewallOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFirewallResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("hcloud:index/getFirewall:getFirewall", {
        "applyTos": args.applyTos,
        "id": args.id,
        "labels": args.labels,
        "mostRecent": args.mostRecent,
        "name": args.name,
        "rules": args.rules,
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirewall.
 */
export interface GetFirewallOutputArgs {
    /**
     * Configuration of the Applied Resources
     */
    applyTos?: pulumi.Input<pulumi.Input<inputs.GetFirewallApplyToArgs>[]>;
    /**
     * ID of the firewall.
     */
    id?: pulumi.Input<number>;
    /**
     * (map) User-defined labels (key-value pairs)
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Return most recent firewall if multiple are found.
     */
    mostRecent?: pulumi.Input<boolean>;
    /**
     * Name of the firewall.
     */
    name?: pulumi.Input<string>;
    /**
     * (string) Configuration of a Rule from this Firewall.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.GetFirewallRuleArgs>[]>;
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: pulumi.Input<string>;
}
