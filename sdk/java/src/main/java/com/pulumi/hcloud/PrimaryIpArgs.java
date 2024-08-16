// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrimaryIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrimaryIpArgs Empty = new PrimaryIpArgs();

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
     * The type of the assigned resource. Currently supported: `server`
     * 
     */
    @Import(name="assigneeType", required=true)
    private Output<String> assigneeType;

    /**
     * @return The type of the assigned resource. Currently supported: `server`
     * 
     */
    public Output<String> assigneeType() {
        return this.assigneeType;
    }

    /**
     * Whether auto delete is enabled.
     * `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
     * 
     */
    @Import(name="autoDelete", required=true)
    private Output<Boolean> autoDelete;

    /**
     * @return Whether auto delete is enabled.
     * `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
     * 
     */
    public Output<Boolean> autoDelete() {
        return this.autoDelete;
    }

    /**
     * The datacenter name to create the resource in.
     * 
     */
    @Import(name="datacenter")
    private @Nullable Output<String> datacenter;

    /**
     * @return The datacenter name to create the resource in.
     * 
     */
    public Optional<Output<String>> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }

    /**
     * Whether delete protection is enabled. See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    @Import(name="deleteProtection")
    private @Nullable Output<Boolean> deleteProtection;

    /**
     * @return Whether delete protection is enabled. See &#34;Delete Protection&#34; in the Provider Docs for details.
     * 
     */
    public Optional<Output<Boolean>> deleteProtection() {
        return Optional.ofNullable(this.deleteProtection);
    }

    /**
     * Description of the Primary IP.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Description of the Primary IP.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
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
     * Type of the Primary IP. `ipv4` or `ipv6`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of the Primary IP. `ipv4` or `ipv6`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private PrimaryIpArgs() {}

    private PrimaryIpArgs(PrimaryIpArgs $) {
        this.assigneeId = $.assigneeId;
        this.assigneeType = $.assigneeType;
        this.autoDelete = $.autoDelete;
        this.datacenter = $.datacenter;
        this.deleteProtection = $.deleteProtection;
        this.labels = $.labels;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrimaryIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrimaryIpArgs $;

        public Builder() {
            $ = new PrimaryIpArgs();
        }

        public Builder(PrimaryIpArgs defaults) {
            $ = new PrimaryIpArgs(Objects.requireNonNull(defaults));
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
         * @param assigneeType The type of the assigned resource. Currently supported: `server`
         * 
         * @return builder
         * 
         */
        public Builder assigneeType(Output<String> assigneeType) {
            $.assigneeType = assigneeType;
            return this;
        }

        /**
         * @param assigneeType The type of the assigned resource. Currently supported: `server`
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
        public Builder autoDelete(Output<Boolean> autoDelete) {
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

        /**
         * @param datacenter The datacenter name to create the resource in.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(@Nullable Output<String> datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        /**
         * @param datacenter The datacenter name to create the resource in.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(String datacenter) {
            return datacenter(Output.of(datacenter));
        }

        /**
         * @param deleteProtection Whether delete protection is enabled. See &#34;Delete Protection&#34; in the Provider Docs for details.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(@Nullable Output<Boolean> deleteProtection) {
            $.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * @param deleteProtection Whether delete protection is enabled. See &#34;Delete Protection&#34; in the Provider Docs for details.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(Boolean deleteProtection) {
            return deleteProtection(Output.of(deleteProtection));
        }

        /**
         * @param labels Description of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Description of the Primary IP.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
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
         * @param type Type of the Primary IP. `ipv4` or `ipv6`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the Primary IP. `ipv4` or `ipv6`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PrimaryIpArgs build() {
            if ($.assigneeType == null) {
                throw new MissingRequiredPropertyException("PrimaryIpArgs", "assigneeType");
            }
            if ($.autoDelete == null) {
                throw new MissingRequiredPropertyException("PrimaryIpArgs", "autoDelete");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("PrimaryIpArgs", "type");
            }
            return $;
        }
    }

}
