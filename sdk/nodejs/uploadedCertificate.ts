// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Upload a TLS certificate to Hetzner Cloud.
 *
 * ## Import
 *
 * Uploaded certificates can be imported using their `id`hcl
 *
 * ```sh
 *  $ pulumi import hcloud:index/uploadedCertificate:UploadedCertificate sample_certificate <id>
 * ```
 */
export class UploadedCertificate extends pulumi.CustomResource {
    /**
     * Get an existing UploadedCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UploadedCertificateState, opts?: pulumi.CustomResourceOptions): UploadedCertificate {
        return new UploadedCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/uploadedCertificate:UploadedCertificate';

    /**
     * Returns true if the given object is an instance of UploadedCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UploadedCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UploadedCertificate.__pulumiType;
    }

    /**
     * PEM encoded TLS certificate.
     */
    public readonly certificate!: pulumi.Output<string>;
    /**
     * (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * (list) Domains and subdomains covered by the certificate.
     */
    public /*out*/ readonly domainNames!: pulumi.Output<string[]>;
    /**
     * (string) Fingerprint of the certificate.
     */
    public /*out*/ readonly fingerprint!: pulumi.Output<string>;
    /**
     * User-defined labels (key-value pairs) the
     * certificate should be created with.
     */
    public readonly labels!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Name of the Certificate.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
     */
    public /*out*/ readonly notValidAfter!: pulumi.Output<string>;
    /**
     * (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
     */
    public /*out*/ readonly notValidBefore!: pulumi.Output<string>;
    /**
     * PEM encoded private key belonging to the certificate.
     */
    public readonly privateKey!: pulumi.Output<string>;
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a UploadedCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UploadedCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UploadedCertificateArgs | UploadedCertificateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UploadedCertificateState | undefined;
            inputs["certificate"] = state ? state.certificate : undefined;
            inputs["created"] = state ? state.created : undefined;
            inputs["domainNames"] = state ? state.domainNames : undefined;
            inputs["fingerprint"] = state ? state.fingerprint : undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["notValidAfter"] = state ? state.notValidAfter : undefined;
            inputs["notValidBefore"] = state ? state.notValidBefore : undefined;
            inputs["privateKey"] = state ? state.privateKey : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as UploadedCertificateArgs | undefined;
            if ((!args || args.certificate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificate'");
            }
            if ((!args || args.privateKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'privateKey'");
            }
            inputs["certificate"] = args ? args.certificate : undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["privateKey"] = args ? args.privateKey : undefined;
            inputs["created"] = undefined /*out*/;
            inputs["domainNames"] = undefined /*out*/;
            inputs["fingerprint"] = undefined /*out*/;
            inputs["notValidAfter"] = undefined /*out*/;
            inputs["notValidBefore"] = undefined /*out*/;
            inputs["type"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(UploadedCertificate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UploadedCertificate resources.
 */
export interface UploadedCertificateState {
    /**
     * PEM encoded TLS certificate.
     */
    certificate?: pulumi.Input<string>;
    /**
     * (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
     */
    created?: pulumi.Input<string>;
    /**
     * (list) Domains and subdomains covered by the certificate.
     */
    domainNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (string) Fingerprint of the certificate.
     */
    fingerprint?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs) the
     * certificate should be created with.
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the Certificate.
     */
    name?: pulumi.Input<string>;
    /**
     * (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
     */
    notValidAfter?: pulumi.Input<string>;
    /**
     * (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
     */
    notValidBefore?: pulumi.Input<string>;
    /**
     * PEM encoded private key belonging to the certificate.
     */
    privateKey?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UploadedCertificate resource.
 */
export interface UploadedCertificateArgs {
    /**
     * PEM encoded TLS certificate.
     */
    certificate: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs) the
     * certificate should be created with.
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the Certificate.
     */
    name?: pulumi.Input<string>;
    /**
     * PEM encoded private key belonging to the certificate.
     */
    privateKey: pulumi.Input<string>;
}
