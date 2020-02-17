package com.slk.task20.jacksonAnnotation1;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InjectAnnotation3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "{\"name\":\"Urvesh\"}";
		
		InjectableValues injeValues = new InjectableValues.Std().addValue(int.class, 101);
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			
			Student student= mapper.reader(injeValues).forType(Student.class).readValue(s);
			
			System.out.println(student.rollNo+" : 	"+student.name);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
		class Student
		{
			public String name;
			@JacksonInject
			public int rollNo;
	
		}
		
		//https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonanygetter.htm