// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud.Outputs
{

    [OutputType]
    public sealed class GetLocationsLocationResult
    {
        /// <summary>
        /// Name of the closest city to the Location. City name and optionally state in short form.
        /// </summary>
        public readonly string City;
        /// <summary>
        /// Country the Location resides in. ISO 3166-1 alpha-2 code of the country.
        /// </summary>
        public readonly string Country;
        /// <summary>
        /// Description of the Location.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// ID of the Location.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// Latitude of the city closest to the Location.
        /// </summary>
        public readonly double Latitude;
        /// <summary>
        /// Longitude of the city closest to the Location.
        /// </summary>
        public readonly double Longitude;
        /// <summary>
        /// Name of the Location.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Name of the Network Zone this Location resides in.
        /// </summary>
        public readonly string NetworkZone;

        [OutputConstructor]
        private GetLocationsLocationResult(
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
