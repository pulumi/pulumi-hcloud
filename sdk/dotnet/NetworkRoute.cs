// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    /// <summary>
    /// Provides a Hetzner Cloud Network Route to represent a Network route in the Hetzner Cloud.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var mynet = new HCloud.Network("mynet", new()
    ///     {
    ///         IpRange = "10.0.0.0/8",
    ///     });
    /// 
    ///     var privNet = new HCloud.NetworkRoute("privNet", new()
    ///     {
    ///         NetworkId = mynet.Id,
    ///         Destination = "10.100.1.0/24",
    ///         Gateway = "10.0.1.1",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Network Route entries can be imported using a compound ID with the following format:
    /// 
    /// `&lt;network-id&gt;-&lt;destination&gt;`
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/networkRoute:NetworkRoute myroute 123-10.0.0.0/16
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/networkRoute:NetworkRoute")]
    public partial class NetworkRoute : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
        /// </summary>
        [Output("destination")]
        public Output<string> Destination { get; private set; } = null!;

        /// <summary>
        /// Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
        /// </summary>
        [Output("gateway")]
        public Output<string> Gateway { get; private set; } = null!;

        /// <summary>
        /// ID of the Network the route should be added to.
        /// </summary>
        [Output("networkId")]
        public Output<int> NetworkId { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkRoute resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkRoute(string name, NetworkRouteArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/networkRoute:NetworkRoute", name, args ?? new NetworkRouteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkRoute(string name, Input<string> id, NetworkRouteState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/networkRoute:NetworkRoute", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing NetworkRoute resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkRoute Get(string name, Input<string> id, NetworkRouteState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkRoute(name, id, state, options);
        }
    }

    public sealed class NetworkRouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
        /// </summary>
        [Input("destination", required: true)]
        public Input<string> Destination { get; set; } = null!;

        /// <summary>
        /// Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
        /// </summary>
        [Input("gateway", required: true)]
        public Input<string> Gateway { get; set; } = null!;

        /// <summary>
        /// ID of the Network the route should be added to.
        /// </summary>
        [Input("networkId", required: true)]
        public Input<int> NetworkId { get; set; } = null!;

        public NetworkRouteArgs()
        {
        }
        public static new NetworkRouteArgs Empty => new NetworkRouteArgs();
    }

    public sealed class NetworkRouteState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
        /// </summary>
        [Input("destination")]
        public Input<string>? Destination { get; set; }

        /// <summary>
        /// Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// ID of the Network the route should be added to.
        /// </summary>
        [Input("networkId")]
        public Input<int>? NetworkId { get; set; }

        public NetworkRouteState()
        {
        }
        public static new NetworkRouteState Empty => new NetworkRouteState();
    }
}
