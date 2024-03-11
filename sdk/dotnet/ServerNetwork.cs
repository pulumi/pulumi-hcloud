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
    /// Provides a Hetzner Cloud Server Network to represent a private network on a server in the Hetzner Cloud.
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
    ///     var node1 = new HCloud.Server("node1", new()
    ///     {
    ///         Image = "debian-11",
    ///         ServerType = "cx11",
    ///     });
    /// 
    ///     var mynet = new HCloud.Network("mynet", new()
    ///     {
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
    ///     var srvnetwork = new HCloud.ServerNetwork("srvnetwork", new()
    ///     {
    ///         ServerId = node1.Id,
    ///         NetworkId = mynet.Id,
    ///         Ip = "10.0.1.5",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Server Network entries can be imported using a compound ID with the following format:
    /// 
    /// `&lt;server-id&gt;-&lt;network-id&gt;`
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/serverNetwork:ServerNetwork myservernetwork 123-654
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/serverNetwork:ServerNetwork")]
    public partial class ServerNetwork : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Additional IPs to be assigned
        /// to this server.
        /// </summary>
        [Output("aliasIps")]
        public Output<ImmutableArray<string>> AliasIps { get; private set; } = null!;

        /// <summary>
        /// IP to request to be assigned to this server.
        /// If you do not provide this then you will be auto assigned an IP
        /// address.
        /// </summary>
        [Output("ip")]
        public Output<string> Ip { get; private set; } = null!;

        [Output("macAddress")]
        public Output<string> MacAddress { get; private set; } = null!;

        /// <summary>
        /// ID of the network which should be added
        /// to the server. Required if `subnet_id` is not set. Successful creation
        /// of the resource depends on the existence of a subnet in the Hetzner
        /// Cloud Backend. Using `network_id` will not create an explicit
        /// dependency between server and subnet. Therefore `depends_on` may need
        /// to be used. Alternatively the `subnet_id` property can be used, which
        /// will create an explicit dependency between `hcloud.ServerNetwork` and
        /// the existence of a subnet.
        /// </summary>
        [Output("networkId")]
        public Output<int?> NetworkId { get; private set; } = null!;

        /// <summary>
        /// ID of the server.
        /// </summary>
        [Output("serverId")]
        public Output<int> ServerId { get; private set; } = null!;

        /// <summary>
        /// ID of the sub-network which should be
        /// added to the Server. Required if `network_id` is not set.
        /// *Note*: if the `ip` property is missing, the Server is currently added
        /// to the last created subnet.
        /// </summary>
        [Output("subnetId")]
        public Output<string?> SubnetId { get; private set; } = null!;


        /// <summary>
        /// Create a ServerNetwork resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerNetwork(string name, ServerNetworkArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/serverNetwork:ServerNetwork", name, args ?? new ServerNetworkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServerNetwork(string name, Input<string> id, ServerNetworkState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/serverNetwork:ServerNetwork", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServerNetwork resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServerNetwork Get(string name, Input<string> id, ServerNetworkState? state = null, CustomResourceOptions? options = null)
        {
            return new ServerNetwork(name, id, state, options);
        }
    }

    public sealed class ServerNetworkArgs : global::Pulumi.ResourceArgs
    {
        [Input("aliasIps")]
        private InputList<string>? _aliasIps;

        /// <summary>
        /// Additional IPs to be assigned
        /// to this server.
        /// </summary>
        public InputList<string> AliasIps
        {
            get => _aliasIps ?? (_aliasIps = new InputList<string>());
            set => _aliasIps = value;
        }

        /// <summary>
        /// IP to request to be assigned to this server.
        /// If you do not provide this then you will be auto assigned an IP
        /// address.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// ID of the network which should be added
        /// to the server. Required if `subnet_id` is not set. Successful creation
        /// of the resource depends on the existence of a subnet in the Hetzner
        /// Cloud Backend. Using `network_id` will not create an explicit
        /// dependency between server and subnet. Therefore `depends_on` may need
        /// to be used. Alternatively the `subnet_id` property can be used, which
        /// will create an explicit dependency between `hcloud.ServerNetwork` and
        /// the existence of a subnet.
        /// </summary>
        [Input("networkId")]
        public Input<int>? NetworkId { get; set; }

        /// <summary>
        /// ID of the server.
        /// </summary>
        [Input("serverId", required: true)]
        public Input<int> ServerId { get; set; } = null!;

        /// <summary>
        /// ID of the sub-network which should be
        /// added to the Server. Required if `network_id` is not set.
        /// *Note*: if the `ip` property is missing, the Server is currently added
        /// to the last created subnet.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        public ServerNetworkArgs()
        {
        }
        public static new ServerNetworkArgs Empty => new ServerNetworkArgs();
    }

    public sealed class ServerNetworkState : global::Pulumi.ResourceArgs
    {
        [Input("aliasIps")]
        private InputList<string>? _aliasIps;

        /// <summary>
        /// Additional IPs to be assigned
        /// to this server.
        /// </summary>
        public InputList<string> AliasIps
        {
            get => _aliasIps ?? (_aliasIps = new InputList<string>());
            set => _aliasIps = value;
        }

        /// <summary>
        /// IP to request to be assigned to this server.
        /// If you do not provide this then you will be auto assigned an IP
        /// address.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        [Input("macAddress")]
        public Input<string>? MacAddress { get; set; }

        /// <summary>
        /// ID of the network which should be added
        /// to the server. Required if `subnet_id` is not set. Successful creation
        /// of the resource depends on the existence of a subnet in the Hetzner
        /// Cloud Backend. Using `network_id` will not create an explicit
        /// dependency between server and subnet. Therefore `depends_on` may need
        /// to be used. Alternatively the `subnet_id` property can be used, which
        /// will create an explicit dependency between `hcloud.ServerNetwork` and
        /// the existence of a subnet.
        /// </summary>
        [Input("networkId")]
        public Input<int>? NetworkId { get; set; }

        /// <summary>
        /// ID of the server.
        /// </summary>
        [Input("serverId")]
        public Input<int>? ServerId { get; set; }

        /// <summary>
        /// ID of the sub-network which should be
        /// added to the Server. Required if `network_id` is not set.
        /// *Note*: if the `ip` property is missing, the Server is currently added
        /// to the last created subnet.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        public ServerNetworkState()
        {
        }
        public static new ServerNetworkState Empty => new ServerNetworkState();
    }
}
