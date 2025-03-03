# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
    'GetServerTypeResult',
    'AwaitableGetServerTypeResult',
    'get_server_type',
    'get_server_type_output',
]

@pulumi.output_type
class GetServerTypeResult:
    """
    A collection of values returned by getServerType.
    """
    def __init__(__self__, architecture=None, cores=None, cpu_type=None, deprecation_announced=None, description=None, disk=None, id=None, included_traffic=None, is_deprecated=None, memory=None, name=None, storage_type=None, unavailable_after=None):
        if architecture and not isinstance(architecture, str):
            raise TypeError("Expected argument 'architecture' to be a str")
        pulumi.set(__self__, "architecture", architecture)
        if cores and not isinstance(cores, int):
            raise TypeError("Expected argument 'cores' to be a int")
        pulumi.set(__self__, "cores", cores)
        if cpu_type and not isinstance(cpu_type, str):
            raise TypeError("Expected argument 'cpu_type' to be a str")
        pulumi.set(__self__, "cpu_type", cpu_type)
        if deprecation_announced and not isinstance(deprecation_announced, str):
            raise TypeError("Expected argument 'deprecation_announced' to be a str")
        pulumi.set(__self__, "deprecation_announced", deprecation_announced)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if disk and not isinstance(disk, int):
            raise TypeError("Expected argument 'disk' to be a int")
        pulumi.set(__self__, "disk", disk)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if included_traffic and not isinstance(included_traffic, int):
            raise TypeError("Expected argument 'included_traffic' to be a int")
        pulumi.set(__self__, "included_traffic", included_traffic)
        if is_deprecated and not isinstance(is_deprecated, bool):
            raise TypeError("Expected argument 'is_deprecated' to be a bool")
        pulumi.set(__self__, "is_deprecated", is_deprecated)
        if memory and not isinstance(memory, int):
            raise TypeError("Expected argument 'memory' to be a int")
        pulumi.set(__self__, "memory", memory)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if storage_type and not isinstance(storage_type, str):
            raise TypeError("Expected argument 'storage_type' to be a str")
        pulumi.set(__self__, "storage_type", storage_type)
        if unavailable_after and not isinstance(unavailable_after, str):
            raise TypeError("Expected argument 'unavailable_after' to be a str")
        pulumi.set(__self__, "unavailable_after", unavailable_after)

    @property
    @pulumi.getter
    def architecture(self) -> str:
        """
        Architecture of the cpu for a Server of this type.
        """
        return pulumi.get(self, "architecture")

    @property
    @pulumi.getter
    def cores(self) -> int:
        """
        Number of cpu cores for a Server of this type.
        """
        return pulumi.get(self, "cores")

    @property
    @pulumi.getter(name="cpuType")
    def cpu_type(self) -> str:
        """
        Type of cpu for a Server of this type.
        """
        return pulumi.get(self, "cpu_type")

    @property
    @pulumi.getter(name="deprecationAnnounced")
    def deprecation_announced(self) -> str:
        """
        Date of the Server Type deprecation announcement.
        """
        return pulumi.get(self, "deprecation_announced")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the Server Type.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def disk(self) -> int:
        """
        Disk size in GB for a Server of this type.
        """
        return pulumi.get(self, "disk")

    @property
    @pulumi.getter
    def id(self) -> Optional[int]:
        """
        ID of the Server Type.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="includedTraffic")
    @_utilities.deprecated("""The field is deprecated and will always report 0 after 2024-08-05.""")
    def included_traffic(self) -> int:
        return pulumi.get(self, "included_traffic")

    @property
    @pulumi.getter(name="isDeprecated")
    def is_deprecated(self) -> bool:
        """
        Whether the Server Type is deprecated.
        """
        return pulumi.get(self, "is_deprecated")

    @property
    @pulumi.getter
    def memory(self) -> int:
        """
        Memory in GB for a Server of this type.
        """
        return pulumi.get(self, "memory")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of the Server Type.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="storageType")
    def storage_type(self) -> str:
        """
        Type of boot drive for a Server of this type.
        """
        return pulumi.get(self, "storage_type")

    @property
    @pulumi.getter(name="unavailableAfter")
    def unavailable_after(self) -> str:
        """
        Date of the Server Type removal. After this date, the Server Type cannot be used anymore.
        """
        return pulumi.get(self, "unavailable_after")


class AwaitableGetServerTypeResult(GetServerTypeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServerTypeResult(
            architecture=self.architecture,
            cores=self.cores,
            cpu_type=self.cpu_type,
            deprecation_announced=self.deprecation_announced,
            description=self.description,
            disk=self.disk,
            id=self.id,
            included_traffic=self.included_traffic,
            is_deprecated=self.is_deprecated,
            memory=self.memory,
            name=self.name,
            storage_type=self.storage_type,
            unavailable_after=self.unavailable_after)


def get_server_type(id: Optional[int] = None,
                    name: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServerTypeResult:
    """
    Provides details about a specific Hetzner Cloud Server Type.

    Use this resource to get detailed information about specific Server Type.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    by_id = hcloud.get_server_type(id=22)
    by_name = hcloud.get_server_type(name="cx22")
    main = hcloud.Server("main",
        name="my-server",
        location="fsn1",
        image="debian-12",
        server_type=by_name.name)
    ```


    :param int id: ID of the Server Type.
    :param str name: Name of the Server Type.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getServerType:getServerType', __args__, opts=opts, typ=GetServerTypeResult).value

    return AwaitableGetServerTypeResult(
        architecture=pulumi.get(__ret__, 'architecture'),
        cores=pulumi.get(__ret__, 'cores'),
        cpu_type=pulumi.get(__ret__, 'cpu_type'),
        deprecation_announced=pulumi.get(__ret__, 'deprecation_announced'),
        description=pulumi.get(__ret__, 'description'),
        disk=pulumi.get(__ret__, 'disk'),
        id=pulumi.get(__ret__, 'id'),
        included_traffic=pulumi.get(__ret__, 'included_traffic'),
        is_deprecated=pulumi.get(__ret__, 'is_deprecated'),
        memory=pulumi.get(__ret__, 'memory'),
        name=pulumi.get(__ret__, 'name'),
        storage_type=pulumi.get(__ret__, 'storage_type'),
        unavailable_after=pulumi.get(__ret__, 'unavailable_after'))
def get_server_type_output(id: Optional[pulumi.Input[Optional[int]]] = None,
                           name: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetServerTypeResult]:
    """
    Provides details about a specific Hetzner Cloud Server Type.

    Use this resource to get detailed information about specific Server Type.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    by_id = hcloud.get_server_type(id=22)
    by_name = hcloud.get_server_type(name="cx22")
    main = hcloud.Server("main",
        name="my-server",
        location="fsn1",
        image="debian-12",
        server_type=by_name.name)
    ```


    :param int id: ID of the Server Type.
    :param str name: Name of the Server Type.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('hcloud:index/getServerType:getServerType', __args__, opts=opts, typ=GetServerTypeResult)
    return __ret__.apply(lambda __response__: GetServerTypeResult(
        architecture=pulumi.get(__response__, 'architecture'),
        cores=pulumi.get(__response__, 'cores'),
        cpu_type=pulumi.get(__response__, 'cpu_type'),
        deprecation_announced=pulumi.get(__response__, 'deprecation_announced'),
        description=pulumi.get(__response__, 'description'),
        disk=pulumi.get(__response__, 'disk'),
        id=pulumi.get(__response__, 'id'),
        included_traffic=pulumi.get(__response__, 'included_traffic'),
        is_deprecated=pulumi.get(__response__, 'is_deprecated'),
        memory=pulumi.get(__response__, 'memory'),
        name=pulumi.get(__response__, 'name'),
        storage_type=pulumi.get(__response__, 'storage_type'),
        unavailable_after=pulumi.get(__response__, 'unavailable_after')))
