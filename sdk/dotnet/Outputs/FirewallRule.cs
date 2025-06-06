// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud.Outputs
{

    [OutputType]
    public sealed class FirewallRule
    {
        /// <summary>
        /// Description of the firewall rule
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// List of IPs or CIDRs that are allowed within this Firewall Rule (when `direction`
        /// is `out`)
        /// </summary>
        public readonly ImmutableArray<string> DestinationIps;
        /// <summary>
        /// Direction of the Firewall Rule. `in`
        /// </summary>
        public readonly string Direction;
        /// <summary>
        /// Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`. You can use `any`
        /// to allow all ports for the specific protocol. Port ranges are also possible: `80-85` allows all ports between 80 and 85.
        /// </summary>
        public readonly string? Port;
        /// <summary>
        /// Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// List of IPs or CIDRs that are allowed within this Firewall Rule (when `direction`
        /// is `in`)
        /// </summary>
        public readonly ImmutableArray<string> SourceIps;

        [OutputConstructor]
        private FirewallRule(
            string? description,

            ImmutableArray<string> destinationIps,

            string direction,

            string? port,

            string protocol,

            ImmutableArray<string> sourceIps)
        {
            Description = description;
            DestinationIps = destinationIps;
            Direction = direction;
            Port = port;
            Protocol = protocol;
            SourceIps = sourceIps;
        }
    }
}
