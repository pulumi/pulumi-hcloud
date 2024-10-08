// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotState extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotState Empty = new SnapshotState();

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
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels (key-value pairs) should be created with.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Server to the snapshot should be created from.
     * 
     */
    @Import(name="serverId")
    private @Nullable Output<Integer> serverId;

    /**
     * @return Server to the snapshot should be created from.
     * 
     */
    public Optional<Output<Integer>> serverId() {
        return Optional.ofNullable(this.serverId);
    }

    private SnapshotState() {}

    private SnapshotState(SnapshotState $) {
        this.description = $.description;
        this.labels = $.labels;
        this.serverId = $.serverId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotState $;

        public Builder() {
            $ = new SnapshotState();
        }

        public Builder(SnapshotState defaults) {
            $ = new SnapshotState(Objects.requireNonNull(defaults));
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
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels (key-value pairs) should be created with.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param serverId Server to the snapshot should be created from.
         * 
         * @return builder
         * 
         */
        public Builder serverId(@Nullable Output<Integer> serverId) {
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

        public SnapshotState build() {
            return $;
        }
    }

}
