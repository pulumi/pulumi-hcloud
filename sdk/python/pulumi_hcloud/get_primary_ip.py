# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetPrimaryIpResult',
    'AwaitableGetPrimaryIpResult',
    'get_primary_ip',
    'get_primary_ip_output',
]

@pulumi.output_type
class GetPrimaryIpResult:
    """
    A collection of values returned by getPrimaryIp.
    """
    def __init__(__self__, assignee_id=None, assignee_type=None, auto_delete=None, datacenter=None, delete_protection=None, id=None, ip_address=None, ip_network=None, labels=None, name=None, type=None, with_selector=None):
        if assignee_id and not isinstance(assignee_id, int):
            raise TypeError("Expected argument 'assignee_id' to be a int")
        pulumi.set(__self__, "assignee_id", assignee_id)
        if assignee_type and not isinstance(assignee_type, str):
            raise TypeError("Expected argument 'assignee_type' to be a str")
        pulumi.set(__self__, "assignee_type", assignee_type)
        if auto_delete and not isinstance(auto_delete, bool):
            raise TypeError("Expected argument 'auto_delete' to be a bool")
        pulumi.set(__self__, "auto_delete", auto_delete)
        if datacenter and not isinstance(datacenter, str):
            raise TypeError("Expected argument 'datacenter' to be a str")
        pulumi.set(__self__, "datacenter", datacenter)
        if delete_protection and not isinstance(delete_protection, bool):
            raise TypeError("Expected argument 'delete_protection' to be a bool")
        pulumi.set(__self__, "delete_protection", delete_protection)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if ip_address and not isinstance(ip_address, str):
            raise TypeError("Expected argument 'ip_address' to be a str")
        pulumi.set(__self__, "ip_address", ip_address)
        if ip_network and not isinstance(ip_network, str):
            raise TypeError("Expected argument 'ip_network' to be a str")
        pulumi.set(__self__, "ip_network", ip_network)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if with_selector and not isinstance(with_selector, str):
            raise TypeError("Expected argument 'with_selector' to be a str")
        pulumi.set(__self__, "with_selector", with_selector)

    @property
    @pulumi.getter(name="assigneeId")
    def assignee_id(self) -> int:
        """
        (int) ID of the assigned resource.
        """
        return pulumi.get(self, "assignee_id")

    @property
    @pulumi.getter(name="assigneeType")
    def assignee_type(self) -> str:
        """
        (string) The type of the assigned resource.
        """
        return pulumi.get(self, "assignee_type")

    @property
    @pulumi.getter(name="autoDelete")
    def auto_delete(self) -> bool:
        """
        (bool) Whether auto delete is enabled.
        """
        return pulumi.get(self, "auto_delete")

    @property
    @pulumi.getter
    def datacenter(self) -> str:
        """
        (string) The datacenter name of the Primary IP.
        """
        return pulumi.get(self, "datacenter")

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
        (int) Unique ID of the Primary IP.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> str:
        """
        (string) IP Address of the Primary IP.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="ipNetwork")
    def ip_network(self) -> str:
        """
        (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
        """
        return pulumi.get(self, "ip_network")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        """
        (string) Description of the Primary IP.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        (string) Name of the Primary IP.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        (string) Type of the Primary IP.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="withSelector")
    def with_selector(self) -> Optional[str]:
        return pulumi.get(self, "with_selector")


class AwaitableGetPrimaryIpResult(GetPrimaryIpResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrimaryIpResult(
            assignee_id=self.assignee_id,
            assignee_type=self.assignee_type,
            auto_delete=self.auto_delete,
            datacenter=self.datacenter,
            delete_protection=self.delete_protection,
            id=self.id,
            ip_address=self.ip_address,
            ip_network=self.ip_network,
            labels=self.labels,
            name=self.name,
            type=self.type,
            with_selector=self.with_selector)


def get_primary_ip(assignee_id: Optional[int] = None,
                   id: Optional[int] = None,
                   ip_address: Optional[str] = None,
                   name: Optional[str] = None,
                   with_selector: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrimaryIpResult:
    """
    Provides details about a Hetzner Cloud Primary IP.

    This resource can be useful when you need to determine a Primary IP ID based on the IP address.

    Side note:

    If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created & attached.
    Currently, Primary IPs can be only attached to servers.

    ## Example Usage

    # Data Source: PrimaryIp

    Provides details about a Hetzner Cloud Primary IP.
    This resource can be useful when you need to determine a Primary IP ID based on the IP address.


    :param int assignee_id: (int) ID of the assigned resource.
    :param int id: ID of the Primary IP.
    :param str ip_address: IP address of the Primary IP.
    :param str name: Name of the Primary IP.
    :param str with_selector: [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
    """
    __args__ = dict()
    __args__['assigneeId'] = assignee_id
    __args__['id'] = id
    __args__['ipAddress'] = ip_address
    __args__['name'] = name
    __args__['withSelector'] = with_selector
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getPrimaryIp:getPrimaryIp', __args__, opts=opts, typ=GetPrimaryIpResult).value

    return AwaitableGetPrimaryIpResult(
        assignee_id=pulumi.get(__ret__, 'assignee_id'),
        assignee_type=pulumi.get(__ret__, 'assignee_type'),
        auto_delete=pulumi.get(__ret__, 'auto_delete'),
        datacenter=pulumi.get(__ret__, 'datacenter'),
        delete_protection=pulumi.get(__ret__, 'delete_protection'),
        id=pulumi.get(__ret__, 'id'),
        ip_address=pulumi.get(__ret__, 'ip_address'),
        ip_network=pulumi.get(__ret__, 'ip_network'),
        labels=pulumi.get(__ret__, 'labels'),
        name=pulumi.get(__ret__, 'name'),
        type=pulumi.get(__ret__, 'type'),
        with_selector=pulumi.get(__ret__, 'with_selector'))


@_utilities.lift_output_func(get_primary_ip)
def get_primary_ip_output(assignee_id: Optional[pulumi.Input[Optional[int]]] = None,
                          id: Optional[pulumi.Input[Optional[int]]] = None,
                          ip_address: Optional[pulumi.Input[Optional[str]]] = None,
                          name: Optional[pulumi.Input[Optional[str]]] = None,
                          with_selector: Optional[pulumi.Input[Optional[str]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrimaryIpResult]:
    """
    Provides details about a Hetzner Cloud Primary IP.

    This resource can be useful when you need to determine a Primary IP ID based on the IP address.

    Side note:

    If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created & attached.
    Currently, Primary IPs can be only attached to servers.

    ## Example Usage

    # Data Source: PrimaryIp

    Provides details about a Hetzner Cloud Primary IP.
    This resource can be useful when you need to determine a Primary IP ID based on the IP address.


    :param int assignee_id: (int) ID of the assigned resource.
    :param int id: ID of the Primary IP.
    :param str ip_address: IP address of the Primary IP.
    :param str name: Name of the Primary IP.
    :param str with_selector: [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
    """
    ...
