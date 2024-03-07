// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.FloatingIpArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.FloatingIpState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud Floating IP to represent a publicly-accessible static IP address that can be mapped to one of your servers.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.hcloud.Server;
 * import com.pulumi.hcloud.ServerArgs;
 * import com.pulumi.hcloud.FloatingIp;
 * import com.pulumi.hcloud.FloatingIpArgs;
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
 *         var node1 = new Server(&#34;node1&#34;, ServerArgs.builder()        
 *             .image(&#34;debian-11&#34;)
 *             .serverType(&#34;cx11&#34;)
 *             .build());
 * 
 *         var master = new FloatingIp(&#34;master&#34;, FloatingIpArgs.builder()        
 *             .type(&#34;ipv4&#34;)
 *             .serverId(node1.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Floating IPs can be imported using its `id`:
 * 
 * ```sh
 * $ pulumi import hcloud:index/floatingIp:FloatingIp myip id
 * ```
 * 
 */
@ResourceType(type="hcloud:index/floatingIp:FloatingIp")
public class FloatingIp extends com.pulumi.resources.CustomResource {
    /**
     * Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    @Export(name="deleteProtection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteProtection;

    /**
     * @return Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    public Output<Optional<Boolean>> deleteProtection() {
        return Codegen.optional(this.deleteProtection);
    }
    /**
     * Description of the Floating IP.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the Floating IP.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of home location (routing is optimized for that location). Optional if server_id argument is passed.
     * 
     */
    @Export(name="homeLocation", refs={String.class}, tree="[0]")
    private Output<String> homeLocation;

    /**
     * @return Name of home location (routing is optimized for that location). Optional if server_id argument is passed.
     * 
     */
    public Output<String> homeLocation() {
        return this.homeLocation;
    }
    /**
     * (string) IP Address of the Floating IP.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output<String> ipAddress;

    /**
     * @return (string) IP Address of the Floating IP.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * (string) IPv6 subnet. (Only set if `type` is `ipv6`)
     * 
     */
    @Export(name="ipNetwork", refs={String.class}, tree="[0]")
    private Output<String> ipNetwork;

    /**
     * @return (string) IPv6 subnet. (Only set if `type` is `ipv6`)
     * 
     */
    public Output<String> ipNetwork() {
        return this.ipNetwork;
    }
    /**
     * User-defined labels (key-value pairs) should be created with.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Output<Optional<Map<String,Object>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Name of the Floating IP.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Floating IP.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Server to assign the Floating IP to.
     * 
     */
    @Export(name="serverId", refs={Integer.class}, tree="[0]")
    private Output<Integer> serverId;

    /**
     * @return Server to assign the Floating IP to.
     * 
     */
    public Output<Integer> serverId() {
        return this.serverId;
    }
    /**
     * Type of the Floating IP. `ipv4` `ipv6`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the Floating IP. `ipv4` `ipv6`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FloatingIp(String name) {
        this(name, FloatingIpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FloatingIp(String name, FloatingIpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FloatingIp(String name, FloatingIpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/floatingIp:FloatingIp", name, args == null ? FloatingIpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FloatingIp(String name, Output<String> id, @Nullable FloatingIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/floatingIp:FloatingIp", name, state, makeResourceOptions(options, id));
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
    public static FloatingIp get(String name, Output<String> id, @Nullable FloatingIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FloatingIp(name, id, state, options);
    }
}
