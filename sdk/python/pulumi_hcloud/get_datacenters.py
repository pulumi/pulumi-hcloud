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
from . import outputs

__all__ = [
    'GetDatacentersResult',
    'AwaitableGetDatacentersResult',
    'get_datacenters',
    'get_datacenters_output',
]

@pulumi.output_type
class GetDatacentersResult:
    """
    A collection of values returned by getDatacenters.
    """
    def __init__(__self__, datacenter_ids=None, datacenters=None, descriptions=None, id=None, names=None):
        if datacenter_ids and not isinstance(datacenter_ids, list):
            raise TypeError("Expected argument 'datacenter_ids' to be a list")
        pulumi.set(__self__, "datacenter_ids", datacenter_ids)
        if datacenters and not isinstance(datacenters, list):
            raise TypeError("Expected argument 'datacenters' to be a list")
        pulumi.set(__self__, "datacenters", datacenters)
        if descriptions and not isinstance(descriptions, list):
            raise TypeError("Expected argument 'descriptions' to be a list")
        pulumi.set(__self__, "descriptions", descriptions)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)

    @property
    @pulumi.getter(name="datacenterIds")
    @_utilities.deprecated("""Use datacenters list instead""")
    def datacenter_ids(self) -> Optional[Sequence[str]]:
        """
        (list) List of unique datacenter identifiers. **Deprecated**: Use `datacenters` attribute instead.
        """
        return pulumi.get(self, "datacenter_ids")

    @property
    @pulumi.getter
    def datacenters(self) -> Sequence['outputs.GetDatacentersDatacenterResult']:
        """
        (list) List of all datacenters. See `data.hcloud_datacenter` for schema.
        """
        return pulumi.get(self, "datacenters")

    @property
    @pulumi.getter
    @_utilities.deprecated("""Use datacenters list instead""")
    def descriptions(self) -> Optional[Sequence[str]]:
        """
        (list) List of all datacenter descriptions. **Deprecated**: Use `datacenters` attribute instead.
        """
        return pulumi.get(self, "descriptions")

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    @_utilities.deprecated("""Use datacenters list instead""")
    def names(self) -> Optional[Sequence[str]]:
        """
        (list) List of datacenter names. **Deprecated**: Use `datacenters` attribute instead.
        """
        return pulumi.get(self, "names")


class AwaitableGetDatacentersResult(GetDatacentersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatacentersResult(
            datacenter_ids=self.datacenter_ids,
            datacenters=self.datacenters,
            descriptions=self.descriptions,
            id=self.id,
            names=self.names)


def get_datacenters(datacenter_ids: Optional[Sequence[str]] = None,
                    descriptions: Optional[Sequence[str]] = None,
                    id: Optional[str] = None,
                    names: Optional[Sequence[str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatacentersResult:
    """
    Provides a list of available Hetzner Cloud Datacenters.
    This resource may be useful to create highly available infrastructure, distributed across several datacenters.


    :param Sequence[str] datacenter_ids: (list) List of unique datacenter identifiers. **Deprecated**: Use `datacenters` attribute instead.
    :param Sequence[str] descriptions: (list) List of all datacenter descriptions. **Deprecated**: Use `datacenters` attribute instead.
    :param Sequence[str] names: (list) List of datacenter names. **Deprecated**: Use `datacenters` attribute instead.
    """
    __args__ = dict()
    __args__['datacenterIds'] = datacenter_ids
    __args__['descriptions'] = descriptions
    __args__['id'] = id
    __args__['names'] = names
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getDatacenters:getDatacenters', __args__, opts=opts, typ=GetDatacentersResult).value

    return AwaitableGetDatacentersResult(
        datacenter_ids=pulumi.get(__ret__, 'datacenter_ids'),
        datacenters=pulumi.get(__ret__, 'datacenters'),
        descriptions=pulumi.get(__ret__, 'descriptions'),
        id=pulumi.get(__ret__, 'id'),
        names=pulumi.get(__ret__, 'names'))
def get_datacenters_output(datacenter_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           descriptions: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           id: Optional[pulumi.Input[Optional[str]]] = None,
                           names: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDatacentersResult]:
    """
    Provides a list of available Hetzner Cloud Datacenters.
    This resource may be useful to create highly available infrastructure, distributed across several datacenters.


    :param Sequence[str] datacenter_ids: (list) List of unique datacenter identifiers. **Deprecated**: Use `datacenters` attribute instead.
    :param Sequence[str] descriptions: (list) List of all datacenter descriptions. **Deprecated**: Use `datacenters` attribute instead.
    :param Sequence[str] names: (list) List of datacenter names. **Deprecated**: Use `datacenters` attribute instead.
    """
    __args__ = dict()
    __args__['datacenterIds'] = datacenter_ids
    __args__['descriptions'] = descriptions
    __args__['id'] = id
    __args__['names'] = names
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('hcloud:index/getDatacenters:getDatacenters', __args__, opts=opts, typ=GetDatacentersResult)
    return __ret__.apply(lambda __response__: GetDatacentersResult(
        datacenter_ids=pulumi.get(__response__, 'datacenter_ids'),
        datacenters=pulumi.get(__response__, 'datacenters'),
        descriptions=pulumi.get(__response__, 'descriptions'),
        id=pulumi.get(__response__, 'id'),
        names=pulumi.get(__response__, 'names')))
