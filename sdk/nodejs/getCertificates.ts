// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides details about multiple Hetzner Cloud Certificates.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const sampleCertificate1 = pulumi.output(hcloud.getCertificates({
 *     withSelector: "key=value",
 * }, { async: true }));
 * ```
 */
export function getCertificates(args?: GetCertificatesArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificatesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("hcloud:index/getCertificates:getCertificates", {
        "withSelector": args.withSelector,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificates.
 */
export interface GetCertificatesArgs {
    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     */
    readonly withSelector?: string;
}

/**
 * A collection of values returned by getCertificates.
 */
export interface GetCertificatesResult {
    /**
     * (list) List of all matching certificates. See `data.hcloud_certificate` for schema.
     */
    readonly certificates: outputs.GetCertificatesCertificate[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly withSelector?: string;
}