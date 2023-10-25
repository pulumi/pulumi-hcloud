// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetLocation
    {
        /// <summary>
        /// Provides details about a specific Hetzner Cloud Location.
        /// Use this resource to get detailed information about specific location.
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
        ///     var l1 = HCloud.GetLocation.Invoke(new()
        ///     {
        ///         Name = "fsn1",
        ///     });
        /// 
        ///     var l2 = HCloud.GetLocation.Invoke(new()
        ///     {
        ///         Id = 1,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetLocationResult> InvokeAsync(GetLocationArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLocationResult>("hcloud:index/getLocation:getLocation", args ?? new GetLocationArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Hetzner Cloud Location.
        /// Use this resource to get detailed information about specific location.
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
        ///     var l1 = HCloud.GetLocation.Invoke(new()
        ///     {
        ///         Name = "fsn1",
        ///     });
        /// 
        ///     var l2 = HCloud.GetLocation.Invoke(new()
        ///     {
        ///         Id = 1,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetLocationResult> Invoke(GetLocationInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocationResult>("hcloud:index/getLocation:getLocation", args ?? new GetLocationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLocationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the location.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// Name of the location.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetLocationArgs()
        {
        }
        public static new GetLocationArgs Empty => new GetLocationArgs();
    }

    public sealed class GetLocationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the location.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// Name of the location.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetLocationInvokeArgs()
        {
        }
        public static new GetLocationInvokeArgs Empty => new GetLocationInvokeArgs();
    }


    [OutputType]
    public sealed class GetLocationResult
    {
        /// <summary>
        /// (string) City of the location.
        /// </summary>
        public readonly string City;
        /// <summary>
        /// (string) Country of the location.
        /// </summary>
        public readonly string Country;
        /// <summary>
        /// (string) Description of the location.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (int) Unique ID of the location.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// (float) Latitude of the city.
        /// </summary>
        public readonly double Latitude;
        /// <summary>
        /// (float) Longitude of the city.
        /// </summary>
        public readonly double Longitude;
        /// <summary>
        /// (string) Name of the location.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (string) Network Zone of the location.
        /// </summary>
        public readonly string NetworkZone;

        [OutputConstructor]
        private GetLocationResult(
            string city,

            string country,

            string description,

            int id,

            double latitude,

            double longitude,

            string name,

            string networkZone)
        {
            City = city;
            Country = country;
            Description = description;
            Id = id;
            Latitude = latitude;
            Longitude = longitude;
            Name = name;
            NetworkZone = networkZone;
        }
    }
}
