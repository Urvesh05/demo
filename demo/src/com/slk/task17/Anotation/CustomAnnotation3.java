package com.slk.task17.Anotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

//create 
@interface SmartPhone
{
	
	String os() default "java";
	int version() default 1	;
	
}

//Use Annotation
@SmartPhone(os="Andriod",version=2)
class Mi
{
	String Model;
	int size;
	
	public Mi(String model,int size)
	{
		this.Model=model;
		this.size=size;
	}
}


public class CustomAnnotation3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mi m = new Mi("MI-5", 5);
		
		Class c=m.getClass();
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s= (SmartPhone) an;
		System.out.println(s.os() + " "+s.version());
		
	}

}
