package com.cardinalsolutions.ge.microservice.movie.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cardinalsolutions.ge.microservice.movie.domain.NoMovieException;

@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler(NoMovieException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> handleMovieNotFound(NoMovieException e) {
		return Collections.singletonMap("errorMessage", 
				"Movie " + e.getMovieId() + " not found.");
	}
}
