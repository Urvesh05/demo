package com.exception;

public class TryCatchArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
				int arr[]= {1,3,5,7};  
		        System.out.println(arr[10]); //may throw exception 
		}
		
		 // handling the array exception  
		catch(ArrayIndexOutOfBoundsException e)
		{
			  System.out.println(e);  
		}
		
		   System.out.println("Array IndexOutOf Bounds Exception  ");  
	}

}
