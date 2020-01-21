package com.exception;

public class Costome2 {
	
	   static void validate(int age)throws Costome
	   {  
		     if(age<18)
		     {	 
		    	 throw new Costome("In-valid"); 
		     }
		     
		     else 
		     {
		      System.out.println("welcome to vote");  
		     }
		   }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			validate(10);
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured: "+e);
		}

	}

}
