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
    public sealed class GetFirewallRuleResult
    {
        /// <summary>
        /// (Optional, string) Description of the firewall rule
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `out`)
        /// </summary>
        public readonly ImmutableArray<string> DestinationIps;
        /// <summary>
        /// (Required, string) Direction of the Firewall Rule. `in`, `out`
        /// </summary>
        public readonly string Direction;
        /// <summary>
        /// (Required, string) Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`
        /// </summary>
        public readonly string? Port;
        /// <summary>
        /// (Required, string) Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `in`)
        /// </summary>
        public readonly ImmutableArray<string> SourceIps;

        [OutputConstructor]
        private GetFirewallRuleResult(
            string? description,

            ImmutableArray<string> destinationIps,

            string direction,

            string? port,

            string? protocol,

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