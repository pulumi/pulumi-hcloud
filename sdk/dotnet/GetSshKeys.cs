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
        /// <summary>
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
        ///     var all = HCloud.GetSshKeys.Invoke();
        /// 
        ///     var byLabel = HCloud.GetSshKeys.Invoke(new()
        ///     {
        ///         WithSelector = "foo=bar",
        ///     });
        /// 
        ///     var main = new HCloud.Server("main", new()
        ///     {
        ///         SshKeys = all.Apply(getSshKeysResult =&gt; getSshKeysResult.SshKeys).Select(__item =&gt; __item.Name).ToList(),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSshKeysResult> InvokeAsync(GetSshKeysArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSshKeysResult>("hcloud:index/getSshKeys:getSshKeys", args ?? new GetSshKeysArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var all = HCloud.GetSshKeys.Invoke();
        /// 
        ///     var byLabel = HCloud.GetSshKeys.Invoke(new()
        ///     {
        ///         WithSelector = "foo=bar",
        ///     });
        /// 
        ///     var main = new HCloud.Server("main", new()
        ///     {
        ///         SshKeys = all.Apply(getSshKeysResult =&gt; getSshKeysResult.SshKeys).Select(__item =&gt; __item.Name).ToList(),
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSshKeysResult> Invoke(GetSshKeysInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSshKeysResult>("hcloud:index/getSshKeys:getSshKeys", args ?? new GetSshKeysInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSshKeysArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Filter results using a [Label Selector](https://docs.hetzner.cloud/#label-selector)
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
        /// The ID of this resource.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Filter results using a [Label Selector](https://docs.hetzner.cloud/#label-selector)
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
        /// The ID of this resource.
        /// </summary>
        public readonly string? Id;
        public readonly ImmutableArray<Outputs.GetSshKeysSshKeyResult> SshKeys;
        /// <summary>
        /// Filter results using a [Label Selector](https://docs.hetzner.cloud/#label-selector)
        /// </summary>
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetSshKeysResult(
            string? id,

            ImmutableArray<Outputs.GetSshKeysSshKeyResult> sshKeys,

            string? withSelector)
        {
            Id = id;
            SshKeys = sshKeys;
            WithSelector = withSelector;
        }
    }
}
