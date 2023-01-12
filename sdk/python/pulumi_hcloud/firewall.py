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
from ._inputs import *

__all__ = ['FirewallArgs', 'Firewall']

@pulumi.input_type
class FirewallArgs:
    def __init__(__self__, *,
                 apply_tos: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallApplyToArgs']]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallRuleArgs']]]] = None):
        """
        The set of arguments for constructing a Firewall resource.
        :param pulumi.Input[Sequence[pulumi.Input['FirewallApplyToArgs']]] apply_tos: Resources the firewall should be assigned to
        :param pulumi.Input[Mapping[str, Any]] labels: User-defined labels (key-value pairs) should be created with.
        :param pulumi.Input[str] name: Name of the Firewall.
        :param pulumi.Input[Sequence[pulumi.Input['FirewallRuleArgs']]] rules: Configuration of a Rule from this Firewall.
        """
        if apply_tos is not None:
            pulumi.set(__self__, "apply_tos", apply_tos)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter(name="applyTos")
    def apply_tos(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallApplyToArgs']]]]:
        """
        Resources the firewall should be assigned to
        """
        return pulumi.get(self, "apply_tos")

    @apply_tos.setter
    def apply_tos(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallApplyToArgs']]]]):
        pulumi.set(self, "apply_tos", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        User-defined labels (key-value pairs) should be created with.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Firewall.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallRuleArgs']]]]:
        """
        Configuration of a Rule from this Firewall.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.input_type
class _FirewallState:
    def __init__(__self__, *,
                 apply_tos: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallApplyToArgs']]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallRuleArgs']]]] = None):
        """
        Input properties used for looking up and filtering Firewall resources.
        :param pulumi.Input[Sequence[pulumi.Input['FirewallApplyToArgs']]] apply_tos: Resources the firewall should be assigned to
        :param pulumi.Input[Mapping[str, Any]] labels: User-defined labels (key-value pairs) should be created with.
        :param pulumi.Input[str] name: Name of the Firewall.
        :param pulumi.Input[Sequence[pulumi.Input['FirewallRuleArgs']]] rules: Configuration of a Rule from this Firewall.
        """
        if apply_tos is not None:
            pulumi.set(__self__, "apply_tos", apply_tos)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter(name="applyTos")
    def apply_tos(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallApplyToArgs']]]]:
        """
        Resources the firewall should be assigned to
        """
        return pulumi.get(self, "apply_tos")

    @apply_tos.setter
    def apply_tos(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallApplyToArgs']]]]):
        pulumi.set(self, "apply_tos", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        User-defined labels (key-value pairs) should be created with.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Firewall.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallRuleArgs']]]]:
        """
        Configuration of a Rule from this Firewall.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallRuleArgs']]]]):
        pulumi.set(self, "rules", value)


class Firewall(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 apply_tos: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallApplyToArgs']]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallRuleArgs']]]]] = None,
                 __props__=None):
        """
        Provides a Hetzner Cloud Firewall to represent a Firewall in the Hetzner Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        myfirewall = hcloud.Firewall("myfirewall", rules=[
            hcloud.FirewallRuleArgs(
                direction="in",
                protocol="icmp",
                source_ips=[
                    "0.0.0.0/0",
                    "::/0",
                ],
            ),
            hcloud.FirewallRuleArgs(
                direction="in",
                protocol="tcp",
                port="80-85",
                source_ips=[
                    "0.0.0.0/0",
                    "::/0",
                ],
            ),
        ])
        node1 = hcloud.Server("node1",
            image="debian-9",
            server_type="cx11",
            firewall_ids=[myfirewall.id])
        ```

        ## Import

        Firewalls can be imported using its `id`

        ```sh
         $ pulumi import hcloud:index/firewall:Firewall myfirewall id
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallApplyToArgs']]]] apply_tos: Resources the firewall should be assigned to
        :param pulumi.Input[Mapping[str, Any]] labels: User-defined labels (key-value pairs) should be created with.
        :param pulumi.Input[str] name: Name of the Firewall.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallRuleArgs']]]] rules: Configuration of a Rule from this Firewall.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[FirewallArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hetzner Cloud Firewall to represent a Firewall in the Hetzner Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        myfirewall = hcloud.Firewall("myfirewall", rules=[
            hcloud.FirewallRuleArgs(
                direction="in",
                protocol="icmp",
                source_ips=[
                    "0.0.0.0/0",
                    "::/0",
                ],
            ),
            hcloud.FirewallRuleArgs(
                direction="in",
                protocol="tcp",
                port="80-85",
                source_ips=[
                    "0.0.0.0/0",
                    "::/0",
                ],
            ),
        ])
        node1 = hcloud.Server("node1",
            image="debian-9",
            server_type="cx11",
            firewall_ids=[myfirewall.id])
        ```

        ## Import

        Firewalls can be imported using its `id`

        ```sh
         $ pulumi import hcloud:index/firewall:Firewall myfirewall id
        ```

        :param str resource_name: The name of the resource.
        :param FirewallArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FirewallArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 apply_tos: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallApplyToArgs']]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallRuleArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FirewallArgs.__new__(FirewallArgs)

            __props__.__dict__["apply_tos"] = apply_tos
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["rules"] = rules
        super(Firewall, __self__).__init__(
            'hcloud:index/firewall:Firewall',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            apply_tos: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallApplyToArgs']]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallRuleArgs']]]]] = None) -> 'Firewall':
        """
        Get an existing Firewall resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallApplyToArgs']]]] apply_tos: Resources the firewall should be assigned to
        :param pulumi.Input[Mapping[str, Any]] labels: User-defined labels (key-value pairs) should be created with.
        :param pulumi.Input[str] name: Name of the Firewall.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallRuleArgs']]]] rules: Configuration of a Rule from this Firewall.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FirewallState.__new__(_FirewallState)

        __props__.__dict__["apply_tos"] = apply_tos
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["rules"] = rules
        return Firewall(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="applyTos")
    def apply_tos(self) -> pulumi.Output[Sequence['outputs.FirewallApplyTo']]:
        """
        Resources the firewall should be assigned to
        """
        return pulumi.get(self, "apply_tos")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Any]]:
        """
        User-defined labels (key-value pairs) should be created with.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Firewall.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Optional[Sequence['outputs.FirewallRule']]]:
        """
        Configuration of a Rule from this Firewall.
        """
        return pulumi.get(self, "rules")

