package com.slk.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingExample 
{
	
	public static void numberSorting()
	{

		int[] number= {3,5,2,7,9,0,1,6,10,15,11,18,12};
		
		System.out.println("\n======Number Sorting======");
			
		System.out.println("Before "+Arrays.toString(number));
		Arrays.sort(number);
		System.out.println("After  "+Arrays.toString(number));
		
		int[] numbers= {3,5,2,7,9,0,1,6,10,15,11,18,12};
		System.out.println("\n=====Sorting a specified range=======");
		Arrays.sort(numbers, 3, 8);
		System.out.println(Arrays.toString(numbers));
		
	}

	
	public static void sortList()
	{
		List<String> list=new ArrayList<String>();
		list.add("Hari");
		list.add("Tanuja");
		list.add("Jigu");
		list.add("Abc");
		
		
		System.out.println("\n========Before Sorting =======");
		for(String s1:list)
		{
			System.out.println(s1);
		}
		//Collections.sort(list);
		
		System.out.println("\n======= After Sorting =======");
		
		Collections.sort(list);//sort acceding Order
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
		System.out.println("\n======= Reverse Sorting =======");
		//sort by descending 
		Collections.reverse(list);
		for(String r:list)
		{
			System.out.println(r);
		}
		
	}
		
	public static void main(String[] args) {
		
		SortingExample.numberSorting();
		SortingExample.sortList();
		
		
	}

}
