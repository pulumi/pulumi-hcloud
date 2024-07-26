// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.FirewallArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.FirewallState;
import com.pulumi.hcloud.outputs.FirewallApplyTo;
import com.pulumi.hcloud.outputs.FirewallRule;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud Firewall to represent a Firewall in the Hetzner Cloud.
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
 * import com.pulumi.hcloud.Firewall;
 * import com.pulumi.hcloud.FirewallArgs;
 * import com.pulumi.hcloud.inputs.FirewallRuleArgs;
 * import com.pulumi.hcloud.Server;
 * import com.pulumi.hcloud.ServerArgs;
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
 *         var myfirewall = new Firewall("myfirewall", FirewallArgs.builder()
 *             .name("my-firewall")
 *             .rules(            
 *                 FirewallRuleArgs.builder()
 *                     .direction("in")
 *                     .protocol("icmp")
 *                     .sourceIps(                    
 *                         "0.0.0.0/0",
 *                         "::/0")
 *                     .build(),
 *                 FirewallRuleArgs.builder()
 *                     .direction("in")
 *                     .protocol("tcp")
 *                     .port("80-85")
 *                     .sourceIps(                    
 *                         "0.0.0.0/0",
 *                         "::/0")
 *                     .build())
 *             .build());
 * 
 *         var node1 = new Server("node1", ServerArgs.builder()
 *             .name("node1")
 *             .image("debian-11")
 *             .serverType("cx22")
 *             .firewallIds(myfirewall.id())
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
 * Firewalls can be imported using its `id`:
 * 
 * ```sh
 * $ pulumi import hcloud:index/firewall:Firewall myfirewall id
 * ```
 * 
 */
@ResourceType(type="hcloud:index/firewall:Firewall")
public class Firewall extends com.pulumi.resources.CustomResource {
    /**
     * Resources the firewall should be assigned to
     * 
     */
    @Export(name="applyTos", refs={List.class,FirewallApplyTo.class}, tree="[0,1]")
    private Output<List<FirewallApplyTo>> applyTos;

    /**
     * @return Resources the firewall should be assigned to
     * 
     */
    public Output<List<FirewallApplyTo>> applyTos() {
        return this.applyTos;
    }
    /**
     * User-defined labels (key-value pairs) should be created with.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * Name of the Firewall.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Firewall.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration of a Rule from this Firewall.
     * 
     */
    @Export(name="rules", refs={List.class,FirewallRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FirewallRule>> rules;

    /**
     * @return Configuration of a Rule from this Firewall.
     * 
     */
    public Output<Optional<List<FirewallRule>>> rules() {
        return Codegen.optional(this.rules);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Firewall(String name) {
        this(name, FirewallArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Firewall(String name, @Nullable FirewallArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Firewall(String name, @Nullable FirewallArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/firewall:Firewall", name, args == null ? FirewallArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Firewall(String name, Output<String> id, @Nullable FirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/firewall:Firewall", name, state, makeResourceOptions(options, id));
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
    public static Firewall get(String name, Output<String> id, @Nullable FirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Firewall(name, id, state, options);
    }
}
