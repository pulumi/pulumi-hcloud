// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.ServerNetworkArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.ServerNetworkState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud Server Network to represent a private network on a server in the Hetzner Cloud.
 * 
 * ## Example Usage
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
 * import com.pulumi.hcloud.Network;
 * import com.pulumi.hcloud.NetworkArgs;
 * import com.pulumi.hcloud.NetworkSubnet;
 * import com.pulumi.hcloud.NetworkSubnetArgs;
 * import com.pulumi.hcloud.ServerNetwork;
 * import com.pulumi.hcloud.ServerNetworkArgs;
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
 *         var node1 = new Server("node1", ServerArgs.builder()
 *             .name("node1")
 *             .image("debian-11")
 *             .serverType("cx22")
 *             .build());
 * 
 *         var mynet = new Network("mynet", NetworkArgs.builder()
 *             .name("my-net")
 *             .ipRange("10.0.0.0/8")
 *             .build());
 * 
 *         var foonet = new NetworkSubnet("foonet", NetworkSubnetArgs.builder()
 *             .networkId(mynet.id())
 *             .type("cloud")
 *             .networkZone("eu-central")
 *             .ipRange("10.0.1.0/24")
 *             .build());
 * 
 *         var srvnetwork = new ServerNetwork("srvnetwork", ServerNetworkArgs.builder()
 *             .serverId(node1.id())
 *             .networkId(mynet.id())
 *             .ip("10.0.1.5")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Server Network entries can be imported using a compound ID with the following format:
 * 
 * `&lt;server-id&gt;-&lt;network-id&gt;`
 * 
 * ```sh
 * $ pulumi import hcloud:index/serverNetwork:ServerNetwork myservernetwork 123-654
 * ```
 * 
 */
@ResourceType(type="hcloud:index/serverNetwork:ServerNetwork")
public class ServerNetwork extends com.pulumi.resources.CustomResource {
    /**
     * Additional IPs to be assigned
     * to this server.
     * 
     */
    @Export(name="aliasIps", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> aliasIps;

    /**
     * @return Additional IPs to be assigned
     * to this server.
     * 
     */
    public Output<Optional<List<String>>> aliasIps() {
        return Codegen.optional(this.aliasIps);
    }
    /**
     * IP to request to be assigned to this server.
     * If you do not provide this then you will be auto assigned an IP
     * address.
     * 
     */
    @Export(name="ip", refs={String.class}, tree="[0]")
    private Output<String> ip;

    /**
     * @return IP to request to be assigned to this server.
     * If you do not provide this then you will be auto assigned an IP
     * address.
     * 
     */
    public Output<String> ip() {
        return this.ip;
    }
    @Export(name="macAddress", refs={String.class}, tree="[0]")
    private Output<String> macAddress;

    public Output<String> macAddress() {
        return this.macAddress;
    }
    /**
     * ID of the network which should be added
     * to the server. Required if `subnet_id` is not set. Successful creation
     * of the resource depends on the existence of a subnet in the Hetzner
     * Cloud Backend. Using `network_id` will not create an explicit
     * dependency between server and subnet. Therefore `depends_on` may need
     * to be used. Alternatively the `subnet_id` property can be used, which
     * will create an explicit dependency between `hcloud.ServerNetwork` and
     * the existence of a subnet.
     * 
     */
    @Export(name="networkId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> networkId;

    /**
     * @return ID of the network which should be added
     * to the server. Required if `subnet_id` is not set. Successful creation
     * of the resource depends on the existence of a subnet in the Hetzner
     * Cloud Backend. Using `network_id` will not create an explicit
     * dependency between server and subnet. Therefore `depends_on` may need
     * to be used. Alternatively the `subnet_id` property can be used, which
     * will create an explicit dependency between `hcloud.ServerNetwork` and
     * the existence of a subnet.
     * 
     */
    public Output<Optional<Integer>> networkId() {
        return Codegen.optional(this.networkId);
    }
    /**
     * ID of the server.
     * 
     */
    @Export(name="serverId", refs={Integer.class}, tree="[0]")
    private Output<Integer> serverId;

    /**
     * @return ID of the server.
     * 
     */
    public Output<Integer> serverId() {
        return this.serverId;
    }
    /**
     * ID of the sub-network which should be
     * added to the Server. Required if `network_id` is not set.
     * *Note*: if the `ip` property is missing, the Server is currently added
     * to the last created subnet.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return ID of the sub-network which should be
     * added to the Server. Required if `network_id` is not set.
     * *Note*: if the `ip` property is missing, the Server is currently added
     * to the last created subnet.
     * 
     */
    public Output<Optional<String>> subnetId() {
        return Codegen.optional(this.subnetId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerNetwork(String name) {
        this(name, ServerNetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerNetwork(String name, ServerNetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerNetwork(String name, ServerNetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/serverNetwork:ServerNetwork", name, args == null ? ServerNetworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerNetwork(String name, Output<String> id, @Nullable ServerNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/serverNetwork:ServerNetwork", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static ServerNetwork get(String name, Output<String> id, @Nullable ServerNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerNetwork(name, id, state, options);
    }
}
