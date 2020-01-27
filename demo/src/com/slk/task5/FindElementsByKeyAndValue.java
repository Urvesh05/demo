package com.slk.task5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindElementsByKeyAndValue {
	
	public static void getKey() {
		
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		 // Mapping int values to string keys 
        map.put("Heppy", 10); 
        map.put("Hari", 15); 
        map.put("Ronak", 20); 
        map.put("Sanjay", 25); 
        map.put("Yogi", 30); 
		
		
        
        // Displaying the Map 
        System.out.println("Initial Mappings are: " + map); 
  
        System.out.println("\n========Find The Key ==============");
        
        // Getting the value 
        System.out.println("The Value is: " + map.get("Yogi")); 
  
        // Getting the value 
        System.out.println("The Value is: " + map.get("Ronak")); 
 
	}
	
	public static void getValue()
	{
		LinkedHashMap<Integer, String> link =  new LinkedHashMap<Integer, String>(); 
			  
			        // Mapping string values to int keys 
			link.put(10, "Haresh"); 
			link.put(15, "Jigu"); 
			link.put(20, "Hari"); 
			link.put(25, "Kalpesh"); 
			link.put(30, "Yogi"); 
				  
			 // Displaying the LinkedHashMap 
			 System.out.println("\nInitial Mappings are: " + link); 
			 System.out.println("\n========Find The Value==============");
			 
			  
			 // Getting the value of 25 
			   System.out.println("The Value is: " + link.get(25)); 
			  
			  // Getting the value of 10 
			   System.out.println("The Value is: " + link.get(10)); 
				

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FindElementsByKeyAndValue.getKey();
		FindElementsByKeyAndValue.getValue();

	}

}
