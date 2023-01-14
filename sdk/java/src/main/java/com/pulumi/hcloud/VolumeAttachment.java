// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.VolumeAttachmentArgs;
import com.pulumi.hcloud.inputs.VolumeAttachmentState;
import java.lang.Boolean;
import java.lang.Integer;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud Volume attachment to attach a Volume to a Hetzner Cloud Server. Deleting a Volume Attachment will detach the Volume from the Server.
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
 * import com.pulumi.hcloud.VolumeAttachment;
 * import com.pulumi.hcloud.VolumeAttachmentArgs;
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
 *             .datacenter(&#34;nbg1-dc3&#34;)
 *             .build());
 * 
 *         var master = new Volume(&#34;master&#34;, VolumeArgs.builder()        
 *             .location(&#34;nbg1&#34;)
 *             .size(10)
 *             .build());
 * 
 *         var main = new VolumeAttachment(&#34;main&#34;, VolumeAttachmentArgs.builder()        
 *             .volumeId(master.id())
 *             .serverId(node1.id())
 *             .automount(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Volume Attachments can be imported using the `volume_id`
 * 
 * ```sh
 *  $ pulumi import hcloud:index/volumeAttachment:VolumeAttachment myvolumeattachment &lt;volume_id&gt;
 * ```
 * 
 */
@ResourceType(type="hcloud:index/volumeAttachment:VolumeAttachment")
public class VolumeAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Automount the volume upon attaching it.
     * 
     */
    @Export(name="automount", type=Boolean.class, parameters={})
    private Output<Boolean> automount;

    /**
     * @return Automount the volume upon attaching it.
     * 
     */
    public Output<Boolean> automount() {
        return this.automount;
    }
    /**
     * Server to attach the Volume to.
     * 
     */
    @Export(name="serverId", type=Integer.class, parameters={})
    private Output<Integer> serverId;

    /**
     * @return Server to attach the Volume to.
     * 
     */
    public Output<Integer> serverId() {
        return this.serverId;
    }
    /**
     * ID of the Volume.
     * 
     */
    @Export(name="volumeId", type=Integer.class, parameters={})
    private Output<Integer> volumeId;

    /**
     * @return ID of the Volume.
     * 
     */
    public Output<Integer> volumeId() {
        return this.volumeId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VolumeAttachment(String name) {
        this(name, VolumeAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VolumeAttachment(String name, VolumeAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VolumeAttachment(String name, VolumeAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/volumeAttachment:VolumeAttachment", name, args == null ? VolumeAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VolumeAttachment(String name, Output<String> id, @Nullable VolumeAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/volumeAttachment:VolumeAttachment", name, state, makeResourceOptions(options, id));
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
    public static VolumeAttachment get(String name, Output<String> id, @Nullable VolumeAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VolumeAttachment(name, id, state, options);
    }
}
