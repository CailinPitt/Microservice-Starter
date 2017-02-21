package com.cardinalsolutions.ge.microservice.movie.service;

import com.cardinalsolutions.ge.microservice.movie.domain.Movie;

public interface MovieService {
	public Movie getMovieById(long id);
}
