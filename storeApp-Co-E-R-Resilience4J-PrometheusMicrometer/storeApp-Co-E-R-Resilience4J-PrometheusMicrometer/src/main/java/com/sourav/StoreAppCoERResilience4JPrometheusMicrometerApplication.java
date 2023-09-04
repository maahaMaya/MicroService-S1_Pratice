package com.sourav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
public class StoreAppCoERResilience4JPrometheusMicrometerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreAppCoERResilience4JPrometheusMicrometerApplication.class, args);
		System.out.println("Server started....");
	}
	
	@Bean
	public TimedAspect timedAspect(MeterRegistry meterRegistry) {
		return new TimedAspect(meterRegistry);
	}

}
