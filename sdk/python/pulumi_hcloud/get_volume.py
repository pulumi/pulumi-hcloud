# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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

__all__ = [
    'GetVolumeResult',
    'AwaitableGetVolumeResult',
    'get_volume',
    'get_volume_output',
]

@pulumi.output_type
class GetVolumeResult:
    """
    A collection of values returned by getVolume.
    """
    def __init__(__self__, delete_protection=None, id=None, labels=None, linux_device=None, location=None, name=None, selector=None, server_id=None, size=None, with_selector=None, with_statuses=None):
        if delete_protection and not isinstance(delete_protection, bool):
            raise TypeError("Expected argument 'delete_protection' to be a bool")
        pulumi.set(__self__, "delete_protection", delete_protection)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if linux_device and not isinstance(linux_device, str):
            raise TypeError("Expected argument 'linux_device' to be a str")
        pulumi.set(__self__, "linux_device", linux_device)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if selector and not isinstance(selector, str):
            raise TypeError("Expected argument 'selector' to be a str")
        pulumi.set(__self__, "selector", selector)
        if server_id and not isinstance(server_id, int):
            raise TypeError("Expected argument 'server_id' to be a int")
        pulumi.set(__self__, "server_id", server_id)
        if size and not isinstance(size, int):
            raise TypeError("Expected argument 'size' to be a int")
        pulumi.set(__self__, "size", size)
        if with_selector and not isinstance(with_selector, str):
            raise TypeError("Expected argument 'with_selector' to be a str")
        pulumi.set(__self__, "with_selector", with_selector)
        if with_statuses and not isinstance(with_statuses, list):
            raise TypeError("Expected argument 'with_statuses' to be a list")
        pulumi.set(__self__, "with_statuses", with_statuses)

    @property
    @pulumi.getter(name="deleteProtection")
    def delete_protection(self) -> builtins.bool:
        """
        (bool) Whether delete protection is enabled.
        """
        return pulumi.get(self, "delete_protection")

    @property
    @pulumi.getter
    def id(self) -> builtins.int:
        """
        (int) Unique ID of the volume.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, builtins.str]:
        """
        (map) User-defined labels (key-value pairs).
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="linuxDevice")
    def linux_device(self) -> builtins.str:
        """
        (string) Device path on the file system for the Volume.
        """
        return pulumi.get(self, "linux_device")

    @property
    @pulumi.getter
    def location(self) -> Optional[builtins.str]:
        """
        (string) The location name. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        (string) Name of the volume.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    @_utilities.deprecated("""Please use the with_selector property instead.""")
    def selector(self) -> Optional[builtins.str]:
        return pulumi.get(self, "selector")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[builtins.int]:
        """
        (Optional, int) Server ID the volume is attached to
        """
        return pulumi.get(self, "server_id")

    @property
    @pulumi.getter
    def size(self) -> builtins.int:
        """
        (int) Size of the volume.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter(name="withSelector")
    def with_selector(self) -> Optional[builtins.str]:
        return pulumi.get(self, "with_selector")

    @property
    @pulumi.getter(name="withStatuses")
    def with_statuses(self) -> Optional[Sequence[builtins.str]]:
        return pulumi.get(self, "with_statuses")


class AwaitableGetVolumeResult(GetVolumeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVolumeResult(
            delete_protection=self.delete_protection,
            id=self.id,
            labels=self.labels,
            linux_device=self.linux_device,
            location=self.location,
            name=self.name,
            selector=self.selector,
            server_id=self.server_id,
            size=self.size,
            with_selector=self.with_selector,
            with_statuses=self.with_statuses)


def get_volume(id: Optional[builtins.int] = None,
               location: Optional[builtins.str] = None,
               name: Optional[builtins.str] = None,
               selector: Optional[builtins.str] = None,
               server_id: Optional[builtins.int] = None,
               with_selector: Optional[builtins.str] = None,
               with_statuses: Optional[Sequence[builtins.str]] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVolumeResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    volume1 = hcloud.get_volume(id=1234)
    volume2 = hcloud.get_volume(name="my-volume")
    volume3 = hcloud.get_volume(with_selector="key=value")
    ```


    :param builtins.int id: ID of the volume.
    :param builtins.str location: (string) The location name. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
    :param builtins.str name: Name of the volume.
    :param builtins.int server_id: (Optional, int) Server ID the volume is attached to
    :param builtins.str with_selector: Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
    :param Sequence[builtins.str] with_statuses: List only volumes with the specified status, could contain `creating` or `available`.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['location'] = location
    __args__['name'] = name
    __args__['selector'] = selector
    __args__['serverId'] = server_id
    __args__['withSelector'] = with_selector
    __args__['withStatuses'] = with_statuses
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getVolume:getVolume', __args__, opts=opts, typ=GetVolumeResult).value

    return AwaitableGetVolumeResult(
        delete_protection=pulumi.get(__ret__, 'delete_protection'),
        id=pulumi.get(__ret__, 'id'),
        labels=pulumi.get(__ret__, 'labels'),
        linux_device=pulumi.get(__ret__, 'linux_device'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        selector=pulumi.get(__ret__, 'selector'),
        server_id=pulumi.get(__ret__, 'server_id'),
        size=pulumi.get(__ret__, 'size'),
        with_selector=pulumi.get(__ret__, 'with_selector'),
        with_statuses=pulumi.get(__ret__, 'with_statuses'))
def get_volume_output(id: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                      location: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                      name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                      selector: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                      server_id: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                      with_selector: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                      with_statuses: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetVolumeResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    volume1 = hcloud.get_volume(id=1234)
    volume2 = hcloud.get_volume(name="my-volume")
    volume3 = hcloud.get_volume(with_selector="key=value")
    ```


    :param builtins.int id: ID of the volume.
    :param builtins.str location: (string) The location name. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
    :param builtins.str name: Name of the volume.
    :param builtins.int server_id: (Optional, int) Server ID the volume is attached to
    :param builtins.str with_selector: Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
    :param Sequence[builtins.str] with_statuses: List only volumes with the specified status, could contain `creating` or `available`.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['location'] = location
    __args__['name'] = name
    __args__['selector'] = selector
    __args__['serverId'] = server_id
    __args__['withSelector'] = with_selector
    __args__['withStatuses'] = with_statuses
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('hcloud:index/getVolume:getVolume', __args__, opts=opts, typ=GetVolumeResult)
    return __ret__.apply(lambda __response__: GetVolumeResult(
        delete_protection=pulumi.get(__response__, 'delete_protection'),
        id=pulumi.get(__response__, 'id'),
        labels=pulumi.get(__response__, 'labels'),
        linux_device=pulumi.get(__response__, 'linux_device'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        selector=pulumi.get(__response__, 'selector'),
        server_id=pulumi.get(__response__, 'server_id'),
        size=pulumi.get(__response__, 'size'),
        with_selector=pulumi.get(__response__, 'with_selector'),
        with_statuses=pulumi.get(__response__, 'with_statuses')))
