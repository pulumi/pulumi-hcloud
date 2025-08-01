// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetPrimaryIps
    {
        /// <summary>
        /// Provides details about multiple Hetzner Cloud Primary IPs.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ip2 = HCloud.GetPrimaryIps.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPrimaryIpsResult> InvokeAsync(GetPrimaryIpsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrimaryIpsResult>("hcloud:index/getPrimaryIps:getPrimaryIps", args ?? new GetPrimaryIpsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about multiple Hetzner Cloud Primary IPs.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ip2 = HCloud.GetPrimaryIps.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPrimaryIpsResult> Invoke(GetPrimaryIpsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrimaryIpsResult>("hcloud:index/getPrimaryIps:getPrimaryIps", args ?? new GetPrimaryIpsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about multiple Hetzner Cloud Primary IPs.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ip2 = HCloud.GetPrimaryIps.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPrimaryIpsResult> Invoke(GetPrimaryIpsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrimaryIpsResult>("hcloud:index/getPrimaryIps:getPrimaryIps", args ?? new GetPrimaryIpsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrimaryIpsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetPrimaryIpsArgs()
        {
        }
        public static new GetPrimaryIpsArgs Empty => new GetPrimaryIpsArgs();
    }

    public sealed class GetPrimaryIpsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetPrimaryIpsInvokeArgs()
        {
        }
        public static new GetPrimaryIpsInvokeArgs Empty => new GetPrimaryIpsInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrimaryIpsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (list) List of all matching primary ips. See `data.hcloud_primary_ip` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrimaryIpsPrimaryIpResult> PrimaryIps;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetPrimaryIpsResult(
            string id,

            ImmutableArray<Outputs.GetPrimaryIpsPrimaryIpResult> primaryIps,

            string? withSelector)
        {
            Id = id;
            PrimaryIps = primaryIps;
            WithSelector = withSelector;
        }
    }
}
