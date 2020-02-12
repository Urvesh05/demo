package com.slk.task17.Anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySempleAnnotaion

{
	int age();
	String name();
}

class MyAnnotation
{
	@MySempleAnnotaion(age=20,name="Karan")
	
	public void get() 
	{
		System.out.println("hello Annotation ");
	}
}

public class CustomAnnotation2 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub

		MyAnnotation annotation = new MyAnnotation();
		annotation.get();
		
		//show Annotation data
		Method m=annotation.getClass().getMethod("get");//method name
		
		MySempleAnnotaion a= m.getAnnotation(MySempleAnnotaion.class);//interface call
		System.out.println("Age is = "+a.age() + " name is = "+a.name());
		
		
	}
}
