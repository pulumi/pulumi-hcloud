// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagePlainArgs Empty = new GetImagePlainArgs();

    /**
     * ID of the Image.
     * 
     */
    @Import(name="id")
    private @Nullable Integer id;

    /**
     * @return ID of the Image.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Also return the image if it is marked as deprecated.
     * 
     */
    @Import(name="includeDeprecated")
    private @Nullable Boolean includeDeprecated;

    /**
     * @return Also return the image if it is marked as deprecated.
     * 
     */
    public Optional<Boolean> includeDeprecated() {
        return Optional.ofNullable(this.includeDeprecated);
    }

    /**
     * If more than one result is returned, use the most recent Image.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Boolean mostRecent;

    /**
     * @return If more than one result is returned, use the most recent Image.
     * 
     */
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * Name of the Image.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the Image.
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
     * Select only images with this architecture, could be `x86` (default) or `arm`.
     * 
     */
    @Import(name="withArchitecture")
    private @Nullable String withArchitecture;

    /**
     * @return Select only images with this architecture, could be `x86` (default) or `arm`.
     * 
     */
    public Optional<String> withArchitecture() {
        return Optional.ofNullable(this.withArchitecture);
    }

    /**
     * [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     * 
     */
    @Import(name="withSelector")
    private @Nullable String withSelector;

    /**
     * @return [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
     * 
     */
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    /**
     * Select only images with the specified status, could contain `creating` or `available`.
     * 
     */
    @Import(name="withStatuses")
    private @Nullable List<String> withStatuses;

    /**
     * @return Select only images with the specified status, could contain `creating` or `available`.
     * 
     */
    public Optional<List<String>> withStatuses() {
        return Optional.ofNullable(this.withStatuses);
    }

    private GetImagePlainArgs() {}

    private GetImagePlainArgs(GetImagePlainArgs $) {
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
    public static Builder builder(GetImagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagePlainArgs $;

        public Builder() {
            $ = new GetImagePlainArgs();
        }

        public Builder(GetImagePlainArgs defaults) {
            $ = new GetImagePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the Image.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param includeDeprecated Also return the image if it is marked as deprecated.
         * 
         * @return builder
         * 
         */
        public Builder includeDeprecated(@Nullable Boolean includeDeprecated) {
            $.includeDeprecated = includeDeprecated;
            return this;
        }

        /**
         * @param mostRecent If more than one result is returned, use the most recent Image.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param name Name of the Image.
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
         * @param withArchitecture Select only images with this architecture, could be `x86` (default) or `arm`.
         * 
         * @return builder
         * 
         */
        public Builder withArchitecture(@Nullable String withArchitecture) {
            $.withArchitecture = withArchitecture;
            return this;
        }

        /**
         * @param withSelector [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
         * 
         * @return builder
         * 
         */
        public Builder withSelector(@Nullable String withSelector) {
            $.withSelector = withSelector;
            return this;
        }

        /**
         * @param withStatuses Select only images with the specified status, could contain `creating` or `available`.
         * 
         * @return builder
         * 
         */
        public Builder withStatuses(@Nullable List<String> withStatuses) {
            $.withStatuses = withStatuses;
            return this;
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

        public GetImagePlainArgs build() {
            return $;
        }
    }

}
