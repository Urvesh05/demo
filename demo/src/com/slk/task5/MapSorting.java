package com.slk.task5;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapSorting {
	
	public static void mapSort()
	{
		
		
		//implementation of HashMap  
		HashMap<Integer, String> hm=new HashMap<Integer, String>();   
		hm.put(23, "Yash");  
		hm.put(17, "Arun");  
		hm.put(15, "Swarit");  
		hm.put(9, "Neelesh");  
		
		System.out.println("\n=========== Map Sorting Key Base==========");
		System.out.println("\n=======Before key Sorting==========="); 
		
		Iterator <Integer> it = hm.keySet().iterator();         
		while(it.hasNext())  
		{  
			int key=(int)it.next();  
			System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
		}  
		
		
		System.out.println("\n========After Key Sorting===========");  
		
		TreeMap<Integer, String>tm=new TreeMap<Integer, String>(hm);
		Iterator<Integer> itr=tm.keySet().iterator();
		while(itr.hasNext())
		{
			int key=(int) itr.next();
			System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
		}
		
	
		
		/*
		System.out.println("=====After Sorting====="); 
		Map<Integer, String>sort=new TreeMap<Integer, String>(map);
		System.out.println(sort);
		Iterator<Integer> itrSort=sort.keySet().iterator();
		while(itrSort.hasNext());
		{
			int keySort=itrSort.next();
			System.out.println(keySort+map.get(keySort));
			
		}*/
		//System.out.println(sort);
		
		
//		Map<Integer, String> sortatemap=new TreeMap<Integer, String>(map);
//		System.out.println(map);
		
		
/*
		Map<Integer, String> sort=new TreeMap<Integer, String>(Collections.reverseOrder());
		sort.putAll(map);
			
		
		System.out.println("=====Descending Order======");
		
		Iterator< Integer > i =sort.
		
		*/
		
		
	}
	
	
	//Value Sorting
	public static void sortValue()
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();   
		hm.put(23, "Yash");  
		hm.put(17, "Arun");  
		hm.put(15, "Swarit");  
		hm.put(9, "Neelesh");  
		
		
		System.out.println("\n=========== Map Sorting Value Base==========");
		System.out.println("\n========Before value Sorting==========="); 
		
		Set set = hm.entrySet();
		Iterator itr1=set.iterator();
		
		while(itr1.hasNext())
		{
			Map.Entry<Integer, String> map=(Map.Entry<Integer, String>)itr1.next();
			System.out.println("Roll no:  "+map.getKey()+"     Name:   "+map.getValue());
		}
		
		 //sorting
		System.out.println("\n========After value Sorting========"); 
		
		Map<Integer, String> map= value(hm);
	
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();  
		
		while(iterator2.hasNext())   
		{  
			Map.Entry me2 = (Map.Entry)iterator2.next();  
			System.out.println("Roll no:  "+me2.getKey()+"     Name:   "+me2.getValue());  
		}  
		}  
		

	private static Map<Integer, String> value(HashMap<Integer, String> map) 
	{
		// TODO Auto-generated method stub
		//List list = new LinkedList(map.entrySet());  
		List list=new LinkedList(map.entrySet());	
		Collections.sort(list,new Comparator()
		{

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
			}
		});
		
		
		
		HashMap sortmap=new LinkedHashMap();
		
		for(Iterator it=list.iterator();it.hasNext();)
			
		{
			Map.Entry entry=(Map.Entry) it.next();	
			sortmap	.put(entry.getKey(), entry.getValue());
		}
		return sortmap;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapSorting.mapSort();
		MapSorting.sortValue();

	}

}
