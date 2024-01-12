# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'FirewallApplyToArgs',
    'FirewallRuleArgs',
    'LoadBalancerAlgorithmArgs',
    'LoadBalancerServiceHealthCheckArgs',
    'LoadBalancerServiceHealthCheckHttpArgs',
    'LoadBalancerServiceHttpArgs',
    'LoadBalancerTargetArgs',
    'ServerNetworkArgs',
    'ServerPublicNetArgs',
    'GetFirewallApplyToArgs',
    'GetFirewallRuleArgs',
]

@pulumi.input_type
class FirewallApplyToArgs:
    def __init__(__self__, *,
                 label_selector: Optional[pulumi.Input[str]] = None,
                 server: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[str] label_selector: Label Selector to select servers the firewall should be applied to (only one
               of `server` and `label_selector`can be applied in one block)
        :param pulumi.Input[int] server: ID of the server you want to apply the firewall to (only one of `server`
               and `label_selector`can be applied in one block)
        """
        if label_selector is not None:
            pulumi.set(__self__, "label_selector", label_selector)
        if server is not None:
            pulumi.set(__self__, "server", server)

    @property
    @pulumi.getter(name="labelSelector")
    def label_selector(self) -> Optional[pulumi.Input[str]]:
        """
        Label Selector to select servers the firewall should be applied to (only one
        of `server` and `label_selector`can be applied in one block)
        """
        return pulumi.get(self, "label_selector")

    @label_selector.setter
    def label_selector(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label_selector", value)

    @property
    @pulumi.getter
    def server(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the server you want to apply the firewall to (only one of `server`
        and `label_selector`can be applied in one block)
        """
        return pulumi.get(self, "server")

    @server.setter
    def server(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "server", value)


@pulumi.input_type
class FirewallRuleArgs:
    def __init__(__self__, *,
                 direction: pulumi.Input[str],
                 protocol: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 destination_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 port: Optional[pulumi.Input[str]] = None,
                 source_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[str] direction: Direction of the Firewall Rule. `in`
        :param pulumi.Input[str] protocol: Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
        :param pulumi.Input[str] description: Description of the firewall rule
        :param pulumi.Input[Sequence[pulumi.Input[str]]] destination_ips: (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction`
               is `out`)
        :param pulumi.Input[str] port: Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`. You can use `any`
               to allow all ports for the specific protocol. Port ranges are also possible: `80-85` allows all ports between 80 and
               85.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] source_ips: List of CIDRs that are allowed within this Firewall Rule
        """
        pulumi.set(__self__, "direction", direction)
        pulumi.set(__self__, "protocol", protocol)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if destination_ips is not None:
            pulumi.set(__self__, "destination_ips", destination_ips)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if source_ips is not None:
            pulumi.set(__self__, "source_ips", source_ips)

    @property
    @pulumi.getter
    def direction(self) -> pulumi.Input[str]:
        """
        Direction of the Firewall Rule. `in`
        """
        return pulumi.get(self, "direction")

    @direction.setter
    def direction(self, value: pulumi.Input[str]):
        pulumi.set(self, "direction", value)

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Input[str]:
        """
        Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the firewall rule
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="destinationIps")
    def destination_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction`
        is `out`)
        """
        return pulumi.get(self, "destination_ips")

    @destination_ips.setter
    def destination_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "destination_ips", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[str]]:
        """
        Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`. You can use `any`
        to allow all ports for the specific protocol. Port ranges are also possible: `80-85` allows all ports between 80 and
        85.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter(name="sourceIps")
    def source_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of CIDRs that are allowed within this Firewall Rule
        """
        return pulumi.get(self, "source_ips")

    @source_ips.setter
    def source_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "source_ips", value)


@pulumi.input_type
class LoadBalancerAlgorithmArgs:
    def __init__(__self__, *,
                 type: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] type: Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
        """
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class LoadBalancerServiceHealthCheckArgs:
    def __init__(__self__, *,
                 interval: pulumi.Input[int],
                 port: pulumi.Input[int],
                 protocol: pulumi.Input[str],
                 timeout: pulumi.Input[int],
                 http: Optional[pulumi.Input['LoadBalancerServiceHealthCheckHttpArgs']] = None,
                 retries: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] interval: Interval how often the health check will be performed, in seconds.
        :param pulumi.Input[int] port: Port the health check tries to connect to, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        :param pulumi.Input[str] protocol: Protocol the health check uses. `http` or `tcp`
        :param pulumi.Input[int] timeout: Timeout when a health check try will be canceled if there is no response, in seconds.
        :param pulumi.Input['LoadBalancerServiceHealthCheckHttpArgs'] http: HTTP configuration. Required if `protocol` is `http`.
        :param pulumi.Input[int] retries: Number of tries a health check will be performed until a target will be listed as `unhealthy`.
        """
        pulumi.set(__self__, "interval", interval)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "protocol", protocol)
        pulumi.set(__self__, "timeout", timeout)
        if http is not None:
            pulumi.set(__self__, "http", http)
        if retries is not None:
            pulumi.set(__self__, "retries", retries)

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Input[int]:
        """
        Interval how often the health check will be performed, in seconds.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: pulumi.Input[int]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter
    def port(self) -> pulumi.Input[int]:
        """
        Port the health check tries to connect to, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[int]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Input[str]:
        """
        Protocol the health check uses. `http` or `tcp`
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Input[int]:
        """
        Timeout when a health check try will be canceled if there is no response, in seconds.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: pulumi.Input[int]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter
    def http(self) -> Optional[pulumi.Input['LoadBalancerServiceHealthCheckHttpArgs']]:
        """
        HTTP configuration. Required if `protocol` is `http`.
        """
        return pulumi.get(self, "http")

    @http.setter
    def http(self, value: Optional[pulumi.Input['LoadBalancerServiceHealthCheckHttpArgs']]):
        pulumi.set(self, "http", value)

    @property
    @pulumi.getter
    def retries(self) -> Optional[pulumi.Input[int]]:
        """
        Number of tries a health check will be performed until a target will be listed as `unhealthy`.
        """
        return pulumi.get(self, "retries")

    @retries.setter
    def retries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retries", value)


@pulumi.input_type
class LoadBalancerServiceHealthCheckHttpArgs:
    def __init__(__self__, *,
                 domain: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 response: Optional[pulumi.Input[str]] = None,
                 status_codes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tls: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] domain: Domain we try to access when performing the Health Check.
        :param pulumi.Input[str] path: Path we try to access when performing the Health Check.
        :param pulumi.Input[str] response: Response we expect to be included in the Target response when a Health Check was performed.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] status_codes: We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
        :param pulumi.Input[bool] tls: Enable TLS certificate checking.
        """
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if response is not None:
            pulumi.set(__self__, "response", response)
        if status_codes is not None:
            pulumi.set(__self__, "status_codes", status_codes)
        if tls is not None:
            pulumi.set(__self__, "tls", tls)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        Domain we try to access when performing the Health Check.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        Path we try to access when performing the Health Check.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def response(self) -> Optional[pulumi.Input[str]]:
        """
        Response we expect to be included in the Target response when a Health Check was performed.
        """
        return pulumi.get(self, "response")

    @response.setter
    def response(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "response", value)

    @property
    @pulumi.getter(name="statusCodes")
    def status_codes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
        """
        return pulumi.get(self, "status_codes")

    @status_codes.setter
    def status_codes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "status_codes", value)

    @property
    @pulumi.getter
    def tls(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable TLS certificate checking.
        """
        return pulumi.get(self, "tls")

    @tls.setter
    def tls(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "tls", value)


@pulumi.input_type
class LoadBalancerServiceHttpArgs:
    def __init__(__self__, *,
                 certificates: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 cookie_lifetime: Optional[pulumi.Input[int]] = None,
                 cookie_name: Optional[pulumi.Input[str]] = None,
                 redirect_http: Optional[pulumi.Input[bool]] = None,
                 sticky_sessions: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[int]]] certificates: List of IDs from certificates which the Load Balancer has.
        :param pulumi.Input[int] cookie_lifetime: Lifetime of the cookie for sticky session (in seconds). Default: `300`
        :param pulumi.Input[str] cookie_name: Name of the cookie for sticky session. Default: `HCLBSTICKY`
        :param pulumi.Input[bool] redirect_http: Redirect HTTP to HTTPS traffic. Only supported for services with `protocol` `https` using the default HTTP port `80`.
        :param pulumi.Input[bool] sticky_sessions: Enable sticky sessions
        """
        if certificates is not None:
            pulumi.set(__self__, "certificates", certificates)
        if cookie_lifetime is not None:
            pulumi.set(__self__, "cookie_lifetime", cookie_lifetime)
        if cookie_name is not None:
            pulumi.set(__self__, "cookie_name", cookie_name)
        if redirect_http is not None:
            pulumi.set(__self__, "redirect_http", redirect_http)
        if sticky_sessions is not None:
            pulumi.set(__self__, "sticky_sessions", sticky_sessions)

    @property
    @pulumi.getter
    def certificates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        List of IDs from certificates which the Load Balancer has.
        """
        return pulumi.get(self, "certificates")

    @certificates.setter
    def certificates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "certificates", value)

    @property
    @pulumi.getter(name="cookieLifetime")
    def cookie_lifetime(self) -> Optional[pulumi.Input[int]]:
        """
        Lifetime of the cookie for sticky session (in seconds). Default: `300`
        """
        return pulumi.get(self, "cookie_lifetime")

    @cookie_lifetime.setter
    def cookie_lifetime(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cookie_lifetime", value)

    @property
    @pulumi.getter(name="cookieName")
    def cookie_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the cookie for sticky session. Default: `HCLBSTICKY`
        """
        return pulumi.get(self, "cookie_name")

    @cookie_name.setter
    def cookie_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cookie_name", value)

    @property
    @pulumi.getter(name="redirectHttp")
    def redirect_http(self) -> Optional[pulumi.Input[bool]]:
        """
        Redirect HTTP to HTTPS traffic. Only supported for services with `protocol` `https` using the default HTTP port `80`.
        """
        return pulumi.get(self, "redirect_http")

    @redirect_http.setter
    def redirect_http(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "redirect_http", value)

    @property
    @pulumi.getter(name="stickySessions")
    def sticky_sessions(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable sticky sessions
        """
        return pulumi.get(self, "sticky_sessions")

    @sticky_sessions.setter
    def sticky_sessions(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "sticky_sessions", value)


@pulumi.input_type
class LoadBalancerTargetArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[str],
                 server_id: Optional[pulumi.Input[int]] = None,
                 use_private_ip: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] type: Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
        """
        pulumi.set(__self__, "type", type)
        if server_id is not None:
            pulumi.set(__self__, "server_id", server_id)
        if use_private_ip is not None:
            warnings.warn("""Does not work. Use the hcloud_load_balancer_target resource instead.""", DeprecationWarning)
            pulumi.log.warn("""use_private_ip is deprecated: Does not work. Use the hcloud_load_balancer_target resource instead.""")
        if use_private_ip is not None:
            pulumi.set(__self__, "use_private_ip", use_private_ip)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter(name="usePrivateIp")
    def use_private_ip(self) -> Optional[pulumi.Input[bool]]:
        warnings.warn("""Does not work. Use the hcloud_load_balancer_target resource instead.""", DeprecationWarning)
        pulumi.log.warn("""use_private_ip is deprecated: Does not work. Use the hcloud_load_balancer_target resource instead.""")

        return pulumi.get(self, "use_private_ip")

    @use_private_ip.setter
    def use_private_ip(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_private_ip", value)


@pulumi.input_type
class ServerNetworkArgs:
    def __init__(__self__, *,
                 network_id: pulumi.Input[int],
                 alias_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 mac_address: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[int] network_id: ID of the network
        :param pulumi.Input[str] ip: Specify the IP the server should get in the network
        :param pulumi.Input[str] mac_address: (Optional, string) The MAC address the private interface of the server has
        """
        pulumi.set(__self__, "network_id", network_id)
        if alias_ips is not None:
            pulumi.set(__self__, "alias_ips", alias_ips)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)
        if mac_address is not None:
            pulumi.set(__self__, "mac_address", mac_address)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Input[int]:
        """
        ID of the network
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter(name="aliasIps")
    def alias_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "alias_ips")

    @alias_ips.setter
    def alias_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "alias_ips", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the IP the server should get in the network
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="macAddress")
    def mac_address(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional, string) The MAC address the private interface of the server has
        """
        return pulumi.get(self, "mac_address")

    @mac_address.setter
    def mac_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mac_address", value)


