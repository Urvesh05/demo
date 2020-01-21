package com.exception;

import java.io.IOException;


//declare the exception  (because not handle the exception (throw))
public class ThrowsExmaple2 {
	
	static void valid(int age) throws ArithmeticException
	{  
		 if(age<18)
		 {
			 throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		 }
		 else {
		      System.out.println("Access granted - You are old enough!");
		    }
	}  
		

	public static void main(String[] args) throws IOException //declare the exception
	{
		// TODO Auto-generated method stub
		
		valid(19);
		
		
		

	}

}
