package com.sourav.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sourav.domain.Product;
import com.sourav.proxy.ProductServiceProxy;

@Component
public class ProductServiceFallback implements ProductServiceProxy{

	@Override
	public List<Product> getAllProduct() {
		return new ArrayList<Product>();
	}

	@Override
	public Product getProductById(Integer id) {
		return new Product(id, "Monitor", "Jio", 2669.00);
	}

}
