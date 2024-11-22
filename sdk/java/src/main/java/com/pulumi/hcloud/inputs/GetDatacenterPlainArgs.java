// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatacenterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatacenterPlainArgs Empty = new GetDatacenterPlainArgs();

    /**
     * ID of the Datacenter.
     * 
     */
    @Import(name="id")
    private @Nullable Integer id;

    /**
     * @return ID of the Datacenter.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the Datacenter.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the Datacenter.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetDatacenterPlainArgs() {}

    private GetDatacenterPlainArgs(GetDatacenterPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatacenterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatacenterPlainArgs $;

        public Builder() {
            $ = new GetDatacenterPlainArgs();
        }

        public Builder(GetDatacenterPlainArgs defaults) {
            $ = new GetDatacenterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the Datacenter.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param name Name of the Datacenter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetDatacenterPlainArgs build() {
            return $;
        }
    }

}
