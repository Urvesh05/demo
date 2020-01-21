package com.slk.task.opps;


//array is a collection of similar type of elements which have a contiguous memory location.
public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];//declaration and instantiation  
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=30;  
		
		//declaration, instantiation and initialization  
		//int b[] = {12,14,5};
		
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		{
			System.out.println(a[i]);
			
		}

	}

}
