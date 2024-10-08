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
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Hetzner Cloud SSH key resource to manage SSH keys for server access.
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
 * import com.pulumi.hcloud.SshKey;
 * import com.pulumi.hcloud.SshKeyArgs;
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
 *         // Create a new SSH key
 *         var default_ = new SshKey("default", SshKeyArgs.builder()
 *             .name("Terraform Example")
 *             .publicKey(StdFunctions.file(FileArgs.builder()
 *                 .input("~/.ssh/id_rsa.pub")
 *                 .build()).result())
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
 * SSH keys can be imported using the SSH key `id`:
 * 
 * ```sh
 * $ pulumi import hcloud:index/sshKey:SshKey mykey id
 * ```
 * 
 */
@ResourceType(type="hcloud:index/sshKey:SshKey")
public class SshKey extends com.pulumi.resources.CustomResource {
    /**
     * (string) The fingerprint of the SSH key
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
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
     * Name of the SSH key.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
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
    @Export(name="publicKey", refs={String.class}, tree="[0]")
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
    public SshKey(java.lang.String name) {
        this(name, SshKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshKey(java.lang.String name, SshKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshKey(java.lang.String name, SshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/sshKey:SshKey", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SshKey(java.lang.String name, Output<java.lang.String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("hcloud:index/sshKey:SshKey", name, state, makeResourceOptions(options, id), false);
    }

    private static SshKeyArgs makeArgs(SshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SshKeyArgs.Empty : args;
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
    public static SshKey get(java.lang.String name, Output<java.lang.String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshKey(name, id, state, options);
    }
}
