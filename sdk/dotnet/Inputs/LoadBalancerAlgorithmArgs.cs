// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud.Inputs
{

    public sealed class LoadBalancerAlgorithmArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public LoadBalancerAlgorithmArgs()
        {
        }
        public static new LoadBalancerAlgorithmArgs Empty => new LoadBalancerAlgorithmArgs();
    }
}
