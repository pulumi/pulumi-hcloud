// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetLocations
    {
        /// <summary>
        /// Provides a list of available Hetzner Cloud Locations.
        /// This resource may be useful to create highly available infrastructure, distributed across several locations.
        /// </summary>
        public static Task<GetLocationsResult> InvokeAsync(GetLocationsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLocationsResult>("hcloud:index/getLocations:getLocations", args ?? new GetLocationsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a list of available Hetzner Cloud Locations.
        /// This resource may be useful to create highly available infrastructure, distributed across several locations.
        /// </summary>
        public static Output<GetLocationsResult> Invoke(GetLocationsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocationsResult>("hcloud:index/getLocations:getLocations", args ?? new GetLocationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLocationsArgs : global::Pulumi.InvokeArgs
    {
        [Input("locationIds")]
        private List<string>? _locationIds;

        /// <summary>
        /// (list) List of unique location identifiers. **Deprecated**: Use `locations` attribute instead.
        /// </summary>
        [Obsolete(@"Use locations list instead")]
        public List<string> LocationIds
        {
            get => _locationIds ?? (_locationIds = new List<string>());
            set => _locationIds = value;
        }

        public GetLocationsArgs()
        {
        }
        public static new GetLocationsArgs Empty => new GetLocationsArgs();
    }

    public sealed class GetLocationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("locationIds")]
        private InputList<string>? _locationIds;

        /// <summary>
        /// (list) List of unique location identifiers. **Deprecated**: Use `locations` attribute instead.
        /// </summary>
        [Obsolete(@"Use locations list instead")]
        public InputList<string> LocationIds
        {
            get => _locationIds ?? (_locationIds = new InputList<string>());
            set => _locationIds = value;
        }

        public GetLocationsInvokeArgs()
        {
        }
        public static new GetLocationsInvokeArgs Empty => new GetLocationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetLocationsResult
    {
        /// <summary>
        /// (list) List of all location descriptions. **Deprecated**: Use `locations` attribute instead.
        /// </summary>
        public readonly ImmutableArray<string> Descriptions;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (list) List of unique location identifiers. **Deprecated**: Use `locations` attribute instead.
        /// </summary>
        public readonly ImmutableArray<string> LocationIds;
        /// <summary>
        /// (list) List of all locations. See `data.hcloud_location` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLocationsLocationResult> Locations;
        /// <summary>
        /// (list) List of location names. **Deprecated**: Use `locations` attribute instead.
        /// </summary>
        public readonly ImmutableArray<string> Names;

        [OutputConstructor]
        private GetLocationsResult(
            ImmutableArray<string> descriptions,

            string id,

            ImmutableArray<string> locationIds,

            ImmutableArray<Outputs.GetLocationsLocationResult> locations,

            ImmutableArray<string> names)
        {
            Descriptions = descriptions;
            Id = id;
            LocationIds = locationIds;
            Locations = locations;
            Names = names;
        }
    }
}
