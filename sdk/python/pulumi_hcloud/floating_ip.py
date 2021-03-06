# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['FloatingIp']


class FloatingIp(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 home_location: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Hetzner Cloud Floating IP to represent a publicly-accessible static IP address that can be mapped to one of your servers.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        node1 = hcloud.Server("node1",
            image="debian-9",
            server_type="cx11")
        master = hcloud.FloatingIp("master",
            type="ipv4",
            server_id=node1.id)
        ```

        ## Import

        Floating IPs can be imported using its `id`

        ```sh
         $ pulumi import hcloud:index/floatingIp:FloatingIp myip <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the Floating IP.
        :param pulumi.Input[str] home_location: Home location (routing is optimized for that location). Optional if server_id argument is passed.
        :param pulumi.Input[Mapping[str, Any]] labels: User-defined labels (key-value pairs) should be created with.
        :param pulumi.Input[str] name: Name of the Floating IP.
        :param pulumi.Input[int] server_id: Server to assign the Floating IP to.
        :param pulumi.Input[str] type: Type of the Floating IP. `ipv4` `ipv6`
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

            __props__['description'] = description
            __props__['home_location'] = home_location
            __props__['labels'] = labels
            __props__['name'] = name
            __props__['server_id'] = server_id
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            __props__['ip_address'] = None
            __props__['ip_network'] = None
        super(FloatingIp, __self__).__init__(
            'hcloud:index/floatingIp:FloatingIp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            home_location: Optional[pulumi.Input[str]] = None,
            ip_address: Optional[pulumi.Input[str]] = None,
            ip_network: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            server_id: Optional[pulumi.Input[int]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'FloatingIp':
        """
        Get an existing FloatingIp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the Floating IP.
        :param pulumi.Input[str] home_location: Home location (routing is optimized for that location). Optional if server_id argument is passed.
        :param pulumi.Input[str] ip_address: (string) IP Address of the Floating IP.
        :param pulumi.Input[str] ip_network: (string) IPv6 subnet. (Only set if `type` is `ipv6`)
        :param pulumi.Input[Mapping[str, Any]] labels: User-defined labels (key-value pairs) should be created with.
        :param pulumi.Input[str] name: Name of the Floating IP.
        :param pulumi.Input[int] server_id: Server to assign the Floating IP to.
        :param pulumi.Input[str] type: Type of the Floating IP. `ipv4` `ipv6`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["description"] = description
        __props__["home_location"] = home_location
        __props__["ip_address"] = ip_address
        __props__["ip_network"] = ip_network
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["server_id"] = server_id
        __props__["type"] = type
        return FloatingIp(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the Floating IP.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="homeLocation")
    def home_location(self) -> pulumi.Output[str]:
        """
        Home location (routing is optimized for that location). Optional if server_id argument is passed.
        """
        return pulumi.get(self, "home_location")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        (string) IP Address of the Floating IP.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="ipNetwork")
    def ip_network(self) -> pulumi.Output[str]:
        """
        (string) IPv6 subnet. (Only set if `type` is `ipv6`)
        """
        return pulumi.get(self, "ip_network")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        User-defined labels (key-value pairs) should be created with.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Floating IP.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Output[int]:
        """
        Server to assign the Floating IP to.
        """
        return pulumi.get(self, "server_id")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of the Floating IP. `ipv4` `ipv6`
        """
        return pulumi.get(self, "type")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

