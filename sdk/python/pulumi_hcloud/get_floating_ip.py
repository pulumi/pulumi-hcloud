# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetFloatingIpResult',
    'AwaitableGetFloatingIpResult',
    'get_floating_ip',
    'get_floating_ip_output',
]

@pulumi.output_type
class GetFloatingIpResult:
    """
    A collection of values returned by getFloatingIp.
    """
    def __init__(__self__, delete_protection=None, description=None, home_location=None, id=None, ip_address=None, ip_network=None, labels=None, name=None, selector=None, server_id=None, type=None, with_selector=None):
        if delete_protection and not isinstance(delete_protection, bool):
            raise TypeError("Expected argument 'delete_protection' to be a bool")
        pulumi.set(__self__, "delete_protection", delete_protection)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if home_location and not isinstance(home_location, str):
            raise TypeError("Expected argument 'home_location' to be a str")
        pulumi.set(__self__, "home_location", home_location)
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
        if selector and not isinstance(selector, str):
            raise TypeError("Expected argument 'selector' to be a str")
        pulumi.set(__self__, "selector", selector)
        if server_id and not isinstance(server_id, int):
            raise TypeError("Expected argument 'server_id' to be a int")
        pulumi.set(__self__, "server_id", server_id)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if with_selector and not isinstance(with_selector, str):
            raise TypeError("Expected argument 'with_selector' to be a str")
        pulumi.set(__self__, "with_selector", with_selector)

    @property
    @pulumi.getter(name="deleteProtection")
    def delete_protection(self) -> bool:
        """
        (bool) Whether delete protection is enabled.
        """
        return pulumi.get(self, "delete_protection")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        (string) Description of the Floating IP.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="homeLocation")
    def home_location(self) -> str:
        """
        (string) Home location.
        """
        return pulumi.get(self, "home_location")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        (int) Unique ID of the Floating IP.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> str:
        """
        (string) IP Address of the Floating IP.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="ipNetwork")
    def ip_network(self) -> str:
        """
        (string) IPv6 subnet. (Only set if `type` is `ipv6`)
        """
        return pulumi.get(self, "ip_network")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Any]:
        """
        (map) User-defined labels (key-value pairs).
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        (string) Name of the Floating IP.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def selector(self) -> Optional[str]:
        warnings.warn("""Please use the with_selector property instead.""", DeprecationWarning)
        pulumi.log.warn("""selector is deprecated: Please use the with_selector property instead.""")

        return pulumi.get(self, "selector")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> int:
        """
        (int) Server to assign the Floating IP is assigned to.
        """
        return pulumi.get(self, "server_id")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        (string) Type of the Floating IP.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="withSelector")
    def with_selector(self) -> Optional[str]:
        return pulumi.get(self, "with_selector")


class AwaitableGetFloatingIpResult(GetFloatingIpResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFloatingIpResult(
            delete_protection=self.delete_protection,
            description=self.description,
            home_location=self.home_location,
            id=self.id,
            ip_address=self.ip_address,
            ip_network=self.ip_network,
            labels=self.labels,
            name=self.name,
            selector=self.selector,
            server_id=self.server_id,
            type=self.type,
            with_selector=self.with_selector)


def get_floating_ip(id: Optional[int] = None,
                    ip_address: Optional[str] = None,
                    name: Optional[str] = None,
                    selector: Optional[str] = None,
                    with_selector: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFloatingIpResult:
    """
    Provides details about a Hetzner Cloud Floating IP.

    This resource can be useful when you need to determine a Floating IP ID based on the IP address.

    ## Example Usage

    # Data Source: FloatingIp
    Provides details about a Hetzner Cloud Floating IP.
    This resource can be useful when you need to determine a Floating IP ID based on the IP address.

    ### Additional Examples
    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    ip1 = hcloud.get_floating_ip(ip_address="1.2.3.4")
    ip2 = hcloud.get_floating_ip(with_selector="key=value")
    main = []
    for range in [{"value": i} for i in range(0, var.counter)]:
        main.append(hcloud.FloatingIpAssignment(f"main-{range['value']}",
            floating_ip_id=ip1.id,
            server_id=hcloud_server["main"]["id"]))
    ```
    <!--End PulumiCodeChooser -->


    :param int id: ID of the Floating IP.
    :param str ip_address: IP address of the Floating IP.
    :param str name: Name of the Floating IP.
    :param str with_selector: [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['ipAddress'] = ip_address
    __args__['name'] = name
    __args__['selector'] = selector
    __args__['withSelector'] = with_selector
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('hcloud:index/getFloatingIp:getFloatingIp', __args__, opts=opts, typ=GetFloatingIpResult).value

    return AwaitableGetFloatingIpResult(
        delete_protection=pulumi.get(__ret__, 'delete_protection'),
        description=pulumi.get(__ret__, 'description'),
        home_location=pulumi.get(__ret__, 'home_location'),
        id=pulumi.get(__ret__, 'id'),
        ip_address=pulumi.get(__ret__, 'ip_address'),
        ip_network=pulumi.get(__ret__, 'ip_network'),
        labels=pulumi.get(__ret__, 'labels'),
        name=pulumi.get(__ret__, 'name'),
        selector=pulumi.get(__ret__, 'selector'),
        server_id=pulumi.get(__ret__, 'server_id'),
        type=pulumi.get(__ret__, 'type'),
        with_selector=pulumi.get(__ret__, 'with_selector'))


@_utilities.lift_output_func(get_floating_ip)
def get_floating_ip_output(id: Optional[pulumi.Input[Optional[int]]] = None,
                           ip_address: Optional[pulumi.Input[Optional[str]]] = None,
                           name: Optional[pulumi.Input[Optional[str]]] = None,
                           selector: Optional[pulumi.Input[Optional[str]]] = None,
                           with_selector: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFloatingIpResult]:
    """
    Provides details about a Hetzner Cloud Floating IP.

    This resource can be useful when you need to determine a Floating IP ID based on the IP address.

    ## Example Usage

    # Data Source: FloatingIp
    Provides details about a Hetzner Cloud Floating IP.
    This resource can be useful when you need to determine a Floating IP ID based on the IP address.

    ### Additional Examples
    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_hcloud as hcloud

    ip1 = hcloud.get_floating_ip(ip_address="1.2.3.4")
    ip2 = hcloud.get_floating_ip(with_selector="key=value")
    main = []
    for range in [{"value": i} for i in range(0, var.counter)]:
        main.append(hcloud.FloatingIpAssignment(f"main-{range['value']}",
            floating_ip_id=ip1.id,
            server_id=hcloud_server["main"]["id"]))
    ```
    <!--End PulumiCodeChooser -->


    :param int id: ID of the Floating IP.
    :param str ip_address: IP address of the Floating IP.
    :param str name: Name of the Floating IP.
    :param str with_selector: [Label selector](https://docs.hetzner.cloud/#overview-label-selector)
    """
    ...
