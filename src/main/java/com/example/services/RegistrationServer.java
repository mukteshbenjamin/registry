package com.example.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Import;

import com.example.EurekaConfiguration;

/**
 * @author muktesh
 *
 */
@SpringBootApplication
@EnableEurekaServer
@Import(EurekaConfiguration.class)
public class RegistrationServer {

	
	public static void main(String args[]){
		System.setProperty("spring.config.name", "registration-server");
		SpringApplication.run(RegistrationServer.class, args);
	}
}
