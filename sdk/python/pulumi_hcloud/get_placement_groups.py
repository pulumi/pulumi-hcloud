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
from . import outputs

__all__ = [
    'GetPlacementGroupsResult',
    'AwaitableGetPlacementGroupsResult',
    'get_placement_groups',
    'get_placement_groups_output',
]

@pulumi.output_type
class GetPlacementGroupsResult:
    """
    A collection of values returned by getPlacementGroups.
    """
    def __init__(__self__, id=None, most_recent=None, placement_groups=None, with_selector=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if most_recent and not isinstance(most_recent, bool):
            raise TypeError("Expected argument 'most_recent' to be a bool")
        pulumi.set(__self__, "most_recent", most_recent)
        if placement_groups and not isinstance(placement_groups, list):
            raise TypeError("Expected argument 'placement_groups' to be a list")
        pulumi.set(__self__, "placement_groups", placement_groups)
        if with_selector and not isinstance(with_selector, str):
            raise TypeError("Expected argument 'with_selector' to be a str")
        pulumi.set(__self__, "with_selector", with_selector)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="mostRecent")
    def most_recent(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "most_recent")

    @_builtins.property
    @pulumi.getter(name="placementGroups")
    def placement_groups(self) -> Sequence['outputs.GetPlacementGroupsPlacementGroupResult']:
        """
        (list) List of all matching placement groups. See `data.hcloud_placement_group` for schema.
        """
        return pulumi.get(self, "placement_groups")

    @_builtins.property
    @pulumi.getter(name="withSelector")
    def with_selector(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "with_selector")


class AwaitableGetPlacementGroupsResult(GetPlacementGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPlacementGroupsResult(
            id=self.id,
            most_recent=self.most_recent,
            placement_groups=self.placement_groups,
            with_selector=self.with_selector)


def get_placement_groups(most_recent: Optional[_builtins.bool] = None,
                         with_selector: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPlacementGroupsResult:
    """
    Provides details about multiple Hetzner Cloud Placement Groups.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    sample_placement_group1 = hcloud.get_placement_groups()
    sample_placement_group2 = hcloud.get_placement_groups(with_selector="key=value")
    ```


    :param _builtins.bool most_recent: Sorts list by date.
    :param _builtins.str with_selector: [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
    """
    __args__ = dict()
    __args__['mostRecent'] = most_recent
    __args__['withSelector'] = with_selector
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getPlacementGroups:getPlacementGroups', __args__, opts=opts, typ=GetPlacementGroupsResult).value

    return AwaitableGetPlacementGroupsResult(
        id=pulumi.get(__ret__, 'id'),
        most_recent=pulumi.get(__ret__, 'most_recent'),
        placement_groups=pulumi.get(__ret__, 'placement_groups'),
        with_selector=pulumi.get(__ret__, 'with_selector'))
def get_placement_groups_output(most_recent: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                with_selector: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPlacementGroupsResult]:
    """
    Provides details about multiple Hetzner Cloud Placement Groups.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    sample_placement_group1 = hcloud.get_placement_groups()
    sample_placement_group2 = hcloud.get_placement_groups(with_selector="key=value")
    ```


    :param _builtins.bool most_recent: Sorts list by date.
    :param _builtins.str with_selector: [Label selector](https://docs.hetzner.cloud/reference/cloud#label-selector)
    """
    __args__ = dict()
    __args__['mostRecent'] = most_recent
    __args__['withSelector'] = with_selector
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('hcloud:index/getPlacementGroups:getPlacementGroups', __args__, opts=opts, typ=GetPlacementGroupsResult)
    return __ret__.apply(lambda __response__: GetPlacementGroupsResult(
        id=pulumi.get(__response__, 'id'),
        most_recent=pulumi.get(__response__, 'most_recent'),
        placement_groups=pulumi.get(__response__, 'placement_groups'),
        with_selector=pulumi.get(__response__, 'with_selector')))
