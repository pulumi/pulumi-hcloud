// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.VolumeArgs;
import com.pulumi.hcloud.inputs.VolumeState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud volume resource to manage volumes.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.hcloud.Server;
 * import com.pulumi.hcloud.ServerArgs;
 * import com.pulumi.hcloud.Volume;
 * import com.pulumi.hcloud.VolumeArgs;
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
 *         var node1 = new Server(&#34;node1&#34;, ServerArgs.builder()        
 *             .image(&#34;debian-9&#34;)
 *             .serverType(&#34;cx11&#34;)
 *             .build());
 * 
 *         var master = new Volume(&#34;master&#34;, VolumeArgs.builder()        
 *             .size(50)
 *             .serverId(node1.id())
 *             .automount(true)
 *             .format(&#34;ext4&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Volumes can be imported using their `id`
 * 
 * ```sh
 *  $ pulumi import hcloud:index/volume:Volume myvolume id
 * ```
 * 
 */
@ResourceType(type="hcloud:index/volume:Volume")
public class Volume extends com.pulumi.resources.CustomResource {
    /**
     * Automount the volume upon attaching it (server_id must be provided).
     * 
     */
    @Export(name="automount", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> automount;

    /**
     * @return Automount the volume upon attaching it (server_id must be provided).
     * 
     */
    public Output<Optional<Boolean>> automount() {
        return Codegen.optional(this.automount);
    }
    /**
     * Enable or disable delete protection.
     * 
     */
    @Export(name="deleteProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteProtection;

    /**
     * @return Enable or disable delete protection.
     * 
     */
    public Output<Optional<Boolean>> deleteProtection() {
        return Codegen.optional(this.deleteProtection);
    }
    /**
     * Format volume after creation. `xfs` or `ext4`
     * 
     */
    @Export(name="format", type=String.class, parameters={})
    private Output</* @Nullable */ String> format;

    /**
     * @return Format volume after creation. `xfs` or `ext4`
     * 
     */
    public Output<Optional<String>> format() {
        return Codegen.optional(this.format);
    }
    /**
     * (map) User-defined labels (key-value pairs).
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> labels;

    /**
     * @return (map) User-defined labels (key-value pairs).
     * 
     */
    public Output<Optional<Map<String,Object>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * (string) Device path on the file system for the Volume.
     * 
     */
    @Export(name="linuxDevice", type=String.class, parameters={})
    private Output<String> linuxDevice;

    /**
     * @return (string) Device path on the file system for the Volume.
     * 
     */
    public Output<String> linuxDevice() {
        return this.linuxDevice;
    }
    /**
     * The location name of the volume to create, not allowed if server_id argument is passed.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location name of the volume to create, not allowed if server_id argument is passed.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of the volume to create (must be unique per project).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the volume to create (must be unique per project).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Server to attach the Volume to, not allowed if location argument is passed.
     * 
     */
    @Export(name="serverId", type=Integer.class, parameters={})
    private Output<Integer> serverId;

    /**
     * @return Server to attach the Volume to, not allowed if location argument is passed.
     * 
     */
    public Output<Integer> serverId() {
        return this.serverId;
    }
    /**
     * Size of the volume (in GB).
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return Size of the volume (in GB).
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Volume(String name) {
        this(name, VolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Volume(String name, VolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Volume(String name, VolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/volume:Volume", name, args == null ? VolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Volume(String name, Output<String> id, @Nullable VolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/volume:Volume", name, state, makeResourceOptions(options, id));
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
    public static Volume get(String name, Output<String> id, @Nullable VolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Volume(name, id, state, options);
    }
}