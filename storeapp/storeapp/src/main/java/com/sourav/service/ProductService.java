package com.sourav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.sourav.domain.Product;
import com.sourav.repository.ProductRepository;

@Service(value = "productService")
@Scope(value = "singleton")
public class ProductService implements IProductService{
	
	@Autowired
	@Qualifier(value = "productRepository")
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.saveAndFlush(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		return productRepository.findById(id).get();
	}

	@Override
	public void deleteProductById(Integer id) {
		productRepository.deleteById(id);
	}

	@Override
	public List<Product> findByName(String name) {
		return productRepository.findByName(name);
	}

	@Override
	public List<Product> findByBrand(String brand) {
		System.out.println(productRepository.findByBrand(brand));
		System.out.println("Hii");
		return productRepository.findByBrand(brand);
	}

	@Override
	public List<Product> findByPrice(Double price) {
		return productRepository.findByPrice(price);
	}
}
