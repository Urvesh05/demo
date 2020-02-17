package com.slk.task20.jacksonAnnotation1;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTypeInfo15 {

	/**
	 * @param args
	 * @throws JsonProcessingException 
	 * @throws JsonMappingException 
	 */
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub

		Shape shape = new JsonTypeInfo15.Circle("CustomCircle", 2);
		
	      String result = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(shape);
	      System.out.println(result);  
	      
	      String json = "{\"name\":\"CustomCircle\",\"radius\":2.0, \"type\":\"circle\"}";
	      Circle circle = new ObjectMapper().readerFor(Shape.class).readValue(json);
	      
	      System.out.println(circle.name);
	   }
	
	
	//Circle class
	
	   @JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = As.PROPERTY, property = "type") @JsonSubTypes({
	      
	      //@JsonSubTypes.Type(value = Square.class, name = "square"),
	      @JsonSubTypes.Type(value = Circle.class, name = "circle")
	   })
	    
	   static class Shape 
	   {
	      public String name; 
	      
	      Shape(String name)
	      {
	         this.name = name;
	      }
	   }
	   
	   /*
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
	   */
	   @JsonTypeName("circle")
	   
	   static class Circle extends Shape
	   {
	      public double radius;  
	      Circle()
	      {
	         this(null,0.0);
	      }
	      
	      Circle(String name, double radius) 
	      {
	         super(name);
	         this.radius = radius;
	      }
	}

}
