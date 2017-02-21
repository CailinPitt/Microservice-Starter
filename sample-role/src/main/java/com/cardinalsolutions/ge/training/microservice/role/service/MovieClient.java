package com.cardinalsolutions.ge.training.microservice.role.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cardinalsolutions.ge.training.microservice.role.domain.Movie;

@FeignClient("movie")
public interface MovieClient {

	@RequestMapping("/{id}")
	public Movie findMovie(@PathVariable("id") long id);
}
