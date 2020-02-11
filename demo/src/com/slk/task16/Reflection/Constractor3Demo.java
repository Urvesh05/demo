package com.slk.task16.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.sql.Array;
import java.util.Arrays;

public class Constractor3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// Create Class object for ConstarctorClass.class 
		Class constractorClass =Constractor3Demo.class;
				
		// Get all the constructor information in the Constructor array
		Constructor[] constractorClassList = constractorClass.getConstructors();
		
		
		for (Constructor constructor : constractorClassList) 
		{
			// Print all name of each constructor
			System.out.println("Constrcutor name : "+constructor.getName());
			
			
			//Get and print access modifiers of each constructor 
			int modifires	= constructor.getModifiers(); 
			System.out.println("Constrctor modifier : "+Modifier.toString(modifires));
			
			
			
			
			/*
			// Get and print parameter types 
			Class constractorParameterList=constructor.getParameterTypes();
			System.out.print ("Constrctor parameter types :"); 
			
			
			for (Class class1 : constractorParameterList) 
			{ 
				System.out.println(class1.getName() +"hello ");
			}
			
			System. out.println();
			
		}*/
			
			/*// Get and print exception thrown by constructors
			Class[] constractorExceptionList=constructor.getExceptionTypes();
			
			
			

			System.out.println("Exception thrown by constructors :"); 
			
			for (Class class1 : constractorExceptionList) 
			{ 
				System.out.println(class1.getName() +" ");
			} 
			
			System.out.println();
			System.out.println("*******************************************");
		}*/
		
		
		}}

}
