// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package examples

import (
	"context"
	"testing"

	"github.com/stretchr/testify/require"

	provider "github.com/pulumi/pulumi-hcloud/provider"
	"github.com/pulumi/pulumi-hcloud/provider/pkg/version"
	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	testutils "github.com/pulumi/pulumi-terraform-bridge/testing/x"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

func TestRegress170(t *testing.T) {
	diff := `{
  "method": "/pulumirpc.ResourceProvider/Diff",
  "request": {
    "id": "29747477",
    "urn": "urn:pulumi:dev::ts::hcloud:index/server:Server::server",
    "olds": {
      "__meta": "{\"e2bfb730-ecaa-11e6-8f88-34363bc7c4c0\":{\"create\":5400000000000}}",
      "allowDeprecatedImages": false,
      "backupWindow": "",
      "backups": false,
      "datacenter": "hel1-dc2",
      "deleteProtection": false,
      "firewallIds": [],
      "id": "29747477",
      "ignoreRemoteFirewallIds": false,
      "image": "ubuntu-22.04",
      "ipv4Address": "95.216.195.228",
      "ipv6Address": "2a01:4f9:c011:9f50::1",
      "ipv6Network": "2a01:4f9:c011:9f50::/64",
      "keepDisk": false,
      "labels": {},
      "location": "hel1",
      "name": "server-7ed8ea4",
      "networks": [
        {
          "aliasIps": [],
          "ip": "10.0.1.2",
          "macAddress": "86:00:00:3b:a3:ed",
          "networkId": 2612654
        }
      ],
      "publicNets": [],
      "rebuildProtection": false,
      "serverType": "cx11",
      "sshKeys": [],
      "status": "running"
    },
    "news": {
      "__defaults": [
        "allowDeprecatedImages",
        "backups",
        "deleteProtection",
        "ignoreRemoteFirewallIds",
        "keepDisk",
        "name",
        "rebuildProtection"
      ],
      "allowDeprecatedImages": false,
      "backups": false,
      "deleteProtection": false,
      "ignoreRemoteFirewallIds": false,
      "image": "ubuntu-22.04",
      "keepDisk": false,
      "name": "server-7ed8ea4",
      "networks": [
        {
          "__defaults": [],
          "networkId": 2612654
        }
      ],
      "rebuildProtection": false,
      "serverType": "cx11"
    }
  },
  "response": {
    "stables": "*",
    "changes": "DIFF_NONE",
    "hasDetailedDiff": true
  },
  "metadata": {
    "kind": "resource",
    "mode": "client",
    "name": "hcloud"
  }
}`

	testutils.Replay(t, providerServer(t), diff)
}

func providerServer(t *testing.T) pulumirpc.ResourceProviderServer {
	ctx := context.Background()

	version.Version = "0.0.1"
	info := provider.Provider()
	info.Version = version.Version

	server, err := pf.MakeMuxedServer(ctx, "hcloud", info, []byte("{}"))(nil)
	require.NoError(t, err)

	return server
}
