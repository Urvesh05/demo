package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreType14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ObjectMapper mapper = new ObjectMapper();
	      try {
	         Std student = new Std(1,11,"hello","Jaga");       
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
	class Std { 
	   public int id;
	   @JsonIgnore
	   public String systemId;
	   public int rollNo;
	   public Name nameObj;

	  
	Std(int id, int rollNo, String systemId, String name){
	      this.id = id;
	      this.systemId = systemId;
	      this.rollNo = rollNo;
	      nameObj = new Name(name);
	   }

	   @JsonIgnoreType//ignore 
	   class Name {
	      public String name;
	      Name(String name){
	         this.name = name;
	      }       
	   }
	}
