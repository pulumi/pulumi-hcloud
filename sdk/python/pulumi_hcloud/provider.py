# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 poll_interval: Optional[pulumi.Input[str]] = None,
                 token: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[str] endpoint: The Hetzner Cloud API endpoint, can be used to override the default API Endpoint https://api.hetzner.cloud/v1.
        :param pulumi.Input[str] poll_interval: The interval at which actions are polled by the client. Default `500ms`. Increase this interval if you run into rate
               limiting errors.
        :param pulumi.Input[str] token: The Hetzner Cloud API token, can also be specified with the HCLOUD_TOKEN environment variable.
        """
        ProviderArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            endpoint=endpoint,
            poll_interval=poll_interval,
            token=token,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             endpoint: Optional[pulumi.Input[str]] = None,
             poll_interval: Optional[pulumi.Input[str]] = None,
             token: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if poll_interval is None and 'pollInterval' in kwargs:
            poll_interval = kwargs['pollInterval']

        if endpoint is not None:
            _setter("endpoint", endpoint)
        if poll_interval is not None:
            _setter("poll_interval", poll_interval)
        if token is not None:
            _setter("token", token)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The Hetzner Cloud API endpoint, can be used to override the default API Endpoint https://api.hetzner.cloud/v1.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="pollInterval")
    def poll_interval(self) -> Optional[pulumi.Input[str]]:
        """
        The interval at which actions are polled by the client. Default `500ms`. Increase this interval if you run into rate
        limiting errors.
        """
        return pulumi.get(self, "poll_interval")

    @poll_interval.setter
    def poll_interval(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "poll_interval", value)

    @property
    @pulumi.getter
    def token(self) -> Optional[pulumi.Input[str]]:
        """
        The Hetzner Cloud API token, can also be specified with the HCLOUD_TOKEN environment variable.
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 poll_interval: Optional[pulumi.Input[str]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the hcloud package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] endpoint: The Hetzner Cloud API endpoint, can be used to override the default API Endpoint https://api.hetzner.cloud/v1.
        :param pulumi.Input[str] poll_interval: The interval at which actions are polled by the client. Default `500ms`. Increase this interval if you run into rate
               limiting errors.
        :param pulumi.Input[str] token: The Hetzner Cloud API token, can also be specified with the HCLOUD_TOKEN environment variable.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the hcloud package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ProviderArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 poll_interval: Optional[pulumi.Input[str]] = None,
                 token: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["endpoint"] = endpoint
            __props__.__dict__["poll_interval"] = poll_interval
            __props__.__dict__["token"] = None if token is None else pulumi.Output.secret(token)
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["token"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Provider, __self__).__init__(
            'hcloud',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The Hetzner Cloud API endpoint, can be used to override the default API Endpoint https://api.hetzner.cloud/v1.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter(name="pollInterval")
    def poll_interval(self) -> pulumi.Output[Optional[str]]:
        """
        The interval at which actions are polled by the client. Default `500ms`. Increase this interval if you run into rate
        limiting errors.
        """
        return pulumi.get(self, "poll_interval")

    @property
    @pulumi.getter
    def token(self) -> pulumi.Output[Optional[str]]:
        """
        The Hetzner Cloud API token, can also be specified with the HCLOUD_TOKEN environment variable.
        """
        return pulumi.get(self, "token")

