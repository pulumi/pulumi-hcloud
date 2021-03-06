# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['VolumeAttachment']


class VolumeAttachment(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 automount: Optional[pulumi.Input[bool]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 volume_id: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Hetzner Cloud Volume attachment to attach a Volume to a Hetzner Cloud Server. Deleting a Volume Attachment will detach the Volume from the Server.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        node1 = hcloud.Server("node1",
            image="debian-9",
            server_type="cx11",
            datacenter="nbg1-dc3")
        master = hcloud.Volume("master",
            location="nbg1",
            size=10)
        main = hcloud.VolumeAttachment("main",
            volume_id=master.id,
            server_id=node1.id,
            automount=True)
        ```

        ## Import

        Volume Attachments can be imported using the `volume_id`

        ```sh
         $ pulumi import hcloud:index/volumeAttachment:VolumeAttachment myvolumeattachment <volume_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] automount: Automount the volume upon attaching it.
        :param pulumi.Input[int] server_id: Server to attach the Volume to.
        :param pulumi.Input[int] volume_id: ID of the Volume.
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

            __props__['automount'] = automount
            if server_id is None and not opts.urn:
                raise TypeError("Missing required property 'server_id'")
            __props__['server_id'] = server_id
            if volume_id is None and not opts.urn:
                raise TypeError("Missing required property 'volume_id'")
            __props__['volume_id'] = volume_id
        super(VolumeAttachment, __self__).__init__(
            'hcloud:index/volumeAttachment:VolumeAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            automount: Optional[pulumi.Input[bool]] = None,
            server_id: Optional[pulumi.Input[int]] = None,
            volume_id: Optional[pulumi.Input[int]] = None) -> 'VolumeAttachment':
        """
        Get an existing VolumeAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] automount: Automount the volume upon attaching it.
        :param pulumi.Input[int] server_id: Server to attach the Volume to.
        :param pulumi.Input[int] volume_id: ID of the Volume.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["automount"] = automount
        __props__["server_id"] = server_id
        __props__["volume_id"] = volume_id
        return VolumeAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def automount(self) -> pulumi.Output[bool]:
        """
        Automount the volume upon attaching it.
        """
        return pulumi.get(self, "automount")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Output[int]:
        """
        Server to attach the Volume to.
        """
        return pulumi.get(self, "server_id")

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> pulumi.Output[int]:
        """
        ID of the Volume.
        """
        return pulumi.get(self, "volume_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

