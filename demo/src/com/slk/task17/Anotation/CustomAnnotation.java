package com.slk.task17.Anotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

//@Target(ElementType.FIELD)//Multiple  not allow
@Inherited
//@Documented
@interface Annotation//Multiple 
{
	
	int value();
	String s();
}

//Applying Annotation

class Hello
{
	@Annotation(value = 10, s = "Annotation")
	
	public void sayHello() 
	{
		System.out.println("Annotation Hi...");
	}
	
	
}


//Accessing Annotation
public class CustomAnnotation 
{

	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		// TODO Auto-generated method stub
		Hello h = new Hello();
		Method m=h.getClass().getMethod("sayHello");//Method call
		
		Annotation a= m.getAnnotation(Annotation.class);//interface call
		System.out.println("Value is "+a.value()+" "+a.s());

	}
}


//https://data-flair.training/blogs/java-annotations/
//https://howtodoinjava.com/java/annotations/complete-java-annotations-tutorial/#override