package com.crud.generic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.crud.generic.entity.baseEntity.BaseEntity;

@Entity
@Table(name = "Product")

public class Product extends BaseEntity{
	@Column(name = "availability", nullable = false, length = 200)
	private int availability;
	private double price;
	private String typeproduct;
	
	public Product() {
		super();		
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getTypeproduct() {
		return typeproduct;
	}

	public void setTypeproduct(String typeproduct) {
		this.typeproduct = typeproduct;
	}

}
