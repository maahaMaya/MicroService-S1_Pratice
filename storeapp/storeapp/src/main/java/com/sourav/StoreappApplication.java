package com.sourav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.sourav.domain.Product;
import com.sourav.repository.ProductRepository;

@EnableEurekaClient
@SpringBootApplication
public class StoreappApplication implements CommandLineRunner{

	@Autowired
	@Qualifier(value = "productRepository")
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StoreappApplication.class, args);
		System.out.println("Server Started...");
	}

	//after the execution of Main method
	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product("TV", "LG", 666));
		productRepository.save(new Product( "Mobile", "Apple", 6226));
		productRepository.save(new Product("Camera", "LG", 1236));
		productRepository.save(new Product("Earphone", "Sony", 666));
	}
}
