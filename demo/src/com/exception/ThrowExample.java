package com.exception;



public class ThrowExample {
	
	static void valid(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is < 18 Not Valid ");
		}
		else 
		{
			System.out.println("welcome to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		valid(17);
	
	}

}
