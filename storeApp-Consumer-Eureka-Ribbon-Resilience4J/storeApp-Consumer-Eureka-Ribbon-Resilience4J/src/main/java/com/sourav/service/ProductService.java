package com.sourav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sourav.domain.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ProductService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	 @CircuitBreaker(name = "product-service", fallbackMethod = "fallbackMethodGetProductById")
	public Product getProductById(int id) {
		Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/product/" + id, Product.class);
		return product;
	}
	
	public Product fallbackMethodGetProductById(int id, Throwable cause) {
		System.out.println("Exception raise with some message:===> "+ cause.getMessage());
		return new Product(id, "Monitor", "Jio", 2669.00);
	}
}
