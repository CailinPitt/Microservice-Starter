package com.cardinalsolutions.ge.training.microservice.role.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardinalsolutions.ge.training.microservice.role.domain.Actor;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HystrixDelegatingActorService implements ActorService {

	@Autowired
	private ActorClient actorClient;
	
	@HystrixCommand(fallbackMethod="findActorFallback")
	@Override
	public Actor findActor(long actorId) {
		return actorClient.findActor(actorId);
	}
	
	protected Actor findActorFallback(long actorId){
		Actor a = new Actor();
		a.setId(actorId);
		return a;
	}

	
}
