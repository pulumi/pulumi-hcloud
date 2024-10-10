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
    'GetLocationsResult',
    'AwaitableGetLocationsResult',
    'get_locations',
    'get_locations_output',
]

@pulumi.output_type
class GetLocationsResult:
    """
    A collection of values returned by getLocations.
    """
    def __init__(__self__, descriptions=None, id=None, location_ids=None, locations=None, names=None):
        if descriptions and not isinstance(descriptions, list):
            raise TypeError("Expected argument 'descriptions' to be a list")
        pulumi.set(__self__, "descriptions", descriptions)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location_ids and not isinstance(location_ids, list):
            raise TypeError("Expected argument 'location_ids' to be a list")
        pulumi.set(__self__, "location_ids", location_ids)
        if locations and not isinstance(locations, list):
            raise TypeError("Expected argument 'locations' to be a list")
        pulumi.set(__self__, "locations", locations)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)

    @property
    @pulumi.getter
    @_utilities.deprecated("""Use locations list instead""")
    def descriptions(self) -> Optional[Sequence[str]]:
        """
        (list) List of all location descriptions. **Deprecated**: Use `locations` attribute instead.
        """
        return pulumi.get(self, "descriptions")

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="locationIds")
    @_utilities.deprecated("""Use locations list instead""")
    def location_ids(self) -> Optional[Sequence[str]]:
        """
        (list) List of unique location identifiers. **Deprecated**: Use `locations` attribute instead.
        """
        return pulumi.get(self, "location_ids")

    @property
    @pulumi.getter
    def locations(self) -> Sequence['outputs.GetLocationsLocationResult']:
        """
        (list) List of all locations. See `data.hcloud_location` for schema.
        """
        return pulumi.get(self, "locations")

    @property
    @pulumi.getter
    @_utilities.deprecated("""Use locations list instead""")
    def names(self) -> Optional[Sequence[str]]:
        """
        (list) List of location names. **Deprecated**: Use `locations` attribute instead.
        """
        return pulumi.get(self, "names")


class AwaitableGetLocationsResult(GetLocationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLocationsResult(
            descriptions=self.descriptions,
            id=self.id,
            location_ids=self.location_ids,
            locations=self.locations,
            names=self.names)


def get_locations(descriptions: Optional[Sequence[str]] = None,
                  id: Optional[str] = None,
                  location_ids: Optional[Sequence[str]] = None,
                  names: Optional[Sequence[str]] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLocationsResult:
    """
    Provides a list of available Hetzner Cloud Locations.
    This resource may be useful to create highly available infrastructure, distributed across several locations.


    :param Sequence[str] descriptions: (list) List of all location descriptions. **Deprecated**: Use `locations` attribute instead.
    :param Sequence[str] location_ids: (list) List of unique location identifiers. **Deprecated**: Use `locations` attribute instead.
    :param Sequence[str] names: (list) List of location names. **Deprecated**: Use `locations` attribute instead.
    """
    __args__ = dict()
    __args__['descriptions'] = descriptions
    __args__['id'] = id
    __args__['locationIds'] = location_ids
    __args__['names'] = names
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getLocations:getLocations', __args__, opts=opts, typ=GetLocationsResult).value

    return AwaitableGetLocationsResult(
        descriptions=pulumi.get(__ret__, 'descriptions'),
        id=pulumi.get(__ret__, 'id'),
        location_ids=pulumi.get(__ret__, 'location_ids'),
        locations=pulumi.get(__ret__, 'locations'),
        names=pulumi.get(__ret__, 'names'))
def get_locations_output(descriptions: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                         id: Optional[pulumi.Input[Optional[str]]] = None,
                         location_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                         names: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLocationsResult]:
    """
    Provides a list of available Hetzner Cloud Locations.
    This resource may be useful to create highly available infrastructure, distributed across several locations.


    :param Sequence[str] descriptions: (list) List of all location descriptions. **Deprecated**: Use `locations` attribute instead.
    :param Sequence[str] location_ids: (list) List of unique location identifiers. **Deprecated**: Use `locations` attribute instead.
    :param Sequence[str] names: (list) List of location names. **Deprecated**: Use `locations` attribute instead.
    """
    __args__ = dict()
    __args__['descriptions'] = descriptions
    __args__['id'] = id
    __args__['locationIds'] = location_ids
    __args__['names'] = names
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('hcloud:index/getLocations:getLocations', __args__, opts=opts, typ=GetLocationsResult)
    return __ret__.apply(lambda __response__: GetLocationsResult(
        descriptions=pulumi.get(__response__, 'descriptions'),
        id=pulumi.get(__response__, 'id'),
        location_ids=pulumi.get(__response__, 'location_ids'),
        locations=pulumi.get(__response__, 'locations'),
        names=pulumi.get(__response__, 'names')))
