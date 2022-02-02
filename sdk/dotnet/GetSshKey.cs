// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetSshKey
    {
        public static Task<GetSshKeyResult> InvokeAsync(GetSshKeyArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSshKeyResult>("hcloud:index/getSshKey:getSshKey", args ?? new GetSshKeyArgs(), options.WithDefaults());

        public static Output<GetSshKeyResult> Invoke(GetSshKeyInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetSshKeyResult>("hcloud:index/getSshKey:getSshKey", args ?? new GetSshKeyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSshKeyArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Fingerprint of the SSH Key.
        /// </summary>
        [Input("fingerprint")]
        public string? Fingerprint { get; set; }

        /// <summary>
        /// ID of the SSH Key.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// Name of the SSH Key.
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

        public GetSshKeyArgs()
        {
        }
    }

    public sealed class GetSshKeyInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Fingerprint of the SSH Key.
        /// </summary>
        [Input("fingerprint")]
        public Input<string>? Fingerprint { get; set; }

        /// <summary>
        /// ID of the SSH Key.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// Name of the SSH Key.
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

        public GetSshKeyInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetSshKeyResult
    {
        /// <summary>
        /// (string) Fingerprint of the SSH Key.
        /// </summary>
        public readonly string Fingerprint;
        /// <summary>
        /// (int) Unique ID of the SSH Key.
        /// </summary>
        public readonly int Id;
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (string) Name of the SSH Key.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// (string) Public Key of the SSH Key.
        /// </summary>
        public readonly string PublicKey;
        public readonly string? Selector;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetSshKeyResult(
            string fingerprint,

            int id,

            ImmutableDictionary<string, object> labels,

            string name,

            string publicKey,

            string? selector,

            string? withSelector)
        {
            Fingerprint = fingerprint;
            Id = id;
            Labels = labels;
            Name = name;
            PublicKey = publicKey;
            Selector = selector;
            WithSelector = withSelector;
        }
    }
}
