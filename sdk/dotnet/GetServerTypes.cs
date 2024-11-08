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
        /// </summary>
        public static Task<GetServerTypesResult> InvokeAsync(GetServerTypesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServerTypesResult>("hcloud:index/getServerTypes:getServerTypes", args ?? new GetServerTypesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a list of available Hetzner Cloud Server Types.
        /// </summary>
        public static Output<GetServerTypesResult> Invoke(GetServerTypesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServerTypesResult>("hcloud:index/getServerTypes:getServerTypes", args ?? new GetServerTypesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServerTypesArgs : global::Pulumi.InvokeArgs
    {
        [Input("descriptions")]
        private List<string>? _descriptions;
        [Obsolete(@"Use server_types list instead")]
        public List<string> Descriptions
        {
            get => _descriptions ?? (_descriptions = new List<string>());
            set => _descriptions = value;
        }

        [Input("id")]
        public string? Id { get; set; }

        [Input("names")]
        private List<string>? _names;
        [Obsolete(@"Use server_types list instead")]
        public List<string> Names
        {
            get => _names ?? (_names = new List<string>());
            set => _names = value;
        }

        [Input("serverTypeIds")]
        private List<string>? _serverTypeIds;
        [Obsolete(@"Use server_types list instead")]
        public List<string> ServerTypeIds
        {
            get => _serverTypeIds ?? (_serverTypeIds = new List<string>());
            set => _serverTypeIds = value;
        }

        public GetServerTypesArgs()
        {
        }
        public static new GetServerTypesArgs Empty => new GetServerTypesArgs();
    }

    public sealed class GetServerTypesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("descriptions")]
        private InputList<string>? _descriptions;
        [Obsolete(@"Use server_types list instead")]
        public InputList<string> Descriptions
        {
            get => _descriptions ?? (_descriptions = new InputList<string>());
            set => _descriptions = value;
        }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("names")]
        private InputList<string>? _names;
        [Obsolete(@"Use server_types list instead")]
        public InputList<string> Names
        {
            get => _names ?? (_names = new InputList<string>());
            set => _names = value;
        }

        [Input("serverTypeIds")]
        private InputList<string>? _serverTypeIds;
        [Obsolete(@"Use server_types list instead")]
        public InputList<string> ServerTypeIds
        {
            get => _serverTypeIds ?? (_serverTypeIds = new InputList<string>());
            set => _serverTypeIds = value;
        }

        public GetServerTypesInvokeArgs()
        {
        }
        public static new GetServerTypesInvokeArgs Empty => new GetServerTypesInvokeArgs();
    }


    [OutputType]
    public sealed class GetServerTypesResult
    {
        public readonly ImmutableArray<string> Descriptions;
        public readonly string? Id;
        public readonly ImmutableArray<string> Names;
        public readonly ImmutableArray<string> ServerTypeIds;
        /// <summary>
        /// (list) List of all server types. See `data.hcloud_server_type` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServerTypesServerTypeResult> ServerTypes;

        [OutputConstructor]
        private GetServerTypesResult(
            ImmutableArray<string> descriptions,

            string? id,

            ImmutableArray<string> names,

            ImmutableArray<string> serverTypeIds,

            ImmutableArray<Outputs.GetServerTypesServerTypeResult> serverTypes)
        {
            Descriptions = descriptions;
            Id = id;
            Names = names;
            ServerTypeIds = serverTypeIds;
            ServerTypes = serverTypes;
        }
    }
}
