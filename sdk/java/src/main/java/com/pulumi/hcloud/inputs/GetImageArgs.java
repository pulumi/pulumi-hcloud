// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageArgs Empty = new GetImageArgs();

    /**
     * ID of the Image.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return ID of the Image.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Also return the image if it is marked as deprecated.
     * 
     */
    @Import(name="includeDeprecated")
    private @Nullable Output<Boolean> includeDeprecated;

    /**
     * @return Also return the image if it is marked as deprecated.
     * 
     */
    public Optional<Output<Boolean>> includeDeprecated() {
        return Optional.ofNullable(this.includeDeprecated);
    }

    /**
     * If more than one result is returned, use the most recent Image.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Output<Boolean> mostRecent;

    /**
     * @return If more than one result is returned, use the most recent Image.
     * 
     */
    public Optional<Output<Boolean>> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * Name of the Image.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Image.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * @deprecated
     * Please use the with_selector property instead.
     * 
     */
    @Deprecated /* Please use the with_selector property instead. */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @deprecated
     * Please use the with_selector property instead.
     * 
     */
    @Deprecated /* Please use the with_selector property instead. */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * Select only images with this architecture, could be `x86` (default) or `arm`.
     * 
     */
    @Import(name="withArchitecture")
    private @Nullable Output<String> withArchitecture;

    /**
     * @return Select only images with this architecture, could be `x86` (default) or `arm`.
     * 
     */
    public Optional<Output<String>> withArchitecture() {
        return Optional.ofNullable(this.withArchitecture);
    }

    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     * 
     */
    @Import(name="withSelector")
    private @Nullable Output<String> withSelector;

    /**
     * @return [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     * 
     */
    public Optional<Output<String>> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    /**
     * Select only images with the specified status, could contain `creating` or `available`.
     * 
     */
    @Import(name="withStatuses")
    private @Nullable Output<List<String>> withStatuses;

    /**
     * @return Select only images with the specified status, could contain `creating` or `available`.
     * 
     */
    public Optional<Output<List<String>>> withStatuses() {
        return Optional.ofNullable(this.withStatuses);
    }

    private GetImageArgs() {}

    private GetImageArgs(GetImageArgs $) {
        this.id = $.id;
        this.includeDeprecated = $.includeDeprecated;
        this.mostRecent = $.mostRecent;
        this.name = $.name;
        this.selector = $.selector;
        this.withArchitecture = $.withArchitecture;
        this.withSelector = $.withSelector;
        this.withStatuses = $.withStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageArgs $;

        public Builder() {
            $ = new GetImageArgs();
        }

        public Builder(GetImageArgs defaults) {
            $ = new GetImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the Image.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the Image.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param includeDeprecated Also return the image if it is marked as deprecated.
         * 
         * @return builder
         * 
         */
        public Builder includeDeprecated(@Nullable Output<Boolean> includeDeprecated) {
            $.includeDeprecated = includeDeprecated;
            return this;
        }

        /**
         * @param includeDeprecated Also return the image if it is marked as deprecated.
         * 
         * @return builder
         * 
         */
        public Builder includeDeprecated(Boolean includeDeprecated) {
            return includeDeprecated(Output.of(includeDeprecated));
        }

        /**
         * @param mostRecent If more than one result is returned, use the most recent Image.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Output<Boolean> mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param mostRecent If more than one result is returned, use the most recent Image.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(Boolean mostRecent) {
            return mostRecent(Output.of(mostRecent));
        }

        /**
         * @param name Name of the Image.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Image.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Please use the with_selector property instead.
         * 
         */
        @Deprecated /* Please use the with_selector property instead. */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
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
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param withArchitecture Select only images with this architecture, could be `x86` (default) or `arm`.
         * 
         * @return builder
         * 
         */
        public Builder withArchitecture(@Nullable Output<String> withArchitecture) {
            $.withArchitecture = withArchitecture;
            return this;
        }

        /**
         * @param withArchitecture Select only images with this architecture, could be `x86` (default) or `arm`.
         * 
         * @return builder
         * 
         */
        public Builder withArchitecture(String withArchitecture) {
            return withArchitecture(Output.of(withArchitecture));
        }

        /**
         * @param withSelector [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
         * 
         * @return builder
         * 
         */
        public Builder withSelector(@Nullable Output<String> withSelector) {
            $.withSelector = withSelector;
            return this;
        }

        /**
         * @param withSelector [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
         * 
         * @return builder
         * 
         */
        public Builder withSelector(String withSelector) {
            return withSelector(Output.of(withSelector));
        }

        /**
         * @param withStatuses Select only images with the specified status, could contain `creating` or `available`.
         * 
         * @return builder
         * 
         */
        public Builder withStatuses(@Nullable Output<List<String>> withStatuses) {
            $.withStatuses = withStatuses;
            return this;
        }

        /**
         * @param withStatuses Select only images with the specified status, could contain `creating` or `available`.
         * 
         * @return builder
         * 
         */
        public Builder withStatuses(List<String> withStatuses) {
            return withStatuses(Output.of(withStatuses));
        }

        /**
         * @param withStatuses Select only images with the specified status, could contain `creating` or `available`.
         * 
         * @return builder
         * 
         */
        public Builder withStatuses(String... withStatuses) {
            return withStatuses(List.of(withStatuses));
        }

        public GetImageArgs build() {
            return $;
        }
    }

}
