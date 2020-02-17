package com.slk.task20.jacksonAnnotation1;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public class JsonFilter9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ObjectMapper mapper = new ObjectMapper();     
	      Student9 student9 = new Student9(1,103, "Rahul");
	      
	      FilterProvider filters = new SimpleFilterProvider() .addFilter(
	         "nameFilter", SimpleBeanPropertyFilter.filterOutAllExcept("id"));//filter property in use which property
	      
	      String jsonString;
		try {
			jsonString = mapper.writer(filters).withDefaultPrettyPrinter().writeValueAsString(student9);
			  System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	   }

	}

@JsonFilter("nameFilter")
class Student9 
{
   public int id;
   public int rollNo;
   public String name;

   Student9(int id, int rollNo, String name) 
   {
      this.id = id;
      this.rollNo = rollNo;
      this.name = name;
   }   
}