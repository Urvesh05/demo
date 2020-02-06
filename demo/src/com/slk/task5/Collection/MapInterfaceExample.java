package com.slk.task5.Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class MapInterfaceExample {
	
	
	
	public static void map()
	{
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(102,"Jigu");
		map.put(101,"Ganesh");
		map.put(null, "100"); // null key
		map.put(10, null); // null value
		map.put(11, null); // null value
		
		//System.out.println(map);
		
		
		
		System.out.println("1.>>> show data");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//Key show
		System.out.println("\n2.>>> show Key");
		for(Integer i:map.keySet())
		{
			System.out.println(i);
		}
		
		//values show
		System.out.println("\n3.>>> show Values");
		for(String s:map.values())
		{
			System.out.println(s);
		}
		
		
		//Get value by key – HashMap.get()
		System.out.println("\n>>> 4.Get value by key – map.get()");
		String value=map.get(101);
		System.out.println(" key is 101 >> "+value);
		
		
		//Set value by key – HashMap.get()
		System.out.println("\n>>> 4.Set value by key – map.set()");
		
		
		
		
		
		//remove value by key – HashMap.remove
		System.out.println("\n>>> 4.Get value by key – map.remove");
		String value1=map.remove(101);
		System.out.println(" Remove value  >> "+value1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MapInterfaceExample.map();
		
	}

}
