package slk.src.Prectice;

import java.util.HashMap;
import java.util.Map;


public class FindElementsByKey {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Creating an empty Map 
        Map<String, Integer> map = new HashMap<String, Integer>(); 
  
        // Mapping int values to string keys 
        map.put("Heppy", 10); 
        map.put("Hari", 15); 
        map.put("Ronak", 20); 
        map.put("Sanjay", 25); 
        map.put("Yogi", 30); 
  
        // Displaying the Map 
        System.out.println("Initial Mappings are: " + map); 
  
        // Getting the value 
        System.out.println("The Value is: " + map.get("Yogi")); 
  
        // Getting the value 
        System.out.println("The Value is: " + map.get("Ronak")); 
        
      
	}

}
