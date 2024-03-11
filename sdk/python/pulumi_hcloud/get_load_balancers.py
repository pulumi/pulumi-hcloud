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
    'GetLoadBalancersResult',
    'AwaitableGetLoadBalancersResult',
    'get_load_balancers',
    'get_load_balancers_output',
]

@pulumi.output_type
class GetLoadBalancersResult:
    """
    A collection of values returned by getLoadBalancers.
    """
    def __init__(__self__, id=None, load_balancers=None, with_selector=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if load_balancers and not isinstance(load_balancers, list):
            raise TypeError("Expected argument 'load_balancers' to be a list")
        pulumi.set(__self__, "load_balancers", load_balancers)
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
    @pulumi.getter(name="loadBalancers")
    def load_balancers(self) -> Sequence['outputs.GetLoadBalancersLoadBalancerResult']:
        """
        (list) List of all matching load balancers. See `data.hcloud_load_balancer` for schema.
        """
        return pulumi.get(self, "load_balancers")

    @property
    @pulumi.getter(name="withSelector")
    def with_selector(self) -> Optional[str]:
        return pulumi.get(self, "with_selector")


class AwaitableGetLoadBalancersResult(GetLoadBalancersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLoadBalancersResult(
            id=self.id,
            load_balancers=self.load_balancers,
            with_selector=self.with_selector)


def get_load_balancers(with_selector: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLoadBalancersResult:
    """
    Provides details about multiple Hetzner Cloud Load Balancers.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    lb2 = hcloud.get_load_balancers()
    lb3 = hcloud.get_load_balancers(with_selector="key=value")
    ```
    <!--End PulumiCodeChooser -->


    :param str with_selector: [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
    """
    __args__ = dict()
    __args__['withSelector'] = with_selector
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getLoadBalancers:getLoadBalancers', __args__, opts=opts, typ=GetLoadBalancersResult).value

    return AwaitableGetLoadBalancersResult(
        id=pulumi.get(__ret__, 'id'),
        load_balancers=pulumi.get(__ret__, 'load_balancers'),
        with_selector=pulumi.get(__ret__, 'with_selector'))


@_utilities.lift_output_func(get_load_balancers)
def get_load_balancers_output(with_selector: Optional[pulumi.Input[Optional[str]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLoadBalancersResult]:
    """
    Provides details about multiple Hetzner Cloud Load Balancers.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    lb2 = hcloud.get_load_balancers()
    lb3 = hcloud.get_load_balancers(with_selector="key=value")
    ```
    <!--End PulumiCodeChooser -->


    :param str with_selector: [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
    """
    ...
