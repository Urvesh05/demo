package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.slk.task20.jacksonAnnotation1.Std.Name;

public class JsonIgnoreProperties14 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		 ObjectMapper mapper = new ObjectMapper();
		 
	      try {
	         Std student = new Std(1,11,"hello","Hari");       
	         String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
	         System.out.println(jsonString);
	      }
	      catch (IOException e) 
	      { 
	         e.printStackTrace();
	      }     
	   }
	}

@JsonPropertyOrder({"id","rollNo"})//ignore 
	class Std14 
	{ 
	   public int id;
	   public String systemId;
	   public int rollNo;
	   public Name nameObj;

	  
	Std14(int id, int rollNo, String systemId, String name)
	{
	      this.id = id;
	      this.systemId = systemId;
	      this.rollNo = rollNo;
	      this.nameObj = nameObj;
	   }  
	  
	}
