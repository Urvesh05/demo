package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetter11 {//allows a specific method to be marked as getter method.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ObjectMapper mapper = new ObjectMapper(); 
	      try 
	      {
	         Student12 student12 = new Student12("Tara", 1);    
	         String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student12); 
	         System.out.println(jsonString); 
	      } 
	      catch (IOException e) { 
	         e.printStackTrace();  
	      }   
	   }
	}


	class Student12 
	{
	   private String name;
	   private int rollNo;
	   
	   public Student12(String name, int rollNo)
	   {
	      this.name = name;
	      this.rollNo = rollNo;
	   }
	   @JsonGetter
	   public String getStudentName()
	   {
	      return name;
	   }
	   public int getRollNo()
	   {
	      return rollNo;
	   }
	}
