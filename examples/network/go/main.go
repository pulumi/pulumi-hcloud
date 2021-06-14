package main

import (
	"github.com/pulumi/pulumi-hcloud/sdk/go/hcloud"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		network, err := hcloud.NewNetwork(ctx, "demo-network", &hcloud.NetworkArgs{
			IpRange: pulumi.String("10.0.10.0/24"),
		})
		if err != nil {
			return err
		}

		ctx.Export("networkName", network.Name)
		return nil
	})
}
