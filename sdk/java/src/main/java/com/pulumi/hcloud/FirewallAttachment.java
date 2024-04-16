// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.FirewallAttachmentArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.FirewallAttachmentState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Attaches resource to a Hetzner Cloud Firewall.
 * 
 * *Note*: only one `hcloud.FirewallAttachment` per Firewall is allowed.
 * Any resources that should be attached to that Firewall need to be
 * specified in that `hcloud.FirewallAttachment`.
 * 
 * ## Example Usage
 * 
 * ### Attach Servers
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
 * import com.pulumi.hcloud.Firewall;
 * import com.pulumi.hcloud.FirewallArgs;
 * import com.pulumi.hcloud.FirewallAttachment;
 * import com.pulumi.hcloud.FirewallAttachmentArgs;
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
 *         var testServer = new Server(&#34;testServer&#34;, ServerArgs.builder()        
 *             .name(&#34;test-server&#34;)
 *             .serverType(&#34;cx11&#34;)
 *             .image(&#34;ubuntu-20.04&#34;)
 *             .build());
 * 
 *         var basicFirewall = new Firewall(&#34;basicFirewall&#34;, FirewallArgs.builder()        
 *             .name(&#34;basic_firewall&#34;)
 *             .build());
 * 
 *         var fwRef = new FirewallAttachment(&#34;fwRef&#34;, FirewallAttachmentArgs.builder()        
 *             .firewallId(basicFirewall.id())
 *             .serverIds(testServer.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Attach Label Selectors
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
 * import com.pulumi.hcloud.Firewall;
 * import com.pulumi.hcloud.FirewallArgs;
 * import com.pulumi.hcloud.FirewallAttachment;
 * import com.pulumi.hcloud.FirewallAttachmentArgs;
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
 *         var testServer = new Server(&#34;testServer&#34;, ServerArgs.builder()        
 *             .name(&#34;test-server&#34;)
 *             .serverType(&#34;cx11&#34;)
 *             .image(&#34;ubuntu-20.04&#34;)
 *             .labels(Map.of(&#34;firewall-attachment&#34;, &#34;test-server&#34;))
 *             .build());
 * 
 *         var basicFirewall = new Firewall(&#34;basicFirewall&#34;, FirewallArgs.builder()        
 *             .name(&#34;basic_firewall&#34;)
 *             .build());
 * 
 *         var fwRef = new FirewallAttachment(&#34;fwRef&#34;, FirewallAttachmentArgs.builder()        
 *             .firewallId(basicFirewall.id())
 *             .labelSelectors(&#34;firewall-attachment=test-server&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="hcloud:index/firewallAttachment:FirewallAttachment")
public class FirewallAttachment extends com.pulumi.resources.CustomResource {
    /**
     * ID of the firewall the resources
     * should be attached to.
     * 
     */
    @Export(name="firewallId", refs={Integer.class}, tree="[0]")
    private Output<Integer> firewallId;

    /**
     * @return ID of the firewall the resources
     * should be attached to.
     * 
     */
    public Output<Integer> firewallId() {
        return this.firewallId;
    }
    /**
     * List of label selectors used to
     * select resources to attach to the firewall.
     * 
     */
    @Export(name="labelSelectors", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> labelSelectors;

    /**
     * @return List of label selectors used to
     * select resources to attach to the firewall.
     * 
     */
    public Output<Optional<List<String>>> labelSelectors() {
        return Codegen.optional(this.labelSelectors);
    }
    /**
     * List of Server IDs to attach to the
     * firewall.
     * 
     */
    @Export(name="serverIds", refs={List.class,Integer.class}, tree="[0,1]")
    private Output</* @Nullable */ List<Integer>> serverIds;

    /**
     * @return List of Server IDs to attach to the
     * firewall.
     * 
     */
    public Output<Optional<List<Integer>>> serverIds() {
        return Codegen.optional(this.serverIds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallAttachment(String name) {
        this(name, FirewallAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallAttachment(String name, FirewallAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallAttachment(String name, FirewallAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/firewallAttachment:FirewallAttachment", name, args == null ? FirewallAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallAttachment(String name, Output<String> id, @Nullable FirewallAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/firewallAttachment:FirewallAttachment", name, state, makeResourceOptions(options, id));
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
    public static FirewallAttachment get(String name, Output<String> id, @Nullable FirewallAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallAttachment(name, id, state, options);
    }
}
