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
        /// Provides details about a specific Hetzner Cloud Placement Group.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var samplePlacementGroup1 = Output.Create(HCloud.GetPlacementGroup.InvokeAsync(new HCloud.GetPlacementGroupArgs
        ///         {
        ///             Name = "sample-placement-group-1",
        ///         }));
        ///         var samplePlacementGroup2 = Output.Create(HCloud.GetPlacementGroup.InvokeAsync(new HCloud.GetPlacementGroupArgs
        ///         {
        ///             Id = 4711,
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// </summary>
        public static Task<GetPlacementGroupResult> InvokeAsync(GetPlacementGroupArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetPlacementGroupResult>("hcloud:index/getPlacementGroup:getPlacementGroup", args ?? new GetPlacementGroupArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Hetzner Cloud Placement Group.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var samplePlacementGroup1 = Output.Create(HCloud.GetPlacementGroup.InvokeAsync(new HCloud.GetPlacementGroupArgs
        ///         {
        ///             Name = "sample-placement-group-1",
        ///         }));
        ///         var samplePlacementGroup2 = Output.Create(HCloud.GetPlacementGroup.InvokeAsync(new HCloud.GetPlacementGroupArgs
        ///         {
        ///             Id = 4711,
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// </summary>
        public static Output<GetPlacementGroupResult> Invoke(GetPlacementGroupInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetPlacementGroupResult>("hcloud:index/getPlacementGroup:getPlacementGroup", args ?? new GetPlacementGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPlacementGroupArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the placement group.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        [Input("labels")]
        private Dictionary<string, object>? _labels;

        /// <summary>
        /// (map) User-defined labels (key-value pairs)
        /// </summary>
        public Dictionary<string, object> Labels
        {
            get => _labels ?? (_labels = new Dictionary<string, object>());
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
    }

    public sealed class GetPlacementGroupInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the placement group.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// (map) User-defined labels (key-value pairs)
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
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
    }


    [OutputType]
    public sealed class GetPlacementGroupResult
    {
        /// <summary>
        /// (int) Unique ID of the Placement Group.
        /// </summary>
        public readonly int? Id;
        /// <summary>
        /// (map) User-defined labels (key-value pairs)
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Labels;
        public readonly bool? MostRecent;
        /// <summary>
        /// (string) Name of the Placement Group.
        /// </summary>
        public readonly string Name;
        public readonly ImmutableArray<int> Servers;
        /// <summary>
        /// (string)  Type of the Placement Group.
        /// </summary>
        public readonly string? Type;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetPlacementGroupResult(
            int? id,

            ImmutableDictionary<string, object>? labels,

            bool? mostRecent,

            string name,

            ImmutableArray<int> servers,

            string? type,

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
