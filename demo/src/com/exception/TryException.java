package com.exception;


//first 
public class TryException  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try//code that may raise exception  
		
		{
			
			int i=100/0;//ArithmeticException 
			
			//String s = null;//NullPointerException 
			//System.out.println(s.length());
			
			//String s1="abc";//NumberFormatException 
			//int i1=Integer.parseInt(s1);
			
			//int arr[]=new int[5];//ArrayIndexOutOfBoundsException  
			//arr[10]=20;
			
		}
		catch(ArithmeticException e )
		{
			System.out.println(e);
			
		}
		catch(NullPointerException e1 )
		{
			System.out.println(e1);
			
		}
		catch(NumberFormatException e2 )
		{
			System.out.println(e2);
			
		}
		catch(ArrayIndexOutOfBoundsException e3 )
		{
			System.out.println(e3);
			
		}
		catch(Exception e4 )
		{
			System.out.println(e4);
			
		}
		

	}

}
