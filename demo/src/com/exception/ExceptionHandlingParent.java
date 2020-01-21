package com.exception;

public class ExceptionHandlingParent {
	
	public void msg()throws Exception
	{
		
		System.out.println("parent");

	}
}
	class  ExceptionHandling3 extends ExceptionHandlingParent
	{
		public void msg() throws ArithmeticException   //Exception  
		{
			System.out.println("child class ");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandlingParent exceptionHandlingParent = new ExceptionHandling3();
		
		try {
			
			exceptionHandlingParent.msg();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
