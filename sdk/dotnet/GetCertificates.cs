// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetCertificates
    {
        /// <summary>
        /// layout: "hcloud"
        /// page_title: "Hetzner Cloud: hcloud.getCertificates"
        /// sidebar_current: "docs-hcloud-datasource-certificate-x"
        /// description: |-
        /// Provides details about multiple Hetzner Cloud Certificates.
        /// &lt;!-- yaml: line 6: could not find expected ':' --&gt;
        /// 
        /// # hcloud.getCertificates
        /// Provides details about multiple Hetzner Cloud Certificates.
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
        ///     var sampleCertificate1 = HCloud.GetCertificates.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCertificatesResult> InvokeAsync(GetCertificatesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCertificatesResult>("hcloud:index/getCertificates:getCertificates", args ?? new GetCertificatesArgs(), options.WithDefaults());

        /// <summary>
        /// layout: "hcloud"
        /// page_title: "Hetzner Cloud: hcloud.getCertificates"
        /// sidebar_current: "docs-hcloud-datasource-certificate-x"
        /// description: |-
        /// Provides details about multiple Hetzner Cloud Certificates.
        /// &lt;!-- yaml: line 6: could not find expected ':' --&gt;
        /// 
        /// # hcloud.getCertificates
        /// Provides details about multiple Hetzner Cloud Certificates.
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
        ///     var sampleCertificate1 = HCloud.GetCertificates.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCertificatesResult> Invoke(GetCertificatesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCertificatesResult>("hcloud:index/getCertificates:getCertificates", args ?? new GetCertificatesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCertificatesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetCertificatesArgs()
        {
        }
        public static new GetCertificatesArgs Empty => new GetCertificatesArgs();
    }

    public sealed class GetCertificatesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetCertificatesInvokeArgs()
        {
        }
        public static new GetCertificatesInvokeArgs Empty => new GetCertificatesInvokeArgs();
    }


    [OutputType]
    public sealed class GetCertificatesResult
    {
        /// <summary>
        /// (list) List of all matching certificates. See `data.hcloud_certificate` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCertificatesCertificateResult> Certificates;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetCertificatesResult(
            ImmutableArray<Outputs.GetCertificatesCertificateResult> certificates,

            string id,

            string? withSelector)
        {
            Certificates = certificates;
            Id = id;
            WithSelector = withSelector;
        }
    }
}
