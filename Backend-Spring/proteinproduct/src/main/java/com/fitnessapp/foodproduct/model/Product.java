package com.fitnessapp.foodproduct.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proteinlist")
public class Product {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int stockId;
	private String productName;
	private String desc;
	private int price;
	private int proteinValue;
	private int total;
	
	public Product() {

	}
	
	public Product(int stockId, String productName, String desc, int price,int proteinValue,int total) {
		super();
		this.stockId = stockId;
		this.productName = productName;
		this.desc = desc;
		this.price = price;
		this.proteinValue = proteinValue;
		this.total = total;
	}
	
	public int getId() {
		return stockId;
	}
	public void setId(int id) {
		this.stockId = id;
	}
	public String getName() {
		return productName;
	}
	public void setName(String productName) {
		this.productName = productName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int getProtein() {
		return proteinValue;
	}

	public void setProtein(int proteinValue) {
		this.proteinValue = proteinValue;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
}
