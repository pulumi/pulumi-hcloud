// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * Description of the snapshot.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the snapshot.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User-defined labels (key-value pairs) should be created with.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Server to the snapshot should be created from.
     * 
     */
    @Import(name="serverId", required=true)
    private Output<Integer> serverId;

    /**
     * @return Server to the snapshot should be created from.
     * 
     */
    public Output<Integer> serverId() {
        return this.serverId;
    }

    private SnapshotArgs() {}

    private SnapshotArgs(SnapshotArgs $) {
        this.description = $.description;
        this.labels = $.labels;
        this.serverId = $.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotArgs $;

        public Builder() {
            $ = new SnapshotArgs();
        }

        public Builder(SnapshotArgs defaults) {
            $ = new SnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param serverId Server to the snapshot should be created from.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Output<Integer> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId Server to the snapshot should be created from.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Integer serverId) {
            return serverId(Output.of(serverId));
        }

        public SnapshotArgs build() {
            $.serverId = Objects.requireNonNull($.serverId, "expected parameter 'serverId' to be non-null");
            return $;
        }
    }

}
