package com.exception;

import java.io.IOException;

//By default, Checked Exceptions are not forwarded in calling chain (propagated).
public class ExceptionPropagation2 {
	
	 void m() throws IOException
	  {  
		 int data=50/0; 
		 System.out.println(data);
		 throw new IOException("device error");//checked exception  (Compile Time Error)
	  }  
		  void n() throws IOException
		  {  
		    m();  	
		  }  
		  void p()
		  {  
		   try
		   {  
		    n();  
		   }
		   catch(Exception e)
		   {
			   System.out.println("exception handled");
		   }  
		  }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionPropagation2 obj=new ExceptionPropagation2();  
		   obj.p();  
		

	}

}
