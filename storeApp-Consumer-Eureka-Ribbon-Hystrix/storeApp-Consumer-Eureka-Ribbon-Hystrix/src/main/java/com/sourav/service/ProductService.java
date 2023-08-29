package com.sourav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sourav.domain.Product;

@Service
public class ProductService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "fallbackMethodGetProductById")
	public Product getProductById(int id) {
		Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/product/" + id, Product.class);
		return product;
	}
	
	public Product fallbackMethodGetProductById(int id) {
		return new Product(id, "Monitor", "Jio", 2669.00);
	}
}
