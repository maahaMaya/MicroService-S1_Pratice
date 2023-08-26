package com.sourav.storeappConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class StoreappConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappConfigServerApplication.class, args);
		System.out.println("Server started");
	}
}
