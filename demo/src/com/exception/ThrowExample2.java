package com.exception;

public class ThrowExample2 {
	
	static void avg()
	{
		try
		{
			int i =10/2;
			
			System.out.println(i);
			
			throw new ArithmeticException("demo");
			
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception Cautch "+e);
			//throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		avg();

	}

}
