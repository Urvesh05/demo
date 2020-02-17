package com.slk.task20.jacksonAnnotation1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFormat10 {//serialization or de-serialization. It is mostly used with Date fields.

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws JsonProcessingException 
	 */
	public static void main(String[] args) throws ParseException, JsonProcessingException 
	{
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
	      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
	      Date date = simpleDateFormat.parse("16-2-2020");

	      Student10 student10 = new Student10(100, date);
	      String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student10);
	      System.out.println(jsonString);
	   }
	}


	class Student10 //used with Date fields.
	{ 
	   public int id;
	   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	   public Date birthDate;
	   
	   Student10(int id, Date birthDate)
	   {
	      this.id = id;
	      this.birthDate = birthDate;
	   } 
	}