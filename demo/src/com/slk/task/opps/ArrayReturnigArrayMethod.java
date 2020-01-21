package com.slk.task.opps;

public class ArrayReturnigArrayMethod {
	
	// Method Using Return Array
	public static int[] get()
	{
		return new int[]{10,20,3,45};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=get();
		
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
