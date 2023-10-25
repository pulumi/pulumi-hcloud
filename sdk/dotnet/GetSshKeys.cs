// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetSshKeys
    {
        public static Task<GetSshKeysResult> InvokeAsync(GetSshKeysArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSshKeysResult>("hcloud:index/getSshKeys:getSshKeys", args ?? new GetSshKeysArgs(), options.WithDefaults());

        public static Output<GetSshKeysResult> Invoke(GetSshKeysInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSshKeysResult>("hcloud:index/getSshKeys:getSshKeys", args ?? new GetSshKeysInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSshKeysArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetSshKeysArgs()
        {
        }
        public static new GetSshKeysArgs Empty => new GetSshKeysArgs();
    }

    public sealed class GetSshKeysInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetSshKeysInvokeArgs()
        {
        }
        public static new GetSshKeysInvokeArgs Empty => new GetSshKeysInvokeArgs();
    }


    [OutputType]
    public sealed class GetSshKeysResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (list) List of all matches SSH keys. See `data.hcloud_ssh_key` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSshKeysSshKeyResult> SshKeys;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetSshKeysResult(
            string id,

            ImmutableArray<Outputs.GetSshKeysSshKeyResult> sshKeys,

            string? withSelector)
        {
            Id = id;
            SshKeys = sshKeys;
            WithSelector = withSelector;
        }
    }
}
