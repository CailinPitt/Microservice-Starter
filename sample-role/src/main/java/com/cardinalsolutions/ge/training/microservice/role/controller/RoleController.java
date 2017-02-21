package com.cardinalsolutions.ge.training.microservice.role.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cardinalsolutions.ge.training.microservice.role.dao.RoleRepository;
import com.cardinalsolutions.ge.training.microservice.role.domain.RoleDetail;
import com.cardinalsolutions.ge.training.microservice.role.domain.RolesResponse;
import com.cardinalsolutions.ge.training.microservice.role.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public RolesResponse getAllRoles() {
		return new RolesResponse(roleRepository.findAll());
	}
	
	@RequestMapping(value="/movie/{movieId}", method=RequestMethod.GET)
	public RolesResponse getRolesForMovie(@PathVariable long movieId) {
		return new RolesResponse(roleRepository.findByMovieId(movieId));
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public RoleDetail getRoleDetail(@PathVariable long id){
		return roleService.getRoleDetail(id);
	}
}
