// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetPlacementGroup
    {
        /// <summary>
        /// layout: "hcloud"
        /// page_title: "Hetzner Cloud: hcloud.PlacementGroup"
        /// sidebar_current: "docs-hcloud-datasource-placement-group"
        /// description: |-
        /// Provides details about a specific Hetzner Cloud Placement Group.
        /// &lt;!-- yaml: line 6: could not find expected ':' --&gt;
        /// 
        /// # hcloud.PlacementGroup
        /// 
        /// Provides details about a specific Hetzner Cloud Placement Group.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var samplePlacementGroup1 = HCloud.GetPlacementGroup.Invoke(new()
        ///     {
        ///         Name = "sample-placement-group-1",
        ///     });
        /// 
        ///     var samplePlacementGroup2 = HCloud.GetPlacementGroup.Invoke(new()
        ///     {
        ///         Id = 4711,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPlacementGroupResult> InvokeAsync(GetPlacementGroupArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPlacementGroupResult>("hcloud:index/getPlacementGroup:getPlacementGroup", args ?? new GetPlacementGroupArgs(), options.WithDefaults());

        /// <summary>
        /// layout: "hcloud"
        /// page_title: "Hetzner Cloud: hcloud.PlacementGroup"
        /// sidebar_current: "docs-hcloud-datasource-placement-group"
        /// description: |-
        /// Provides details about a specific Hetzner Cloud Placement Group.
        /// &lt;!-- yaml: line 6: could not find expected ':' --&gt;
        /// 
        /// # hcloud.PlacementGroup
        /// 
        /// Provides details about a specific Hetzner Cloud Placement Group.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var samplePlacementGroup1 = HCloud.GetPlacementGroup.Invoke(new()
        ///     {
        ///         Name = "sample-placement-group-1",
        ///     });
        /// 
        ///     var samplePlacementGroup2 = HCloud.GetPlacementGroup.Invoke(new()
        ///     {
        ///         Id = 4711,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPlacementGroupResult> Invoke(GetPlacementGroupInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPlacementGroupResult>("hcloud:index/getPlacementGroup:getPlacementGroup", args ?? new GetPlacementGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPlacementGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the placement group.
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
        /// Return most recent placement group if multiple are found.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        /// <summary>
        /// Name of the placement group.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// (string)  Type of the Placement Group.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetPlacementGroupArgs()
        {
        }
        public static new GetPlacementGroupArgs Empty => new GetPlacementGroupArgs();
    }

    public sealed class GetPlacementGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the placement group.
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
        /// Return most recent placement group if multiple are found.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        /// <summary>
        /// Name of the placement group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (string)  Type of the Placement Group.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetPlacementGroupInvokeArgs()
        {
        }
        public static new GetPlacementGroupInvokeArgs Empty => new GetPlacementGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetPlacementGroupResult
    {
        /// <summary>
        /// (int) Unique ID of the Placement Group.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// (map) User-defined labels (key-value pairs)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly bool? MostRecent;
        /// <summary>
        /// (string) Name of the Placement Group.
        /// </summary>
        public readonly string Name;
        public readonly ImmutableArray<int> Servers;
        /// <summary>
        /// (string)  Type of the Placement Group.
        /// </summary>
        public readonly string Type;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetPlacementGroupResult(
            int id,

            ImmutableDictionary<string, string> labels,

            bool? mostRecent,

            string name,

            ImmutableArray<int> servers,

            string type,

            string? withSelector)
        {
            Id = id;
            Labels = labels;
            MostRecent = mostRecent;
            Name = name;
            Servers = servers;
            Type = type;
            WithSelector = withSelector;
        }
    }
}
