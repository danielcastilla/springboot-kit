package com.sngular.formacion.products;

import org.springframework.data.annotation.Id;

public class Product {

	@Id
	private String id;
	private String name;
	private String desc;
	private Double price;
	
	
	public Product(String id, String name, String desc, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public Product setId(String id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Product setName(String name) {
		this.name = name;
		return this;
	}
	public String getDesc() {
		return desc;
	}
	public Product setDesc(String desc) {
		this.desc = desc;
		return this;
	}
	public Double getPrice() {
		return price;
	}
	public Product setPrice(Double price) {
		this.price = price;
		return this;
	}

	
}