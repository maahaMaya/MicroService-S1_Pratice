package com.sourav.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private Logger log = LoggerFactory.getLogger(ProductClientController.class);
	
	@GetMapping("/getProduct/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		log.debug("In getProductById with Id: " + id);
		Product product = productServiceProxy.getProductById(id);
		log.debug("In getProductById with return value Product " + product);
		return product;
	}
	
	@GetMapping("/getProduct")
	public List<Product> getAllProduct() {
		List<Product> product = productServiceProxy.getAllProduct();
		return product;
	}
}
