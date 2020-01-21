package slk;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapLoop2 {
	
	public static void  loops()
	{
		
		//ConcurrentHashMap
		/*
		Map<String,String> map=new ConcurrentHashMap<String, String>(); 
		
		map.put("r","Hari");
		map.put("e","jiya");
		
		System.out.println(map);
		*/
		//HashMap
	HashMap<String, String>	map= new HashMap<String, String>();
		
		map.put("B","20");
		map.put("A","103");
		map.put("D","111");
		
		System.out.println("First put Data");
		Iterator<String> itr= map.keySet().iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
		
		//Add values in to loop
		System.out.println("\nLoop using in put Data");
		for(int i=0;i<map.size();i++)
		{
			map.put("Y","karan");
			map.put("O","mayank");
				
		}
		//System.out.println(map);
		
		//show all data
		Set<Entry<String, String>>entrySet=map.entrySet();
		for(Entry<String, String>entry:entrySet)
		{
			System.out.println(entry.getKey() +" " +entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMapLoop2.loops();
	}

}
