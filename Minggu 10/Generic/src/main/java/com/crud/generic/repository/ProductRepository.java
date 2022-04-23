package com.crud.generic.repository;

import org.springframework.context.annotation.Primary;

import com.crud.generic.entity.Product;
import com.crud.generic.repository.generic.GenericRepository;

@Primary
public interface ProductRepository extends GenericRepository<Product>{

}
