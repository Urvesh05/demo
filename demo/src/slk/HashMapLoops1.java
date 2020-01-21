package slk;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapLoops1 {
	
	public static void order()
	{
		HashMap<String , String> map= new HashMap<String, String>();
		map.put("C", "Viay");
		map.put("S","Harish");
		map.put("U","Rahul");
		
		Set<Entry<String,String>> enrtySet=map.entrySet();
		for(Entry<String,String> entry:enrtySet)
		{
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
		
		 System.out.println("-------------------------");
         
		//add all data
		HashMap<String,String> map1= new HashMap<String, String>();
		map1.put("T","Amit");
		map1.put("K","Gita");
		
		map1.putAll(map);//add all data
		enrtySet=map1.entrySet();
		
		for(Entry<String,String> entry:enrtySet)
		{
		System.out.println(entry.getKey() +" "+entry.getValue());	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMapLoops1.order();

	}

}
