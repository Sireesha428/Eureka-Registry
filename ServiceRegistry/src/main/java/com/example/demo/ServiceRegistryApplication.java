package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//Indicates that this is a Spring Boot application and enables auto-configuration
@SpringBootApplication 
//Enables the Eureka server
@EnableEurekaServer 
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args); // Starts the Spring Boot application
	}

}
