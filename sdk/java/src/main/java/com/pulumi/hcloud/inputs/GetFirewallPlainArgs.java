// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.hcloud.inputs.GetFirewallApplyTo;
import com.pulumi.hcloud.inputs.GetFirewallRule;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPlainArgs Empty = new GetFirewallPlainArgs();

    /**
     * Configuration of the Applied Resources
     * 
     */
    @Import(name="applyTos")
    private @Nullable List<GetFirewallApplyTo> applyTos;

    /**
     * @return Configuration of the Applied Resources
     * 
     */
    public Optional<List<GetFirewallApplyTo>> applyTos() {
        return Optional.ofNullable(this.applyTos);
    }

    /**
     * ID of the firewall.
     * 
     */
    @Import(name="id")
    private @Nullable Integer id;

    /**
     * @return ID of the firewall.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * (map) User-defined labels (key-value pairs)
     * 
     */
    @Import(name="labels")
    private @Nullable Map<String,Object> labels;

    /**
     * @return (map) User-defined labels (key-value pairs)
     * 
     */
    public Optional<Map<String,Object>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Return most recent firewall if multiple are found.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Boolean mostRecent;

    /**
     * @return Return most recent firewall if multiple are found.
     * 
     */
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * Name of the firewall.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the firewall.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (string)  Configuration of a Rule from this Firewall.
     * 
     */
    @Import(name="rules")
    private @Nullable List<GetFirewallRule> rules;

    /**
     * @return (string)  Configuration of a Rule from this Firewall.
     * 
     */
    public Optional<List<GetFirewallRule>> rules() {
        return Optional.ofNullable(this.rules);
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

    private GetFirewallPlainArgs() {}

    private GetFirewallPlainArgs(GetFirewallPlainArgs $) {
        this.applyTos = $.applyTos;
        this.id = $.id;
        this.labels = $.labels;
        this.mostRecent = $.mostRecent;
        this.name = $.name;
        this.rules = $.rules;
        this.withSelector = $.withSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPlainArgs $;

        public Builder() {
            $ = new GetFirewallPlainArgs();
        }

        public Builder(GetFirewallPlainArgs defaults) {
            $ = new GetFirewallPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applyTos Configuration of the Applied Resources
         * 
         * @return builder
         * 
         */
        public Builder applyTos(@Nullable List<GetFirewallApplyTo> applyTos) {
            $.applyTos = applyTos;
            return this;
        }

        /**
         * @param applyTos Configuration of the Applied Resources
         * 
         * @return builder
         * 
         */
        public Builder applyTos(GetFirewallApplyTo... applyTos) {
            return applyTos(List.of(applyTos));
        }

        /**
         * @param id ID of the firewall.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param labels (map) User-defined labels (key-value pairs)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Map<String,Object> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param mostRecent Return most recent firewall if multiple are found.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param name Name of the firewall.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param rules (string)  Configuration of a Rule from this Firewall.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable List<GetFirewallRule> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules (string)  Configuration of a Rule from this Firewall.
         * 
         * @return builder
         * 
         */
        public Builder rules(GetFirewallRule... rules) {
            return rules(List.of(rules));
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

        public GetFirewallPlainArgs build() {
            return $;
        }
    }

}