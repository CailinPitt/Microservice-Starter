package com.cardinalsolutions.ge.training.microservice.actor;

import javax.servlet.Filter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import com.cardinalsolutions.ge.training.microservice.actor.dao.ActorRepository;
import com.cardinalsolutions.ge.training.microservice.actor.domain.Actor;

@SpringBootApplication
@EnableDiscoveryClient
public class ActorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActorApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner preloadMovies(ActorRepository actorRepository) {
		return args -> {
			actorRepository.save(new Actor(1l, "Amy", "Adams", "1974"));
			actorRepository.save(new Actor(2l, "Jeremy", "Renner", "1971"));
			actorRepository.save(new Actor(3l, "Forest", "Whitaker", "1961"));
			actorRepository.save(new Actor(4l, "Denzel", "Washington", "1954"));
			actorRepository.save(new Actor(5l, "Viola", "Davis", "1965"));
			actorRepository.save(new Actor(6l, "Stephen", "Henderson", "1949"));
			actorRepository.save(new Actor(7l, "Ryan", "Gosling", "1980"));
			actorRepository.save(new Actor(8l, "Emma", "Stone", "1988"));
			actorRepository.save(new Actor(9l, "Mark", "Ruffalo", "1967"));
			actorRepository.save(new Actor(10l, "Michael", "Keaton", "1951"));
			actorRepository.save(new Actor(11l, "Rachel", "McAdams", "1978"));
			actorRepository.save(new Actor(12l, "Liev", "Schreiber", "1967"));
			actorRepository.save(new Actor(13l, "Chiwetel", "Ejiofor", "1977"));
			actorRepository.save(new Actor(14l, "Dwight", "Henry", "1962"));
			actorRepository.save(new Actor(15l, "Octavia", "Spencer", "1970"));
			actorRepository.save(new Actor(16l, "Bryce", "Dallas Howard", "1981"));
			actorRepository.save(new Actor(17l, "Steve", "Carell", "1962"));
			actorRepository.save(new Actor(18l, "Julianne", "Moore", "1960"));
			actorRepository.save(new Actor(19l, "Jesse", "Eisenberg", "1983"));
			actorRepository.save(new Actor(20l, "Woody", "Harrelson", "1961"));
			actorRepository.save(new Actor(21l, "Abigail", "Breslin", "1996"));
			actorRepository.save(new Actor(22l, "Edward", "Norton", "1969"));
			actorRepository.save(new Actor(23l, "Matt", "Damon", "1970"));
			actorRepository.save(new Actor(24l, "Tommy Lee", "Jones", "1946"));
			actorRepository.save(new Actor(25l, "Gretchen", "Mol", "1972"));
			
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
