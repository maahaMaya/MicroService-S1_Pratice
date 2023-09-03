package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
public class StoreAppCoERibbonResilience4JSleuthZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAppCoERibbonResilience4JSleuthZipkinApplication.class, args);
		System.out.println("Server started....");
	}
	
	@Bean
	public Sampler getSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
