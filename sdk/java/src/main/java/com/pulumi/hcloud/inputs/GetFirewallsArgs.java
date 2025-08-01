// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallsArgs Empty = new GetFirewallsArgs();

    /**
     * Sorts list by date.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Output<Boolean> mostRecent;

    /**
     * @return Sorts list by date.
     * 
     */
    public Optional<Output<Boolean>> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

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

    private GetFirewallsArgs() {}

    private GetFirewallsArgs(GetFirewallsArgs $) {
        this.mostRecent = $.mostRecent;
        this.withSelector = $.withSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallsArgs $;

        public Builder() {
            $ = new GetFirewallsArgs();
        }

        public Builder(GetFirewallsArgs defaults) {
            $ = new GetFirewallsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mostRecent Sorts list by date.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Output<Boolean> mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param mostRecent Sorts list by date.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(Boolean mostRecent) {
            return mostRecent(Output.of(mostRecent));
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

        public GetFirewallsArgs build() {
            return $;
        }
    }

}
