// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FloatingIpAssignmentState extends com.pulumi.resources.ResourceArgs {

    public static final FloatingIpAssignmentState Empty = new FloatingIpAssignmentState();

    /**
     * ID of the Floating IP.
     * 
     */
    @Import(name="floatingIpId")
    private @Nullable Output<Integer> floatingIpId;

    /**
     * @return ID of the Floating IP.
     * 
     */
    public Optional<Output<Integer>> floatingIpId() {
        return Optional.ofNullable(this.floatingIpId);
    }

    /**
     * Server to assign the Floating IP to.
     * 
     */
    @Import(name="serverId")
    private @Nullable Output<Integer> serverId;

    /**
     * @return Server to assign the Floating IP to.
     * 
     */
    public Optional<Output<Integer>> serverId() {
        return Optional.ofNullable(this.serverId);
    }

    private FloatingIpAssignmentState() {}

    private FloatingIpAssignmentState(FloatingIpAssignmentState $) {
        this.floatingIpId = $.floatingIpId;
        this.serverId = $.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FloatingIpAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FloatingIpAssignmentState $;

        public Builder() {
            $ = new FloatingIpAssignmentState();
        }

        public Builder(FloatingIpAssignmentState defaults) {
            $ = new FloatingIpAssignmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param floatingIpId ID of the Floating IP.
         * 
         * @return builder
         * 
         */
        public Builder floatingIpId(@Nullable Output<Integer> floatingIpId) {
            $.floatingIpId = floatingIpId;
            return this;
        }

        /**
         * @param floatingIpId ID of the Floating IP.
         * 
         * @return builder
         * 
         */
        public Builder floatingIpId(Integer floatingIpId) {
            return floatingIpId(Output.of(floatingIpId));
        }

        /**
         * @param serverId Server to assign the Floating IP to.
         * 
         * @return builder
         * 
         */
        public Builder serverId(@Nullable Output<Integer> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId Server to assign the Floating IP to.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Integer serverId) {
            return serverId(Output.of(serverId));
        }

        public FloatingIpAssignmentState build() {
            return $;
        }
    }

}
