package com.slk.task20.jacksonAnnotation1;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetter4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ObjectMapper mapper =new ObjectMapper();
			
			try {
				 	
				Student1 student= new Student1();
				 student.add("Name", "Avi"); 
		         student.add("RollNo", "100"); 
		         String s = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student); 
		         System.out.println(s); 
				
			} catch (Exception e) {
			e.printStackTrace();
				// TODO: handle exception
			}
	}

}
class Student1
{
	
	   private Map<String, String> properties;
	   public Student1()
	   {
	      properties = new HashMap<>();
	   }
	   @JsonAnyGetter//no add property
	   
	   public Map<String, String> getProperties()
	   {
	      return properties;
	   }
	   //@JsonAnyGetter  (Add property )
	   public void add(String property, String value)
	   {
	      properties.put(property, value);
	   }
	}