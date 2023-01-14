# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['VolumeAttachmentArgs', 'VolumeAttachment']

@pulumi.input_type
class VolumeAttachmentArgs:
    def __init__(__self__, *,
                 server_id: pulumi.Input[int],
                 volume_id: pulumi.Input[int],
                 automount: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a VolumeAttachment resource.
        :param pulumi.Input[int] server_id: Server to attach the Volume to.
        :param pulumi.Input[int] volume_id: ID of the Volume.
        :param pulumi.Input[bool] automount: Automount the volume upon attaching it.
        """
        pulumi.set(__self__, "server_id", server_id)
        pulumi.set(__self__, "volume_id", volume_id)
        if automount is not None:
            pulumi.set(__self__, "automount", automount)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[int]:
        """
        Server to attach the Volume to.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> pulumi.Input[int]:
        """
        ID of the Volume.
        """
        return pulumi.get(self, "volume_id")

    @volume_id.setter
    def volume_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "volume_id", value)

    @property
    @pulumi.getter
    def automount(self) -> Optional[pulumi.Input[bool]]:
        """
        Automount the volume upon attaching it.
        """
        return pulumi.get(self, "automount")

    @automount.setter
    def automount(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "automount", value)


@pulumi.input_type
class _VolumeAttachmentState:
    def __init__(__self__, *,
                 automount: Optional[pulumi.Input[bool]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 volume_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering VolumeAttachment resources.
        :param pulumi.Input[bool] automount: Automount the volume upon attaching it.
        :param pulumi.Input[int] server_id: Server to attach the Volume to.
        :param pulumi.Input[int] volume_id: ID of the Volume.
        """
        if automount is not None:
            pulumi.set(__self__, "automount", automount)
        if server_id is not None:
            pulumi.set(__self__, "server_id", server_id)
        if volume_id is not None:
            pulumi.set(__self__, "volume_id", volume_id)

    @property
    @pulumi.getter
    def automount(self) -> Optional[pulumi.Input[bool]]:
        """
        Automount the volume upon attaching it.
        """
        return pulumi.get(self, "automount")

    @automount.setter
    def automount(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "automount", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[int]]:
        """
        Server to attach the Volume to.
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the Volume.
        """
        return pulumi.get(self, "volume_id")

    @volume_id.setter
    def volume_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "volume_id", value)


class VolumeAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 automount: Optional[pulumi.Input[bool]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 volume_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
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
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VolumeAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
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
        :param VolumeAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VolumeAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 automount: Optional[pulumi.Input[bool]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 volume_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VolumeAttachmentArgs.__new__(VolumeAttachmentArgs)

            __props__.__dict__["automount"] = automount
            if server_id is None and not opts.urn:
                raise TypeError("Missing required property 'server_id'")
            __props__.__dict__["server_id"] = server_id
            if volume_id is None and not opts.urn:
                raise TypeError("Missing required property 'volume_id'")
            __props__.__dict__["volume_id"] = volume_id
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

        __props__ = _VolumeAttachmentState.__new__(_VolumeAttachmentState)

        __props__.__dict__["automount"] = automount
        __props__.__dict__["server_id"] = server_id
        __props__.__dict__["volume_id"] = volume_id
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

