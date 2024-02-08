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
    /// Provides a Hetzner Cloud Firewall to represent a Firewall in the Hetzner Cloud.
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
    ///     var myfirewall = new HCloud.Firewall("myfirewall", new()
    ///     {
    ///         Rules = new[]
    ///         {
    ///             new HCloud.Inputs.FirewallRuleArgs
    ///             {
    ///                 Direction = "in",
    ///                 Protocol = "icmp",
    ///                 SourceIps = new[]
    ///                 {
    ///                     "0.0.0.0/0",
    ///                     "::/0",
    ///                 },
    ///             },
    ///             new HCloud.Inputs.FirewallRuleArgs
    ///             {
    ///                 Direction = "in",
    ///                 Protocol = "tcp",
    ///                 Port = "80-85",
    ///                 SourceIps = new[]
    ///                 {
    ///                     "0.0.0.0/0",
    ///                     "::/0",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var node1 = new HCloud.Server("node1", new()
    ///     {
    ///         Image = "debian-11",
    ///         ServerType = "cx11",
    ///         FirewallIds = new[]
    ///         {
    ///             myfirewall.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Firewalls can be imported using its `id`:
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/firewall:Firewall myfirewall id
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/firewall:Firewall")]
    public partial class Firewall : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Resources the firewall should be assigned to
        /// </summary>
        [Output("applyTos")]
        public Output<ImmutableArray<Outputs.FirewallApplyTo>> ApplyTos { get; private set; } = null!;

        /// <summary>
        /// User-defined labels (key-value pairs) should be created with.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>> Labels { get; private set; } = null!;

        /// <summary>
        /// Name of the Firewall.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Configuration of a Rule from this Firewall.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.FirewallRule>> Rules { get; private set; } = null!;


        /// <summary>
        /// Create a Firewall resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Firewall(string name, FirewallArgs? args = null, CustomResourceOptions? options = null)
            : base("hcloud:index/firewall:Firewall", name, args ?? new FirewallArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Firewall(string name, Input<string> id, FirewallState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/firewall:Firewall", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Firewall resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Firewall Get(string name, Input<string> id, FirewallState? state = null, CustomResourceOptions? options = null)
        {
            return new Firewall(name, id, state, options);
        }
    }

    public sealed class FirewallArgs : global::Pulumi.ResourceArgs
    {
        [Input("applyTos")]
        private InputList<Inputs.FirewallApplyToArgs>? _applyTos;

        /// <summary>
        /// Resources the firewall should be assigned to
        /// </summary>
        public InputList<Inputs.FirewallApplyToArgs> ApplyTos
        {
            get => _applyTos ?? (_applyTos = new InputList<Inputs.FirewallApplyToArgs>());
            set => _applyTos = value;
        }

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
        /// Name of the Firewall.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("rules")]
        private InputList<Inputs.FirewallRuleArgs>? _rules;

        /// <summary>
        /// Configuration of a Rule from this Firewall.
        /// </summary>
        public InputList<Inputs.FirewallRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.FirewallRuleArgs>());
            set => _rules = value;
        }

        public FirewallArgs()
        {
        }
        public static new FirewallArgs Empty => new FirewallArgs();
    }

    public sealed class FirewallState : global::Pulumi.ResourceArgs
    {
        [Input("applyTos")]
        private InputList<Inputs.FirewallApplyToGetArgs>? _applyTos;

        /// <summary>
        /// Resources the firewall should be assigned to
        /// </summary>
        public InputList<Inputs.FirewallApplyToGetArgs> ApplyTos
        {
            get => _applyTos ?? (_applyTos = new InputList<Inputs.FirewallApplyToGetArgs>());
            set => _applyTos = value;
        }

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
        /// Name of the Firewall.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("rules")]
        private InputList<Inputs.FirewallRuleGetArgs>? _rules;

        /// <summary>
        /// Configuration of a Rule from this Firewall.
        /// </summary>
        public InputList<Inputs.FirewallRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.FirewallRuleGetArgs>());
            set => _rules = value;
        }

        public FirewallState()
        {
        }
        public static new FirewallState Empty => new FirewallState();
    }
}
