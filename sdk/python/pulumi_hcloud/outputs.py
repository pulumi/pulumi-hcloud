# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs

__all__ = [
    'LoadBalancerAlgorithm',
    'LoadBalancerServiceHealthCheck',
    'LoadBalancerServiceHealthCheckHttp',
    'LoadBalancerServiceHttp',
    'LoadBalancerTarget',
    'GetLoadBalancerAlgorithmResult',
    'GetLoadBalancerServiceResult',
    'GetLoadBalancerServiceHealthCheckResult',
    'GetLoadBalancerServiceHealthCheckHttpResult',
    'GetLoadBalancerServiceHttpResult',
    'GetLoadBalancerTargetResult',
    'GetSshKeysSshKeyResult',
]

@pulumi.output_type
class LoadBalancerAlgorithm(dict):
    def __init__(__self__, *,
                 type: Optional[str] = None):
        """
        :param str type: Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
        """
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        Type of the Load Balancer Algorithm. `round_robin` or `least_connections`
        """
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class LoadBalancerServiceHealthCheck(dict):
    def __init__(__self__, *,
                 interval: int,
                 port: int,
                 protocol: str,
                 timeout: int,
                 http: Optional['outputs.LoadBalancerServiceHealthCheckHttp'] = None,
                 retries: Optional[int] = None):
        """
        :param int interval: Interval how often the health check will be performed, in seconds.
        :param int port: Port the health check tries to connect to, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        :param str protocol: Protocol the health check uses. `http` or `tcp`
        :param int timeout: Timeout when a health check try will be canceled if there is no response, in seconds.
        :param 'LoadBalancerServiceHealthCheckHttpArgs' http: List of http configurations. Required if `protocol` is `http`.
        :param int retries: Number of tries a health check will be performed until a target will be listed as `unhealthy`.
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
    def interval(self) -> int:
        """
        Interval how often the health check will be performed, in seconds.
        """
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        Port the health check tries to connect to, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        """
        Protocol the health check uses. `http` or `tcp`
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def timeout(self) -> int:
        """
        Timeout when a health check try will be canceled if there is no response, in seconds.
        """
        return pulumi.get(self, "timeout")

    @property
    @pulumi.getter
    def http(self) -> Optional['outputs.LoadBalancerServiceHealthCheckHttp']:
        """
        List of http configurations. Required if `protocol` is `http`.
        """
        return pulumi.get(self, "http")

    @property
    @pulumi.getter
    def retries(self) -> Optional[int]:
        """
        Number of tries a health check will be performed until a target will be listed as `unhealthy`.
        """
        return pulumi.get(self, "retries")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class LoadBalancerServiceHealthCheckHttp(dict):
    def __init__(__self__, *,
                 domain: Optional[str] = None,
                 path: Optional[str] = None,
                 response: Optional[str] = None,
                 status_codes: Optional[Sequence[str]] = None,
                 tls: Optional[bool] = None):
        """
        :param str domain: Domain we try to access when performing the Health Check.
        :param str path: Path we try to access when performing the Health Check.
        :param str response: Response we expect to be included in the Target response when a Health Check was performed.
        :param Sequence[str] status_codes: We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
        :param bool tls: Enable TLS certificate checking.
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
    def domain(self) -> Optional[str]:
        """
        Domain we try to access when performing the Health Check.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def path(self) -> Optional[str]:
        """
        Path we try to access when performing the Health Check.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def response(self) -> Optional[str]:
        """
        Response we expect to be included in the Target response when a Health Check was performed.
        """
        return pulumi.get(self, "response")

    @property
    @pulumi.getter(name="statusCodes")
    def status_codes(self) -> Optional[Sequence[str]]:
        """
        We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
        """
        return pulumi.get(self, "status_codes")

    @property
    @pulumi.getter
    def tls(self) -> Optional[bool]:
        """
        Enable TLS certificate checking.
        """
        return pulumi.get(self, "tls")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class LoadBalancerServiceHttp(dict):
    def __init__(__self__, *,
                 certificates: Optional[Sequence[int]] = None,
                 cookie_lifetime: Optional[int] = None,
                 cookie_name: Optional[str] = None,
                 redirect_http: Optional[bool] = None,
                 sticky_sessions: Optional[bool] = None):
        """
        :param Sequence[int] certificates: List of IDs from certificates which the Load Balancer has.
        :param int cookie_lifetime: Lifetime of the cookie for sticky session (in seconds). Default: `300`
        :param str cookie_name: Name of the cookie for sticky session. Default: `HCLBSTICKY`
        :param bool redirect_http: Redirect HTTP to HTTPS traffic. Only supported for services with `protocol` `https` using the default HTTP port `80`.
        :param bool sticky_sessions: Enable sticky sessions
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
    def certificates(self) -> Optional[Sequence[int]]:
        """
        List of IDs from certificates which the Load Balancer has.
        """
        return pulumi.get(self, "certificates")

    @property
    @pulumi.getter(name="cookieLifetime")
    def cookie_lifetime(self) -> Optional[int]:
        """
        Lifetime of the cookie for sticky session (in seconds). Default: `300`
        """
        return pulumi.get(self, "cookie_lifetime")

    @property
    @pulumi.getter(name="cookieName")
    def cookie_name(self) -> Optional[str]:
        """
        Name of the cookie for sticky session. Default: `HCLBSTICKY`
        """
        return pulumi.get(self, "cookie_name")

    @property
    @pulumi.getter(name="redirectHttp")
    def redirect_http(self) -> Optional[bool]:
        """
        Redirect HTTP to HTTPS traffic. Only supported for services with `protocol` `https` using the default HTTP port `80`.
        """
        return pulumi.get(self, "redirect_http")

    @property
    @pulumi.getter(name="stickySessions")
    def sticky_sessions(self) -> Optional[bool]:
        """
        Enable sticky sessions
        """
        return pulumi.get(self, "sticky_sessions")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class LoadBalancerTarget(dict):
    def __init__(__self__, *,
                 type: str,
                 server_id: Optional[int] = None,
                 use_private_ip: Optional[bool] = None):
        """
        :param str type: Type of the target. `server`
        :param int server_id: ID of the server which should be a target for this Load Balancer. Required if `type` is `server`
        """
        pulumi.set(__self__, "type", type)
        if server_id is not None:
            pulumi.set(__self__, "server_id", server_id)
        if use_private_ip is not None:
            pulumi.set(__self__, "use_private_ip", use_private_ip)

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Type of the target. `server`
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[int]:
        """
        ID of the server which should be a target for this Load Balancer. Required if `type` is `server`
        """
        return pulumi.get(self, "server_id")

    @property
    @pulumi.getter(name="usePrivateIp")
    def use_private_ip(self) -> Optional[bool]:
        return pulumi.get(self, "use_private_ip")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class GetLoadBalancerAlgorithmResult(dict):
    def __init__(__self__, *,
                 type: str):
        """
        :param str type: (string) Type of the target. `server` or `label_selector`
        """
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        (string) Type of the target. `server` or `label_selector`
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetLoadBalancerServiceResult(dict):
    def __init__(__self__, *,
                 destination_port: int,
                 health_check: 'outputs.GetLoadBalancerServiceHealthCheckResult',
                 http: 'outputs.GetLoadBalancerServiceHttpResult',
                 listen_port: int,
                 protocol: str,
                 proxyprotocol: bool):
        """
        :param int destination_port: (int) Port the service connects to the targets on. Can be everything between `1` and `65535`.
        :param 'GetLoadBalancerServiceHealthCheckArgs' health_check: (list) List of http configurations when `protocol` is `http` or `https`.
        :param 'GetLoadBalancerServiceHttpArgs' http: (list) List of http configurations when `protocol` is `http` or `https`.
        :param int listen_port: (int) Port the service listen on`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        :param str protocol: (string) Protocol the health check uses. `http`, `https` or `tcp`
        :param bool proxyprotocol: (bool) Enable proxyprotocol.
        """
        pulumi.set(__self__, "destination_port", destination_port)
        pulumi.set(__self__, "health_check", health_check)
        pulumi.set(__self__, "http", http)
        pulumi.set(__self__, "listen_port", listen_port)
        pulumi.set(__self__, "protocol", protocol)
        pulumi.set(__self__, "proxyprotocol", proxyprotocol)

    @property
    @pulumi.getter(name="destinationPort")
    def destination_port(self) -> int:
        """
        (int) Port the service connects to the targets on. Can be everything between `1` and `65535`.
        """
        return pulumi.get(self, "destination_port")

    @property
    @pulumi.getter(name="healthCheck")
    def health_check(self) -> 'outputs.GetLoadBalancerServiceHealthCheckResult':
        """
        (list) List of http configurations when `protocol` is `http` or `https`.
        """
        return pulumi.get(self, "health_check")

    @property
    @pulumi.getter
    def http(self) -> 'outputs.GetLoadBalancerServiceHttpResult':
        """
        (list) List of http configurations when `protocol` is `http` or `https`.
        """
        return pulumi.get(self, "http")

    @property
    @pulumi.getter(name="listenPort")
    def listen_port(self) -> int:
        """
        (int) Port the service listen on`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        """
        return pulumi.get(self, "listen_port")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        """
        (string) Protocol the health check uses. `http`, `https` or `tcp`
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def proxyprotocol(self) -> bool:
        """
        (bool) Enable proxyprotocol.
        """
        return pulumi.get(self, "proxyprotocol")


