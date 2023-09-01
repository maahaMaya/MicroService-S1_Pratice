package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class StoreAppConsumerEurekaFeignResilience4JApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAppConsumerEurekaFeignResilience4JApplication.class, args);
		System.out.println("Server Started...");
	}

}
