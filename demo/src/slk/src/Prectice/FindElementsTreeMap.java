package slk.src.Prectice;

import java.util.TreeMap;


public class FindElementsTreeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsKey("first")){
            System.out.println("The TreeMap contains key first");
        } else {
            System.out.println("The TreeMap does not contains key first");
        }
        if(hm.containsKey("fifth")){
            System.out.println("The TreeMap contains key fifth");
        } else {
            System.out.println("The TreeMap does not contains key fifth");
        }
	}

}