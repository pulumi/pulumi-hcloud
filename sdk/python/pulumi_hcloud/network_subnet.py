# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['NetworkSubnetArgs', 'NetworkSubnet']

@pulumi.input_type
class NetworkSubnetArgs:
    def __init__(__self__, *,
                 ip_range: pulumi.Input[builtins.str],
                 network_id: pulumi.Input[builtins.int],
                 network_zone: pulumi.Input[builtins.str],
                 type: pulumi.Input[builtins.str],
                 vswitch_id: Optional[pulumi.Input[builtins.int]] = None):
        """
        The set of arguments for constructing a NetworkSubnet resource.
        :param pulumi.Input[builtins.str] ip_range: Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        :param pulumi.Input[builtins.int] network_id: ID of the Network the subnet should be added to.
        :param pulumi.Input[builtins.str] network_zone: Name of network zone.
        :param pulumi.Input[builtins.str] type: Type of subnet. `server`, `cloud` or `vswitch`
        :param pulumi.Input[builtins.int] vswitch_id: ID of the vswitch, Required if type is `vswitch`
        """
        pulumi.set(__self__, "ip_range", ip_range)
        pulumi.set(__self__, "network_id", network_id)
        pulumi.set(__self__, "network_zone", network_zone)
        pulumi.set(__self__, "type", type)
        if vswitch_id is not None:
            pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> pulumi.Input[builtins.str]:
        """
        Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        """
        return pulumi.get(self, "ip_range")

    @ip_range.setter
    def ip_range(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "ip_range", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Input[builtins.int]:
        """
        ID of the Network the subnet should be added to.
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter(name="networkZone")
    def network_zone(self) -> pulumi.Input[builtins.str]:
        """
        Name of network zone.
        """
        return pulumi.get(self, "network_zone")

    @network_zone.setter
    def network_zone(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "network_zone", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[builtins.str]:
        """
        Type of subnet. `server`, `cloud` or `vswitch`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        ID of the vswitch, Required if type is `vswitch`
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "vswitch_id", value)


@pulumi.input_type
class _NetworkSubnetState:
    def __init__(__self__, *,
                 gateway: Optional[pulumi.Input[builtins.str]] = None,
                 ip_range: Optional[pulumi.Input[builtins.str]] = None,
                 network_id: Optional[pulumi.Input[builtins.int]] = None,
                 network_zone: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 vswitch_id: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering NetworkSubnet resources.
        :param pulumi.Input[builtins.str] ip_range: Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        :param pulumi.Input[builtins.int] network_id: ID of the Network the subnet should be added to.
        :param pulumi.Input[builtins.str] network_zone: Name of network zone.
        :param pulumi.Input[builtins.str] type: Type of subnet. `server`, `cloud` or `vswitch`
        :param pulumi.Input[builtins.int] vswitch_id: ID of the vswitch, Required if type is `vswitch`
        """
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)
        if ip_range is not None:
            pulumi.set(__self__, "ip_range", ip_range)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if network_zone is not None:
            pulumi.set(__self__, "network_zone", network_zone)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if vswitch_id is not None:
            pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        """
        return pulumi.get(self, "ip_range")

    @ip_range.setter
    def ip_range(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "ip_range", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        ID of the Network the subnet should be added to.
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter(name="networkZone")
    def network_zone(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of network zone.
        """
        return pulumi.get(self, "network_zone")

    @network_zone.setter
    def network_zone(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "network_zone", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Type of subnet. `server`, `cloud` or `vswitch`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        ID of the vswitch, Required if type is `vswitch`
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "vswitch_id", value)


@pulumi.type_token("hcloud:index/networkSubnet:NetworkSubnet")
class NetworkSubnet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_range: Optional[pulumi.Input[builtins.str]] = None,
                 network_id: Optional[pulumi.Input[builtins.int]] = None,
                 network_zone: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 vswitch_id: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        """
        Provides a Hetzner Cloud Network Subnet to represent a Subnet in the Hetzner Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        mynet = hcloud.Network("mynet",
            name="my-net",
            ip_range="10.0.0.0/8")
        foonet = hcloud.NetworkSubnet("foonet",
            network_id=mynet.id,
            type="cloud",
            network_zone="eu-central",
            ip_range="10.0.1.0/24")
        ```

        ## Import

        Network Subnet entries can be imported using a compound ID with the following format:

        `<network-id>-<ip_range>`

        ```sh
        $ pulumi import hcloud:index/networkSubnet:NetworkSubnet example "$NETWORK_ID-$IP_RANGE"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] ip_range: Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        :param pulumi.Input[builtins.int] network_id: ID of the Network the subnet should be added to.
        :param pulumi.Input[builtins.str] network_zone: Name of network zone.
        :param pulumi.Input[builtins.str] type: Type of subnet. `server`, `cloud` or `vswitch`
        :param pulumi.Input[builtins.int] vswitch_id: ID of the vswitch, Required if type is `vswitch`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkSubnetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hetzner Cloud Network Subnet to represent a Subnet in the Hetzner Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        mynet = hcloud.Network("mynet",
            name="my-net",
            ip_range="10.0.0.0/8")
        foonet = hcloud.NetworkSubnet("foonet",
            network_id=mynet.id,
            type="cloud",
            network_zone="eu-central",
            ip_range="10.0.1.0/24")
        ```

        ## Import

        Network Subnet entries can be imported using a compound ID with the following format:

        `<network-id>-<ip_range>`

        ```sh
        $ pulumi import hcloud:index/networkSubnet:NetworkSubnet example "$NETWORK_ID-$IP_RANGE"
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
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip_range: Optional[pulumi.Input[builtins.str]] = None,
                 network_id: Optional[pulumi.Input[builtins.int]] = None,
                 network_zone: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 vswitch_id: Optional[pulumi.Input[builtins.int]] = None,
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
            gateway: Optional[pulumi.Input[builtins.str]] = None,
            ip_range: Optional[pulumi.Input[builtins.str]] = None,
            network_id: Optional[pulumi.Input[builtins.int]] = None,
            network_zone: Optional[pulumi.Input[builtins.str]] = None,
            type: Optional[pulumi.Input[builtins.str]] = None,
            vswitch_id: Optional[pulumi.Input[builtins.int]] = None) -> 'NetworkSubnet':
        """
        Get an existing NetworkSubnet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] ip_range: Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        :param pulumi.Input[builtins.int] network_id: ID of the Network the subnet should be added to.
        :param pulumi.Input[builtins.str] network_zone: Name of network zone.
        :param pulumi.Input[builtins.str] type: Type of subnet. `server`, `cloud` or `vswitch`
        :param pulumi.Input[builtins.int] vswitch_id: ID of the vswitch, Required if type is `vswitch`
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
    def gateway(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "gateway")

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> pulumi.Output[builtins.str]:
        """
        Range to allocate IPs from. Must be a subnet of the ip_range of the Network and must not overlap with any other subnets or with any destinations in routes.
        """
        return pulumi.get(self, "ip_range")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[builtins.int]:
        """
        ID of the Network the subnet should be added to.
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter(name="networkZone")
    def network_zone(self) -> pulumi.Output[builtins.str]:
        """
        Name of network zone.
        """
        return pulumi.get(self, "network_zone")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[builtins.str]:
        """
        Type of subnet. `server`, `cloud` or `vswitch`
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        ID of the vswitch, Required if type is `vswitch`
        """
        return pulumi.get(self, "vswitch_id")

