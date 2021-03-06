// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetVolume
    {
        public static Task<GetVolumeResult> InvokeAsync(GetVolumeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetVolumeResult>("hcloud:index/getVolume:getVolume", args ?? new GetVolumeArgs(), options.WithVersion());
    }


    public sealed class GetVolumeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the volume.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        [Input("location")]
        public string? Location { get; set; }

        /// <summary>
        /// Name of the volume.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("selector")]
        public string? Selector { get; set; }

        [Input("server")]
        public string? Server { get; set; }

        /// <summary>
        /// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
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

        public GetVolumeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetVolumeResult
    {
        /// <summary>
        /// Unique ID of the volume.
        /// </summary>
        public readonly int Id;
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly string LinuxDevice;
        public readonly string? Location;
        /// <summary>
        /// Name of the volume.
        /// </summary>
        public readonly string Name;
        public readonly string? Selector;
        public readonly string? Server;
        /// <summary>
        /// Size of the volume.
        /// </summary>
        public readonly int Size;
        public readonly string? WithSelector;
        public readonly ImmutableArray<string> WithStatuses;

        [OutputConstructor]
        private GetVolumeResult(
            int id,

            ImmutableDictionary<string, object> labels,

            string linuxDevice,

            string? location,

            string name,

            string? selector,

            string? server,

            int size,

            string? withSelector,

            ImmutableArray<string> withStatuses)
        {
            Id = id;
            Labels = labels;
            LinuxDevice = linuxDevice;
            Location = location;
            Name = name;
            Selector = selector;
            Server = server;
            Size = size;
            WithSelector = withSelector;
            WithStatuses = withStatuses;
        }
    }
}
