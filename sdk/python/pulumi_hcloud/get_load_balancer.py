# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetLoadBalancerResult',
    'AwaitableGetLoadBalancerResult',
    'get_load_balancer',
    'get_load_balancer_output',
]

@pulumi.output_type
class GetLoadBalancerResult:
    """
    A collection of values returned by getLoadBalancer.
    """
    def __init__(__self__, algorithms=None, delete_protection=None, id=None, ipv4=None, ipv6=None, labels=None, load_balancer_type=None, location=None, name=None, network_id=None, network_ip=None, network_zone=None, services=None, targets=None, with_selector=None):
        if algorithms and not isinstance(algorithms, list):
            raise TypeError("Expected argument 'algorithms' to be a list")
        pulumi.set(__self__, "algorithms", algorithms)
        if delete_protection and not isinstance(delete_protection, bool):
            raise TypeError("Expected argument 'delete_protection' to be a bool")
        pulumi.set(__self__, "delete_protection", delete_protection)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if ipv4 and not isinstance(ipv4, str):
            raise TypeError("Expected argument 'ipv4' to be a str")
        pulumi.set(__self__, "ipv4", ipv4)
        if ipv6 and not isinstance(ipv6, str):
            raise TypeError("Expected argument 'ipv6' to be a str")
        pulumi.set(__self__, "ipv6", ipv6)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if load_balancer_type and not isinstance(load_balancer_type, str):
            raise TypeError("Expected argument 'load_balancer_type' to be a str")
        pulumi.set(__self__, "load_balancer_type", load_balancer_type)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if network_id and not isinstance(network_id, int):
            raise TypeError("Expected argument 'network_id' to be a int")
        pulumi.set(__self__, "network_id", network_id)
        if network_ip and not isinstance(network_ip, str):
            raise TypeError("Expected argument 'network_ip' to be a str")
        pulumi.set(__self__, "network_ip", network_ip)
        if network_zone and not isinstance(network_zone, str):
            raise TypeError("Expected argument 'network_zone' to be a str")
        pulumi.set(__self__, "network_zone", network_zone)
        if services and not isinstance(services, list):
            raise TypeError("Expected argument 'services' to be a list")
        pulumi.set(__self__, "services", services)
        if targets and not isinstance(targets, list):
            raise TypeError("Expected argument 'targets' to be a list")
        pulumi.set(__self__, "targets", targets)
        if with_selector and not isinstance(with_selector, str):
            raise TypeError("Expected argument 'with_selector' to be a str")
        pulumi.set(__self__, "with_selector", with_selector)

    @property
    @pulumi.getter
    def algorithms(self) -> Sequence['outputs.GetLoadBalancerAlgorithmResult']:
        """
        (Optional) Configuration of the algorithm the Load Balancer use.
        """
        return pulumi.get(self, "algorithms")

    @property
    @pulumi.getter(name="deleteProtection")
    def delete_protection(self) -> bool:
        """
        (bool) Whether delete protection is enabled.
        """
        return pulumi.get(self, "delete_protection")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        (int) Unique ID of the Load Balancer.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ipv4(self) -> str:
        """
        (string) IPv4 Address of the Load Balancer.
        """
        return pulumi.get(self, "ipv4")

    @property
    @pulumi.getter
    def ipv6(self) -> str:
        """
        (string) IPv4 Address of the Load Balancer.
        """
        return pulumi.get(self, "ipv6")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        """
        (map) User-defined labels (key-value pairs) .
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="loadBalancerType")
    def load_balancer_type(self) -> str:
        """
        (string) Name of the Type of the Load Balancer.
        """
        return pulumi.get(self, "load_balancer_type")

    @property
    @pulumi.getter
    def location(self) -> str:
        """
        (string) Name of the location the Load Balancer is in.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        (string) Name of the Load Balancer.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkId")
    def network_id(self) -> int:
        """
        (int) ID of the first private network that this Load Balancer is connected to.
        """
        return pulumi.get(self, "network_id")

    @property
    @pulumi.getter(name="networkIp")
    def network_ip(self) -> str:
        """
        (string) IP of the Load Balancer in the first private network that it is connected to.
        """
        return pulumi.get(self, "network_ip")

    @property
    @pulumi.getter(name="networkZone")
    def network_zone(self) -> str:
        return pulumi.get(self, "network_zone")

    @property
    @pulumi.getter
    def services(self) -> Sequence['outputs.GetLoadBalancerServiceResult']:
        """
        (list) List of services a Load Balancer provides.
        """
        return pulumi.get(self, "services")

    @property
    @pulumi.getter
    def targets(self) -> Sequence['outputs.GetLoadBalancerTargetResult']:
        """
        (list) List of targets of the Load Balancer.
        """
        return pulumi.get(self, "targets")

    @property
    @pulumi.getter(name="withSelector")
    def with_selector(self) -> Optional[str]:
        return pulumi.get(self, "with_selector")


