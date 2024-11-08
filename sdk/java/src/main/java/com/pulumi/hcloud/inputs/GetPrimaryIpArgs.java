// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrimaryIpArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrimaryIpArgs Empty = new GetPrimaryIpArgs();

    /**
     * (int) ID of the assigned resource.
     * 
     */
    @Import(name="assigneeId")
    private @Nullable Output<Integer> assigneeId;

    /**
     * @return (int) ID of the assigned resource.
     * 
     */
    public Optional<Output<Integer>> assigneeId() {
        return Optional.ofNullable(this.assigneeId);
    }

    /**
     * ID of the Primary IP.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return ID of the Primary IP.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * IP address of the Primary IP.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return IP address of the Primary IP.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Name of the Primary IP.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Primary IP.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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

    private GetPrimaryIpArgs() {}

    private GetPrimaryIpArgs(GetPrimaryIpArgs $) {
        this.assigneeId = $.assigneeId;
        this.id = $.id;
        this.ipAddress = $.ipAddress;
        this.name = $.name;
        this.withSelector = $.withSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrimaryIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrimaryIpArgs $;

        public Builder() {
            $ = new GetPrimaryIpArgs();
        }

        public Builder(GetPrimaryIpArgs defaults) {
            $ = new GetPrimaryIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assigneeId (int) ID of the assigned resource.
         * 
         * @return builder
         * 
         */
        public Builder assigneeId(@Nullable Output<Integer> assigneeId) {
            $.assigneeId = assigneeId;
            return this;
        }

        /**
         * @param assigneeId (int) ID of the assigned resource.
         * 
         * @return builder
         * 
         */
        public Builder assigneeId(Integer assigneeId) {
            return assigneeId(Output.of(assigneeId));
        }

        /**
         * @param id ID of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param ipAddress IP address of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress IP address of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param name Name of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        public GetPrimaryIpArgs build() {
            return $;
        }
    }

}