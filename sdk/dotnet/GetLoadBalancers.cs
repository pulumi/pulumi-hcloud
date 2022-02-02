// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetLoadBalancers
    {
        /// <summary>
        /// Provides details about multiple Hetzner Cloud Load Balancers.
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
        ///         var lb2 = Output.Create(HCloud.GetLoadBalancers.InvokeAsync());
        ///         var lb3 = Output.Create(HCloud.GetLoadBalancers.InvokeAsync(new HCloud.GetLoadBalancersArgs
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
        public static Task<GetLoadBalancersResult> InvokeAsync(GetLoadBalancersArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetLoadBalancersResult>("hcloud:index/getLoadBalancers:getLoadBalancers", args ?? new GetLoadBalancersArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about multiple Hetzner Cloud Load Balancers.
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
        ///         var lb2 = Output.Create(HCloud.GetLoadBalancers.InvokeAsync());
        ///         var lb3 = Output.Create(HCloud.GetLoadBalancers.InvokeAsync(new HCloud.GetLoadBalancersArgs
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
        public static Output<GetLoadBalancersResult> Invoke(GetLoadBalancersInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetLoadBalancersResult>("hcloud:index/getLoadBalancers:getLoadBalancers", args ?? new GetLoadBalancersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoadBalancersArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetLoadBalancersArgs()
        {
        }
    }

    public sealed class GetLoadBalancersInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetLoadBalancersInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetLoadBalancersResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (list) List of all matching load balancers. See `data.hcloud_load_balancer` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersLoadBalancerResult> LoadBalancers;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetLoadBalancersResult(
            string id,

            ImmutableArray<Outputs.GetLoadBalancersLoadBalancerResult> loadBalancers,

            string? withSelector)
        {
            Id = id;
            LoadBalancers = loadBalancers;
            WithSelector = withSelector;
        }
    }
}
