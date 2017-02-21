package com.cardinalsolutions.ge.training.microservice.genre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cardinalsolutions.ge.training.microservice.genre.dao.GenreRepository;
import com.cardinalsolutions.ge.training.microservice.genre.domain.Genre;
import com.cardinalsolutions.ge.training.microservice.genre.domain.GenreListResponse;

@RestController
public class GenreController {
	
	@Autowired
	private GenreRepository genreRepository;
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public GenreListResponse getAllGenres(){
		GenreListResponse response = new GenreListResponse();
		response.setGenres(genreRepository.findAll());
		return response;
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public Genre getGenreById(@PathVariable long id) {
		return genreRepository.findOne(id);
	}
}
