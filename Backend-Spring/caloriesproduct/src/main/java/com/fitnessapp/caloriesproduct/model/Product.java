package com.fitnessapp.caloriesproduct.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calories")
public class Product {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int foodId;
	private String foodName;
	private String desc;
	private int price;
	private int caloriesValue;
	
	public Product() {

	}
	
	public Product(int foodId, String foodName, String desc, int price,int caloriesValue) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.desc = desc;
		this.price = price;
		this.caloriesValue = caloriesValue;
	}
	
	public int getId() {
		return foodId;
	}
	public void setId(int id) {
		this.foodId = id;
	}
	public String getName() {
		return foodName;
	}
	public void setName(String foodName) {
		this.foodName = foodName;
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
		return caloriesValue;
	}

	public void setProtein(int caloriesValue) {
		this.caloriesValue = caloriesValue;
	}

	
	
	
}
