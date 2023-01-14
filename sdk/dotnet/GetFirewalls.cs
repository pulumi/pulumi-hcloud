// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetFirewalls
    {
        /// <summary>
        /// Provides details about multiple Hetzner Cloud Firewall.
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var sampleFirewall1 = HCloud.GetFirewalls.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFirewallsResult> InvokeAsync(GetFirewallsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFirewallsResult>("hcloud:index/getFirewalls:getFirewalls", args ?? new GetFirewallsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about multiple Hetzner Cloud Firewall.
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var sampleFirewall1 = HCloud.GetFirewalls.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFirewallsResult> Invoke(GetFirewallsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirewallsResult>("hcloud:index/getFirewalls:getFirewalls", args ?? new GetFirewallsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFirewallsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Sorts list by date.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetFirewallsArgs()
        {
        }
        public static new GetFirewallsArgs Empty => new GetFirewallsArgs();
    }

    public sealed class GetFirewallsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Sorts list by date.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetFirewallsInvokeArgs()
        {
        }
        public static new GetFirewallsInvokeArgs Empty => new GetFirewallsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFirewallsResult
    {
        /// <summary>
        /// (list) List of all matching firewalls. See `data.hcloud_firewall` for schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFirewallsFirewallResult> Firewalls;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? MostRecent;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetFirewallsResult(
            ImmutableArray<Outputs.GetFirewallsFirewallResult> firewalls,

            string id,

            bool? mostRecent,

            string? withSelector)
        {
            Firewalls = firewalls;
            Id = id;
            MostRecent = mostRecent;
            WithSelector = withSelector;
        }
    }
}
