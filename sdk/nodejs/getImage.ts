// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getImage(args?: GetImageArgs, opts?: pulumi.InvokeOptions): Promise<GetImageResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("hcloud:index/getImage:getImage", {
        "id": args.id,
        "mostRecent": args.mostRecent,
        "name": args.name,
        "selector": args.selector,
        "withSelector": args.withSelector,
        "withStatuses": args.withStatuses,
    }, opts);
}

/**
 * A collection of arguments for invoking getImage.
 */
export interface GetImageArgs {
    /**
     * ID of the Image.
     */
    readonly id?: number;
    /**
     * If more than one result is returned, use the most recent Image.
     */
    readonly mostRecent?: boolean;
    /**
     * Name of the Image.
     */
    readonly name?: string;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    readonly selector?: string;
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    readonly withSelector?: string;
    /**
     * List only images with the specified status, could contain `creating` or `available`.
     */
    readonly withStatuses?: string[];
}

/**
 * A collection of values returned by getImage.
 */
export interface GetImageResult {
    /**
     * (string) Date when the Image was created (in ISO-8601 format).
     */
    readonly created: string;
    /**
     * (string) Point in time when the image is considered to be deprecated (in ISO-8601 format).
     */
    readonly deprecated: string;
    /**
     * (string) Description of the Image.
     */
    readonly description: string;
    /**
     * (int) Unique ID of the Image.
     */
    readonly id?: number;
    readonly labels: {[key: string]: any};
    readonly mostRecent?: boolean;
    /**
     * (string) Name of the Image, only present when the Image is of type `system`.
     */
    readonly name: string;
    /**
     * (string) Flavor of operating system contained in the image, could be `ubuntu`, `centos`, `debian`, `fedora` or `unknown`.
     */
    readonly osFlavor: string;
    /**
     * (string) Operating system version.
     */
    readonly osVersion: string;
    /**
     * (bool) Indicates that rapid deploy of the image is available.
     */
    readonly rapidDeploy: boolean;
    /**
     * @deprecated Please use the with_selector property instead.
     */
    readonly selector?: string;
    /**
     * (string) Type of the Image, could be `system`, `backup` or `snapshot`.
     */
    readonly type: string;
    readonly withSelector?: string;
    readonly withStatuses?: string[];
}
