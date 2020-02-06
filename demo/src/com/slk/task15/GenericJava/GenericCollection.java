package com.slk.task15.GenericJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

public class GenericCollection {
	
	//List 
	static void listClass()
	{
		System.out.println("1. ============List Interface======\n");
		System.out.println("============ArrayList===========");
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(45);
		list.add(87);
		list.add(58);
		
		//ListIteretor 
		ListIterator<Integer> itr= list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
			//for loop 
		/*
			for (Integer integer : list)
			{
				System.out.println(integer);
			}
			*/
	}
	
	
	//LinkedList
	 static void likedList()
	 {
		 System.out.println("\n=========Linked List========");
		 List<String> link = new ArrayList<String>();
		 link.add("karim");
		 link.add("jiga");
		 link.add("hiral");
		 
		 for (String string : link) {
			System.out.println(string);
		}
		 
	 }
	 
	 //HashSet
	 static void hashSet()
	 {
		 System.out.println("\n 2. =========Set Interface ========\n");
		 
		 System.out.println("=========HashSet========");
		 
		 Set<Integer> set = new HashSet<Integer>();
		 set.add(57);
		 set.add(88);
		 set.add(67);
		 set.add(23);
		 
		 Iterator< Integer>itr= set.iterator();
		 
		 while (itr.hasNext())
		 {
			
			System.out.println(itr.next());
		 }
		 
		 
	 }
	 
	 
	 //LinkedHashSet
	 static void linkedHashSet() 
	 {
		 System.out.println("\n=========LinkedHashSet========");
		 
		 Set<String> hset= new LinkedHashSet<String>();
		 hset.add("Abc");
		 hset.add("Milan");
		 hset.add("Rohan");
		 hset.add("kamal");
		 
		 Iterator< String> l= hset.iterator();
		 while (l.hasNext()) 
		 {
			
			System.out.println(l.next());
		}
		 
		 
	 }
	 
	 
	 //SortedSet(TreeSet)
	 
	 static void treeSet()
	 {
		 System.out.println("\n=========TreeHashSet========");
		 
		 Set< Integer > tree = new TreeSet<Integer>();
		 tree.add(50);
		 tree.add(67);
		 tree.add(57);
		 tree.add(20);
		 
		 Iterator< Integer > itr=tree.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
	 }
	 //HeshMap
	 static void hashMap()
	 {
		 System.out.println("\n 3. =========Map Interface ========\n");
		 
		 System.out.println("=========HashMap========");
		 
		 Map<Integer, String> hasMap = new HashMap<Integer, String>();
		 hasMap.put(18, "Tarun");
		 hasMap.put(05, "Rahul");
		 hasMap.put(45, "Hina");
		 
		 for(Map.Entry<Integer, String> map:hasMap.entrySet()){
			 System.out.println(map.getKey()+" "+map.getValue());
		 }

	 }
	 
	 //LinkedHashMap
	 static void linkedHashMap()
	 {
		 System.out.println("\n=========LinkedHashMap========");
		 Map<Integer, String> linkedMap= new LinkedHashMap<Integer, String>();
		 linkedMap.put(45, "Sagar");
		 linkedMap.put(87, "Vivek");
		 linkedMap.put(53, "Naresh");
		 
		 for(Map.Entry<Integer, String> lMap:linkedMap.entrySet())
		 {
			 System.out.println(lMap.getKey()+" "+lMap.getValue());
		 }
		 
		 
	 }
	 
	 
	 //TreeMap
	 static void treeMep()
	 {
		 System.out.println("\n=========TreeMap========");
		 SortedMap< Integer, Integer> tree = new TreeMap<Integer, Integer>();
		 tree.put(80, 12);
		 tree.put(50, 43);
		 tree.put(40, 10);
		 
		 for(Map.Entry<Integer, Integer>treemap:tree.entrySet())
		 {
			 System.out.println(treemap.getKey()+" "+treemap.getValue());
		 }
		 
	 }
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GenericCollection.listClass();
		GenericCollection.likedList();
		GenericCollection.hashSet();
		GenericCollection.linkedHashSet();
		GenericCollection.treeSet();
		GenericCollection.hashMap();
		GenericCollection.linkedHashMap();
		GenericCollection.treeMep();
	}

}



