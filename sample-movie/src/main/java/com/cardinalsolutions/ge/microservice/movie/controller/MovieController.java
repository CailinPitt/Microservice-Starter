package com.cardinalsolutions.ge.microservice.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cardinalsolutions.ge.microservice.movie.dao.MovieRepository;
import com.cardinalsolutions.ge.microservice.movie.domain.Movie;
import com.cardinalsolutions.ge.microservice.movie.domain.MovieListResponse;
import com.cardinalsolutions.ge.microservice.movie.service.MovieService;

@RestController
@RefreshScope
public class MovieController {
	
	@Value("${movie.greeting}")
	private String movieGreeting;

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public String greeting(){
		return movieGreeting;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public MovieListResponse getAllMovies(){
		return new MovieListResponse(movieRepository.findAll());
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Movie getMovieById(@PathVariable long id) {
		return movieService.getMovieById(id);
	}
}
