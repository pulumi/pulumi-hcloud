// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ip2 = Output.Create(HCloud.GetFloatingIps.InvokeAsync(new HCloud.GetFloatingIpsArgs
        ///         {
        ///             WithSelector = "key=value",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFloatingIpsResult> InvokeAsync(GetFloatingIpsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetFloatingIpsResult>("hcloud:index/getFloatingIps:getFloatingIps", args ?? new GetFloatingIpsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about multiple Hetzner Cloud Floating IPs.
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ip2 = Output.Create(HCloud.GetFloatingIps.InvokeAsync(new HCloud.GetFloatingIpsArgs
        ///         {
        ///             WithSelector = "key=value",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFloatingIpsResult> Invoke(GetFloatingIpsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetFloatingIpsResult>("hcloud:index/getFloatingIps:getFloatingIps", args ?? new GetFloatingIpsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFloatingIpsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetFloatingIpsArgs()
        {
        }
    }

    public sealed class GetFloatingIpsInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetFloatingIpsInvokeArgs()
        {
        }
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
