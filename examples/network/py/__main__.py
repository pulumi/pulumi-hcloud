"""A Python Pulumi program"""

import pulumi
import pulumi_hcloud as hcloud

network = hcloud.Network("demo-network", 
                         ip_range="10.0.1.0/24")

pulumi.export('network_name', network.name)
