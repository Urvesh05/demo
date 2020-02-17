package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.slk.task20.jacksonAnnotation1.Std.Name;

public class JsonInclude15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 ObjectMapper mapper = new ObjectMapper();
		 
	      try {
	         Std15 student = new Std15(100,null);   
	         String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
	         System.out.println(jsonString);
	      }
	      catch (IOException e) 
	      { 
	         e.printStackTrace();
	      }     
	   }
	}

@JsonInclude(JsonInclude.Include.NON_NULL)


	class Std15
	{ 
	   public int id;
	   public String name;

	  
	Std15(int id,  String name)
	{
	      this.id = id;
	      this.name = name;
	   }  

	}
