import * as hcloud from "@pulumi/hcloud";

const network = new hcloud.Network("network", {
  ipRange: "10.0.1.0/24",
});

const subnet = new hcloud.NetworkSubnet("subnet", {
  networkId: network.id.apply(Number),
  ipRange: "10.0.1.0/24",
  networkZone: "eu-central",
  type: "cloud",
});

new hcloud.Server("server", {
    serverType: "cx22",
    image: "ubuntu-22.04",
    networks: [{ networkId: network.id.apply(Number) }],
}, {dependsOn: subnet});
