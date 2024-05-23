// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.RdnsArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.RdnsState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud Reverse DNS Entry to create, modify and reset reverse dns entries for Hetzner Cloud Servers, Primary IPs, Floating IPs or Load Balancers.
 * 
 * ## Example Usage
 * 
 * For servers:
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
 * import com.pulumi.hcloud.Rdns;
 * import com.pulumi.hcloud.RdnsArgs;
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
 *             .serverType("cx11")
 *             .build());
 * 
 *         var master = new Rdns("master", RdnsArgs.builder()
 *             .serverId(node1.id())
 *             .ipAddress(node1.ipv4Address())
 *             .dnsPtr("example.com")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * For Primary IPs:
 * 
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
 * import com.pulumi.hcloud.Rdns;
 * import com.pulumi.hcloud.RdnsArgs;
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
 *         var primary1 = new PrimaryIp("primary1", PrimaryIpArgs.builder()
 *             .datacenter("nbg1-dc3")
 *             .type("ipv4")
 *             .build());
 * 
 *         var primary1Rdns = new Rdns("primary1Rdns", RdnsArgs.builder()
 *             .primaryIpId(primary1.id())
 *             .ipAddress(primary1.ipAddress())
 *             .dnsPtr("example.com")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * For Floating IPs:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.hcloud.FloatingIp;
 * import com.pulumi.hcloud.FloatingIpArgs;
 * import com.pulumi.hcloud.Rdns;
 * import com.pulumi.hcloud.RdnsArgs;
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
 *         var floating1 = new FloatingIp("floating1", FloatingIpArgs.builder()
 *             .homeLocation("nbg1")
 *             .type("ipv4")
 *             .build());
 * 
 *         var floatingMaster = new Rdns("floatingMaster", RdnsArgs.builder()
 *             .floatingIpId(floating1.id())
 *             .ipAddress(floating1.ipAddress())
 *             .dnsPtr("example.com")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * For Load Balancers:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.hcloud.LoadBalancer;
 * import com.pulumi.hcloud.LoadBalancerArgs;
 * import com.pulumi.hcloud.Rdns;
 * import com.pulumi.hcloud.RdnsArgs;
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
 *         var loadBalancer1 = new LoadBalancer("loadBalancer1", LoadBalancerArgs.builder()
 *             .name("load_balancer1")
 *             .loadBalancerType("lb11")
 *             .location("fsn1")
 *             .build());
 * 
 *         var loadBalancerMaster = new Rdns("loadBalancerMaster", RdnsArgs.builder()
 *             .loadBalancerId(loadBalancer1.id())
 *             .ipAddress(loadBalancer1.ipv4())
 *             .dnsPtr("example.com")
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
 * Reverse DNS entries can be imported using a compound ID with the following format:
 * 
 * `&lt;prefix (s for server/ f for floating ip / l for load balancer)&gt;-&lt;server, floating ip or load balancer ID&gt;-&lt;IP address&gt;`
 * 
 * import reverse dns entry on server with id 123, ip 192.168.100.1
 * 
 * ```sh
 * $ pulumi import hcloud:index/rdns:Rdns myrdns s-123-192.168.100.1
 * ```
 * 
 * import reverse dns entry on primary ip with id 123, ip 2001:db8::1
 * 
 * ```sh
 * $ pulumi import hcloud:index/rdns:Rdns myrdns p-123-2001:db8::1
 * ```
 * 
 * import reverse dns entry on floating ip with id 123, ip 2001:db8::1
 * 
 * ```sh
 * $ pulumi import hcloud:index/rdns:Rdns myrdns f-123-2001:db8::1
 * ```
 * 
 * import reverse dns entry on load balancer with id 123, ip 2001:db8::1
 * 
 * ```sh
 * $ pulumi import hcloud:index/rdns:Rdns myrdns l-123-2001:db8::1
 * ```
 * 
 */
@ResourceType(type="hcloud:index/rdns:Rdns")
public class Rdns extends com.pulumi.resources.CustomResource {
    /**
     * The DNS address the `ip_address` should resolve to.
     * 
     */
    @Export(name="dnsPtr", refs={String.class}, tree="[0]")
    private Output<String> dnsPtr;

    /**
     * @return The DNS address the `ip_address` should resolve to.
     * 
     */
    public Output<String> dnsPtr() {
        return this.dnsPtr;
    }
    /**
     * The Floating IP the `ip_address` belongs to.
     * 
     */
    @Export(name="floatingIpId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> floatingIpId;

    /**
     * @return The Floating IP the `ip_address` belongs to.
     * 
     */
    public Output<Optional<Integer>> floatingIpId() {
        return Codegen.optional(this.floatingIpId);
    }
    /**
     * The IP address that should point to `dns_ptr`.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output<String> ipAddress;

    /**
     * @return The IP address that should point to `dns_ptr`.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * The Load Balancer the `ip_address` belongs to.
     * 
     */
    @Export(name="loadBalancerId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> loadBalancerId;

    /**
     * @return The Load Balancer the `ip_address` belongs to.
     * 
     */
    public Output<Optional<Integer>> loadBalancerId() {
        return Codegen.optional(this.loadBalancerId);
    }
    /**
     * The Primary IP the `ip_address` belongs to.
     * 
     */
    @Export(name="primaryIpId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> primaryIpId;

    /**
     * @return The Primary IP the `ip_address` belongs to.
     * 
     */
    public Output<Optional<Integer>> primaryIpId() {
        return Codegen.optional(this.primaryIpId);
    }
    /**
     * The server the `ip_address` belongs to.
     * 
     */
    @Export(name="serverId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> serverId;

    /**
     * @return The server the `ip_address` belongs to.
     * 
     */
    public Output<Optional<Integer>> serverId() {
        return Codegen.optional(this.serverId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rdns(String name) {
        this(name, RdnsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rdns(String name, RdnsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rdns(String name, RdnsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/rdns:Rdns", name, args == null ? RdnsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Rdns(String name, Output<String> id, @Nullable RdnsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/rdns:Rdns", name, state, makeResourceOptions(options, id));
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
    public static Rdns get(String name, Output<String> id, @Nullable RdnsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Rdns(name, id, state, options);
    }
}
