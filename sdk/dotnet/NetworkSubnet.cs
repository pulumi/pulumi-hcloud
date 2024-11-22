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
    /// Provides a Hetzner Cloud Network Subnet to represent a Subnet in the Hetzner Cloud.
    /// 
    /// ## Example Usage
    /// 
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
    ///         Name = "my-net",
    ///         IpRange = "10.0.0.0/8",
    ///     });
    /// 
    ///     var foonet = new HCloud.NetworkSubnet("foonet", new()
    ///     {
    ///         NetworkId = mynet.Id,
    ///         Type = "cloud",
    ///         NetworkZone = "eu-central",
    ///         IpRange = "10.0.1.0/24",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Network Subnet entries can be imported using a compound ID with the following format:
    /// 
    /// `&lt;network-id&gt;-&lt;ip_range&gt;`
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/networkSubnet:NetworkSubnet example "$NETWORK_ID-$IP_RANGE"
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/networkSubnet:NetworkSubnet")]
    public partial class NetworkSubnet : global::Pulumi.CustomResource
    {
        [Output("gateway")]
        public Output<string> Gateway { get; private set; } = null!;

        /// <summary>
        /// Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        /// </summary>
        [Output("ipRange")]
        public Output<string> IpRange { get; private set; } = null!;

        /// <summary>
        /// ID of the Network the subnet should be added to.
        /// </summary>
        [Output("networkId")]
        public Output<int> NetworkId { get; private set; } = null!;

        /// <summary>
        /// Name of network zone.
        /// </summary>
        [Output("networkZone")]
        public Output<string> NetworkZone { get; private set; } = null!;

        /// <summary>
        /// Type of subnet. `server`, `cloud` or `vswitch`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// ID of the vswitch, Required if type is `vswitch`
        /// </summary>
        [Output("vswitchId")]
        public Output<int?> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkSubnet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkSubnet(string name, NetworkSubnetArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/networkSubnet:NetworkSubnet", name, args ?? new NetworkSubnetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkSubnet(string name, Input<string> id, NetworkSubnetState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/networkSubnet:NetworkSubnet", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkSubnet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkSubnet Get(string name, Input<string> id, NetworkSubnetState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkSubnet(name, id, state, options);
        }
    }

    public sealed class NetworkSubnetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        /// </summary>
        [Input("ipRange", required: true)]
        public Input<string> IpRange { get; set; } = null!;

        /// <summary>
        /// ID of the Network the subnet should be added to.
        /// </summary>
        [Input("networkId", required: true)]
        public Input<int> NetworkId { get; set; } = null!;

        /// <summary>
        /// Name of network zone.
        /// </summary>
        [Input("networkZone", required: true)]
        public Input<string> NetworkZone { get; set; } = null!;

        /// <summary>
        /// Type of subnet. `server`, `cloud` or `vswitch`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// ID of the vswitch, Required if type is `vswitch`
        /// </summary>
        [Input("vswitchId")]
        public Input<int>? VswitchId { get; set; }

        public NetworkSubnetArgs()
        {
        }
        public static new NetworkSubnetArgs Empty => new NetworkSubnetArgs();
    }

    public sealed class NetworkSubnetState : global::Pulumi.ResourceArgs
    {
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        /// </summary>
        [Input("ipRange")]
        public Input<string>? IpRange { get; set; }

        /// <summary>
        /// ID of the Network the subnet should be added to.
        /// </summary>
        [Input("networkId")]
        public Input<int>? NetworkId { get; set; }

        /// <summary>
        /// Name of network zone.
        /// </summary>
        [Input("networkZone")]
        public Input<string>? NetworkZone { get; set; }

        /// <summary>
        /// Type of subnet. `server`, `cloud` or `vswitch`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// ID of the vswitch, Required if type is `vswitch`
        /// </summary>
        [Input("vswitchId")]
        public Input<int>? VswitchId { get; set; }

        public NetworkSubnetState()
        {
        }
        public static new NetworkSubnetState Empty => new NetworkSubnetState();
    }
}
