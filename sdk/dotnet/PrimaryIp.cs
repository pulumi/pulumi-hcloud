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
    /// Provides a Hetzner Cloud Primary IP to represent a publicly-accessible static IP address that can be mapped to one of your servers.
    /// 
    /// If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created &amp; attached.
    /// Currently, Primary IPs can be only attached to servers.
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
    ///     var main = new HCloud.PrimaryIp("main", new()
    ///     {
    ///         Datacenter = "fsn1-dc14",
    ///         Type = "ipv4",
    ///         AssigneeType = "server",
    ///         AutoDelete = true,
    ///         Labels = 
    ///         {
    ///             { "hallo", "welt" },
    ///         },
    ///     });
    /// 
    ///     // Link a server to a primary IP
    ///     var serverTest = new HCloud.Server("serverTest", new()
    ///     {
    ///         Image = "ubuntu-20.04",
    ///         ServerType = "cx11",
    ///         Datacenter = "fsn1-dc14",
    ///         Labels = 
    ///         {
    ///             { "test", "tessst1" },
    ///         },
    ///         PublicNets = new[]
    ///         {
    ///             new HCloud.Inputs.ServerPublicNetArgs
    ///             {
    ///                 Ipv4 = main.Id,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Primary IPs can be imported using its `id`
    /// 
    /// ```sh
    ///  $ pulumi import hcloud:index/primaryIp:PrimaryIp myip id
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/primaryIp:PrimaryIp")]
    public partial class PrimaryIp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (int) ID of the assigned resource
        /// </summary>
        [Output("assigneeId")]
        public Output<int> AssigneeId { get; private set; } = null!;

        /// <summary>
        /// (string) The type of the assigned resource. Currently supported: `server`
        /// </summary>
        [Output("assigneeType")]
        public Output<string> AssigneeType { get; private set; } = null!;

        /// <summary>
        /// (bool) Whether auto delete is enabled.
        /// `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
        /// </summary>
        [Output("autoDelete")]
        public Output<bool> AutoDelete { get; private set; } = null!;

        /// <summary>
        /// (string, optional) The datacenter name to create the resource in.
        /// </summary>
        [Output("datacenter")]
        public Output<string> Datacenter { get; private set; } = null!;

        /// <summary>
        /// (bool) Whether delete protection is enabled.
        /// </summary>
        [Output("deleteProtection")]
        public Output<bool?> DeleteProtection { get; private set; } = null!;

        /// <summary>
        /// (string) IP Address of the Primary IP.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
        /// </summary>
        [Output("ipNetwork")]
        public Output<string> IpNetwork { get; private set; } = null!;

        /// <summary>
        /// (string) Description of the Primary IP.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>?> Labels { get; private set; } = null!;

        /// <summary>
        /// (string) Name of the Primary IP.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// (string) Type of the Primary IP. `ipv4` or `ipv6`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a PrimaryIp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrimaryIp(string name, PrimaryIpArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/primaryIp:PrimaryIp", name, args ?? new PrimaryIpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrimaryIp(string name, Input<string> id, PrimaryIpState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/primaryIp:PrimaryIp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrimaryIp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrimaryIp Get(string name, Input<string> id, PrimaryIpState? state = null, CustomResourceOptions? options = null)
        {
            return new PrimaryIp(name, id, state, options);
        }
    }

    public sealed class PrimaryIpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (int) ID of the assigned resource
        /// </summary>
        [Input("assigneeId")]
        public Input<int>? AssigneeId { get; set; }

        /// <summary>
        /// (string) The type of the assigned resource. Currently supported: `server`
        /// </summary>
        [Input("assigneeType", required: true)]
        public Input<string> AssigneeType { get; set; } = null!;

        /// <summary>
        /// (bool) Whether auto delete is enabled.
        /// `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
        /// </summary>
        [Input("autoDelete", required: true)]
        public Input<bool> AutoDelete { get; set; } = null!;

        /// <summary>
        /// (string, optional) The datacenter name to create the resource in.
        /// </summary>
        [Input("datacenter")]
        public Input<string>? Datacenter { get; set; }

        /// <summary>
        /// (bool) Whether delete protection is enabled.
        /// </summary>
        [Input("deleteProtection")]
        public Input<bool>? DeleteProtection { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// (string) Description of the Primary IP.
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// (string) Name of the Primary IP.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (string) Type of the Primary IP. `ipv4` or `ipv6`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public PrimaryIpArgs()
        {
        }
        public static new PrimaryIpArgs Empty => new PrimaryIpArgs();
    }

    public sealed class PrimaryIpState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (int) ID of the assigned resource
        /// </summary>
        [Input("assigneeId")]
        public Input<int>? AssigneeId { get; set; }

        /// <summary>
        /// (string) The type of the assigned resource. Currently supported: `server`
        /// </summary>
        [Input("assigneeType")]
        public Input<string>? AssigneeType { get; set; }

        /// <summary>
        /// (bool) Whether auto delete is enabled.
        /// `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
        /// </summary>
        [Input("autoDelete")]
        public Input<bool>? AutoDelete { get; set; }

        /// <summary>
        /// (string, optional) The datacenter name to create the resource in.
        /// </summary>
        [Input("datacenter")]
        public Input<string>? Datacenter { get; set; }

        /// <summary>
        /// (bool) Whether delete protection is enabled.
        /// </summary>
        [Input("deleteProtection")]
        public Input<bool>? DeleteProtection { get; set; }

        /// <summary>
        /// (string) IP Address of the Primary IP.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
        /// </summary>
        [Input("ipNetwork")]
        public Input<string>? IpNetwork { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// (string) Description of the Primary IP.
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// (string) Name of the Primary IP.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (string) Type of the Primary IP. `ipv4` or `ipv6`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public PrimaryIpState()
        {
        }
        public static new PrimaryIpState Empty => new PrimaryIpState();
    }
}
