package com.exception;

public class ExceptionHandlingMethodOverriding {
	
	void get() throws Exception
	{
		System.out.println("Parent Class ");
	}
	
}
	
	class ExceptionChild extends ExceptionHandlingMethodOverriding
	{
		void get()throws ArithmeticException
		{
			System.out.println("Child classes");
		}
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		ExceptionHandlingMethodOverriding parent = new ExceptionChild();
		try {
			
			parent.get();
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
