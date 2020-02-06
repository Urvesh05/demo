package com.slk.task5.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;



public class HashSetExample {
	
	
	public static void hashSet()
	{
		HashSet<String> set=new HashSet<String>();
		set.add("abc");
		set.add("hitesh");
		set.add("Amar");
		
		
		//1. add elements
		System.out.println(">>> 1. Add elements  (Itretor) ");
		
		Iterator< String> itr =set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//2.Duplicate elements
		System.out.println("\n>>> 2.Duplicate elements are not allowed");
		set.add("Amar");//not allowed (
		
		
		//3.clear
		System.out.println("\n>>> 3. Clear elements");
		//set.clear();
		//System.out.println(set);
		
		
		//4. Clone the HashSet  
		System.out.println("\n>>> 4. Clone haseSet");
		HashSet< String> cloneHaseSet=new HashSet<String>();
		cloneHaseSet=(HashSet<String>) set.clone();
		System.out.println(cloneHaseSet);   //Displaying the new Set after Cloning;  
		
		
		//5.contains() Method
		System.out.println("\n>>> 5.contains() ckeck elements");
		System.out.println(set.contains("abc"));//return true or false
		
		
		//6.  isEmpty() Method
		System.out.println("\n>>> 6.  isEmpty() Method ");
		System.out.println(set.isEmpty());//return true or false
		
		
		//7.remove
		System.out.println("\n>>> 7. Remove elements");
		set.remove("abc");
		System.out.println(set);
		
		
		//8. Size
		System.out.println("\n>>> 8. Size ");
		System.out.println(set.size());
		
		
		//9. Spliterator() 
		System.out.println("\n>>> 9.Spliterator() method ");//elements sequentially in a single Thread
		Spliterator<String>  SetSplitState=set.spliterator();// ( Checked elements one by one )
		SetSplitState.forEachRemaining(System.out::println);
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSetExample.hashSet();
	}

}
