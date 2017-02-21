package com.cardinalsolutions.ge.training.microservice.actor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cardinalsolutions.ge.training.microservice.actor.dao.ActorRepository;
import com.cardinalsolutions.ge.training.microservice.actor.domain.Actor;
import com.cardinalsolutions.ge.training.microservice.actor.domain.ActorListResponse;

@RestController
public class ActorController {

	@Autowired
	private ActorRepository actorRepository;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ActorListResponse getAllActors(){
		return new ActorListResponse(actorRepository.findAll());
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Actor getActorById(@PathVariable long id){
		return actorRepository.findOne(id);
	}
}
