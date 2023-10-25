// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetNetworks
    {
        /// <summary>
        /// Provides details about multiple Hetzner Cloud Networks.
        /// </summary>
        public static Task<GetNetworksResult> InvokeAsync(GetNetworksArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworksResult>("hcloud:index/getNetworks:getNetworks", args ?? new GetNetworksArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about multiple Hetzner Cloud Networks.
        /// </summary>
        public static Output<GetNetworksResult> Invoke(GetNetworksInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworksResult>("hcloud:index/getNetworks:getNetworks", args ?? new GetNetworksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworksArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetNetworksArgs()
        {
        }
        public static new GetNetworksArgs Empty => new GetNetworksArgs();
    }

    public sealed class GetNetworksInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetNetworksInvokeArgs()
        {
        }
        public static new GetNetworksInvokeArgs Empty => new GetNetworksInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworksResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (list) List of all matching networks. See `data.hcloud_network` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworksNetworkResult> Networks;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetNetworksResult(
            string id,

            ImmutableArray<Outputs.GetNetworksNetworkResult> networks,

            string? withSelector)
        {
            Id = id;
            Networks = networks;
            WithSelector = withSelector;
        }
    }
}
