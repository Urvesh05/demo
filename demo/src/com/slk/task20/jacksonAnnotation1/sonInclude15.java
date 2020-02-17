package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

public class sonInclude15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper();
	      try {
	         Student15 student = new Student15(1,null);       
	         String jsonString = mapper
	            .writerWithDefaultPrettyPrinter()
	            .writeValueAsString(student);
	         System.out.println(jsonString);
	      }
	      catch (IOException e) { 
	         e.printStackTrace();
	      }     
	   }
	}
	@JsonInclude(JsonInclude.Include.NON_NULL)
	class Student15 { 
	   public int id; 
	   public String name;

	   Student15(int id,String name){
	      this.id = id;
	      this.name = name;
	}

}
