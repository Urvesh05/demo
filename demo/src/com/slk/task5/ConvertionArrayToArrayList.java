package com.slk.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ConvertionArrayToArrayList {
	
	public static void conertArray()
	{
		//Array Elements
		
		String[] array= {"Xyz","Mohan","Dipak"};
		/*
		for(String s:array)
		{
			System.out.println(s);
		}
		*/
		
		System.out.println("\n==========ArratList==========");
		//Method 1
		System.out.println("\n=========Arrays.asList Method==========");
		List<String> list= Arrays.asList(array);
		System.out.println(list);
		
		//Method 2
		System.out.println("\n=========addAll() Method===========");
		List<String> list1=new ArrayList<String>();
		Collections.addAll(list1, array);
		System.out.println(list1);
		
		//Method 3
		
		System.out.println("\n==========For loop using==========");
		List<String> list3= new ArrayList<String>();
		
		for(String s:array)
		{
			list3.add(s);	
		}
		System.out.println(list3);
		
		
		//method 4 

		System.out.println("\n==========ArratList Constructor passing==========");
		ArrayList<String> list4=new ArrayList<String>(Arrays.asList(array));
		list4.add("Avi");
		list4.add("Haresh");
		for(String s1:list4)
		{
			System.out.println(s1);
		}
		
		
		//Method 5 
		System.out.println("\n==========ArratList Constructor passing==========");
		ArrayList<String>list5 =new ArrayList<String>();
		Collections.addAll(list5, array);
		
		list5.add("Tarun");
		list5.add("Mehul");
		
		
		for(String s3:list5)
		{
			System.out.println(s3);
			//Collections.reverse(list5);
			
		}
		//System.out.println(list5);
		
		
		
		//LikedList
		System.out.println("\n==========Link List==========");
		//array
		String[] arraylist = {"Sagar","Ganesh","Kalpesh"};
		
		
		LinkedList<String> link= new LinkedList<String>(Arrays.asList(arraylist));
		
		Iterator<String> itr=link.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("\n==========HashSet==========");
		//array
		String[] hasharray = {"Kalpesh","Sagar","Ganesh","Rakesh"};
		HashSet<String> set=new HashSet<String>(Arrays.asList(hasharray));
		System.out.println(set);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ConvertionArrayToArrayList.conertArray();
		
	}

}
