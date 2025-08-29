---
# *** WARNING: This file was auto-generated. Do not edit by hand unless you're certain you know what you are doing! ***
title: Hcloud Provider
meta_desc: Provides an overview on how to configure the Pulumi Hcloud provider.
layout: package
---

## Installation

The Hcloud provider is available as a package in all Pulumi languages:

* JavaScript/TypeScript: [`@pulumi/hcloud`](https://www.npmjs.com/package/@pulumi/hcloud)
* Python: [`pulumi-hcloud`](https://pypi.org/project/pulumi-hcloud/)
* Go: [`github.com/pulumi/pulumi-hcloud/sdk/go/hcloud`](https://github.com/pulumi/pulumi-hcloud)
* .NET: [`Pulumi.Hcloud`](https://www.nuget.org/packages/Pulumi.Hcloud)
* Java: [`com.pulumi/hcloud`](https://central.sonatype.com/artifact/com.pulumi/hcloud)

## Overview

The Hetzner Cloud (hcloud) provider is used to interact with the resources supported by [Hetzner Cloud](https://www.hetzner.com/cloud). The provider needs to be configured with the proper credentials before it can be used.

Use the navigation to the left to read about the available resources.
## Example Usage

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    hcloud:token:
        value: 'TODO: var.hcloud_token'

```
```typescript
import * as pulumi from "@pulumi/pulumi";

const config = new pulumi.Config();
const hcloudToken = config.requireObject<any>("hcloudToken");
```
{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    hcloud:token:
        value: 'TODO: var.hcloud_token'

```
```python
import pulumi

config = pulumi.Config()
hcloud_token = config.require_object("hcloudToken")
```
{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    hcloud:token:
        value: 'TODO: var.hcloud_token'

```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;

return await Deployment.RunAsync(() =>
{
    var config = new Config();
    var hcloudToken = config.RequireObject<dynamic>("hcloudToken");
});

```
{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    hcloud:token:
        value: 'TODO: var.hcloud_token'

```
```go
package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		hcloudToken := cfg.RequireObject("hcloudToken")
		return nil
	})
}
```
{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    hcloud:token:
        value: 'TODO: var.hcloud_token'

```
```yaml
configuration:
  # Set the variable value in *.tfvars file
  # or using the -var="hcloud_token=..." CLI option
  hcloudToken:
    type: dynamic
```
{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    hcloud:token:
        value: 'TODO: var.hcloud_token'

```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var hcloudToken = config.get("hcloudToken");
    }
}
```
{{% /choosable %}}
{{< /chooser >}}
## Configuration Reference

The following configuration inputs are supported:

- `token` - (Required, string) This is the Hetzner Cloud API Token, can also be specified with the `HCLOUD_TOKEN` environment variable.
- `endpoint` - (Optional, string) Hetzner Cloud API endpoint, can be used to override the default API Endpoint `https://api.hetzner.cloud/v1`.
- `pollInterval` - (Optional, string) Configures the interval in which actions are polled by the client. Default `500ms`. Increase this interval if you run into rate limiting errors.
- `pollFunction` - (Optional, string) Configures the type of function to be used during the polling. Valid values are `constant` and `exponential`. Default `exponential`.
## Experimental features

Experimental features are published as part of our regular releases (e.g. a product
public beta). During an experimental phase, breaking changes on those features may occur
within minor releases.

While experimental features will be announced in the release notes, you can also find
whether a resource, function or function is experimental in its documentation:

```markdown
Experimental: Product is experimental, breaking changes may occur within minor releases. See https://docs.hetzner.cloud/changelog#new-product for more details.
```