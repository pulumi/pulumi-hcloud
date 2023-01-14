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
    /// Provides a Hetzner Cloud Reverse DNS Entry to create, modify and reset reverse dns entries for Hetzner Cloud Servers, Floating IPs or Load Balancers.
    /// 
    /// ## Example Usage
    /// 
    /// For servers:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var node1 = new HCloud.Server("node1", new()
    ///     {
    ///         Image = "debian-9",
    ///         ServerType = "cx11",
    ///     });
    /// 
    ///     var master = new HCloud.Rdns("master", new()
    ///     {
    ///         ServerId = node1.Id,
    ///         IpAddress = node1.Ipv4Address,
    ///         DnsPtr = "example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// For Floating IPs:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var floating1 = new HCloud.FloatingIp("floating1", new()
    ///     {
    ///         HomeLocation = "nbg1",
    ///         Type = "ipv4",
    ///     });
    /// 
    ///     var floatingMaster = new HCloud.Rdns("floatingMaster", new()
    ///     {
    ///         DnsPtr = "example.com",
    ///         FloatingIpId = floating1.Id,
    ///         IpAddress = floating1.IpAddress,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// For Load Balancers:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var loadBalancer1 = new HCloud.LoadBalancer("loadBalancer1", new()
    ///     {
    ///         LoadBalancerType = "lb11",
    ///         Location = "fsn1",
    ///     });
    /// 
    ///     var loadBalancerMaster = new HCloud.Rdns("loadBalancerMaster", new()
    ///     {
    ///         DnsPtr = "example.com",
    ///         IpAddress = loadBalancer1.Ipv4,
    ///         LoadBalancerId = loadBalancer1.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Reverse DNS entries can be imported using a compound ID with the following format`&lt;prefix (s for server/ f for floating ip / l for load balancer)&gt;-&lt;server, floating ip or load balancer ID&gt;-&lt;IP address&gt;` import reverse dns entry on server with id 123, ip 192.168.100.1
    /// 
    /// ```sh
    ///  $ pulumi import hcloud:index/rdns:Rdns myrdns s-123-192.168.100.1
    /// ```
    /// 
    ///  import reverse dns entry on floating ip with id 123, ip 2001:db8::1
    /// 
    /// ```sh
    ///  $ pulumi import hcloud:index/rdns:Rdns myrdns f-123-2001:db8::1
    /// ```
    /// 
    ///  import reverse dns entry on load balancer with id 123, ip 2001:db8::1
    /// 
    /// ```sh
    ///  $ pulumi import hcloud:index/rdns:Rdns myrdns l-123-2001:db8::1
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/rdns:Rdns")]
    public partial class Rdns : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The DNS address the `ip_address` should resolve to.
        /// </summary>
        [Output("dnsPtr")]
        public Output<string> DnsPtr { get; private set; } = null!;

        /// <summary>
        /// The Floating IP the `ip_address` belongs to. Specify only one of `server_id`, `floating_ip_id` and `load_balancer_id`.
        /// </summary>
        [Output("floatingIpId")]
        public Output<int?> FloatingIpId { get; private set; } = null!;

        /// <summary>
        /// The IP address that should point to `dns_ptr`.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// The Load Balancer the `ip_address` belongs to. Specify only one of `server_id`, `floating_ip_id` and `load_balancer_id`.
        /// </summary>
        [Output("loadBalancerId")]
        public Output<int?> LoadBalancerId { get; private set; } = null!;

        /// <summary>
        /// The server the `ip_address` belongs to. Specify only one of `server_id`, `floating_ip_id` and `load_balancer_id`.
        /// </summary>
        [Output("serverId")]
        public Output<int?> ServerId { get; private set; } = null!;


        /// <summary>
        /// Create a Rdns resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Rdns(string name, RdnsArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/rdns:Rdns", name, args ?? new RdnsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Rdns(string name, Input<string> id, RdnsState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/rdns:Rdns", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Rdns resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Rdns Get(string name, Input<string> id, RdnsState? state = null, CustomResourceOptions? options = null)
        {
            return new Rdns(name, id, state, options);
        }
    }

    public sealed class RdnsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DNS address the `ip_address` should resolve to.
        /// </summary>
        [Input("dnsPtr", required: true)]
        public Input<string> DnsPtr { get; set; } = null!;

        /// <summary>
        /// The Floating IP the `ip_address` belongs to. Specify only one of `server_id`, `floating_ip_id` and `load_balancer_id`.
        /// </summary>
        [Input("floatingIpId")]
        public Input<int>? FloatingIpId { get; set; }

        /// <summary>
        /// The IP address that should point to `dns_ptr`.
        /// </summary>
        [Input("ipAddress", required: true)]
        public Input<string> IpAddress { get; set; } = null!;

        /// <summary>
        /// The Load Balancer the `ip_address` belongs to. Specify only one of `server_id`, `floating_ip_id` and `load_balancer_id`.
        /// </summary>
        [Input("loadBalancerId")]
        public Input<int>? LoadBalancerId { get; set; }

        /// <summary>
        /// The server the `ip_address` belongs to. Specify only one of `server_id`, `floating_ip_id` and `load_balancer_id`.
        /// </summary>
        [Input("serverId")]
        public Input<int>? ServerId { get; set; }

        public RdnsArgs()
        {
        }
        public static new RdnsArgs Empty => new RdnsArgs();
    }

    public sealed class RdnsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DNS address the `ip_address` should resolve to.
        /// </summary>
        [Input("dnsPtr")]
        public Input<string>? DnsPtr { get; set; }

        /// <summary>
        /// The Floating IP the `ip_address` belongs to. Specify only one of `server_id`, `floating_ip_id` and `load_balancer_id`.
        /// </summary>
        [Input("floatingIpId")]
        public Input<int>? FloatingIpId { get; set; }

        /// <summary>
        /// The IP address that should point to `dns_ptr`.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The Load Balancer the `ip_address` belongs to. Specify only one of `server_id`, `floating_ip_id` and `load_balancer_id`.
        /// </summary>
        [Input("loadBalancerId")]
        public Input<int>? LoadBalancerId { get; set; }

        /// <summary>
        /// The server the `ip_address` belongs to. Specify only one of `server_id`, `floating_ip_id` and `load_balancer_id`.
        /// </summary>
        [Input("serverId")]
        public Input<int>? ServerId { get; set; }

        public RdnsState()
        {
        }
        public static new RdnsState Empty => new RdnsState();
    }
}
