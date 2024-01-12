// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkState Empty = new NetworkState();

    /**
     * Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    @Import(name="deleteProtection")
    private @Nullable Output<Boolean> deleteProtection;

    /**
     * @return Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    public Optional<Output<Boolean>> deleteProtection() {
        return Optional.ofNullable(this.deleteProtection);
    }

    /**
     * Enable or disable exposing the routes to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
     * 
     */
    @Import(name="exposeRoutesToVswitch")
    private @Nullable Output<Boolean> exposeRoutesToVswitch;

    /**
     * @return Enable or disable exposing the routes to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
     * 
     */
    public Optional<Output<Boolean>> exposeRoutesToVswitch() {
        return Optional.ofNullable(this.exposeRoutesToVswitch);
    }

    /**
     * IP Range of the whole Network which must span all included subnets and route destinations. Must be one of the private ipv4 ranges of RFC1918.
     * 
     */
    @Import(name="ipRange")
    private @Nullable Output<String> ipRange;

    /**
     * @return IP Range of the whole Network which must span all included subnets and route destinations. Must be one of the private ipv4 ranges of RFC1918.
     * 
     */
    public Optional<Output<String>> ipRange() {
        return Optional.ofNullable(this.ipRange);
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
     * Name of the Network to create (must be unique per project).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Network to create (must be unique per project).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private NetworkState() {}

    private NetworkState(NetworkState $) {
        this.deleteProtection = $.deleteProtection;
        this.exposeRoutesToVswitch = $.exposeRoutesToVswitch;
        this.ipRange = $.ipRange;
        this.labels = $.labels;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkState $;

        public Builder() {
            $ = new NetworkState();
        }

        public Builder(NetworkState defaults) {
            $ = new NetworkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteProtection Enable or disable delete protection. See &#34;Delete Protection&#34; in the Provider Docs for details.
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
         * @return builder
         * 
         */
        public Builder deleteProtection(Boolean deleteProtection) {
            return deleteProtection(Output.of(deleteProtection));
        }

        /**
         * @param exposeRoutesToVswitch Enable or disable exposing the routes to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
         * 
         * @return builder
         * 
         */
        public Builder exposeRoutesToVswitch(@Nullable Output<Boolean> exposeRoutesToVswitch) {
            $.exposeRoutesToVswitch = exposeRoutesToVswitch;
            return this;
        }

        /**
         * @param exposeRoutesToVswitch Enable or disable exposing the routes to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
         * 
         * @return builder
         * 
         */
        public Builder exposeRoutesToVswitch(Boolean exposeRoutesToVswitch) {
            return exposeRoutesToVswitch(Output.of(exposeRoutesToVswitch));
        }

        /**
         * @param ipRange IP Range of the whole Network which must span all included subnets and route destinations. Must be one of the private ipv4 ranges of RFC1918.
         * 
         * @return builder
         * 
         */
        public Builder ipRange(@Nullable Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        /**
         * @param ipRange IP Range of the whole Network which must span all included subnets and route destinations. Must be one of the private ipv4 ranges of RFC1918.
         * 
         * @return builder
         * 
         */
        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
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
         * @param name Name of the Network to create (must be unique per project).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Network to create (must be unique per project).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public NetworkState build() {
            return $;
        }
    }

}
