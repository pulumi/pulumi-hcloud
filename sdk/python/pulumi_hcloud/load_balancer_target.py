# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['LoadBalancerTargetInitArgs', 'LoadBalancerTarget']

@pulumi.input_type
class LoadBalancerTargetInitArgs:
    def __init__(__self__, *,
                 load_balancer_id: pulumi.Input[int],
                 type: pulumi.Input[str],
                 ip: Optional[pulumi.Input[str]] = None,
                 label_selector: Optional[pulumi.Input[str]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 use_private_ip: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a LoadBalancerTarget resource.
        :param pulumi.Input[int] load_balancer_id: ID of the Load Balancer to which
               the target gets attached.
        :param pulumi.Input[str] type: Type of the target. Possible values
               `server`, `label_selector`, `ip`.
        :param pulumi.Input[str] ip: IP address for an IP Target. Required if
               `type` is `ip`.
        :param pulumi.Input[str] label_selector: Label Selector selecting targets
               for this Load Balancer. Required if `type` is `label_selector`.
        :param pulumi.Input[int] server_id: ID of the server which should be a
               target for this Load Balancer. Required if `type` is `server`
        :param pulumi.Input[bool] use_private_ip: use the private IP to connect to
               Load Balancer targets. Only allowed if type is `server` or
               `label_selector`.
        """
        LoadBalancerTargetInitArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            load_balancer_id=load_balancer_id,
            type=type,
            ip=ip,
            label_selector=label_selector,
            server_id=server_id,
            use_private_ip=use_private_ip,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             load_balancer_id: pulumi.Input[int],
             type: pulumi.Input[str],
             ip: Optional[pulumi.Input[str]] = None,
             label_selector: Optional[pulumi.Input[str]] = None,
             server_id: Optional[pulumi.Input[int]] = None,
             use_private_ip: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("load_balancer_id", load_balancer_id)
        _setter("type", type)
        if ip is not None:
            _setter("ip", ip)
        if label_selector is not None:
            _setter("label_selector", label_selector)
        if server_id is not None:
            _setter("server_id", server_id)
        if use_private_ip is not None:
            _setter("use_private_ip", use_private_ip)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Input[int]:
        """
        ID of the Load Balancer to which
        the target gets attached.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of the target. Possible values
        `server`, `label_selector`, `ip`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        IP address for an IP Target. Required if
        `type` is `ip`.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="labelSelector")
    def label_selector(self) -> Optional[pulumi.Input[str]]:
        """
        Label Selector selecting targets
        for this Load Balancer. Required if `type` is `label_selector`.
        """
        return pulumi.get(self, "label_selector")

    @label_selector.setter
    def label_selector(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label_selector", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the server which should be a
        target for this Load Balancer. Required if `type` is `server`
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter(name="usePrivateIp")
    def use_private_ip(self) -> Optional[pulumi.Input[bool]]:
        """
        use the private IP to connect to
        Load Balancer targets. Only allowed if type is `server` or
        `label_selector`.
        """
        return pulumi.get(self, "use_private_ip")

    @use_private_ip.setter
    def use_private_ip(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_private_ip", value)


@pulumi.input_type
class _LoadBalancerTargetState:
    def __init__(__self__, *,
                 ip: Optional[pulumi.Input[str]] = None,
                 label_selector: Optional[pulumi.Input[str]] = None,
                 load_balancer_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 use_private_ip: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering LoadBalancerTarget resources.
        :param pulumi.Input[str] ip: IP address for an IP Target. Required if
               `type` is `ip`.
        :param pulumi.Input[str] label_selector: Label Selector selecting targets
               for this Load Balancer. Required if `type` is `label_selector`.
        :param pulumi.Input[int] load_balancer_id: ID of the Load Balancer to which
               the target gets attached.
        :param pulumi.Input[int] server_id: ID of the server which should be a
               target for this Load Balancer. Required if `type` is `server`
        :param pulumi.Input[str] type: Type of the target. Possible values
               `server`, `label_selector`, `ip`.
        :param pulumi.Input[bool] use_private_ip: use the private IP to connect to
               Load Balancer targets. Only allowed if type is `server` or
               `label_selector`.
        """
        _LoadBalancerTargetState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            ip=ip,
            label_selector=label_selector,
            load_balancer_id=load_balancer_id,
            server_id=server_id,
            type=type,
            use_private_ip=use_private_ip,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             ip: Optional[pulumi.Input[str]] = None,
             label_selector: Optional[pulumi.Input[str]] = None,
             load_balancer_id: Optional[pulumi.Input[int]] = None,
             server_id: Optional[pulumi.Input[int]] = None,
             type: Optional[pulumi.Input[str]] = None,
             use_private_ip: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if ip is not None:
            _setter("ip", ip)
        if label_selector is not None:
            _setter("label_selector", label_selector)
        if load_balancer_id is not None:
            _setter("load_balancer_id", load_balancer_id)
        if server_id is not None:
            _setter("server_id", server_id)
        if type is not None:
            _setter("type", type)
        if use_private_ip is not None:
            _setter("use_private_ip", use_private_ip)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        IP address for an IP Target. Required if
        `type` is `ip`.
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="labelSelector")
    def label_selector(self) -> Optional[pulumi.Input[str]]:
        """
        Label Selector selecting targets
        for this Load Balancer. Required if `type` is `label_selector`.
        """
        return pulumi.get(self, "label_selector")

    @label_selector.setter
    def label_selector(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label_selector", value)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the Load Balancer to which
        the target gets attached.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> Optional[pulumi.Input[int]]:
        """
        ID of the server which should be a
        target for this Load Balancer. Required if `type` is `server`
        """
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the target. Possible values
        `server`, `label_selector`, `ip`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="usePrivateIp")
    def use_private_ip(self) -> Optional[pulumi.Input[bool]]:
        """
        use the private IP to connect to
        Load Balancer targets. Only allowed if type is `server` or
        `label_selector`.
        """
        return pulumi.get(self, "use_private_ip")

    @use_private_ip.setter
    def use_private_ip(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_private_ip", value)


class LoadBalancerTarget(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 label_selector: Optional[pulumi.Input[str]] = None,
                 load_balancer_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 use_private_ip: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Adds a target to a Hetzner Cloud Load Balancer.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        my_server = hcloud.Server("myServer",
            server_type="cx11",
            image="ubuntu-18.04")
        load_balancer = hcloud.LoadBalancer("loadBalancer",
            load_balancer_type="lb11",
            location="nbg1")
        load_balancer_target = hcloud.LoadBalancerTarget("loadBalancerTarget",
            type="server",
            load_balancer_id=load_balancer.id,
            server_id=my_server.id)
        ```

        ## Import

        Load Balancer Target entries can be imported using a compound ID with the following format`<load-balancer-id>__<type>__<identifier>` Where _identifier_ depends on the _type_- `server`server id, for example`123` - `label_selector`label selector, for example`foo=bar` - `ip`ip address, for example`203.0.113.123`

        ```sh
         $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalancerservertarget 123__server__321
        ```

        ```sh
         $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalancerlabeltarget 123__label_selector__foo=bar
        ```

        ```sh
         $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalanceriptarget 123__ip__203.0.113.123
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ip: IP address for an IP Target. Required if
               `type` is `ip`.
        :param pulumi.Input[str] label_selector: Label Selector selecting targets
               for this Load Balancer. Required if `type` is `label_selector`.
        :param pulumi.Input[int] load_balancer_id: ID of the Load Balancer to which
               the target gets attached.
        :param pulumi.Input[int] server_id: ID of the server which should be a
               target for this Load Balancer. Required if `type` is `server`
        :param pulumi.Input[str] type: Type of the target. Possible values
               `server`, `label_selector`, `ip`.
        :param pulumi.Input[bool] use_private_ip: use the private IP to connect to
               Load Balancer targets. Only allowed if type is `server` or
               `label_selector`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadBalancerTargetInitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Adds a target to a Hetzner Cloud Load Balancer.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_hcloud as hcloud

        my_server = hcloud.Server("myServer",
            server_type="cx11",
            image="ubuntu-18.04")
        load_balancer = hcloud.LoadBalancer("loadBalancer",
            load_balancer_type="lb11",
            location="nbg1")
        load_balancer_target = hcloud.LoadBalancerTarget("loadBalancerTarget",
            type="server",
            load_balancer_id=load_balancer.id,
            server_id=my_server.id)
        ```

        ## Import

        Load Balancer Target entries can be imported using a compound ID with the following format`<load-balancer-id>__<type>__<identifier>` Where _identifier_ depends on the _type_- `server`server id, for example`123` - `label_selector`label selector, for example`foo=bar` - `ip`ip address, for example`203.0.113.123`

        ```sh
         $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalancerservertarget 123__server__321
        ```

        ```sh
         $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalancerlabeltarget 123__label_selector__foo=bar
        ```

        ```sh
         $ pulumi import hcloud:index/loadBalancerTarget:LoadBalancerTarget myloadbalanceriptarget 123__ip__203.0.113.123
        ```

        :param str resource_name: The name of the resource.
        :param LoadBalancerTargetInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadBalancerTargetInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            LoadBalancerTargetInitArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 label_selector: Optional[pulumi.Input[str]] = None,
                 load_balancer_id: Optional[pulumi.Input[int]] = None,
                 server_id: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 use_private_ip: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadBalancerTargetInitArgs.__new__(LoadBalancerTargetInitArgs)

            __props__.__dict__["ip"] = ip
            __props__.__dict__["label_selector"] = label_selector
            if load_balancer_id is None and not opts.urn:
                raise TypeError("Missing required property 'load_balancer_id'")
            __props__.__dict__["load_balancer_id"] = load_balancer_id
            __props__.__dict__["server_id"] = server_id
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["use_private_ip"] = use_private_ip
        super(LoadBalancerTarget, __self__).__init__(
            'hcloud:index/loadBalancerTarget:LoadBalancerTarget',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ip: Optional[pulumi.Input[str]] = None,
            label_selector: Optional[pulumi.Input[str]] = None,
            load_balancer_id: Optional[pulumi.Input[int]] = None,
            server_id: Optional[pulumi.Input[int]] = None,
            type: Optional[pulumi.Input[str]] = None,
            use_private_ip: Optional[pulumi.Input[bool]] = None) -> 'LoadBalancerTarget':
        """
        Get an existing LoadBalancerTarget resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ip: IP address for an IP Target. Required if
               `type` is `ip`.
        :param pulumi.Input[str] label_selector: Label Selector selecting targets
               for this Load Balancer. Required if `type` is `label_selector`.
        :param pulumi.Input[int] load_balancer_id: ID of the Load Balancer to which
               the target gets attached.
        :param pulumi.Input[int] server_id: ID of the server which should be a
               target for this Load Balancer. Required if `type` is `server`
        :param pulumi.Input[str] type: Type of the target. Possible values
               `server`, `label_selector`, `ip`.
        :param pulumi.Input[bool] use_private_ip: use the private IP to connect to
               Load Balancer targets. Only allowed if type is `server` or
               `label_selector`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadBalancerTargetState.__new__(_LoadBalancerTargetState)

        __props__.__dict__["ip"] = ip
        __props__.__dict__["label_selector"] = label_selector
        __props__.__dict__["load_balancer_id"] = load_balancer_id
        __props__.__dict__["server_id"] = server_id
        __props__.__dict__["type"] = type
        __props__.__dict__["use_private_ip"] = use_private_ip
        return LoadBalancerTarget(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[Optional[str]]:
        """
        IP address for an IP Target. Required if
        `type` is `ip`.
        """
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="labelSelector")
    def label_selector(self) -> pulumi.Output[Optional[str]]:
        """
        Label Selector selecting targets
        for this Load Balancer. Required if `type` is `label_selector`.
        """
        return pulumi.get(self, "label_selector")

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Output[int]:
        """
        ID of the Load Balancer to which
        the target gets attached.
        """
        return pulumi.get(self, "load_balancer_id")

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Output[Optional[int]]:
        """
        ID of the server which should be a
        target for this Load Balancer. Required if `type` is `server`
        """
        return pulumi.get(self, "server_id")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of the target. Possible values
        `server`, `label_selector`, `ip`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="usePrivateIp")
    def use_private_ip(self) -> pulumi.Output[bool]:
        """
        use the private IP to connect to
        Load Balancer targets. Only allowed if type is `server` or
        `label_selector`.
        """
        return pulumi.get(self, "use_private_ip")

