// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.ServerArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.ServerState;
import com.pulumi.hcloud.outputs.ServerNetwork;
import com.pulumi.hcloud.outputs.ServerPublicNet;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Hetzner Cloud server resource. This can be used to create, modify, and delete servers. Servers also support provisioning.
 * 
 * ## Example Usage
 * 
 * ### Basic server creation
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.hcloud.Server;
 * import com.pulumi.hcloud.ServerArgs;
 * import com.pulumi.hcloud.inputs.ServerPublicNetArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Create a new server running debian
 *         var node1 = new Server("node1", ServerArgs.builder()
 *             .name("node1")
 *             .image("debian-11")
 *             .serverType("cx22")
 *             .publicNets(ServerPublicNetArgs.builder()
 *                 .ipv4Enabled(true)
 *                 .ipv6Enabled(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.hcloud.PrimaryIp;
 * import com.pulumi.hcloud.PrimaryIpArgs;
 * import com.pulumi.hcloud.Server;
 * import com.pulumi.hcloud.ServerArgs;
 * import com.pulumi.hcloud.inputs.ServerPublicNetArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         //## Server creation with one linked primary ip (ipv4)
 *         var primaryIp1 = new PrimaryIp("primaryIp1", PrimaryIpArgs.builder()
 *             .name("primary_ip_test")
 *             .datacenter("fsn1-dc14")
 *             .type("ipv4")
 *             .assigneeType("server")
 *             .autoDelete(true)
 *             .labels(Map.of("hallo", "welt"))
 *             .build());
 * 
 *         var serverTest = new Server("serverTest", ServerArgs.builder()
 *             .name("test-server")
 *             .image("ubuntu-20.04")
 *             .serverType("cx22")
 *             .datacenter("fsn1-dc14")
 *             .labels(Map.of("test", "tessst1"))
 *             .publicNets(ServerPublicNetArgs.builder()
 *                 .ipv4Enabled(true)
 *                 .ipv4(primaryIp1.id())
 *                 .ipv6Enabled(false)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Server creation with network
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.hcloud.Network;
 * import com.pulumi.hcloud.NetworkArgs;
 * import com.pulumi.hcloud.NetworkSubnet;
 * import com.pulumi.hcloud.NetworkSubnetArgs;
 * import com.pulumi.hcloud.Server;
 * import com.pulumi.hcloud.ServerArgs;
 * import com.pulumi.hcloud.inputs.ServerNetworkArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var network = new Network("network", NetworkArgs.builder()
 *             .name("network")
 *             .ipRange("10.0.0.0/16")
 *             .build());
 * 
 *         var network_subnet = new NetworkSubnet("network-subnet", NetworkSubnetArgs.builder()
 *             .type("cloud")
 *             .networkId(network.id())
 *             .networkZone("eu-central")
 *             .ipRange("10.0.1.0/24")
 *             .build());
 * 
 *         var server = new Server("server", ServerArgs.builder()
 *             .name("server")
 *             .serverType("cx22")
 *             .image("ubuntu-20.04")
 *             .location("nbg1")
 *             .networks(ServerNetworkArgs.builder()
 *                 .networkId(network.id())
 *                 .ip("10.0.1.5")
 *                 .aliasIps(                
 *                     "10.0.1.6",
 *                     "10.0.1.7")
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(network_subnet)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Server creation from snapshot
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.hcloud.HcloudFunctions;
 * import com.pulumi.hcloud.inputs.GetImageArgs;
 * import com.pulumi.hcloud.Server;
 * import com.pulumi.hcloud.ServerArgs;
 * import com.pulumi.hcloud.inputs.ServerPublicNetArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Get image infos because we need the ID
 *         final var packerSnapshot = HcloudFunctions.getImage(GetImageArgs.builder()
 *             .withSelector("app=foobar")
 *             .mostRecent(true)
 *             .build());
 * 
 *         // Create a new server from the snapshot
 *         var fromSnapshot = new Server("fromSnapshot", ServerArgs.builder()
 *             .name("from-snapshot")
 *             .image(packerSnapshot.applyValue(getImageResult -> getImageResult.id()))
 *             .serverType("cx22")
 *             .publicNets(ServerPublicNetArgs.builder()
 *                 .ipv4Enabled(true)
 *                 .ipv6Enabled(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Primary IPs
 * 
 * When creating a server without linking at least one ´primary_ip´, it automatically creates &amp; assigns two (ipv4 &amp; ipv6).
 * With the public_net block, you can enable or link primary ips. If you don&#39;t define this block, two primary ips (ipv4, ipv6) will be created and assigned to the server automatically.
 * 
 * ## Import
 * 
 * Servers can be imported using the server `id`:
 * 
 * ```sh
 * $ pulumi import hcloud:index/server:Server myserver id
 * ```
 * 
 */
@ResourceType(type="hcloud:index/server:Server")
public class Server extends com.pulumi.resources.CustomResource {
    /**
     * Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
     * 
     */
    @Export(name="allowDeprecatedImages", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowDeprecatedImages;

    /**
     * @return Enable the use of deprecated images (default: false). **Note** Deprecated images will be removed after three months. Using them is then no longer possible.
     * 
     */
    public Output<Optional<Boolean>> allowDeprecatedImages() {
        return Codegen.optional(this.allowDeprecatedImages);
    }
    /**
     * (string) The backup window of the server, if enabled.
     * 
     * @deprecated
     * You should remove this property from your terraform configuration.
     * 
     */
    @Deprecated /* You should remove this property from your terraform configuration. */
    @Export(name="backupWindow", refs={String.class}, tree="[0]")
    private Output<String> backupWindow;

    /**
     * @return (string) The backup window of the server, if enabled.
     * 
     */
    public Output<String> backupWindow() {
        return this.backupWindow;
    }
    /**
     * Enable or disable backups.
     * 
     */
    @Export(name="backups", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> backups;

    /**
     * @return Enable or disable backups.
     * 
     */
    public Output<Optional<Boolean>> backups() {
        return Codegen.optional(this.backups);
    }
    /**
     * The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
     * 
     */
    @Export(name="datacenter", refs={String.class}, tree="[0]")
    private Output<String> datacenter;

    /**
     * @return The datacenter name to create the server in. `nbg1-dc3`, `fsn1-dc14`, `hel1-dc2`, `ash-dc1` or `hil-dc1`
     * 
     */
    public Output<String> datacenter() {
        return this.datacenter;
    }
    /**
     * Enable or disable delete protection (Needs to be the same as `rebuild_protection`). See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    @Export(name="deleteProtection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteProtection;

    /**
     * @return Enable or disable delete protection (Needs to be the same as `rebuild_protection`). See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    public Output<Optional<Boolean>> deleteProtection() {
        return Codegen.optional(this.deleteProtection);
    }
    /**
     * Firewall IDs the server should be attached to on creation.
     * 
     */
    @Export(name="firewallIds", refs={List.class,Integer.class}, tree="[0,1]")
    private Output<List<Integer>> firewallIds;

    /**
     * @return Firewall IDs the server should be attached to on creation.
     * 
     */
    public Output<List<Integer>> firewallIds() {
        return this.firewallIds;
    }
    /**
     * Ignores any updates
     * to the `firewall_ids` argument which were received from the server.
     * This should not be used in normal cases. See the documentation of the
     * `hcloud.FirewallAttachment` resource for a reason to use this
     * argument.
     * 
     */
    @Export(name="ignoreRemoteFirewallIds", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ignoreRemoteFirewallIds;

    /**
     * @return Ignores any updates
     * to the `firewall_ids` argument which were received from the server.
     * This should not be used in normal cases. See the documentation of the
     * `hcloud.FirewallAttachment` resource for a reason to use this
     * argument.
     * 
     */
    public Output<Optional<Boolean>> ignoreRemoteFirewallIds() {
        return Codegen.optional(this.ignoreRemoteFirewallIds);
    }
    @Export(name="image", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> image;

    public Output<Optional<String>> image() {
        return Codegen.optional(this.image);
    }
    /**
     * (string) The IPv4 address.
     * 
     */
    @Export(name="ipv4Address", refs={String.class}, tree="[0]")
    private Output<String> ipv4Address;

    /**
     * @return (string) The IPv4 address.
     * 
     */
    public Output<String> ipv4Address() {
        return this.ipv4Address;
    }
    /**
     * (string) The first IPv6 address of the assigned network.
     * 
     */
    @Export(name="ipv6Address", refs={String.class}, tree="[0]")
    private Output<String> ipv6Address;

    /**
     * @return (string) The first IPv6 address of the assigned network.
     * 
     */
    public Output<String> ipv6Address() {
        return this.ipv6Address;
    }
    /**
     * (string) The IPv6 network.
     * 
     */
    @Export(name="ipv6Network", refs={String.class}, tree="[0]")
    private Output<String> ipv6Network;

    /**
     * @return (string) The IPv6 network.
     * 
     */
    public Output<String> ipv6Network() {
        return this.ipv6Network;
    }
    /**
     * ID or Name of an ISO image to mount.
     * 
     */
    @Export(name="iso", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> iso;

    /**
     * @return ID or Name of an ISO image to mount.
     * 
     */
    public Output<Optional<String>> iso() {
        return Codegen.optional(this.iso);
    }
    /**
     * If true, do not upgrade the disk. This allows downgrading the server type later.
     * 
     */
    @Export(name="keepDisk", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> keepDisk;

    /**
     * @return If true, do not upgrade the disk. This allows downgrading the server type later.
     * 
     */
    public Output<Optional<Boolean>> keepDisk() {
        return Codegen.optional(this.keepDisk);
    }
    /**
     * User-defined labels (key-value pairs) should be created with.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location name to create the server in. `nbg1`, `fsn1`, `hel1`, `ash` or `hil`
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the server to create (must be unique per project and a valid hostname as per RFC 1123).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Network the server should be attached to on creation. (Can be specified multiple times)
     * 
     */
    @Export(name="networks", refs={List.class,ServerNetwork.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServerNetwork>> networks;

    /**
     * @return Network the server should be attached to on creation. (Can be specified multiple times)
     * 
     */
    public Output<Optional<List<ServerNetwork>>> networks() {
        return Codegen.optional(this.networks);
    }
    /**
     * Placement Group ID the server added to on creation.
     * 
     */
    @Export(name="placementGroupId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> placementGroupId;

    /**
     * @return Placement Group ID the server added to on creation.
     * 
     */
    public Output<Optional<Integer>> placementGroupId() {
        return Codegen.optional(this.placementGroupId);
    }
    /**
     * (int) The size of the primary disk in GB.
     * 
     */
    @Export(name="primaryDiskSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> primaryDiskSize;

    /**
     * @return (int) The size of the primary disk in GB.
     * 
     */
    public Output<Integer> primaryDiskSize() {
        return this.primaryDiskSize;
    }
    /**
     * In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
     * If this block is not defined, two primary (ipv4 &amp; ipv6) ips getting auto generated.
     * 
     */
    @Export(name="publicNets", refs={List.class,ServerPublicNet.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServerPublicNet>> publicNets;

    /**
     * @return In this block you can either enable / disable ipv4 and ipv6 or link existing primary IPs (checkout the examples).
     * If this block is not defined, two primary (ipv4 &amp; ipv6) ips getting auto generated.
     * 
     */
    public Output<Optional<List<ServerPublicNet>>> publicNets() {
        return Codegen.optional(this.publicNets);
    }
    /**
     * Enable or disable rebuild protection (Needs to be the same as `delete_protection`).
     * 
     */
    @Export(name="rebuildProtection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> rebuildProtection;

    /**
     * @return Enable or disable rebuild protection (Needs to be the same as `delete_protection`).
     * 
     */
    public Output<Optional<Boolean>> rebuildProtection() {
        return Codegen.optional(this.rebuildProtection);
    }
    /**
     * Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
     * 
     */
    @Export(name="rescue", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rescue;

    /**
     * @return Enable and boot in to the specified rescue system. This enables simple installation of custom operating systems. `linux64` or `linux32`
     * 
     */
    public Output<Optional<String>> rescue() {
        return Codegen.optional(this.rescue);
    }
    /**
     * Name of the server type this server should be created with.
     * 
     */
    @Export(name="serverType", refs={String.class}, tree="[0]")
    private Output<String> serverType;

    /**
     * @return Name of the server type this server should be created with.
     * 
     */
    public Output<String> serverType() {
        return this.serverType;
    }
    /**
     * Whether to try shutting the server down gracefully before deleting it.
     * 
     */
    @Export(name="shutdownBeforeDeletion", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> shutdownBeforeDeletion;

    /**
     * @return Whether to try shutting the server down gracefully before deleting it.
     * 
     */
    public Output<Optional<Boolean>> shutdownBeforeDeletion() {
        return Codegen.optional(this.shutdownBeforeDeletion);
    }
    /**
     * SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ ssh_keys ]`.
     * 
     */
    @Export(name="sshKeys", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sshKeys;

    /**
     * @return SSH key IDs or names which should be injected into the server at creation time. Once the server is created, you can not update the list of SSH Keys. If you do change this, you will be prompted to destroy and recreate the server. You can avoid this by setting lifecycle.ignore_changes to `[ ssh_keys ]`.
     * 
     */
    public Output<Optional<List<String>>> sshKeys() {
        return Codegen.optional(this.sshKeys);
    }
    /**
     * (string) The status of the server.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return (string) The status of the server.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Cloud-Init user data to use during server creation
     * 
     */
    @Export(name="userData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userData;

    /**
     * @return Cloud-Init user data to use during server creation
     * 
     */
    public Output<Optional<String>> userData() {
        return Codegen.optional(this.userData);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Server(java.lang.String name) {
        this(name, ServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Server(java.lang.String name, ServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Server(java.lang.String name, ServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/server:Server", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Server(java.lang.String name, Output<java.lang.String> id, @Nullable ServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/server:Server", name, state, makeResourceOptions(options, id), false);
    }

    private static ServerArgs makeArgs(ServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServerArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Server get(java.lang.String name, Output<java.lang.String> id, @Nullable ServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Server(name, id, state, options);
    }
}
