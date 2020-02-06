package com.slk.task5.Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	public static void linkedHashMap()
	{
		
		
		LinkedHashMap<Integer, String> map= new LinkedHashMap<Integer, String>();
		map.put(89, "Xyz");
		map.put(90, "Abc");
		map.put(88, "Ashok");
		map.put(100, "Jigu");
		
		
		//1.Put And Show Data
		
		System.out.println("\n 1. >>> put and Show Data");
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		
		 //2.Fetching key  
		 System.out.println("\n 2. >>> key base ");
	       System.out.println("Keys: "+map.keySet());  
	       
	       //Fetching value 
	       System.out.println("\n 2. >>> Value base ");
	       System.out.println("Values: "+map.values()); 
	       
	       //Fetching key-value pair  
	       System.out.println("\n 2. >>> key and value base ");
	       System.out.println("Key-Value pairs: "+map.entrySet());  
	       
	       
	       //3.Remove
	       System.out.println("\n 3. >>> Remove key base  ");
	       map.remove(88);
	       System.out.println(map);
	       
	       //remove key and value
	       System.out.println("\n 3. >>> Remove key and value base  ");
	       map.remove(100, "Jigu");
	       System.out.println(map);
	    
	       //4.get 
	       System.out.println("\n 4. >>> Get data key Base ");
	       System.out.println(map.get(90));
		
	       
	       
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMapExample.linkedHashMap();

	}

}
