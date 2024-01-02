// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerNetwork {
    /**
     * @return Alias IPs the server should have in the Network.
     * 
     */
    private @Nullable List<String> aliasIps;
    /**
     * @return Specify the IP the server should get in the network
     * 
     */
    private @Nullable String ip;
    /**
     * @return (Optional, string) The MAC address the private interface of the server has
     * 
     */
    private @Nullable String macAddress;
    /**
     * @return ID of the network
     * 
     */
    private Integer networkId;

    private ServerNetwork() {}
    /**
     * @return Alias IPs the server should have in the Network.
     * 
     */
    public List<String> aliasIps() {
        return this.aliasIps == null ? List.of() : this.aliasIps;
    }
    /**
     * @return Specify the IP the server should get in the network
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * @return (Optional, string) The MAC address the private interface of the server has
     * 
     */
    public Optional<String> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }
    /**
     * @return ID of the network
     * 
     */
    public Integer networkId() {
        return this.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> aliasIps;
        private @Nullable String ip;
        private @Nullable String macAddress;
        private Integer networkId;
        public Builder() {}
        public Builder(ServerNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasIps = defaults.aliasIps;
    	      this.ip = defaults.ip;
    	      this.macAddress = defaults.macAddress;
    	      this.networkId = defaults.networkId;
        }

        @CustomType.Setter
        public Builder aliasIps(@Nullable List<String> aliasIps) {

            this.aliasIps = aliasIps;
            return this;
        }
        public Builder aliasIps(String... aliasIps) {
            return aliasIps(List.of(aliasIps));
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {

            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder macAddress(@Nullable String macAddress) {

            this.macAddress = macAddress;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(Integer networkId) {
            if (networkId == null) {
              throw new MissingRequiredPropertyException("ServerNetwork", "networkId");
            }
            this.networkId = networkId;
            return this;
        }
        public ServerNetwork build() {
            final var _resultValue = new ServerNetwork();
            _resultValue.aliasIps = aliasIps;
            _resultValue.ip = ip;
            _resultValue.macAddress = macAddress;
            _resultValue.networkId = networkId;
            return _resultValue;
        }
    }
}
