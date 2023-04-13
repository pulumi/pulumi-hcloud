// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetPrimaryIp
    {
        /// <summary>
        /// Provides details about a Hetzner Cloud Primary IP.
        /// 
        /// This resource can be useful when you need to determine a Primary IP ID based on the IP address.
        /// 
        /// Side note:
        /// 
        /// If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created &amp; attached.
        /// Currently, Primary IPs can be only attached to servers.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// 
        /// # Data Source: hcloud.PrimaryIp
        /// 
        /// Provides details about a Hetzner Cloud Primary IP.
        /// This resource can be useful when you need to determine a Primary IP ID based on the IP address.
        /// 
        /// {{% example %}}
        /// ### Additional Examples
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ip1 = HCloud.GetPrimaryIp.Invoke(new()
        ///     {
        ///         IpAddress = "1.2.3.4",
        ///     });
        /// 
        ///     var ip2 = HCloud.GetPrimaryIp.Invoke(new()
        ///     {
        ///         Name = "primary_ip_1",
        ///     });
        /// 
        ///     var ip3 = HCloud.GetPrimaryIp.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        ///     // Link a server to an existing primary IP
        ///     var serverTest = new HCloud.Server("serverTest", new()
        ///     {
        ///         Image = "ubuntu-20.04",
        ///         ServerType = "cx11",
        ///         Datacenter = "fsn1-dc14",
        ///         Labels = 
        ///         {
        ///             { "test", "tessst1" },
        ///         },
        ///         PublicNets = new[]
        ///         {
        ///             new HCloud.Inputs.ServerPublicNetArgs
        ///             {
        ///                 Ipv4 = hcloud_primary_ip.Ip_1.Id,
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPrimaryIpResult> InvokeAsync(GetPrimaryIpArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrimaryIpResult>("hcloud:index/getPrimaryIp:getPrimaryIp", args ?? new GetPrimaryIpArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a Hetzner Cloud Primary IP.
        /// 
        /// This resource can be useful when you need to determine a Primary IP ID based on the IP address.
        /// 
        /// Side note:
        /// 
        /// If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created &amp; attached.
        /// Currently, Primary IPs can be only attached to servers.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// 
        /// # Data Source: hcloud.PrimaryIp
        /// 
        /// Provides details about a Hetzner Cloud Primary IP.
        /// This resource can be useful when you need to determine a Primary IP ID based on the IP address.
        /// 
        /// {{% example %}}
        /// ### Additional Examples
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using HCloud = Pulumi.HCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ip1 = HCloud.GetPrimaryIp.Invoke(new()
        ///     {
        ///         IpAddress = "1.2.3.4",
        ///     });
        /// 
        ///     var ip2 = HCloud.GetPrimaryIp.Invoke(new()
        ///     {
        ///         Name = "primary_ip_1",
        ///     });
        /// 
        ///     var ip3 = HCloud.GetPrimaryIp.Invoke(new()
        ///     {
        ///         WithSelector = "key=value",
        ///     });
        /// 
        ///     // Link a server to an existing primary IP
        ///     var serverTest = new HCloud.Server("serverTest", new()
        ///     {
        ///         Image = "ubuntu-20.04",
        ///         ServerType = "cx11",
        ///         Datacenter = "fsn1-dc14",
        ///         Labels = 
        ///         {
        ///             { "test", "tessst1" },
        ///         },
        ///         PublicNets = new[]
        ///         {
        ///             new HCloud.Inputs.ServerPublicNetArgs
        ///             {
        ///                 Ipv4 = hcloud_primary_ip.Ip_1.Id,
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetPrimaryIpResult> Invoke(GetPrimaryIpInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrimaryIpResult>("hcloud:index/getPrimaryIp:getPrimaryIp", args ?? new GetPrimaryIpInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrimaryIpArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (int) ID of the assigned resource.
        /// </summary>
        [Input("assigneeId")]
        public int? AssigneeId { get; set; }

        /// <summary>
        /// ID of the Primary IP.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// IP address of the Primary IP.
        /// </summary>
        [Input("ipAddress")]
        public string? IpAddress { get; set; }

        /// <summary>
        /// Name of the Primary IP.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        public GetPrimaryIpArgs()
        {
        }
        public static new GetPrimaryIpArgs Empty => new GetPrimaryIpArgs();
    }

    public sealed class GetPrimaryIpInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// (int) ID of the assigned resource.
        /// </summary>
        [Input("assigneeId")]
        public Input<int>? AssigneeId { get; set; }

        /// <summary>
        /// ID of the Primary IP.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// IP address of the Primary IP.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// Name of the Primary IP.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
        /// </summary>
        [Input("withSelector")]
        public Input<string>? WithSelector { get; set; }

        public GetPrimaryIpInvokeArgs()
        {
        }
        public static new GetPrimaryIpInvokeArgs Empty => new GetPrimaryIpInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrimaryIpResult
    {
        /// <summary>
        /// (int) ID of the assigned resource.
        /// </summary>
        public readonly int AssigneeId;
        /// <summary>
        /// (string) The type of the assigned resource.
        /// </summary>
        public readonly string AssigneeType;
        /// <summary>
        /// (bool) Whether auto delete is enabled.
        /// </summary>
        public readonly bool AutoDelete;
        /// <summary>
        /// (string) The datacenter name of the Primary IP.
        /// </summary>
        public readonly string Datacenter;
        /// <summary>
        /// (bool) Whether delete protection is enabled.
        /// </summary>
        public readonly bool DeleteProtection;
        /// <summary>
        /// (int) Unique ID of the Primary IP.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// (string) IP Address of the Primary IP.
        /// </summary>
        public readonly string IpAddress;
        /// <summary>
        /// (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
        /// </summary>
        public readonly string IpNetwork;
        /// <summary>
        /// (string) Description of the Primary IP.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (string) Name of the Primary IP.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// (string) Type of the Primary IP.
        /// </summary>
        public readonly string Type;
        public readonly string? WithSelector;

        [OutputConstructor]
        private GetPrimaryIpResult(
            int assigneeId,

            string assigneeType,

            bool autoDelete,

            string datacenter,

            bool deleteProtection,

            int id,

            string ipAddress,

            string ipNetwork,

            ImmutableDictionary<string, object> labels,

            string? name,

            string type,

            string? withSelector)
        {
            AssigneeId = assigneeId;
            AssigneeType = assigneeType;
            AutoDelete = autoDelete;
            Datacenter = datacenter;
            DeleteProtection = deleteProtection;
            Id = id;
            IpAddress = ipAddress;
            IpNetwork = ipNetwork;
            Labels = labels;
            Name = name;
            Type = type;
            WithSelector = withSelector;
        }
    }
}
