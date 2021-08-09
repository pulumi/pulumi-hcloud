// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud.Inputs
{

    public sealed class GetFirewallRuleArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// (Optional, string) Description of the firewall rule
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        [Input("destinationIps")]
        private List<string>? _destinationIps;

        /// <summary>
        /// (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `out`)
        /// </summary>
        public List<string> DestinationIps
        {
            get => _destinationIps ?? (_destinationIps = new List<string>());
            set => _destinationIps = value;
        }

        /// <summary>
        /// (Required, string) Direction of the Firewall Rule. `in`, `out`
        /// </summary>
        [Input("direction", required: true)]
        public string Direction { get; set; } = null!;

        /// <summary>
        /// (Required, string) Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`
        /// </summary>
        [Input("port")]
        public string? Port { get; set; }

        /// <summary>
        /// (Required, string) Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
        /// </summary>
        [Input("protocol")]
        public string? Protocol { get; set; }

        [Input("sourceIps")]
        private List<string>? _sourceIps;

        /// <summary>
        /// (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `in`)
        /// </summary>
        public List<string> SourceIps
        {
            get => _sourceIps ?? (_sourceIps = new List<string>());
            set => _sourceIps = value;
        }

        public GetFirewallRuleArgs()
        {
        }
    }
}
