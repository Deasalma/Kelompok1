package com.crud.generic.entity;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.crud.generic.entity.baseEntity.BaseEntity;


@Entity
@Table(name = "Customer")

public class Customer extends BaseEntity{
//	@Column (name = "No.Handphone", nullable = false , length = 200)
	private long noHp;
	private String address;
	
	public Customer() {
		super();		
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getNoHp() {
		return noHp;
	}

	public void setNoHp(long noHp) {
		this.noHp = noHp;
	}

}
