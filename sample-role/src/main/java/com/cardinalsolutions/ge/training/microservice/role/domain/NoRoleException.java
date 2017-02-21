package com.cardinalsolutions.ge.training.microservice.role.domain;

public class NoRoleException extends RuntimeException {

	private static final long serialVersionUID = -8012324249974425115L;
	private long roleId;
	
	public NoRoleException(long roleId){
		this.roleId = roleId;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
}
