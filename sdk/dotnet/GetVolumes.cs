// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetVolumes
    {
        /// <summary>
        /// Provides details about multiple Hetzner Cloud volumes.
        /// </summary>
        public static Task<GetVolumesResult> InvokeAsync(GetVolumesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVolumesResult>("hcloud:index/getVolumes:getVolumes", args ?? new GetVolumesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about multiple Hetzner Cloud volumes.
        /// </summary>
        public static Output<GetVolumesResult> Invoke(GetVolumesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumesResult>("hcloud:index/getVolumes:getVolumes", args ?? new GetVolumesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVolumesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        [Input("withStatuses")]
        private List<string>? _withStatuses;

        /// <summary>
        /// List only volumes with the specified status, could contain `creating` or `available`.
        /// </summary>
        public List<string> WithStatuses
        {
            get => _withStatuses ?? (_withStatuses = new List<string>());
            set => _withStatuses = value;
        }

        public GetVolumesArgs()
        {
        }
        public static new GetVolumesArgs Empty => new GetVolumesArgs();
    }

    public sealed class GetVolumesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        [Input("withStatuses")]
        private InputList<string>? _withStatuses;

        /// <summary>
        /// List only volumes with the specified status, could contain `creating` or `available`.
        /// </summary>
        public InputList<string> WithStatuses
        {
            get => _withStatuses ?? (_withStatuses = new InputList<string>());
            set => _withStatuses = value;
        }

        public GetVolumesInvokeArgs()
        {
        }
        public static new GetVolumesInvokeArgs Empty => new GetVolumesInvokeArgs();
    }


    [OutputType]
    public sealed class GetVolumesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (list) List of all matching volumes. See `data.hcloud_volume` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVolumesVolumeResult> Volumes;
        public readonly string? WithSelector;
        public readonly ImmutableArray<string> WithStatuses;

        [OutputConstructor]
        private GetVolumesResult(
            string id,

            ImmutableArray<Outputs.GetVolumesVolumeResult> volumes,

            string? withSelector,

            ImmutableArray<string> withStatuses)
        {
            Id = id;
            Volumes = volumes;
            WithSelector = withSelector;
            WithStatuses = withStatuses;
        }
    }
}
