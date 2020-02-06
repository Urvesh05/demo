package com.slk.task5.Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
	
	
	public static void treeMap()
	{
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();  
		//TreeMap<Integer, String>clonedata=new TreeMap<Integer, String>();
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul"); 
	      
	    
//	      clonedata=(TreeMap<Integer, String>) map.clone();
//	      System.out.println(clonedata);
//	     
	      //1.Get Data 
	      System.out.println("\n1.>>> Show (get) data ");
	      for(Map.Entry m:map.entrySet())
	      {    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    
	      
	      
		//2.remove
	      System.out.println("\n2.>>> Remove data ");
	      map.remove(101);
	      System.out.println(map);
	      
	      
	      //remove data key base and value base
	      System.out.println("\n2.>>> Remove data key and Value Base ");
	      map.remove(102, "Ravi");
	      System.out.println(map);
	      
	      
	      //4.ceilingKey()
	      System.out.println("\n4.>>> ceilingKey() it returns the least key, greater than the specified key or null if there is no such key.  ");
	      //map.ceilingKey(105);
	      System.out.println(map.ceilingKey(102));
	   
	      
	      //5.FirstKey()
	      System.out.println("\n 5.>>> Firstkey return");
	      System.out.println(map.firstKey());
	      
	      
	      //6.lastKey()
	      System.out.println("\n 6.>>> Lastkey return");
	      System.out.println(map.lastKey());
	      
	      
	      //7. Lowest Key
	      System.out.println("\n 7.>>> Lowestkey return");
	      System.out.println(map.lowerKey(103));
	      
	      
	      //8.Get get(Object key)
	      System.out.println("\n 8.>>> get(Object key) It is used to return the value to which the map maps the specified key.");
	      System.out.println(map.get(100));
	      
	      
	      //9.View Value
	      System.out.println("\n 9.>>> view of the values contained in the map.");
	      System.out.println(map.values());
	      
	      
	      //10.
	     System.out.println("\n 10. replace");
	     map.replace(100, "Amar");
	     System.out.println(map);
	     
	     
	     
	      
	      //11.Navigable Map Method 
	      System.out.println("\n11. ======= NavigableMap Method using ======== ");
	      
	      NavigableMap<Integer, String> navigableMap=new TreeMap<Integer, String>();
	      navigableMap.put(1, "viral");
	      navigableMap.put(5,"Bhavin");
	      navigableMap.put(2, "kamal");
	      navigableMap.put(7, "jay");
	     	
	      //Maintains descending order 
	      System.out.println("\n1. descendingMap: "+navigableMap.descendingMap());
	      
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("\n2. headMap: "+navigableMap.headMap(5));
	      
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("\n3. tailMap: "+navigableMap.tailMap(5,true));
	      
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("\n4. subMap: "+navigableMap.subMap(2 ,true ,7,  true));   
	      
	      
	      
	      
	      //12. Sorted Map 
	      SortedMap<Integer,String> map1=new TreeMap<Integer,String>();    
	      map1.put(100,"Amit");    
	      map1.put(102,"Ravi"); 
	      map1.put(99,"gita");
	      map1.put(101,"Vijay");    
	      map1.put(103,"Rahul"); 
	      
	      
	      System.out.println("\n\n12. ======= SortedMap Method using ======== ");
	     
	      System.out.println(" ===== Natual ordering===.");
	      
	     Iterator<Integer>itr=map1.keySet().iterator();
	     while(itr.hasNext())
	     {
	    	 Integer key=itr.next();
	    	 System.out.println("key ->"+key +" Value ->"+map1.get(key));
	     }
	     
	      //Returns key-value pairs whose keys are less than the specified key.  
	      System.out.println("\nheadMap: "+map1.headMap(102));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("\ntailMap: "+map1.tailMap(102));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("\nsubMap: "+map1.subMap(100, 102)); 
	      
	      
	      
	      
	      // 13.Custom Order 
	      System.out.println("\n\n13.====== Custom Ordering using Comparator ========");
	      TreeMap< Integer, String> map2 =new TreeMap<Integer, String>(Collections.reverseOrder());
	      map2.put(200, "anu");
	      map2.put(199, "Sagar");
	      map2.put(210, "bhavin");
	      map2.put(188, "kp");
	      
	      
	      System.out.println("   ==== reverseOrder=====");
	      System.out.println(map2);
	      
	  
	      
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeMapExample.treeMap();

	}

}