class AwaitableGetLoadBalancerResult(GetLoadBalancerResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLoadBalancerResult(
            algorithms=self.algorithms,
            delete_protection=self.delete_protection,
            id=self.id,
            ipv4=self.ipv4,
            ipv6=self.ipv6,
            labels=self.labels,
            load_balancer_type=self.load_balancer_type,
            location=self.location,
            name=self.name,
            network_id=self.network_id,
            network_ip=self.network_ip,
            network_zone=self.network_zone,
            services=self.services,
            targets=self.targets,
            with_selector=self.with_selector)


def get_load_balancer(id: Optional[int] = None,
                      name: Optional[str] = None,
                      with_selector: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLoadBalancerResult:
    """
    Provides details about a specific Hetzner Cloud Load Balancer.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    lb1 = hcloud.get_load_balancer(name="my-load-balancer")
    lb2 = hcloud.get_load_balancer(id=123)
    lb3 = hcloud.get_load_balancer(with_selector="key=value")
    ```


    :param int id: ID of the Load Balancer.
    :param str name: Name of the Load Balancer.
    :param str with_selector: Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    __args__['withSelector'] = with_selector
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getLoadBalancer:getLoadBalancer', __args__, opts=opts, typ=GetLoadBalancerResult).value

    return AwaitableGetLoadBalancerResult(
        algorithms=pulumi.get(__ret__, 'algorithms'),
        delete_protection=pulumi.get(__ret__, 'delete_protection'),
        id=pulumi.get(__ret__, 'id'),
        ipv4=pulumi.get(__ret__, 'ipv4'),
        ipv6=pulumi.get(__ret__, 'ipv6'),
        labels=pulumi.get(__ret__, 'labels'),
        load_balancer_type=pulumi.get(__ret__, 'load_balancer_type'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        network_id=pulumi.get(__ret__, 'network_id'),
        network_ip=pulumi.get(__ret__, 'network_ip'),
        network_zone=pulumi.get(__ret__, 'network_zone'),
        services=pulumi.get(__ret__, 'services'),
        targets=pulumi.get(__ret__, 'targets'),
        with_selector=pulumi.get(__ret__, 'with_selector'))


@_utilities.lift_output_func(get_load_balancer)
def get_load_balancer_output(id: Optional[pulumi.Input[Optional[int]]] = None,
                             name: Optional[pulumi.Input[Optional[str]]] = None,
                             with_selector: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLoadBalancerResult]:
    """
    Provides details about a specific Hetzner Cloud Load Balancer.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    lb1 = hcloud.get_load_balancer(name="my-load-balancer")
    lb2 = hcloud.get_load_balancer(id=123)
    lb3 = hcloud.get_load_balancer(with_selector="key=value")
    ```


    :param int id: ID of the Load Balancer.
    :param str name: Name of the Load Balancer.
    :param str with_selector: Label Selector. For more information about possible values, visit the [Hetzner Cloud Documentation](https://docs.hetzner.cloud/#overview-label-selector).
    """
    ...
