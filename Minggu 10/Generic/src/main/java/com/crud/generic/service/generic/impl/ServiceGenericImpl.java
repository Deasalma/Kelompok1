package com.crud.generic.service.generic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.generic.entity.baseEntity.GenericEntity;
import com.crud.generic.repository.generic.GenericRepository;
import com.crud.generic.service.generic.ServiceGeneric;

@Service
public class ServiceGenericImpl<T extends GenericEntity<T>> implements ServiceGeneric<T> {
	
	@Autowired
	GenericRepository<T> genericRepository;
	
	public ServiceGenericImpl(GenericRepository<T> repository) {
		this.genericRepository = repository;
	}
	
	//public ServiceGenericImpl() {
		// TODO Auto-generated constructor stub
	//}

	@Override
	public List<T> findAll() throws Exception {
		try {
			return genericRepository.findAll(); 
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public T save(T entity) throws Exception {
		try {
			return genericRepository.save(entity);
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public T update(T entity) throws Exception {
		try {
			T data = get(entity.getId());
			return genericRepository.save(data);
		} catch (Exception e) {
			throw e;
		}
	}

	private T get(Long id) {
		return genericRepository.findById(id).orElseThrow();
	}

	@Override
	public void delete(Long id) throws Exception {
		try {
			genericRepository.deleteById(id);
		} catch (Exception e) {
			throw e;
		}
	}
}