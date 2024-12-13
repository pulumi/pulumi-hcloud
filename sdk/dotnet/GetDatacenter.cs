// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetDatacenter
    {
        /// <summary>
        /// Provides details about a specific Hetzner Cloud Datacenter.
        /// 
        /// Use this resource to get detailed information about a specific Datacenter.
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
        ///     var byId = HCloud.GetDatacenter.Invoke(new()
        ///     {
        ///         Id = 4,
        ///     });
        /// 
        ///     var byName = HCloud.GetDatacenter.Invoke(new()
        ///     {
        ///         Name = "fsn1-dc14",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDatacenterResult> InvokeAsync(GetDatacenterArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDatacenterResult>("hcloud:index/getDatacenter:getDatacenter", args ?? new GetDatacenterArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Hetzner Cloud Datacenter.
        /// 
        /// Use this resource to get detailed information about a specific Datacenter.
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
        ///     var byId = HCloud.GetDatacenter.Invoke(new()
        ///     {
        ///         Id = 4,
        ///     });
        /// 
        ///     var byName = HCloud.GetDatacenter.Invoke(new()
        ///     {
        ///         Name = "fsn1-dc14",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDatacenterResult> Invoke(GetDatacenterInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatacenterResult>("hcloud:index/getDatacenter:getDatacenter", args ?? new GetDatacenterInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Hetzner Cloud Datacenter.
        /// 
        /// Use this resource to get detailed information about a specific Datacenter.
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
        ///     var byId = HCloud.GetDatacenter.Invoke(new()
        ///     {
        ///         Id = 4,
        ///     });
        /// 
        ///     var byName = HCloud.GetDatacenter.Invoke(new()
        ///     {
        ///         Name = "fsn1-dc14",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDatacenterResult> Invoke(GetDatacenterInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatacenterResult>("hcloud:index/getDatacenter:getDatacenter", args ?? new GetDatacenterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatacenterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Datacenter.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// Name of the Datacenter.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetDatacenterArgs()
        {
        }
        public static new GetDatacenterArgs Empty => new GetDatacenterArgs();
    }

    public sealed class GetDatacenterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Datacenter.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// Name of the Datacenter.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetDatacenterInvokeArgs()
        {
        }
        public static new GetDatacenterInvokeArgs Empty => new GetDatacenterInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatacenterResult
    {
        /// <summary>
        /// List of currently available Server Types in the Datacenter.
        /// </summary>
        public readonly ImmutableArray<int> AvailableServerTypeIds;
        /// <summary>
        /// Description of the Datacenter.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// ID of the Datacenter.
        /// </summary>
        public readonly int? Id;
        /// <summary>
        /// Location of the Datacenter. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Location;
        /// <summary>
        /// Name of the Datacenter.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// List of supported Server Types in the Datacenter.
        /// </summary>
        public readonly ImmutableArray<int> SupportedServerTypeIds;

        [OutputConstructor]
        private GetDatacenterResult(
            ImmutableArray<int> availableServerTypeIds,

            string description,

            int? id,

            ImmutableDictionary<string, string> location,

            string? name,

            ImmutableArray<int> supportedServerTypeIds)
        {
            AvailableServerTypeIds = availableServerTypeIds;
            Description = description;
            Id = id;
            Location = location;
            Name = name;
            SupportedServerTypeIds = supportedServerTypeIds;
        }
    }
}
