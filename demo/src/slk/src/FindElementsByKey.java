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
        map.put("Geeks", 10); 
        map.put("4", 15); 
        map.put("Geeks", 20); 
        map.put("Welcomes", 25); 
        map.put("You", 30); 
  
        // Displaying the Map 
        System.out.println("Initial Mappings are: " + map); 
  
        // Getting the value of "Geeks" 
        System.out.println("The Value is: " + map.get("Geeks")); 
  
        // Getting the value of "You" 
        System.out.println("The Value is: " + map.get("You")); 
		
	}

}
