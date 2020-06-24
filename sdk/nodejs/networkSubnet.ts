// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 *  Provides a Hetzner Cloud Network Subnet to represent a Subnet in the Hetzner Cloud.
 */
export class NetworkSubnet extends pulumi.CustomResource {
    /**
     * Get an existing NetworkSubnet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkSubnetState, opts?: pulumi.CustomResourceOptions): NetworkSubnet {
        return new NetworkSubnet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/networkSubnet:NetworkSubnet';

    /**
     * Returns true if the given object is an instance of NetworkSubnet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkSubnet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkSubnet.__pulumiType;
    }

    public /*out*/ readonly gateway!: pulumi.Output<string>;
    public readonly ipRange!: pulumi.Output<string>;
    public readonly networkId!: pulumi.Output<number>;
    public readonly networkZone!: pulumi.Output<string>;
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a NetworkSubnet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkSubnetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkSubnetArgs | NetworkSubnetState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as NetworkSubnetState | undefined;
            inputs["gateway"] = state ? state.gateway : undefined;
            inputs["ipRange"] = state ? state.ipRange : undefined;
            inputs["networkId"] = state ? state.networkId : undefined;
            inputs["networkZone"] = state ? state.networkZone : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as NetworkSubnetArgs | undefined;
            if (!args || args.ipRange === undefined) {
                throw new Error("Missing required property 'ipRange'");
            }
            if (!args || args.networkId === undefined) {
                throw new Error("Missing required property 'networkId'");
            }
            if (!args || args.networkZone === undefined) {
                throw new Error("Missing required property 'networkZone'");
            }
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            inputs["ipRange"] = args ? args.ipRange : undefined;
            inputs["networkId"] = args ? args.networkId : undefined;
            inputs["networkZone"] = args ? args.networkZone : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["gateway"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(NetworkSubnet.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkSubnet resources.
 */
export interface NetworkSubnetState {
    readonly gateway?: pulumi.Input<string>;
    readonly ipRange?: pulumi.Input<string>;
    readonly networkId?: pulumi.Input<number>;
    readonly networkZone?: pulumi.Input<string>;
    readonly type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkSubnet resource.
 */
export interface NetworkSubnetArgs {
    readonly ipRange: pulumi.Input<string>;
    readonly networkId: pulumi.Input<number>;
    readonly networkZone: pulumi.Input<string>;
    readonly type: pulumi.Input<string>;
}
