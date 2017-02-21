package com.cardinalsolutions.ge.training.microservice.role.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardinalsolutions.ge.training.microservice.role.domain.Movie;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HystrixDelegatingMovieService implements MovieService {

	@Autowired
	private MovieClient movieClient;
	
	@HystrixCommand(fallbackMethod="findMovieFallback")
	@Override
	public Movie findMovie(long movieId) {
		return movieClient.findMovie(movieId);
	}
	
	protected Movie findMovieFallback(long movieId){
		Movie m = new Movie();
		m.setId(movieId);
		return m;
	}

}
