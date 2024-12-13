// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetImages
    {
        /// <summary>
        /// Provides details about multiple Hetzner Cloud Images.
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
        ///     var image2 = HCloud.GetImages.Invoke(new()
        ///     {
        ///         WithArchitectures = new[]
        ///         {
        ///             "x86",
        ///         },
        ///     });
        /// 
        ///     var image3 = HCloud.GetImages.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetImagesResult> InvokeAsync(GetImagesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetImagesResult>("hcloud:index/getImages:getImages", args ?? new GetImagesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about multiple Hetzner Cloud Images.
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
        ///     var image2 = HCloud.GetImages.Invoke(new()
        ///     {
        ///         WithArchitectures = new[]
        ///         {
        ///             "x86",
        ///         },
        ///     });
        /// 
        ///     var image3 = HCloud.GetImages.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetImagesResult> Invoke(GetImagesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetImagesResult>("hcloud:index/getImages:getImages", args ?? new GetImagesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about multiple Hetzner Cloud Images.
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
        ///     var image2 = HCloud.GetImages.Invoke(new()
        ///     {
        ///         WithArchitectures = new[]
        ///         {
        ///             "x86",
        ///         },
        ///     });
        /// 
        ///     var image3 = HCloud.GetImages.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetImagesResult> Invoke(GetImagesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetImagesResult>("hcloud:index/getImages:getImages", args ?? new GetImagesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetImagesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Also list images that are marked as deprecated.
        /// </summary>
        [Input("includeDeprecated")]
        public bool? IncludeDeprecated { get; set; }

        /// <summary>
        /// Sorts list by date.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        [Input("withArchitectures")]
        private List<string>? _withArchitectures;

        /// <summary>
        /// List only images with this architecture, could contain `x86` or `arm`.
        /// </summary>
        public List<string> WithArchitectures
        {
            get => _withArchitectures ?? (_withArchitectures = new List<string>());
            set => _withArchitectures = value;
        }

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

        public GetImagesArgs()
        {
        }
        public static new GetImagesArgs Empty => new GetImagesArgs();
    }

    public sealed class GetImagesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Also list images that are marked as deprecated.
        /// </summary>
        [Input("includeDeprecated")]
        public Input<bool>? IncludeDeprecated { get; set; }

        /// <summary>
        /// Sorts list by date.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        [Input("withArchitectures")]
        private InputList<string>? _withArchitectures;

        /// <summary>
        /// List only images with this architecture, could contain `x86` or `arm`.
        /// </summary>
        public InputList<string> WithArchitectures
        {
            get => _withArchitectures ?? (_withArchitectures = new InputList<string>());
            set => _withArchitectures = value;
        }

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

        public GetImagesInvokeArgs()
        {
        }
        public static new GetImagesInvokeArgs Empty => new GetImagesInvokeArgs();
    }


    [OutputType]
    public sealed class GetImagesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (list) List of all matching images. See `data.hcloud_image` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImagesImageResult> Images;
        public readonly bool? IncludeDeprecated;
        public readonly bool? MostRecent;
        public readonly ImmutableArray<string> WithArchitectures;
        public readonly string? WithSelector;
        public readonly ImmutableArray<string> WithStatuses;

        [OutputConstructor]
        private GetImagesResult(
            string id,

            ImmutableArray<Outputs.GetImagesImageResult> images,

            bool? includeDeprecated,

            bool? mostRecent,

            ImmutableArray<string> withArchitectures,

            string? withSelector,

            ImmutableArray<string> withStatuses)
        {
            Id = id;
            Images = images;
            IncludeDeprecated = includeDeprecated;
            MostRecent = mostRecent;
            WithArchitectures = withArchitectures;
            WithSelector = withSelector;
            WithStatuses = withStatuses;
        }
    }
}
