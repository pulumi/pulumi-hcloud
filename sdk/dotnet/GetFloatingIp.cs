// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetFloatingIp
    {
        /// <summary>
        /// Provides details about a Hetzner Cloud Floating IP.
        /// 
        /// This resource can be useful when you need to determine a Floating IP ID based on the IP address.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// 
        /// # Data Source: hcloud.FloatingIp
        /// Provides details about a Hetzner Cloud Floating IP.
        /// This resource can be useful when you need to determine a Floating IP ID based on the IP address.
        /// 
        /// {{% example %}}
        /// ### Additional Examples
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ip1 = Output.Create(HCloud.GetFloatingIp.InvokeAsync(new HCloud.GetFloatingIpArgs
        ///         {
        ///             IpAddress = "1.2.3.4",
        ///         }));
        ///         var ip2 = Output.Create(HCloud.GetFloatingIp.InvokeAsync(new HCloud.GetFloatingIpArgs
        ///         {
        ///             WithSelector = "key=value",
        ///         }));
        ///         var main = new List&lt;HCloud.FloatingIpAssignment&gt;();
        ///         for (var rangeIndex = 0; rangeIndex &lt; @var.Counter; rangeIndex++)
        ///         {
        ///             var range = new { Value = rangeIndex };
        ///             main.Add(new HCloud.FloatingIpAssignment($"main-{range.Value}", new HCloud.FloatingIpAssignmentArgs
        ///             {
        ///                 FloatingIpId = ip1.Apply(ip1 =&gt; ip1.Id),
        ///                 ServerId = hcloud_server.Main.Id,
        ///             }));
        ///         }
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFloatingIpResult> InvokeAsync(GetFloatingIpArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetFloatingIpResult>("hcloud:index/getFloatingIp:getFloatingIp", args ?? new GetFloatingIpArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a Hetzner Cloud Floating IP.
        /// 
        /// This resource can be useful when you need to determine a Floating IP ID based on the IP address.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// 
        /// # Data Source: hcloud.FloatingIp
        /// Provides details about a Hetzner Cloud Floating IP.
        /// This resource can be useful when you need to determine a Floating IP ID based on the IP address.
        /// 
        /// {{% example %}}
        /// ### Additional Examples
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ip1 = Output.Create(HCloud.GetFloatingIp.InvokeAsync(new HCloud.GetFloatingIpArgs
        ///         {
        ///             IpAddress = "1.2.3.4",
        ///         }));
        ///         var ip2 = Output.Create(HCloud.GetFloatingIp.InvokeAsync(new HCloud.GetFloatingIpArgs
        ///         {
        ///             WithSelector = "key=value",
        ///         }));
        ///         var main = new List&lt;HCloud.FloatingIpAssignment&gt;();
        ///         for (var rangeIndex = 0; rangeIndex &lt; @var.Counter; rangeIndex++)
        ///         {
        ///             var range = new { Value = rangeIndex };
        ///             main.Add(new HCloud.FloatingIpAssignment($"main-{range.Value}", new HCloud.FloatingIpAssignmentArgs
        ///             {
        ///                 FloatingIpId = ip1.Apply(ip1 =&gt; ip1.Id),
        ///                 ServerId = hcloud_server.Main.Id,
        ///             }));
        ///         }
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFloatingIpResult> Invoke(GetFloatingIpInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetFloatingIpResult>("hcloud:index/getFloatingIp:getFloatingIp", args ?? new GetFloatingIpInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFloatingIpArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Floating IP.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// IP address of the Floating IP.
        /// </summary>
        [Input("ipAddress")]
        public string? IpAddress { get; set; }

        /// <summary>
        /// Name of the Floating IP.
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

        public GetFloatingIpArgs()
        {
        }
    }

    public sealed class GetFloatingIpInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the Floating IP.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// IP address of the Floating IP.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// Name of the Floating IP.
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

        public GetFloatingIpInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetFloatingIpResult
    {
        /// <summary>
        /// (boolean) Whether delete protection is enabled.
        /// </summary>
        public readonly bool DeleteProtection;
        /// <summary>
        /// (string) Description of the Floating IP.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// (string) Home location.
        /// </summary>
        public readonly string HomeLocation;
        /// <summary>
        /// (int) Unique ID of the Floating IP.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// (string) IP Address of the Floating IP.
        /// </summary>
        public readonly string IpAddress;
        /// <summary>
        /// (string) IPv6 subnet. (Only set if `type` is `ipv6`)
        /// </summary>
        public readonly string IpNetwork;
        /// <summary>
        /// (map) User-defined labels (key-value pairs).
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (string) Name of the Floating IP.
        /// </summary>
        public readonly string? Name;
        public readonly string? Selector;
        /// <summary>
        /// (int) Server to assign the Floating IP is assigned to.
        /// </summary>
        public readonly int ServerId;
        /// <summary>
        /// (string) Type of the Floating IP.
        /// </summary>
        public readonly string Type;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetFloatingIpResult(
            bool deleteProtection,

            string description,

            string homeLocation,

            int id,

            string ipAddress,

            string ipNetwork,

            ImmutableDictionary<string, object> labels,

            string? name,

            string? selector,

            int serverId,

            string type,

            string? withSelector)
        {
            DeleteProtection = deleteProtection;
            Description = description;
            HomeLocation = homeLocation;
            Id = id;
            IpAddress = ipAddress;
            IpNetwork = ipNetwork;
            Labels = labels;
            Name = name;
            Selector = selector;
            ServerId = serverId;
            Type = type;
            WithSelector = withSelector;
        }
    }
}
