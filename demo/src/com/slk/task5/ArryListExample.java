package com.slk.task5;

import java.awt.image.SampleModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Predicate;

public class ArryListExample {
	
	//add() method
	public static void Adddata()
	{
		
		int i=1;	
		
		ArrayList<String> list= new ArrayList<String>();
		
		
		// 1. Add()
		System.out.println(">>>>  1.Add Data");
		list.add("Karan");
		list.add("Rohan");
		list.add("Amit");
		list.add("Hitesh");
		list.add("Amit");
		list.add("Amit");
		list.add("Karan");
		list.add("Karan");
		
		
		//display elements
		System.out.println("\nAll Data Diplay");
		for(String s:list)
			{
				System.out.println(i++  +"." +s);
			}
	
		//Clone data
		ArrayList<String> cloneData = (ArrayList<String>) list.clone();
		
		System.out.println("\n >>> .Clone Data\n"+cloneData);
		//System.out.println(list.size());
		
		
		//Clear elements
		//list.clear();
		//System.out.println(list);
		
		// Contains 
		System.out.println("\n>>>> .Contains Data Check");
		System.out.println(list.contains("Hitesh"));//true or false
	
		
		//get 
		System.out.println("\n>>>> .Get And Set elements");
		System.out.println(list.get(2));
		System.out.println(list.set(3, "Third"));
		
		//Index of
		System.out.println("\n>>>> .Indxe of");
		System.out.println(list.indexOf("Third"));
		System.out.println(list.lastIndexOf("Third"));
		
		
		//list Iterator
		System.out.println("\n>>>> .List Iterator");
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//remove
		list.remove(1);
		System.out.println(list);
		
		System.out.println("\n>>>> .RemoveAll elements");//Similar elements remove
		list.removeAll(Collections.singleton("Amit"));
		System.out.println(list);
		
		
		//retailAll 
		System.out.println("\n>>>> .RetailAll elements");
		list.retainAll(Collections.singleton("Karan"));//(Karan) This elements show and another elements are all deletes
		System.out.println(list);
		
		
		//Spliterator
		System.out.println("\n>>> . Spliterator ");//check next elements . and Show all elements at one columns	
		Spliterator<String> str=list.spliterator();
		str.tryAdvance(d -> System.out.println(d));
		
		
		//sublist 
		System.out.println("\n>>> . Sublist ");
		list.subList(1,3);
		System.out.println(list);
		
		
		
		//ToArray 
		System.out.println("\n>>> . toArray ");//converting Arraylist To Array
		Object[] obj=list.toArray();
		for(Object value:obj)
		{
			System.out.println(value);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArryListExample.Adddata();
		
	}

}
