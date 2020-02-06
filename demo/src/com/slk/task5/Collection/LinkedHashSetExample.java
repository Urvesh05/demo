package com.slk.task5.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Spliterator;

public class LinkedHashSetExample {
	
	public static void linkedHaseSet()
	{
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("Arun");
		linkedHashSet.add("Abhi");
		linkedHashSet.add("Farun");
		linkedHashSet.add("Naresh");
		linkedHashSet.add("Rohit");
		
		
				//1. add elements
				System.out.println(">>> 1. Add elements  (Itretor) ");
				
				Iterator< String> itr =linkedHashSet.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
				//2.Duplicate elements
				System.out.println("\n>>> 2.Duplicate elements are not allowed");
				linkedHashSet.add("Amar");//not allowed
				System.out.println(linkedHashSet);
				
				//3. Clone the HashSet  
				System.out.println("\n>>> 3. Clone haseSet");
				HashSet< String> cloneHaseSet=new HashSet<String>();
				cloneHaseSet=(HashSet<String>) linkedHashSet.clone();
				System.out.println(cloneHaseSet);   //Displaying the new Set after Cloning;  
				
				
				//4.contains() Method
				System.out.println("\n>>> 4.contains() ckeck elements");
				System.out.println(linkedHashSet.contains("abc"));//return true or false
				
				
				//5.  isEmpty() Method
				System.out.println("\n>>> 5.  isEmpty() Method ");
				System.out.println(linkedHashSet.isEmpty());//return true or false
				
				
				
				//6.remove
				System.out.println("\n>>> 6. Remove elements");
				linkedHashSet.remove("abc");
				System.out.println(linkedHashSet);
				
				
				//7. Size
				System.out.println("\n>>> 7. Size ");
				System.out.println(linkedHashSet.size());
				
				
				//8. Spliterator() 
				System.out.println("\n>>> 8.Spliterator() method ");//elements sequentially in a single Thread
				Spliterator<String>  SetSplitState=linkedHashSet.spliterator();// ( Checked elements one by one )
				SetSplitState.forEachRemaining(System.out::println);
				
				//ClassCastException:
				/*ListIterator <String> l=(ListIterator<String>) linkedHashSet.iterator();
				while(l.hasNext())
				{
					System.out.println(l.next());
				}
				*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSetExample.linkedHaseSet();
	}

}
