package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAutoDetect6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		
		 try{
	         Student6 student6 = new Student6(100,"Dipak");       
	         String jsonString = mapper
	            .writerWithDefaultPrettyPrinter()
	            .writeValueAsString(student6);
	         System.out.println(jsonString);
	      }
	      catch (IOException e) {
	         e.printStackTrace();
	      }     
	}

}
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)//DEFAULT(Only Show Object not a value)
class Student6 
{ 
	   private int id; 
	   private String name;

	   Student6(int id,String name) 
	   {
	      this.id = id;
	      this.name = name;
	   }   
	}