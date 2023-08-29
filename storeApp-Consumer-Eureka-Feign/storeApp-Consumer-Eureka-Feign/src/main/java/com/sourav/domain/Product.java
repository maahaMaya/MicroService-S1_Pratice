package com.sourav.domain;

public class Product {

	private Integer id;

	private String name;

	private String brand;

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
