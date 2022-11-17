// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.PrimaryIpArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.PrimaryIpState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud Primary IP to represent a publicly-accessible static IP address that can be mapped to one of your servers.
 * 
 * If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created &amp; attached.
 * Currently, Primary IPs can be only attached to servers.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var main = new PrimaryIp(&#34;main&#34;, PrimaryIpArgs.builder()        
 *             .datacenter(&#34;fsn1-dc14&#34;)
 *             .type(&#34;ipv4&#34;)
 *             .assigneeType(&#34;server&#34;)
 *             .autoDelete(true)
 *             .labels(Map.of(&#34;hallo&#34;, &#34;welt&#34;))
 *             .build());
 * 
 *         var serverTest = new Server(&#34;serverTest&#34;, ServerArgs.builder()        
 *             .image(&#34;ubuntu-20.04&#34;)
 *             .serverType(&#34;cx11&#34;)
 *             .datacenter(&#34;fsn1-dc14&#34;)
 *             .labels(Map.of(&#34;test&#34;, &#34;tessst1&#34;))
 *             .publicNets(ServerPublicNetArgs.builder()
 *                 .ipv4(main.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Primary IPs can be imported using its `id`
 * 
 * ```sh
 *  $ pulumi import hcloud:index/primaryIp:PrimaryIp myip &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="hcloud:index/primaryIp:PrimaryIp")
public class PrimaryIp extends com.pulumi.resources.CustomResource {
    /**
     * ID of the assigned resource
     * 
     */
    @Export(name="assigneeId", type=Integer.class, parameters={})
    private Output<Integer> assigneeId;

    /**
     * @return ID of the assigned resource
     * 
     */
    public Output<Integer> assigneeId() {
        return this.assigneeId;
    }
    /**
     * The type of the assigned resource.
     * 
     */
    @Export(name="assigneeType", type=String.class, parameters={})
    private Output<String> assigneeType;

    /**
     * @return The type of the assigned resource.
     * 
     */
    public Output<String> assigneeType() {
        return this.assigneeType;
    }
    /**
     * Whether auto delete is enabled.
     * `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
     * 
     */
    @Export(name="autoDelete", type=Boolean.class, parameters={})
    private Output<Boolean> autoDelete;

    /**
     * @return Whether auto delete is enabled.
     * `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
     * 
     */
    public Output<Boolean> autoDelete() {
        return this.autoDelete;
    }
    @Export(name="datacenter", type=String.class, parameters={})
    private Output<String> datacenter;

    public Output<String> datacenter() {
        return this.datacenter;
    }
    /**
     * Whether delete protection is enabled.
     * 
     */
    @Export(name="deleteProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteProtection;

    /**
     * @return Whether delete protection is enabled.
     * 
     */
    public Output<Optional<Boolean>> deleteProtection() {
        return Codegen.optional(this.deleteProtection);
    }
    /**
     * (string) IP Address of the Primary IP.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return (string) IP Address of the Primary IP.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    @Export(name="ipNetwork", type=String.class, parameters={})
    private Output<String> ipNetwork;

    public Output<String> ipNetwork() {
        return this.ipNetwork;
    }
    /**
     * Description of the Primary IP.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> labels;

    /**
     * @return Description of the Primary IP.
     * 
     */
    public Output<Optional<Map<String,Object>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Name of the Primary IP.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Primary IP.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Type of the Primary IP.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the Primary IP.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrimaryIp(String name) {
        this(name, PrimaryIpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrimaryIp(String name, PrimaryIpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrimaryIp(String name, PrimaryIpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/primaryIp:PrimaryIp", name, args == null ? PrimaryIpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrimaryIp(String name, Output<String> id, @Nullable PrimaryIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/primaryIp:PrimaryIp", name, state, makeResourceOptions(options, id));
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
    public static PrimaryIp get(String name, Output<String> id, @Nullable PrimaryIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrimaryIp(name, id, state, options);
    }
}
