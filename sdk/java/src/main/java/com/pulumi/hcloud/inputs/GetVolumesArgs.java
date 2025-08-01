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


public final class GetVolumesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumesArgs Empty = new GetVolumesArgs();

    /**
     * [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
     * 
     */
    @Import(name="withSelector")
    private @Nullable Output<String> withSelector;

    /**
     * @return [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
     * 
     */
    public Optional<Output<String>> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    /**
     * List only volumes with the specified status, could contain `creating` or `available`.
     * 
     */
    @Import(name="withStatuses")
    private @Nullable Output<List<String>> withStatuses;

    /**
     * @return List only volumes with the specified status, could contain `creating` or `available`.
     * 
     */
    public Optional<Output<List<String>>> withStatuses() {
        return Optional.ofNullable(this.withStatuses);
    }

    private GetVolumesArgs() {}

    private GetVolumesArgs(GetVolumesArgs $) {
        this.withSelector = $.withSelector;
        this.withStatuses = $.withStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumesArgs $;

        public Builder() {
            $ = new GetVolumesArgs();
        }

        public Builder(GetVolumesArgs defaults) {
            $ = new GetVolumesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param withSelector [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
         * 
         * @return builder
         * 
         */
        public Builder withSelector(@Nullable Output<String> withSelector) {
            $.withSelector = withSelector;
            return this;
        }

        /**
         * @param withSelector [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
         * 
         * @return builder
         * 
         */
        public Builder withSelector(String withSelector) {
            return withSelector(Output.of(withSelector));
        }

        /**
         * @param withStatuses List only volumes with the specified status, could contain `creating` or `available`.
         * 
         * @return builder
         * 
         */
        public Builder withStatuses(@Nullable Output<List<String>> withStatuses) {
            $.withStatuses = withStatuses;
            return this;
        }

        /**
         * @param withStatuses List only volumes with the specified status, could contain `creating` or `available`.
         * 
         * @return builder
         * 
         */
        public Builder withStatuses(List<String> withStatuses) {
            return withStatuses(Output.of(withStatuses));
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

        public GetVolumesArgs build() {
            return $;
        }
    }

}
