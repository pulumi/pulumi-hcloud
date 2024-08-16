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
    public sealed class GetPrimaryIpsPrimaryIpResult
    {
        public readonly int AssigneeId;
        public readonly string AssigneeType;
        public readonly bool AutoDelete;
        public readonly string Datacenter;
        public readonly bool DeleteProtection;
        public readonly int Id;
        public readonly string IpAddress;
        public readonly string IpNetwork;
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly string? Name;
        public readonly string Type;

        [OutputConstructor]
        private GetPrimaryIpsPrimaryIpResult(
            int assigneeId,

            string assigneeType,

            bool autoDelete,

            string datacenter,

            bool deleteProtection,

            int id,

            string ipAddress,

            string ipNetwork,

            ImmutableDictionary<string, string> labels,

            string? name,

            string type)
        {
            AssigneeId = assigneeId;
            AssigneeType = assigneeType;
            AutoDelete = autoDelete;
            Datacenter = datacenter;
            DeleteProtection = deleteProtection;
            Id = id;
            IpAddress = ipAddress;
            IpNetwork = ipNetwork;
            Labels = labels;
            Name = name;
            Type = type;
        }
    }
}
