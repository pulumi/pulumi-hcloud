# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetServerTypesResult',
    'AwaitableGetServerTypesResult',
    'get_server_types',
    'get_server_types_output',
]

@pulumi.output_type
class GetServerTypesResult:
    """
    A collection of values returned by getServerTypes.
    """
    def __init__(__self__, descriptions=None, id=None, names=None, server_type_ids=None, server_types=None):
        if descriptions and not isinstance(descriptions, list):
            raise TypeError("Expected argument 'descriptions' to be a list")
        if descriptions is not None:
            warnings.warn("""Use server_types list instead""", DeprecationWarning)
            pulumi.log.warn("""descriptions is deprecated: Use server_types list instead""")

        pulumi.set(__self__, "descriptions", descriptions)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        if names is not None:
            warnings.warn("""Use server_types list instead""", DeprecationWarning)
            pulumi.log.warn("""names is deprecated: Use server_types list instead""")

        pulumi.set(__self__, "names", names)
        if server_type_ids and not isinstance(server_type_ids, list):
            raise TypeError("Expected argument 'server_type_ids' to be a list")
        if server_type_ids is not None:
            warnings.warn("""Use server_types list instead""", DeprecationWarning)
            pulumi.log.warn("""server_type_ids is deprecated: Use server_types list instead""")

        pulumi.set(__self__, "server_type_ids", server_type_ids)
        if server_types and not isinstance(server_types, list):
            raise TypeError("Expected argument 'server_types' to be a list")
        pulumi.set(__self__, "server_types", server_types)

    @property
    @pulumi.getter
    def descriptions(self) -> Sequence[str]:
        return pulumi.get(self, "descriptions")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="serverTypeIds")
    def server_type_ids(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "server_type_ids")

    @property
    @pulumi.getter(name="serverTypes")
    def server_types(self) -> Sequence['outputs.GetServerTypesServerTypeResult']:
        """
        (list) List of all server types. See `data.hcloud_type` for schema.
        """
        return pulumi.get(self, "server_types")


class AwaitableGetServerTypesResult(GetServerTypesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServerTypesResult(
            descriptions=self.descriptions,
            id=self.id,
            names=self.names,
            server_type_ids=self.server_type_ids,
            server_types=self.server_types)


def get_server_types(server_type_ids: Optional[Sequence[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServerTypesResult:
    """
    Provides a list of available Hetzner Cloud Server Types.
    """
    __args__ = dict()
    __args__['serverTypeIds'] = server_type_ids
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('hcloud:index/getServerTypes:getServerTypes', __args__, opts=opts, typ=GetServerTypesResult).value

    return AwaitableGetServerTypesResult(
        descriptions=__ret__.descriptions,
        id=__ret__.id,
        names=__ret__.names,
        server_type_ids=__ret__.server_type_ids,
        server_types=__ret__.server_types)


@_utilities.lift_output_func(get_server_types)
def get_server_types_output(server_type_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServerTypesResult]:
    """
    Provides a list of available Hetzner Cloud Server Types.
    """
    ...
