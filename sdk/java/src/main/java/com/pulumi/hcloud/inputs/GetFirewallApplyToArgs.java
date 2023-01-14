// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallApplyToArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFirewallApplyToArgs Empty = new GetFirewallApplyToArgs();

    /**
     * (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
     * referenced
     * 
     */
    @Import(name="labelSelector", required=true)
    private Output<String> labelSelector;

    /**
     * @return (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
     * referenced
     * 
     */
    public Output<String> labelSelector() {
        return this.labelSelector;
    }

    /**
     * (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
     * 
     */
    @Import(name="server", required=true)
    private Output<Integer> server;

    /**
     * @return (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
     * 
     */
    public Output<Integer> server() {
        return this.server;
    }

    private GetFirewallApplyToArgs() {}

    private GetFirewallApplyToArgs(GetFirewallApplyToArgs $) {
        this.labelSelector = $.labelSelector;
        this.server = $.server;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallApplyToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallApplyToArgs $;

        public Builder() {
            $ = new GetFirewallApplyToArgs();
        }

        public Builder(GetFirewallApplyToArgs defaults) {
            $ = new GetFirewallApplyToArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labelSelector (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
         * referenced
         * 
         * @return builder
         * 
         */
        public Builder labelSelector(Output<String> labelSelector) {
            $.labelSelector = labelSelector;
            return this;
        }

        /**
         * @param labelSelector (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
         * referenced
         * 
         * @return builder
         * 
         */
        public Builder labelSelector(String labelSelector) {
            return labelSelector(Output.of(labelSelector));
        }

        /**
         * @param server (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
         * 
         * @return builder
         * 
         */
        public Builder server(Output<Integer> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
         * 
         * @return builder
         * 
         */
        public Builder server(Integer server) {
            return server(Output.of(server));
        }

        public GetFirewallApplyToArgs build() {
            $.labelSelector = Objects.requireNonNull($.labelSelector, "expected parameter 'labelSelector' to be non-null");
            $.server = Objects.requireNonNull($.server, "expected parameter 'server' to be non-null");
            return $;
        }
    }

}
