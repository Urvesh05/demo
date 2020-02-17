package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnore14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ObjectMapper mapper = new ObjectMapper();
	      try{
	         Student14 student = new Student14(1,11,"1ab","rrr");       
	         String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
	         System.out.println(jsonString);
	      }
	      catch (IOException e)
	      { 
	         e.printStackTrace();
	      }     
	   }
	}


	class Student14 
	{ 
	   public int id;
	  
	   public String systemId;
	   public int rollNo;
	   @JsonIgnore//name is ignore  not show 
	   public String name;

	   Student14(int id, int rollNo, String systemId, String name)
	   {
	      this.id = id;
	      this.systemId = systemId;
	      this.rollNo = rollNo;
	      this.name = name;
	   }
	}
