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
    /// Provides an Hetzner Cloud server resource. This can be used to create, modify, and delete servers. Servers also support provisioning.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic server creation
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new server running debian
    ///     var node1 = new HCloud.Server("node1", new()
    ///     {
    ///         Image = "debian-11",
    ///         PublicNets = new[]
    ///         {
    ///             new HCloud.Inputs.ServerPublicNetArgs
    ///             {
    ///                 Ipv4Enabled = true,
    ///                 Ipv6Enabled = true,
    ///             },
    ///         },
    ///         ServerType = "cx11",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     //## Server creation with one linked primary ip (ipv4)
    ///     var primaryIp1 = new HCloud.PrimaryIp("primaryIp1", new()
    ///     {
    ///         Datacenter = "fsn1-dc14",
    ///         Type = "ipv4",
    ///         AssigneeType = "server",
    ///         AutoDelete = true,
    ///         Labels = 
    ///         {
    ///             { "hallo", "welt" },
    ///         },
    ///     });
    /// 
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
    ///                 Ipv4Enabled = true,
    ///                 Ipv4 = primaryIp1.Id,
    ///                 Ipv6Enabled = false,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// ### Server creation with network
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var network = new HCloud.Network("network", new()
    ///     {
    ///         IpRange = "10.0.0.0/16",
    ///     });
    /// 
    ///     var network_subnet = new HCloud.NetworkSubnet("network-subnet", new()
    ///     {
    ///         Type = "cloud",
    ///         NetworkId = network.Id,
    ///         NetworkZone = "eu-central",
    ///         IpRange = "10.0.1.0/24",
    ///     });
    /// 
    ///     var server = new HCloud.Server("server", new()
    ///     {
    ///         ServerType = "cx11",
    ///         Image = "ubuntu-20.04",
    ///         Location = "nbg1",
    ///         Networks = new[]
    ///         {
    ///             new HCloud.Inputs.ServerNetworkArgs
    ///             {
    ///                 NetworkId = network.Id,
    ///                 Ip = "10.0.1.5",
    ///                 AliasIps = new[]
    ///                 {
    ///                     "10.0.1.6",
    ///                     "10.0.1.7",
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             network_subnet,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Server creation from snapshot
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var packerSnapshot = HCloud.GetImage.Invoke(new()
    ///     {
    ///         WithSelector = "app=foobar",
    ///         MostRecent = true,
    ///     });
    /// 
    ///     // Create a new server from the snapshot
    ///     var fromSnapshot = new HCloud.Server("fromSnapshot", new()
    ///     {
    ///         Image = packerSnapshot.Apply(getImageResult =&gt; getImageResult.Id),
    ///         ServerType = "cx11",
    ///         PublicNets = new[]
    ///         {
    ///             new HCloud.Inputs.ServerPublicNetArgs
    ///             {
    ///                 Ipv4Enabled = true,
    ///                 Ipv6Enabled = true,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Primary IPs
    /// 
    /// When creating a server without linking at least one ´primary_ip´, it automatically creates &amp; assigns two (ipv4 &amp; ipv6).
    /// With the public_net block, you can enable or link primary ips. If you don't define this block, two primary ips (ipv4, ipv6) will be created and assigned to the server automatically.
    /// 
    /// ### Examples
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Assign existing ipv4 only
    ///     var serverTestServer = new HCloud.Server("serverTestServer", new()
    ///     {
    ///         PublicNets = new[]
    ///         {
    ///             new HCloud.Inputs.ServerPublicNetArgs
    ///             {
    ///                 Ipv4Enabled = true,
    ///                 Ipv4 = hcloud_primary_ip.Primary_ip_1.Id,
    ///                 Ipv6Enabled = false,
    ///             },
    ///         },
    ///     });
    /// 
    ///     //...
    ///     // Link a managed ipv4 but autogenerate ipv6
    ///     var serverTestIndex_serverServer = new HCloud.Server("serverTestIndex/serverServer", new()
    ///     {
    ///         PublicNets = new[]
    ///         {
    ///             new HCloud.Inputs.ServerPublicNetArgs
    ///             {
    ///                 Ipv4Enabled = true,
    ///                 Ipv4 = hcloud_primary_ip.Primary_ip_1.Id,
    ///                 Ipv6Enabled = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     //...
    ///     // Assign &amp; create auto-generated ipv4 &amp; ipv6
    ///     var serverTestHcloudIndex_serverServer = new HCloud.Server("serverTestHcloudIndex/serverServer", new()
    ///     {
    ///         PublicNets = new[]
    ///         {
    ///             new HCloud.Inputs.ServerPublicNetArgs
    ///             {
    ///                 Ipv4Enabled = true,
    ///                 Ipv6Enabled = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     //...
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Servers can be imported using the server `id`:
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/server:Server myserver id
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/server:Server")]
    public partial class Server : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
        /// </summary>
        [Output("allowDeprecatedImages")]
        public Output<bool?> AllowDeprecatedImages { get; private set; } = null!;

        /// <summary>
        /// (string) The backup window of the server, if enabled.
        /// </summary>
        [Output("backupWindow")]
        public Output<string> BackupWindow { get; private set; } = null!;

        /// <summary>
        /// Enable or disable backups.
        /// </summary>
        [Output("backups")]
        public Output<bool?> Backups { get; private set; } = null!;

        /// <summary>
        /// The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
        /// </summary>
        [Output("datacenter")]
        public Output<string> Datacenter { get; private set; } = null!;

        /// <summary>
        /// Enable or disable delete protection (Needs to be the same as `rebuild_protection`). See "Delete Protection" in the Provider Docs for details.
        /// </summary>
        [Output("deleteProtection")]
        public Output<bool?> DeleteProtection { get; private set; } = null!;

        /// <summary>
        /// Firewall IDs the server should be attached to on creation.
        /// </summary>
        [Output("firewallIds")]
        public Output<ImmutableArray<int>> FirewallIds { get; private set; } = null!;

        /// <summary>
        /// Ignores any updates
        /// to the `firewall_ids` argument which were received from the server.
        /// This should not be used in normal cases. See the documentation of the
        /// `hcloud.FirewallAttachment` resource for a reason to use this
        /// argument.
        /// </summary>
        [Output("ignoreRemoteFirewallIds")]
        public Output<bool?> IgnoreRemoteFirewallIds { get; private set; } = null!;

        [Output("image")]
        public Output<string?> Image { get; private set; } = null!;

        /// <summary>
        /// (string) The IPv4 address.
        /// </summary>
        [Output("ipv4Address")]
        public Output<string> Ipv4Address { get; private set; } = null!;

        /// <summary>
        /// (string) The first IPv6 address of the assigned network.
        /// </summary>
        [Output("ipv6Address")]
        public Output<string> Ipv6Address { get; private set; } = null!;

        /// <summary>
        /// (string) The IPv6 network.
        /// </summary>
        [Output("ipv6Network")]
        public Output<string> Ipv6Network { get; private set; } = null!;

        /// <summary>
        /// ID or Name of an ISO image to mount.
        /// </summary>
        [Output("iso")]
        public Output<string?> Iso { get; private set; } = null!;

        /// <summary>
        /// If true, do not upgrade the disk. This allows downgrading the server type later.
        /// </summary>
        [Output("keepDisk")]
        public Output<bool?> KeepDisk { get; private set; } = null!;

        /// <summary>
        /// User-defined labels (key-value pairs) should be created with.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, object>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Network the server should be attached to on creation. (Can be specified multiple times)
        /// </summary>
        [Output("networks")]
        public Output<ImmutableArray<Outputs.ServerNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// Placement Group ID the server added to on creation.
        /// </summary>
        [Output("placementGroupId")]
        public Output<int?> PlacementGroupId { get; private set; } = null!;

        /// <summary>
        /// (int) The size of the primary disk in GB.
        /// </summary>
        [Output("primaryDiskSize")]
        public Output<int> PrimaryDiskSize { get; private set; } = null!;

        /// <summary>
        /// In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
        /// If this block is not defined, two primary (ipv4 &amp; ipv6) ips getting auto generated.
        /// </summary>
        [Output("publicNets")]
        public Output<ImmutableArray<Outputs.ServerPublicNet>> PublicNets { get; private set; } = null!;

        /// <summary>
        /// Enable or disable rebuild protection (Needs to be the same as `delete_protection`).
        /// </summary>
        [Output("rebuildProtection")]
        public Output<bool?> RebuildProtection { get; private set; } = null!;

        /// <summary>
        /// Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
        /// </summary>
        [Output("rescue")]
        public Output<string?> Rescue { get; private set; } = null!;

        /// <summary>
        /// Name of the server type this server should be created with.
        /// </summary>
        [Output("serverType")]
        public Output<string> ServerType { get; private set; } = null!;

        /// <summary>
        /// Whether to try shutting the server down gracefully before deleting it.
        /// </summary>
        [Output("shutdownBeforeDeletion")]
        public Output<bool?> ShutdownBeforeDeletion { get; private set; } = null!;

        /// <summary>
        /// SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ ssh_keys ]`.
        /// </summary>
        [Output("sshKeys")]
        public Output<ImmutableArray<string>> SshKeys { get; private set; } = null!;

        /// <summary>
        /// (string) The status of the server.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Cloud-Init user data to use during server creation
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;


        /// <summary>
        /// Create a Server resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Server(string name, ServerArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/server:Server", name, args ?? new ServerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Server(string name, Input<string> id, ServerState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/server:Server", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Server resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Server Get(string name, Input<string> id, ServerState? state = null, CustomResourceOptions? options = null)
        {
            return new Server(name, id, state, options);
        }
    }

    public sealed class ServerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
        /// </summary>
        [Input("allowDeprecatedImages")]
        public Input<bool>? AllowDeprecatedImages { get; set; }

        /// <summary>
        /// Enable or disable backups.
        /// </summary>
        [Input("backups")]
        public Input<bool>? Backups { get; set; }

        /// <summary>
        /// The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
        /// </summary>
        [Input("datacenter")]
        public Input<string>? Datacenter { get; set; }

        /// <summary>
        /// Enable or disable delete protection (Needs to be the same as `rebuild_protection`). See "Delete Protection" in the Provider Docs for details.
        /// </summary>
        [Input("deleteProtection")]
        public Input<bool>? DeleteProtection { get; set; }

        [Input("firewallIds")]
        private InputList<int>? _firewallIds;

        /// <summary>
        /// Firewall IDs the server should be attached to on creation.
        /// </summary>
        public InputList<int> FirewallIds
        {
            get => _firewallIds ?? (_firewallIds = new InputList<int>());
            set => _firewallIds = value;
        }

        /// <summary>
        /// Ignores any updates
        /// to the `firewall_ids` argument which were received from the server.
        /// This should not be used in normal cases. See the documentation of the
        /// `hcloud.FirewallAttachment` resource for a reason to use this
        /// argument.
        /// </summary>
        [Input("ignoreRemoteFirewallIds")]
        public Input<bool>? IgnoreRemoteFirewallIds { get; set; }

        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// ID or Name of an ISO image to mount.
        /// </summary>
        [Input("iso")]
        public Input<string>? Iso { get; set; }

        /// <summary>
        /// If true, do not upgrade the disk. This allows downgrading the server type later.
        /// </summary>
        [Input("keepDisk")]
        public Input<bool>? KeepDisk { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// User-defined labels (key-value pairs) should be created with.
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.ServerNetworkArgs>? _networks;

        /// <summary>
        /// Network the server should be attached to on creation. (Can be specified multiple times)
        /// </summary>
        public InputList<Inputs.ServerNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ServerNetworkArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Placement Group ID the server added to on creation.
        /// </summary>
        [Input("placementGroupId")]
        public Input<int>? PlacementGroupId { get; set; }

        [Input("publicNets")]
        private InputList<Inputs.ServerPublicNetArgs>? _publicNets;

        /// <summary>
        /// In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
        /// If this block is not defined, two primary (ipv4 &amp; ipv6) ips getting auto generated.
        /// </summary>
        public InputList<Inputs.ServerPublicNetArgs> PublicNets
        {
            get => _publicNets ?? (_publicNets = new InputList<Inputs.ServerPublicNetArgs>());
            set => _publicNets = value;
        }

        /// <summary>
        /// Enable or disable rebuild protection (Needs to be the same as `delete_protection`).
        /// </summary>
        [Input("rebuildProtection")]
        public Input<bool>? RebuildProtection { get; set; }

        /// <summary>
        /// Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
        /// </summary>
        [Input("rescue")]
        public Input<string>? Rescue { get; set; }

        /// <summary>
        /// Name of the server type this server should be created with.
        /// </summary>
        [Input("serverType", required: true)]
        public Input<string> ServerType { get; set; } = null!;

        /// <summary>
        /// Whether to try shutting the server down gracefully before deleting it.
        /// </summary>
        [Input("shutdownBeforeDeletion")]
        public Input<bool>? ShutdownBeforeDeletion { get; set; }

        [Input("sshKeys")]
        private InputList<string>? _sshKeys;

        /// <summary>
        /// SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ ssh_keys ]`.
        /// </summary>
        public InputList<string> SshKeys
        {
            get => _sshKeys ?? (_sshKeys = new InputList<string>());
            set => _sshKeys = value;
        }

        /// <summary>
        /// Cloud-Init user data to use during server creation
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public ServerArgs()
        {
        }
        public static new ServerArgs Empty => new ServerArgs();
    }

    public sealed class ServerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
        /// </summary>
        [Input("allowDeprecatedImages")]
        public Input<bool>? AllowDeprecatedImages { get; set; }

        /// <summary>
        /// (string) The backup window of the server, if enabled.
        /// </summary>
        [Input("backupWindow")]
        public Input<string>? BackupWindow { get; set; }

        /// <summary>
        /// Enable or disable backups.
        /// </summary>
        [Input("backups")]
        public Input<bool>? Backups { get; set; }

        /// <summary>
        /// The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
        /// </summary>
        [Input("datacenter")]
        public Input<string>? Datacenter { get; set; }

        /// <summary>
        /// Enable or disable delete protection (Needs to be the same as `rebuild_protection`). See "Delete Protection" in the Provider Docs for details.
        /// </summary>
        [Input("deleteProtection")]
        public Input<bool>? DeleteProtection { get; set; }

        [Input("firewallIds")]
        private InputList<int>? _firewallIds;

        /// <summary>
        /// Firewall IDs the server should be attached to on creation.
        /// </summary>
        public InputList<int> FirewallIds
        {
            get => _firewallIds ?? (_firewallIds = new InputList<int>());
            set => _firewallIds = value;
        }

        /// <summary>
        /// Ignores any updates
        /// to the `firewall_ids` argument which were received from the server.
        /// This should not be used in normal cases. See the documentation of the
        /// `hcloud.FirewallAttachment` resource for a reason to use this
        /// argument.
        /// </summary>
        [Input("ignoreRemoteFirewallIds")]
        public Input<bool>? IgnoreRemoteFirewallIds { get; set; }

        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// (string) The IPv4 address.
        /// </summary>
        [Input("ipv4Address")]
        public Input<string>? Ipv4Address { get; set; }

        /// <summary>
        /// (string) The first IPv6 address of the assigned network.
        /// </summary>
        [Input("ipv6Address")]
        public Input<string>? Ipv6Address { get; set; }

        /// <summary>
        /// (string) The IPv6 network.
        /// </summary>
        [Input("ipv6Network")]
        public Input<string>? Ipv6Network { get; set; }

        /// <summary>
        /// ID or Name of an ISO image to mount.
        /// </summary>
        [Input("iso")]
        public Input<string>? Iso { get; set; }

        /// <summary>
        /// If true, do not upgrade the disk. This allows downgrading the server type later.
        /// </summary>
        [Input("keepDisk")]
        public Input<bool>? KeepDisk { get; set; }

        [Input("labels")]
        private InputMap<object>? _labels;

        /// <summary>
        /// User-defined labels (key-value pairs) should be created with.
        /// </summary>
        public InputMap<object> Labels
        {
            get => _labels ?? (_labels = new InputMap<object>());
            set => _labels = value;
        }

        /// <summary>
        /// The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.ServerNetworkGetArgs>? _networks;

        /// <summary>
        /// Network the server should be attached to on creation. (Can be specified multiple times)
        /// </summary>
        public InputList<Inputs.ServerNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ServerNetworkGetArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// Placement Group ID the server added to on creation.
        /// </summary>
        [Input("placementGroupId")]
        public Input<int>? PlacementGroupId { get; set; }

        /// <summary>
        /// (int) The size of the primary disk in GB.
        /// </summary>
        [Input("primaryDiskSize")]
        public Input<int>? PrimaryDiskSize { get; set; }

        [Input("publicNets")]
        private InputList<Inputs.ServerPublicNetGetArgs>? _publicNets;

        /// <summary>
        /// In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
        /// If this block is not defined, two primary (ipv4 &amp; ipv6) ips getting auto generated.
        /// </summary>
        public InputList<Inputs.ServerPublicNetGetArgs> PublicNets
        {
            get => _publicNets ?? (_publicNets = new InputList<Inputs.ServerPublicNetGetArgs>());
            set => _publicNets = value;
        }

        /// <summary>
        /// Enable or disable rebuild protection (Needs to be the same as `delete_protection`).
        /// </summary>
        [Input("rebuildProtection")]
        public Input<bool>? RebuildProtection { get; set; }

        /// <summary>
        /// Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
        /// </summary>
        [Input("rescue")]
        public Input<string>? Rescue { get; set; }

        /// <summary>
        /// Name of the server type this server should be created with.
        /// </summary>
        [Input("serverType")]
        public Input<string>? ServerType { get; set; }

        /// <summary>
        /// Whether to try shutting the server down gracefully before deleting it.
        /// </summary>
        [Input("shutdownBeforeDeletion")]
        public Input<bool>? ShutdownBeforeDeletion { get; set; }

        [Input("sshKeys")]
        private InputList<string>? _sshKeys;

        /// <summary>
        /// SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ ssh_keys ]`.
        /// </summary>
        public InputList<string> SshKeys
        {
            get => _sshKeys ?? (_sshKeys = new InputList<string>());
            set => _sshKeys = value;
        }

        /// <summary>
        /// (string) The status of the server.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Cloud-Init user data to use during server creation
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public ServerState()
        {
        }
        public static new ServerState Empty => new ServerState();
    }
}
