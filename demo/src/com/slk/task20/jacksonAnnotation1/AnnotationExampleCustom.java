package com.slk.task20.jacksonAnnotation1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AnnotationExampleCustom {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub

		
		ObjectMapper mapper = new ObjectMapper();
		Abc abc = new Abc(10,102,"Amit","Surat");
		
		String s=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(abc);
		
		System.out.println(s);
		
	}

}

//custom Annotation
@CustomAnnotation
class Abc
{
	public int id;
	public int rollNo;
	public String name;
	public String otherDetails;
	
	
	public Abc(int id, int rollNo, String name, String otherDetails) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.otherDetails = otherDetails;
	}
}

@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@JsonInclude(value=Include.NON_NULL)
@JsonPropertyOrder({"rollNo","name","id"})//order manage

@interface CustomAnnotation{}
