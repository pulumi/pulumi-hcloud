// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetFloatingIps
    {
        /// <summary>
        /// Provides details about multiple Hetzner Cloud Floating IPs.
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
        ///     var ip2 = HCloud.GetFloatingIps.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFloatingIpsResult> InvokeAsync(GetFloatingIpsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFloatingIpsResult>("hcloud:index/getFloatingIps:getFloatingIps", args ?? new GetFloatingIpsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about multiple Hetzner Cloud Floating IPs.
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
        ///     var ip2 = HCloud.GetFloatingIps.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFloatingIpsResult> Invoke(GetFloatingIpsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFloatingIpsResult>("hcloud:index/getFloatingIps:getFloatingIps", args ?? new GetFloatingIpsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about multiple Hetzner Cloud Floating IPs.
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
        ///     var ip2 = HCloud.GetFloatingIps.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFloatingIpsResult> Invoke(GetFloatingIpsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFloatingIpsResult>("hcloud:index/getFloatingIps:getFloatingIps", args ?? new GetFloatingIpsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFloatingIpsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetFloatingIpsArgs()
        {
        }
        public static new GetFloatingIpsArgs Empty => new GetFloatingIpsArgs();
    }

    public sealed class GetFloatingIpsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetFloatingIpsInvokeArgs()
        {
        }
        public static new GetFloatingIpsInvokeArgs Empty => new GetFloatingIpsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFloatingIpsResult
    {
        /// <summary>
        /// (list) List of all matching floating ips. See `data.hcloud_floating_ip` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFloatingIpsFloatingIpResult> FloatingIps;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetFloatingIpsResult(
            ImmutableArray<Outputs.GetFloatingIpsFloatingIpResult> floatingIps,

            string id,

            string? withSelector)
        {
            FloatingIps = floatingIps;
            Id = id;
            WithSelector = withSelector;
        }
    }
}
