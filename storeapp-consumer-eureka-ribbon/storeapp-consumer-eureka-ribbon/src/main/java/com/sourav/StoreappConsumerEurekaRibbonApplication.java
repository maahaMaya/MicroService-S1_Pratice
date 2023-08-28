package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StoreappConsumerEurekaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappConsumerEurekaRibbonApplication.class, args);
		System.out.println("Server started....");
	}

}
