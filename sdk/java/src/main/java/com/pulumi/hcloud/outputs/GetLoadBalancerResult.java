// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.hcloud.outputs.GetLoadBalancerAlgorithm;
import com.pulumi.hcloud.outputs.GetLoadBalancerService;
import com.pulumi.hcloud.outputs.GetLoadBalancerTarget;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLoadBalancerResult {
    /**
     * @return (Optional) Configuration of the algorithm the Load Balancer use.
     * 
     */
    private List<GetLoadBalancerAlgorithm> algorithms;
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    private Boolean deleteProtection;
    /**
     * @return (int) Unique ID of the Load Balancer.
     * 
     */
    private Integer id;
    /**
     * @return (string) IPv4 Address of the Load Balancer.
     * 
     */
    private String ipv4;
    /**
     * @return (string) IPv4 Address of the Load Balancer.
     * 
     */
    private String ipv6;
    /**
     * @return (map) User-defined labels (key-value pairs) .
     * 
     */
    private Map<String,Object> labels;
    /**
     * @return (string) Name of the Type of the Load Balancer.
     * 
     */
    private String loadBalancerType;
    /**
     * @return (string) Name of the location the Load Balancer is in.
     * 
     */
    private String location;
    /**
     * @return (string) Name of the Load Balancer.
     * 
     */
    private @Nullable String name;
    /**
     * @return (int) ID of the first private network that this Load Balancer is connected to.
     * 
     */
    private Integer networkId;
    /**
     * @return (string) IP of the Load Balancer in the first private network that it is connected to.
     * 
     */
    private String networkIp;
    private String networkZone;
    /**
     * @return (list) List of services a Load Balancer provides.
     * 
     */
    private List<GetLoadBalancerService> services;
    /**
     * @return (list) List of targets of the Load Balancer.
     * 
     */
    private List<GetLoadBalancerTarget> targets;
    private @Nullable String withSelector;

    private GetLoadBalancerResult() {}
    /**
     * @return (Optional) Configuration of the algorithm the Load Balancer use.
     * 
     */
    public List<GetLoadBalancerAlgorithm> algorithms() {
        return this.algorithms;
    }
    /**
     * @return (bool) Whether delete protection is enabled.
     * 
     */
    public Boolean deleteProtection() {
        return this.deleteProtection;
    }
    /**
     * @return (int) Unique ID of the Load Balancer.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return (string) IPv4 Address of the Load Balancer.
     * 
     */
    public String ipv4() {
        return this.ipv4;
    }
    /**
     * @return (string) IPv4 Address of the Load Balancer.
     * 
     */
    public String ipv6() {
        return this.ipv6;
    }
    /**
     * @return (map) User-defined labels (key-value pairs) .
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    /**
     * @return (string) Name of the Type of the Load Balancer.
     * 
     */
    public String loadBalancerType() {
        return this.loadBalancerType;
    }
    /**
     * @return (string) Name of the location the Load Balancer is in.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return (string) Name of the Load Balancer.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return (int) ID of the first private network that this Load Balancer is connected to.
     * 
     */
    public Integer networkId() {
        return this.networkId;
    }
    /**
     * @return (string) IP of the Load Balancer in the first private network that it is connected to.
     * 
     */
    public String networkIp() {
        return this.networkIp;
    }
    public String networkZone() {
        return this.networkZone;
    }
    /**
     * @return (list) List of services a Load Balancer provides.
     * 
     */
    public List<GetLoadBalancerService> services() {
        return this.services;
    }
    /**
     * @return (list) List of targets of the Load Balancer.
     * 
     */
    public List<GetLoadBalancerTarget> targets() {
        return this.targets;
    }
    public Optional<String> withSelector() {
        return Optional.ofNullable(this.withSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetLoadBalancerAlgorithm> algorithms;
        private Boolean deleteProtection;
        private Integer id;
        private String ipv4;
        private String ipv6;
        private Map<String,Object> labels;
        private String loadBalancerType;
        private String location;
        private @Nullable String name;
        private Integer networkId;
        private String networkIp;
        private String networkZone;
        private List<GetLoadBalancerService> services;
        private List<GetLoadBalancerTarget> targets;
        private @Nullable String withSelector;
        public Builder() {}
        public Builder(GetLoadBalancerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithms = defaults.algorithms;
    	      this.deleteProtection = defaults.deleteProtection;
    	      this.id = defaults.id;
    	      this.ipv4 = defaults.ipv4;
    	      this.ipv6 = defaults.ipv6;
    	      this.labels = defaults.labels;
    	      this.loadBalancerType = defaults.loadBalancerType;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkId = defaults.networkId;
    	      this.networkIp = defaults.networkIp;
    	      this.networkZone = defaults.networkZone;
    	      this.services = defaults.services;
    	      this.targets = defaults.targets;
    	      this.withSelector = defaults.withSelector;
        }

        @CustomType.Setter
        public Builder algorithms(List<GetLoadBalancerAlgorithm> algorithms) {
            this.algorithms = Objects.requireNonNull(algorithms);
            return this;
        }
        public Builder algorithms(GetLoadBalancerAlgorithm... algorithms) {
            return algorithms(List.of(algorithms));
        }
        @CustomType.Setter
        public Builder deleteProtection(Boolean deleteProtection) {
            this.deleteProtection = Objects.requireNonNull(deleteProtection);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4(String ipv4) {
            this.ipv4 = Objects.requireNonNull(ipv4);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(String ipv6) {
            this.ipv6 = Objects.requireNonNull(ipv6);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerType(String loadBalancerType) {
            this.loadBalancerType = Objects.requireNonNull(loadBalancerType);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(Integer networkId) {
            this.networkId = Objects.requireNonNull(networkId);
            return this;
        }
        @CustomType.Setter
        public Builder networkIp(String networkIp) {
            this.networkIp = Objects.requireNonNull(networkIp);
            return this;
        }
        @CustomType.Setter
        public Builder networkZone(String networkZone) {
            this.networkZone = Objects.requireNonNull(networkZone);
            return this;
        }
        @CustomType.Setter
        public Builder services(List<GetLoadBalancerService> services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }
        public Builder services(GetLoadBalancerService... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder targets(List<GetLoadBalancerTarget> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public Builder targets(GetLoadBalancerTarget... targets) {
            return targets(List.of(targets));
        }
        @CustomType.Setter
        public Builder withSelector(@Nullable String withSelector) {
            this.withSelector = withSelector;
            return this;
        }
        public GetLoadBalancerResult build() {
            final var o = new GetLoadBalancerResult();
            o.algorithms = algorithms;
            o.deleteProtection = deleteProtection;
            o.id = id;
            o.ipv4 = ipv4;
            o.ipv6 = ipv6;
            o.labels = labels;
            o.loadBalancerType = loadBalancerType;
            o.location = location;
            o.name = name;
            o.networkId = networkId;
            o.networkIp = networkIp;
            o.networkZone = networkZone;
            o.services = services;
            o.targets = targets;
            o.withSelector = withSelector;
            return o;
        }
    }
}
