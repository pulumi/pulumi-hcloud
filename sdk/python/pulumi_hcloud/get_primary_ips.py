# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetPrimaryIpsResult',
    'AwaitableGetPrimaryIpsResult',
    'get_primary_ips',
    'get_primary_ips_output',
]

@pulumi.output_type
class GetPrimaryIpsResult:
    """
    A collection of values returned by getPrimaryIps.
    """
    def __init__(__self__, id=None, primary_ips=None, with_selector=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if primary_ips and not isinstance(primary_ips, list):
            raise TypeError("Expected argument 'primary_ips' to be a list")
        pulumi.set(__self__, "primary_ips", primary_ips)
        if with_selector and not isinstance(with_selector, str):
            raise TypeError("Expected argument 'with_selector' to be a str")
        pulumi.set(__self__, "with_selector", with_selector)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="primaryIps")
    def primary_ips(self) -> Sequence['outputs.GetPrimaryIpsPrimaryIpResult']:
        """
        (list) List of all matching primary ips. See `data.hcloud_primary_ip` for schema.
        """
        return pulumi.get(self, "primary_ips")

    @property
    @pulumi.getter(name="withSelector")
    def with_selector(self) -> Optional[str]:
        return pulumi.get(self, "with_selector")


class AwaitableGetPrimaryIpsResult(GetPrimaryIpsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrimaryIpsResult(
            id=self.id,
            primary_ips=self.primary_ips,
            with_selector=self.with_selector)


def get_primary_ips(with_selector: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrimaryIpsResult:
    """
    Provides details about multiple Hetzner Cloud Primary IPs.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    ip2 = hcloud.get_primary_ips(with_selector="key=value")
    ```


    :param str with_selector: [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
    """
    __args__ = dict()
    __args__['withSelector'] = with_selector
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getPrimaryIps:getPrimaryIps', __args__, opts=opts, typ=GetPrimaryIpsResult).value

    return AwaitableGetPrimaryIpsResult(
        id=pulumi.get(__ret__, 'id'),
        primary_ips=pulumi.get(__ret__, 'primary_ips'),
        with_selector=pulumi.get(__ret__, 'with_selector'))


@_utilities.lift_output_func(get_primary_ips)
def get_primary_ips_output(with_selector: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrimaryIpsResult]:
    """
    Provides details about multiple Hetzner Cloud Primary IPs.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    ip2 = hcloud.get_primary_ips(with_selector="key=value")
    ```


    :param str with_selector: [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
    """
    ...
