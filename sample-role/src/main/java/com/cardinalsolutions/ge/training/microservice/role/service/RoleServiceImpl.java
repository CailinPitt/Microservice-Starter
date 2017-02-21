package com.cardinalsolutions.ge.training.microservice.role.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardinalsolutions.ge.training.microservice.role.dao.RoleRepository;
import com.cardinalsolutions.ge.training.microservice.role.domain.NoRoleException;
import com.cardinalsolutions.ge.training.microservice.role.domain.Role;
import com.cardinalsolutions.ge.training.microservice.role.domain.RoleDetail;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ActorService actorService;
	
	@Override
	public RoleDetail getRoleDetail(long roleId) {
		Role role = roleRepository.findOne(roleId);
		if(role == null){
			throw new NoRoleException(roleId);
		}
		RoleDetail roleDetail = new RoleDetail(role);
		roleDetail.setMovie(movieService.findMovie(role.getMovieId()));
		roleDetail.setActor(actorService.findActor(role.getActorId()));
		return roleDetail;
	}

	
}
