package com.slk.task16.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Iterator;

public class Demo{ 
	/*
	Demo(){
		
	}*/
	
	public String gvp;
	
	
	public void abc(String gvp) 
	{
		this.gvp=gvp;
	}
	
	
 public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, NoSuchFieldException{  
  
	 
		 //using .class(Class Object )
		 Class c=Demo.class;
		 
		 //class Name
		 System.out.println("1.Class Name => "+c.getName());
		
		 //Package Name
		 System.out.println("\n2.Packege Name => "+c.getPackage());
		 
		// Print Super class name
		System.out.println("\n3.Super class Name => : " +c.getSuperclass().getName());
	
					
		 // Get the access modifier of Dog in integer form
		int modifire =c.getModifiers();
		System.out.println("\n4.Modifier in this class ===> "+Modifier.toString(modifire));
		
		
		Field f= c.getField("gvp");
		System.out.println("\n5. Field Name =>  "+f.getName());
		
		Method[] m=c.getDeclaredMethods();
		for (Method method : m) 
		{
			// Print the method names
			System.out.println("\n6. Name of the method =>: "+method.getName());
			
		}
		
		/*
		//Constartor
		Constructor[] constructors=c.getConstructors();
		for (Constructor constructor1 : constructors) {
			System.out.println("\n7.Constractor => "+constructor1.getName());
		}
		
		
		//interface 
		Class[] interfaces=c.getInterfaces();
		
		for (Class c2 : interfaces) 
		{
			System.out.println(c2.getName());
		}
		*/
		
 	}
 }