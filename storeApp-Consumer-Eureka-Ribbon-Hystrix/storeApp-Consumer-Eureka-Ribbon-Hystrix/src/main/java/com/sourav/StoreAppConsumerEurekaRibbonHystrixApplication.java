package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class StoreAppConsumerEurekaRibbonHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAppConsumerEurekaRibbonHystrixApplication.class, args);
		System.out.println("Server started....");
	}

}
