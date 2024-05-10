// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.LoadBalancerServiceArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.LoadBalancerServiceState;
import com.pulumi.hcloud.outputs.LoadBalancerServiceHealthCheck;
import com.pulumi.hcloud.outputs.LoadBalancerServiceHttp;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Define services for Hetzner Cloud Load Balancers.
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
 * import com.pulumi.hcloud.LoadBalancer;
 * import com.pulumi.hcloud.LoadBalancerArgs;
 * import com.pulumi.hcloud.LoadBalancerService;
 * import com.pulumi.hcloud.LoadBalancerServiceArgs;
 * import com.pulumi.hcloud.inputs.LoadBalancerServiceHttpArgs;
 * import com.pulumi.hcloud.inputs.LoadBalancerServiceHealthCheckArgs;
 * import com.pulumi.hcloud.inputs.LoadBalancerServiceHealthCheckHttpArgs;
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
 *         var loadBalancer = new LoadBalancer("loadBalancer", LoadBalancerArgs.builder()        
 *             .name("my-load-balancer")
 *             .loadBalancerType("lb11")
 *             .location("nbg1")
 *             .build());
 * 
 *         var loadBalancerService = new LoadBalancerService("loadBalancerService", LoadBalancerServiceArgs.builder()        
 *             .loadBalancerId(loadBalancer.id())
 *             .protocol("http")
 *             .http(LoadBalancerServiceHttpArgs.builder()
 *                 .stickySessions(true)
 *                 .cookieName("EXAMPLE_STICKY")
 *                 .build())
 *             .healthCheck(LoadBalancerServiceHealthCheckArgs.builder()
 *                 .protocol("http")
 *                 .port(80)
 *                 .interval(10)
 *                 .timeout(5)
 *                 .http(LoadBalancerServiceHealthCheckHttpArgs.builder()
 *                     .domain("example.com")
 *                     .path("/healthz")
 *                     .response("OK")
 *                     .tls(true)
 *                     .statusCodes("200")
 *                     .build())
 *                 .build())
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
 * Load Balancer Service entries can be imported using a compound ID with the following format:
 * 
 * `&lt;load-balancer-id&gt;__&lt;listen-port&gt;`
 * 
 * ```sh
 * $ pulumi import hcloud:index/loadBalancerService:LoadBalancerService myloadbalancernetwork 123__80
 * ```
 * 
 */
@ResourceType(type="hcloud:index/loadBalancerService:LoadBalancerService")
public class LoadBalancerService extends com.pulumi.resources.CustomResource {
    /**
     * Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
     * 
     */
    @Export(name="destinationPort", refs={Integer.class}, tree="[0]")
    private Output<Integer> destinationPort;

    /**
     * @return Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
     * 
     */
    public Output<Integer> destinationPort() {
        return this.destinationPort;
    }
    /**
     * Health Check configuration when `protocol` is `http` or `https`.
     * 
     */
    @Export(name="healthCheck", refs={LoadBalancerServiceHealthCheck.class}, tree="[0]")
    private Output<LoadBalancerServiceHealthCheck> healthCheck;

    /**
     * @return Health Check configuration when `protocol` is `http` or `https`.
     * 
     */
    public Output<LoadBalancerServiceHealthCheck> healthCheck() {
        return this.healthCheck;
    }
    /**
     * HTTP configuration when `protocol` is `http` or `https`.
     * 
     */
    @Export(name="http", refs={LoadBalancerServiceHttp.class}, tree="[0]")
    private Output<LoadBalancerServiceHttp> http;

    /**
     * @return HTTP configuration when `protocol` is `http` or `https`.
     * 
     */
    public Output<LoadBalancerServiceHttp> http() {
        return this.http;
    }
    /**
     * Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     * 
     */
    @Export(name="listenPort", refs={Integer.class}, tree="[0]")
    private Output<Integer> listenPort;

    /**
     * @return Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     * 
     */
    public Output<Integer> listenPort() {
        return this.listenPort;
    }
    /**
     * Id of the load balancer this service belongs to.
     * 
     */
    @Export(name="loadBalancerId", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerId;

    /**
     * @return Id of the load balancer this service belongs to.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * Protocol of the service. `http`, `https` or `tcp`
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output<String> protocol;

    /**
     * @return Protocol of the service. `http`, `https` or `tcp`
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Enable proxyprotocol.
     * 
     */
    @Export(name="proxyprotocol", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> proxyprotocol;

    /**
     * @return Enable proxyprotocol.
     * 
     */
    public Output<Boolean> proxyprotocol() {
        return this.proxyprotocol;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancerService(String name) {
        this(name, LoadBalancerServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancerService(String name, LoadBalancerServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancerService(String name, LoadBalancerServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/loadBalancerService:LoadBalancerService", name, args == null ? LoadBalancerServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancerService(String name, Output<String> id, @Nullable LoadBalancerServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/loadBalancerService:LoadBalancerService", name, state, makeResourceOptions(options, id));
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
    public static LoadBalancerService get(String name, Output<String> id, @Nullable LoadBalancerServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancerService(name, id, state, options);
    }
}
