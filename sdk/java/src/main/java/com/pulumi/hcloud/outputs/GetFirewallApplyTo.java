// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirewallApplyTo {
    /**
     * @return (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
     * referenced
     * 
     */
    private String labelSelector;
    /**
     * @return (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
     * 
     */
    private Integer server;

    private GetFirewallApplyTo() {}
    /**
     * @return (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
     * referenced
     * 
     */
    public String labelSelector() {
        return this.labelSelector;
    }
    /**
     * @return (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
     * 
     */
    public Integer server() {
        return this.server;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallApplyTo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String labelSelector;
        private Integer server;
        public Builder() {}
        public Builder(GetFirewallApplyTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelSelector = defaults.labelSelector;
    	      this.server = defaults.server;
        }

        @CustomType.Setter
        public Builder labelSelector(String labelSelector) {
            this.labelSelector = Objects.requireNonNull(labelSelector);
            return this;
        }
        @CustomType.Setter
        public Builder server(Integer server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }
        public GetFirewallApplyTo build() {
            final var o = new GetFirewallApplyTo();
            o.labelSelector = labelSelector;
            o.server = server;
            return o;
        }
    }
}
