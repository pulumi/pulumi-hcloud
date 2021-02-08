// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetServerTypes
    {
        /// <summary>
        /// Provides a list of available Hetzner Cloud Server Types.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ds = Output.Create(HCloud.GetServerTypes.InvokeAsync());
        ///         var workers = new List&lt;HCloud.Server&gt;();
        ///         for (var rangeIndex = 0; rangeIndex &lt; 3; rangeIndex++)
        ///         {
        ///             var range = new { Value = rangeIndex };
        ///             workers.Add(new HCloud.Server($"workers-{range.Value}", new HCloud.ServerArgs
        ///             {
        ///                 Image = "debian-9",
        ///                 ServerType = ds.Apply(ds =&gt; ds.Names)[range.Value],
        ///             }));
        ///         }
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetServerTypesResult> InvokeAsync(GetServerTypesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServerTypesResult>("hcloud:index/getServerTypes:getServerTypes", args ?? new GetServerTypesArgs(), options.WithVersion());
    }


    public sealed class GetServerTypesArgs : Pulumi.InvokeArgs
    {
        [Input("serverTypeIds")]
        private List<string>? _serverTypeIds;

        /// <summary>
        /// (list) List of unique Server Types identifiers.
        /// </summary>
        public List<string> ServerTypeIds
        {
            get => _serverTypeIds ?? (_serverTypeIds = new List<string>());
            set => _serverTypeIds = value;
        }

        public GetServerTypesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetServerTypesResult
    {
        /// <summary>
        /// (list) List of all Server Types descriptions.
        /// </summary>
        public readonly ImmutableArray<string> Descriptions;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (list) List of Server Types names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        /// <summary>
        /// (list) List of unique Server Types identifiers.
        /// </summary>
        public readonly ImmutableArray<string> ServerTypeIds;

        [OutputConstructor]
        private GetServerTypesResult(
            ImmutableArray<string> descriptions,

            string id,

            ImmutableArray<string> names,

            ImmutableArray<string> serverTypeIds)
        {
            Descriptions = descriptions;
            Id = id;
            Names = names;
            ServerTypeIds = serverTypeIds;
        }
    }
}