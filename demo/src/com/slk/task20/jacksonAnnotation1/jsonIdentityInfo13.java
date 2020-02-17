package com.slk.task20.jacksonAnnotation1;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonIdentityInfo13 {//used when objects have parent child relationship  serialization/de-serialization.

	/**
	 * @param args
	 * @throws JsonProcessingException 
	 */
	public static void main(String[] args) throws JsonProcessingException 
	{
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper();     
	      St student = new St(1, "Hari");
	      Bo book1 = new Bo(1," HTML", student);
	      Bo book2 = new Bo(2," JAVA", student);

	      student.addBook(book1);//list add
	      student.addBook(book2);

	      String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(book1);
	      System.out.println(jsonString);
	   }
	}


// allows to serialize a POJO by id when it is encountered second time during serialization. 
//parent class
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
	class St 
	{ 
	   public int id;
	   //public int rollNo;
	   public String name;
	   public List<Bo> books;
	   
	   St(int id,  String name)
	   {
	      this.id = id;
	    //  this.rollNo = rollNo;
	      this.name = name;
	      this.books = new ArrayList<Bo>();
	   }
	   
	  
	   public void addBook(Bo book)
		{
	      books.add(book);
	    }
	}
	
	//child class
	@JsonIdentityInfo(
	   generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
	
	class Bo
	{
	   public int id;
	   public String name;

	   Bo(int id, String name, St student)
	   {
	      this.id = id;
	      this.name = name;
	      this.owner = student;
	   }
	   public St owner;
	}