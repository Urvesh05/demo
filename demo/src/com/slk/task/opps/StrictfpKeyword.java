package com.slk.task.opps;

public class StrictfpKeyword {
	
	 public strictfp double sum() 
	    { 
	        double num1 = 10e+10; 
	  
	        double num2 = 6e+08; 
	  
	        return (num1+num2); 
	  
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StrictfpKeyword strictfpKeyword = new StrictfpKeyword();
		System.out.println(strictfpKeyword.sum());

	}

}
