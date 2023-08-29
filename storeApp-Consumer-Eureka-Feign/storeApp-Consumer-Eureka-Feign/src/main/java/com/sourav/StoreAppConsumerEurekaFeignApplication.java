package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class StoreAppConsumerEurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAppConsumerEurekaFeignApplication.class, args);
		System.out.println("Server Started....");
	}

}
