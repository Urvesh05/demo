package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertOrder16 {//allows a specific order to be preserved while serializing a JSON object.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ObjectMapper mapper = new ObjectMapper();
		
	      try
	      {
	         Student161 student = new Student161("radha", 1);
	         
	         String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
	         System.out.println(jsonString);
	      }
	      catch (IOException e) 
	      {
	         e.printStackTrace();
	      }
	   }
	}

//class
	@JsonPropertyOrder({"rollNo","name" })//order mujab show karse
	
	class Student161 
	{
	   private String name; 
	   private int rollNo; 
	   
	   public Student161(String name, int rollNo)
	   { 
	      this.name = name; 
	      this.rollNo = rollNo; 
	   }  
	   public String getName()
	   { 
	      return name; 
	   } 
	   public int getRollNo()
	   { 
	      return rollNo; 
	}

}
