# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['NetworkSubnetArgs', 'NetworkSubnet']

@pulumi.input_type
class NetworkSubnetArgs:
    def __init__(__self__, *,
                 ip_range: pulumi.Input[str],
                 network_id: pulumi.Input[int],
                 network_zone: pulumi.Input[str],
                 type: pulumi.Input[str],
                 vswitch_id: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a NetworkSubnet resource.
        :param pulumi.Input[str] ip_range: Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        :param pulumi.Input[int] network_id: ID of the Network the subnet should be added to.
        :param pulumi.Input[str] network_zone: Name of network zone.
        :param pulumi.Input[str] type: Type of subnet. `server`, `cloud` or `vswitch`
        :param pulumi.Input[int] vswitch_id: ID of the vswitch, Required if type is `vswitch`
        """
        NetworkSubnetArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            ip_range=ip_range,
            network_id=network_id,
            network_zone=network_zone,
            type=type,
            vswitch_id=vswitch_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             ip_range: Optional[pulumi.Input[str]] = None,
             network_id: Optional[pulumi.Input[int]] = None,
             network_zone: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             vswitch_id: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if ip_range is None and 'ipRange' in kwargs:
            ip_range = kwargs['ipRange']
        if ip_range is None:
            raise TypeError("Missing 'ip_range' argument")
        if network_id is None and 'networkId' in kwargs:
            network_id = kwargs['networkId']
        if network_id is None:
            raise TypeError("Missing 'network_id' argument")
        if network_zone is None and 'networkZone' in kwargs:
            network_zone = kwargs['networkZone']
        if network_zone is None:
            raise TypeError("Missing 'network_zone' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']

        _setter("ip_range", ip_range)
        _setter("network_id", network_id)
        _setter("network_zone", network_zone)
        _setter("type", type)
        if vswitch_id is not None:
            _setter("vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> pulumi.Input[str]:
        """
        Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        """
        return pulumi.get(self, "ip_range")

    @ip_range.setter
    def ip_range(self, value: pulumi.Input[str]):
        pulumi.set(self, "ip_range", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Input[int]:
        """
        ID of the Network the subnet should be added to.
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter(name="networkZone")
    def network_zone(self) -> pulumi.Input[str]:
        """
        Name of network zone.
        """
        return pulumi.get(self, "network_zone")

    @network_zone.setter
    def network_zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "network_zone", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of subnet. `server`, `cloud` or `vswitch`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the vswitch, Required if type is `vswitch`
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vswitch_id", value)


@pulumi.input_type
class _NetworkSubnetState:
    def __init__(__self__, *,
                 gateway: Optional[pulumi.Input[str]] = None,
                 ip_range: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[int]] = None,
                 network_zone: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering NetworkSubnet resources.
        :param pulumi.Input[str] ip_range: Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        :param pulumi.Input[int] network_id: ID of the Network the subnet should be added to.
        :param pulumi.Input[str] network_zone: Name of network zone.
        :param pulumi.Input[str] type: Type of subnet. `server`, `cloud` or `vswitch`
        :param pulumi.Input[int] vswitch_id: ID of the vswitch, Required if type is `vswitch`
        """
        _NetworkSubnetState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            gateway=gateway,
            ip_range=ip_range,
            network_id=network_id,
            network_zone=network_zone,
            type=type,
            vswitch_id=vswitch_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             gateway: Optional[pulumi.Input[str]] = None,
             ip_range: Optional[pulumi.Input[str]] = None,
             network_id: Optional[pulumi.Input[int]] = None,
             network_zone: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             vswitch_id: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if ip_range is None and 'ipRange' in kwargs:
            ip_range = kwargs['ipRange']
        if network_id is None and 'networkId' in kwargs:
            network_id = kwargs['networkId']
        if network_zone is None and 'networkZone' in kwargs:
            network_zone = kwargs['networkZone']
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']

        if gateway is not None:
            _setter("gateway", gateway)
        if ip_range is not None:
            _setter("ip_range", ip_range)
        if network_id is not None:
            _setter("network_id", network_id)
        if network_zone is not None:
            _setter("network_zone", network_zone)
        if type is not None:
            _setter("type", type)
        if vswitch_id is not None:
            _setter("vswitch_id", vswitch_id)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> Optional[pulumi.Input[str]]:
        """
        Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        """
        return pulumi.get(self, "ip_range")

    @ip_range.setter
    def ip_range(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_range", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the Network the subnet should be added to.
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter(name="networkZone")
    def network_zone(self) -> Optional[pulumi.Input[str]]:
        """
        Name of network zone.
        """
        return pulumi.get(self, "network_zone")

    @network_zone.setter
    def network_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_zone", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of subnet. `server`, `cloud` or `vswitch`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the vswitch, Required if type is `vswitch`
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vswitch_id", value)


class NetworkSubnet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_range: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[int]] = None,
                 network_zone: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a Hetzner Cloud Network Subnet to represent a Subnet in the Hetzner Cloud.

        ## Import

        Network Subnet entries can be imported using a compound ID with the following format`<network-id>-<ip_range>`

        ```sh
         $ pulumi import hcloud:index/networkSubnet:NetworkSubnet mysubnet 123-10.0.0.0/24
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ip_range: Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        :param pulumi.Input[int] network_id: ID of the Network the subnet should be added to.
        :param pulumi.Input[str] network_zone: Name of network zone.
        :param pulumi.Input[str] type: Type of subnet. `server`, `cloud` or `vswitch`
        :param pulumi.Input[int] vswitch_id: ID of the vswitch, Required if type is `vswitch`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkSubnetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hetzner Cloud Network Subnet to represent a Subnet in the Hetzner Cloud.

        ## Import

        Network Subnet entries can be imported using a compound ID with the following format`<network-id>-<ip_range>`

        ```sh
         $ pulumi import hcloud:index/networkSubnet:NetworkSubnet mysubnet 123-10.0.0.0/24
        ```

        :param str resource_name: The name of the resource.
        :param NetworkSubnetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkSubnetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            NetworkSubnetArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_range: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[int]] = None,
                 network_zone: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkSubnetArgs.__new__(NetworkSubnetArgs)

            if ip_range is None and not opts.urn:
                raise TypeError("Missing required property 'ip_range'")
            __props__.__dict__["ip_range"] = ip_range
            if network_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_id'")
            __props__.__dict__["network_id"] = network_id
            if network_zone is None and not opts.urn:
                raise TypeError("Missing required property 'network_zone'")
            __props__.__dict__["network_zone"] = network_zone
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["vswitch_id"] = vswitch_id
            __props__.__dict__["gateway"] = None
        super(NetworkSubnet, __self__).__init__(
            'hcloud:index/networkSubnet:NetworkSubnet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            gateway: Optional[pulumi.Input[str]] = None,
            ip_range: Optional[pulumi.Input[str]] = None,
            network_id: Optional[pulumi.Input[int]] = None,
            network_zone: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[int]] = None) -> 'NetworkSubnet':
        """
        Get an existing NetworkSubnet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ip_range: Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        :param pulumi.Input[int] network_id: ID of the Network the subnet should be added to.
        :param pulumi.Input[str] network_zone: Name of network zone.
        :param pulumi.Input[str] type: Type of subnet. `server`, `cloud` or `vswitch`
        :param pulumi.Input[int] vswitch_id: ID of the vswitch, Required if type is `vswitch`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkSubnetState.__new__(_NetworkSubnetState)

        __props__.__dict__["gateway"] = gateway
        __props__.__dict__["ip_range"] = ip_range
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["network_zone"] = network_zone
        __props__.__dict__["type"] = type
        __props__.__dict__["vswitch_id"] = vswitch_id
        return NetworkSubnet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def gateway(self) -> pulumi.Output[str]:
        return pulumi.get(self, "gateway")

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> pulumi.Output[str]:
        """
        Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        """
        return pulumi.get(self, "ip_range")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[int]:
        """
        ID of the Network the subnet should be added to.
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter(name="networkZone")
    def network_zone(self) -> pulumi.Output[str]:
        """
        Name of network zone.
        """
        return pulumi.get(self, "network_zone")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of subnet. `server`, `cloud` or `vswitch`
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[Optional[int]]:
        """
        ID of the vswitch, Required if type is `vswitch`
        """
        return pulumi.get(self, "vswitch_id")

