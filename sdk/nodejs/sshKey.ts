// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Hetzner Cloud SSH key resource to manage SSH keys for server access.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 * import * from "fs";
 *
 * // Create a new SSH key
 * const _default = new hcloud.SshKey("default", {publicKey: fs.readFileSync("~/.ssh/id_rsa.pub")});
 * ```
 *
 * ## Import
 *
 * SSH keys can be imported using the SSH key `id`
 *
 * ```sh
 *  $ pulumi import hcloud:index/sshKey:SshKey mykey <id>
 * ```
 */
export class SshKey extends pulumi.CustomResource {
    /**
     * Get an existing SshKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SshKeyState, opts?: pulumi.CustomResourceOptions): SshKey {
        return new SshKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/sshKey:SshKey';

    /**
     * Returns true if the given object is an instance of SshKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SshKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SshKey.__pulumiType;
    }

    /**
     * (string) The fingerprint of the SSH key
     */
    public /*out*/ readonly fingerprint!: pulumi.Output<string>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    public readonly labels!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Name of the SSH key.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The public key. If this is a file, it can be read using the file interpolation function
     */
    public readonly publicKey!: pulumi.Output<string>;

    /**
     * Create a SshKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SshKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SshKeyArgs | SshKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SshKeyState | undefined;
            resourceInputs["fingerprint"] = state ? state.fingerprint : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["publicKey"] = state ? state.publicKey : undefined;
        } else {
            const args = argsOrState as SshKeyArgs | undefined;
            if ((!args || args.publicKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'publicKey'");
            }
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["publicKey"] = args ? args.publicKey : undefined;
            resourceInputs["fingerprint"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SshKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SshKey resources.
 */
export interface SshKeyState {
    /**
     * (string) The fingerprint of the SSH key
     */
    fingerprint?: pulumi.Input<string>;
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the SSH key.
     */
    name?: pulumi.Input<string>;
    /**
     * The public key. If this is a file, it can be read using the file interpolation function
     */
    publicKey?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SshKey resource.
 */
export interface SshKeyArgs {
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the SSH key.
     */
    name?: pulumi.Input<string>;
    /**
     * The public key. If this is a file, it can be read using the file interpolation function
     */
    publicKey: pulumi.Input<string>;
}
