// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("hcloud");

/**
 * The Hetzner Cloud API endpoint, can be used to override the default API Endpoint https://api.hetzner.cloud/v1.
 */
export declare const endpoint: string | undefined;
Object.defineProperty(exports, "endpoint", {
    get() {
        return __config.get("endpoint");
    },
    enumerable: true,
});

/**
 * The type of function to be used during the polling.
 */
export declare const pollFunction: string | undefined;
Object.defineProperty(exports, "pollFunction", {
    get() {
        return __config.get("pollFunction");
    },
    enumerable: true,
});

/**
 * The interval at which actions are polled by the client. Default `500ms`. Increase this interval if you run into rate
 * limiting errors.
 */
export declare const pollInterval: string | undefined;
Object.defineProperty(exports, "pollInterval", {
    get() {
        return __config.get("pollInterval");
    },
    enumerable: true,
});

/**
 * The Hetzner Cloud API token, can also be specified with the HCLOUD_TOKEN environment variable.
 */
export declare const token: string | undefined;
Object.defineProperty(exports, "token", {
    get() {
        return __config.get("token");
    },
    enumerable: true,
});

