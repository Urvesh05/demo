package com.slk.task20.jacksonAnnotation1;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonView18 {//@JsonView is used to control values to be serialized or not.

	/**
	 * @param args
	 * @throws JsonProcessingException 
	 */
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		
		 ObjectMapper mapper = new ObjectMapper();  
		 
	      Student182 student = new Student182(1, "Mahi", 12);
	      
	      String jsonString = mapper.writerWithDefaultPrettyPrinter().withView(Views.Public.class).writeValueAsString(student);
	     
	      System.out.println(jsonString);
	   }
	}

//class

	class Student182 
	{
		
	   @JsonView(Views.Public.class)
	   public int id;
	   
	   @JsonView(Views.Public.class)
	   public String name;
	   
	   @JsonView(Views.Internal.class) // is used to control values to be serialized or not.(not show value)
	   public int age;//not displays (Serialized)

	   Student182(int id, String name, int age) 
	   {
	      this.id = id;
	      this.name = name;
	      this.age = age;
	   }
	}
	class Views 
	{
	   static class Public {}
	   
	   static class Internal extends Public {}
	}
