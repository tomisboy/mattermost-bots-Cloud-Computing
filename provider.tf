terraform {
  required_providers {
    openstack = {
      source = "terraform-provider-openstack/openstack"
    }
  }
}
provider "openstack" {
  cloud      = "openstack" //uses the ~/.config/openstack/clouds.yaml file
}

