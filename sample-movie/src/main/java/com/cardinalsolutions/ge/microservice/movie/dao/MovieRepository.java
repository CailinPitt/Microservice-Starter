package com.cardinalsolutions.ge.microservice.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cardinalsolutions.ge.microservice.movie.domain.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
