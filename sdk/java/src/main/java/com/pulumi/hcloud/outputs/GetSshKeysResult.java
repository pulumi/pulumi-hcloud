// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.hcloud.outputs.GetSshKeysSshKey;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSshKeysResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (list) List of all matches SSH keys. See `data.hcloud_ssh_key` for schema.
     * 
     */
    private List<GetSshKeysSshKey> sshKeys;
    private @Nullable String withSelector;

    private GetSshKeysResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (list) List of all matches SSH keys. See `data.hcloud_ssh_key` for schema.
     * 
     */
    public List<GetSshKeysSshKey> sshKeys() {
        return this.sshKeys;
    }
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSshKeysResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetSshKeysSshKey> sshKeys;
        private @Nullable String withSelector;
        public Builder() {}
        public Builder(GetSshKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.sshKeys = defaults.sshKeys;
    	      this.withSelector = defaults.withSelector;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder sshKeys(List<GetSshKeysSshKey> sshKeys) {
            this.sshKeys = Objects.requireNonNull(sshKeys);
            return this;
        }
        public Builder sshKeys(GetSshKeysSshKey... sshKeys) {
            return sshKeys(List.of(sshKeys));
        }
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {
            this.withSelector = withSelector;
            return this;
        }
        public GetSshKeysResult build() {
            final var _resultValue = new GetSshKeysResult();
            _resultValue.id = id;
            _resultValue.sshKeys = sshKeys;
            _resultValue.withSelector = withSelector;
            return _resultValue;
        }
    }
}
