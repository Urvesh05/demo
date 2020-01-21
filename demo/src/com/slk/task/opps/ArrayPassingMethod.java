package com.slk.task.opps;

//Passing Array to a Method in Java
public  class ArrayPassingMethod {
	
	
	//creating a method which receives an array as a parameter  
	static void array(int arr[])
	{
		
		int l= arr.length;
		System.out.println("Array Lenght "+l);
		
		/*int min = arr[0];
//		
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
				
		}
		System.out.println("Min Arry "+min); 
		 */
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,2,4,6};//passing array to method  
		array(a);
	}

}
