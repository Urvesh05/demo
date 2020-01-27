package com.slk.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class InsertionCollection {
	
	
	public static void arrayListInsertion()
	{
		
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(102);
		array.add(102);
		
		ArrayList<Integer> array2=new ArrayList<Integer>();
		array2.add(100);
		array2.add(105);
		
		
		System.out.println("=======ArrayList========");
		array.addAll(array2);
		
		for(Integer s:array)
		{
			System.out.println(s);
		}
		
	}
	
	
	
	public static void likedList()
	{
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(500);
		list.add(204);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(200);
		list2.add(230);
		list2.add(403);
		
		
		System.out.println("=======LinkedList========");
		list.addAll(list2);
		
		for(Integer s:list)
		{
			System.out.println(s);
		}
		
	}

	
	public static void hashSet()
	{
		
		HashSet<String> set=new HashSet<String>();
		set.add("abc");
		set.add("hitesh");
		set.add("Amar");
		
		
		System.out.println("=======HashSet========");
		Iterator< String> itr =set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void map()
	{
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(102,"Jigu");
		map.put(101,"Ganesh");
		map.put(null, "100"); // null key
		map.put(10, null); // null value
	
		//System.out.println(map);
		
		
		
		System.out.println("=======Map Interface========");;
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InsertionCollection.arrayListInsertion();
		InsertionCollection.likedList();
		InsertionCollection.hashSet();
		InsertionCollection.map();
	}

}
