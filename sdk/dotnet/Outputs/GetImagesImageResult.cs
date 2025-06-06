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
    public sealed class GetImagesImageResult
    {
        public readonly string Architecture;
        public readonly string Created;
        public readonly string Deprecated;
        public readonly string Description;
        public readonly int Id;
        public readonly ImmutableDictionary<string, string> Labels;
        public readonly string Name;
        public readonly string OsFlavor;
        public readonly string OsVersion;
        public readonly bool RapidDeploy;
        public readonly string? Selector;
        public readonly string Type;

        [OutputConstructor]
        private GetImagesImageResult(
            string architecture,

            string created,

            string deprecated,

            string description,

            int id,

            ImmutableDictionary<string, string> labels,

            string name,

            string osFlavor,

            string osVersion,

            bool rapidDeploy,

            string? selector,

            string type)
        {
            Architecture = architecture;
            Created = created;
            Deprecated = deprecated;
            Description = description;
            Id = id;
            Labels = labels;
            Name = name;
            OsFlavor = osFlavor;
            OsVersion = osVersion;
            RapidDeploy = rapidDeploy;
            Selector = selector;
            Type = type;
        }
    }
}
