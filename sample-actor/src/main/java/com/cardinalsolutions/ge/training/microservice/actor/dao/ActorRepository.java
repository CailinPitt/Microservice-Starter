package com.cardinalsolutions.ge.training.microservice.actor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cardinalsolutions.ge.training.microservice.actor.domain.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {

}