@pulumi.input_type
class ServerPublicNetArgs:
    def __init__(__self__, *,
                 ipv4: Optional[pulumi.Input[int]] = None,
                 ipv4_enabled: Optional[pulumi.Input[bool]] = None,
                 ipv6: Optional[pulumi.Input[int]] = None,
                 ipv6_enabled: Optional[pulumi.Input[bool]] = None):
        if ipv4 is not None:
            pulumi.set(__self__, "ipv4", ipv4)
        if ipv4_enabled is not None:
            pulumi.set(__self__, "ipv4_enabled", ipv4_enabled)
        if ipv6 is not None:
            pulumi.set(__self__, "ipv6", ipv6)
        if ipv6_enabled is not None:
            pulumi.set(__self__, "ipv6_enabled", ipv6_enabled)

    @property
    @pulumi.getter
    def ipv4(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "ipv4")

    @ipv4.setter
    def ipv4(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ipv4", value)

    @property
    @pulumi.getter(name="ipv4Enabled")
    def ipv4_enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "ipv4_enabled")

    @ipv4_enabled.setter
    def ipv4_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ipv4_enabled", value)

    @property
    @pulumi.getter
    def ipv6(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "ipv6")

    @ipv6.setter
    def ipv6(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ipv6", value)

    @property
    @pulumi.getter(name="ipv6Enabled")
    def ipv6_enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "ipv6_enabled")

    @ipv6_enabled.setter
    def ipv6_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ipv6_enabled", value)


