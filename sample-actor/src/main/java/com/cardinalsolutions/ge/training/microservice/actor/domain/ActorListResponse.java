package com.cardinalsolutions.ge.training.microservice.actor.domain;

import java.util.List;

public class ActorListResponse {

	private List<Actor> actors;
	
	public ActorListResponse() { }
	
	public ActorListResponse(List<Actor> actors) {
		this.actors = actors;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
}
