package com.cardinalsolutions.ge.training.microservice.role.service;

import com.cardinalsolutions.ge.training.microservice.role.domain.Movie;

public interface MovieService {

	public Movie findMovie(long movieId);
}
