package com.slk.task5;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void treeSet()
	{
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(10);
		tree.add(20);
		tree.add(4);
		tree.add(60);
		tree.add(23);
		
		//1. add elements
		System.out.println(">>> 1. Add elements  (Itretor) ");
		
		Iterator<Integer> itr =tree.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//2.Traversing element through Iterator in descending order
		System.out.println(">>> 2. Descending order ");
		Iterator itr1 =tree.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		//3.Duplicate elements
		System.out.println("\n>>> 3.Duplicate elements are not allowed");
		tree.add(10);//not allowed
		System.out.println(tree);
		
		
		//4. returns the first (lowest) element currently in this set.
		System.out.println("\n>>> 4. First Lowest Elements");
		System.out.println(tree.first());
		
		
		//5. returns the last (greatest) element currently in this set.
		System.out.println("\n>>> 5. Last greates element ");
		System.out.println(tree.last());
		
		
		//6.removes all the elements from the TreeSet.
		System.out.println("\n>>> 6.Clear All elements ");
		//tree.clear();
		//System.out.println(tree);
		
		
		//7.contains(Object o) : returns true if the TreeSet contains the specified element, othrwise false.
		System.out.println("\n>>> 7. Contains check  value");
		System.out.println(tree.contains(10));
		
		
		//8.  isEmpty() : returns true if TreeSet contains no element, otherwise false.
		System.out.println("\n>>> 8.isEmpty() : returns true otherwise false.");
		System.out.println(tree.isEmpty());
		
		
		//9. Object ceiling(Object o):
		System.out.println("\n>>> 9. It returns the equal ro greatest element of the specified element from the set, ");
		System.out.println(tree.ceiling(10));
		System.out.println(tree.ceiling(2));//2 > Greater elements return //4
		
		
		//10. higher(Object o):
		System.out.println("\n >>> 10.greater than the given element in the argument of this method");
		System.out.println(tree.higher(20));//20 Greater return one elements
		
		
		//11. Lower 
		System.out.println("\n >>> 11. strictly less than the given element in the set");
		System.out.println(tree.lower(10));//return 4 
		
		
		//12.  pollFirst(): returns as well as removes the lowest element,
		System.out.println("\n >>> 12.This method returns as well as removes the lowest element,");
		System.out.println(tree.pollFirst());
		
		
		//13.  pollLast(): returns as well as removes the lowest element,
		System.out.println("\n >>> 12.This method returns as well as removes the highest element,");
		System.out.println(tree.pollLast());
		
		
		//14. SortedSet tailSet(Object fromElement):
		System.out.println("\n>>> 14. This method returns group of elements that are greater than or equal to fromElement:");
		TreeSet< Integer> tree2 = new TreeSet<Integer>();
		tree2=(TreeSet<Integer>) tree.tailSet(20);
		System.out.println(tree2);
		
		//15.NavigableSet tailSet(E fromElement, boolean inclusive)
		System.out.println("\n>>> 15.It returns a set of elements that are greater than or equal to (if, inclusive is true) the specified element. ");
		TreeSet< Integer> tree3 = new TreeSet<Integer>();
		tree3=(TreeSet<Integer>) tree.tailSet(20, false);
		System.out.println(tree3);
		
		
		//16. Comparator
		System.out.println("\n>>> 16. Comparetor ");
		TreeSet< Integer> tree4=new TreeSet<Integer>();
		tree4=(TreeSet<Integer>) tree.comparator();
		System.out.println(tree4);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSetExample.treeSet();
		
	}

}
