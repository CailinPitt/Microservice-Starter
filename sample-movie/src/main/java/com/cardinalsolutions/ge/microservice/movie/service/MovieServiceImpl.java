package com.cardinalsolutions.ge.microservice.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardinalsolutions.ge.microservice.movie.dao.MovieRepository;
import com.cardinalsolutions.ge.microservice.movie.domain.Movie;
import com.cardinalsolutions.ge.microservice.movie.domain.NoMovieException;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public Movie getMovieById(long id) {
		Movie m = movieRepository.findOne(id);
		if (m == null){
			throw new NoMovieException(id);
		}
		return m;
	}

}
