package com.sourav.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sourav.domain.Product;

@Repository(value = "productRepository")
@Scope(value = "singleton")
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	List<Product> findByName(String name);
	List<Product> findByBrand(String brand);
	List<Product> findByPrice(double price);
}
