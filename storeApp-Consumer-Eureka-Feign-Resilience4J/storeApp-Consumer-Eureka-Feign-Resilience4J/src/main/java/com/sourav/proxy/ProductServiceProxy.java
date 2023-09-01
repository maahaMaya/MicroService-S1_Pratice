package com.sourav.proxy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sourav.domain.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient(name = "product-service")
public interface ProductServiceProxy {
	
	@CircuitBreaker(name = "product-service", fallbackMethod = "fallbackMethodGetAllProduct")
	@GetMapping(value = "/product", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> getAllProduct();
	
	@CircuitBreaker(name = "product-service", fallbackMethod = "fallbackMethodGetProductById")
	@GetMapping(value = "/product/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Product getProductById(@PathVariable("id") Integer id);
	
	public default List<Product> fallbackMethodGetAllProduct() {
		return new ArrayList<Product>();
	}

	public default Product fallbackMethodGetProductById(Integer id, Throwable cause) {
		System.out.println("Exception raise with message:===> "+ cause.getMessage());
		return new Product(id, "Monitor", "Jio", 2669.00);
	}
}
