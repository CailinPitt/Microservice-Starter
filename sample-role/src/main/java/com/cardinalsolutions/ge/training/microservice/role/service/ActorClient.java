package com.cardinalsolutions.ge.training.microservice.role.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cardinalsolutions.ge.training.microservice.role.domain.Actor;

@FeignClient("actor")
public interface ActorClient {

	@RequestMapping("/{id}")
	public Actor findActor(@PathVariable("id") long id);
}
