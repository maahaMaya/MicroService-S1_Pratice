package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableFeignClients
@SpringBootApplication
public class StoreAppCoEFeignResilience4JSleuthZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAppCoEFeignResilience4JSleuthZipkinApplication.class, args);
		System.out.println("Server Started...");
	}
	
	@Bean
	public Sampler getSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
