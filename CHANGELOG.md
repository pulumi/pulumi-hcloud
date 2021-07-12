CHANGELOG
=========

## HEAD (Unreleased)
_(none)_

---

## 1.1.1 (2021-07-12)
* Upgrade to v1.27.2 of the Hetzner Cloud Terraform Provider

## 1.1.0 (2021-06-28)
* Upgrade to v1.27.0 of the Hetzner Cloud Terraform Provider

## 1.0.1 (2021-06-14)
* Upgrade to v1.26.2 of the Hetzner Cloud Terraform Provider

## 1.0.0 (2021-04-19)
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 0.8.0 (2021-04-12)
* Upgrade to v1.26.0 of the Hetzner Cloud Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.23.0

## 0.7.1 (2021-03-23)
* Upgrade to v1.25.2 of the Hetzner Cloud Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 0.7.0 (2021-03-16)
* Upgrade to v1.25.1 of the Hetzner Cloud Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 0.6.2 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider

## 0.6.1 (2021-02-08)
* Upgrade to v1.24.1 of the Hetzner Cloud Terraform Provider

## 0.6.0 (2021-02-01)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 0.5.1 (2021-01-13)
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 0.5.0 (2021-01-12)
* Upgrade to v1.24.0 of the Hetzner Cloud Terraform Provider

## 0.4.1 (2021-01-05)
* Upgrade to v1.23.0 of the Hetzner Cloud Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.13.2
  * This adds support for import specific examples in documentation

## 0.4.0 (2020-10-26)
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 0.3.0 (2020-10-06)
* Upgrade to v1.22.0 of the Hetzner Cloud Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.8.0
* Upgrade to Pulumi v2.10.0

## 0.2.0 (2020-09-11)
* Upgrade to v1.21.0 of the Hetzner Cloud Terraform Provider

## 0.1.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 0.0.3 (2020-07-10)
* Upgrade to v1.19.0 of the Hetzner Cloud Terraform Provider

## 0.0.2 (2020-07-07)
* Upgrade to v1.18.1 of the Hetzner Cloud Terraform Provider

## 0.0.1 (2020-07-02)
* Initial creation of the provider using v1.18.0 of the Hetzner Cloud Terraform Provider
