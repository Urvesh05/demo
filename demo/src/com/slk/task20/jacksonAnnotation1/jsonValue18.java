package com.slk.task20.jacksonAnnotation1;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonValue18 {//@JsonValue allows to serialize an entire object using its single method.
//@JsonValue તેની એક પદ્ધતિનો ઉપયોગ કરીને આખા objectબ્જેક્ટને સીરીઅલાઈઝ કરવાની મંજૂરી આપે છે.

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper(); 
	      try
	      { 
	         Student181 student = new Student181("Mayur	", 1); 
	         
	         String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student); 
	         System.out.println(jsonString); 
	      }
	      catch (IOException e) 
	      { 
	         e.printStackTrace(); 
	      }   
	   }
	}


//class

	class Student181 
	{
	   private String name;
	   private int rollNo;
	   
	   public Student181(String name, int rollNo)
	   {
	      this.name = name;
	      this.rollNo = rollNo;
	   }
	   
	   public String getName()
	   {
	      return name;
	   } 
	   
	   public int getRollNo()
	   {
	      return rollNo;
	   }
	   @JsonValue  // single method allows to serialize an entire object 
	   public String toString()
	   {
	      return "{ name : " + name + " }";
	}

}
