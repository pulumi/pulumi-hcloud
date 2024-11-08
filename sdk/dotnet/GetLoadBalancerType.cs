// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetLoadBalancerType
    {
        /// <summary>
        /// Provides details about a specific Hetzner Cloud Load Balancer Type.
        /// Use this resource to get detailed information about specific Load Balancer Type.
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
        ///     var byName = HCloud.GetLoadBalancerType.Invoke(new()
        ///     {
        ///         Name = "cx22",
        ///     });
        /// 
        ///     var byId = HCloud.GetLoadBalancerType.Invoke(new()
        ///     {
        ///         Id = 1,
        ///     });
        /// 
        ///     var loadBalancer = new HCloud.LoadBalancer("load_balancer", new()
        ///     {
        ///         Name = "my-load-balancer",
        ///         LoadBalancerType = name,
        ///         Location = "nbg1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLoadBalancerTypeResult> InvokeAsync(GetLoadBalancerTypeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLoadBalancerTypeResult>("hcloud:index/getLoadBalancerType:getLoadBalancerType", args ?? new GetLoadBalancerTypeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Hetzner Cloud Load Balancer Type.
        /// Use this resource to get detailed information about specific Load Balancer Type.
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
        ///     var byName = HCloud.GetLoadBalancerType.Invoke(new()
        ///     {
        ///         Name = "cx22",
        ///     });
        /// 
        ///     var byId = HCloud.GetLoadBalancerType.Invoke(new()
        ///     {
        ///         Id = 1,
        ///     });
        /// 
        ///     var loadBalancer = new HCloud.LoadBalancer("load_balancer", new()
        ///     {
        ///         Name = "my-load-balancer",
        ///         LoadBalancerType = name,
        ///         Location = "nbg1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLoadBalancerTypeResult> Invoke(GetLoadBalancerTypeInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoadBalancerTypeResult>("hcloud:index/getLoadBalancerType:getLoadBalancerType", args ?? new GetLoadBalancerTypeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoadBalancerTypeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the load_balancer_type.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// Name of the load_balancer_type.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetLoadBalancerTypeArgs()
        {
        }
        public static new GetLoadBalancerTypeArgs Empty => new GetLoadBalancerTypeArgs();
    }

    public sealed class GetLoadBalancerTypeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the load_balancer_type.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// Name of the load_balancer_type.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetLoadBalancerTypeInvokeArgs()
        {
        }
        public static new GetLoadBalancerTypeInvokeArgs Empty => new GetLoadBalancerTypeInvokeArgs();
    }


    [OutputType]
    public sealed class GetLoadBalancerTypeResult
    {
        /// <summary>
        /// (string) Description of the load_balancer_type.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (int) Unique ID of the load_balancer_type.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// (int) Maximum number of SSL Certificates that can be assigned to the Load Balancer of this type.
        /// </summary>
        public readonly int MaxAssignedCertificates;
        /// <summary>
        /// (int) Maximum number of simultaneous open connections for the Load Balancer of this type.
        /// </summary>
        public readonly int MaxConnections;
        /// <summary>
        /// (int) Maximum number of services for the Load Balancer of this type.
        /// </summary>
        public readonly int MaxServices;
        /// <summary>
        /// (int) Maximum number of targets for the Load Balancer of this type.
        /// </summary>
        public readonly int MaxTargets;
        /// <summary>
        /// (string) Name of the load_balancer_type.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetLoadBalancerTypeResult(
            string description,

            int id,

            int maxAssignedCertificates,

            int maxConnections,

            int maxServices,

            int maxTargets,

            string name)
        {
            Description = description;
            Id = id;
            MaxAssignedCertificates = maxAssignedCertificates;
            MaxConnections = maxConnections;
            MaxServices = maxServices;
            MaxTargets = maxTargets;
            Name = name;
        }
    }
}
