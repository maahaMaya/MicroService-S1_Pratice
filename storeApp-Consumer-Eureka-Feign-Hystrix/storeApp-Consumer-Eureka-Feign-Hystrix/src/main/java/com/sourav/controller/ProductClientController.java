package com.sourav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sourav.domain.Product;
import com.sourav.proxy.ProductServiceProxy;

@RestController
@Scope("request")
public class ProductClientController {
	
	@Autowired
	private ProductServiceProxy productServiceProxy;
	
	@GetMapping("/getProduct/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		Product product = productServiceProxy.getProductById(id);
		return product;
	}
	
	@GetMapping("/getProduct")
	public List<Product> getAllProduct() {
		List<Product> product = productServiceProxy.getAllProduct();
		return product;
	}
}