@pulumi.output_type
class GetLoadBalancerServiceHealthCheckResult(dict):
    def __init__(__self__, *,
                 http: 'outputs.GetLoadBalancerServiceHealthCheckHttpResult',
                 interval: int,
                 port: int,
                 protocol: str,
                 retries: int,
                 timeout: int):
        """
        :param 'GetLoadBalancerServiceHealthCheckHttpArgs' http: (list) List of http configurations when `protocol` is `http` or `https`.
        :param int interval: (int) Interval how often the health check will be performed, in seconds.
        :param int port: (int) Port the health check tries to connect to. Can be everything between `1` and `65535`.
        :param str protocol: (string) Protocol the health check uses. `http`, `https` or `tcp`
        :param int retries: (int) Number of tries a health check will be performed until a target will be listed as `unhealthy`.
        :param int timeout: (int) Timeout when a health check try will be canceled if there is no response, in seconds.
        """
        pulumi.set(__self__, "http", http)
        pulumi.set(__self__, "interval", interval)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "protocol", protocol)
        pulumi.set(__self__, "retries", retries)
        pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter
    def http(self) -> 'outputs.GetLoadBalancerServiceHealthCheckHttpResult':
        """
        (list) List of http configurations when `protocol` is `http` or `https`.
        """
        return pulumi.get(self, "http")

    @property
    @pulumi.getter
    def interval(self) -> int:
        """
        (int) Interval how often the health check will be performed, in seconds.
        """
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        (int) Port the health check tries to connect to. Can be everything between `1` and `65535`.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        """
        (string) Protocol the health check uses. `http`, `https` or `tcp`
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def retries(self) -> int:
        """
        (int) Number of tries a health check will be performed until a target will be listed as `unhealthy`.
        """
        return pulumi.get(self, "retries")

    @property
    @pulumi.getter
    def timeout(self) -> int:
        """
        (int) Timeout when a health check try will be canceled if there is no response, in seconds.
        """
        return pulumi.get(self, "timeout")


@pulumi.output_type
class GetLoadBalancerServiceHealthCheckHttpResult(dict):
    def __init__(__self__, *,
                 domain: str,
                 path: str,
                 response: str,
                 status_codes: Sequence[int],
                 tls: bool):
        """
        :param str domain: string) Domain we try to access when performing the Health Check.
        :param str path: (string) Path we try to access when performing the Health Check.
        :param str response: (string) Response we expect to be included in the Target response when a Health Check was performed.
        :param Sequence[int] status_codes: (list[int]) We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
        :param bool tls: (bool) Enable TLS certificate checking.
        """
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "path", path)
        pulumi.set(__self__, "response", response)
        pulumi.set(__self__, "status_codes", status_codes)
        pulumi.set(__self__, "tls", tls)

    @property
    @pulumi.getter
    def domain(self) -> str:
        """
        string) Domain we try to access when performing the Health Check.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def path(self) -> str:
        """
        (string) Path we try to access when performing the Health Check.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def response(self) -> str:
        """
        (string) Response we expect to be included in the Target response when a Health Check was performed.
        """
        return pulumi.get(self, "response")

    @property
    @pulumi.getter(name="statusCodes")
    def status_codes(self) -> Sequence[int]:
        """
        (list[int]) We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
        """
        return pulumi.get(self, "status_codes")

    @property
    @pulumi.getter
    def tls(self) -> bool:
        """
        (bool) Enable TLS certificate checking.
        """
        return pulumi.get(self, "tls")


@pulumi.output_type
class GetLoadBalancerServiceHttpResult(dict):
    def __init__(__self__, *,
                 certificates: Sequence[str],
                 cookie_lifetime: int,
                 cookie_name: str,
                 redirect_http: bool,
                 sticky_sessions: bool):
        """
        :param Sequence[str] certificates: (list[int]) List of IDs from certificates which the Load Balancer has.
        :param int cookie_lifetime: (int) Lifetime of the cookie for sticky session (in seconds).
        :param str cookie_name: (string) Name of the cookie for sticky session.
        :param bool redirect_http: (string) Determine if all requests from port 80 should be redirected to port 443.
        :param bool sticky_sessions: (string) Determine if sticky sessions are enabled or not.
        """
        pulumi.set(__self__, "certificates", certificates)
        pulumi.set(__self__, "cookie_lifetime", cookie_lifetime)
        pulumi.set(__self__, "cookie_name", cookie_name)
        pulumi.set(__self__, "redirect_http", redirect_http)
        pulumi.set(__self__, "sticky_sessions", sticky_sessions)

    @property
    @pulumi.getter
    def certificates(self) -> Sequence[str]:
        """
        (list[int]) List of IDs from certificates which the Load Balancer has.
        """
        return pulumi.get(self, "certificates")

    @property
    @pulumi.getter(name="cookieLifetime")
    def cookie_lifetime(self) -> int:
        """
        (int) Lifetime of the cookie for sticky session (in seconds).
        """
        return pulumi.get(self, "cookie_lifetime")

    @property
    @pulumi.getter(name="cookieName")
    def cookie_name(self) -> str:
        """
        (string) Name of the cookie for sticky session.
        """
        return pulumi.get(self, "cookie_name")

    @property
    @pulumi.getter(name="redirectHttp")
    def redirect_http(self) -> bool:
        """
        (string) Determine if all requests from port 80 should be redirected to port 443.
        """
        return pulumi.get(self, "redirect_http")

    @property
    @pulumi.getter(name="stickySessions")
    def sticky_sessions(self) -> bool:
        """
        (string) Determine if sticky sessions are enabled or not.
        """
        return pulumi.get(self, "sticky_sessions")


@pulumi.output_type
class GetLoadBalancerTargetResult(dict):
    def __init__(__self__, *,
                 label_selector: str,
                 server_id: int,
                 type: str):
        """
        :param str label_selector: (string) Label Selector to add a group of resources based on the label.
        :param int server_id: (int) ID of the server which should be a target for this Load Balancer.
        :param str type: (string) Type of the target. `server` or `label_selector`
        """
        pulumi.set(__self__, "label_selector", label_selector)
        pulumi.set(__self__, "server_id", server_id)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="labelSelector")
    def label_selector(self) -> str:
        """
        (string) Label Selector to add a group of resources based on the label.
        """
        return pulumi.get(self, "label_selector")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> int:
        """
        (int) ID of the server which should be a target for this Load Balancer.
        """
        return pulumi.get(self, "server_id")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        (string) Type of the target. `server` or `label_selector`
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetSshKeysSshKeyResult(dict):
    def __init__(__self__, *,
                 fingerprint: str,
                 id: int,
                 labels: Mapping[str, Any],
                 name: str,
                 public_key: str):
        pulumi.set(__self__, "fingerprint", fingerprint)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "labels", labels)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "public_key", public_key)

    @property
    @pulumi.getter
    def fingerprint(self) -> str:
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def id(self) -> int:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> str:
        return pulumi.get(self, "public_key")


