package com.cardinalsolutions.ge.training.microservice.role.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cardinalsolutions.ge.training.microservice.role.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	public List<Role> findByMovieId(Long movieId);
}
