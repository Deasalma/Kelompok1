package com.crud.generic.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.generic.controller.CustomerController;
import com.crud.generic.controller.generic.impl.ControllerGenericImpl;
import com.crud.generic.entity.Customer;




@RestController
@RequestMapping(path = "/customer")
public class CuctomerControllerImpl extends ControllerGenericImpl<Customer> implements CustomerController{
	

}
