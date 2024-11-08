// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerTypesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerTypesArgs Empty = new GetServerTypesArgs();

    /**
     * @deprecated
     * Use server_types list instead
     * 
     */
    @Deprecated /* Use server_types list instead */
    @Import(name="descriptions")
    private @Nullable Output<List<String>> descriptions;

    /**
     * @deprecated
     * Use server_types list instead
     * 
     */
    @Deprecated /* Use server_types list instead */
    public Optional<Output<List<String>>> descriptions() {
        return Optional.ofNullable(this.descriptions);
    }

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * @deprecated
     * Use server_types list instead
     * 
     */
    @Deprecated /* Use server_types list instead */
    @Import(name="names")
    private @Nullable Output<List<String>> names;

    /**
     * @deprecated
     * Use server_types list instead
     * 
     */
    @Deprecated /* Use server_types list instead */
    public Optional<Output<List<String>>> names() {
        return Optional.ofNullable(this.names);
    }

    /**
     * @deprecated
     * Use server_types list instead
     * 
     */
    @Deprecated /* Use server_types list instead */
    @Import(name="serverTypeIds")
    private @Nullable Output<List<String>> serverTypeIds;

    /**
     * @deprecated
     * Use server_types list instead
     * 
     */
    @Deprecated /* Use server_types list instead */
    public Optional<Output<List<String>>> serverTypeIds() {
        return Optional.ofNullable(this.serverTypeIds);
    }

    private GetServerTypesArgs() {}

    private GetServerTypesArgs(GetServerTypesArgs $) {
        this.descriptions = $.descriptions;
        this.id = $.id;
        this.names = $.names;
        this.serverTypeIds = $.serverTypeIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerTypesArgs $;

        public Builder() {
            $ = new GetServerTypesArgs();
        }

        public Builder(GetServerTypesArgs defaults) {
            $ = new GetServerTypesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use server_types list instead
         * 
         */
        @Deprecated /* Use server_types list instead */
        public Builder descriptions(@Nullable Output<List<String>> descriptions) {
            $.descriptions = descriptions;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use server_types list instead
         * 
         */
        @Deprecated /* Use server_types list instead */
        public Builder descriptions(List<String> descriptions) {
            return descriptions(Output.of(descriptions));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use server_types list instead
         * 
         */
        @Deprecated /* Use server_types list instead */
        public Builder descriptions(String... descriptions) {
            return descriptions(List.of(descriptions));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use server_types list instead
         * 
         */
        @Deprecated /* Use server_types list instead */
        public Builder names(@Nullable Output<List<String>> names) {
            $.names = names;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use server_types list instead
         * 
         */
        @Deprecated /* Use server_types list instead */
        public Builder names(List<String> names) {
            return names(Output.of(names));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use server_types list instead
         * 
         */
        @Deprecated /* Use server_types list instead */
        public Builder names(String... names) {
            return names(List.of(names));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use server_types list instead
         * 
         */
        @Deprecated /* Use server_types list instead */
        public Builder serverTypeIds(@Nullable Output<List<String>> serverTypeIds) {
            $.serverTypeIds = serverTypeIds;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use server_types list instead
         * 
         */
        @Deprecated /* Use server_types list instead */
        public Builder serverTypeIds(List<String> serverTypeIds) {
            return serverTypeIds(Output.of(serverTypeIds));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use server_types list instead
         * 
         */
        @Deprecated /* Use server_types list instead */
        public Builder serverTypeIds(String... serverTypeIds) {
            return serverTypeIds(List.of(serverTypeIds));
        }

        public GetServerTypesArgs build() {
            return $;
        }
    }

}
