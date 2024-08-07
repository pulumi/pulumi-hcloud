// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetServerType
    {
        /// <summary>
        /// Provides details about a specific Hetzner Cloud Server Type.
        /// Use this resource to get detailed information about specific Server Type.
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
        ///     var ds1 = HCloud.GetServerType.Invoke(new()
        ///     {
        ///         Name = "cx22",
        ///     });
        /// 
        ///     var ds2 = HCloud.GetServerType.Invoke(new()
        ///     {
        ///         Id = 1,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServerTypeResult> InvokeAsync(GetServerTypeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServerTypeResult>("hcloud:index/getServerType:getServerType", args ?? new GetServerTypeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Hetzner Cloud Server Type.
        /// Use this resource to get detailed information about specific Server Type.
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
        ///     var ds1 = HCloud.GetServerType.Invoke(new()
        ///     {
        ///         Name = "cx22",
        ///     });
        /// 
        ///     var ds2 = HCloud.GetServerType.Invoke(new()
        ///     {
        ///         Id = 1,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServerTypeResult> Invoke(GetServerTypeInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServerTypeResult>("hcloud:index/getServerType:getServerType", args ?? new GetServerTypeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServerTypeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (Optional, string) Date when the deprecation of the server type was announced. Only set when the server type is deprecated.
        /// </summary>
        [Input("deprecationAnnounced")]
        public string? DeprecationAnnounced { get; set; }

        /// <summary>
        /// ID of the server_type.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// Name of the server_type.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// (Optional, string) Date when the server type will not be available for new servers. Only set when the server type is deprecated.
        /// </summary>
        [Input("unavailableAfter")]
        public string? UnavailableAfter { get; set; }

        public GetServerTypeArgs()
        {
        }
        public static new GetServerTypeArgs Empty => new GetServerTypeArgs();
    }

    public sealed class GetServerTypeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (Optional, string) Date when the deprecation of the server type was announced. Only set when the server type is deprecated.
        /// </summary>
        [Input("deprecationAnnounced")]
        public Input<string>? DeprecationAnnounced { get; set; }

        /// <summary>
        /// ID of the server_type.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// Name of the server_type.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Optional, string) Date when the server type will not be available for new servers. Only set when the server type is deprecated.
        /// </summary>
        [Input("unavailableAfter")]
        public Input<string>? UnavailableAfter { get; set; }

        public GetServerTypeInvokeArgs()
        {
        }
        public static new GetServerTypeInvokeArgs Empty => new GetServerTypeInvokeArgs();
    }


    [OutputType]
    public sealed class GetServerTypeResult
    {
        /// <summary>
        /// (string) Architecture of the server_type.
        /// </summary>
        public readonly string Architecture;
        /// <summary>
        /// (int) Number of cpu cores a Server of this type will have.
        /// </summary>
        public readonly int Cores;
        public readonly string CpuType;
        /// <summary>
        /// (Optional, string) Date when the deprecation of the server type was announced. Only set when the server type is deprecated.
        /// </summary>
        public readonly string DeprecationAnnounced;
        /// <summary>
        /// (string) Description of the server_type.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (int) Disk size a Server of this type will have in GB.
        /// </summary>
        public readonly int Disk;
        /// <summary>
        /// (int) Unique ID of the server_type.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// (int) Free traffic per month in bytes. **Warning**: This field is deprecated and will report `0` after 2024-08-05.
        /// </summary>
        public readonly int IncludedTraffic;
        /// <summary>
        /// (bool) Deprecation status of server type.
        /// </summary>
        public readonly bool IsDeprecated;
        /// <summary>
        /// (int) Memory a Server of this type will have in GB.
        /// </summary>
        public readonly int Memory;
        /// <summary>
        /// (string) Name of the server_type.
        /// </summary>
        public readonly string Name;
        public readonly string StorageType;
        /// <summary>
        /// (Optional, string) Date when the server type will not be available for new servers. Only set when the server type is deprecated.
        /// </summary>
        public readonly string UnavailableAfter;

        [OutputConstructor]
        private GetServerTypeResult(
            string architecture,

            int cores,

            string cpuType,

            string deprecationAnnounced,

            string description,

            int disk,

            int id,

            int includedTraffic,

            bool isDeprecated,

            int memory,

            string name,

            string storageType,

            string unavailableAfter)
        {
            Architecture = architecture;
            Cores = cores;
            CpuType = cpuType;
            DeprecationAnnounced = deprecationAnnounced;
            Description = description;
            Disk = disk;
            Id = id;
            IncludedTraffic = includedTraffic;
            IsDeprecated = isDeprecated;
            Memory = memory;
            Name = name;
            StorageType = storageType;
            UnavailableAfter = unavailableAfter;
        }
    }
}
