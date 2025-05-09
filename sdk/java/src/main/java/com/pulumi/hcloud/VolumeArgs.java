// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    /**
     * Automount the volume upon attaching it (server_id must be provided).
     * 
     */
    @Import(name="automount")
    private @Nullable Output<Boolean> automount;

    /**
     * @return Automount the volume upon attaching it (server_id must be provided).
     * 
     */
    public Optional<Output<Boolean>> automount() {
        return Optional.ofNullable(this.automount);
    }

    /**
     * Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     * **Note:** When you want to attach multiple volumes to a server, please use the `hcloud.VolumeAttachment` resource and the `location` argument instead of the `server_id` argument.
     * 
     */
    @Import(name="deleteProtection")
    private @Nullable Output<Boolean> deleteProtection;

    /**
     * @return Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     * **Note:** When you want to attach multiple volumes to a server, please use the `hcloud.VolumeAttachment` resource and the `location` argument instead of the `server_id` argument.
     * 
     */
    public Optional<Output<Boolean>> deleteProtection() {
        return Optional.ofNullable(this.deleteProtection);
    }

    /**
     * Format volume after creation. `xfs` or `ext4`
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Format volume after creation. `xfs` or `ext4`
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * User-defined labels (key-value pairs).
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels (key-value pairs).
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location name of the volume to create, not allowed if server_id argument is passed. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location name of the volume to create, not allowed if server_id argument is passed. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the volume to create (must be unique per project).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the volume to create (must be unique per project).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Server to attach the Volume to, not allowed if location argument is passed.
     * 
     */
    @Import(name="serverId")
    private @Nullable Output<Integer> serverId;

    /**
     * @return Server to attach the Volume to, not allowed if location argument is passed.
     * 
     */
    public Optional<Output<Integer>> serverId() {
        return Optional.ofNullable(this.serverId);
    }

    /**
     * Size of the volume (in GB).
     * 
     */
    @Import(name="size", required=true)
    private Output<Integer> size;

    /**
     * @return Size of the volume (in GB).
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }

    private VolumeArgs() {}

    private VolumeArgs(VolumeArgs $) {
        this.automount = $.automount;
        this.deleteProtection = $.deleteProtection;
        this.format = $.format;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.serverId = $.serverId;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeArgs $;

        public Builder() {
            $ = new VolumeArgs();
        }

        public Builder(VolumeArgs defaults) {
            $ = new VolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automount Automount the volume upon attaching it (server_id must be provided).
         * 
         * @return builder
         * 
         */
        public Builder automount(@Nullable Output<Boolean> automount) {
            $.automount = automount;
            return this;
        }

        /**
         * @param automount Automount the volume upon attaching it (server_id must be provided).
         * 
         * @return builder
         * 
         */
        public Builder automount(Boolean automount) {
            return automount(Output.of(automount));
        }

        /**
         * @param deleteProtection Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
         * 
         * **Note:** When you want to attach multiple volumes to a server, please use the `hcloud.VolumeAttachment` resource and the `location` argument instead of the `server_id` argument.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(@Nullable Output<Boolean> deleteProtection) {
            $.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * @param deleteProtection Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
         * 
         * **Note:** When you want to attach multiple volumes to a server, please use the `hcloud.VolumeAttachment` resource and the `location` argument instead of the `server_id` argument.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(Boolean deleteProtection) {
            return deleteProtection(Output.of(deleteProtection));
        }

        /**
         * @param format Format volume after creation. `xfs` or `ext4`
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Format volume after creation. `xfs` or `ext4`
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param labels User-defined labels (key-value pairs).
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels (key-value pairs).
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location name of the volume to create, not allowed if server_id argument is passed. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location name of the volume to create, not allowed if server_id argument is passed. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Name of the volume to create (must be unique per project).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the volume to create (must be unique per project).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serverId Server to attach the Volume to, not allowed if location argument is passed.
         * 
         * @return builder
         * 
         */
        public Builder serverId(@Nullable Output<Integer> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId Server to attach the Volume to, not allowed if location argument is passed.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Integer serverId) {
            return serverId(Output.of(serverId));
        }

        /**
         * @param size Size of the volume (in GB).
         * 
         * @return builder
         * 
         */
        public Builder size(Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Size of the volume (in GB).
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        public VolumeArgs build() {
            if ($.size == null) {
                throw new MissingRequiredPropertyException("VolumeArgs", "size");
            }
            return $;
        }
    }

}
