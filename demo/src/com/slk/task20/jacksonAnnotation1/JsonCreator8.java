package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCreator8 {//constructor or factory method used in deserialization.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String json = "{\"id\":100,\"Name\":\"Rahul\"}"; 
	      ObjectMapper mapper = new ObjectMapper();    
	      try 
	      {
	         Student8 student8 = mapper 
	            .readerFor(Student8.class) 
	            .readValue(json); 
	         System.out.println(student8.rollNo +", " + student8.name); 
	      }
	      catch (IOException e) 
	      { 
	         e.printStackTrace(); 
	      }
		
	}

}

class Student8 
{
	   public String name; 
	   public int rollNo; 

	   @JsonCreator //Constructor and Factory method used in deserialization.
	   public Student8(@JsonProperty("Name") String name, @JsonProperty("id") int rollNo)
	   {
	      this.name = name; 
	      this.rollNo = rollNo; 
	   }
	}