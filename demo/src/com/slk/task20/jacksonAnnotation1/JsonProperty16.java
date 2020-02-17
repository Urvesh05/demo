package com.slk.task20.jacksonAnnotation1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonProperty16 {

	/**
	 * @param args
	 * @throws JsonProcessingException 
	 * @throws JsonMappingException 
	 */
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub

		
		ObjectMapper mapper = new ObjectMapper();
	      String json = "{\"id\" : 110}";
	      
	      Student16 student = mapper.readerFor(Student16.class).readValue(json);
	      System.out.println(student.getTheId());
	   }
	}

//use to non-standard getter/setter method to be used with respect to json property.
//class
	class Student16 
	{
	   private int id;
	   
	   Student16()
	   {}
	   
	   Student16(int id)
	   {
	      this.id = id;
	   }
	   
	   @JsonProperty("id")//getter
	   public int getTheId() 
	   {
	      return id;
	   }
	   @JsonProperty("id")//setter
	   public void setTheId(int id)
	   {
	      this.id = id;
	   }

}
