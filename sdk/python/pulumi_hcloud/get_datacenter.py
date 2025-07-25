# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
    'GetDatacenterResult',
    'AwaitableGetDatacenterResult',
    'get_datacenter',
    'get_datacenter_output',
]

@pulumi.output_type
class GetDatacenterResult:
    """
    A collection of values returned by getDatacenter.
    """
    def __init__(__self__, available_server_type_ids=None, description=None, id=None, location=None, name=None, supported_server_type_ids=None):
        if available_server_type_ids and not isinstance(available_server_type_ids, list):
            raise TypeError("Expected argument 'available_server_type_ids' to be a list")
        pulumi.set(__self__, "available_server_type_ids", available_server_type_ids)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, dict):
            raise TypeError("Expected argument 'location' to be a dict")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if supported_server_type_ids and not isinstance(supported_server_type_ids, list):
            raise TypeError("Expected argument 'supported_server_type_ids' to be a list")
        pulumi.set(__self__, "supported_server_type_ids", supported_server_type_ids)

    @_builtins.property
    @pulumi.getter(name="availableServerTypeIds")
    def available_server_type_ids(self) -> Sequence[_builtins.int]:
        """
        List of currently available Server Types in the Datacenter.
        """
        return pulumi.get(self, "available_server_type_ids")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        Description of the Datacenter.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def id(self) -> Optional[_builtins.int]:
        """
        ID of the Datacenter.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> Mapping[str, _builtins.str]:
        """
        Location of the Datacenter. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[_builtins.str]:
        """
        Name of the Datacenter.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="supportedServerTypeIds")
    def supported_server_type_ids(self) -> Sequence[_builtins.int]:
        """
        List of supported Server Types in the Datacenter.
        """
        return pulumi.get(self, "supported_server_type_ids")


class AwaitableGetDatacenterResult(GetDatacenterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatacenterResult(
            available_server_type_ids=self.available_server_type_ids,
            description=self.description,
            id=self.id,
            location=self.location,
            name=self.name,
            supported_server_type_ids=self.supported_server_type_ids)


def get_datacenter(id: Optional[_builtins.int] = None,
                   name: Optional[_builtins.str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatacenterResult:
    """
    Provides details about a specific Hetzner Cloud Datacenter.

    Use this resource to get detailed information about a specific Datacenter.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    by_id = hcloud.get_datacenter(id=4)
    by_name = hcloud.get_datacenter(name="fsn1-dc14")
    ```


    :param _builtins.int id: ID of the Datacenter.
    :param _builtins.str name: Name of the Datacenter.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getDatacenter:getDatacenter', __args__, opts=opts, typ=GetDatacenterResult).value

    return AwaitableGetDatacenterResult(
        available_server_type_ids=pulumi.get(__ret__, 'available_server_type_ids'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        supported_server_type_ids=pulumi.get(__ret__, 'supported_server_type_ids'))
def get_datacenter_output(id: Optional[pulumi.Input[Optional[_builtins.int]]] = None,
                          name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDatacenterResult]:
    """
    Provides details about a specific Hetzner Cloud Datacenter.

    Use this resource to get detailed information about a specific Datacenter.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    by_id = hcloud.get_datacenter(id=4)
    by_name = hcloud.get_datacenter(name="fsn1-dc14")
    ```


    :param _builtins.int id: ID of the Datacenter.
    :param _builtins.str name: Name of the Datacenter.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('hcloud:index/getDatacenter:getDatacenter', __args__, opts=opts, typ=GetDatacenterResult)
    return __ret__.apply(lambda __response__: GetDatacenterResult(
        available_server_type_ids=pulumi.get(__response__, 'available_server_type_ids'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        supported_server_type_ids=pulumi.get(__response__, 'supported_server_type_ids')))
