package com.exception;


//second
public class TryAndCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=50;
		int j=0;
		int n;
		
		try
		{
			int data=50/0;//ArithmeticException
			
			n=i/j;
			
		}
		catch(Exception e)
		{
			//System.out.println(e);
			//int data1=50;
			e.printStackTrace();
		}
		
	    System.out.println(i/(j+2));  
	
	}
}
	
	/*try {
		  int data1=50/0;
		
	}catch(Exception e)
	{
		 // int data2=50/0;
	}
	System.out.println("Can't divided by zero");
}
}*/
