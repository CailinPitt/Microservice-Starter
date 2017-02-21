package com.cardinalsolutions.ge.microservice.movie.domain;

public class NoMovieException extends RuntimeException {

	private static final long serialVersionUID = 4293562235190476614L;
	private long movieId;
	
	public NoMovieException(long movieId) {
		super("Movie id " + movieId + " not found");
		this.movieId = movieId;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
}
