// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.LoadBalancerNetworkArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.LoadBalancerNetworkState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud Load Balancer Network to represent a private network on a Load Balancer in the Hetzner Cloud.
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
 * import com.pulumi.hcloud.LoadBalancer;
 * import com.pulumi.hcloud.LoadBalancerArgs;
 * import com.pulumi.hcloud.Network;
 * import com.pulumi.hcloud.NetworkArgs;
 * import com.pulumi.hcloud.NetworkSubnet;
 * import com.pulumi.hcloud.NetworkSubnetArgs;
 * import com.pulumi.hcloud.LoadBalancerNetwork;
 * import com.pulumi.hcloud.LoadBalancerNetworkArgs;
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
 *         var lb1 = new LoadBalancer(&#34;lb1&#34;, LoadBalancerArgs.builder()        
 *             .loadBalancerType(&#34;lb11&#34;)
 *             .networkZone(&#34;eu-central&#34;)
 *             .build());
 * 
 *         var mynet = new Network(&#34;mynet&#34;, NetworkArgs.builder()        
 *             .ipRange(&#34;10.0.0.0/8&#34;)
 *             .build());
 * 
 *         var foonet = new NetworkSubnet(&#34;foonet&#34;, NetworkSubnetArgs.builder()        
 *             .networkId(mynet.id())
 *             .type(&#34;cloud&#34;)
 *             .networkZone(&#34;eu-central&#34;)
 *             .ipRange(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var srvnetwork = new LoadBalancerNetwork(&#34;srvnetwork&#34;, LoadBalancerNetworkArgs.builder()        
 *             .loadBalancerId(lb1.id())
 *             .networkId(mynet.id())
 *             .ip(&#34;10.0.1.5&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Load Balancer Network entries can be imported using a compound ID with the following format:
 * 
 * `&lt;load-balancer-id&gt;-&lt;network-id&gt;`
 * 
 * ```sh
 * $ pulumi import hcloud:index/loadBalancerNetwork:LoadBalancerNetwork myloadbalancernetwork 123-654
 * ```
 * 
 */
@ResourceType(type="hcloud:index/loadBalancerNetwork:LoadBalancerNetwork")
public class LoadBalancerNetwork extends com.pulumi.resources.CustomResource {
    /**
     * Enable or disable the
     * Load Balancers public interface. Default: `true`
     * 
     */
    @Export(name="enablePublicInterface", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enablePublicInterface;

    /**
     * @return Enable or disable the
     * Load Balancers public interface. Default: `true`
     * 
     */
    public Output<Optional<Boolean>> enablePublicInterface() {
        return Codegen.optional(this.enablePublicInterface);
    }
    /**
     * IP to request to be assigned to this Load
     * Balancer. If you do not provide this then you will be auto assigned an
     * IP address.
     * 
     */
    @Export(name="ip", refs={String.class}, tree="[0]")
    private Output<String> ip;

    /**
     * @return IP to request to be assigned to this Load
     * Balancer. If you do not provide this then you will be auto assigned an
     * IP address.
     * 
     */
    public Output<String> ip() {
        return this.ip;
    }
    /**
     * ID of the Load Balancer.
     * 
     */
    @Export(name="loadBalancerId", refs={Integer.class}, tree="[0]")
    private Output<Integer> loadBalancerId;

    /**
     * @return ID of the Load Balancer.
     * 
     */
    public Output<Integer> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * ID of the network which should be added
     * to the Load Balancer. Required if `subnet_id` is not set. Successful
     * creation of the resource depends on the existence of a subnet in the
     * Hetzner Cloud Backend. Using `network_id` will not create an explicit
     * dependency between the Load Balancer and the subnet. Therefore
     * `depends_on` may need to be used. Alternatively the `subnet_id`
     * property can be used, which will create an explicit dependency between
     * `hcloud.LoadBalancerNetwork` and the existence of a subnet.
     * 
     */
    @Export(name="networkId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> networkId;

    /**
     * @return ID of the network which should be added
     * to the Load Balancer. Required if `subnet_id` is not set. Successful
     * creation of the resource depends on the existence of a subnet in the
     * Hetzner Cloud Backend. Using `network_id` will not create an explicit
     * dependency between the Load Balancer and the subnet. Therefore
     * `depends_on` may need to be used. Alternatively the `subnet_id`
     * property can be used, which will create an explicit dependency between
     * `hcloud.LoadBalancerNetwork` and the existence of a subnet.
     * 
     */
    public Output<Optional<Integer>> networkId() {
        return Codegen.optional(this.networkId);
    }
    /**
     * ID of the sub-network which should be
     * added to the Load Balancer. Required if `network_id` is not set.
     * *Note*: if the `ip` property is missing, the Load Balancer is
     * currently added to the last created subnet.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return ID of the sub-network which should be
     * added to the Load Balancer. Required if `network_id` is not set.
     * *Note*: if the `ip` property is missing, the Load Balancer is
     * currently added to the last created subnet.
     * 
     */
    public Output<Optional<String>> subnetId() {
        return Codegen.optional(this.subnetId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancerNetwork(String name) {
        this(name, LoadBalancerNetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancerNetwork(String name, LoadBalancerNetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancerNetwork(String name, LoadBalancerNetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/loadBalancerNetwork:LoadBalancerNetwork", name, args == null ? LoadBalancerNetworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancerNetwork(String name, Output<String> id, @Nullable LoadBalancerNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/loadBalancerNetwork:LoadBalancerNetwork", name, state, makeResourceOptions(options, id));
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
    public static LoadBalancerNetwork get(String name, Output<String> id, @Nullable LoadBalancerNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancerNetwork(name, id, state, options);
    }
}
