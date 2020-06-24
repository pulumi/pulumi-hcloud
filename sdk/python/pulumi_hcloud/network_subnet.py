# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class NetworkSubnet(pulumi.CustomResource):
    gateway: pulumi.Output[str]
    ip_range: pulumi.Output[str]
    network_id: pulumi.Output[float]
    network_zone: pulumi.Output[str]
    type: pulumi.Output[str]
    def __init__(__self__, resource_name, opts=None, ip_range=None, network_id=None, network_zone=None, type=None, __props__=None, __name__=None, __opts__=None):
        """
         Provides a Hetzner Cloud Network Subnet to represent a Subnet in the Hetzner Cloud.



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if ip_range is None:
                raise TypeError("Missing required property 'ip_range'")
            __props__['ip_range'] = ip_range
            if network_id is None:
                raise TypeError("Missing required property 'network_id'")
            __props__['network_id'] = network_id
            if network_zone is None:
                raise TypeError("Missing required property 'network_zone'")
            __props__['network_zone'] = network_zone
            if type is None:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            __props__['gateway'] = None
        super(NetworkSubnet, __self__).__init__(
            'hcloud:index/networkSubnet:NetworkSubnet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, gateway=None, ip_range=None, network_id=None, network_zone=None, type=None):
        """
        Get an existing NetworkSubnet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["gateway"] = gateway
        __props__["ip_range"] = ip_range
        __props__["network_id"] = network_id
        __props__["network_zone"] = network_zone
        __props__["type"] = type
        return NetworkSubnet(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

