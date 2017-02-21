package com.cardinalsolutions.ge.training.microservice.genre;

import javax.servlet.Filter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import com.cardinalsolutions.ge.training.microservice.genre.dao.GenreRepository;
import com.cardinalsolutions.ge.training.microservice.genre.domain.Genre;

@SpringBootApplication
@EnableDiscoveryClient
public class GenreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner preloadMovies(GenreRepository genreRepository) {
		return args -> {
			genreRepository.save(new Genre(1l, "Comedy", "For funny movies"));
			genreRepository.save(new Genre(2l, "Tragedy", "In the Greek tradition."));
			genreRepository.save(new Genre(3l, "Thriller", "Not Michael Jackson"));
			genreRepository.save(new Genre(4l, "Drama", "Very Dramatic."));
			genreRepository.save(new Genre(5l, "Science Fiction", "With aliens or killer robots or River Tam."));
		};
	}
	
	@Bean
	public Filter logFilter() {
	    CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
	    filter.setIncludeClientInfo(true);
	    filter.setIncludeQueryString(true);
	    filter.setIncludePayload(true);
	    filter.setMaxPayloadLength(5120);
	    return filter;
	}
}
