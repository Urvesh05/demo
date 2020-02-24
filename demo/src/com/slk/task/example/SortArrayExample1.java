package com.slk.task.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayExample1 {
	
	
	
	
	public static void arrayDemo1()//without any method 
	{
		int a[] = new int[] {4,2,6,9,1,3};
		
		int len=a.length;
		int temp;
		
		System.out.println("Before Sorting Array..."+Arrays.toString(a));
		
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After Sorting Array... "+Arrays.toString(a));
		
	}
	
	
	
	public static void arraydemo2() //using Arrays.sort method
	{
		
		int array[] = new int[] {22,4,45,76,12,54,30,2};
		
		System.out.println("\nBefore Sorting Array..."+Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println("After Sorting Array...."+Arrays.toString(array));
		
		
	}
	
	public static void arrayDemo3() //using collections.sort method to reverse data
	{
		System.out.println("\n------Desending Order--------");
		String s[]=new String[] {"Amit","Haresh","Gita","Naresh","Kamal"};
		System.out.println("Before Sorting Array..."+Arrays.toString(s));
		
		Arrays.sort(s,Collections.reverseOrder());
		
		System.out.println("After Sorting Array...."+Arrays.toString(s));
	}
	
	
	public static void arrayDemo4() //using comparator
	{
		String str[] = {"java","php","html","python"};
		
		System.out.println("\nBefore Sorting...."+Arrays.toString(str));
		
		Arrays.sort(str,new Comparator<String>()
		{

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1.compareTo(s2);
			}
			
		});
		
		System.out.println("......After Soritng ....");
		for (String string : str) 
		{
			System.out.println("        "+string);
			
		}	
	}

	
	public static void arrayDemo5() // Parallel Array Sorting (Comparable objects.)
									// parallelism common pool to provide sorting of arrays in parallel
	{
		
		int array[] = new int[] {12,43,22,56,10,41,50};
		System.out.println("\nBefore Sorting..."+Arrays.toString(array));
		
		Arrays.parallelSort(array);//// Sorting array elements parallel and passing start, end index  
		System.out.println("After Sorting...."+Arrays.toString(array));
		
	}
	
	/*
	
	public static void arrayDemo6() 
	{
		
		int arr[] = new int[] {24,45,32,12,79,40}; 
		int len= arr.length;
		
		System.out.println("\nBefore Sorting..."+Arrays.toString(arr));
		
		// Sorting using a single loop 
		for(int i=0;i<len-1;i++)
		{
			 // Checking the condition for two 
            // simultaneous elements of the array 
			if( arr[i] > arr[i+1] )
			{
				// Swapping the elements. 
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
				// updating the value of j = -1 
                // so after getting updated for j++ 
                // in the loop it becomes 0 and 
                // the loop begins from the start. 
				i=-1;
			}
		}
		
		System.out.println("After Sorting... "+Arrays.toString(arr));
		
	}
	
	*/

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SortArrayExample1.arrayDemo1();
		SortArrayExample1.arraydemo2();
		SortArrayExample1.arrayDemo3();
		SortArrayExample1.arrayDemo4();
		SortArrayExample1.arrayDemo5();
		//SortArray.arrayDemo6();
	
	}

}








//https://www.geeksforgeeks.org/how-to-sort-an-array-in-a-single-loop/
