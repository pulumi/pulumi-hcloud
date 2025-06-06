// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
        /// 
        /// Use this resource to get detailed information about a specific Load Balancer Type.
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
        ///     var byId = HCloud.GetLoadBalancerType.Invoke(new()
        ///     {
        ///         Id = 1,
        ///     });
        /// 
        ///     var byName = HCloud.GetLoadBalancerType.Invoke(new()
        ///     {
        ///         Name = "lb11",
        ///     });
        /// 
        ///     var main = new HCloud.LoadBalancer("main", new()
        ///     {
        ///         Name = "my-load-balancer",
        ///         LoadBalancerType = name,
        ///         Location = "fsn1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLoadBalancerTypeResult> InvokeAsync(GetLoadBalancerTypeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLoadBalancerTypeResult>("hcloud:index/getLoadBalancerType:getLoadBalancerType", args ?? new GetLoadBalancerTypeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Hetzner Cloud Load Balancer Type.
        /// 
        /// Use this resource to get detailed information about a specific Load Balancer Type.
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
        ///     var byId = HCloud.GetLoadBalancerType.Invoke(new()
        ///     {
        ///         Id = 1,
        ///     });
        /// 
        ///     var byName = HCloud.GetLoadBalancerType.Invoke(new()
        ///     {
        ///         Name = "lb11",
        ///     });
        /// 
        ///     var main = new HCloud.LoadBalancer("main", new()
        ///     {
        ///         Name = "my-load-balancer",
        ///         LoadBalancerType = name,
        ///         Location = "fsn1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLoadBalancerTypeResult> Invoke(GetLoadBalancerTypeInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoadBalancerTypeResult>("hcloud:index/getLoadBalancerType:getLoadBalancerType", args ?? new GetLoadBalancerTypeInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Hetzner Cloud Load Balancer Type.
        /// 
        /// Use this resource to get detailed information about a specific Load Balancer Type.
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
        ///     var byId = HCloud.GetLoadBalancerType.Invoke(new()
        ///     {
        ///         Id = 1,
        ///     });
        /// 
        ///     var byName = HCloud.GetLoadBalancerType.Invoke(new()
        ///     {
        ///         Name = "lb11",
        ///     });
        /// 
        ///     var main = new HCloud.LoadBalancer("main", new()
        ///     {
        ///         Name = "my-load-balancer",
        ///         LoadBalancerType = name,
        ///         Location = "fsn1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLoadBalancerTypeResult> Invoke(GetLoadBalancerTypeInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoadBalancerTypeResult>("hcloud:index/getLoadBalancerType:getLoadBalancerType", args ?? new GetLoadBalancerTypeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoadBalancerTypeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Load Balancer Type.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// Name of the Load Balancer Type.
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
        /// ID of the Load Balancer Type.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// Name of the Load Balancer Type.
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
        /// Description of the Load Balancer Type.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// ID of the Load Balancer Type.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// Maximum number of certificates that can be assigned for the Load Balancer of this type.
        /// </summary>
        public readonly int MaxAssignedCertificates;
        /// <summary>
        /// Maximum number of simultaneous open connections for the Load Balancer of this type.
        /// </summary>
        public readonly int MaxConnections;
        /// <summary>
        /// Maximum number of services for the Load Balancer of this type.
        /// </summary>
        public readonly int MaxServices;
        /// <summary>
        /// Maximum number of targets for the Load Balancer of this type.
        /// </summary>
        public readonly int MaxTargets;
        /// <summary>
        /// Name of the Load Balancer Type.
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
