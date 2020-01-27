package com.exception;

import java.io.IOException;

//checked exception
//If the superclass method does not declare an exception  (checked exception)
public class ExceptionHandling1 {
	
	void msg1()
	{
		System.out.println("parent");
	}  
}  
	  
	class TestExceptionChild extends ExceptionHandling1
	{  
	  void msg1()
	  {  
	    System.out.println("TestExceptionChild");  
	  }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionHandling1 exceptionHandling1 = new TestExceptionChild();
		exceptionHandling1.msg1();
	}

}
