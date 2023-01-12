// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumePlainArgs Empty = new GetVolumePlainArgs();

    /**
     * ID of the volume.
     * 
     */
    @Import(name="id")
    private @Nullable Integer id;

    /**
     * @return ID of the volume.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * (string) The location name.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return (string) The location name.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the volume.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the volume.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * @deprecated
     * Please use the with_selector property instead.
     * 
     */
    @Deprecated /* Please use the with_selector property instead. */
    @Import(name="selector")
    private @Nullable String selector;

    /**
     * @deprecated
     * Please use the with_selector property instead.
     * 
     */
    @Deprecated /* Please use the with_selector property instead. */
    public Optional<String> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * (Optional, int) Server ID the volume is attached to
     * 
     */
    @Import(name="serverId")
    private @Nullable Integer serverId;

    /**
     * @return (Optional, int) Server ID the volume is attached to
     * 
     */
    public Optional<Integer> serverId() {
        return Optional.ofNullable(this.serverId);
    }

    /**
     * Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     * 
     */
    @Import(name="withSelector")
    private @Nullable String withSelector;

    /**
     * @return Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
     * 
     */
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    /**
     * List only volumes with the specified status, could contain `creating` or `available`.
     * 
     */
    @Import(name="withStatuses")
    private @Nullable List<String> withStatuses;

    /**
     * @return List only volumes with the specified status, could contain `creating` or `available`.
     * 
     */
    public Optional<List<String>> withStatuses() {
        return Optional.ofNullable(this.withStatuses);
    }

    private GetVolumePlainArgs() {}

    private GetVolumePlainArgs(GetVolumePlainArgs $) {
        this.id = $.id;
        this.location = $.location;
        this.name = $.name;
        this.selector = $.selector;
        this.serverId = $.serverId;
        this.withSelector = $.withSelector;
        this.withStatuses = $.withStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumePlainArgs $;

        public Builder() {
            $ = new GetVolumePlainArgs();
        }

        public Builder(GetVolumePlainArgs defaults) {
            $ = new GetVolumePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the volume.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param location (string) The location name.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param name Name of the volume.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Please use the with_selector property instead.
         * 
         */
        @Deprecated /* Please use the with_selector property instead. */
        public Builder selector(@Nullable String selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param serverId (Optional, int) Server ID the volume is attached to
         * 
         * @return builder
         * 
         */
        public Builder serverId(@Nullable Integer serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param withSelector Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
         * 
         * @return builder
         * 
         */
        public Builder withSelector(@Nullable String withSelector) {
            $.withSelector = withSelector;
            return this;
        }

        /**
         * @param withStatuses List only volumes with the specified status, could contain `creating` or `available`.
         * 
         * @return builder
         * 
         */
        public Builder withStatuses(@Nullable List<String> withStatuses) {
            $.withStatuses = withStatuses;
            return this;
        }

        /**
         * @param withStatuses List only volumes with the specified status, could contain `creating` or `available`.
         * 
         * @return builder
         * 
         */
        public Builder withStatuses(String... withStatuses) {
            return withStatuses(List.of(withStatuses));
        }

        public GetVolumePlainArgs build() {
            return $;
        }
    }

}
