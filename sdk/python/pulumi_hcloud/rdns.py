# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['Rdns']


class Rdns(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dns_ptr: Optional[pulumi.Input[str]] = None,
                 floating_ip_id: Optional[pulumi.Input[int]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Hetzner Cloud Reverse DNS Entry to create, modify and reset reverse dns entries for Hetzner Cloud Floating IPs or servers.

        ## Example Usage

        For servers:

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        node1 = hcloud.Server("node1",
            image="debian-9",
            server_type="cx11")
        master = hcloud.Rdns("master",
            server_id=node1.id,
            ip_address=node1.ipv4_address,
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

        ## Import

        Reverse DNS entries can be imported using a compound ID with the following format`<prefix (s for server/ f for floating ip)>-<server or floating ip ID>-<IP address>` # import reverse dns entry on server with id 123, ip 192.168.100.1

        ```sh
         $ pulumi import hcloud:index/rdns:Rdns myrdns s-123-192.168.100.1
        ```

        # import reverse dns entry on floating ip with id 123, ip 2001:db8::1

        ```sh
         $ pulumi import hcloud:index/rdns:Rdns myrdns f-123-2001:db8::1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dns_ptr: The DNS address the `ip_address` should resolve to.
        :param pulumi.Input[int] floating_ip_id: The Floating IP the `ip_address` belongs to.
        :param pulumi.Input[str] ip_address: The IP address that should point to `dns_ptr`.
        :param pulumi.Input[int] server_id: The server the `ip_address` belongs to.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if dns_ptr is None and not opts.urn:
                raise TypeError("Missing required property 'dns_ptr'")
            __props__['dns_ptr'] = dns_ptr
            __props__['floating_ip_id'] = floating_ip_id
            if ip_address is None and not opts.urn:
                raise TypeError("Missing required property 'ip_address'")
            __props__['ip_address'] = ip_address
            __props__['server_id'] = server_id
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
            server_id: Optional[pulumi.Input[int]] = None) -> 'Rdns':
        """
        Get an existing Rdns resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dns_ptr: The DNS address the `ip_address` should resolve to.
        :param pulumi.Input[int] floating_ip_id: The Floating IP the `ip_address` belongs to.
        :param pulumi.Input[str] ip_address: The IP address that should point to `dns_ptr`.
        :param pulumi.Input[int] server_id: The server the `ip_address` belongs to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["dns_ptr"] = dns_ptr
        __props__["floating_ip_id"] = floating_ip_id
        __props__["ip_address"] = ip_address
        __props__["server_id"] = server_id
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
        The Floating IP the `ip_address` belongs to.
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
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Output[Optional[int]]:
        """
        The server the `ip_address` belongs to.
        """
        return pulumi.get(self, "server_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

