package com.cardinalsolutions.ge.training.microservice.role.domain;

import java.util.List;

public class RolesResponse {

	private List<Role> roles;
	
	public RolesResponse() { }
	
	public RolesResponse(List<Role> roles) {
		this.roles = roles;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
