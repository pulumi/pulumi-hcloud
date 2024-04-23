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
    /// Attaches resource to a Hetzner Cloud Firewall.
    /// 
    /// *Note*: only one `hcloud.FirewallAttachment` per Firewall is allowed.
    /// Any resources that should be attached to that Firewall need to be
    /// specified in that `hcloud.FirewallAttachment`.
    /// 
    /// ## Example Usage
    /// 
    /// ### Attach Servers
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testServer = new HCloud.Server("test_server", new()
    ///     {
    ///         Name = "test-server",
    ///         ServerType = "cx11",
    ///         Image = "ubuntu-20.04",
    ///     });
    /// 
    ///     var basicFirewall = new HCloud.Firewall("basic_firewall", new()
    ///     {
    ///         Name = "basic_firewall",
    ///     });
    /// 
    ///     var fwRef = new HCloud.FirewallAttachment("fw_ref", new()
    ///     {
    ///         FirewallId = basicFirewall.Id,
    ///         ServerIds = new[]
    ///         {
    ///             testServer.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Attach Label Selectors
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testServer = new HCloud.Server("test_server", new()
    ///     {
    ///         Name = "test-server",
    ///         ServerType = "cx11",
    ///         Image = "ubuntu-20.04",
    ///         Labels = 
    ///         {
    ///             { "firewall-attachment", "test-server" },
    ///         },
    ///     });
    /// 
    ///     var basicFirewall = new HCloud.Firewall("basic_firewall", new()
    ///     {
    ///         Name = "basic_firewall",
    ///     });
    /// 
    ///     var fwRef = new HCloud.FirewallAttachment("fw_ref", new()
    ///     {
    ///         FirewallId = basicFirewall.Id,
    ///         LabelSelectors = new[]
    ///         {
    ///             "firewall-attachment=test-server",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/firewallAttachment:FirewallAttachment")]
    public partial class FirewallAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ID of the firewall the resources
        /// should be attached to.
        /// </summary>
        [Output("firewallId")]
        public Output<int> FirewallId { get; private set; } = null!;

        /// <summary>
        /// List of label selectors used to
        /// select resources to attach to the firewall.
        /// </summary>
        [Output("labelSelectors")]
        public Output<ImmutableArray<string>> LabelSelectors { get; private set; } = null!;

        /// <summary>
        /// List of Server IDs to attach to the
        /// firewall.
        /// </summary>
        [Output("serverIds")]
        public Output<ImmutableArray<int>> ServerIds { get; private set; } = null!;


        /// <summary>
        /// Create a FirewallAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirewallAttachment(string name, FirewallAttachmentArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/firewallAttachment:FirewallAttachment", name, args ?? new FirewallAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirewallAttachment(string name, Input<string> id, FirewallAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/firewallAttachment:FirewallAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FirewallAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirewallAttachment Get(string name, Input<string> id, FirewallAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new FirewallAttachment(name, id, state, options);
        }
    }

    public sealed class FirewallAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the firewall the resources
        /// should be attached to.
        /// </summary>
        [Input("firewallId", required: true)]
        public Input<int> FirewallId { get; set; } = null!;

        [Input("labelSelectors")]
        private InputList<string>? _labelSelectors;

        /// <summary>
        /// List of label selectors used to
        /// select resources to attach to the firewall.
        /// </summary>
        public InputList<string> LabelSelectors
        {
            get => _labelSelectors ?? (_labelSelectors = new InputList<string>());
            set => _labelSelectors = value;
        }

        [Input("serverIds")]
        private InputList<int>? _serverIds;

        /// <summary>
        /// List of Server IDs to attach to the
        /// firewall.
        /// </summary>
        public InputList<int> ServerIds
        {
            get => _serverIds ?? (_serverIds = new InputList<int>());
            set => _serverIds = value;
        }

        public FirewallAttachmentArgs()
        {
        }
        public static new FirewallAttachmentArgs Empty => new FirewallAttachmentArgs();
    }

    public sealed class FirewallAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the firewall the resources
        /// should be attached to.
        /// </summary>
        [Input("firewallId")]
        public Input<int>? FirewallId { get; set; }

        [Input("labelSelectors")]
        private InputList<string>? _labelSelectors;

        /// <summary>
        /// List of label selectors used to
        /// select resources to attach to the firewall.
        /// </summary>
        public InputList<string> LabelSelectors
        {
            get => _labelSelectors ?? (_labelSelectors = new InputList<string>());
            set => _labelSelectors = value;
        }

        [Input("serverIds")]
        private InputList<int>? _serverIds;

        /// <summary>
        /// List of Server IDs to attach to the
        /// firewall.
        /// </summary>
        public InputList<int> ServerIds
        {
            get => _serverIds ?? (_serverIds = new InputList<int>());
            set => _serverIds = value;
        }

        public FirewallAttachmentState()
        {
        }
        public static new FirewallAttachmentState Empty => new FirewallAttachmentState();
    }
}
