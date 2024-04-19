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
    /// Provides a Hetzner Cloud Floating IP to represent a publicly-accessible static IP address that can be mapped to one of your servers.
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
    ///         Name = "node1",
    ///         Image = "debian-11",
    ///         ServerType = "cx11",
    ///     });
    /// 
    ///     var master = new HCloud.FloatingIp("master", new()
    ///     {
    ///         Type = "ipv4",
    ///         ServerId = node1.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Floating IPs can be imported using its `id`:
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/floatingIp:FloatingIp myip id
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/floatingIp:FloatingIp")]
    public partial class FloatingIp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
        /// </summary>
        [Output("deleteProtection")]
        public Output<bool?> DeleteProtection { get; private set; } = null!;

        /// <summary>
        /// Description of the Floating IP.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of home location (routing is optimized for that location). Optional if server_id argument is passed.
        /// </summary>
        [Output("homeLocation")]
        public Output<string> HomeLocation { get; private set; } = null!;

        /// <summary>
        /// (string) IP Address of the Floating IP.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// (string) IPv6 subnet. (Only set if `type` is `ipv6`)
        /// </summary>
        [Output("ipNetwork")]
        public Output<string> IpNetwork { get; private set; } = null!;

        /// <summary>
        /// User-defined labels (key-value pairs) should be created with.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Name of the Floating IP.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Server to assign the Floating IP to.
        /// </summary>
        [Output("serverId")]
        public Output<int> ServerId { get; private set; } = null!;

        /// <summary>
        /// Type of the Floating IP. `ipv4` `ipv6`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a FloatingIp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FloatingIp(string name, FloatingIpArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/floatingIp:FloatingIp", name, args ?? new FloatingIpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FloatingIp(string name, Input<string> id, FloatingIpState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/floatingIp:FloatingIp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FloatingIp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FloatingIp Get(string name, Input<string> id, FloatingIpState? state = null, CustomResourceOptions? options = null)
        {
            return new FloatingIp(name, id, state, options);
        }
    }

    public sealed class FloatingIpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
        /// </summary>
        [Input("deleteProtection")]
        public Input<bool>? DeleteProtection { get; set; }

        /// <summary>
        /// Description of the Floating IP.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of home location (routing is optimized for that location). Optional if server_id argument is passed.
        /// </summary>
        [Input("homeLocation")]
        public Input<string>? HomeLocation { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// User-defined labels (key-value pairs) should be created with.
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the Floating IP.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Server to assign the Floating IP to.
        /// </summary>
        [Input("serverId")]
        public Input<int>? ServerId { get; set; }

        /// <summary>
        /// Type of the Floating IP. `ipv4` `ipv6`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public FloatingIpArgs()
        {
        }
        public static new FloatingIpArgs Empty => new FloatingIpArgs();
    }

    public sealed class FloatingIpState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
        /// </summary>
        [Input("deleteProtection")]
        public Input<bool>? DeleteProtection { get; set; }

        /// <summary>
        /// Description of the Floating IP.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of home location (routing is optimized for that location). Optional if server_id argument is passed.
        /// </summary>
        [Input("homeLocation")]
        public Input<string>? HomeLocation { get; set; }

        /// <summary>
        /// (string) IP Address of the Floating IP.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// (string) IPv6 subnet. (Only set if `type` is `ipv6`)
        /// </summary>
        [Input("ipNetwork")]
        public Input<string>? IpNetwork { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// User-defined labels (key-value pairs) should be created with.
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the Floating IP.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Server to assign the Floating IP to.
        /// </summary>
        [Input("serverId")]
        public Input<int>? ServerId { get; set; }

        /// <summary>
        /// Type of the Floating IP. `ipv4` `ipv6`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public FloatingIpState()
        {
        }
        public static new FloatingIpState Empty => new FloatingIpState();
    }
}
