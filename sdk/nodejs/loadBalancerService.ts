// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Define services for Hetzner Cloud Load Balancers.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as hcloud from "@pulumi/hcloud";
 *
 * const loadBalancer = new hcloud.LoadBalancer("load_balancer", {
 *     name: "my-load-balancer",
 *     loadBalancerType: "lb11",
 *     location: "nbg1",
 * });
 * const loadBalancerService = new hcloud.LoadBalancerService("load_balancer_service", {
 *     loadBalancerId: loadBalancer.id,
 *     protocol: "http",
 *     http: {
 *         stickySessions: true,
 *         cookieName: "EXAMPLE_STICKY",
 *     },
 *     healthCheck: {
 *         protocol: "http",
 *         port: 80,
 *         interval: 10,
 *         timeout: 5,
 *         http: {
 *             domain: "example.com",
 *             path: "/healthz",
 *             response: "OK",
 *             tls: true,
 *             statusCodes: ["200"],
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Load Balancer Service entries can be imported using a compound ID with the following format:
 *
 * `<load-balancer-id>__<listen-port>`
 *
 * ```sh
 * $ pulumi import hcloud:index/loadBalancerService:LoadBalancerService myloadbalancernetwork 123__80
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
     * Health Check configuration when `protocol` is `http` or `https`.
     */
    public readonly healthCheck!: pulumi.Output<outputs.LoadBalancerServiceHealthCheck>;
    /**
     * HTTP configuration when `protocol` is `http` or `https`.
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerServiceState | undefined;
            resourceInputs["destinationPort"] = state ? state.destinationPort : undefined;
            resourceInputs["healthCheck"] = state ? state.healthCheck : undefined;
            resourceInputs["http"] = state ? state.http : undefined;
            resourceInputs["listenPort"] = state ? state.listenPort : undefined;
            resourceInputs["loadBalancerId"] = state ? state.loadBalancerId : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["proxyprotocol"] = state ? state.proxyprotocol : undefined;
        } else {
            const args = argsOrState as LoadBalancerServiceArgs | undefined;
            if ((!args || args.loadBalancerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadBalancerId'");
            }
            if ((!args || args.protocol === undefined) && !opts.urn) {
                throw new Error("Missing required property 'protocol'");
            }
            resourceInputs["destinationPort"] = args ? args.destinationPort : undefined;
            resourceInputs["healthCheck"] = args ? args.healthCheck : undefined;
            resourceInputs["http"] = args ? args.http : undefined;
            resourceInputs["listenPort"] = args ? args.listenPort : undefined;
            resourceInputs["loadBalancerId"] = args ? args.loadBalancerId : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["proxyprotocol"] = args ? args.proxyprotocol : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadBalancerService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancerService resources.
 */
export interface LoadBalancerServiceState {
    /**
     * Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
     */
    destinationPort?: pulumi.Input<number>;
    /**
     * Health Check configuration when `protocol` is `http` or `https`.
     */
    healthCheck?: pulumi.Input<inputs.LoadBalancerServiceHealthCheck>;
    /**
     * HTTP configuration when `protocol` is `http` or `https`.
     */
    http?: pulumi.Input<inputs.LoadBalancerServiceHttp>;
    /**
     * Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     */
    listenPort?: pulumi.Input<number>;
    /**
     * Id of the load balancer this service belongs to.
     */
    loadBalancerId?: pulumi.Input<string>;
    /**
     * Protocol of the service. `http`, `https` or `tcp`
     */
    protocol?: pulumi.Input<string>;
    /**
     * Enable proxyprotocol.
     */
    proxyprotocol?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a LoadBalancerService resource.
 */
export interface LoadBalancerServiceArgs {
    /**
     * Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
     */
    destinationPort?: pulumi.Input<number>;
    /**
     * Health Check configuration when `protocol` is `http` or `https`.
     */
    healthCheck?: pulumi.Input<inputs.LoadBalancerServiceHealthCheck>;
    /**
     * HTTP configuration when `protocol` is `http` or `https`.
     */
    http?: pulumi.Input<inputs.LoadBalancerServiceHttp>;
    /**
     * Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     */
    listenPort?: pulumi.Input<number>;
    /**
     * Id of the load balancer this service belongs to.
     */
    loadBalancerId: pulumi.Input<string>;
    /**
     * Protocol of the service. `http`, `https` or `tcp`
     */
    protocol: pulumi.Input<string>;
    /**
     * Enable proxyprotocol.
     */
    proxyprotocol?: pulumi.Input<boolean>;
}
