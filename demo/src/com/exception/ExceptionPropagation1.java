	package com.exception;

	
	//By default Unchecked Exceptions are forwarded in calling chain (propagated).
public class ExceptionPropagation1 {
	
	  void m()
	  {  
		    int data=50/2; 
		    System.out.println("Ans= "+data);
	  }  
		  void n()
		  {  
		    m();  
		  } 
		  
		  void p()
		  
		  {  
		   try
		   {  
		    n();  
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println("exception handled >>  p() method");
		   }  
		  }  

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExceptionPropagation1 obj=new ExceptionPropagation1();  
		   obj.p();  
		// System.out.println("normal flow...");  

	}

}
