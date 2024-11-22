// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface FirewallApplyTo {
    /**
     * Label Selector to select servers the firewall should be applied to (only one
     * of `server` and `labelSelector`can be applied in one block)
     */
    labelSelector: string;
    /**
     * ID of the server you want to apply the firewall to (only one of `server`
     * and `labelSelector`can be applied in one block)
     */
    server: number;
}

export interface FirewallRule {
    /**
     * Description of the firewall rule
     */
    description?: string;
    /**
     * List of IPs or CIDRs that are allowed within this Firewall Rule (when `direction`
     * is `out`)
     */
    destinationIps?: string[];
    /**
     * Direction of the Firewall Rule. `in`
     */
    direction: string;
    /**
     * Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`. You can use `any`
     * to allow all ports for the specific protocol. Port ranges are also possible: `80-85` allows all ports between 80 and 85.
     */
    port?: string;
    /**
     * Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
     */
    protocol: string;
    /**
     * List of IPs or CIDRs that are allowed within this Firewall Rule (when `direction`
     * is `in`)
     */
    sourceIps?: string[];
}

export interface GetCertificatesCertificate {
    certificate: string;
    created: string;
    domainNames: string[];
    fingerprint: string;
    id: number;
    labels: {[key: string]: string};
    name?: string;
    notValidAfter: string;
    notValidBefore: string;
    type: string;
}

export interface GetDatacentersDatacenter {
    /**
     * List of currently available Server Types in the Datacenter.
     */
    availableServerTypeIds: number[];
    /**
     * Description of the Datacenter.
     */
    description: string;
    /**
     * ID of the Datacenter.
     */
    id: number;
    /**
     * Location of the Datacenter. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
     */
    location: {[key: string]: string};
    /**
     * Name of the Datacenter.
     */
    name: string;
    /**
     * List of supported Server Types in the Datacenter.
     */
    supportedServerTypeIds: number[];
}

export interface GetFirewallApplyTo {
    /**
     * (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
     * referenced
     */
    labelSelector: string;
    /**
     * (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
     */
    server: number;
}

export interface GetFirewallRule {
    /**
     * (Optional, string) Description of the firewall rule
     */
    description?: string;
    /**
     * (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `out`)
     */
    destinationIps?: string[];
    /**
     * (Required, string) Direction of the Firewall Rule. `in`, `out`
     */
    direction: string;
    /**
     * (Required, string) Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`
     */
    port?: string;
    /**
     * (Required, string) Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
     */
    protocol?: string;
    /**
     * (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `in`)
     */
    sourceIps?: string[];
}

export interface GetFirewallsFirewall {
    applyTos?: outputs.GetFirewallsFirewallApplyTo[];
    id?: number;
    labels?: {[key: string]: string};
    name: string;
    rules?: outputs.GetFirewallsFirewallRule[];
}

export interface GetFirewallsFirewallApplyTo {
    labelSelector: string;
    server: number;
}

export interface GetFirewallsFirewallRule {
    description?: string;
    destinationIps?: string[];
    direction: string;
    port?: string;
    protocol?: string;
    sourceIps?: string[];
}

export interface GetFloatingIpsFloatingIp {
    deleteProtection: boolean;
    description: string;
    homeLocation: string;
    id: number;
    ipAddress: string;
    ipNetwork: string;
    labels: {[key: string]: string};
    name?: string;
    serverId: number;
    type: string;
}

export interface GetImagesImage {
    architecture: string;
    created: string;
    deprecated: string;
    description: string;
    id: number;
    labels: {[key: string]: string};
    name: string;
    osFlavor: string;
    osVersion: string;
    rapidDeploy: boolean;
    /**
     * @deprecated Please use the withSelector property instead.
     */
    selector?: string;
    type: string;
}

export interface GetLoadBalancerAlgorithm {
    /**
     * (string) Type of the target. `server` or `labelSelector`
     */
    type: string;
}

