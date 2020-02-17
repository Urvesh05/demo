package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JesonSetter12 {//allows a specific method to be marked as setter method.

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	 ObjectMapper mapper = new ObjectMapper(); 
	 String jsonString = "{\"rollNo\":1,\"name\":\"Manish\"}";

    try 
    { 
       Student121 student121 = mapper.readerFor(Student121.class).readValue(jsonString);
       System.out.println(student121.name); 
    }
    catch (IOException e) 
    {
       e.printStackTrace(); 
    }   
 } 
}


class Student121 
{ 
 public int rollNo; 
 public String name; 
 
 @JsonSetter("name") //allows a specific method to be marked as setter method.
 public void setTheName(String name)
 { 
    this.name = name; 
 }  

}
