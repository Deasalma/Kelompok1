package com.crud.generic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.crud.generic.entity.baseEntity.GenericEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Product")
public class Product implements GenericEntity<Product>{
	@Id
	@GeneratedValue
	private Long id;
	private String nama;
	private int availability;
	private double price;
	private String typeproduct;

	@Override
	public void update(Product source) {
		this.nama = source.getNama();
		this.availability = source.getAvailability();
		this.price = source.getPrice();
		this.typeproduct = source.getTypeproduct();
	}
}
