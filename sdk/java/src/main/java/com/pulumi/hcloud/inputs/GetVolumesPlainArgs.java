// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumesPlainArgs Empty = new GetVolumesPlainArgs();

    /**
     * [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
     * 
     */
    @Import(name="withSelector")
    private @Nullable String withSelector;

    /**
     * @return [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
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

    private GetVolumesPlainArgs() {}

    private GetVolumesPlainArgs(GetVolumesPlainArgs $) {
        this.withSelector = $.withSelector;
        this.withStatuses = $.withStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumesPlainArgs $;

        public Builder() {
            $ = new GetVolumesPlainArgs();
        }

        public Builder(GetVolumesPlainArgs defaults) {
            $ = new GetVolumesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param withSelector [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
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

        public GetVolumesPlainArgs build() {
            return $;
        }
    }

}
