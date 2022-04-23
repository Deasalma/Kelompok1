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
@Table(name = "Customer")
public class Customer implements GenericEntity<Customer> {
	@Id
	@GeneratedValue
	private Long id;
	private String nama;
	private long noHp;
	private String address;
	

	@Override
	public void update(Customer source) {
		this.nama = source.getNama();
		this.noHp = source.getNoHp();
		this.address = source.getAddress();
	}
}