export interface GetLoadBalancerService {
    /**
     * (int) Port the service connects to the targets on. Can be everything between `1` and `65535`.
     */
    destinationPort: number;
    /**
     * (list) List of http configurations when `protocol` is `http` or `https`.
     */
    healthChecks: outputs.GetLoadBalancerServiceHealthCheck[];
    /**
     * (list) List of http configurations when `protocol` is `http` or `https`.
     */
    https: outputs.GetLoadBalancerServiceHttp[];
    /**
     * (int) Port the service listen on. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     */
    listenPort: number;
    /**
     * (string) Protocol the health check uses. `http`, `https` or `tcp`
     */
    protocol: string;
    /**
     * (bool) Enable proxyprotocol.
     */
    proxyprotocol: boolean;
}

export interface GetLoadBalancerServiceHealthCheck {
    /**
     * (list) List of http configurations when `protocol` is `http` or `https`.
     */
    https: outputs.GetLoadBalancerServiceHealthCheckHttp[];
    /**
     * (int) Interval how often the health check will be performed, in seconds.
     */
    interval: number;
    /**
     * (int) Port the health check tries to connect to. Can be everything between `1` and `65535`.
     */
    port: number;
    /**
     * (string) Protocol the health check uses. `http`, `https` or `tcp`
     */
    protocol: string;
    /**
     * (int) Number of tries a health check will be performed until a target will be listed as `unhealthy`.
     */
    retries: number;
    /**
     * (int) Timeout when a health check try will be canceled if there is no response, in seconds.
     */
    timeout: number;
}

export interface GetLoadBalancerServiceHealthCheckHttp {
    /**
     * string) Domain we try to access when performing the Health Check.
     */
    domain: string;
    /**
     * (string) Path we try to access when performing the Health Check.
     */
    path: string;
    /**
     * (string) Response we expect to be included in the Target response when a Health Check was performed.
     */
    response: string;
    /**
     * (list[int]) We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
     */
    statusCodes: number[];
    /**
     * (bool) Enable TLS certificate checking.
     */
    tls: boolean;
}

export interface GetLoadBalancerServiceHttp {
    /**
     * (list[int]) List of IDs from certificates which the Load Balancer has.
     */
    certificates: string[];
    /**
     * (int) Lifetime of the cookie for sticky session (in seconds).
     */
    cookieLifetime: number;
    /**
     * (string) Name of the cookie for sticky session.
     */
    cookieName: string;
    /**
     * (string) Determine if all requests from port 80 should be redirected to port 443.
     */
    redirectHttp: boolean;
    /**
     * (string) Determine if sticky sessions are enabled or not.
     */
    stickySessions: boolean;
}

export interface GetLoadBalancerTarget {
    /**
     * (string) Label Selector to add a group of resources based on the label.
     */
    labelSelector: string;
    /**
     * (int) ID of the server which should be a target for this Load Balancer.
     */
    serverId: number;
    /**
     * (string) Type of the target. `server` or `labelSelector`
     */
    type: string;
}

export interface GetLoadBalancerTypesLoadBalancerType {
    /**
     * Description of the Load Balancer Type.
     */
    description: string;
    /**
     * ID of the Load Balancer Type.
     */
    id: number;
    /**
     * Maximum number of certificates that can be assigned for the Load Balancer of this type.
     */
    maxAssignedCertificates: number;
    /**
     * Maximum number of simultaneous open connections for the Load Balancer of this type.
     */
    maxConnections: number;
    /**
     * Maximum number of services for the Load Balancer of this type.
     */
    maxServices: number;
    /**
     * Maximum number of targets for the Load Balancer of this type.
     */
    maxTargets: number;
    /**
     * Name of the Load Balancer Type.
     */
    name: string;
}

export interface GetLoadBalancersLoadBalancer {
    algorithms: outputs.GetLoadBalancersLoadBalancerAlgorithm[];
    deleteProtection: boolean;
    id: number;
    ipv4: string;
    ipv6: string;
    labels: {[key: string]: string};
    loadBalancerType: string;
    location: string;
    name?: string;
    networkId: number;
    networkIp: string;
    networkZone: string;
    services: outputs.GetLoadBalancersLoadBalancerService[];
    targets: outputs.GetLoadBalancersLoadBalancerTarget[];
}

