# HCloud provider

The HCloud resource provider for Pulumi lets you use Hetzner Cloud resources in your infrastructure 
programs. To use this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/hcloud

or `yarn`:

    $ yarn add @pulumi/hcloud

### Python

To use from Python, install using `pip`:

    $ pip install pulumi-hcloud

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-hcloud/sdk

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.HCloud

## Configuration

The following configuration points are available:

- `hcloud:token` - (Optional) This is the Hetzner Cloud API Token, can also be specified with the `HCLOUD_TOKEN` environment variable.
- `hcloud:endpoint` - (Optional) Hetzner Cloud API endpoint, can be used to override the default API Endpoint `https://api.hetzner.cloud/v1`.
- `hcloud:pollInterval` - (Optional) Configures the interval in which actions are polled by the client. Default `500ms`. Increase this interval if you run into rate limiting errors.


## Reference

For further information, please visit [the HCloud provider docs](https://www.pulumi.com/docs/intro/cloud-providers/hcloud) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/hcloud).
