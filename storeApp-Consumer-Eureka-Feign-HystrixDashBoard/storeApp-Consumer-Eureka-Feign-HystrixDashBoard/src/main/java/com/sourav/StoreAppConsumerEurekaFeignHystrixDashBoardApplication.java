package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class StoreAppConsumerEurekaFeignHystrixDashBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAppConsumerEurekaFeignHystrixDashBoardApplication.class, args);
		System.out.println("Server started..");
	}

}
