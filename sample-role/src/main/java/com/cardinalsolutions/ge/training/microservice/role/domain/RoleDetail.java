package com.cardinalsolutions.ge.training.microservice.role.domain;

import java.math.BigDecimal;

public class RoleDetail {

	private long id;
	private String characterName;
	private BigDecimal salary;
	private Movie movie;
	private Actor actor;
	
	public RoleDetail() { }
	
	public RoleDetail(Role role){
		this.id = role.getId();
		this.characterName = role.getCharacterName();
		this.salary = role.getSalary();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

}
