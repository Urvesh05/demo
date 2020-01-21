package com.exception;

//unchecked exception
////If the superclass method does not declare an exception,subclass overridden method cannot declare the checked exception but can(unchecked exception)
public class ExceptionHandling2 {
	void msg()
	{
		System.out.println("parent");
	}  
}  

	class TestExceptionChild2 extends ExceptionHandling2
	{
		
		void msg() throws ArithmeticException //( unchecked exception )
		{
			System.out.println("child");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionHandling2 exceptionHandling2 = new  TestExceptionChild2();
				 exceptionHandling2.msg();
	}

}
