package com.slk.task.opps;

import java.util.ArrayList;

public class ArrayForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//integer data type
		int arr[]={33,3,4,5};
		
		//using for-each loop printing array one by one 
		int total=0;
		
		for(int i:arr)
		{
			total = total+i;
			
			System.out.println(i);
		}
		
		//String Data type
		
		String str[]= {"Computer","Science"};
		//ArrayList<String> list = new ArrayList<String>();
		//list.add("java");
		//list.add("php");
		for(String s:str)
		{
			System.out.println(s);
		}
	}	
}
