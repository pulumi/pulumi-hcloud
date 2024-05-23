// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.SnapshotArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.SnapshotState;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud snapshot to represent an image with type snapshot in the Hetzner Cloud. This resource makes it easy to create a snapshot of your server.
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
 * import com.pulumi.hcloud.Snapshot;
 * import com.pulumi.hcloud.SnapshotArgs;
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
 *         var my_snapshot = new Snapshot("my-snapshot", SnapshotArgs.builder()
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
 * Snapshots can be imported using its image `id`:
 * 
 * ```sh
 * $ pulumi import hcloud:index/snapshot:Snapshot myimage id
 * ```
 * 
 */
@ResourceType(type="hcloud:index/snapshot:Snapshot")
public class Snapshot extends com.pulumi.resources.CustomResource {
    /**
     * Description of the snapshot.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the snapshot.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
     * Server to the snapshot should be created from.
     * 
     */
    @Export(name="serverId", refs={Integer.class}, tree="[0]")
    private Output<Integer> serverId;

    /**
     * @return Server to the snapshot should be created from.
     * 
     */
    public Output<Integer> serverId() {
        return this.serverId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/snapshot:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Snapshot(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/snapshot:Snapshot", name, state, makeResourceOptions(options, id));
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
    public static Snapshot get(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, state, options);
    }
}
