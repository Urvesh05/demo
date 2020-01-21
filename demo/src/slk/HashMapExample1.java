package slk;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {
	
	public static void hashmap()
	{
		HashMap< String ,String > map =new HashMap<String, String>();
		
		map.put("r","ki");
		map.put("b","hiren");
		map.put("c","vijay");
		map.put("d","jadav");
		map.put(null, "100"); // null key
		map.put("g", null); // null value
		
		//System.out.println(map);
		
		//Iterate a HashMap
		System.out.println("1.>>> show data");
		Iterator< String> itr = map.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			String val=map.get(key);
			System.out.println(key+ " "+val);
			
		}
		
		//Get value by key – HashMap.get()
		String value= map.get("b");
		System.out.println("\n2.>> get key=b values >> " +value);
		
		//Remove pair by key – HashMap.remove()
		String key=map.get("d");
		System.out.println("\n3.>> Remove key=d values >> "+key);
		
		//null key
		System.out.println("\n4.>> Null Value and Key Inserted ");
		boolean keyExists = map.containsKey(null);
		boolean valueExists = map.containsValue("100");
		
		System.out.println("\nkeyExists=" + keyExists + ", valueExists=" + valueExists);

		//null value
		boolean keyExists1 = map.containsKey("4");
		boolean valueExists1 = map.containsValue(null);
		System.out.println("keyExists=" + keyExists1 + ", valueExists=" + valueExists1);
		
		//entrySet
		System.out.println("\n 5. >> Entry set Show Data ");
		Set<Entry<String,String> >entrySet = map.entrySet();
		System.out.println(entrySet);
		
		//size
		System.out.println("\n6. >> Hash Map Size ");
		System.out.println("    Size ="+map.size());
		
		
		//put & set % remove
		System.out.println("\n 7. >> put set and remove data ");		
		Set<String> keySet = map.keySet();
		System.out.println(keySet);

		map.put("h", "jaga");
		System.out.println(keySet);
		
		keySet.remove("h");
		System.out.println(keySet);
		
		System.out.println("\n 8. >> Show Value ");
		Collection<String> values = map.values();
		System.out.println("Hashmap values = " + values);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMapExample1.hashmap();

	}

}

/*
 class Person {
	private String xyz;

	Person(String xyz)

	{
		this.xyz = xyz;
	}
}


public class NastedTryCatch {

	public static void main(String[] args) {
		
		
		
		
		
		
		/*HashMap<Person, String> mp = new HashMap<Person, String>();
		//mp.put(new Person("Tarun"), ("Hii"));
		
		Person person = new Person("Hii");
		
		mp.put(person, ("Hii"));

		System.out.println(mp);
		System.out.println(mp.get(person));

	}
}
*/

