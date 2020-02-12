package com.slk.task18.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Demo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JSONObject obj = new JSONObject();
		obj.put(1, "Abc");
		obj.put(2, "Kamal");
		
		System.out.println("=========Json Object ==========");
		System.out.println(obj);
		
		
	}

}

//https://mkyong.com/java/json-simple-example-read-and-write-json/
//https://howtodoinjava.com/library/json-simple-read-write-json-examples/