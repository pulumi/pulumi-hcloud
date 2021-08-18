// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    [HCloudResourceType("hcloud:index/placementGroup:PlacementGroup")]
    public partial class PlacementGroup : Pulumi.CustomResource
    {
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>?> Labels { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("servers")]
        public Output<ImmutableArray<int>> Servers { get; private set; } = null!;

        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a PlacementGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PlacementGroup(string name, PlacementGroupArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/placementGroup:PlacementGroup", name, args ?? new PlacementGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PlacementGroup(string name, Input<string> id, PlacementGroupState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/placementGroup:PlacementGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PlacementGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PlacementGroup Get(string name, Input<string> id, PlacementGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new PlacementGroup(name, id, state, options);
        }
    }

    public sealed class PlacementGroupArgs : Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputMap<object>? _labels;
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public PlacementGroupArgs()
        {
        }
    }

    public sealed class PlacementGroupState : Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputMap<object>? _labels;
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("servers")]
        private InputList<int>? _servers;
        public InputList<int> Servers
        {
            get => _servers ?? (_servers = new InputList<int>());
            set => _servers = value;
        }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public PlacementGroupState()
        {
        }
    }
}
