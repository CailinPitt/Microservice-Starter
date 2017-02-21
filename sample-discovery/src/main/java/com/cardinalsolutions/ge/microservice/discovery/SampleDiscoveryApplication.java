package com.cardinalsolutions.ge.microservice.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SampleDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDiscoveryApplication.class, args);
	}
}
