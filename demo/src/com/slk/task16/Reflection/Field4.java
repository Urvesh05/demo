package com.slk.task16.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Field4 {
	
	 public static int i=1111;
     static int i2=2222;
     
     static String s="Abc";							
     static String s2="Hello"; 
     
     private static int i3=2323;
	    
	    
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub

		Class c=Field4.class;
		Field[] f1=c.getDeclaredFields();
		
		// Print name, datatypes, access modifiers and values of the varibales of the specified class 
			
		for (Field field : f1) 
		{
			//Variable Name
			System.out.println("Variabale Name ="+field.getName());
			
			//Variable dataType
			System.out.println("Data type ="+field.getType());
			
			
			int accessModifier =field.getModifiers();
			
			System.out.println("Access Modifiers of the variable =:"+Modifier.toString(accessModifier));
			
			//Variable values
			System.out.println("Value of the variable =:"+field.get(f1));
			
			System.out.println();
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *") ;
		}
		
	}

}
