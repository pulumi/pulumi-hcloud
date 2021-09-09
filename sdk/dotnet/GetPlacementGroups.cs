// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetPlacementGroups
    {
        /// <summary>
        /// Provides details about multiple Hetzner Cloud Placement Groups.
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var samplePlacementGroup1 = Output.Create(HCloud.GetPlacementGroups.InvokeAsync());
        ///         var samplePlacementGroup2 = Output.Create(HCloud.GetPlacementGroups.InvokeAsync(new HCloud.GetPlacementGroupsArgs
        ///         {
        ///             WithSelector = "key=value",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPlacementGroupsResult> InvokeAsync(GetPlacementGroupsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetPlacementGroupsResult>("hcloud:index/getPlacementGroups:getPlacementGroups", args ?? new GetPlacementGroupsArgs(), options.WithVersion());
    }


    public sealed class GetPlacementGroupsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Sorts list by date.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetPlacementGroupsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetPlacementGroupsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? MostRecent;
        /// <summary>
        /// (list) List of all matching placement groups. See `data.hcloud_placement_group` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPlacementGroupsPlacementGroupResult> PlacementGroups;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetPlacementGroupsResult(
            string id,

            bool? mostRecent,

            ImmutableArray<Outputs.GetPlacementGroupsPlacementGroupResult> placementGroups,

            string? withSelector)
        {
            Id = id;
            MostRecent = mostRecent;
            PlacementGroups = placementGroups;
            WithSelector = withSelector;
        }
    }
}