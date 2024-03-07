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
    'GetNetworksResult',
    'AwaitableGetNetworksResult',
    'get_networks',
    'get_networks_output',
]

@pulumi.output_type
class GetNetworksResult:
    """
    A collection of values returned by getNetworks.
    """
    def __init__(__self__, id=None, networks=None, with_selector=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if networks and not isinstance(networks, list):
            raise TypeError("Expected argument 'networks' to be a list")
        pulumi.set(__self__, "networks", networks)
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
    @pulumi.getter
    def networks(self) -> Sequence['outputs.GetNetworksNetworkResult']:
        """
        (list) List of all matching networks. See `data.hcloud_network` for schema.
        """
        return pulumi.get(self, "networks")

    @property
    @pulumi.getter(name="withSelector")
    def with_selector(self) -> Optional[str]:
        return pulumi.get(self, "with_selector")


class AwaitableGetNetworksResult(GetNetworksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworksResult(
            id=self.id,
            networks=self.networks,
            with_selector=self.with_selector)


def get_networks(with_selector: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworksResult:
    """
    Provides details about multiple Hetzner Cloud Networks.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    network2 = hcloud.get_network()
    network3 = hcloud.get_network(with_selector="key=value")
    ```
    <!--End PulumiCodeChooser -->


    :param str with_selector: [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
    """
    __args__ = dict()
    __args__['withSelector'] = with_selector
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getNetworks:getNetworks', __args__, opts=opts, typ=GetNetworksResult).value

    return AwaitableGetNetworksResult(
        id=pulumi.get(__ret__, 'id'),
        networks=pulumi.get(__ret__, 'networks'),
        with_selector=pulumi.get(__ret__, 'with_selector'))


@_utilities.lift_output_func(get_networks)
def get_networks_output(with_selector: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNetworksResult]:
    """
    Provides details about multiple Hetzner Cloud Networks.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    network2 = hcloud.get_network()
    network3 = hcloud.get_network(with_selector="key=value")
    ```
    <!--End PulumiCodeChooser -->


    :param str with_selector: [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
    """
    ...
