package com.slk.task5.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvetionListToArray {
	
	public static  void listConvert()
	{
		
		List<String> list=new ArrayList<String>();
		list.add("Tarun");
		list.add("Hari");
		list.add("Rahul");
		list.add("jigu");
			
		 System.out.println("====Converting ArrayList to Array of String======" );  
		 /*
		   String[] item = list.toArray(new String[list.size()]);  
	        for(String s : item)
	        {  
	            System.out.println(s);  
	        }  
		*/
		Object[] array=list.toArray();
		
		for(Object s:array)
		{
			System.out.println(s);
		}
	
	}
	
	
	public static void  listConvertInteger()
	{
		List<Integer>list1 = new ArrayList<Integer>();
		list1.add(20);
		list1.add(30);
		list1.add(23);
		list1.add(10);
		
		System.out.println("\n=====Convert ArrayList to Array of Integers=====");
		
		Integer[] array2 =new Integer[list1.size()];
		array2=list1.toArray(array2);
		
		for(Integer i:array2)
		{
			System.out.println(i);
		}
		
		/*
		Integer[] array1=list1.toArray(new Integer[list1.size()]);
		for(Integer s1:array1)
		{
			System.out.println(s1);
		}
		*/
		}
	
	
	public static void linkListToArray()
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("surat");
		linkedList.add("Nashik");
		linkedList.add("Baroda");
		
		System.out.println("\n=====Convert LinkedList to Array of String =====");
		
		String[] array=new String[linkedList.size()];
		array=linkedList.toArray(array);
		
		for(String s:array)
		{
			System.out.println(s);
		}
	}
	
	
	
	public static void linkListToArrayInteger()
	{
		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
		linkedList1.add(23);
		linkedList1.add(45);
		linkedList1.add(76);
		linkedList1.add(12);
		
		System.out.println("\n=====Convert LinkedList to Array of Integer =====");
		
		Integer[] i=new Integer[linkedList1.size()];
		i=linkedList1.toArray(i);
		
		for(Integer s:i)
		{
			System.out.println(s);
		}
		
		//Integer[] i1=linkedList1.toArray(new Integer[0]);
		//System.out.println(Arrays.toString(i1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConvetionListToArray.listConvert();
		ConvetionListToArray.listConvertInteger();
		ConvetionListToArray.linkListToArray();
		ConvetionListToArray.linkListToArrayInteger();
	}

}
