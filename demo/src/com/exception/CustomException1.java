package com.exception;

public class CustomException1 extends Exception{
	
	
	public CustomException1(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
	
		static void age(int age) throws CustomException1
		{
			if(age<18)
				 
			{
				throw new CustomException1("In-valid");
					
			}
			else 
			{
				System.out.println("Valid");
			}
		}
		
		public static void main(String[] args) {
			
			
			try
			{
				age(12);
				
			}catch(Exception e)
			{
				System.out.println("Exception "+e);
				
			}
			//System.out.println("normal flow");
		}
}
