// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getSshKeys(args?: GetSshKeysArgs, opts?: pulumi.InvokeOptions): Promise<GetSshKeysResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("hcloud:index/getSshKeys:getSshKeys", {
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getSshKeys.
 */
export interface GetSshKeysArgs {
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: string;
}

/**
 * A collection of values returned by getSshKeys.
 */
export interface GetSshKeysResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (list) List of all matches SSH keys. See `data.hcloud_ssh_key` for schema.
     */
    readonly sshKeys: outputs.GetSshKeysSshKey[];
    readonly withSelector?: string;
}
export function getSshKeysOutput(args?: GetSshKeysOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSshKeysResult> {
    return pulumi.output(args).apply((a: any) => getSshKeys(a, opts))
}

/**
 * A collection of arguments for invoking getSshKeys.
 */
export interface GetSshKeysOutputArgs {
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    withSelector?: pulumi.Input<string>;
}
