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
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVolumeResult>("hcloud:index/getVolume:getVolume", args ?? new GetVolumeArgs(), options.WithDefaults());

        public static Output<GetVolumeResult> Invoke(GetVolumeInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumeResult>("hcloud:index/getVolume:getVolume", args ?? new GetVolumeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVolumeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the volume.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// (string) The location name.
        /// </summary>
        [Input("location")]
        public string? Location { get; set; }

        /// <summary>
        /// Name of the volume.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("selector")]
        public string? Selector { get; set; }

        /// <summary>
        /// (Optional, int) Server ID the volume is attached to
        /// </summary>
        [Input("serverId")]
        public int? ServerId { get; set; }

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
        public static new GetVolumeArgs Empty => new GetVolumeArgs();
    }

    public sealed class GetVolumeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the volume.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// (string) The location name.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of the volume.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("selector")]
        public Input<string>? Selector { get; set; }

        /// <summary>
        /// (Optional, int) Server ID the volume is attached to
        /// </summary>
        [Input("serverId")]
        public Input<int>? ServerId { get; set; }

        /// <summary>
        /// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
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

        public GetVolumeInvokeArgs()
        {
        }
        public static new GetVolumeInvokeArgs Empty => new GetVolumeInvokeArgs();
    }


    [OutputType]
    public sealed class GetVolumeResult
    {
        /// <summary>
        /// (bool) Whether delete protection is enabled.
        /// </summary>
        public readonly bool DeleteProtection;
        /// <summary>
        /// (int) Unique ID of the volume.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// (map) User-defined labels (key-value pairs).
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (string) Device path on the file system for the Volume.
        /// </summary>
        public readonly string LinuxDevice;
        /// <summary>
        /// (string) The location name.
        /// </summary>
        public readonly string? Location;
        /// <summary>
        /// (string) Name of the volume.
        /// </summary>
        public readonly string Name;
        public readonly string? Selector;
        /// <summary>
        /// (Optional, int) Server ID the volume is attached to
        /// </summary>
        public readonly int? ServerId;
        /// <summary>
        /// (int) Size of the volume.
        /// </summary>
        public readonly int Size;
        public readonly string? WithSelector;
        public readonly ImmutableArray<string> WithStatuses;

        [OutputConstructor]
        private GetVolumeResult(
            bool deleteProtection,

            int id,

            ImmutableDictionary<string, object> labels,

            string linuxDevice,

            string? location,

            string name,

            string? selector,

            int? serverId,

            int size,

            string? withSelector,

            ImmutableArray<string> withStatuses)
        {
            DeleteProtection = deleteProtection;
            Id = id;
            Labels = labels;
            LinuxDevice = linuxDevice;
            Location = location;
            Name = name;
            Selector = selector;
            ServerId = serverId;
            Size = size;
            WithSelector = withSelector;
            WithStatuses = withStatuses;
        }
    }
}
