package com.slk.task20.jacksonAnnotation1;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTypeName15 {

	/**
	 * @param args
	 * @throws JsonProcessingException 
	 */
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub

		Shape shape = new JsonTypeName15.Square("CustomSquare", 1);
		
	      String result = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(shape);
	      System.out.println(result);  
	      
	      String json = "{\"name\":\"Custom Square\",\"length\":4.0, \"type\":\"square\"}";
	      
	      Square square = new ObjectMapper().readerFor(Shape.class).readValue(json);
	      System.out.println(square.name);
	   }
	
	
	//square class
	   @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, 
	      include = As.PROPERTY, property = "type") @JsonSubTypes({
	      
	      @JsonSubTypes.Type(value = Square.class, name = "square"),
	      
	   })
	   
	   static class Shape
	   {
	      public String name;
	      
	      Shape(String name)
	      {
	         this.name = name;
	      }            
	   }
	   
	   @JsonTypeName("square")
	   static class Square extends Shape 
	   {
	      public double length;
	      Square()
	      {
	         this(null,0.0);
	      }
	      Square(String name, double length)
	      {
	         super(name);
	         this.length = length;
	      }
	   }
}
