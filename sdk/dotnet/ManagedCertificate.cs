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
    /// Obtain a Hetzner Cloud managed TLS certificate.
    /// 
    /// ## Import
    /// 
    /// Managed certificates can be imported using their `id`hcl
    /// 
    /// ```sh
    ///  $ pulumi import hcloud:index/managedCertificate:ManagedCertificate sample_certificate &lt;id&gt;
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/managedCertificate:ManagedCertificate")]
    public partial class ManagedCertificate : Pulumi.CustomResource
    {
        /// <summary>
        /// (string) PEM encoded TLS certificate.
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
        public Output<ImmutableDictionary<string, object>?> Labels { get; private set; } = null!;

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

        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedCertificate(string name, ManagedCertificateArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/managedCertificate:ManagedCertificate", name, args ?? new ManagedCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedCertificate(string name, Input<string> id, ManagedCertificateState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/managedCertificate:ManagedCertificate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ManagedCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedCertificate Get(string name, Input<string> id, ManagedCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedCertificate(name, id, state, options);
        }
    }

    public sealed class ManagedCertificateArgs : Pulumi.ResourceArgs
    {
        [Input("domainNames", required: true)]
        private InputList<string>? _domainNames;

        /// <summary>
        /// (list) Domains and subdomains covered by the certificate.
        /// </summary>
        public InputList<string> DomainNames
        {
            get => _domainNames ?? (_domainNames = new InputList<string>());
            set => _domainNames = value;
        }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// User-defined labels (key-value pairs) the
        /// certificate should be created with.
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the Certificate.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ManagedCertificateArgs()
        {
        }
    }

    public sealed class ManagedCertificateState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// (string) PEM encoded TLS certificate.
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
        private InputMap<object>? _labels;

        /// <summary>
        /// User-defined labels (key-value pairs) the
        /// certificate should be created with.
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
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

        [Input("type")]
        public Input<string>? Type { get; set; }

        public ManagedCertificateState()
        {
        }
    }
}