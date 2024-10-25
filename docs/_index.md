---
title: Hcloud Provider
meta_desc: Provides an overview on how to configure the Pulumi Hcloud provider.
layout: package
---
## Installation

The hcloud provider is available as a package in all Pulumi languages:

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
import * as hcloud from "@pulumi/hcloud";

const config = new pulumi.Config();
const hcloudToken = config.requireObject("hcloudToken");
// Create a server
const web = new hcloud.Server("web", {});
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
import pulumi_hcloud as hcloud

config = pulumi.Config()
hcloud_token = config.require_object("hcloudToken")
# Create a server
web = hcloud.Server("web")
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
using HCloud = Pulumi.HCloud;

return await Deployment.RunAsync(() =>
{
    var config = new Config();
    var hcloudToken = config.RequireObject<dynamic>("hcloudToken");
    // Create a server
    var web = new HCloud.Server("web");

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
	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		hcloudToken := cfg.RequireObject("hcloudToken")
		// Create a server
		_, err := hcloud.NewServer(ctx, "web", nil)
		if err != nil {
			return err
		}
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
resources:
  # Create a server
  web:
    type: hcloud:Server
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
import com.pulumi.hcloud.Server;
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
        // Create a server
        var web = new Server("web");

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