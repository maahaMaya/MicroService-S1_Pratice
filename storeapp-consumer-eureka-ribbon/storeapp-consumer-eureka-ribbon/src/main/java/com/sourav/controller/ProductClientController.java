package com.sourav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sourav.domain.Product;

@RestController
@Scope("request")
public class ProductClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/getProduct/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/product/" + id, Product.class);
		return product;
	}
}
