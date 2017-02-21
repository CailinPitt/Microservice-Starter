package com.cardinalsolutions.ge.microservice.movie;

import javax.servlet.Filter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import com.cardinalsolutions.ge.microservice.movie.dao.MovieRepository;
import com.cardinalsolutions.ge.microservice.movie.domain.Movie;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieApplication {

	@Bean
	public CommandLineRunner runner(MovieRepository movieRepository) {
		return args -> {
			movieRepository.save(new Movie(1l, "Arrival", 2016, "https://upload.wikimedia.org/wikipedia/en/archive/d/df/20161020171048!Arrival,_Movie_Poster.jpg", "When twelve mysterious spacecraft appear around the world, linguistics professor Louise Banks is tasked with interpreting the language of the apparent alien visitors.", 5l));
			movieRepository.save(new Movie(2l, "La La Land", 2016, "https://images-na.ssl-images-amazon.com/images/M/MV5BMzUzNDM2NzM2MV5BMl5BanBnXkFtZTgwNTM3NTg4OTE@._V1_UX182_CR0,0,182,268_AL_.jpg", "A jazz pianist falls for an aspiring actress in Los Angeles.", 1l));
			movieRepository.save(new Movie(3l, "Fences", 2016, "https://upload.wikimedia.org/wikipedia/en/0/0d/Fences_(film).png", "A working-class African-American father tries to raise his family in the 1950s, while coming to terms with the events of his life.", 4l));
			movieRepository.save(new Movie(4l, "Spotlight", 2015, "https://upload.wikimedia.org/wikipedia/en/f/f3/Spotlight_(film)_poster.jpg", "The true story of how the Boston Globe uncovered the massive scandal of child molestation and cover-up within the local Catholic Archdiocese, shaking the entire Catholic Church to its core.", 4l));
			movieRepository.save(new Movie(5l, "Birdman", 2014, "https://upload.wikimedia.org/wikipedia/en/thumb/6/63/Birdman_poster.png/220px-Birdman_poster.png", "Illustrated upon the progress of his latest Broadway play, a former popular actor's struggle to cope with his current life as a wasted actor is shown.", 1l));
			movieRepository.save(new Movie(6l, "12 Years a Slave", 2013, "https://upload.wikimedia.org/wikipedia/en/5/5c/12_Years_a_Slave_film_poster.jpg", "In the antebellum United States, Solomon Northup, a free black man from upstate New York, is abducted and sold into slavery.", 4l));
			movieRepository.save(new Movie(7l, "The Help", 2011, "https://upload.wikimedia.org/wikipedia/en/b/b5/Help_poster.jpg", "An aspiring author during the civil rights movement of the 1960s decides to write a book detailing the African American maids' point of view on the white families for which they work, and the hardships they go through on a daily basis.", 4l));
			movieRepository.save(new Movie(8l, "Crazy, Stupid, Love", 2011, "https://images-na.ssl-images-amazon.com/images/M/MV5BMTg2MjkwMTM0NF5BMl5BanBnXkFtZTcwMzc4NDg2NQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", "A middle-aged husband's life changes dramatically when his wife asks him for a divorce. He seeks to rediscover his manhood with the help of a newfound friend, Jacob, learning to pick up girls at bars.", 1l));
			movieRepository.save(new Movie(9l, "Zombieland", 2009, "https://images-na.ssl-images-amazon.com/images/I/51Mmdh1Ud8L.jpg", "A shy student trying to reach his family in Ohio, a gun-toting tough guy trying to find the last Twinkie, and a pair of sisters trying to get to an amusement park join forces to travel across a zombie-filled America.", 1l));
			movieRepository.save(new Movie(10l, "The Bourne Legacy", 2012, "https://images-na.ssl-images-amazon.com/images/M/MV5BMTc4Njk3MDM1Nl5BMl5BanBnXkFtZTcwODgyOTMxOA@@._V1_UX182_CR0,0,182,268_AL_.jpg", "An expansion of the universe from Robert Ludlum's novels, centered on a new hero whose stakes have been triggered by the events of the previous three films.", 3l));
			movieRepository.save(new Movie(11l, "Jason Bourne", 2016, "http://cdn1-www.comingsoon.net/assets/uploads/gallery/jason-bourne/jason_bourne_ver3_xlg.jpg", "The CIA's most dangerous former operative is drawn out of hiding to uncover more explosive truths about his past.", 3l));
			movieRepository.save(new Movie(12l, "Rounders", 1998, "https://images-na.ssl-images-amazon.com/images/M/MV5BMTc4OTcxNDY2Nl5BMl5BanBnXkFtZTgwNDg0MzkxMDE@._V1_UY1200_CR87,0,630,1200_AL_.jpg", "A young man is a reformed gambler who must return to playing big stakes poker to help a friend pay off loan sharks.", 4l));
			movieRepository.save(new Movie(13l, "The Notebook", 2004, "https://images-na.ssl-images-amazon.com/images/M/MV5BMTk3OTM5Njg5M15BMl5BanBnXkFtZTYwMzA0ODI3._V1_UY1200_CR90,0,630,1200_AL_.jpg", "A poor yet passionate young man falls in love with a rich young woman, giving her a sense of freedom, but they are soon separated because of their social differences.", 4l));
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
	
	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}
}
