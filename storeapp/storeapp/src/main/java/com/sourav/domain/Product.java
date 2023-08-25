package com.sourav.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_details")
public class Product {

	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "product_name")
	private String name;
	
	@Column(name = "product_brand")
	private String brand;
	
	@Column(name = "product_price")
	private double price;

	public Product(String name, String brand, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public Product() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
