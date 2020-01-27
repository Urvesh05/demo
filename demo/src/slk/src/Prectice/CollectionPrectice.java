package slk.src.Prectice;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionPrectice {

	public static void arrayList()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(36);
		System.out.println(list);
	}
	
	public static void map()
	
	{
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(10, 38);
		map.put(23, 211);
		
		
		HashMap<Integer, Integer>map2=new HashMap<Integer, Integer>();
		map2.put(10, 38);
		map2.put(34, 88);
		
		map.putAll(map2);
		System.out.println(map);
		
		//handel duplicate key
		map2.forEach((key, value) -> map1.merge( key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + "," + v2)
			);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CollectionPrectice.arrayList(); 
		CollectionPrectice.map();
		

	}

}
