package com.crud.generic.repository;

import org.springframework.stereotype.Repository;

import com.crud.generic.entity.Product;
import com.crud.generic.repository.generic.GenericRepository;

@Repository

public interface ProductRepository extends GenericRepository<Product>{

}
