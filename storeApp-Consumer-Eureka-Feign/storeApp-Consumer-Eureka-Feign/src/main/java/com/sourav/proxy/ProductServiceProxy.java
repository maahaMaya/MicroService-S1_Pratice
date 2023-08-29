package com.sourav.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sourav.domain.Product;

@FeignClient("product-service")
public interface ProductServiceProxy {
	
	@GetMapping(value = "/product", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> getAllProduct();
	
	@GetMapping(value = "/product/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Product getProductById(@PathVariable("id") Integer id);
}
