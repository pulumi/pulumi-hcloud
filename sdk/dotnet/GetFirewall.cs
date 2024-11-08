// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetFirewall
    {
        /// <summary>
        /// Provides details about a specific Hetzner Cloud Firewall.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var sampleFirewall1 = HCloud.GetFirewall.Invoke(new()
        ///     {
        ///         Name = "sample-firewall-1",
        ///     });
        /// 
        ///     var sampleFirewall2 = HCloud.GetFirewall.Invoke(new()
        ///     {
        ///         Id = 4711,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFirewallResult> InvokeAsync(GetFirewallArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFirewallResult>("hcloud:index/getFirewall:getFirewall", args ?? new GetFirewallArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Hetzner Cloud Firewall.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var sampleFirewall1 = HCloud.GetFirewall.Invoke(new()
        ///     {
        ///         Name = "sample-firewall-1",
        ///     });
        /// 
        ///     var sampleFirewall2 = HCloud.GetFirewall.Invoke(new()
        ///     {
        ///         Id = 4711,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFirewallResult> Invoke(GetFirewallInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirewallResult>("hcloud:index/getFirewall:getFirewall", args ?? new GetFirewallInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFirewallArgs : global::Pulumi.InvokeArgs
    {
        [Input("applyTos")]
        private List<Inputs.GetFirewallApplyToArgs>? _applyTos;

        /// <summary>
        /// Configuration of the Applied Resources
        /// </summary>
        public List<Inputs.GetFirewallApplyToArgs> ApplyTos
        {
            get => _applyTos ?? (_applyTos = new List<Inputs.GetFirewallApplyToArgs>());
            set => _applyTos = value;
        }

        /// <summary>
        /// ID of the firewall.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        [Input("labels")]
        private Dictionary<string, string>? _labels;

        /// <summary>
        /// (map) User-defined labels (key-value pairs)
        /// </summary>
        public Dictionary<string, string> Labels
        {
            get => _labels ?? (_labels = new Dictionary<string, string>());
            set => _labels = value;
        }

        /// <summary>
        /// Return most recent firewall if multiple are found.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        /// <summary>
        /// Name of the firewall.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("rules")]
        private List<Inputs.GetFirewallRuleArgs>? _rules;

        /// <summary>
        /// (string) Configuration of a Rule from this Firewall.
        /// </summary>
        public List<Inputs.GetFirewallRuleArgs> Rules
        {
            get => _rules ?? (_rules = new List<Inputs.GetFirewallRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetFirewallArgs()
        {
        }
        public static new GetFirewallArgs Empty => new GetFirewallArgs();
    }

    public sealed class GetFirewallInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("applyTos")]
        private InputList<Inputs.GetFirewallApplyToInputArgs>? _applyTos;

        /// <summary>
        /// Configuration of the Applied Resources
        /// </summary>
        public InputList<Inputs.GetFirewallApplyToInputArgs> ApplyTos
        {
            get => _applyTos ?? (_applyTos = new InputList<Inputs.GetFirewallApplyToInputArgs>());
            set => _applyTos = value;
        }

        /// <summary>
        /// ID of the firewall.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// (map) User-defined labels (key-value pairs)
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Return most recent firewall if multiple are found.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        /// <summary>
        /// Name of the firewall.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("rules")]
        private InputList<Inputs.GetFirewallRuleInputArgs>? _rules;

        /// <summary>
        /// (string) Configuration of a Rule from this Firewall.
        /// </summary>
        public InputList<Inputs.GetFirewallRuleInputArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.GetFirewallRuleInputArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetFirewallInvokeArgs()
        {
        }
        public static new GetFirewallInvokeArgs Empty => new GetFirewallInvokeArgs();
    }


    [OutputType]
    public sealed class GetFirewallResult
    {
        /// <summary>
        /// Configuration of the Applied Resources
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirewallApplyToResult> ApplyTos;
        /// <summary>
        /// (int) Unique ID of the Firewall.
        /// </summary>
        public readonly int? Id;
        /// <summary>
        /// (map) User-defined labels (key-value pairs)
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Labels;
        public readonly bool? MostRecent;
        /// <summary>
        /// (string) Name of the Firewall.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (string) Configuration of a Rule from this Firewall.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirewallRuleResult> Rules;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetFirewallResult(
            ImmutableArray<Outputs.GetFirewallApplyToResult> applyTos,

            int? id,

            ImmutableDictionary<string, string>? labels,

            bool? mostRecent,

            string name,

            ImmutableArray<Outputs.GetFirewallRuleResult> rules,

            string? withSelector)
        {
            ApplyTos = applyTos;
            Id = id;
            Labels = labels;
            MostRecent = mostRecent;
            Name = name;
            Rules = rules;
            WithSelector = withSelector;
        }
    }
}
