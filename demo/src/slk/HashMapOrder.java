package slk;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapOrder {

	public static void order()
	{
		
		Map <Integer ,String> map= new HashMap<>();

		map.put(4, "jigar");
		map.put(6, "hari");
		map.put(1, "Ganesh");
		map.put(7, "kiram");
		map.put(9,"Zarana");
		map.put(8, "tarun");
		map.put(2, "radha");
		
		System.out.println("Elements of the HashMap before Sorting");
		System.out.println(map+"\n");
		
		List<Entry<Integer,String>> unsortedList = new ArrayList<Entry<Integer,String>>(map.entrySet());
		
		//sort key compare
		Collections.sort(unsortedList,new Comparator<Entry<Integer, String>>() 
		{

			@Override
			public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
				// TODO Auto-generated method stub
				return e1.getKey().compareTo(e2.getKey());
			}
			
		});
		
		
		Map<Integer,String> sortedMap = new LinkedHashMap<Integer, String>();
 
	       for(Map.Entry<Integer, String>entry:map.entrySet())
	       {
	    	   System.out.println("Key : "+entry.getKey()+" values : "+entry.getValue());
	       }
			
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		HashMapOrder.order();
		
		
	
	}

}
