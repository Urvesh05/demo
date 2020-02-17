package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnySetter5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  ObjectMapper mapper = new ObjectMapper(); 
	      String jsonString = "{\"RollNo\" : \"1\",\"Name\" : \"Avi\"}"; 
	      try { 
	         Student5 student5 = mapper.readerFor(Student5.class).readValue(jsonString); 
	         System.out.println(student5.getProperties().get("Name")); 
	         System.out.println(student5.getProperties().get("RollNo")); 
	      }
	      catch (IOException e) {
	         e.printStackTrace(); 
	      } 
	}

}
class Student5
{
		//@JsonAnySetter (working Deserialization )
	   private Map<String, String> properties; 
	   public Student5()
	   { 
	      properties = new HashMap<>(); 
	   } 
	   
	 
	   public Map<String, String> getProperties()
	   { 
	      return properties; 
	   } 
	  // @JsonAnySetter 
	   public void add(String property, String value)
	   { 
	      properties.put(property, value); 
	   }   
	}