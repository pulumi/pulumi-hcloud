package hcloud

import (
	"testing"

	"github.com/stretchr/testify/require"
)

func TestNonStringIDOverridesRunBeforeDefaultFixups(t *testing.T) {
	prov := provider("1.35.0")
	res := prov.Resources["hcloud_primary_ip"]
	require.NotNil(t, res)
	require.NotNil(t, res.Fields["id"])
	require.Equal(t, "string", string(res.Fields["id"].Type))
	require.Nil(t, res.ComputeID)
}
