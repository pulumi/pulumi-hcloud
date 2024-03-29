// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class FloatingIpAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final FloatingIpAssignmentArgs Empty = new FloatingIpAssignmentArgs();

    /**
     * ID of the Floating IP.
     * 
     */
    @Import(name="floatingIpId", required=true)
    private Output<Integer> floatingIpId;

    /**
     * @return ID of the Floating IP.
     * 
     */
    public Output<Integer> floatingIpId() {
        return this.floatingIpId;
    }

    /**
     * Server to assign the Floating IP to.
     * 
     */
    @Import(name="serverId", required=true)
    private Output<Integer> serverId;

    /**
     * @return Server to assign the Floating IP to.
     * 
     */
    public Output<Integer> serverId() {
        return this.serverId;
    }

    private FloatingIpAssignmentArgs() {}

    private FloatingIpAssignmentArgs(FloatingIpAssignmentArgs $) {
        this.floatingIpId = $.floatingIpId;
        this.serverId = $.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FloatingIpAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FloatingIpAssignmentArgs $;

        public Builder() {
            $ = new FloatingIpAssignmentArgs();
        }

        public Builder(FloatingIpAssignmentArgs defaults) {
            $ = new FloatingIpAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param floatingIpId ID of the Floating IP.
         * 
         * @return builder
         * 
         */
        public Builder floatingIpId(Output<Integer> floatingIpId) {
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
        public Builder serverId(Output<Integer> serverId) {
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

        public FloatingIpAssignmentArgs build() {
            if ($.floatingIpId == null) {
                throw new MissingRequiredPropertyException("FloatingIpAssignmentArgs", "floatingIpId");
            }
            if ($.serverId == null) {
                throw new MissingRequiredPropertyException("FloatingIpAssignmentArgs", "serverId");
            }
            return $;
        }
    }

}
