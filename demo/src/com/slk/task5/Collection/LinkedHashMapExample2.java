package com.slk.task5.Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample2 
{
	
	private static final int Max_Entries =4;

	public static void main(String[] args) 
	{
		//Anonymous class
		LinkedHashMap<Integer, String> map= new LinkedHashMap<Integer, String>(Max_Entries, 0.75F)
		{
			protected boolean removeEldestEntry(Map.Entry eldest)
			
			{

				return size() > Max_Entries;
			}
		};
		
		map.put(100, "jigu");
		map.put(202, "hari");
		map.put(200, "kapil");
		map.put(204, "abc");
		
		System.out.println(map);
		
		
		
	
	}

}
