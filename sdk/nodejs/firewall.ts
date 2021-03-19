// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Hetzner Cloud Firewall to represent a Firewall in the Hetzner Cloud.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const myfirewall = new hcloud.Firewall("myfirewall", {rules: [{
 *     direction: "in",
 *     protocol: "icmp",
 *     sourceIps: [
 *         "0.0.0.0/0",
 *         "::/0",
 *     ],
 * }]});
 * const node1 = new hcloud.Server("node1", {
 *     image: "debian-9",
 *     serverType: "cx11",
 *     firewallIds: [myfirewall.id],
 * });
 * ```
 *
 * ## Import
 *
 * Firewalls can be imported using its `id`
 *
 * ```sh
 *  $ pulumi import hcloud:index/firewall:Firewall myfw <id>
 * ```
 */
export class Firewall extends pulumi.CustomResource {
    /**
     * Get an existing Firewall resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirewallState, opts?: pulumi.CustomResourceOptions): Firewall {
        return new Firewall(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/firewall:Firewall';

    /**
     * Returns true if the given object is an instance of Firewall.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Firewall {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Firewall.__pulumiType;
    }

    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    public readonly labels!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Name of the Firewall.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration of a Rule from this Firewall.
     */
    public readonly rules!: pulumi.Output<outputs.FirewallRule[] | undefined>;

    /**
     * Create a Firewall resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FirewallArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FirewallArgs | FirewallState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FirewallState | undefined;
            inputs["labels"] = state ? state.labels : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as FirewallArgs | undefined;
            inputs["labels"] = args ? args.labels : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["rules"] = args ? args.rules : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Firewall.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Firewall resources.
 */
export interface FirewallState {
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the Firewall.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Configuration of a Rule from this Firewall.
     */
    readonly rules?: pulumi.Input<pulumi.Input<inputs.FirewallRule>[]>;
}

/**
 * The set of arguments for constructing a Firewall resource.
 */
export interface FirewallArgs {
    /**
     * User-defined labels (key-value pairs) should be created with.
     */
    readonly labels?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the Firewall.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Configuration of a Rule from this Firewall.
     */
    readonly rules?: pulumi.Input<pulumi.Input<inputs.FirewallRule>[]>;
}
