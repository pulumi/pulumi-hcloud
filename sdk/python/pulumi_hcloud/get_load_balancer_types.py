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
    'GetLoadBalancerTypesResult',
    'AwaitableGetLoadBalancerTypesResult',
    'get_load_balancer_types',
    'get_load_balancer_types_output',
]

@pulumi.output_type
class GetLoadBalancerTypesResult:
    """
    A collection of values returned by getLoadBalancerTypes.
    """
    def __init__(__self__, id=None, load_balancer_types=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if load_balancer_types and not isinstance(load_balancer_types, list):
            raise TypeError("Expected argument 'load_balancer_types' to be a list")
        pulumi.set(__self__, "load_balancer_types", load_balancer_types)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of this resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="loadBalancerTypes")
    def load_balancer_types(self) -> Sequence['outputs.GetLoadBalancerTypesLoadBalancerTypeResult']:
        return pulumi.get(self, "load_balancer_types")


class AwaitableGetLoadBalancerTypesResult(GetLoadBalancerTypesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLoadBalancerTypesResult(
            id=self.id,
            load_balancer_types=self.load_balancer_types)


def get_load_balancer_types(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLoadBalancerTypesResult:
    """
    Provides a list of available Hetzner Cloud Load Balancer Types.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    all = hcloud.get_load_balancer_types()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getLoadBalancerTypes:getLoadBalancerTypes', __args__, opts=opts, typ=GetLoadBalancerTypesResult).value

    return AwaitableGetLoadBalancerTypesResult(
        id=pulumi.get(__ret__, 'id'),
        load_balancer_types=pulumi.get(__ret__, 'load_balancer_types'))
def get_load_balancer_types_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLoadBalancerTypesResult]:
    """
    Provides a list of available Hetzner Cloud Load Balancer Types.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    all = hcloud.get_load_balancer_types()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('hcloud:index/getLoadBalancerTypes:getLoadBalancerTypes', __args__, opts=opts, typ=GetLoadBalancerTypesResult)
    return __ret__.apply(lambda __response__: GetLoadBalancerTypesResult(
        id=pulumi.get(__response__, 'id'),
        load_balancer_types=pulumi.get(__response__, 'load_balancer_types')))
