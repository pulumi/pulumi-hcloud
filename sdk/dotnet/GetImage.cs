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
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var image1 = Output.Create(HCloud.GetImage.InvokeAsync(new HCloud.GetImageArgs
        ///         {
        ///             Id = 1234,
        ///         }));
        ///         var image2 = Output.Create(HCloud.GetImage.InvokeAsync(new HCloud.GetImageArgs
        ///         {
        ///             Name = "ubuntu-18.04",
        ///         }));
        ///         var image3 = Output.Create(HCloud.GetImage.InvokeAsync(new HCloud.GetImageArgs
        ///         {
        ///             WithSelector = "key=value",
        ///         }));
        ///         var main = new HCloud.Server("main", new HCloud.ServerArgs
        ///         {
        ///             Image = image1.Apply(image1 =&gt; image1.Name),
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetImageResult> InvokeAsync(GetImageArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetImageResult>("hcloud:index/getImage:getImage", args ?? new GetImageArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var image1 = Output.Create(HCloud.GetImage.InvokeAsync(new HCloud.GetImageArgs
        ///         {
        ///             Id = 1234,
        ///         }));
        ///         var image2 = Output.Create(HCloud.GetImage.InvokeAsync(new HCloud.GetImageArgs
        ///         {
        ///             Name = "ubuntu-18.04",
        ///         }));
        ///         var image3 = Output.Create(HCloud.GetImage.InvokeAsync(new HCloud.GetImageArgs
        ///         {
        ///             WithSelector = "key=value",
        ///         }));
        ///         var main = new HCloud.Server("main", new HCloud.ServerArgs
        ///         {
        ///             Image = image1.Apply(image1 =&gt; image1.Name),
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetImageResult> Invoke(GetImageInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetImageResult>("hcloud:index/getImage:getImage", args ?? new GetImageInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetImageArgs : Pulumi.InvokeArgs
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
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        [Input("withStatuses")]
        private List<string>? _withStatuses;

        /// <summary>
        /// List only images with the specified status, could contain `creating` or `available`.
        /// </summary>
        public List<string> WithStatuses
        {
            get => _withStatuses ?? (_withStatuses = new List<string>());
            set => _withStatuses = value;
        }

        public GetImageArgs()
        {
        }
    }

    public sealed class GetImageInvokeArgs : Pulumi.InvokeArgs
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
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        [Input("withStatuses")]
        private InputList<string>? _withStatuses;

        /// <summary>
        /// List only images with the specified status, could contain `creating` or `available`.
        /// </summary>
        public InputList<string> WithStatuses
        {
            get => _withStatuses ?? (_withStatuses = new InputList<string>());
            set => _withStatuses = value;
        }

        public GetImageInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetImageResult
    {
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
        public readonly string? WithSelector;
        public readonly ImmutableArray<string> WithStatuses;

        [OutputConstructor]
        private GetImageResult(
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

            string? withSelector,

            ImmutableArray<string> withStatuses)
        {
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
            WithSelector = withSelector;
            WithStatuses = withStatuses;
        }
    }
}
