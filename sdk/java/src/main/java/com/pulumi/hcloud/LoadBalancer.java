// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.LoadBalancerArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.LoadBalancerState;
import com.pulumi.hcloud.outputs.LoadBalancerAlgorithm;
import com.pulumi.hcloud.outputs.LoadBalancerTarget;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud Load Balancer to represent a Load Balancer in the Hetzner Cloud.
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
 *             .name("server-%d")
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
 * Load Balancers can be imported using its `id`:
 * 
 * ```sh
 * $ pulumi import hcloud:index/loadBalancer:LoadBalancer example &#34;$LOAD_BALANCER_ID&#34;
 * ```
 * 
 */
@ResourceType(type="hcloud:index/loadBalancer:LoadBalancer")
public class LoadBalancer extends com.pulumi.resources.CustomResource {
    /**
     * Configuration of the algorithm the Load Balancer use.
     * 
     */
    @Export(name="algorithm", refs={LoadBalancerAlgorithm.class}, tree="[0]")
    private Output<LoadBalancerAlgorithm> algorithm;

    /**
     * @return Configuration of the algorithm the Load Balancer use.
     * 
     */
    public Output<LoadBalancerAlgorithm> algorithm() {
        return this.algorithm;
    }
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
     * (string) IPv4 Address of the Load Balancer.
     * 
     */
    @Export(name="ipv4", refs={String.class}, tree="[0]")
    private Output<String> ipv4;

    /**
     * @return (string) IPv4 Address of the Load Balancer.
     * 
     */
    public Output<String> ipv4() {
        return this.ipv4;
    }
    /**
     * (string) IPv6 Address of the Load Balancer.
     * 
     */
    @Export(name="ipv6", refs={String.class}, tree="[0]")
    private Output<String> ipv6;

    /**
     * @return (string) IPv6 Address of the Load Balancer.
     * 
     */
    public Output<String> ipv6() {
        return this.ipv6;
    }
    /**
     * User-defined labels (key-value pairs) should be created with.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Type of the Load Balancer.
     * 
     */
    @Export(name="loadBalancerType", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerType;

    /**
     * @return Type of the Load Balancer.
     * 
     */
    public Output<String> loadBalancerType() {
        return this.loadBalancerType;
    }
    /**
     * The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of the Load Balancer.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Load Balancer.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * (int) ID of the first private network that this Load Balancer is connected to.
     * 
     */
    @Export(name="networkId", refs={Integer.class}, tree="[0]")
    private Output<Integer> networkId;

    /**
     * @return (int) ID of the first private network that this Load Balancer is connected to.
     * 
     */
    public Output<Integer> networkId() {
        return this.networkId;
    }
    /**
     * (string) IP of the Load Balancer in the first private network that it is connected to.
     * 
     */
    @Export(name="networkIp", refs={String.class}, tree="[0]")
    private Output<String> networkIp;

    /**
     * @return (string) IP of the Load Balancer in the first private network that it is connected to.
     * 
     */
    public Output<String> networkIp() {
        return this.networkIp;
    }
    /**
     * The Network Zone of the Load Balancer. Require when no location is set.
     * 
     */
    @Export(name="networkZone", refs={String.class}, tree="[0]")
    private Output<String> networkZone;

    /**
     * @return The Network Zone of the Load Balancer. Require when no location is set.
     * 
     */
    public Output<String> networkZone() {
        return this.networkZone;
    }
    /**
     * @deprecated
     * Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets.
     * 
     */
    @Deprecated /* Use hcloud.LoadBalancerTarget resource instead. This allows the full control over the selected targets. */
    @Export(name="targets", refs={List.class,LoadBalancerTarget.class}, tree="[0,1]")
    private Output<List<LoadBalancerTarget>> targets;

    public Output<List<LoadBalancerTarget>> targets() {
        return this.targets;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancer(java.lang.String name) {
        this(name, LoadBalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancer(java.lang.String name, LoadBalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancer(java.lang.String name, LoadBalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/loadBalancer:LoadBalancer", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LoadBalancer(java.lang.String name, Output<java.lang.String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/loadBalancer:LoadBalancer", name, state, makeResourceOptions(options, id), false);
    }

    private static LoadBalancerArgs makeArgs(LoadBalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LoadBalancerArgs.Empty : args;
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
    public static LoadBalancer get(java.lang.String name, Output<java.lang.String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancer(name, id, state, options);
    }
}
