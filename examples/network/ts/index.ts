import * as pulumi from "@pulumi/pulumi";
import * as hcloud from "@pulumi/hcloud";

const network = new hcloud.Network("demo-network", {
    ipRange: "10.0.1.0/24",
})

export const networkName = network.name;
