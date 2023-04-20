// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetImage
    {
        /// <summary>
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
        ///     var image1 = HCloud.GetImage.Invoke(new()
        ///     {
        ///         Id = 1234,
        ///     });
        /// 
        ///     var image2 = HCloud.GetImage.Invoke(new()
        ///     {
        ///         Name = "ubuntu-18.04",
        ///         WithArchitecture = "x86",
        ///     });
        /// 
        ///     var image3 = HCloud.GetImage.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        ///     var main = new HCloud.Server("main", new()
        ///     {
        ///         Image = image1.Apply(getImageResult =&gt; getImageResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetImageResult> InvokeAsync(GetImageArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetImageResult>("hcloud:index/getImage:getImage", args ?? new GetImageArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var image1 = HCloud.GetImage.Invoke(new()
        ///     {
        ///         Id = 1234,
        ///     });
        /// 
        ///     var image2 = HCloud.GetImage.Invoke(new()
        ///     {
        ///         Name = "ubuntu-18.04",
        ///         WithArchitecture = "x86",
        ///     });
        /// 
        ///     var image3 = HCloud.GetImage.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        ///     var main = new HCloud.Server("main", new()
        ///     {
        ///         Image = image1.Apply(getImageResult =&gt; getImageResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetImageResult> Invoke(GetImageInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetImageResult>("hcloud:index/getImage:getImage", args ?? new GetImageInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetImageArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Image.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// If more than one result is returned, use the most recent Image.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        /// <summary>
        /// Name of the Image.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("selector")]
        public string? Selector { get; set; }

        /// <summary>
        /// Select only images with this architecture, could be `x86` (default) or `arm`.
        /// </summary>
        [Input("withArchitecture")]
        public string? WithArchitecture { get; set; }

        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        [Input("withStatuses")]
        private List<string>? _withStatuses;

        /// <summary>
        /// Select only images with the specified status, could contain `creating` or `available`.
        /// </summary>
        public List<string> WithStatuses
        {
            get => _withStatuses ?? (_withStatuses = new List<string>());
            set => _withStatuses = value;
        }

        public GetImageArgs()
        {
        }
        public static new GetImageArgs Empty => new GetImageArgs();
    }

    public sealed class GetImageInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Image.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// If more than one result is returned, use the most recent Image.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        /// <summary>
        /// Name of the Image.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("selector")]
        public Input<string>? Selector { get; set; }

        /// <summary>
        /// Select only images with this architecture, could be `x86` (default) or `arm`.
        /// </summary>
        [Input("withArchitecture")]
        public Input<string>? WithArchitecture { get; set; }

        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        [Input("withStatuses")]
        private InputList<string>? _withStatuses;

        /// <summary>
        /// Select only images with the specified status, could contain `creating` or `available`.
        /// </summary>
        public InputList<string> WithStatuses
        {
            get => _withStatuses ?? (_withStatuses = new InputList<string>());
            set => _withStatuses = value;
        }

        public GetImageInvokeArgs()
        {
        }
        public static new GetImageInvokeArgs Empty => new GetImageInvokeArgs();
    }


    [OutputType]
    public sealed class GetImageResult
    {
        /// <summary>
        /// (string) Architecture of the Image.
        /// </summary>
        public readonly string Architecture;
        /// <summary>
        /// (string) Date when the Image was created (in ISO-8601 format).
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// (string) Point in time when the image is considered to be deprecated (in ISO-8601 format).
        /// </summary>
        public readonly string Deprecated;
        /// <summary>
        /// (string) Description of the Image.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (int) Unique ID of the Image.
        /// </summary>
        public readonly int Id;
        public readonly ImmutableDictionary<string, object> Labels;
        public readonly bool? MostRecent;
        /// <summary>
        /// (string) Name of the Image, only present when the Image is of type `system`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (string) Flavor of operating system contained in the image, could be `ubuntu`, `centos`, `debian`, `fedora` or `unknown`.
        /// </summary>
        public readonly string OsFlavor;
        /// <summary>
        /// (string) Operating system version.
        /// </summary>
        public readonly string OsVersion;
        /// <summary>
        /// (bool) Indicates that rapid deploy of the image is available.
        /// </summary>
        public readonly bool RapidDeploy;
        public readonly string? Selector;
        /// <summary>
        /// (string) Type of the Image, could be `system`, `backup` or `snapshot`.
        /// </summary>
        public readonly string Type;
        public readonly string? WithArchitecture;
        public readonly string? WithSelector;
        public readonly ImmutableArray<string> WithStatuses;

        [OutputConstructor]
        private GetImageResult(
            string architecture,

            string created,

            string deprecated,

            string description,

            int id,

            ImmutableDictionary<string, object> labels,

            bool? mostRecent,

            string name,

            string osFlavor,

            string osVersion,

            bool rapidDeploy,

            string? selector,

            string type,

            string? withArchitecture,

            string? withSelector,

            ImmutableArray<string> withStatuses)
        {
            Architecture = architecture;
            Created = created;
            Deprecated = deprecated;
            Description = description;
            Id = id;
            Labels = labels;
            MostRecent = mostRecent;
            Name = name;
            OsFlavor = osFlavor;
            OsVersion = osVersion;
            RapidDeploy = rapidDeploy;
            Selector = selector;
            Type = type;
            WithArchitecture = withArchitecture;
            WithSelector = withSelector;
            WithStatuses = withStatuses;
        }
    }
}
