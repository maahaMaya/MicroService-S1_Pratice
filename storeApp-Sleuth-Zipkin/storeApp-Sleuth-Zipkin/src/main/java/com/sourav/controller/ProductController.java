package com.sourav.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sourav.domain.Product;
import com.sourav.service.IProductService;

@RestController
@Scope(value = "request")
public class ProductController {
	
	@Autowired
	@Qualifier("productService")
	private IProductService productService;
	
	private Logger log =LoggerFactory.getLogger(ProductController.class);
	
	@PostMapping(value = "/product", produces = {MediaType.APPLICATION_JSON_VALUE},  consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.CREATED)
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@PutMapping(value = "/product", produces = {MediaType.APPLICATION_JSON_VALUE},  consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.OK)
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@DeleteMapping(value = "/product/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteProduct(@PathVariable("id") Integer id) {
		productService.deleteProductById(id);
	}
	
	@GetMapping(value = "/product", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.OK)
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}
	
	@GetMapping(value = "/product/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Product getProductById(@PathVariable("id") Integer id) {
		log.debug("In getProduct by id : " + id);
		Product product  = productService.getProductById(id);
		log.debug("In getProduct with return value : " + product);
		return product;
	}
	
	@GetMapping(value = "/product/name/{name}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> findByName(@PathVariable("name") String name) {
		return productService.findByName(name);
	}
	
	@GetMapping(value = "/product/brand/{brand}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> findByBrand(@PathVariable("brand") String brand) {
		return productService.findByBrand(brand);
	}
	
	@GetMapping(value = "/product/price/{price}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Product> findByName(@PathVariable("price") Double price) {
		return productService.findByPrice(price);
	}
}
