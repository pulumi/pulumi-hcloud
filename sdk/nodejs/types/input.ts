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
    labelSelector?: pulumi.Input<string>;
    /**
     * ID of the server you want to apply the firewall to (only one of `server`
     * and `labelSelector`can be applied in one block)
     */
    server?: pulumi.Input<number>;
}

export interface FirewallRule {
    /**
     * Description of the firewall rule
     */
    description?: pulumi.Input<string>;
    /**
     * List of IPs or CIDRs that are allowed within this Firewall Rule (when `direction`
     * is `out`)
     */
    destinationIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Direction of the Firewall Rule. `in`
     */
    direction: pulumi.Input<string>;
    /**
     * Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`. You can use `any`
     * to allow all ports for the specific protocol. Port ranges are also possible: `80-85` allows all ports between 80 and 85.
     */
    port?: pulumi.Input<string>;
    /**
     * Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
     */
    protocol: pulumi.Input<string>;
    /**
     * List of IPs or CIDRs that are allowed within this Firewall Rule (when `direction`
     * is `in`)
     */
    sourceIps?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface GetFirewallApplyTo {
    /**
     * (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
     * referenced
     */
    labelSelector?: string;
    /**
     * (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
     */
    server?: number;
}

export interface GetFirewallApplyToArgs {
    /**
     * (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
     * referenced
     */
    labelSelector?: pulumi.Input<string>;
    /**
     * (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
     */
    server?: pulumi.Input<number>;
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

export interface GetFirewallRuleArgs {
    /**
     * (Optional, string) Description of the firewall rule
     */
    description?: pulumi.Input<string>;
    /**
     * (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `out`)
     */
    destinationIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (Required, string) Direction of the Firewall Rule. `in`, `out`
     */
    direction: pulumi.Input<string>;
    /**
     * (Required, string) Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`
     */
    port?: pulumi.Input<string>;
    /**
     * (Required, string) Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
     */
    protocol?: pulumi.Input<string>;
    /**
     * (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `in`)
     */
    sourceIps?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface LoadBalancerAlgorithm {
    /**
     * Type of the Load Balancer Algorithm. `roundRobin` or `leastConnections`
     */
    type?: pulumi.Input<string>;
}

export interface LoadBalancerServiceHealthCheck {
    /**
     * HTTP configuration. Required if `protocol` is `http`.
     */
    http?: pulumi.Input<inputs.LoadBalancerServiceHealthCheckHttp>;
    /**
     * Interval how often the health check will be performed, in seconds.
     */
    interval: pulumi.Input<number>;
    /**
     * Port the health check tries to connect to, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
     */
    port: pulumi.Input<number>;
    /**
     * Protocol the health check uses. `http` or `tcp`
     */
    protocol: pulumi.Input<string>;
    /**
     * Number of tries a health check will be performed until a target will be listed as `unhealthy`.
     */
    retries?: pulumi.Input<number>;
    /**
     * Timeout when a health check try will be canceled if there is no response, in seconds.
     */
    timeout: pulumi.Input<number>;
}

export interface LoadBalancerServiceHealthCheckHttp {
    /**
     * Domain we try to access when performing the Health Check.
     */
    domain?: pulumi.Input<string>;
    /**
     * Path we try to access when performing the Health Check.
     */
    path?: pulumi.Input<string>;
    /**
     * Response we expect to be included in the Target response when a Health Check was performed.
     */
    response?: pulumi.Input<string>;
    /**
     * We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
     */
    statusCodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Enable TLS certificate checking.
     */
    tls?: pulumi.Input<boolean>;
}

export interface LoadBalancerServiceHttp {
    /**
     * List of IDs from certificates which the Load Balancer has.
     */
    certificates?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * Lifetime of the cookie for sticky session (in seconds). Default: `300`
     */
    cookieLifetime?: pulumi.Input<number>;
    /**
     * Name of the cookie for sticky session. Default: `HCLBSTICKY`
     */
    cookieName?: pulumi.Input<string>;
    /**
     * Redirect HTTP to HTTPS traffic. Only supported for services with `protocol` `https` using the default HTTP port `80`.
     */
    redirectHttp?: pulumi.Input<boolean>;
    /**
     * Enable sticky sessions
     */
    stickySessions?: pulumi.Input<boolean>;
}

export interface LoadBalancerTarget {
    serverId?: pulumi.Input<number>;
    /**
     * Type of the Load Balancer Algorithm. `roundRobin` or `leastConnections`
     */
    type: pulumi.Input<string>;
    /**
     * @deprecated Does not work. Use the hcloud.LoadBalancerTarget resource instead.
     */
    usePrivateIp?: pulumi.Input<boolean>;
}

export interface ServerNetwork {
    aliasIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specify the IP the server should get in the network
     */
    ip?: pulumi.Input<string>;
    /**
     * (Optional, string) The MAC address the private interface of the server has
     */
    macAddress?: pulumi.Input<string>;
    /**
     * ID of the network
     */
    networkId: pulumi.Input<number>;
}

export interface ServerPublicNet {
    ipv4?: pulumi.Input<number>;
    ipv4Enabled?: pulumi.Input<boolean>;
    ipv6?: pulumi.Input<number>;
    ipv6Enabled?: pulumi.Input<boolean>;
}
