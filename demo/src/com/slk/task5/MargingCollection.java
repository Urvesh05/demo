package com.slk.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class MargingCollection {
	
	
	public static void arrayListMarge()
	{
		
		 ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));
         
	     ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
	         
	     
	     System.out.println("\n======ArrayList Marge======");
	        listOne.addAll(listTwo);    //Merge both lists
	         
	        System.out.println(listOne);
	        
	    }
	
	
	public static void arrayListMargeSingel()
	
	{
		ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));
         
	     ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
	      
	     
	     //1
	     System.out.println("\n======ArrayList Marge Duplicate Not Allow======");
	     	List<String> listTwoCopy=new ArrayList<String>(listTwo);
	     	
	        listTwoCopy.removeAll(listOne);
	        listOne.addAll(listTwoCopy);
	        System.out.println(listOne);
	        
	       //2
	        
	        /*
	        Set<String> set = new LinkedHashSet<>(listOne);
	        set.addAll(listTwo);
	        List<String> combinedList = new ArrayList<>(set);
	         
	        System.out.println(combinedList);
	        */
	}
	
	
	
	public static void margeSet()
	{
		HashSet<String>set = new HashSet<String>();
		set.add("Hello");
		set.add("hi");
		
		
		
		HashSet<String>set2 = new HashSet<String>();
		set2.add("ok");
		set2.add("Goood ");
		set2.add("hi");//duplicate Not Allow
		
		  System.out.println("\n======HashSet Marge======");
		set.addAll(set2);
		System.out.println(set);
	}

	
	public static void margeMap() //ignore Duplicate Key
	{
		//map 1
		HashMap<Integer, String> map1 = new HashMap<>();
		 
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map1.put(5, "E");
		 
		//map 2
		HashMap<Integer, String> map2 = new HashMap<>();
		 
		map2.put(1, "G");   //It will replace the value 'A'
		map2.put(2, "B");
		map2.put(3, "C");	//ignore Duplicate Key
		map2.put(4, "D");   //A new pair to be added
		 
		 System.out.println("\n======HashMap Marge======");
		//Merge maps
		map1.putAll(map2);
		 
		System.out.println(map1);
		
	}
	
	
	public static void margeHaseMap()//Handle Duplicate key
	{
		//map 1
		HashMap<Integer, String> map1 = new HashMap<>();
		 
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map1.put(5, "E");
		 
		//map 2
		HashMap<Integer, String> map2 = new HashMap<>();
		 
		map2.put(1, "G");   //It will replace the value 'A'
		map2.put(2, "B");
		map2.put(3, "C");
		map2.put(4, "D");   //A new pair to be added
		
		//Key, value and uses a user-provided BiFunction to merge values for duplicate keys.
		System.out.println("\n======HashMap Marge Duplicate key Handle======");
		
		map2.forEach((key, value) -> map1.merge( key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " +v2));
		
		
		System.out.println(map1);
		
	}
	
	public static void treemapMarge() {
		
		
		 // Declaring the tree maps of Integer and String 
        TreeMap<String, Integer> tmp1 = new TreeMap<String, Integer>(); 
        TreeMap<String, Integer> tmp2 = new TreeMap<String, Integer>(); 
  
        // assigning the values in the tree map 
        // using put() 
        tmp1.put("two", 3); 
        tmp1.put("one", 1); 
        tmp1.put("foure", 6);
  
        // assigning in 2nd TreeMap 
        tmp2.put("three", 3); 
        tmp2.put("two", 2); 
        tmp1.put("foure", 4);//override Value
  
        System.out.println("\n======TreeMap Marge======");
		
        System.out.println("\nFirst treemap values are : " + tmp1); 
  
        // use of putAll() 
        // Putting 2nd map in 1st map 
        tmp1.putAll(tmp2); 
  
        System.out.println("\n Values after modifying 1st treemap : " + tmp1); 
    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MargingCollection.arrayListMarge();
		MargingCollection.arrayListMargeSingel();
		MargingCollection.margeSet();
		MargingCollection.margeMap();
		MargingCollection.margeHaseMap();
		MargingCollection.treemapMarge();
		
	}

}
