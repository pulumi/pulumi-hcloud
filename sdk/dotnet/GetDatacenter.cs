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
        /// Use this resource to get detailed information about specific datacenter.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDatacenterResult> InvokeAsync(GetDatacenterArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDatacenterResult>("hcloud:index/getDatacenter:getDatacenter", args ?? new GetDatacenterArgs(), options.WithVersion());
    }


    public sealed class GetDatacenterArgs : Pulumi.InvokeArgs
    {
        [Input("id")]
        public int? Id { get; set; }

        [Input("name")]
        public string? Name { get; set; }

        public GetDatacenterArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDatacenterResult
    {
        public readonly ImmutableArray<int> AvailableServerTypeIds;
        public readonly string Description;
        public readonly int Id;
        public readonly ImmutableDictionary<string, object> Location;
        public readonly string Name;
        public readonly ImmutableArray<int> SupportedServerTypeIds;

        [OutputConstructor]
        private GetDatacenterResult(
            ImmutableArray<int> availableServerTypeIds,

            string description,

            int id,

            ImmutableDictionary<string, object> location,

            string name,

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
