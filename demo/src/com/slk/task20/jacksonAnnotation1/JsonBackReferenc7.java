package com.slk.task20.jacksonAnnotation1;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonBackReferenc7 {//@JsonBackReferences is used to mark child objects.

	/**
	 * @param args
	 * @throws JsonProcessingException 
	 */
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub

		
		 ObjectMapper mapper = new ObjectMapper();     
	      Student7 student7 = new Student7(19, "Tarun");
	      
	      Book book1 = new Book(1,"Learn HTML", student7);//List to add in books child object
	      Book book2 = new Book(1,"Learn JAVA", student7);

	      student7.addBook(book1);
	      student7.addBook(book2);

	      String jsonString = mapper .writerWithDefaultPrettyPrinter().writeValueAsString(book1);
	      System.out.println(jsonString);
	   }
	}


//Parent
class Student7 // @JsonManagedReferences is used to refer to parent object
{ 
	   public int rollNo;
	   public String name;

	   @JsonBackReference//@JsonBackReferences is used to mark child objects.
	   public List<Book> books;

	   Student7(int rollNo, String name)
	   {
	      this.rollNo = rollNo;
	      this.name = name;
	      this.books = new ArrayList<Book>();
	   }
	   
	   public void addBook(Book book)
	   {
	      books.add(book);
	   }
	}
	class Book//child Object
	{
	   public int id;
	   public String name;

	   Book(int id, String name, Student7 student7) 
	   {
	      this.id = id;
	      this.name = name;
	      this.owner = student7;
	   }

	@JsonManagedReference// @JsonManagedReferences is used to refer to parent object
	   public Student7 owner;
	}