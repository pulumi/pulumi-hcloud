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
    /// Adds a target to a Hetzner Cloud Load Balancer.
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
    ///     var myServer = new HCloud.Server("my_server", new()
    ///     {
    ///         Name = "my-server",
    ///         ServerType = "cx22",
    ///         Image = "ubuntu-18.04",
    ///     });
    /// 
    ///     var loadBalancer = new HCloud.LoadBalancer("load_balancer", new()
    ///     {
    ///         Name = "my-load-balancer",
    ///         LoadBalancerType = "lb11",
    ///         Location = "nbg1",
    ///     });
    /// 
    ///     var loadBalancerTarget = new HCloud.LoadBalancerTarget("load_balancer_target", new()
    ///     {
    ///         Type = "server",
    ///         LoadBalancerId = loadBalancer.Id,
    ///         ServerId = myServer.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Load Balancer Target entries can be imported using a compound ID with the following format:
    /// 
    /// `&lt;load-balancer-id&gt;__&lt;type&gt;__&lt;identifier&gt;`
    /// 
    /// Where *identifier* depends on the *type*:
    /// 
    /// - `server`: server id, for example: `123`
    /// 
    /// - `label_selector`: label selector, for example: `foo=bar`
    /// 
    /// - `ip`: ip address, for example: `203.0.113.123`
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalancerservertarget 123__server__321
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalancerlabeltarget 123__label_selector__foo=bar
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalanceriptarget 123__ip__203.0.113.123
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/loadBalancerTarget:LoadBalancerTarget")]
    public partial class LoadBalancerTarget : global::Pulumi.CustomResource
    {
        /// <summary>
        /// IP address for an IP Target. Required if
        /// `type` is `ip`.
        /// </summary>
        [Output("ip")]
        public Output<string?> Ip { get; private set; } = null!;

        /// <summary>
        /// Label Selector selecting targets
        /// for this Load Balancer. Required if `type` is `label_selector`.
        /// </summary>
        [Output("labelSelector")]
        public Output<string?> LabelSelector { get; private set; } = null!;

        /// <summary>
        /// ID of the Load Balancer to which
        /// the target gets attached.
        /// </summary>
        [Output("loadBalancerId")]
        public Output<int> LoadBalancerId { get; private set; } = null!;

        /// <summary>
        /// ID of the server which should be a
        /// target for this Load Balancer. Required if `type` is `server`
        /// </summary>
        [Output("serverId")]
        public Output<int?> ServerId { get; private set; } = null!;

        /// <summary>
        /// Type of the target. Possible values
        /// `server`, `label_selector`, `ip`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// use the private IP to connect to
        /// Load Balancer targets. Only allowed if type is `server` or
        /// `label_selector`.
        /// </summary>
        [Output("usePrivateIp")]
        public Output<bool> UsePrivateIp { get; private set; } = null!;


        /// <summary>
        /// Create a LoadBalancerTarget resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadBalancerTarget(string name, LoadBalancerTargetArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/loadBalancerTarget:LoadBalancerTarget", name, args ?? new LoadBalancerTargetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadBalancerTarget(string name, Input<string> id, LoadBalancerTargetState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/loadBalancerTarget:LoadBalancerTarget", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LoadBalancerTarget resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadBalancerTarget Get(string name, Input<string> id, LoadBalancerTargetState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadBalancerTarget(name, id, state, options);
        }
    }

    public sealed class LoadBalancerTargetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IP address for an IP Target. Required if
        /// `type` is `ip`.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// Label Selector selecting targets
        /// for this Load Balancer. Required if `type` is `label_selector`.
        /// </summary>
        [Input("labelSelector")]
        public Input<string>? LabelSelector { get; set; }

        /// <summary>
        /// ID of the Load Balancer to which
        /// the target gets attached.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public Input<int> LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// ID of the server which should be a
        /// target for this Load Balancer. Required if `type` is `server`
        /// </summary>
        [Input("serverId")]
        public Input<int>? ServerId { get; set; }

        /// <summary>
        /// Type of the target. Possible values
        /// `server`, `label_selector`, `ip`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// use the private IP to connect to
        /// Load Balancer targets. Only allowed if type is `server` or
        /// `label_selector`.
        /// </summary>
        [Input("usePrivateIp")]
        public Input<bool>? UsePrivateIp { get; set; }

        public LoadBalancerTargetArgs()
        {
        }
        public static new LoadBalancerTargetArgs Empty => new LoadBalancerTargetArgs();
    }

    public sealed class LoadBalancerTargetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IP address for an IP Target. Required if
        /// `type` is `ip`.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// Label Selector selecting targets
        /// for this Load Balancer. Required if `type` is `label_selector`.
        /// </summary>
        [Input("labelSelector")]
        public Input<string>? LabelSelector { get; set; }

        /// <summary>
        /// ID of the Load Balancer to which
        /// the target gets attached.
        /// </summary>
        [Input("loadBalancerId")]
        public Input<int>? LoadBalancerId { get; set; }

        /// <summary>
        /// ID of the server which should be a
        /// target for this Load Balancer. Required if `type` is `server`
        /// </summary>
        [Input("serverId")]
        public Input<int>? ServerId { get; set; }

        /// <summary>
        /// Type of the target. Possible values
        /// `server`, `label_selector`, `ip`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// use the private IP to connect to
        /// Load Balancer targets. Only allowed if type is `server` or
        /// `label_selector`.
        /// </summary>
        [Input("usePrivateIp")]
        public Input<bool>? UsePrivateIp { get; set; }

        public LoadBalancerTargetState()
        {
        }
        public static new LoadBalancerTargetState Empty => new LoadBalancerTargetState();
    }
}
