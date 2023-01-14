// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud.Inputs
{

    public sealed class FirewallRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the firewall rule
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("destinationIps")]
        private InputList<string>? _destinationIps;

        /// <summary>
        /// (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction`
        /// is `out`)
        /// </summary>
        public InputList<string> DestinationIps
        {
            get => _destinationIps ?? (_destinationIps = new InputList<string>());
            set => _destinationIps = value;
        }

        /// <summary>
        /// Direction of the Firewall Rule. `in`
        /// </summary>
        [Input("direction", required: true)]
        public Input<string> Direction { get; set; } = null!;

        /// <summary>
        /// Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`. You can use `any`
        /// to allow all ports for the specific protocol. Port ranges are also possible: `80-85` allows all ports between 80 and
        /// 85.
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        [Input("sourceIps")]
        private InputList<string>? _sourceIps;

        /// <summary>
        /// List of CIDRs that are allowed within this Firewall Rule
        /// </summary>
        public InputList<string> SourceIps
        {
            get => _sourceIps ?? (_sourceIps = new InputList<string>());
            set => _sourceIps = value;
        }

        public FirewallRuleGetArgs()
        {
        }
        public static new FirewallRuleGetArgs Empty => new FirewallRuleGetArgs();
    }
}
