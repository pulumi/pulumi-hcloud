# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['NetworkRouteArgs', 'NetworkRoute']

@pulumi.input_type
class NetworkRouteArgs:
    def __init__(__self__, *,
                 destination: pulumi.Input[str],
                 gateway: pulumi.Input[str],
                 network_id: pulumi.Input[int]):
        """
        The set of arguments for constructing a NetworkRoute resource.
        :param pulumi.Input[str] destination: Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
        :param pulumi.Input[str] gateway: Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
        :param pulumi.Input[int] network_id: ID of the Network the route should be added to.
        """
        pulumi.set(__self__, "destination", destination)
        pulumi.set(__self__, "gateway", gateway)
        pulumi.set(__self__, "network_id", network_id)

    @property
    @pulumi.getter
    def destination(self) -> pulumi.Input[str]:
        """
        Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
        """
        return pulumi.get(self, "destination")

    @destination.setter
    def destination(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination", value)

    @property
    @pulumi.getter
    def gateway(self) -> pulumi.Input[str]:
        """
        Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
        """
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: pulumi.Input[str]):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Input[int]:
        """
        ID of the Network the route should be added to.
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "network_id", value)


@pulumi.input_type
class _NetworkRouteState:
    def __init__(__self__, *,
                 destination: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering NetworkRoute resources.
        :param pulumi.Input[str] destination: Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
        :param pulumi.Input[str] gateway: Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
        :param pulumi.Input[int] network_id: ID of the Network the route should be added to.
        """
        if destination is not None:
            pulumi.set(__self__, "destination", destination)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)

    @property
    @pulumi.getter
    def destination(self) -> Optional[pulumi.Input[str]]:
        """
        Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
        """
        return pulumi.get(self, "destination")

    @destination.setter
    def destination(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input[str]]:
        """
        Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
        """
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the Network the route should be added to.
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "network_id", value)


class NetworkRoute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a Hetzner Cloud Network Route to represent a Network route in the Hetzner Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        mynet = hcloud.Network("mynet",
            name="my-net",
            ip_range="10.0.0.0/8")
        priv_net = hcloud.NetworkRoute("privNet",
            network_id=mynet.id,
            destination="10.100.1.0/24",
            gateway="10.0.1.1")
        ```

        ## Import

        Network Route entries can be imported using a compound ID with the following format:

        `<network-id>-<destination>`

        ```sh
        $ pulumi import hcloud:index/networkRoute:NetworkRoute myroute 123-10.0.0.0/16
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] destination: Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
        :param pulumi.Input[str] gateway: Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
        :param pulumi.Input[int] network_id: ID of the Network the route should be added to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkRouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hetzner Cloud Network Route to represent a Network route in the Hetzner Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        mynet = hcloud.Network("mynet",
            name="my-net",
            ip_range="10.0.0.0/8")
        priv_net = hcloud.NetworkRoute("privNet",
            network_id=mynet.id,
            destination="10.100.1.0/24",
            gateway="10.0.1.1")
        ```

        ## Import

        Network Route entries can be imported using a compound ID with the following format:

        `<network-id>-<destination>`

        ```sh
        $ pulumi import hcloud:index/networkRoute:NetworkRoute myroute 123-10.0.0.0/16
        ```

        :param str resource_name: The name of the resource.
        :param NetworkRouteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkRouteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkRouteArgs.__new__(NetworkRouteArgs)

            if destination is None and not opts.urn:
                raise TypeError("Missing required property 'destination'")
            __props__.__dict__["destination"] = destination
            if gateway is None and not opts.urn:
                raise TypeError("Missing required property 'gateway'")
            __props__.__dict__["gateway"] = gateway
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
        super(NetworkRoute, __self__).__init__(
            'hcloud:index/networkRoute:NetworkRoute',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            destination: Optional[pulumi.Input[str]] = None,
            gateway: Optional[pulumi.Input[str]] = None,
            network_id: Optional[pulumi.Input[int]] = None) -> 'NetworkRoute':
        """
        Get an existing NetworkRoute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] destination: Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
        :param pulumi.Input[str] gateway: Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
        :param pulumi.Input[int] network_id: ID of the Network the route should be added to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkRouteState.__new__(_NetworkRouteState)

        __props__.__dict__["destination"] = destination
        __props__.__dict__["gateway"] = gateway
        __props__.__dict__["network_id"] = network_id
        return NetworkRoute(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def destination(self) -> pulumi.Output[str]:
        """
        Destination network or host of this route. Must be a subnet of the ip_range of the Network. Must not overlap with an existing ip_range in any subnets or with any destinations in other routes or with the first ip of the networks ip_range or with 172.31.1.1.
        """
        return pulumi.get(self, "destination")

    @property
    @pulumi.getter
    def gateway(self) -> pulumi.Output[str]:
        """
        Gateway for the route. Cannot be the first ip of the networks ip_range and also cannot be 172.31.1.1 as this IP is being used as a gateway for the public network interface of servers.
        """
        return pulumi.get(self, "gateway")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[int]:
        """
        ID of the Network the route should be added to.
        """
        return pulumi.get(self, "network_id")

