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
    /// Provides a Hetzner Cloud Load Balancer Network to represent a private network on a Load Balancer in the Hetzner Cloud.
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
    ///     var lb1 = new HCloud.LoadBalancer("lb1", new()
    ///     {
    ///         LoadBalancerType = "lb11",
    ///         NetworkZone = "eu-central",
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
    ///     var srvnetwork = new HCloud.LoadBalancerNetwork("srvnetwork", new()
    ///     {
    ///         LoadBalancerId = lb1.Id,
    ///         NetworkId = mynet.Id,
    ///         Ip = "10.0.1.5",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             hcloud_network_subnet.Srvnetwork,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Load Balancer Network entries can be imported using a compound ID with the following format:
    /// 
    /// `&lt;load-balancer-id&gt;-&lt;network-id&gt;`
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/loadBalancerNetwork:LoadBalancerNetwork myloadbalancernetwork 123-654
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/loadBalancerNetwork:LoadBalancerNetwork")]
    public partial class LoadBalancerNetwork : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enable or disable the
        /// Load Balancers public interface. Default: `true`
        /// </summary>
        [Output("enablePublicInterface")]
        public Output<bool?> EnablePublicInterface { get; private set; } = null!;

        /// <summary>
        /// IP to request to be assigned to this Load
        /// Balancer. If you do not provide this then you will be auto assigned an
        /// IP address.
        /// </summary>
        [Output("ip")]
        public Output<string> Ip { get; private set; } = null!;

        /// <summary>
        /// ID of the Load Balancer.
        /// </summary>
        [Output("loadBalancerId")]
        public Output<int> LoadBalancerId { get; private set; } = null!;

        /// <summary>
        /// ID of the network which should be added
        /// to the Load Balancer. Required if `subnet_id` is not set. Successful
        /// creation of the resource depends on the existence of a subnet in the
        /// Hetzner Cloud Backend. Using `network_id` will not create an explicit
        /// dependency between the Load Balancer and the subnet. Therefore
        /// `depends_on` may need to be used. Alternatively the `subnet_id`
        /// property can be used, which will create an explicit dependency between
        /// `hcloud.LoadBalancerNetwork` and the existence of a subnet.
        /// </summary>
        [Output("networkId")]
        public Output<int?> NetworkId { get; private set; } = null!;

        /// <summary>
        /// ID of the sub-network which should be
        /// added to the Load Balancer. Required if `network_id` is not set.
        /// *Note*: if the `ip` property is missing, the Load Balancer is
        /// currently added to the last created subnet.
        /// </summary>
        [Output("subnetId")]
        public Output<string?> SubnetId { get; private set; } = null!;


        /// <summary>
        /// Create a LoadBalancerNetwork resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadBalancerNetwork(string name, LoadBalancerNetworkArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/loadBalancerNetwork:LoadBalancerNetwork", name, args ?? new LoadBalancerNetworkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadBalancerNetwork(string name, Input<string> id, LoadBalancerNetworkState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/loadBalancerNetwork:LoadBalancerNetwork", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LoadBalancerNetwork resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadBalancerNetwork Get(string name, Input<string> id, LoadBalancerNetworkState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadBalancerNetwork(name, id, state, options);
        }
    }

    public sealed class LoadBalancerNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable or disable the
        /// Load Balancers public interface. Default: `true`
        /// </summary>
        [Input("enablePublicInterface")]
        public Input<bool>? EnablePublicInterface { get; set; }

        /// <summary>
        /// IP to request to be assigned to this Load
        /// Balancer. If you do not provide this then you will be auto assigned an
        /// IP address.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// ID of the Load Balancer.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public Input<int> LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// ID of the network which should be added
        /// to the Load Balancer. Required if `subnet_id` is not set. Successful
        /// creation of the resource depends on the existence of a subnet in the
        /// Hetzner Cloud Backend. Using `network_id` will not create an explicit
        /// dependency between the Load Balancer and the subnet. Therefore
        /// `depends_on` may need to be used. Alternatively the `subnet_id`
        /// property can be used, which will create an explicit dependency between
        /// `hcloud.LoadBalancerNetwork` and the existence of a subnet.
        /// </summary>
        [Input("networkId")]
        public Input<int>? NetworkId { get; set; }

        /// <summary>
        /// ID of the sub-network which should be
        /// added to the Load Balancer. Required if `network_id` is not set.
        /// *Note*: if the `ip` property is missing, the Load Balancer is
        /// currently added to the last created subnet.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        public LoadBalancerNetworkArgs()
        {
        }
        public static new LoadBalancerNetworkArgs Empty => new LoadBalancerNetworkArgs();
    }

    public sealed class LoadBalancerNetworkState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable or disable the
        /// Load Balancers public interface. Default: `true`
        /// </summary>
        [Input("enablePublicInterface")]
        public Input<bool>? EnablePublicInterface { get; set; }

        /// <summary>
        /// IP to request to be assigned to this Load
        /// Balancer. If you do not provide this then you will be auto assigned an
        /// IP address.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// ID of the Load Balancer.
        /// </summary>
        [Input("loadBalancerId")]
        public Input<int>? LoadBalancerId { get; set; }

        /// <summary>
        /// ID of the network which should be added
        /// to the Load Balancer. Required if `subnet_id` is not set. Successful
        /// creation of the resource depends on the existence of a subnet in the
        /// Hetzner Cloud Backend. Using `network_id` will not create an explicit
        /// dependency between the Load Balancer and the subnet. Therefore
        /// `depends_on` may need to be used. Alternatively the `subnet_id`
        /// property can be used, which will create an explicit dependency between
        /// `hcloud.LoadBalancerNetwork` and the existence of a subnet.
        /// </summary>
        [Input("networkId")]
        public Input<int>? NetworkId { get; set; }

        /// <summary>
        /// ID of the sub-network which should be
        /// added to the Load Balancer. Required if `network_id` is not set.
        /// *Note*: if the `ip` property is missing, the Load Balancer is
        /// currently added to the last created subnet.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        public LoadBalancerNetworkState()
        {
        }
        public static new LoadBalancerNetworkState Empty => new LoadBalancerNetworkState();
    }
}
