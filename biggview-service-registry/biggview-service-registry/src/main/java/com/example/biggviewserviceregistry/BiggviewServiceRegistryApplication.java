package com.example.biggviewserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BiggviewServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiggviewServiceRegistryApplication.class, args);
	}

}
