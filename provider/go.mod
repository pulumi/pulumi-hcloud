module github.com/pulumi/pulumi-hcloud/provider

go 1.16

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-exec => github.com/hashicorp/terraform-exec v0.15.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20220505215311-795430389fa7
)

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0 // indirect
	github.com/hetznercloud/terraform-provider-hcloud v1.35.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.24.1
	github.com/pulumi/pulumi/sdk/v3 v3.33.1
)
