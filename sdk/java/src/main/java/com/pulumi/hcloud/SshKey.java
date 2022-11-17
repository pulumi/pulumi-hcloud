// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.hcloud.SshKeyArgs;
import com.pulumi.hcloud.Utilities;
import com.pulumi.hcloud.inputs.SshKeyState;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud SSH key resource to manage SSH keys for server access.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new SshKey(&#34;default&#34;, SshKeyArgs.builder()        
 *             .publicKey(Files.readString(&#34;~/.ssh/id_rsa.pub&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SSH keys can be imported using the SSH key `id`
 * 
 * ```sh
 *  $ pulumi import hcloud:index/sshKey:SshKey mykey &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="hcloud:index/sshKey:SshKey")
public class SshKey extends com.pulumi.resources.CustomResource {
    /**
     * (string) The fingerprint of the SSH key
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return (string) The fingerprint of the SSH key
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * User-defined labels (key-value pairs) should be created with.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Output<Optional<Map<String,Object>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Name of the SSH key.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the SSH key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The public key. If this is a file, it can be read using the file interpolation function
     * 
     */
    @Export(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    /**
     * @return The public key. If this is a file, it can be read using the file interpolation function
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshKey(String name) {
        this(name, SshKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshKey(String name, SshKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshKey(String name, SshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/sshKey:SshKey", name, args == null ? SshKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SshKey(String name, Output<String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/sshKey:SshKey", name, state, makeResourceOptions(options, id));
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
    public static SshKey get(String name, Output<String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshKey(name, id, state, options);
    }
}
