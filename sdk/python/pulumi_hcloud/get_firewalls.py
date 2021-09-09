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
    'GetFirewallsResult',
    'AwaitableGetFirewallsResult',
    'get_firewalls',
]

@pulumi.output_type
class GetFirewallsResult:
    """
    A collection of values returned by getFirewalls.
    """
    def __init__(__self__, firewalls=None, id=None, most_recent=None, with_selector=None):
        if firewalls and not isinstance(firewalls, list):
            raise TypeError("Expected argument 'firewalls' to be a list")
        pulumi.set(__self__, "firewalls", firewalls)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if most_recent and not isinstance(most_recent, bool):
            raise TypeError("Expected argument 'most_recent' to be a bool")
        pulumi.set(__self__, "most_recent", most_recent)
        if with_selector and not isinstance(with_selector, str):
            raise TypeError("Expected argument 'with_selector' to be a str")
        pulumi.set(__self__, "with_selector", with_selector)

    @property
    @pulumi.getter
    def firewalls(self) -> Sequence['outputs.GetFirewallsFirewallResult']:
        """
        (list) List of all matching firewalls. See `data.hcloud_firewall` for schema.
        """
        return pulumi.get(self, "firewalls")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mostRecent")
    def most_recent(self) -> Optional[bool]:
        return pulumi.get(self, "most_recent")

    @property
    @pulumi.getter(name="withSelector")
    def with_selector(self) -> Optional[str]:
        return pulumi.get(self, "with_selector")


class AwaitableGetFirewallsResult(GetFirewallsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFirewallsResult(
            firewalls=self.firewalls,
            id=self.id,
            most_recent=self.most_recent,
            with_selector=self.with_selector)


def get_firewalls(most_recent: Optional[bool] = None,
                  with_selector: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFirewallsResult:
    """
    Provides details about multiple Hetzner Cloud Firewall.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    sample_firewall1 = hcloud.get_firewalls(with_selector="key=value")
    ```


    :param bool most_recent: Sorts list by date.
    :param str with_selector: [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
    """
    __args__ = dict()
    __args__['mostRecent'] = most_recent
    __args__['withSelector'] = with_selector
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('hcloud:index/getFirewalls:getFirewalls', __args__, opts=opts, typ=GetFirewallsResult).value

    return AwaitableGetFirewallsResult(
        firewalls=__ret__.firewalls,
        id=__ret__.id,
        most_recent=__ret__.most_recent,
        with_selector=__ret__.with_selector)