package com.slk.task20.jacksonAnnotation1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonIdentityReference13 {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub

		
		  Order order = new Order();
	        order.setOrderId(1);
	       // order.setItemIds(List.class(10,30));
	        
	        
	        Customer customer = new Customer();
	        customer.setId(2);
	        customer.setName("Peter");
	        customer.setOrder(order);
	        order.setCustomer(customer);
	        System.out.println(customer);

	        System.out.println("-- serializing Customer --");
	        ObjectMapper om = new ObjectMapper();
	        String s = om.writeValueAsString(customer);
	        System.out.println(s);
	}

}



//https://www.logicbig.com/tutorials/misc/jackson/json-identity-reference.html