# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RdnsArgs', 'Rdns']

@pulumi.input_type
class RdnsArgs:
    def __init__(__self__, *,
                 dns_ptr: pulumi.Input[str],
                 ip_address: pulumi.Input[str],
                 floating_ip_id: Optional[pulumi.Input[int]] = None,
                 load_balancer_id: Optional[pulumi.Input[int]] = None,
                 primary_ip_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a Rdns resource.
        :param pulumi.Input[str] dns_ptr: The DNS address the `ip_address` should resolve to.
        :param pulumi.Input[str] ip_address: The IP address that should point to `dns_ptr`.
        :param pulumi.Input[int] floating_ip_id: The Floating IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[int] load_balancer_id: The Load Balancer the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[int] primary_ip_id: The Primary IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[int] server_id: The server the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        pulumi.set(__self__, "dns_ptr", dns_ptr)
        pulumi.set(__self__, "ip_address", ip_address)
        if floating_ip_id is not None:
            pulumi.set(__self__, "floating_ip_id", floating_ip_id)
        if load_balancer_id is not None:
            pulumi.set(__self__, "load_balancer_id", load_balancer_id)
        if primary_ip_id is not None:
            pulumi.set(__self__, "primary_ip_id", primary_ip_id)
        if server_id is not None:
            pulumi.set(__self__, "server_id", server_id)

    @property
    @pulumi.getter(name="dnsPtr")
    def dns_ptr(self) -> pulumi.Input[str]:
        """
        The DNS address the `ip_address` should resolve to.
        """
        return pulumi.get(self, "dns_ptr")

    @dns_ptr.setter
    def dns_ptr(self, value: pulumi.Input[str]):
        pulumi.set(self, "dns_ptr", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Input[str]:
        """
        The IP address that should point to `dns_ptr`.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter(name="floatingIpId")
    def floating_ip_id(self) -> Optional[pulumi.Input[int]]:
        """
        The Floating IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "floating_ip_id")

    @floating_ip_id.setter
    def floating_ip_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "floating_ip_id", value)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> Optional[pulumi.Input[int]]:
        """
        The Load Balancer the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter(name="primaryIpId")
    def primary_ip_id(self) -> Optional[pulumi.Input[int]]:
        """
        The Primary IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "primary_ip_id")

    @primary_ip_id.setter
    def primary_ip_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "primary_ip_id", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[int]]:
        """
        The server the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "server_id", value)


@pulumi.input_type
class _RdnsState:
    def __init__(__self__, *,
                 dns_ptr: Optional[pulumi.Input[str]] = None,
                 floating_ip_id: Optional[pulumi.Input[int]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 load_balancer_id: Optional[pulumi.Input[int]] = None,
                 primary_ip_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Rdns resources.
        :param pulumi.Input[str] dns_ptr: The DNS address the `ip_address` should resolve to.
        :param pulumi.Input[int] floating_ip_id: The Floating IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[str] ip_address: The IP address that should point to `dns_ptr`.
        :param pulumi.Input[int] load_balancer_id: The Load Balancer the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[int] primary_ip_id: The Primary IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[int] server_id: The server the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        if dns_ptr is not None:
            pulumi.set(__self__, "dns_ptr", dns_ptr)
        if floating_ip_id is not None:
            pulumi.set(__self__, "floating_ip_id", floating_ip_id)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if load_balancer_id is not None:
            pulumi.set(__self__, "load_balancer_id", load_balancer_id)
        if primary_ip_id is not None:
            pulumi.set(__self__, "primary_ip_id", primary_ip_id)
        if server_id is not None:
            pulumi.set(__self__, "server_id", server_id)

    @property
    @pulumi.getter(name="dnsPtr")
    def dns_ptr(self) -> Optional[pulumi.Input[str]]:
        """
        The DNS address the `ip_address` should resolve to.
        """
        return pulumi.get(self, "dns_ptr")

    @dns_ptr.setter
    def dns_ptr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dns_ptr", value)

    @property
    @pulumi.getter(name="floatingIpId")
    def floating_ip_id(self) -> Optional[pulumi.Input[int]]:
        """
        The Floating IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "floating_ip_id")

    @floating_ip_id.setter
    def floating_ip_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "floating_ip_id", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address that should point to `dns_ptr`.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> Optional[pulumi.Input[int]]:
        """
        The Load Balancer the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter(name="primaryIpId")
    def primary_ip_id(self) -> Optional[pulumi.Input[int]]:
        """
        The Primary IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "primary_ip_id")

    @primary_ip_id.setter
    def primary_ip_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "primary_ip_id", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[int]]:
        """
        The server the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "server_id", value)


class Rdns(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dns_ptr: Optional[pulumi.Input[str]] = None,
                 floating_ip_id: Optional[pulumi.Input[int]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 load_balancer_id: Optional[pulumi.Input[int]] = None,
                 primary_ip_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a Hetzner Cloud Reverse DNS Entry to create, modify and reset reverse dns entries for Hetzner Cloud Servers, Primary IPs, Floating IPs or Load Balancers.

        ## Example Usage

        For servers:

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        node1 = hcloud.Server("node1",
            image="debian-11",
            server_type="cx11")
        master = hcloud.Rdns("master",
            server_id=node1.id,
            ip_address=node1.ipv4_address,
            dns_ptr="example.com")
        ```

        For Primary IPs:

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        primary1_primary_ip = hcloud.PrimaryIp("primary1PrimaryIp",
            datacenter="nbg1-dc3",
            type="ipv4")
        primary1_rdns = hcloud.Rdns("primary1Rdns",
            primary_ip_id=primary1_primary_ip.id,
            ip_address=primary1_primary_ip.ip_address,
            dns_ptr="example.com")
        ```

        For Floating IPs:

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        floating1 = hcloud.FloatingIp("floating1",
            home_location="nbg1",
            type="ipv4")
        floating_master = hcloud.Rdns("floatingMaster",
            dns_ptr="example.com",
            floating_ip_id=floating1.id,
            ip_address=floating1.ip_address)
        ```

        For Load Balancers:

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        load_balancer1 = hcloud.LoadBalancer("loadBalancer1",
            load_balancer_type="lb11",
            location="fsn1")
        load_balancer_master = hcloud.Rdns("loadBalancerMaster",
            dns_ptr="example.com",
            ip_address=load_balancer1.ipv4,
            load_balancer_id=load_balancer1.id)
        ```

        ## Import

        Reverse DNS entries can be imported using a compound ID with the following format`<prefix (s for server/ f for floating ip / l for load balancer)>-<server, floating ip or load balancer ID>-<IP address>` import reverse dns entry on server with id 123, ip 192.168.100.1

        ```sh
         $ pulumi import hcloud:index/rdns:Rdns myrdns s-123-192.168.100.1
        ```

         import reverse dns entry on primary ip with id 123, ip 2001:db8::1

        ```sh
         $ pulumi import hcloud:index/rdns:Rdns myrdns p-123-2001:db8::1
        ```

         import reverse dns entry on floating ip with id 123, ip 2001:db8::1

        ```sh
         $ pulumi import hcloud:index/rdns:Rdns myrdns f-123-2001:db8::1
        ```

         import reverse dns entry on load balancer with id 123, ip 2001:db8::1

        ```sh
         $ pulumi import hcloud:index/rdns:Rdns myrdns l-123-2001:db8::1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dns_ptr: The DNS address the `ip_address` should resolve to.
        :param pulumi.Input[int] floating_ip_id: The Floating IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[str] ip_address: The IP address that should point to `dns_ptr`.
        :param pulumi.Input[int] load_balancer_id: The Load Balancer the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[int] primary_ip_id: The Primary IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[int] server_id: The server the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RdnsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hetzner Cloud Reverse DNS Entry to create, modify and reset reverse dns entries for Hetzner Cloud Servers, Primary IPs, Floating IPs or Load Balancers.

        ## Example Usage

        For servers:

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        node1 = hcloud.Server("node1",
            image="debian-11",
            server_type="cx11")
        master = hcloud.Rdns("master",
            server_id=node1.id,
            ip_address=node1.ipv4_address,
            dns_ptr="example.com")
        ```

        For Primary IPs:

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        primary1_primary_ip = hcloud.PrimaryIp("primary1PrimaryIp",
            datacenter="nbg1-dc3",
            type="ipv4")
        primary1_rdns = hcloud.Rdns("primary1Rdns",
            primary_ip_id=primary1_primary_ip.id,
            ip_address=primary1_primary_ip.ip_address,
            dns_ptr="example.com")
        ```

        For Floating IPs:

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        floating1 = hcloud.FloatingIp("floating1",
            home_location="nbg1",
            type="ipv4")
        floating_master = hcloud.Rdns("floatingMaster",
            dns_ptr="example.com",
            floating_ip_id=floating1.id,
            ip_address=floating1.ip_address)
        ```

        For Load Balancers:

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        load_balancer1 = hcloud.LoadBalancer("loadBalancer1",
            load_balancer_type="lb11",
            location="fsn1")
        load_balancer_master = hcloud.Rdns("loadBalancerMaster",
            dns_ptr="example.com",
            ip_address=load_balancer1.ipv4,
            load_balancer_id=load_balancer1.id)
        ```

        ## Import

        Reverse DNS entries can be imported using a compound ID with the following format`<prefix (s for server/ f for floating ip / l for load balancer)>-<server, floating ip or load balancer ID>-<IP address>` import reverse dns entry on server with id 123, ip 192.168.100.1

        ```sh
         $ pulumi import hcloud:index/rdns:Rdns myrdns s-123-192.168.100.1
        ```

         import reverse dns entry on primary ip with id 123, ip 2001:db8::1

        ```sh
         $ pulumi import hcloud:index/rdns:Rdns myrdns p-123-2001:db8::1
        ```

         import reverse dns entry on floating ip with id 123, ip 2001:db8::1

        ```sh
         $ pulumi import hcloud:index/rdns:Rdns myrdns f-123-2001:db8::1
        ```

         import reverse dns entry on load balancer with id 123, ip 2001:db8::1

        ```sh
         $ pulumi import hcloud:index/rdns:Rdns myrdns l-123-2001:db8::1
        ```

        :param str resource_name: The name of the resource.
        :param RdnsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RdnsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dns_ptr: Optional[pulumi.Input[str]] = None,
                 floating_ip_id: Optional[pulumi.Input[int]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 load_balancer_id: Optional[pulumi.Input[int]] = None,
                 primary_ip_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RdnsArgs.__new__(RdnsArgs)

            if dns_ptr is None and not opts.urn:
                raise TypeError("Missing required property 'dns_ptr'")
            __props__.__dict__["dns_ptr"] = dns_ptr
            __props__.__dict__["floating_ip_id"] = floating_ip_id
            if ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'ip_address'")
            __props__.__dict__["ip_address"] = ip_address
            __props__.__dict__["load_balancer_id"] = load_balancer_id
            __props__.__dict__["primary_ip_id"] = primary_ip_id
            __props__.__dict__["server_id"] = server_id
        super(Rdns, __self__).__init__(
            'hcloud:index/rdns:Rdns',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dns_ptr: Optional[pulumi.Input[str]] = None,
            floating_ip_id: Optional[pulumi.Input[int]] = None,
            ip_address: Optional[pulumi.Input[str]] = None,
            load_balancer_id: Optional[pulumi.Input[int]] = None,
            primary_ip_id: Optional[pulumi.Input[int]] = None,
            server_id: Optional[pulumi.Input[int]] = None) -> 'Rdns':
        """
        Get an existing Rdns resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dns_ptr: The DNS address the `ip_address` should resolve to.
        :param pulumi.Input[int] floating_ip_id: The Floating IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[str] ip_address: The IP address that should point to `dns_ptr`.
        :param pulumi.Input[int] load_balancer_id: The Load Balancer the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[int] primary_ip_id: The Primary IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        :param pulumi.Input[int] server_id: The server the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RdnsState.__new__(_RdnsState)

        __props__.__dict__["dns_ptr"] = dns_ptr
        __props__.__dict__["floating_ip_id"] = floating_ip_id
        __props__.__dict__["ip_address"] = ip_address
        __props__.__dict__["load_balancer_id"] = load_balancer_id
        __props__.__dict__["primary_ip_id"] = primary_ip_id
        __props__.__dict__["server_id"] = server_id
        return Rdns(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dnsPtr")
    def dns_ptr(self) -> pulumi.Output[str]:
        """
        The DNS address the `ip_address` should resolve to.
        """
        return pulumi.get(self, "dns_ptr")

    @property
    @pulumi.getter(name="floatingIpId")
    def floating_ip_id(self) -> pulumi.Output[Optional[int]]:
        """
        The Floating IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "floating_ip_id")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        The IP address that should point to `dns_ptr`.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Output[Optional[int]]:
        """
        The Load Balancer the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "load_balancer_id")

    @property
    @pulumi.getter(name="primaryIpId")
    def primary_ip_id(self) -> pulumi.Output[Optional[int]]:
        """
        The Primary IP the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "primary_ip_id")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Output[Optional[int]]:
        """
        The server the `ip_address` belongs to. - `server_id` - (Required, int) The server the `ip_address` belongs to. Specify only one of `server_id`, `primary_ip_id`, `floating_ip_id` and `load_balancer_id`.
        """
        return pulumi.get(self, "server_id")

