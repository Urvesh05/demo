package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonRootName17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper(); 
	      try 
	      {
	         Student171 student = new Student171("dipalk", 102);  
	         
	         mapper.enable(SerializationFeature.WRAP_ROOT_VALUE); 
	         
	         String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
	         
	         System.out.println(jsonString); 
	      }
	      catch (IOException e) 
	      { 
	         e.printStackTrace(); 
	      }   
	   }
	}


//allows to have a root node specified over the JSON. We need to enable wrap root value as well.
//class

	@JsonRootName(value = "student") //root value
	
	class Student171 
	{
	   private String name; 
	   private int rollNo;
	   
	   public Student171(String name, int rollNo)
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
