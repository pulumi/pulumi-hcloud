module github.com/pulumi/pulumi-hcloud/provider

go 1.16

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 latest
)

require (
	cloud.google.com/go/kms v1.1.0 // indirect
	github.com/hashicorp/terraform-plugin-sdk v1.15.0 // indirect
	github.com/hetznercloud/terraform-provider-hcloud v1.33.2
	github.com/pulumi/pulumi-terraform-bridge/v3 cf03c319bea0537ea8787f1cdeaefa5d942eece1
	github.com/pulumi/pulumi/sdk/v3 v3.33.1
)
