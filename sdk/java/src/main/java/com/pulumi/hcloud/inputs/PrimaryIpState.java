// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrimaryIpState extends com.pulumi.resources.ResourceArgs {

    public static final PrimaryIpState Empty = new PrimaryIpState();

    /**
     * ID of the assigned resource
     * 
     */
    @Import(name="assigneeId")
    private @Nullable Output<Integer> assigneeId;

    /**
     * @return ID of the assigned resource
     * 
     */
    public Optional<Output<Integer>> assigneeId() {
        return Optional.ofNullable(this.assigneeId);
    }

    /**
     * The type of the assigned resource.
     * 
     */
    @Import(name="assigneeType")
    private @Nullable Output<String> assigneeType;

    /**
     * @return The type of the assigned resource.
     * 
     */
    public Optional<Output<String>> assigneeType() {
        return Optional.ofNullable(this.assigneeType);
    }

    /**
     * Whether auto delete is enabled.
     * `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
     * 
     */
    @Import(name="autoDelete")
    private @Nullable Output<Boolean> autoDelete;

    /**
     * @return Whether auto delete is enabled.
     * `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
     * 
     */
    public Optional<Output<Boolean>> autoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }

    @Import(name="datacenter")
    private @Nullable Output<String> datacenter;

    public Optional<Output<String>> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }

    /**
     * Whether delete protection is enabled.
     * 
     */
    @Import(name="deleteProtection")
    private @Nullable Output<Boolean> deleteProtection;

    /**
     * @return Whether delete protection is enabled.
     * 
     */
    public Optional<Output<Boolean>> deleteProtection() {
        return Optional.ofNullable(this.deleteProtection);
    }

    /**
     * (string) IP Address of the Primary IP.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return (string) IP Address of the Primary IP.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    @Import(name="ipNetwork")
    private @Nullable Output<String> ipNetwork;

    public Optional<Output<String>> ipNetwork() {
        return Optional.ofNullable(this.ipNetwork);
    }

    /**
     * Description of the Primary IP.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Description of the Primary IP.
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
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
     * Type of the Primary IP.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the Primary IP.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private PrimaryIpState() {}

    private PrimaryIpState(PrimaryIpState $) {
        this.assigneeId = $.assigneeId;
        this.assigneeType = $.assigneeType;
        this.autoDelete = $.autoDelete;
        this.datacenter = $.datacenter;
        this.deleteProtection = $.deleteProtection;
        this.ipAddress = $.ipAddress;
        this.ipNetwork = $.ipNetwork;
        this.labels = $.labels;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrimaryIpState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrimaryIpState $;

        public Builder() {
            $ = new PrimaryIpState();
        }

        public Builder(PrimaryIpState defaults) {
            $ = new PrimaryIpState(Objects.requireNonNull(defaults));
        }

        /**
         * @param assigneeId ID of the assigned resource
         * 
         * @return builder
         * 
         */
        public Builder assigneeId(@Nullable Output<Integer> assigneeId) {
            $.assigneeId = assigneeId;
            return this;
        }

        /**
         * @param assigneeId ID of the assigned resource
         * 
         * @return builder
         * 
         */
        public Builder assigneeId(Integer assigneeId) {
            return assigneeId(Output.of(assigneeId));
        }

        /**
         * @param assigneeType The type of the assigned resource.
         * 
         * @return builder
         * 
         */
        public Builder assigneeType(@Nullable Output<String> assigneeType) {
            $.assigneeType = assigneeType;
            return this;
        }

        /**
         * @param assigneeType The type of the assigned resource.
         * 
         * @return builder
         * 
         */
        public Builder assigneeType(String assigneeType) {
            return assigneeType(Output.of(assigneeType));
        }

        /**
         * @param autoDelete Whether auto delete is enabled.
         * `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            $.autoDelete = autoDelete;
            return this;
        }

        /**
         * @param autoDelete Whether auto delete is enabled.
         * `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(Boolean autoDelete) {
            return autoDelete(Output.of(autoDelete));
        }

        public Builder datacenter(@Nullable Output<String> datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        public Builder datacenter(String datacenter) {
            return datacenter(Output.of(datacenter));
        }

        /**
         * @param deleteProtection Whether delete protection is enabled.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(@Nullable Output<Boolean> deleteProtection) {
            $.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * @param deleteProtection Whether delete protection is enabled.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(Boolean deleteProtection) {
            return deleteProtection(Output.of(deleteProtection));
        }

        /**
         * @param ipAddress (string) IP Address of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress (string) IP Address of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder ipNetwork(@Nullable Output<String> ipNetwork) {
            $.ipNetwork = ipNetwork;
            return this;
        }

        public Builder ipNetwork(String ipNetwork) {
            return ipNetwork(Output.of(ipNetwork));
        }

        /**
         * @param labels Description of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Description of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
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
         * @param type Type of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PrimaryIpState build() {
            return $;
        }
    }

}
