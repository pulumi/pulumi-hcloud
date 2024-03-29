// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallApplyTo extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallApplyTo Empty = new GetFirewallApplyTo();

    /**
     * (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
     * referenced
     * 
     */
    @Import(name="labelSelector", required=true)
    private String labelSelector;

    /**
     * @return (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
     * referenced
     * 
     */
    public String labelSelector() {
        return this.labelSelector;
    }

    /**
     * (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
     * 
     */
    @Import(name="server", required=true)
    private Integer server;

    /**
     * @return (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
     * 
     */
    public Integer server() {
        return this.server;
    }

    private GetFirewallApplyTo() {}

    private GetFirewallApplyTo(GetFirewallApplyTo $) {
        this.labelSelector = $.labelSelector;
        this.server = $.server;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallApplyTo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallApplyTo $;

        public Builder() {
            $ = new GetFirewallApplyTo();
        }

        public Builder(GetFirewallApplyTo defaults) {
            $ = new GetFirewallApplyTo(Objects.requireNonNull(defaults));
        }

        /**
         * @param labelSelector (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
         * referenced
         * 
         * @return builder
         * 
         */
        public Builder labelSelector(String labelSelector) {
            $.labelSelector = labelSelector;
            return this;
        }

        /**
         * @param server (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
         * 
         * @return builder
         * 
         */
        public Builder server(Integer server) {
            $.server = server;
            return this;
        }

        public GetFirewallApplyTo build() {
            if ($.labelSelector == null) {
                throw new MissingRequiredPropertyException("GetFirewallApplyTo", "labelSelector");
            }
            if ($.server == null) {
                throw new MissingRequiredPropertyException("GetFirewallApplyTo", "server");
            }
            return $;
        }
    }

}
