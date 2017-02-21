package com.cardinalsolutions.ge.training.microservice.role;

import java.math.BigDecimal;

import javax.servlet.Filter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import com.cardinalsolutions.ge.training.microservice.role.dao.RoleRepository;
import com.cardinalsolutions.ge.training.microservice.role.domain.Role;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class RoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner preloadMovies(RoleRepository roleRepository) {
		return args -> {
			roleRepository.save(new Role(1l, 1l, 1l, "Louise Banks", new BigDecimal("1000000.00")));
			roleRepository.save(new Role(2l, 2l, 1l, "Ian Donnelly", new BigDecimal("1500000.00")));
			roleRepository.save(new Role(3l, 3l, 1l, "Colonel Weber", new BigDecimal("1500000.00")));
			roleRepository.save(new Role(4l, 4l, 3l, "Troy Maxson", new BigDecimal("900000.00")));
			roleRepository.save(new Role(5l, 5l, 3l, "Rose Maxson", new BigDecimal("1150000.00")));
			roleRepository.save(new Role(6l, 6l, 3l, "Jom Bono", new BigDecimal("150000.00")));
			roleRepository.save(new Role(7l, 7l, 2l, "Sebastian", new BigDecimal("1150000.00")));
			roleRepository.save(new Role(8l, 8l, 2l, "Mia", new BigDecimal("1500000.00")));
			roleRepository.save(new Role(9l, 9l, 4l, "Mike Rezendes", new BigDecimal("1150000.00")));
			roleRepository.save(new Role(10l, 10l, 4l, "Walter Robinson", new BigDecimal("150000.00")));
			roleRepository.save(new Role(11l, 11l, 4l, "Sacha Pfeiffer", new BigDecimal("1150000.00")));
			roleRepository.save(new Role(12l, 12l, 4l, "Marty Baron", new BigDecimal("1500000.00")));
			roleRepository.save(new Role(13l, 10l, 5l, "Riggan", new BigDecimal("1150000.00")));
			roleRepository.save(new Role(14l, 8l, 5l, "Sam", new BigDecimal("1500000.00")));
			roleRepository.save(new Role(15l, 13l, 6l, "Soloman Northup", new BigDecimal("3000000")));
			roleRepository.save(new Role(16l, 14l, 6l, "Uncle Abram", new BigDecimal("1990000.00")));
			roleRepository.save(new Role(17l, 8l, 7l, "Skeeter Phelan", new BigDecimal("2908000")));
			roleRepository.save(new Role(18l, 5l, 7l, "Aibileen Clark", new BigDecimal("700000")));
			roleRepository.save(new Role(19l, 16l, 7l, "Hilly Holbrook", new BigDecimal("1200000")));
			roleRepository.save(new Role(20l, 15l, 7l, "Minny Jackson", new BigDecimal("800000")));
			roleRepository.save(new Role(21l, 8l, 8l, "Hannah", new BigDecimal("1500000")));
			roleRepository.save(new Role(22l, 17l, 8l, "Cal", new BigDecimal("4000000")));
			roleRepository.save(new Role(23l, 7l, 8l, "Jacob", new BigDecimal("3000000")));
			roleRepository.save(new Role(24l, 18l, 8l, "Emily", new BigDecimal("2000000")));
			roleRepository.save(new Role(25l, 8l, 9l, "Wichita", new BigDecimal("1700000")));
			roleRepository.save(new Role(26l, 19l, 9l, "Columbus", new BigDecimal("2000000")));
			roleRepository.save(new Role(27l, 20l, 9l, "Tallahassee", new BigDecimal("1900000")));
			roleRepository.save(new Role(28l, 21l, 9l, "Little Rock", new BigDecimal("400000")));
			roleRepository.save(new Role(29l, 2l, 10l, "Aaron Cross", new BigDecimal("1250000")));
			roleRepository.save(new Role(30l, 22l, 10l, "Col Eric Byer, USAF, Ret.", new BigDecimal("1500000")));
			roleRepository.save(new Role(31l, 23l, 11l, "Jason Bourne", new BigDecimal("1250000")));
			roleRepository.save(new Role(32l, 24l, 11l, "Robert Dewey", new BigDecimal("1250000")));
			roleRepository.save(new Role(33l, 23l, 12l, "Mike McDermott", new BigDecimal("1000000")));
			roleRepository.save(new Role(34l, 22l, 12l, "Worm", new BigDecimal("1000000")));
			roleRepository.save(new Role(35l, 25l, 12l, "Jo", new BigDecimal("1000000")));
			roleRepository.save(new Role(36l, 11l, 13l, "Allie Calhoun", new BigDecimal("1300000")));
			roleRepository.save(new Role(36l, 7l, 13l, "Noah", new BigDecimal("1800000")));
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
