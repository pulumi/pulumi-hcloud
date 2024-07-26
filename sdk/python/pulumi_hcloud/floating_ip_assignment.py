# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['FloatingIpAssignmentArgs', 'FloatingIpAssignment']

@pulumi.input_type
class FloatingIpAssignmentArgs:
    def __init__(__self__, *,
                 floating_ip_id: pulumi.Input[int],
                 server_id: pulumi.Input[int]):
        """
        The set of arguments for constructing a FloatingIpAssignment resource.
        :param pulumi.Input[int] floating_ip_id: ID of the Floating IP.
        :param pulumi.Input[int] server_id: Server to assign the Floating IP to.
        """
        pulumi.set(__self__, "floating_ip_id", floating_ip_id)
        pulumi.set(__self__, "server_id", server_id)

    @property
    @pulumi.getter(name="floatingIpId")
    def floating_ip_id(self) -> pulumi.Input[int]:
        """
        ID of the Floating IP.
        """
        return pulumi.get(self, "floating_ip_id")

    @floating_ip_id.setter
    def floating_ip_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "floating_ip_id", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[int]:
        """
        Server to assign the Floating IP to.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "server_id", value)


@pulumi.input_type
class _FloatingIpAssignmentState:
    def __init__(__self__, *,
                 floating_ip_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering FloatingIpAssignment resources.
        :param pulumi.Input[int] floating_ip_id: ID of the Floating IP.
        :param pulumi.Input[int] server_id: Server to assign the Floating IP to.
        """
        if floating_ip_id is not None:
            pulumi.set(__self__, "floating_ip_id", floating_ip_id)
        if server_id is not None:
            pulumi.set(__self__, "server_id", server_id)

    @property
    @pulumi.getter(name="floatingIpId")
    def floating_ip_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the Floating IP.
        """
        return pulumi.get(self, "floating_ip_id")

    @floating_ip_id.setter
    def floating_ip_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "floating_ip_id", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[int]]:
        """
        Server to assign the Floating IP to.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "server_id", value)


class FloatingIpAssignment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 floating_ip_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a Hetzner Cloud Floating IP Assignment to assign a Floating IP to a Hetzner Cloud Server. Deleting a Floating IP Assignment will unassign the Floating IP from the Server.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        node1 = hcloud.Server("node1",
            name="node1",
            image="debian-11",
            server_type="cx22",
            datacenter="fsn1-dc8")
        master = hcloud.FloatingIp("master",
            type="ipv4",
            home_location="nbg1")
        main = hcloud.FloatingIpAssignment("main",
            floating_ip_id=master.id,
            server_id=node1.id)
        ```

        ## Import

        Floating IP Assignments can be imported using the `floating_ip_id`:

        ```sh
        $ pulumi import hcloud:index/floatingIpAssignment:FloatingIpAssignment myfloatingipassignment <floating_ip_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] floating_ip_id: ID of the Floating IP.
        :param pulumi.Input[int] server_id: Server to assign the Floating IP to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FloatingIpAssignmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hetzner Cloud Floating IP Assignment to assign a Floating IP to a Hetzner Cloud Server. Deleting a Floating IP Assignment will unassign the Floating IP from the Server.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        node1 = hcloud.Server("node1",
            name="node1",
            image="debian-11",
            server_type="cx22",
            datacenter="fsn1-dc8")
        master = hcloud.FloatingIp("master",
            type="ipv4",
            home_location="nbg1")
        main = hcloud.FloatingIpAssignment("main",
            floating_ip_id=master.id,
            server_id=node1.id)
        ```

        ## Import

        Floating IP Assignments can be imported using the `floating_ip_id`:

        ```sh
        $ pulumi import hcloud:index/floatingIpAssignment:FloatingIpAssignment myfloatingipassignment <floating_ip_id>
        ```

        :param str resource_name: The name of the resource.
        :param FloatingIpAssignmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FloatingIpAssignmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 floating_ip_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FloatingIpAssignmentArgs.__new__(FloatingIpAssignmentArgs)

            if floating_ip_id is None and not opts.urn:
                raise TypeError("Missing required property 'floating_ip_id'")
            __props__.__dict__["floating_ip_id"] = floating_ip_id
            if server_id is None and not opts.urn:
                raise TypeError("Missing required property 'server_id'")
            __props__.__dict__["server_id"] = server_id
        super(FloatingIpAssignment, __self__).__init__(
            'hcloud:index/floatingIpAssignment:FloatingIpAssignment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            floating_ip_id: Optional[pulumi.Input[int]] = None,
            server_id: Optional[pulumi.Input[int]] = None) -> 'FloatingIpAssignment':
        """
        Get an existing FloatingIpAssignment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] floating_ip_id: ID of the Floating IP.
        :param pulumi.Input[int] server_id: Server to assign the Floating IP to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FloatingIpAssignmentState.__new__(_FloatingIpAssignmentState)

        __props__.__dict__["floating_ip_id"] = floating_ip_id
        __props__.__dict__["server_id"] = server_id
        return FloatingIpAssignment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="floatingIpId")
    def floating_ip_id(self) -> pulumi.Output[int]:
        """
        ID of the Floating IP.
        """
        return pulumi.get(self, "floating_ip_id")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Output[int]:
        """
        Server to assign the Floating IP to.
        """
        return pulumi.get(self, "server_id")

