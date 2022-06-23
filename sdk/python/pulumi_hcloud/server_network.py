# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ServerNetworkInitArgs', 'ServerNetwork']

@pulumi.input_type
class ServerNetworkInitArgs:
    def __init__(__self__, *,
                 server_id: pulumi.Input[int],
                 alias_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[int]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServerNetwork resource.
        :param pulumi.Input[int] server_id: ID of the server.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alias_ips: Additional IPs to be assigned
               to this server.
        :param pulumi.Input[str] ip: IP to request to be assigned to this server.
               If you do not provide this then you will be auto assigned an IP
               address.
        :param pulumi.Input[int] network_id: ID of the network which should be added
               to the server. Required if `subnet_id` is not set. Successful creation
               of the resource depends on the existence of a subnet in the Hetzner
               Cloud Backend. Using `network_id` will not create an explicit
               dependency between server and subnet. Therefore `depends_on` may need
               to be used. Alternatively the `subnet_id` property can be used, which
               will create an explicit dependency between `ServerNetwork` and
               the existence of a subnet.
        :param pulumi.Input[str] subnet_id: ID of the sub-network which should be
               added to the Server. Required if `network_id` is not set.
               *Note*: if the `ip` property is missing, the Server is currently added
               to the last created subnet.
        """
        pulumi.set(__self__, "server_id", server_id)
        if alias_ips is not None:
            pulumi.set(__self__, "alias_ips", alias_ips)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if subnet_id is not None:
            pulumi.set(__self__, "subnet_id", subnet_id)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[int]:
        """
        ID of the server.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter(name="aliasIps")
    def alias_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Additional IPs to be assigned
        to this server.
        """
        return pulumi.get(self, "alias_ips")

    @alias_ips.setter
    def alias_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "alias_ips", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        IP to request to be assigned to this server.
        If you do not provide this then you will be auto assigned an IP
        address.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the network which should be added
        to the server. Required if `subnet_id` is not set. Successful creation
        of the resource depends on the existence of a subnet in the Hetzner
        Cloud Backend. Using `network_id` will not create an explicit
        dependency between server and subnet. Therefore `depends_on` may need
        to be used. Alternatively the `subnet_id` property can be used, which
        will create an explicit dependency between `ServerNetwork` and
        the existence of a subnet.
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the sub-network which should be
        added to the Server. Required if `network_id` is not set.
        *Note*: if the `ip` property is missing, the Server is currently added
        to the last created subnet.
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet_id", value)


@pulumi.input_type
class _ServerNetworkState:
    def __init__(__self__, *,
                 alias_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 mac_address: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServerNetwork resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alias_ips: Additional IPs to be assigned
               to this server.
        :param pulumi.Input[str] ip: IP to request to be assigned to this server.
               If you do not provide this then you will be auto assigned an IP
               address.
        :param pulumi.Input[int] network_id: ID of the network which should be added
               to the server. Required if `subnet_id` is not set. Successful creation
               of the resource depends on the existence of a subnet in the Hetzner
               Cloud Backend. Using `network_id` will not create an explicit
               dependency between server and subnet. Therefore `depends_on` may need
               to be used. Alternatively the `subnet_id` property can be used, which
               will create an explicit dependency between `ServerNetwork` and
               the existence of a subnet.
        :param pulumi.Input[int] server_id: ID of the server.
        :param pulumi.Input[str] subnet_id: ID of the sub-network which should be
               added to the Server. Required if `network_id` is not set.
               *Note*: if the `ip` property is missing, the Server is currently added
               to the last created subnet.
        """
        if alias_ips is not None:
            pulumi.set(__self__, "alias_ips", alias_ips)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)
        if mac_address is not None:
            pulumi.set(__self__, "mac_address", mac_address)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if server_id is not None:
            pulumi.set(__self__, "server_id", server_id)
        if subnet_id is not None:
            pulumi.set(__self__, "subnet_id", subnet_id)

    @property
    @pulumi.getter(name="aliasIps")
    def alias_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Additional IPs to be assigned
        to this server.
        """
        return pulumi.get(self, "alias_ips")

    @alias_ips.setter
    def alias_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "alias_ips", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        IP to request to be assigned to this server.
        If you do not provide this then you will be auto assigned an IP
        address.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="macAddress")
    def mac_address(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "mac_address")

    @mac_address.setter
    def mac_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mac_address", value)

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the network which should be added
        to the server. Required if `subnet_id` is not set. Successful creation
        of the resource depends on the existence of a subnet in the Hetzner
        Cloud Backend. Using `network_id` will not create an explicit
        dependency between server and subnet. Therefore `depends_on` may need
        to be used. Alternatively the `subnet_id` property can be used, which
        will create an explicit dependency between `ServerNetwork` and
        the existence of a subnet.
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "network_id", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the server.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the sub-network which should be
        added to the Server. Required if `network_id` is not set.
        *Note*: if the `ip` property is missing, the Server is currently added
        to the last created subnet.
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet_id", value)


class ServerNetwork(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alias_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Hetzner Cloud Server Network to represent a private network on a server in the Hetzner Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        node1 = hcloud.Server("node1",
            image="debian-9",
            server_type="cx11")
        mynet = hcloud.Network("mynet", ip_range="10.0.0.0/8")
        foonet = hcloud.NetworkSubnet("foonet",
            network_id=mynet.id,
            type="cloud",
            network_zone="eu-central",
            ip_range="10.0.1.0/24")
        srvnetwork = hcloud.ServerNetwork("srvnetwork",
            server_id=node1.id,
            network_id=mynet.id,
            ip="10.0.1.5")
        ```

        ## Import

        Server Network entries can be imported using a compound ID with the following format`<server-id>-<network-id>`

        ```sh
         $ pulumi import hcloud:index/serverNetwork:ServerNetwork myservernetwork 123-654
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alias_ips: Additional IPs to be assigned
               to this server.
        :param pulumi.Input[str] ip: IP to request to be assigned to this server.
               If you do not provide this then you will be auto assigned an IP
               address.
        :param pulumi.Input[int] network_id: ID of the network which should be added
               to the server. Required if `subnet_id` is not set. Successful creation
               of the resource depends on the existence of a subnet in the Hetzner
               Cloud Backend. Using `network_id` will not create an explicit
               dependency between server and subnet. Therefore `depends_on` may need
               to be used. Alternatively the `subnet_id` property can be used, which
               will create an explicit dependency between `ServerNetwork` and
               the existence of a subnet.
        :param pulumi.Input[int] server_id: ID of the server.
        :param pulumi.Input[str] subnet_id: ID of the sub-network which should be
               added to the Server. Required if `network_id` is not set.
               *Note*: if the `ip` property is missing, the Server is currently added
               to the last created subnet.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServerNetworkInitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hetzner Cloud Server Network to represent a private network on a server in the Hetzner Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        node1 = hcloud.Server("node1",
            image="debian-9",
            server_type="cx11")
        mynet = hcloud.Network("mynet", ip_range="10.0.0.0/8")
        foonet = hcloud.NetworkSubnet("foonet",
            network_id=mynet.id,
            type="cloud",
            network_zone="eu-central",
            ip_range="10.0.1.0/24")
        srvnetwork = hcloud.ServerNetwork("srvnetwork",
            server_id=node1.id,
            network_id=mynet.id,
            ip="10.0.1.5")
        ```

        ## Import

        Server Network entries can be imported using a compound ID with the following format`<server-id>-<network-id>`

        ```sh
         $ pulumi import hcloud:index/serverNetwork:ServerNetwork myservernetwork 123-654
        ```

        :param str resource_name: The name of the resource.
        :param ServerNetworkInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServerNetworkInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alias_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 network_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServerNetworkInitArgs.__new__(ServerNetworkInitArgs)

            __props__.__dict__["alias_ips"] = alias_ips
            __props__.__dict__["ip"] = ip
            __props__.__dict__["network_id"] = network_id
            if server_id is None and not opts.urn:
                raise TypeError("Missing required property 'server_id'")
            __props__.__dict__["server_id"] = server_id
            __props__.__dict__["subnet_id"] = subnet_id
            __props__.__dict__["mac_address"] = None
        super(ServerNetwork, __self__).__init__(
            'hcloud:index/serverNetwork:ServerNetwork',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alias_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            ip: Optional[pulumi.Input[str]] = None,
            mac_address: Optional[pulumi.Input[str]] = None,
            network_id: Optional[pulumi.Input[int]] = None,
            server_id: Optional[pulumi.Input[int]] = None,
            subnet_id: Optional[pulumi.Input[str]] = None) -> 'ServerNetwork':
        """
        Get an existing ServerNetwork resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alias_ips: Additional IPs to be assigned
               to this server.
        :param pulumi.Input[str] ip: IP to request to be assigned to this server.
               If you do not provide this then you will be auto assigned an IP
               address.
        :param pulumi.Input[int] network_id: ID of the network which should be added
               to the server. Required if `subnet_id` is not set. Successful creation
               of the resource depends on the existence of a subnet in the Hetzner
               Cloud Backend. Using `network_id` will not create an explicit
               dependency between server and subnet. Therefore `depends_on` may need
               to be used. Alternatively the `subnet_id` property can be used, which
               will create an explicit dependency between `ServerNetwork` and
               the existence of a subnet.
        :param pulumi.Input[int] server_id: ID of the server.
        :param pulumi.Input[str] subnet_id: ID of the sub-network which should be
               added to the Server. Required if `network_id` is not set.
               *Note*: if the `ip` property is missing, the Server is currently added
               to the last created subnet.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServerNetworkState.__new__(_ServerNetworkState)

        __props__.__dict__["alias_ips"] = alias_ips
        __props__.__dict__["ip"] = ip
        __props__.__dict__["mac_address"] = mac_address
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["server_id"] = server_id
        __props__.__dict__["subnet_id"] = subnet_id
        return ServerNetwork(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="aliasIps")
    def alias_ips(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Additional IPs to be assigned
        to this server.
        """
        return pulumi.get(self, "alias_ips")

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[str]:
        """
        IP to request to be assigned to this server.
        If you do not provide this then you will be auto assigned an IP
        address.
        """
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="macAddress")
    def mac_address(self) -> pulumi.Output[str]:
        return pulumi.get(self, "mac_address")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[Optional[int]]:
        """
        ID of the network which should be added
        to the server. Required if `subnet_id` is not set. Successful creation
        of the resource depends on the existence of a subnet in the Hetzner
        Cloud Backend. Using `network_id` will not create an explicit
        dependency between server and subnet. Therefore `depends_on` may need
        to be used. Alternatively the `subnet_id` property can be used, which
        will create an explicit dependency between `ServerNetwork` and
        the existence of a subnet.
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Output[int]:
        """
        ID of the server.
        """
        return pulumi.get(self, "server_id")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Output[Optional[str]]:
        """
        ID of the sub-network which should be
        added to the Server. Required if `network_id` is not set.
        *Note*: if the `ip` property is missing, the Server is currently added
        to the last created subnet.
        """
        return pulumi.get(self, "subnet_id")

