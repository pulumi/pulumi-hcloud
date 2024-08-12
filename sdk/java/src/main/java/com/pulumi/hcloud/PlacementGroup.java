// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.PlacementGroupArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.PlacementGroupState;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud Placement Group to represent a Placement Group in the Hetzner Cloud.
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
 * import com.pulumi.hcloud.PlacementGroup;
 * import com.pulumi.hcloud.PlacementGroupArgs;
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
 *         var my_placement_group = new PlacementGroup("my-placement-group", PlacementGroupArgs.builder()
 *             .name("my-placement-group")
 *             .type("spread")
 *             .labels(Map.of("key", "value"))
 *             .build());
 * 
 *         var node1 = new Server("node1", ServerArgs.builder()
 *             .name("node1")
 *             .image("debian-11")
 *             .serverType("cx22")
 *             .placementGroupId(my_placement_group.id())
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
 * Placement Groups can be imported using its `id`:
 * 
 * ```sh
 * $ pulumi import hcloud:index/placementGroup:PlacementGroup my-placement-group id
 * ```
 * 
 */
@ResourceType(type="hcloud:index/placementGroup:PlacementGroup")
public class PlacementGroup extends com.pulumi.resources.CustomResource {
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
     * Name of the Placement Group.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Placement Group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="servers", refs={List.class,Integer.class}, tree="[0,1]")
    private Output<List<Integer>> servers;

    public Output<List<Integer>> servers() {
        return this.servers;
    }
    /**
     * Type of the Placement Group.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the Placement Group.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PlacementGroup(java.lang.String name) {
        this(name, PlacementGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PlacementGroup(java.lang.String name, PlacementGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PlacementGroup(java.lang.String name, PlacementGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/placementGroup:PlacementGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PlacementGroup(java.lang.String name, Output<java.lang.String> id, @Nullable PlacementGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/placementGroup:PlacementGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static PlacementGroupArgs makeArgs(PlacementGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PlacementGroupArgs.Empty : args;
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
    public static PlacementGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable PlacementGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PlacementGroup(name, id, state, options);
    }
}
