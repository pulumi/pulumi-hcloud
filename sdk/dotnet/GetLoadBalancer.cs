// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetLoadBalancer
    {
        /// <summary>
        /// Provides details about a specific Hetzner Cloud Load Balancer.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var lb1 = HCloud.GetLoadBalancer.Invoke(new()
        ///     {
        ///         Name = "my-load-balancer",
        ///     });
        /// 
        ///     var lb2 = HCloud.GetLoadBalancer.Invoke(new()
        ///     {
        ///         Id = 123,
        ///     });
        /// 
        ///     var lb3 = HCloud.GetLoadBalancer.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetLoadBalancerResult> InvokeAsync(GetLoadBalancerArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLoadBalancerResult>("hcloud:index/getLoadBalancer:getLoadBalancer", args ?? new GetLoadBalancerArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Hetzner Cloud Load Balancer.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var lb1 = HCloud.GetLoadBalancer.Invoke(new()
        ///     {
        ///         Name = "my-load-balancer",
        ///     });
        /// 
        ///     var lb2 = HCloud.GetLoadBalancer.Invoke(new()
        ///     {
        ///         Id = 123,
        ///     });
        /// 
        ///     var lb3 = HCloud.GetLoadBalancer.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetLoadBalancerResult> Invoke(GetLoadBalancerInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoadBalancerResult>("hcloud:index/getLoadBalancer:getLoadBalancer", args ?? new GetLoadBalancerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoadBalancerArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Load Balancer.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// Name of the Load Balancer.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetLoadBalancerArgs()
        {
        }
        public static new GetLoadBalancerArgs Empty => new GetLoadBalancerArgs();
    }

    public sealed class GetLoadBalancerInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Load Balancer.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// Name of the Load Balancer.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetLoadBalancerInvokeArgs()
        {
        }
        public static new GetLoadBalancerInvokeArgs Empty => new GetLoadBalancerInvokeArgs();
    }


    [OutputType]
    public sealed class GetLoadBalancerResult
    {
        /// <summary>
        /// (Optional) Configuration of the algorithm the Load Balancer use.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancerAlgorithmResult> Algorithms;
        /// <summary>
        /// (bool) Whether delete protection is enabled.
        /// </summary>
        public readonly bool DeleteProtection;
        /// <summary>
        /// (int) Unique ID of the Load Balancer.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// (string) IPv4 Address of the Load Balancer.
        /// </summary>
        public readonly string Ipv4;
        /// <summary>
        /// (string) IPv4 Address of the Load Balancer.
        /// </summary>
        public readonly string Ipv6;
        /// <summary>
        /// (map) User-defined labels (key-value pairs) .
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (string) Name of the Type of the Load Balancer.
        /// </summary>
        public readonly string LoadBalancerType;
        /// <summary>
        /// (string) Name of the location the Load Balancer is in.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// (string) Name of the Load Balancer.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// (int) ID of the first private network that this Load Balancer is connected to.
        /// </summary>
        public readonly int NetworkId;
        /// <summary>
        /// (string) IP of the Load Balancer in the first private network that it is connected to.
        /// </summary>
        public readonly string NetworkIp;
        public readonly string NetworkZone;
        /// <summary>
        /// (list) List of services a Load Balancer provides.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancerServiceResult> Services;
        /// <summary>
        /// (list) List of targets of the Load Balancer.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancerTargetResult> Targets;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetLoadBalancerResult(
            ImmutableArray<Outputs.GetLoadBalancerAlgorithmResult> algorithms,

            bool deleteProtection,

            int id,

            string ipv4,

            string ipv6,

            ImmutableDictionary<string, object> labels,

            string loadBalancerType,

            string location,

            string? name,

            int networkId,

            string networkIp,

            string networkZone,

            ImmutableArray<Outputs.GetLoadBalancerServiceResult> services,

            ImmutableArray<Outputs.GetLoadBalancerTargetResult> targets,

            string? withSelector)
        {
            Algorithms = algorithms;
            DeleteProtection = deleteProtection;
            Id = id;
            Ipv4 = ipv4;
            Ipv6 = ipv6;
            Labels = labels;
            LoadBalancerType = loadBalancerType;
            Location = location;
            Name = name;
            NetworkId = networkId;
            NetworkIp = networkIp;
            NetworkZone = networkZone;
            Services = services;
            Targets = targets;
            WithSelector = withSelector;
        }
    }
}
