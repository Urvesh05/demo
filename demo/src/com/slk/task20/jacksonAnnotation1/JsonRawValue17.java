package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRawValue17 {//llows to serialize a text without escaping or without any decoration.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper(); 
	      try 
	      {
	         Student17 student = new Student17("Rahul", 100, "{\"Decorate\":false}"); //"json" : {\"Decorate\":false} 
	         
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

	class Student17
	{ 
	   private String name; 
	   private int rollNo;
	   @JsonRawValue  
	   private String json; 
	   
	   public Student17(String name, int rollNo, String json) 
	   {
	      this.name = name; 
	      this.rollNo = rollNo; 
	      this.json = json; 
	   }  
	   public String getName()
	   { 
	      return name; 
	   } 
	   public int getRollNo()
	   { 
	      return rollNo; 
	   } 
	   public String getJson()
	   { 
	      return json; 
	}

}
