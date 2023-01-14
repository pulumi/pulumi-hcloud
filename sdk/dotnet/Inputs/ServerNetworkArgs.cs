// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud.Inputs
{

    public sealed class ServerNetworkArgs : global::Pulumi.ResourceArgs
    {
        [Input("aliasIps")]
        private InputList<string>? _aliasIps;

        /// <summary>
        /// Alias IPs the server should have in the Network.
        /// </summary>
        public InputList<string> AliasIps
        {
            get => _aliasIps ?? (_aliasIps = new InputList<string>());
            set => _aliasIps = value;
        }

        /// <summary>
        /// Specify the IP the server should get in the network
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// (Optional, string) The MAC address the private interface of the server has
        /// </summary>
        [Input("macAddress")]
        public Input<string>? MacAddress { get; set; }

        /// <summary>
        /// ID of the network
        /// </summary>
        [Input("networkId", required: true)]
        public Input<int> NetworkId { get; set; } = null!;

        public ServerNetworkArgs()
        {
        }
        public static new ServerNetworkArgs Empty => new ServerNetworkArgs();
    }
}
