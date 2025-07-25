# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
from ._inputs import *

__all__ = ['LoadBalancerArgs', 'LoadBalancer']

@pulumi.input_type
class LoadBalancerArgs:
    def __init__(__self__, *,
                 load_balancer_type: pulumi.Input[_builtins.str],
                 algorithm: Optional[pulumi.Input['LoadBalancerAlgorithmArgs']] = None,
                 delete_protection: Optional[pulumi.Input[_builtins.bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_zone: Optional[pulumi.Input[_builtins.str]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerTargetArgs']]]] = None):
        """
        The set of arguments for constructing a LoadBalancer resource.
        :param pulumi.Input[_builtins.str] load_balancer_type: Type of the Load Balancer.
        :param pulumi.Input['LoadBalancerAlgorithmArgs'] algorithm: Configuration of the algorithm the Load Balancer use.
        :param pulumi.Input[_builtins.bool] delete_protection: Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: User-defined labels (key-value pairs) should be created with.
        :param pulumi.Input[_builtins.str] location: The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
        :param pulumi.Input[_builtins.str] name: Name of the Load Balancer.
        :param pulumi.Input[_builtins.str] network_zone: The Network Zone of the Load Balancer. Require when no location is set.
        """
        pulumi.set(__self__, "load_balancer_type", load_balancer_type)
        if algorithm is not None:
            pulumi.set(__self__, "algorithm", algorithm)
        if delete_protection is not None:
            pulumi.set(__self__, "delete_protection", delete_protection)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_zone is not None:
            pulumi.set(__self__, "network_zone", network_zone)
        if targets is not None:
            warnings.warn("""Use LoadBalancerTarget resource instead. This allows the full control over the selected targets.""", DeprecationWarning)
            pulumi.log.warn("""targets is deprecated: Use LoadBalancerTarget resource instead. This allows the full control over the selected targets.""")
        if targets is not None:
            pulumi.set(__self__, "targets", targets)

    @_builtins.property
    @pulumi.getter(name="loadBalancerType")
    def load_balancer_type(self) -> pulumi.Input[_builtins.str]:
        """
        Type of the Load Balancer.
        """
        return pulumi.get(self, "load_balancer_type")

    @load_balancer_type.setter
    def load_balancer_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "load_balancer_type", value)

    @_builtins.property
    @pulumi.getter
    def algorithm(self) -> Optional[pulumi.Input['LoadBalancerAlgorithmArgs']]:
        """
        Configuration of the algorithm the Load Balancer use.
        """
        return pulumi.get(self, "algorithm")

    @algorithm.setter
    def algorithm(self, value: Optional[pulumi.Input['LoadBalancerAlgorithmArgs']]):
        pulumi.set(self, "algorithm", value)

    @_builtins.property
    @pulumi.getter(name="deleteProtection")
    def delete_protection(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
        """
        return pulumi.get(self, "delete_protection")

    @delete_protection.setter
    def delete_protection(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "delete_protection", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        User-defined labels (key-value pairs) should be created with.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the Load Balancer.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="networkZone")
    def network_zone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Network Zone of the Load Balancer. Require when no location is set.
        """
        return pulumi.get(self, "network_zone")

    @network_zone.setter
    def network_zone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network_zone", value)

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""Use LoadBalancerTarget resource instead. This allows the full control over the selected targets.""")
    def targets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerTargetArgs']]]]:
        return pulumi.get(self, "targets")

    @targets.setter
    def targets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerTargetArgs']]]]):
        pulumi.set(self, "targets", value)


@pulumi.input_type
class _LoadBalancerState:
    def __init__(__self__, *,
                 algorithm: Optional[pulumi.Input['LoadBalancerAlgorithmArgs']] = None,
                 delete_protection: Optional[pulumi.Input[_builtins.bool]] = None,
                 ipv4: Optional[pulumi.Input[_builtins.str]] = None,
                 ipv6: Optional[pulumi.Input[_builtins.str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 load_balancer_type: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_id: Optional[pulumi.Input[_builtins.int]] = None,
                 network_ip: Optional[pulumi.Input[_builtins.str]] = None,
                 network_zone: Optional[pulumi.Input[_builtins.str]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerTargetArgs']]]] = None):
        """
        Input properties used for looking up and filtering LoadBalancer resources.
        :param pulumi.Input['LoadBalancerAlgorithmArgs'] algorithm: Configuration of the algorithm the Load Balancer use.
        :param pulumi.Input[_builtins.bool] delete_protection: Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
        :param pulumi.Input[_builtins.str] ipv4: (string) IPv4 Address of the Load Balancer.
        :param pulumi.Input[_builtins.str] ipv6: (string) IPv6 Address of the Load Balancer.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: User-defined labels (key-value pairs) should be created with.
        :param pulumi.Input[_builtins.str] load_balancer_type: Type of the Load Balancer.
        :param pulumi.Input[_builtins.str] location: The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
        :param pulumi.Input[_builtins.str] name: Name of the Load Balancer.
        :param pulumi.Input[_builtins.int] network_id: (int) ID of the first private network that this Load Balancer is connected to.
        :param pulumi.Input[_builtins.str] network_ip: (string) IP of the Load Balancer in the first private network that it is connected to.
        :param pulumi.Input[_builtins.str] network_zone: The Network Zone of the Load Balancer. Require when no location is set.
        """
        if algorithm is not None:
            pulumi.set(__self__, "algorithm", algorithm)
        if delete_protection is not None:
            pulumi.set(__self__, "delete_protection", delete_protection)
        if ipv4 is not None:
            pulumi.set(__self__, "ipv4", ipv4)
        if ipv6 is not None:
            pulumi.set(__self__, "ipv6", ipv6)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if load_balancer_type is not None:
            pulumi.set(__self__, "load_balancer_type", load_balancer_type)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_id is not None:
            pulumi.set(__self__, "network_id", network_id)
        if network_ip is not None:
            pulumi.set(__self__, "network_ip", network_ip)
        if network_zone is not None:
            pulumi.set(__self__, "network_zone", network_zone)
        if targets is not None:
            warnings.warn("""Use LoadBalancerTarget resource instead. This allows the full control over the selected targets.""", DeprecationWarning)
            pulumi.log.warn("""targets is deprecated: Use LoadBalancerTarget resource instead. This allows the full control over the selected targets.""")
        if targets is not None:
            pulumi.set(__self__, "targets", targets)

    @_builtins.property
    @pulumi.getter
    def algorithm(self) -> Optional[pulumi.Input['LoadBalancerAlgorithmArgs']]:
        """
        Configuration of the algorithm the Load Balancer use.
        """
        return pulumi.get(self, "algorithm")

    @algorithm.setter
    def algorithm(self, value: Optional[pulumi.Input['LoadBalancerAlgorithmArgs']]):
        pulumi.set(self, "algorithm", value)

    @_builtins.property
    @pulumi.getter(name="deleteProtection")
    def delete_protection(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
        """
        return pulumi.get(self, "delete_protection")

    @delete_protection.setter
    def delete_protection(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "delete_protection", value)

    @_builtins.property
    @pulumi.getter
    def ipv4(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (string) IPv4 Address of the Load Balancer.
        """
        return pulumi.get(self, "ipv4")

    @ipv4.setter
    def ipv4(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ipv4", value)

    @_builtins.property
    @pulumi.getter
    def ipv6(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (string) IPv6 Address of the Load Balancer.
        """
        return pulumi.get(self, "ipv6")

    @ipv6.setter
    def ipv6(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ipv6", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        User-defined labels (key-value pairs) should be created with.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter(name="loadBalancerType")
    def load_balancer_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Type of the Load Balancer.
        """
        return pulumi.get(self, "load_balancer_type")

    @load_balancer_type.setter
    def load_balancer_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "load_balancer_type", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the Load Balancer.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        (int) ID of the first private network that this Load Balancer is connected to.
        """
        return pulumi.get(self, "network_id")

    @network_id.setter
    def network_id(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "network_id", value)

    @_builtins.property
    @pulumi.getter(name="networkIp")
    def network_ip(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (string) IP of the Load Balancer in the first private network that it is connected to.
        """
        return pulumi.get(self, "network_ip")

    @network_ip.setter
    def network_ip(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network_ip", value)

    @_builtins.property
    @pulumi.getter(name="networkZone")
    def network_zone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Network Zone of the Load Balancer. Require when no location is set.
        """
        return pulumi.get(self, "network_zone")

    @network_zone.setter
    def network_zone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "network_zone", value)

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""Use LoadBalancerTarget resource instead. This allows the full control over the selected targets.""")
    def targets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerTargetArgs']]]]:
        return pulumi.get(self, "targets")

    @targets.setter
    def targets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LoadBalancerTargetArgs']]]]):
        pulumi.set(self, "targets", value)


@pulumi.type_token("hcloud:index/loadBalancer:LoadBalancer")
class LoadBalancer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 algorithm: Optional[pulumi.Input[Union['LoadBalancerAlgorithmArgs', 'LoadBalancerAlgorithmArgsDict']]] = None,
                 delete_protection: Optional[pulumi.Input[_builtins.bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 load_balancer_type: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_zone: Optional[pulumi.Input[_builtins.str]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['LoadBalancerTargetArgs', 'LoadBalancerTargetArgsDict']]]]] = None,
                 __props__=None):
        """
        Provides a Hetzner Cloud Load Balancer to represent a Load Balancer in the Hetzner Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        my_server = hcloud.Server("my_server",
            name="server-%d",
            server_type="cx22",
            image="ubuntu-18.04")
        load_balancer = hcloud.LoadBalancer("load_balancer",
            name="my-load-balancer",
            load_balancer_type="lb11",
            location="nbg1")
        load_balancer_target = hcloud.LoadBalancerTarget("load_balancer_target",
            type="server",
            load_balancer_id=load_balancer.id,
            server_id=my_server.id)
        ```

        ## Import

        Load Balancers can be imported using its `id`:

        ```sh
        $ pulumi import hcloud:index/loadBalancer:LoadBalancer example "$LOAD_BALANCER_ID"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['LoadBalancerAlgorithmArgs', 'LoadBalancerAlgorithmArgsDict']] algorithm: Configuration of the algorithm the Load Balancer use.
        :param pulumi.Input[_builtins.bool] delete_protection: Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: User-defined labels (key-value pairs) should be created with.
        :param pulumi.Input[_builtins.str] load_balancer_type: Type of the Load Balancer.
        :param pulumi.Input[_builtins.str] location: The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
        :param pulumi.Input[_builtins.str] name: Name of the Load Balancer.
        :param pulumi.Input[_builtins.str] network_zone: The Network Zone of the Load Balancer. Require when no location is set.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadBalancerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hetzner Cloud Load Balancer to represent a Load Balancer in the Hetzner Cloud.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        my_server = hcloud.Server("my_server",
            name="server-%d",
            server_type="cx22",
            image="ubuntu-18.04")
        load_balancer = hcloud.LoadBalancer("load_balancer",
            name="my-load-balancer",
            load_balancer_type="lb11",
            location="nbg1")
        load_balancer_target = hcloud.LoadBalancerTarget("load_balancer_target",
            type="server",
            load_balancer_id=load_balancer.id,
            server_id=my_server.id)
        ```

        ## Import

        Load Balancers can be imported using its `id`:

        ```sh
        $ pulumi import hcloud:index/loadBalancer:LoadBalancer example "$LOAD_BALANCER_ID"
        ```

        :param str resource_name: The name of the resource.
        :param LoadBalancerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadBalancerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 algorithm: Optional[pulumi.Input[Union['LoadBalancerAlgorithmArgs', 'LoadBalancerAlgorithmArgsDict']]] = None,
                 delete_protection: Optional[pulumi.Input[_builtins.bool]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 load_balancer_type: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 network_zone: Optional[pulumi.Input[_builtins.str]] = None,
                 targets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['LoadBalancerTargetArgs', 'LoadBalancerTargetArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadBalancerArgs.__new__(LoadBalancerArgs)

            __props__.__dict__["algorithm"] = algorithm
            __props__.__dict__["delete_protection"] = delete_protection
            __props__.__dict__["labels"] = labels
            if load_balancer_type is None and not opts.urn:
                raise TypeError("Missing required property 'load_balancer_type'")
            __props__.__dict__["load_balancer_type"] = load_balancer_type
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["network_zone"] = network_zone
            __props__.__dict__["targets"] = targets
            __props__.__dict__["ipv4"] = None
            __props__.__dict__["ipv6"] = None
            __props__.__dict__["network_id"] = None
            __props__.__dict__["network_ip"] = None
        super(LoadBalancer, __self__).__init__(
            'hcloud:index/loadBalancer:LoadBalancer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            algorithm: Optional[pulumi.Input[Union['LoadBalancerAlgorithmArgs', 'LoadBalancerAlgorithmArgsDict']]] = None,
            delete_protection: Optional[pulumi.Input[_builtins.bool]] = None,
            ipv4: Optional[pulumi.Input[_builtins.str]] = None,
            ipv6: Optional[pulumi.Input[_builtins.str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            load_balancer_type: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            network_id: Optional[pulumi.Input[_builtins.int]] = None,
            network_ip: Optional[pulumi.Input[_builtins.str]] = None,
            network_zone: Optional[pulumi.Input[_builtins.str]] = None,
            targets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['LoadBalancerTargetArgs', 'LoadBalancerTargetArgsDict']]]]] = None) -> 'LoadBalancer':
        """
        Get an existing LoadBalancer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['LoadBalancerAlgorithmArgs', 'LoadBalancerAlgorithmArgsDict']] algorithm: Configuration of the algorithm the Load Balancer use.
        :param pulumi.Input[_builtins.bool] delete_protection: Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
        :param pulumi.Input[_builtins.str] ipv4: (string) IPv4 Address of the Load Balancer.
        :param pulumi.Input[_builtins.str] ipv6: (string) IPv6 Address of the Load Balancer.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] labels: User-defined labels (key-value pairs) should be created with.
        :param pulumi.Input[_builtins.str] load_balancer_type: Type of the Load Balancer.
        :param pulumi.Input[_builtins.str] location: The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
        :param pulumi.Input[_builtins.str] name: Name of the Load Balancer.
        :param pulumi.Input[_builtins.int] network_id: (int) ID of the first private network that this Load Balancer is connected to.
        :param pulumi.Input[_builtins.str] network_ip: (string) IP of the Load Balancer in the first private network that it is connected to.
        :param pulumi.Input[_builtins.str] network_zone: The Network Zone of the Load Balancer. Require when no location is set.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadBalancerState.__new__(_LoadBalancerState)

        __props__.__dict__["algorithm"] = algorithm
        __props__.__dict__["delete_protection"] = delete_protection
        __props__.__dict__["ipv4"] = ipv4
        __props__.__dict__["ipv6"] = ipv6
        __props__.__dict__["labels"] = labels
        __props__.__dict__["load_balancer_type"] = load_balancer_type
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["network_id"] = network_id
        __props__.__dict__["network_ip"] = network_ip
        __props__.__dict__["network_zone"] = network_zone
        __props__.__dict__["targets"] = targets
        return LoadBalancer(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def algorithm(self) -> pulumi.Output['outputs.LoadBalancerAlgorithm']:
        """
        Configuration of the algorithm the Load Balancer use.
        """
        return pulumi.get(self, "algorithm")

    @_builtins.property
    @pulumi.getter(name="deleteProtection")
    def delete_protection(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Enable or disable delete protection. See "Delete Protection" in the Provider Docs for details.
        """
        return pulumi.get(self, "delete_protection")

    @_builtins.property
    @pulumi.getter
    def ipv4(self) -> pulumi.Output[_builtins.str]:
        """
        (string) IPv4 Address of the Load Balancer.
        """
        return pulumi.get(self, "ipv4")

    @_builtins.property
    @pulumi.getter
    def ipv6(self) -> pulumi.Output[_builtins.str]:
        """
        (string) IPv6 Address of the Load Balancer.
        """
        return pulumi.get(self, "ipv6")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        User-defined labels (key-value pairs) should be created with.
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter(name="loadBalancerType")
    def load_balancer_type(self) -> pulumi.Output[_builtins.str]:
        """
        Type of the Load Balancer.
        """
        return pulumi.get(self, "load_balancer_type")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The location name of the Load Balancer. Require when no network_zone is set. See the [Hetzner Docs](https://docs.hetzner.com/cloud/general/locations/#what-locations-are-there) for more details about locations.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the Load Balancer.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="networkId")
    def network_id(self) -> pulumi.Output[_builtins.int]:
        """
        (int) ID of the first private network that this Load Balancer is connected to.
        """
        return pulumi.get(self, "network_id")

    @_builtins.property
    @pulumi.getter(name="networkIp")
    def network_ip(self) -> pulumi.Output[_builtins.str]:
        """
        (string) IP of the Load Balancer in the first private network that it is connected to.
        """
        return pulumi.get(self, "network_ip")

    @_builtins.property
    @pulumi.getter(name="networkZone")
    def network_zone(self) -> pulumi.Output[_builtins.str]:
        """
        The Network Zone of the Load Balancer. Require when no location is set.
        """
        return pulumi.get(self, "network_zone")

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""Use LoadBalancerTarget resource instead. This allows the full control over the selected targets.""")
    def targets(self) -> pulumi.Output[Sequence['outputs.LoadBalancerTarget']]:
        return pulumi.get(self, "targets")

