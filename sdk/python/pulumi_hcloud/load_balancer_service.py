# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['LoadBalancerServiceArgs', 'LoadBalancerService']

@pulumi.input_type
class LoadBalancerServiceArgs:
    def __init__(__self__, *,
                 load_balancer_id: pulumi.Input[str],
                 protocol: pulumi.Input[str],
                 destination_port: Optional[pulumi.Input[int]] = None,
                 health_check: Optional[pulumi.Input['LoadBalancerServiceHealthCheckArgs']] = None,
                 http: Optional[pulumi.Input['LoadBalancerServiceHttpArgs']] = None,
                 listen_port: Optional[pulumi.Input[int]] = None,
                 proxyprotocol: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a LoadBalancerService resource.
        :param pulumi.Input[str] load_balancer_id: Id of the load balancer this service belongs to.
        :param pulumi.Input[str] protocol: Protocol of the service. `http`, `https` or `tcp`
        :param pulumi.Input[int] destination_port: Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
        :param pulumi.Input['LoadBalancerServiceHealthCheckArgs'] health_check: Health Check configuration when `protocol` is `http` or `https`.
        :param pulumi.Input['LoadBalancerServiceHttpArgs'] http: HTTP configuration when `protocol` is `http` or `https`.
        :param pulumi.Input[int] listen_port: Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        :param pulumi.Input[bool] proxyprotocol: Enable proxyprotocol.
        """
        pulumi.set(__self__, "load_balancer_id", load_balancer_id)
        pulumi.set(__self__, "protocol", protocol)
        if destination_port is not None:
            pulumi.set(__self__, "destination_port", destination_port)
        if health_check is not None:
            pulumi.set(__self__, "health_check", health_check)
        if http is not None:
            pulumi.set(__self__, "http", http)
        if listen_port is not None:
            pulumi.set(__self__, "listen_port", listen_port)
        if proxyprotocol is not None:
            pulumi.set(__self__, "proxyprotocol", proxyprotocol)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Input[str]:
        """
        Id of the load balancer this service belongs to.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Input[str]:
        """
        Protocol of the service. `http`, `https` or `tcp`
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="destinationPort")
    def destination_port(self) -> Optional[pulumi.Input[int]]:
        """
        Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
        """
        return pulumi.get(self, "destination_port")

    @destination_port.setter
    def destination_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "destination_port", value)

    @property
    @pulumi.getter(name="healthCheck")
    def health_check(self) -> Optional[pulumi.Input['LoadBalancerServiceHealthCheckArgs']]:
        """
        Health Check configuration when `protocol` is `http` or `https`.
        """
        return pulumi.get(self, "health_check")

    @health_check.setter
    def health_check(self, value: Optional[pulumi.Input['LoadBalancerServiceHealthCheckArgs']]):
        pulumi.set(self, "health_check", value)

    @property
    @pulumi.getter
    def http(self) -> Optional[pulumi.Input['LoadBalancerServiceHttpArgs']]:
        """
        HTTP configuration when `protocol` is `http` or `https`.
        """
        return pulumi.get(self, "http")

    @http.setter
    def http(self, value: Optional[pulumi.Input['LoadBalancerServiceHttpArgs']]):
        pulumi.set(self, "http", value)

    @property
    @pulumi.getter(name="listenPort")
    def listen_port(self) -> Optional[pulumi.Input[int]]:
        """
        Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        """
        return pulumi.get(self, "listen_port")

    @listen_port.setter
    def listen_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "listen_port", value)

    @property
    @pulumi.getter
    def proxyprotocol(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable proxyprotocol.
        """
        return pulumi.get(self, "proxyprotocol")

    @proxyprotocol.setter
    def proxyprotocol(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "proxyprotocol", value)


@pulumi.input_type
class _LoadBalancerServiceState:
    def __init__(__self__, *,
                 destination_port: Optional[pulumi.Input[int]] = None,
                 health_check: Optional[pulumi.Input['LoadBalancerServiceHealthCheckArgs']] = None,
                 http: Optional[pulumi.Input['LoadBalancerServiceHttpArgs']] = None,
                 listen_port: Optional[pulumi.Input[int]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 proxyprotocol: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering LoadBalancerService resources.
        :param pulumi.Input[int] destination_port: Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
        :param pulumi.Input['LoadBalancerServiceHealthCheckArgs'] health_check: Health Check configuration when `protocol` is `http` or `https`.
        :param pulumi.Input['LoadBalancerServiceHttpArgs'] http: HTTP configuration when `protocol` is `http` or `https`.
        :param pulumi.Input[int] listen_port: Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        :param pulumi.Input[str] load_balancer_id: Id of the load balancer this service belongs to.
        :param pulumi.Input[str] protocol: Protocol of the service. `http`, `https` or `tcp`
        :param pulumi.Input[bool] proxyprotocol: Enable proxyprotocol.
        """
        if destination_port is not None:
            pulumi.set(__self__, "destination_port", destination_port)
        if health_check is not None:
            pulumi.set(__self__, "health_check", health_check)
        if http is not None:
            pulumi.set(__self__, "http", http)
        if listen_port is not None:
            pulumi.set(__self__, "listen_port", listen_port)
        if load_balancer_id is not None:
            pulumi.set(__self__, "load_balancer_id", load_balancer_id)
        if protocol is not None:
            pulumi.set(__self__, "protocol", protocol)
        if proxyprotocol is not None:
            pulumi.set(__self__, "proxyprotocol", proxyprotocol)

    @property
    @pulumi.getter(name="destinationPort")
    def destination_port(self) -> Optional[pulumi.Input[int]]:
        """
        Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
        """
        return pulumi.get(self, "destination_port")

    @destination_port.setter
    def destination_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "destination_port", value)

    @property
    @pulumi.getter(name="healthCheck")
    def health_check(self) -> Optional[pulumi.Input['LoadBalancerServiceHealthCheckArgs']]:
        """
        Health Check configuration when `protocol` is `http` or `https`.
        """
        return pulumi.get(self, "health_check")

    @health_check.setter
    def health_check(self, value: Optional[pulumi.Input['LoadBalancerServiceHealthCheckArgs']]):
        pulumi.set(self, "health_check", value)

    @property
    @pulumi.getter
    def http(self) -> Optional[pulumi.Input['LoadBalancerServiceHttpArgs']]:
        """
        HTTP configuration when `protocol` is `http` or `https`.
        """
        return pulumi.get(self, "http")

    @http.setter
    def http(self, value: Optional[pulumi.Input['LoadBalancerServiceHttpArgs']]):
        pulumi.set(self, "http", value)

    @property
    @pulumi.getter(name="listenPort")
    def listen_port(self) -> Optional[pulumi.Input[int]]:
        """
        Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        """
        return pulumi.get(self, "listen_port")

    @listen_port.setter
    def listen_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "listen_port", value)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> Optional[pulumi.Input[str]]:
        """
        Id of the load balancer this service belongs to.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input[str]]:
        """
        Protocol of the service. `http`, `https` or `tcp`
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter
    def proxyprotocol(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable proxyprotocol.
        """
        return pulumi.get(self, "proxyprotocol")

    @proxyprotocol.setter
    def proxyprotocol(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "proxyprotocol", value)


class LoadBalancerService(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_port: Optional[pulumi.Input[int]] = None,
                 health_check: Optional[pulumi.Input[pulumi.InputType['LoadBalancerServiceHealthCheckArgs']]] = None,
                 http: Optional[pulumi.Input[pulumi.InputType['LoadBalancerServiceHttpArgs']]] = None,
                 listen_port: Optional[pulumi.Input[int]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 proxyprotocol: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Define services for Hetzner Cloud Load Balancers.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        load_balancer = hcloud.LoadBalancer("loadBalancer",
            load_balancer_type="lb11",
            location="nbg1")
        load_balancer_service = hcloud.LoadBalancerService("loadBalancerService",
            load_balancer_id=load_balancer.id,
            protocol="http",
            http=hcloud.LoadBalancerServiceHttpArgs(
                sticky_sessions=True,
                cookie_name="EXAMPLE_STICKY",
            ),
            health_check=hcloud.LoadBalancerServiceHealthCheckArgs(
                protocol="http",
                port=80,
                interval=10,
                timeout=5,
                http=hcloud.LoadBalancerServiceHealthCheckHttpArgs(
                    domain="example.com",
                    path="/healthz",
                    response="OK",
                    tls=True,
                    status_codes=["200"],
                ),
            ))
        ```

        ## Import

        Load Balancer Service entries can be imported using a compound ID with the following format:

         `<load-balancer-id>__<listen-port>`

        ```sh
        $ pulumi import hcloud:index/loadBalancerService:LoadBalancerService myloadbalancernetwork 123__80
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] destination_port: Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
        :param pulumi.Input[pulumi.InputType['LoadBalancerServiceHealthCheckArgs']] health_check: Health Check configuration when `protocol` is `http` or `https`.
        :param pulumi.Input[pulumi.InputType['LoadBalancerServiceHttpArgs']] http: HTTP configuration when `protocol` is `http` or `https`.
        :param pulumi.Input[int] listen_port: Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        :param pulumi.Input[str] load_balancer_id: Id of the load balancer this service belongs to.
        :param pulumi.Input[str] protocol: Protocol of the service. `http`, `https` or `tcp`
        :param pulumi.Input[bool] proxyprotocol: Enable proxyprotocol.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadBalancerServiceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Define services for Hetzner Cloud Load Balancers.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        load_balancer = hcloud.LoadBalancer("loadBalancer",
            load_balancer_type="lb11",
            location="nbg1")
        load_balancer_service = hcloud.LoadBalancerService("loadBalancerService",
            load_balancer_id=load_balancer.id,
            protocol="http",
            http=hcloud.LoadBalancerServiceHttpArgs(
                sticky_sessions=True,
                cookie_name="EXAMPLE_STICKY",
            ),
            health_check=hcloud.LoadBalancerServiceHealthCheckArgs(
                protocol="http",
                port=80,
                interval=10,
                timeout=5,
                http=hcloud.LoadBalancerServiceHealthCheckHttpArgs(
                    domain="example.com",
                    path="/healthz",
                    response="OK",
                    tls=True,
                    status_codes=["200"],
                ),
            ))
        ```

        ## Import

        Load Balancer Service entries can be imported using a compound ID with the following format:

         `<load-balancer-id>__<listen-port>`

        ```sh
        $ pulumi import hcloud:index/loadBalancerService:LoadBalancerService myloadbalancernetwork 123__80
        ```

        :param str resource_name: The name of the resource.
        :param LoadBalancerServiceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadBalancerServiceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_port: Optional[pulumi.Input[int]] = None,
                 health_check: Optional[pulumi.Input[pulumi.InputType['LoadBalancerServiceHealthCheckArgs']]] = None,
                 http: Optional[pulumi.Input[pulumi.InputType['LoadBalancerServiceHttpArgs']]] = None,
                 listen_port: Optional[pulumi.Input[int]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 proxyprotocol: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadBalancerServiceArgs.__new__(LoadBalancerServiceArgs)

            __props__.__dict__["destination_port"] = destination_port
            __props__.__dict__["health_check"] = health_check
            __props__.__dict__["http"] = http
            __props__.__dict__["listen_port"] = listen_port
            if load_balancer_id is None and not opts.urn:
                raise TypeError("Missing required property 'load_balancer_id'")
            __props__.__dict__["load_balancer_id"] = load_balancer_id
            if protocol is None and not opts.urn:
                raise TypeError("Missing required property 'protocol'")
            __props__.__dict__["protocol"] = protocol
            __props__.__dict__["proxyprotocol"] = proxyprotocol
        super(LoadBalancerService, __self__).__init__(
            'hcloud:index/loadBalancerService:LoadBalancerService',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            destination_port: Optional[pulumi.Input[int]] = None,
            health_check: Optional[pulumi.Input[pulumi.InputType['LoadBalancerServiceHealthCheckArgs']]] = None,
            http: Optional[pulumi.Input[pulumi.InputType['LoadBalancerServiceHttpArgs']]] = None,
            listen_port: Optional[pulumi.Input[int]] = None,
            load_balancer_id: Optional[pulumi.Input[str]] = None,
            protocol: Optional[pulumi.Input[str]] = None,
            proxyprotocol: Optional[pulumi.Input[bool]] = None) -> 'LoadBalancerService':
        """
        Get an existing LoadBalancerService resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] destination_port: Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
        :param pulumi.Input[pulumi.InputType['LoadBalancerServiceHealthCheckArgs']] health_check: Health Check configuration when `protocol` is `http` or `https`.
        :param pulumi.Input[pulumi.InputType['LoadBalancerServiceHttpArgs']] http: HTTP configuration when `protocol` is `http` or `https`.
        :param pulumi.Input[int] listen_port: Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        :param pulumi.Input[str] load_balancer_id: Id of the load balancer this service belongs to.
        :param pulumi.Input[str] protocol: Protocol of the service. `http`, `https` or `tcp`
        :param pulumi.Input[bool] proxyprotocol: Enable proxyprotocol.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadBalancerServiceState.__new__(_LoadBalancerServiceState)

        __props__.__dict__["destination_port"] = destination_port
        __props__.__dict__["health_check"] = health_check
        __props__.__dict__["http"] = http
        __props__.__dict__["listen_port"] = listen_port
        __props__.__dict__["load_balancer_id"] = load_balancer_id
        __props__.__dict__["protocol"] = protocol
        __props__.__dict__["proxyprotocol"] = proxyprotocol
        return LoadBalancerService(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="destinationPort")
    def destination_port(self) -> pulumi.Output[int]:
        """
        Port the service connects to the targets on, required if protocol is `tcp`. Can be everything between `1` and `65535`.
        """
        return pulumi.get(self, "destination_port")

    @property
    @pulumi.getter(name="healthCheck")
    def health_check(self) -> pulumi.Output['outputs.LoadBalancerServiceHealthCheck']:
        """
        Health Check configuration when `protocol` is `http` or `https`.
        """
        return pulumi.get(self, "health_check")

    @property
    @pulumi.getter
    def http(self) -> pulumi.Output['outputs.LoadBalancerServiceHttp']:
        """
        HTTP configuration when `protocol` is `http` or `https`.
        """
        return pulumi.get(self, "http")

    @property
    @pulumi.getter(name="listenPort")
    def listen_port(self) -> pulumi.Output[int]:
        """
        Port the service listen on, required if protocol is `tcp`. Can be everything between `1` and `65535`. Must be unique per Load Balancer.
        """
        return pulumi.get(self, "listen_port")

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Output[str]:
        """
        Id of the load balancer this service belongs to.
        """
        return pulumi.get(self, "load_balancer_id")

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Output[str]:
        """
        Protocol of the service. `http`, `https` or `tcp`
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def proxyprotocol(self) -> pulumi.Output[bool]:
        """
        Enable proxyprotocol.
        """
        return pulumi.get(self, "proxyprotocol")

