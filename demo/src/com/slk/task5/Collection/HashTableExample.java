package com.slk.task5.Collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableExample {
	
	
	public static void hashMapTable()
	{
		
		Hashtable<Integer, String> hash= new Hashtable<Integer, String>();
		hash.put(202, "hina");
		hash.put(201, "hardip");
		hash.put(200, "jigar");
		hash.put(204, "hari");
		
		
		//1. put and get data 
		  System.out.println("1.>>> Map.Entry interface  ->Put and Get data");
		 
		
		for(Map.Entry<Integer, String> hashtable:hash.entrySet())
		{
			System.out.println(+hashtable.getKey() +" "+ hashtable.getValue());
		}
			
		
		
		//2.Enumeration Method() get data
		System.out.println("\n2. >>> Enumeration Method() using get key and values");
		Enumeration<Integer> em=hash.keys();
		while(em.hasMoreElements())
		{
				Integer s=em.nextElement();
				System.out.println(s+" "+hash.get(s));
		}
		
		
		//3. Iterator interface  get data
		System.out.println("\n3. >>> Iteretor interface using get key and values");
		Iterator<Integer>itr =hash.keySet().iterator();
		while(itr.hasNext())
		{
			Integer i = itr.next();
			String hashValue=hash.get(i);	
			
			System.out.println(i+" " +hashValue );
		}
		
		
		//3.Get Value Using key
		System.out.println("\n4. >>> get() It returns the value to which the specified key is mapped");
		System.out.println(hash.get(202));
		
		
		//5.Remove
		System.out.println("\n5. >>> Remove() data key (200)");
		//hash.remove(200);
		//System.out.println(hash);
		
		
		//6.Get Values 
		System.out.println("\n6. >>> .values() get Values ");
		System.out.println(hash.values());
		
		
		//7.computeIfAbsent(Key, Function) method:
		/*System.out.println("\n7. >>> computeIfAbsent(Key, Function) method:");
		hash.computeIfAbsent(201, k -> "hhh");
		System.out.println(hash);
		*/
		
		
		//8.getOrDefault(Object key, V defaultValue)
		System.out.println("\n7. >>> getOrDefault ");
		//hash.getOrDefault(200, "jigar");
		System.out.println(hash.getOrDefault(200, "jigar"));
		
		
		//9.
		System.out.println("\n9. >>> keyset() return key ");
		System.out.println(hash.keySet());
		
		
		//10.Replace Values
		System.out.println("\n10. >>> replece() Replace Values");
		hash.replace(200, "Kalpesh");
		System.out.println(hash);
		
		
		
		//11.equals(Object o)
		System.out.println("\n11. >>> equals(Object o) ");
		Hashtable<Integer, String> hash1= new Hashtable<Integer, String>();
		hash1.put(202, "hina");
		hash1.put(201, "hardip");
		hash1.put(200, "jigar");
		hash1.put(204, "hari");
		hash1.put(206,"ff");
		
		if(hash.equals(hash1))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("not same");
		}
		
		
	
		
		/*
		
		//2.Enumeration ( return value)
		
		Hashtable<Integer, String> hash1= new Hashtable<Integer, String>();
		hash1.put(202, "hina");
		hash1.put(201, "hardip");
		hash1.put(200, "jigar");
		hash1.put(204, "hari");
		
		
		System.out.println("\n 2. >>> Enumeration ");
		Enumeration e=hash1.elements();
		
		while(e	.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println();
		
		
		
		
		Hashtable<String, Integer> hash2= new Hashtable<String, Integer>();
		hash2.put("202", 1020);
		hash2.put("201", 500);
		hash2.put("200", 200);
		hash2.put("204", 100);
		
		System.out.println("\n 2. >>> Enumeration ");
		Enumeration e1=hash2.elements();
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		*/
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashTableExample.hashMapTable();
		
	}

}
