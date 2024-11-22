// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    /// <summary>
    /// Upload a TLS certificate to Hetzner Cloud.
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
    ///     var sampleCertificate = new HCloud.UploadedCertificate("sample_certificate", new()
    ///     {
    ///         Name = "test-certificate-%d",
    ///         PrivateKey = @"-----BEGIN RSA PRIVATE KEY-----
    /// MIIEpQIBAAKCAQEAorPccsHibgGLJIub5Sb1yvDvARifoKzg7MIhyAYLnJkGn9B1
    /// ...
    /// AHcjLFCNvobInLHTTmCoAxYBmEv2eakas0+n4g/LM2Ukaw1Bz+3VrVo=
    /// -----END RSA PRIVATE KEY-----
    /// ",
    ///         Certificate = @"-----BEGIN CERTIFICATE-----
    /// MIIDMDCCAhigAwIBAgIIJgROscP8RRUwDQYJKoZIhvcNAQELBQAwIDEeMBwGA1UE
    /// ...
    /// TKS8gQ==
    /// -----END CERTIFICATE-----
    /// ",
    ///         Labels = 
    ///         {
    ///             { "label_1", "value_1" },
    ///             { "label_2", "value_2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Uploaded certificates can be imported using their `id`:
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/uploadedCertificate:UploadedCertificate example "$CERTIFICATE_ID"
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/uploadedCertificate:UploadedCertificate")]
    public partial class UploadedCertificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// PEM encoded TLS certificate.
        /// </summary>
        [Output("certificate")]
        public Output<string> Certificate { get; private set; } = null!;

        /// <summary>
        /// (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// (list) Domains and subdomains covered by the certificate.
        /// </summary>
        [Output("domainNames")]
        public Output<ImmutableArray<string>> DomainNames { get; private set; } = null!;

        /// <summary>
        /// (string) Fingerprint of the certificate.
        /// </summary>
        [Output("fingerprint")]
        public Output<string> Fingerprint { get; private set; } = null!;

        /// <summary>
        /// User-defined labels (key-value pairs) the
        /// certificate should be created with.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Name of the Certificate.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
        /// </summary>
        [Output("notValidAfter")]
        public Output<string> NotValidAfter { get; private set; } = null!;

        /// <summary>
        /// (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
        /// </summary>
        [Output("notValidBefore")]
        public Output<string> NotValidBefore { get; private set; } = null!;

        /// <summary>
        /// PEM encoded private key belonging to the certificate.
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a UploadedCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UploadedCertificate(string name, UploadedCertificateArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/uploadedCertificate:UploadedCertificate", name, args ?? new UploadedCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UploadedCertificate(string name, Input<string> id, UploadedCertificateState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/uploadedCertificate:UploadedCertificate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "privateKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing UploadedCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UploadedCertificate Get(string name, Input<string> id, UploadedCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new UploadedCertificate(name, id, state, options);
        }
    }

    public sealed class UploadedCertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// PEM encoded TLS certificate.
        /// </summary>
        [Input("certificate", required: true)]
        public Input<string> Certificate { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User-defined labels (key-value pairs) the
        /// certificate should be created with.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the Certificate.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("privateKey", required: true)]
        private Input<string>? _privateKey;

        /// <summary>
        /// PEM encoded private key belonging to the certificate.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public UploadedCertificateArgs()
        {
        }
        public static new UploadedCertificateArgs Empty => new UploadedCertificateArgs();
    }

    public sealed class UploadedCertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// PEM encoded TLS certificate.
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// (string) Point in time when the Certificate was created at Hetzner Cloud (in ISO-8601 format).
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        [Input("domainNames")]
        private InputList<string>? _domainNames;

        /// <summary>
        /// (list) Domains and subdomains covered by the certificate.
        /// </summary>
        public InputList<string> DomainNames
        {
            get => _domainNames ?? (_domainNames = new InputList<string>());
            set => _domainNames = value;
        }

        /// <summary>
        /// (string) Fingerprint of the certificate.
        /// </summary>
        [Input("fingerprint")]
        public Input<string>? Fingerprint { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User-defined labels (key-value pairs) the
        /// certificate should be created with.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the Certificate.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (string) Point in time when the Certificate stops being valid (in ISO-8601 format).
        /// </summary>
        [Input("notValidAfter")]
        public Input<string>? NotValidAfter { get; set; }

        /// <summary>
        /// (string) Point in time when the Certificate becomes valid (in ISO-8601 format).
        /// </summary>
        [Input("notValidBefore")]
        public Input<string>? NotValidBefore { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// PEM encoded private key belonging to the certificate.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public UploadedCertificateState()
        {
        }
        public static new UploadedCertificateState Empty => new UploadedCertificateState();
    }
}
