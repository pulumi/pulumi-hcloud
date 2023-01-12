// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FloatingIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final FloatingIpArgs Empty = new FloatingIpArgs();

    /**
     * Enable or disable delete protection.
     * 
     */
    @Import(name="deleteProtection")
    private @Nullable Output<Boolean> deleteProtection;

    /**
     * @return Enable or disable delete protection.
     * 
     */
    public Optional<Output<Boolean>> deleteProtection() {
        return Optional.ofNullable(this.deleteProtection);
    }

    /**
     * Description of the Floating IP.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the Floating IP.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of home location (routing is optimized for that location). Optional if server_id argument is passed.
     * 
     */
    @Import(name="homeLocation")
    private @Nullable Output<String> homeLocation;

    /**
     * @return Name of home location (routing is optimized for that location). Optional if server_id argument is passed.
     * 
     */
    public Optional<Output<String>> homeLocation() {
        return Optional.ofNullable(this.homeLocation);
    }

    /**
     * User-defined labels (key-value pairs) should be created with.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the Floating IP.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Floating IP.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Server to assign the Floating IP to.
     * 
     */
    @Import(name="serverId")
    private @Nullable Output<Integer> serverId;

    /**
     * @return Server to assign the Floating IP to.
     * 
     */
    public Optional<Output<Integer>> serverId() {
        return Optional.ofNullable(this.serverId);
    }

    /**
     * Type of the Floating IP. `ipv4` `ipv6`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of the Floating IP. `ipv4` `ipv6`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FloatingIpArgs() {}

    private FloatingIpArgs(FloatingIpArgs $) {
        this.deleteProtection = $.deleteProtection;
        this.description = $.description;
        this.homeLocation = $.homeLocation;
        this.labels = $.labels;
        this.name = $.name;
        this.serverId = $.serverId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FloatingIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FloatingIpArgs $;

        public Builder() {
            $ = new FloatingIpArgs();
        }

        public Builder(FloatingIpArgs defaults) {
            $ = new FloatingIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteProtection Enable or disable delete protection.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(@Nullable Output<Boolean> deleteProtection) {
            $.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * @param deleteProtection Enable or disable delete protection.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(Boolean deleteProtection) {
            return deleteProtection(Output.of(deleteProtection));
        }

        /**
         * @param description Description of the Floating IP.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the Floating IP.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param homeLocation Name of home location (routing is optimized for that location). Optional if server_id argument is passed.
         * 
         * @return builder
         * 
         */
        public Builder homeLocation(@Nullable Output<String> homeLocation) {
            $.homeLocation = homeLocation;
            return this;
        }

        /**
         * @param homeLocation Name of home location (routing is optimized for that location). Optional if server_id argument is passed.
         * 
         * @return builder
         * 
         */
        public Builder homeLocation(String homeLocation) {
            return homeLocation(Output.of(homeLocation));
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the Floating IP.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Floating IP.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serverId Server to assign the Floating IP to.
         * 
         * @return builder
         * 
         */
        public Builder serverId(@Nullable Output<Integer> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId Server to assign the Floating IP to.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Integer serverId) {
            return serverId(Output.of(serverId));
        }

        /**
         * @param type Type of the Floating IP. `ipv4` `ipv6`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the Floating IP. `ipv4` `ipv6`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FloatingIpArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