export interface GetLoadBalancersLoadBalancerAlgorithm {
    type: string;
}

export interface GetLoadBalancersLoadBalancerService {
    destinationPort: number;
    healthChecks: outputs.GetLoadBalancersLoadBalancerServiceHealthCheck[];
    https: outputs.GetLoadBalancersLoadBalancerServiceHttp[];
    listenPort: number;
    protocol: string;
    proxyprotocol: boolean;
}

export interface GetLoadBalancersLoadBalancerServiceHealthCheck {
    https: outputs.GetLoadBalancersLoadBalancerServiceHealthCheckHttp[];
    interval: number;
    port: number;
    protocol: string;
    retries: number;
    timeout: number;
}

export interface GetLoadBalancersLoadBalancerServiceHealthCheckHttp {
    domain: string;
    path: string;
    response: string;
    statusCodes: number[];
    tls: boolean;
}

export interface GetLoadBalancersLoadBalancerServiceHttp {
    certificates: string[];
    cookieLifetime: number;
    cookieName: string;
    redirectHttp: boolean;
    stickySessions: boolean;
}

export interface GetLoadBalancersLoadBalancerTarget {
    labelSelector: string;
    serverId: number;
    type: string;
}

export interface GetLocationsLocation {
    /**
     * Name of the closest city to the Location. City name and optionally state in short form.
     */
    city: string;
    /**
     * Country the Location resides in. ISO 3166-1 alpha-2 code of the country.
     */
    country: string;
    /**
     * Description of the Location.
     */
    description: string;
    /**
     * ID of the Location.
     */
    id: number;
    /**
     * Latitude of the city closest to the Location.
     */
    latitude: number;
    /**
     * Longitude of the city closest to the Location.
     */
    longitude: number;
    /**
     * Name of the Location.
     */
    name: string;
    /**
     * Name of the Network Zone this Location resides in.
     */
    networkZone: string;
}

export interface GetNetworksNetwork {
    deleteProtection: boolean;
    /**
     * Indicates if the routes from this network should be exposed to the vSwitch connection. The exposing only takes effect if a vSwitch connection is active.
     */
    exposeRoutesToVswitch: boolean;
    id: number;
    ipRange: string;
    labels: {[key: string]: string};
    name: string;
}

export interface GetPlacementGroupsPlacementGroup {
    id: number;
    labels: {[key: string]: string};
    name: string;
    servers: number[];
    type: string;
}

export interface GetPrimaryIpsPrimaryIp {
    assigneeId: number;
    assigneeType: string;
    autoDelete: boolean;
    datacenter: string;
    deleteProtection: boolean;
    id: number;
    ipAddress: string;
    ipNetwork: string;
    labels: {[key: string]: string};
    name?: string;
    type: string;
}

export interface GetServerTypesServerType {
    /**
     * Architecture of the cpu for a Server of this type.
     */
    architecture: string;
    /**
     * Number of cpu cores for a Server of this type.
     */
    cores: number;
    /**
     * Type of cpu for a Server of this type.
     */
    cpuType: string;
    /**
     * Date of the Server Type deprecation announcement.
     */
    deprecationAnnounced: string;
    /**
     * Description of the Server Type.
     */
    description: string;
    /**
     * Disk size in GB for a Server of this type.
     */
    disk: number;
    /**
     * ID of the Server Type.
     */
    id: number;
    /**
     * @deprecated The field is deprecated and will always report 0 after 2024-08-05.
     */
    includedTraffic: number;
    /**
     * Whether the Server Type is deprecated.
     */
    isDeprecated: boolean;
    /**
     * Memory in GB for a Server of this type.
     */
    memory: number;
    /**
     * Name of the Server Type.
     */
    name: string;
    /**
     * Type of boot drive for a Server of this type.
     */
    storageType: string;
    /**
     * Date of the Server Type removal. After this date, the Server Type cannot be used anymore.
     */
    unavailableAfter: string;
}

