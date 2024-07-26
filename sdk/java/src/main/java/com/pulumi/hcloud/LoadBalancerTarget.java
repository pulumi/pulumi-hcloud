// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.LoadBalancerTargetArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.LoadBalancerTargetState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Adds a target to a Hetzner Cloud Load Balancer.
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
 * import com.pulumi.hcloud.LoadBalancer;
 * import com.pulumi.hcloud.LoadBalancerArgs;
 * import com.pulumi.hcloud.LoadBalancerTarget;
 * import com.pulumi.hcloud.LoadBalancerTargetArgs;
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
 *         var myServer = new Server("myServer", ServerArgs.builder()
 *             .name("my-server")
 *             .serverType("cx22")
 *             .image("ubuntu-18.04")
 *             .build());
 * 
 *         var loadBalancer = new LoadBalancer("loadBalancer", LoadBalancerArgs.builder()
 *             .name("my-load-balancer")
 *             .loadBalancerType("lb11")
 *             .location("nbg1")
 *             .build());
 * 
 *         var loadBalancerTarget = new LoadBalancerTarget("loadBalancerTarget", LoadBalancerTargetArgs.builder()
 *             .type("server")
 *             .loadBalancerId(loadBalancer.id())
 *             .serverId(myServer.id())
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
 * Load Balancer Target entries can be imported using a compound ID with the following format:
 * 
 * `&lt;load-balancer-id&gt;__&lt;type&gt;__&lt;identifier&gt;`
 * 
 * Where _identifier_ depends on the _type_:
 * 
 * - `server`: server id, for example: `123`
 * 
 * - `label_selector`: label selector, for example: `foo=bar`
 * 
 * - `ip`: ip address, for example: `203.0.113.123`
 * 
 * ```sh
 * $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalancerservertarget 123__server__321
 * ```
 * 
 * ```sh
 * $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalancerlabeltarget 123__label_selector__foo=bar
 * ```
 * 
 * ```sh
 * $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalanceriptarget 123__ip__203.0.113.123
 * ```
 * 
 */
@ResourceType(type="hcloud:index/loadBalancerTarget:LoadBalancerTarget")
public class LoadBalancerTarget extends com.pulumi.resources.CustomResource {
    /**
     * IP address for an IP Target. Required if
     * `type` is `ip`.
     * 
     */
    @Export(name="ip", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ip;

    /**
     * @return IP address for an IP Target. Required if
     * `type` is `ip`.
     * 
     */
    public Output<Optional<String>> ip() {
        return Codegen.optional(this.ip);
    }
    /**
     * Label Selector selecting targets
     * for this Load Balancer. Required if `type` is `label_selector`.
     * 
     */
    @Export(name="labelSelector", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> labelSelector;

    /**
     * @return Label Selector selecting targets
     * for this Load Balancer. Required if `type` is `label_selector`.
     * 
     */
    public Output<Optional<String>> labelSelector() {
        return Codegen.optional(this.labelSelector);
    }
    /**
     * ID of the Load Balancer to which
     * the target gets attached.
     * 
     */
    @Export(name="loadBalancerId", refs={Integer.class}, tree="[0]")
    private Output<Integer> loadBalancerId;

    /**
     * @return ID of the Load Balancer to which
     * the target gets attached.
     * 
     */
    public Output<Integer> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * ID of the server which should be a
     * target for this Load Balancer. Required if `type` is `server`
     * 
     */
    @Export(name="serverId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> serverId;

    /**
     * @return ID of the server which should be a
     * target for this Load Balancer. Required if `type` is `server`
     * 
     */
    public Output<Optional<Integer>> serverId() {
        return Codegen.optional(this.serverId);
    }
    /**
     * Type of the target. Possible values
     * `server`, `label_selector`, `ip`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the target. Possible values
     * `server`, `label_selector`, `ip`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * use the private IP to connect to
     * Load Balancer targets. Only allowed if type is `server` or
     * `label_selector`.
     * 
     */
    @Export(name="usePrivateIp", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> usePrivateIp;

    /**
     * @return use the private IP to connect to
     * Load Balancer targets. Only allowed if type is `server` or
     * `label_selector`.
     * 
     */
    public Output<Boolean> usePrivateIp() {
        return this.usePrivateIp;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancerTarget(String name) {
        this(name, LoadBalancerTargetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancerTarget(String name, LoadBalancerTargetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancerTarget(String name, LoadBalancerTargetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/loadBalancerTarget:LoadBalancerTarget", name, args == null ? LoadBalancerTargetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancerTarget(String name, Output<String> id, @Nullable LoadBalancerTargetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/loadBalancerTarget:LoadBalancerTarget", name, state, makeResourceOptions(options, id));
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
    public static LoadBalancerTarget get(String name, Output<String> id, @Nullable LoadBalancerTargetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancerTarget(name, id, state, options);
    }
}
