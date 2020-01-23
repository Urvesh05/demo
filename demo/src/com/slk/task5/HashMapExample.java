package com.slk.task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(99, "abc");
		map.put(98, "Hiral");
		map.put(100, "Sagar");
		map.put(102, "shrma");
		
		//System.out.println(map);
		
		//1. Show data
		System.out.println("\n1.>>> Put And Show Data");
		for(Map.Entry<Integer,String> m:map.entrySet())
		{
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		
		//2.Get Data 
		System.out.println("\n2.>>> Get Data by key");
		String s=map.get(100);
		System.out.println(s);
		
		
		//3.remove
		System.out.println("\n3.>>> Remove Data key base");
		System.out.println(map.remove(102));
		
		
		//remove key base
		System.out.println("\n3.>>> Remove key and value base");
		map.remove(99, "abc");
		System.out.println(map);
		
		
		//4. putIfAbsent
		System.out.println("\n4.>>>  inserts the specified value with the specified key");
		map.putIfAbsent(103, "urveh");
		System.out.println(map);
		
		
		//5.replace
		System.out.println("\n5.>>> Replace value for a specified key.");
		map.replace(98, "Hari");
		System.out.println(map);
		
		// old value with the new value for a specified key
		System.out.println("\n5.>>>  Replaces the old value with the new value for a specified key..");
		map.replace(100, "Sagar", "Tarun");
		System.out.println(map);
		
		
		//6.Size
		System.out.println("\n6.>>> HashMap Size().");
		System.out.println(map.size());
		
		//7.key And Value Show
		System.out.println("\n7.>>> Show Only Key.");
		System.out.println(map.keySet());
		
		System.out.println("\n7.>>> Show Only Values.");
		System.out.println(map.values());
		
		//8.put all
		System.out.println("\n8.>>> PutAll .");
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(105, "maehul");
		map1.put(107, "raja");
		
		map.putAll(map1);
		System.out.println(map);
		

	}

}
