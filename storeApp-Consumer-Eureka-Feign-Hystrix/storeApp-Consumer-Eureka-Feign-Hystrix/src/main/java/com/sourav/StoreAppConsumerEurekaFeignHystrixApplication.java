package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
public class StoreAppConsumerEurekaFeignHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAppConsumerEurekaFeignHystrixApplication.class, args);
		System.out.println("server started...");
	}

}
