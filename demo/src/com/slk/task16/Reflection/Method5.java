package com.slk.task16.Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.SQLException;

public class Method5 {
	
	//method 1 
	public void abcMethodAdd(int firstElement)
			throws ClassNotFoundException, ClassCastException
	{			
		System.out.println("Demo method for Reflextion  API");					
	}
	
	//method 2
	public String abcMethodSearch(String searchString)
			throws ArithmeticException, InterruptedException
	{			
		  System.out.println("Demo method for Reflection API");					
		  return null;					
	}
	
	//method 3
	public void abcMethodDelete(String deleteString)
				throws SQLException
	{			
		 System.out.println("Demo method for Reflection API");					
	}	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Class c = Method5.class;
		// Get the metadata or information of all the methods of the class using getDeclaredMethods() 
		Method[] m=c.getDeclaredMethods();
		
		for (Method method : m) 
		{
			// Print the method names
			System.out.println("1. Name of the method =>: "+method.getName());
			
			
			// Print return type of the methods 
			System.out.println("2. Return type of the method =>: "+method.getReturnType());
			
			
			//Get the access modifier list and print
			int i =method.getModifiers();
			System.out.println("3. Access Modifire =>"+Modifier.toString(i));
			
			
			// Get and print parameters of the methods 
			Class[] parameter= method.getParameterTypes(); 
			System.out.print ("4. Method parameter types =>: "); 
			for (Class class1 : parameter)
			{ 
				System.out.println(class1.getName()+" ");
			}
	        
			// Get and print exception thrown by the method 
			Class[] exception = method. getExceptionTypes(); 
			System.out.print("5. Excpetion thrown by method :"); 
			for (Class class2 : exception) {
				System.out.println(class2.getName());
				
			} 
			System.out.println(); 
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
				
			
			

		}
	
	}

}
