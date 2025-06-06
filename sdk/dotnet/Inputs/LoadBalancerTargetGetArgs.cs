// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud.Inputs
{

    public sealed class LoadBalancerTargetGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("serverId")]
        public Input<int>? ServerId { get; set; }

        /// <summary>
        /// (string) Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("usePrivateIp")]
        public Input<bool>? UsePrivateIp { get; set; }

        public LoadBalancerTargetGetArgs()
        {
        }
        public static new LoadBalancerTargetGetArgs Empty => new LoadBalancerTargetGetArgs();
    }
}
