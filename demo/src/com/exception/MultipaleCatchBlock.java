package com.exception;


//At a time only one exception occurs and at a time only one catch block is executed.
public class MultipaleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try
		{
			int arr[] =new int[7];
			arr[10]=10/2;
			
			//int i=40/0;
			
			//String s=null;
			//System.out.println(s.length());
			
		}
		
		catch(ArithmeticException  e)
		{
			   System.out.println("Arithmetic Exception occurs");  
		}
	
		  catch(ArrayIndexOutOfBoundsException e1)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        } 
		
		catch(NullPointerException ar)
		{
			
			System.out.println("Null Point Exception Occurs");
			
		}
		 
		catch ( Exception e) {
			
			System.out.println(e);	
			 
		}  
		  System.out.println("\nnormal flow..");  

	}

}
