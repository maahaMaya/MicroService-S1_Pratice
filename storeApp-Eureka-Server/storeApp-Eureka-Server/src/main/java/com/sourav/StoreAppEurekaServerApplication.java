package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StoreAppEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAppEurekaServerApplication.class, args);
		System.out.println("Server started");
	}

}
