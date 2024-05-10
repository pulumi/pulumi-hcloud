// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.FloatingIpAssignmentArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.FloatingIpAssignmentState;
import java.lang.Integer;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud Floating IP Assignment to assign a Floating IP to a Hetzner Cloud Server. Deleting a Floating IP Assignment will unassign the Floating IP from the Server.
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
 * import com.pulumi.hcloud.FloatingIp;
 * import com.pulumi.hcloud.FloatingIpArgs;
 * import com.pulumi.hcloud.FloatingIpAssignment;
 * import com.pulumi.hcloud.FloatingIpAssignmentArgs;
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
 *             .datacenter("fsn1-dc8")
 *             .build());
 * 
 *         var master = new FloatingIp("master", FloatingIpArgs.builder()        
 *             .type("ipv4")
 *             .homeLocation("nbg1")
 *             .build());
 * 
 *         var main = new FloatingIpAssignment("main", FloatingIpAssignmentArgs.builder()        
 *             .floatingIpId(master.id())
 *             .serverId(node1.id())
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
 * Floating IP Assignments can be imported using the `floating_ip_id`:
 * 
 * ```sh
 * $ pulumi import hcloud:index/floatingIpAssignment:FloatingIpAssignment myfloatingipassignment &lt;floating_ip_id&gt;
 * ```
 * 
 */
@ResourceType(type="hcloud:index/floatingIpAssignment:FloatingIpAssignment")
public class FloatingIpAssignment extends com.pulumi.resources.CustomResource {
    /**
     * ID of the Floating IP.
     * 
     */
    @Export(name="floatingIpId", refs={Integer.class}, tree="[0]")
    private Output<Integer> floatingIpId;

    /**
     * @return ID of the Floating IP.
     * 
     */
    public Output<Integer> floatingIpId() {
        return this.floatingIpId;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FloatingIpAssignment(String name) {
        this(name, FloatingIpAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FloatingIpAssignment(String name, FloatingIpAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FloatingIpAssignment(String name, FloatingIpAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/floatingIpAssignment:FloatingIpAssignment", name, args == null ? FloatingIpAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FloatingIpAssignment(String name, Output<String> id, @Nullable FloatingIpAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/floatingIpAssignment:FloatingIpAssignment", name, state, makeResourceOptions(options, id));
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
    public static FloatingIpAssignment get(String name, Output<String> id, @Nullable FloatingIpAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FloatingIpAssignment(name, id, state, options);
    }
}
