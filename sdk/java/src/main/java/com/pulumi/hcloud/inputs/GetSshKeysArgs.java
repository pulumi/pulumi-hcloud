// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSshKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSshKeysArgs Empty = new GetSshKeysArgs();

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
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

    private GetSshKeysArgs() {}

    private GetSshKeysArgs(GetSshKeysArgs $) {
        this.id = $.id;
        this.withSelector = $.withSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSshKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSshKeysArgs $;

        public Builder() {
            $ = new GetSshKeysArgs();
        }

        public Builder(GetSshKeysArgs defaults) {
            $ = new GetSshKeysArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
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

        public GetSshKeysArgs build() {
            return $;
        }
    }

}
