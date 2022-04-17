package com.crud.generic.service.impl;

import org.springframework.stereotype.Service;

import com.crud.generic.entity.Product;
import com.crud.generic.service.ProductService;
import com.crud.generic.service.generic.impl.ServiceGenericImpl;

@Service
public class ProductServiceImpl extends ServiceGenericImpl<Product> implements ProductService{

}