@pulumi.input_type
class GetFirewallApplyToArgs:
    def __init__(__self__, *,
                 label_selector: str,
                 server: int):
        """
        :param str label_selector: (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
               referenced
        :param int server: (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
        """
        pulumi.set(__self__, "label_selector", label_selector)
        pulumi.set(__self__, "server", server)

    @property
    @pulumi.getter(name="labelSelector")
    def label_selector(self) -> str:
        """
        (string) Label Selector to select servers the firewall is applied to. Empty if a server is directly
        referenced
        """
        return pulumi.get(self, "label_selector")

    @label_selector.setter
    def label_selector(self, value: str):
        pulumi.set(self, "label_selector", value)

    @property
    @pulumi.getter
    def server(self) -> int:
        """
        (int) ID of a server where the firewall is applied to. `0` if applied to a label_selector
        """
        return pulumi.get(self, "server")

    @server.setter
    def server(self, value: int):
        pulumi.set(self, "server", value)


@pulumi.input_type
class GetFirewallRuleArgs:
    def __init__(__self__, *,
                 direction: str,
                 description: Optional[str] = None,
                 destination_ips: Optional[Sequence[str]] = None,
                 port: Optional[str] = None,
                 protocol: Optional[str] = None,
                 source_ips: Optional[Sequence[str]] = None):
        """
        :param str direction: (Required, string) Direction of the Firewall Rule. `in`, `out`
        :param str description: (Optional, string) Description of the firewall rule
        :param Sequence[str] destination_ips: (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `out`)
        :param str port: (Required, string) Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`
        :param str protocol: (Required, string) Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
        :param Sequence[str] source_ips: (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `in`)
        """
        pulumi.set(__self__, "direction", direction)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if destination_ips is not None:
            pulumi.set(__self__, "destination_ips", destination_ips)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if protocol is not None:
            pulumi.set(__self__, "protocol", protocol)
        if source_ips is not None:
            pulumi.set(__self__, "source_ips", source_ips)

    @property
    @pulumi.getter
    def direction(self) -> str:
        """
        (Required, string) Direction of the Firewall Rule. `in`, `out`
        """
        return pulumi.get(self, "direction")

    @direction.setter
    def direction(self, value: str):
        pulumi.set(self, "direction", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        (Optional, string) Description of the firewall rule
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="destinationIps")
    def destination_ips(self) -> Optional[Sequence[str]]:
        """
        (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `out`)
        """
        return pulumi.get(self, "destination_ips")

    @destination_ips.setter
    def destination_ips(self, value: Optional[Sequence[str]]):
        pulumi.set(self, "destination_ips", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[str]:
        """
        (Required, string) Port of the Firewall Rule. Required when `protocol` is `tcp` or `udp`
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[str]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[str]:
        """
        (Required, string) Protocol of the Firewall Rule. `tcp`, `icmp`, `udp`, `gre`, `esp`
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[str]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="sourceIps")
    def source_ips(self) -> Optional[Sequence[str]]:
        """
        (Required, List) List of CIDRs that are allowed within this Firewall Rule (when `direction` is `in`)
        """
        return pulumi.get(self, "source_ips")

    @source_ips.setter
    def source_ips(self, value: Optional[Sequence[str]]):
        pulumi.set(self, "source_ips", value)


