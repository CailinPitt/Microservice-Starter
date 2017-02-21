package com.cardinalsolutions.ge.training.microservice.genre.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cardinalsolutions.ge.training.microservice.genre.domain.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
