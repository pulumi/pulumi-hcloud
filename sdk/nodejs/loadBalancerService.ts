// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Define services for Hetzner Cloud Load Balancers.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const loadBalancer = new hcloud.LoadBalancer("loadBalancer", {
 *     loadBalancerType: "lb11",
 *     location: "nbg1",
 * });
 * const loadBalancerService = new hcloud.LoadBalancerService("loadBalancerService", {
 *     loadBalancerId: hcloud_load_balancer.test_load_balancer.id,
 *     protocol: "http",
 * });
 * ```
 *
 * ## Import
 *
 * Load Balancer Service entries can be imported using a compound ID with the following format`<load-balancer-id>__<listen-port>`
 *
 * ```sh
 *  $ pulumi import hcloud:index/loadBalancerService:LoadBalancerService myloadbalancernetwork 123__80
 * ```
 */
export class LoadBalancerService extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancerService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerServiceState, opts?: pulumi.CustomResourceOptions): LoadBalancerService {
        return new LoadBalancerService(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'hcloud:index/loadBalancerService:LoadBalancerService';

    /**
     * Returns true if the given object is an instance of LoadBalancerService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancerService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancerService.__pulumiType;
    }

    /**
     * Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
     */
    public readonly destinationPort!: pulumi.Output<number>;
    /**
     * List of health check configurations when `protocol` is `http` or `https`.
     */
    public readonly healthCheck!: pulumi.Output<outputs.LoadBalancerServiceHealthCheck>;
    /**
     * List of http configurations when `protocol` is `http` or `https`.
     */
    public readonly http!: pulumi.Output<outputs.LoadBalancerServiceHttp>;
    /**
     * Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     */
    public readonly listenPort!: pulumi.Output<number>;
    /**
     * Id of the load balancer this service belongs to.
     */
    public readonly loadBalancerId!: pulumi.Output<string>;
    /**
     * Protocol of the service. `http`, `https` or `tcp`
     */
    public readonly protocol!: pulumi.Output<string>;
    /**
     * Enable proxyprotocol.
     */
    public readonly proxyprotocol!: pulumi.Output<boolean>;

    /**
     * Create a LoadBalancerService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerServiceArgs | LoadBalancerServiceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as LoadBalancerServiceState | undefined;
            inputs["destinationPort"] = state ? state.destinationPort : undefined;
            inputs["healthCheck"] = state ? state.healthCheck : undefined;
            inputs["http"] = state ? state.http : undefined;
            inputs["listenPort"] = state ? state.listenPort : undefined;
            inputs["loadBalancerId"] = state ? state.loadBalancerId : undefined;
            inputs["protocol"] = state ? state.protocol : undefined;
            inputs["proxyprotocol"] = state ? state.proxyprotocol : undefined;
        } else {
            const args = argsOrState as LoadBalancerServiceArgs | undefined;
            if ((!args || args.loadBalancerId === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'loadBalancerId'");
            }
            if ((!args || args.protocol === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'protocol'");
            }
            inputs["destinationPort"] = args ? args.destinationPort : undefined;
            inputs["healthCheck"] = args ? args.healthCheck : undefined;
            inputs["http"] = args ? args.http : undefined;
            inputs["listenPort"] = args ? args.listenPort : undefined;
            inputs["loadBalancerId"] = args ? args.loadBalancerId : undefined;
            inputs["protocol"] = args ? args.protocol : undefined;
            inputs["proxyprotocol"] = args ? args.proxyprotocol : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(LoadBalancerService.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancerService resources.
 */
export interface LoadBalancerServiceState {
    /**
     * Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
     */
    readonly destinationPort?: pulumi.Input<number>;
    /**
     * List of health check configurations when `protocol` is `http` or `https`.
     */
    readonly healthCheck?: pulumi.Input<inputs.LoadBalancerServiceHealthCheck>;
    /**
     * List of http configurations when `protocol` is `http` or `https`.
     */
    readonly http?: pulumi.Input<inputs.LoadBalancerServiceHttp>;
    /**
     * Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     */
    readonly listenPort?: pulumi.Input<number>;
    /**
     * Id of the load balancer this service belongs to.
     */
    readonly loadBalancerId?: pulumi.Input<string>;
    /**
     * Protocol of the service. `http`, `https` or `tcp`
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * Enable proxyprotocol.
     */
    readonly proxyprotocol?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a LoadBalancerService resource.
 */
export interface LoadBalancerServiceArgs {
    /**
     * Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
     */
    readonly destinationPort?: pulumi.Input<number>;
    /**
     * List of health check configurations when `protocol` is `http` or `https`.
     */
    readonly healthCheck?: pulumi.Input<inputs.LoadBalancerServiceHealthCheck>;
    /**
     * List of http configurations when `protocol` is `http` or `https`.
     */
    readonly http?: pulumi.Input<inputs.LoadBalancerServiceHttp>;
    /**
     * Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     */
    readonly listenPort?: pulumi.Input<number>;
    /**
     * Id of the load balancer this service belongs to.
     */
    readonly loadBalancerId: pulumi.Input<string>;
    /**
     * Protocol of the service. `http`, `https` or `tcp`
     */
    readonly protocol: pulumi.Input<string>;
    /**
     * Enable proxyprotocol.
     */
    readonly proxyprotocol?: pulumi.Input<boolean>;
}
