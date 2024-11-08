// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud.Outputs
{

    [OutputType]
    public sealed class GetVolumesVolumeResult
    {
        public readonly bool DeleteProtection;
        public readonly int Id;
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly string LinuxDevice;
        public readonly string? Location;
        public readonly string Name;
        public readonly int? ServerId;
        public readonly int Size;

        [OutputConstructor]
        private GetVolumesVolumeResult(
            bool deleteProtection,

            int id,

            ImmutableDictionary<string, string> labels,

            string linuxDevice,

            string? location,

            string name,

            int? serverId,

            int size)
        {
            DeleteProtection = deleteProtection;
            Id = id;
            Labels = labels;
            LinuxDevice = linuxDevice;
            Location = location;
            Name = name;
            ServerId = serverId;
            Size = size;
        }
    }
}