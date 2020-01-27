package slk.src.Prectice;

import java.util.LinkedHashMap;


public class FindLinkedHsMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Creating an empty HashMap 
        LinkedHashMap<Integer, String> li_hash_map =  
        new LinkedHashMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        li_hash_map.put(10, "Geeks"); 
        li_hash_map.put(15, "4"); 
        li_hash_map.put(20, "Geeks"); 
        li_hash_map.put(25, "Welcomes"); 
        li_hash_map.put(30, "You"); 
  
        // Displaying the LinkedHashMap 
        System.out.println("Initial Mappings are: " + li_hash_map); 
  
        // Getting the value of 25 
        System.out.println("The Value is: " + li_hash_map.get(25)); 
  
        // Getting the value of 10 
        System.out.println("The Value is: " + li_hash_map.get(10)); 
	}

}
