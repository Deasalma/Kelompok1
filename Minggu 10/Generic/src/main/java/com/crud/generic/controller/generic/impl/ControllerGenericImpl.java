package com.crud.generic.controller.generic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crud.generic.controller.generic.ControllerGeneric;
import com.crud.generic.entity.baseEntity.GenericEntity;
import com.crud.generic.repository.generic.GenericRepository;
import com.crud.generic.service.generic.impl.ServiceGenericImpl;

@SuppressWarnings({ "unchecked", "rawtypes" })
@ResponseBody
public class ControllerGenericImpl<T extends GenericEntity<T>> implements ControllerGeneric<T>{
	
	//@Bean
	//public ServiceGeneric serviceGeneric () {
	//	return new ServiceGenericImpl();
	//}
	
	@Autowired
	ServiceGenericImpl<T> genericService;

	public ControllerGenericImpl(GenericRepository<T> repository) {
		this.genericService = new ServiceGenericImpl<T>(repository) {};
	}

	@Override
	@PostMapping
	public ResponseEntity<Object> save(T entity) {
		try {
			return new ResponseEntity(genericService.save(entity),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity("Error !", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Override
	@GetMapping
	public ResponseEntity<T> findAll() {
		try {
			return new ResponseEntity(genericService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity("Percobaan Gagal!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Override
	@DeleteMapping("/{id}")	
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		try {
			genericService.delete(id);
			return new ResponseEntity("Sukses!", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity("GAGAL !!!!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	@PutMapping
	public ResponseEntity<Object> update(T entity) {
		try {
			return new ResponseEntity(genericService.update(entity), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity("GAGAL !!!!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
