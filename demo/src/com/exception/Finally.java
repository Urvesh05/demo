package com.exception;

public class Finally {
	
	public static int get()
	{
		int a=10;
		
		try {
			System.out.println(a);
			return a;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			a=12;
			System.out.println(a);
			
			System.out.println("finally block is always executed");
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Finally.get());
		
//		
//		try{  			  
//			//int data=25/0;  
//			//   System.out.println(data);  
//		
//			int a=10;
//			return 
//		}
//		  catch(NullPointerException e)
//			{
//				  System.out.println(e);
//			}  
//		
//		finally
//		{
//			System.out.println("finally block is always executed");
//		}
//		
//				System.out.println("rest of the code...");  

	}

}
