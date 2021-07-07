// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    public static class GetServer
    {
        public static Task<GetServerResult> InvokeAsync(GetServerArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServerResult>("hcloud:index/getServer:getServer", args ?? new GetServerArgs(), options.WithVersion());
    }


    public sealed class GetServerArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the server.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        /// <summary>
        /// Name of the server.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("selector")]
        public string? Selector { get; set; }

        /// <summary>
        /// Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
        /// </summary>
        [Input("withSelector")]
        public string? WithSelector { get; set; }

        [Input("withStatuses")]
        private List<string>? _withStatuses;

        /// <summary>
        /// List only servers with the specified status, could contain `initializing`, `starting`, `running`, `stopping`, `off`, `deleting`, `rebuilding`, `migrating`, `unknown`.
        /// </summary>
        public List<string> WithStatuses
        {
            get => _withStatuses ?? (_withStatuses = new List<string>());
            set => _withStatuses = value;
        }

        public GetServerArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetServerResult
    {
        /// <summary>
        /// (string) The backup window of the server, if enabled.
        /// </summary>
        public readonly string BackupWindow;
        /// <summary>
        /// (boolean) Whether backups are enabled.
        /// </summary>
        public readonly bool Backups;
        /// <summary>
        /// (string) The datacenter name.
        /// </summary>
        public readonly string Datacenter;
        /// <summary>
        /// (Optional, list) Firewall IDs the server is attached to.
        /// </summary>
        public readonly ImmutableArray<int> FirewallIds;
        /// <summary>
        /// (int) Unique ID of the server.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// (string) Name or ID of the image the server was created from.
        /// </summary>
        public readonly string Image;
        /// <summary>
        /// (string) The IPv4 address.
        /// </summary>
        public readonly string Ipv4Address;
        /// <summary>
        /// (string) The first IPv6 address of the assigned network.
        /// </summary>
        public readonly string Ipv6Address;
        /// <summary>
        /// (string) The IPv6 network.
        /// </summary>
        public readonly string Ipv6Network;
        /// <summary>
        /// (string) ID or Name of the mounted ISO image.
        /// </summary>
        public readonly string Iso;
        /// <summary>
        /// (map) User-defined labels (key-value pairs)
        /// </summary>
        public readonly ImmutableDictionary<string, object> Labels;
        /// <summary>
        /// (string) The location name.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// (string) Name of the server.
        /// </summary>
        public readonly string Name;
        public readonly string Rescue;
        public readonly string? Selector;
        /// <summary>
        /// (string) Name of the server type.
        /// </summary>
        public readonly string ServerType;
        /// <summary>
        /// (string) The status of the server.
        /// </summary>
        public readonly string Status;
        public readonly string? WithSelector;
        public readonly ImmutableArray<string> WithStatuses;

        [OutputConstructor]
        private GetServerResult(
            string backupWindow,

            bool backups,

            string datacenter,

            ImmutableArray<int> firewallIds,

            int id,

            string image,

            string ipv4Address,

            string ipv6Address,

            string ipv6Network,

            string iso,

            ImmutableDictionary<string, object> labels,

            string location,

            string name,

            string rescue,

            string? selector,

            string serverType,

            string status,

            string? withSelector,

            ImmutableArray<string> withStatuses)
        {
            BackupWindow = backupWindow;
            Backups = backups;
            Datacenter = datacenter;
            FirewallIds = firewallIds;
            Id = id;
            Image = image;
            Ipv4Address = ipv4Address;
            Ipv6Address = ipv6Address;
            Ipv6Network = ipv6Network;
            Iso = iso;
            Labels = labels;
            Location = location;
            Name = name;
            Rescue = rescue;
            Selector = selector;
            ServerType = serverType;
            Status = status;
            WithSelector = withSelector;
            WithStatuses = withStatuses;
        }
    }
}
