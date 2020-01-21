package slk;

import java.util.LinkedHashMap;

public class LinkHashExample {

	
	//LinkedHashMap is insertion ordered
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> hashmap = new LinkedHashMap<>();
        
		hashmap.put(1,  "A");
		hashmap.put(2,  "B");
		hashmap.put(3,  "C");
		hashmap.put(5,  "E");
		hashmap.put(4,  "D");
		
		hashmap.forEach((key,value)->
		{
			System.out.println(key+value);
		});

	}

}
