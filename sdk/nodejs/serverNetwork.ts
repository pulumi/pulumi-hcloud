// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 *  Provides a Hetzner Cloud Server Network to represent a private network on a server in the Hetzner Cloud.
 */
export class ServerNetwork extends pulumi.CustomResource {
    /**
     * Get an existing ServerNetwork resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerNetworkState, opts?: pulumi.CustomResourceOptions): ServerNetwork {
        return new ServerNetwork(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/serverNetwork:ServerNetwork';

    /**
     * Returns true if the given object is an instance of ServerNetwork.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerNetwork {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerNetwork.__pulumiType;
    }

    public readonly aliasIps!: pulumi.Output<string[] | undefined>;
    public readonly ip!: pulumi.Output<string>;
    public /*out*/ readonly macAddress!: pulumi.Output<string>;
    public readonly networkId!: pulumi.Output<number>;
    public readonly serverId!: pulumi.Output<number>;

    /**
     * Create a ServerNetwork resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerNetworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerNetworkArgs | ServerNetworkState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ServerNetworkState | undefined;
            inputs["aliasIps"] = state ? state.aliasIps : undefined;
            inputs["ip"] = state ? state.ip : undefined;
            inputs["macAddress"] = state ? state.macAddress : undefined;
            inputs["networkId"] = state ? state.networkId : undefined;
            inputs["serverId"] = state ? state.serverId : undefined;
        } else {
            const args = argsOrState as ServerNetworkArgs | undefined;
            if (!args || args.networkId === undefined) {
                throw new Error("Missing required property 'networkId'");
            }
            if (!args || args.serverId === undefined) {
                throw new Error("Missing required property 'serverId'");
            }
            inputs["aliasIps"] = args ? args.aliasIps : undefined;
            inputs["ip"] = args ? args.ip : undefined;
            inputs["networkId"] = args ? args.networkId : undefined;
            inputs["serverId"] = args ? args.serverId : undefined;
            inputs["macAddress"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ServerNetwork.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerNetwork resources.
 */
export interface ServerNetworkState {
    readonly aliasIps?: pulumi.Input<pulumi.Input<string>[]>;
    readonly ip?: pulumi.Input<string>;
    readonly macAddress?: pulumi.Input<string>;
    readonly networkId?: pulumi.Input<number>;
    readonly serverId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ServerNetwork resource.
 */
export interface ServerNetworkArgs {
    readonly aliasIps?: pulumi.Input<pulumi.Input<string>[]>;
    readonly ip?: pulumi.Input<string>;
    readonly networkId: pulumi.Input<number>;
    readonly serverId: pulumi.Input<number>;
}
