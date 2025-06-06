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
    public sealed class ServerPublicNet
    {
        public readonly int? Ipv4;
        public readonly bool? Ipv4Enabled;
        public readonly int? Ipv6;
        public readonly bool? Ipv6Enabled;

        [OutputConstructor]
        private ServerPublicNet(
            int? ipv4,

            bool? ipv4Enabled,

            int? ipv6,

            bool? ipv6Enabled)
        {
            Ipv4 = ipv4;
            Ipv4Enabled = ipv4Enabled;
            Ipv6 = ipv6;
            Ipv6Enabled = ipv6Enabled;
        }
    }
}