export interface GetServersServer {
    backupWindow: string;
    backups: boolean;
    datacenter: string;
    deleteProtection: boolean;
    firewallIds: number[];
    id: number;
    image: string;
    ipv4Address: string;
    ipv6Address: string;
    ipv6Network: string;
    iso: string;
    labels: {[key: string]: string};
    location: string;
    name: string;
    placementGroupId?: number;
    primaryDiskSize: number;
    rebuildProtection: boolean;
    rescue: string;
    serverType: string;
    status: string;
}

export interface GetSshKeysSshKey {
    /**
     * Fingerprint of the SSH Key.
     */
    fingerprint: string;
    /**
     * ID of the SSH Key.
     */
    id: number;
    /**
     * User-defined [labels](https://docs.hetzner.cloud/#labels) (key-value pairs) for the resource.
     */
    labels: {[key: string]: string};
    /**
     * Name of the SSH Key.
     */
    name: string;
    /**
     * Public key of the SSH Key pair.
     */
    publicKey: string;
}

export interface GetVolumesVolume {
    deleteProtection: boolean;
    id: number;
    labels: {[key: string]: string};
    linuxDevice: string;
    location?: string;
    name: string;
    serverId?: number;
    size: number;
}

export interface LoadBalancerAlgorithm {
    /**
     * Type of the Load Balancer Algorithm. `roundRobin` or `leastConnections`
     */
    type: string;
}

export interface LoadBalancerServiceHealthCheck {
    /**
     * HTTP configuration. Required if `protocol` is `http`.
     */
    http: outputs.LoadBalancerServiceHealthCheckHttp;
    /**
     * Interval how often the health check will be performed, in seconds.
     */
    interval: number;
    /**
     * Port the health check tries to connect to, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     */
    port: number;
    /**
     * Protocol the health check uses. `http` or `tcp`
     */
    protocol: string;
    /**
     * Number of tries a health check will be performed until a target will be listed as `unhealthy`.
     */
    retries: number;
    /**
     * Timeout when a health check try will be canceled if there is no response, in seconds.
     */
    timeout: number;
}

export interface LoadBalancerServiceHealthCheckHttp {
    /**
     * Domain we try to access when performing the Health Check.
     */
    domain?: string;
    /**
     * Path we try to access when performing the Health Check.
     */
    path?: string;
    /**
     * Response we expect to be included in the Target response when a Health Check was performed.
     */
    response?: string;
    /**
     * We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
     */
    statusCodes?: string[];
    /**
     * Enable TLS certificate checking.
     */
    tls?: boolean;
}

export interface LoadBalancerServiceHttp {
    /**
     * List of IDs from certificates which the Load Balancer has.
     */
    certificates: number[];
    /**
     * Lifetime of the cookie for sticky session (in seconds). Default: `300`
     */
    cookieLifetime: number;
    /**
     * Name of the cookie for sticky session. Default: `HCLBSTICKY`
     */
    cookieName: string;
    /**
     * Redirect HTTP to HTTPS traffic. Only supported for services with `protocol` `https` using the default HTTP port `80`.
     */
    redirectHttp: boolean;
    /**
     * Enable sticky sessions
     */
    stickySessions: boolean;
}

export interface LoadBalancerTarget {
    serverId?: number;
    /**
     * (string) Type of the Load Balancer Algorithm. `roundRobin` or `leastConnections`
     */
    type: string;
    /**
     * @deprecated Does not work. Use the hcloud.LoadBalancerTarget resource instead.
     */
    usePrivateIp?: boolean;
}

export interface ServerNetwork {
    aliasIps: string[];
    /**
     * Specify the IP the server should get in the network
     */
    ip: string;
    /**
     * (Optional, string) The MAC address the private interface of the server has
     */
    macAddress: string;
    /**
     * ID of the network
     */
    networkId: number;
}

export interface ServerPublicNet {
    ipv4: number;
    ipv4Enabled?: boolean;
    ipv6: number;
    ipv6Enabled?: boolean;
}

