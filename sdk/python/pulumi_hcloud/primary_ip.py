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

__all__ = ['PrimaryIpArgs', 'PrimaryIp']

@pulumi.input_type
class PrimaryIpArgs:
    def __init__(__self__, *,
                 assignee_type: pulumi.Input[str],
                 auto_delete: pulumi.Input[bool],
                 type: pulumi.Input[str],
                 assignee_id: Optional[pulumi.Input[int]] = None,
                 datacenter: Optional[pulumi.Input[str]] = None,
                 delete_protection: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PrimaryIp resource.
        :param pulumi.Input[str] assignee_type: The type of the assigned resource. Currently supported: `server`
        :param pulumi.Input[bool] auto_delete: Whether auto delete is enabled.
               `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
        :param pulumi.Input[str] type: Type of the Primary IP. `ipv4` or `ipv6`
        :param pulumi.Input[int] assignee_id: ID of the assigned resource
        :param pulumi.Input[str] datacenter: The datacenter name to create the resource in.
        :param pulumi.Input[bool] delete_protection: Whether delete protection is enabled. See "Delete Protection" in the Provider Docs for details.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Description of the Primary IP.
        :param pulumi.Input[str] name: Name of the Primary IP.
        """
        pulumi.set(__self__, "assignee_type", assignee_type)
        pulumi.set(__self__, "auto_delete", auto_delete)
        pulumi.set(__self__, "type", type)
        if assignee_id is not None:
            pulumi.set(__self__, "assignee_id", assignee_id)
        if datacenter is not None:
            pulumi.set(__self__, "datacenter", datacenter)
        if delete_protection is not None:
            pulumi.set(__self__, "delete_protection", delete_protection)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="assigneeType")
    def assignee_type(self) -> pulumi.Input[str]:
        """
        The type of the assigned resource. Currently supported: `server`
        """
        return pulumi.get(self, "assignee_type")

    @assignee_type.setter
    def assignee_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "assignee_type", value)

    @property
    @pulumi.getter(name="autoDelete")
    def auto_delete(self) -> pulumi.Input[bool]:
        """
        Whether auto delete is enabled.
        `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
        """
        return pulumi.get(self, "auto_delete")

    @auto_delete.setter
    def auto_delete(self, value: pulumi.Input[bool]):
        pulumi.set(self, "auto_delete", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of the Primary IP. `ipv4` or `ipv6`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="assigneeId")
    def assignee_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the assigned resource
        """
        return pulumi.get(self, "assignee_id")

    @assignee_id.setter
    def assignee_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "assignee_id", value)

    @property
    @pulumi.getter
    def datacenter(self) -> Optional[pulumi.Input[str]]:
        """
        The datacenter name to create the resource in.
        """
        return pulumi.get(self, "datacenter")

    @datacenter.setter
    def datacenter(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datacenter", value)

    @property
    @pulumi.getter(name="deleteProtection")
    def delete_protection(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether delete protection is enabled. See "Delete Protection" in the Provider Docs for details.
        """
        return pulumi.get(self, "delete_protection")

    @delete_protection.setter
    def delete_protection(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_protection", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Description of the Primary IP.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Primary IP.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _PrimaryIpState:
    def __init__(__self__, *,
                 assignee_id: Optional[pulumi.Input[int]] = None,
                 assignee_type: Optional[pulumi.Input[str]] = None,
                 auto_delete: Optional[pulumi.Input[bool]] = None,
                 datacenter: Optional[pulumi.Input[str]] = None,
                 delete_protection: Optional[pulumi.Input[bool]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 ip_network: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PrimaryIp resources.
        :param pulumi.Input[int] assignee_id: ID of the assigned resource
        :param pulumi.Input[str] assignee_type: The type of the assigned resource. Currently supported: `server`
        :param pulumi.Input[bool] auto_delete: Whether auto delete is enabled.
               `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
        :param pulumi.Input[str] datacenter: The datacenter name to create the resource in.
        :param pulumi.Input[bool] delete_protection: Whether delete protection is enabled. See "Delete Protection" in the Provider Docs for details.
        :param pulumi.Input[str] ip_address: (string) IP Address of the Primary IP.
        :param pulumi.Input[str] ip_network: (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Description of the Primary IP.
        :param pulumi.Input[str] name: Name of the Primary IP.
        :param pulumi.Input[str] type: Type of the Primary IP. `ipv4` or `ipv6`
        """
        if assignee_id is not None:
            pulumi.set(__self__, "assignee_id", assignee_id)
        if assignee_type is not None:
            pulumi.set(__self__, "assignee_type", assignee_type)
        if auto_delete is not None:
            pulumi.set(__self__, "auto_delete", auto_delete)
        if datacenter is not None:
            pulumi.set(__self__, "datacenter", datacenter)
        if delete_protection is not None:
            pulumi.set(__self__, "delete_protection", delete_protection)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if ip_network is not None:
            pulumi.set(__self__, "ip_network", ip_network)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="assigneeId")
    def assignee_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the assigned resource
        """
        return pulumi.get(self, "assignee_id")

    @assignee_id.setter
    def assignee_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "assignee_id", value)

    @property
    @pulumi.getter(name="assigneeType")
    def assignee_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the assigned resource. Currently supported: `server`
        """
        return pulumi.get(self, "assignee_type")

    @assignee_type.setter
    def assignee_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "assignee_type", value)

    @property
    @pulumi.getter(name="autoDelete")
    def auto_delete(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether auto delete is enabled.
        `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
        """
        return pulumi.get(self, "auto_delete")

    @auto_delete.setter
    def auto_delete(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_delete", value)

    @property
    @pulumi.getter
    def datacenter(self) -> Optional[pulumi.Input[str]]:
        """
        The datacenter name to create the resource in.
        """
        return pulumi.get(self, "datacenter")

    @datacenter.setter
    def datacenter(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datacenter", value)

    @property
    @pulumi.getter(name="deleteProtection")
    def delete_protection(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether delete protection is enabled. See "Delete Protection" in the Provider Docs for details.
        """
        return pulumi.get(self, "delete_protection")

    @delete_protection.setter
    def delete_protection(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_protection", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        (string) IP Address of the Primary IP.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter(name="ipNetwork")
    def ip_network(self) -> Optional[pulumi.Input[str]]:
        """
        (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
        """
        return pulumi.get(self, "ip_network")

    @ip_network.setter
    def ip_network(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_network", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Description of the Primary IP.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Primary IP.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the Primary IP. `ipv4` or `ipv6`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class PrimaryIp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 assignee_id: Optional[pulumi.Input[int]] = None,
                 assignee_type: Optional[pulumi.Input[str]] = None,
                 auto_delete: Optional[pulumi.Input[bool]] = None,
                 datacenter: Optional[pulumi.Input[str]] = None,
                 delete_protection: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Hetzner Cloud Primary IP to represent a publicly-accessible static IP address that can be mapped to one of your servers.

        If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created & attached.
        Currently, Primary IPs can be only attached to servers.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        main = hcloud.PrimaryIp("main",
            name="primary_ip_test",
            datacenter="fsn1-dc14",
            type="ipv4",
            assignee_type="server",
            auto_delete=True,
            labels={
                "hallo": "welt",
            })
        # Link a server to a primary IP
        server_test = hcloud.Server("server_test",
            name="test-server",
            image="ubuntu-20.04",
            server_type="cx22",
            datacenter="fsn1-dc14",
            labels={
                "test": "tessst1",
            },
            public_nets=[{
                "ipv4": main.id,
            }])
        ```

        ## Import

        Primary IPs can be imported using its `id`:

        ```sh
        $ pulumi import hcloud:index/primaryIp:PrimaryIp myip id
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] assignee_id: ID of the assigned resource
        :param pulumi.Input[str] assignee_type: The type of the assigned resource. Currently supported: `server`
        :param pulumi.Input[bool] auto_delete: Whether auto delete is enabled.
               `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
        :param pulumi.Input[str] datacenter: The datacenter name to create the resource in.
        :param pulumi.Input[bool] delete_protection: Whether delete protection is enabled. See "Delete Protection" in the Provider Docs for details.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Description of the Primary IP.
        :param pulumi.Input[str] name: Name of the Primary IP.
        :param pulumi.Input[str] type: Type of the Primary IP. `ipv4` or `ipv6`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrimaryIpArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hetzner Cloud Primary IP to represent a publicly-accessible static IP address that can be mapped to one of your servers.

        If a server is getting created, it has to have a primary ip. If a server is getting created without defining primary ips, two of them (one ipv4 and one ipv6) getting created & attached.
        Currently, Primary IPs can be only attached to servers.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        main = hcloud.PrimaryIp("main",
            name="primary_ip_test",
            datacenter="fsn1-dc14",
            type="ipv4",
            assignee_type="server",
            auto_delete=True,
            labels={
                "hallo": "welt",
            })
        # Link a server to a primary IP
        server_test = hcloud.Server("server_test",
            name="test-server",
            image="ubuntu-20.04",
            server_type="cx22",
            datacenter="fsn1-dc14",
            labels={
                "test": "tessst1",
            },
            public_nets=[{
                "ipv4": main.id,
            }])
        ```

        ## Import

        Primary IPs can be imported using its `id`:

        ```sh
        $ pulumi import hcloud:index/primaryIp:PrimaryIp myip id
        ```

        :param str resource_name: The name of the resource.
        :param PrimaryIpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrimaryIpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 assignee_id: Optional[pulumi.Input[int]] = None,
                 assignee_type: Optional[pulumi.Input[str]] = None,
                 auto_delete: Optional[pulumi.Input[bool]] = None,
                 datacenter: Optional[pulumi.Input[str]] = None,
                 delete_protection: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrimaryIpArgs.__new__(PrimaryIpArgs)

            __props__.__dict__["assignee_id"] = assignee_id
            if assignee_type is None and not opts.urn:
                raise TypeError("Missing required property 'assignee_type'")
            __props__.__dict__["assignee_type"] = assignee_type
            if auto_delete is None and not opts.urn:
                raise TypeError("Missing required property 'auto_delete'")
            __props__.__dict__["auto_delete"] = auto_delete
            __props__.__dict__["datacenter"] = datacenter
            __props__.__dict__["delete_protection"] = delete_protection
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["ip_address"] = None
            __props__.__dict__["ip_network"] = None
        super(PrimaryIp, __self__).__init__(
            'hcloud:index/primaryIp:PrimaryIp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            assignee_id: Optional[pulumi.Input[int]] = None,
            assignee_type: Optional[pulumi.Input[str]] = None,
            auto_delete: Optional[pulumi.Input[bool]] = None,
            datacenter: Optional[pulumi.Input[str]] = None,
            delete_protection: Optional[pulumi.Input[bool]] = None,
            ip_address: Optional[pulumi.Input[str]] = None,
            ip_network: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'PrimaryIp':
        """
        Get an existing PrimaryIp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] assignee_id: ID of the assigned resource
        :param pulumi.Input[str] assignee_type: The type of the assigned resource. Currently supported: `server`
        :param pulumi.Input[bool] auto_delete: Whether auto delete is enabled.
               `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
        :param pulumi.Input[str] datacenter: The datacenter name to create the resource in.
        :param pulumi.Input[bool] delete_protection: Whether delete protection is enabled. See "Delete Protection" in the Provider Docs for details.
        :param pulumi.Input[str] ip_address: (string) IP Address of the Primary IP.
        :param pulumi.Input[str] ip_network: (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Description of the Primary IP.
        :param pulumi.Input[str] name: Name of the Primary IP.
        :param pulumi.Input[str] type: Type of the Primary IP. `ipv4` or `ipv6`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrimaryIpState.__new__(_PrimaryIpState)

        __props__.__dict__["assignee_id"] = assignee_id
        __props__.__dict__["assignee_type"] = assignee_type
        __props__.__dict__["auto_delete"] = auto_delete
        __props__.__dict__["datacenter"] = datacenter
        __props__.__dict__["delete_protection"] = delete_protection
        __props__.__dict__["ip_address"] = ip_address
        __props__.__dict__["ip_network"] = ip_network
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["type"] = type
        return PrimaryIp(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="assigneeId")
    def assignee_id(self) -> pulumi.Output[int]:
        """
        ID of the assigned resource
        """
        return pulumi.get(self, "assignee_id")

    @property
    @pulumi.getter(name="assigneeType")
    def assignee_type(self) -> pulumi.Output[str]:
        """
        The type of the assigned resource. Currently supported: `server`
        """
        return pulumi.get(self, "assignee_type")

    @property
    @pulumi.getter(name="autoDelete")
    def auto_delete(self) -> pulumi.Output[bool]:
        """
        Whether auto delete is enabled.
        `Important note:`It is recommended to set `auto_delete` to `false`, because if a server assigned to the managed ip is getting deleted, it will also delete the primary IP which will break the TF state.
        """
        return pulumi.get(self, "auto_delete")

    @property
    @pulumi.getter
    def datacenter(self) -> pulumi.Output[str]:
        """
        The datacenter name to create the resource in.
        """
        return pulumi.get(self, "datacenter")

    @property
    @pulumi.getter(name="deleteProtection")
    def delete_protection(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether delete protection is enabled. See "Delete Protection" in the Provider Docs for details.
        """
        return pulumi.get(self, "delete_protection")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        (string) IP Address of the Primary IP.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="ipNetwork")
    def ip_network(self) -> pulumi.Output[str]:
        """
        (string) IPv6 subnet of the Primary IP for IPv6 addresses. (Only set if `type` is `ipv6`)
        """
        return pulumi.get(self, "ip_network")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Description of the Primary IP.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Primary IP.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of the Primary IP. `ipv4` or `ipv6`
        """
        return pulumi.get(self, "type")

