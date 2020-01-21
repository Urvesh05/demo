package com.slk.task.opps;

public class ArrayAnonymous {
	
	//don't need to declare the array while passing an array to the method.
	static void Array(int arr[])
	
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array(new int[] {10,20,40,23});//passing anonymous array to method  
	}

}
