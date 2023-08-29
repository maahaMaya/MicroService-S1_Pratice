package com.sourav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sourav.domain.Product;
import com.sourav.service.ProductService;

@RestController
@Scope("request")
public class ProductClientController {
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/getProduct/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		return productService.getProductById(id);
	}
}
