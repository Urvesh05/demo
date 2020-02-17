	package com.slk.task20.jacksonAnnotation1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUnwrapped18 {//@JsonUnwrapped is used to unwrap values of objects during serialization or de-serialization.

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws JsonProcessingException 
	 */
	public static void main(String[] args) throws ParseException, JsonProcessingException {
		// TODO Auto-generated method stub

		
		 
	     // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
	      
	     // Date date = simpleDateFormat.parse("17-2-2020");
		 ObjectMapper mapper = new ObjectMapper();
		 
	      Student18.Name name = new Student18.Name();//name class unwrapped
	      name.first = "Haresh";
	      name.last = "Dhaval";
	      
	      Student18 student = new Student18(102, name);
	      
	      String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
	      System.out.println(jsonString);
	   }
	}


//class
	class Student18 
	{
		//@JsonUnwrapped//root name wrap
	   public int id;   
	   @JsonUnwrapped // unwrap root name
	   public Name name;
	   
	   Student18(int id, Name name)
	   {
	      this.id = id;
	      this.name = name;
	   }
	   
	   //class
	   
	   static class Name
	   {
	      public String first;
	      public String last;
	   }
	}
