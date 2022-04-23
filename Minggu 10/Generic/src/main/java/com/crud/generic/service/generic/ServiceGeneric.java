package com.crud.generic.service.generic;

import java.util.List;

import com.crud.generic.entity.baseEntity.GenericEntity;

public interface ServiceGeneric<T extends GenericEntity<T>>  {
	
	List<T> findAll() throws Exception;
	T save(T entity) throws Exception;
	T update(T entity) throws Exception;
	void delete(Long id) throws Exception;
}