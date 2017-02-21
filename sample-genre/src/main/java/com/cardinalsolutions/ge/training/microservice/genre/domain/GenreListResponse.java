package com.cardinalsolutions.ge.training.microservice.genre.domain;

import java.util.List;

public class GenreListResponse {

	private List<Genre> genres;

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
}
