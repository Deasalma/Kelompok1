package com.crud.generic.entity.baseEntity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass

public interface GenericEntity<T>{
	Long getId();
	void update(T source);
}
