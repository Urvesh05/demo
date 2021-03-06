package com.slk.task19.Jackson;

import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeModelExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  try {
		         ObjectMapper mapper = new ObjectMapper();
		         String jsonString = "{\"name\":\"Rahul\",  \"age\":21,\"marks\": [100,90,85]}";
		         
		         JsonNode rootNode = mapper.readTree(jsonString);//using tree model

		         //get data
		         JsonNode nameNode = rootNode.path("name");
		         System.out.println("Name: "+ nameNode.textValue());

		         JsonNode ageNode = rootNode.path("age");
		         System.out.println("Age: " + ageNode.intValue());

		         JsonNode marksNode = rootNode.path("marks");
		         Iterator<JsonNode> iterator = marksNode.elements();
		         System.out.print("Marks: [ ");

		         while (iterator.hasNext()) {
		             JsonNode marks = iterator.next();
		             System.out.print(marks.intValue() + " "); 
		          }

		          System.out.println("]");
		         
		      }
		      catch (JsonParseException e) 
		  		{ 
		    	  	e.printStackTrace();
		    	 }
		      catch (JsonMappingException e) 
		  		{ 
		    	  	e.printStackTrace(); 
		    	  	
		  		}
		      catch (IOException e) 
		  		{ 
		    	  	e.printStackTrace(); 
		    	 }
		   	}

}
