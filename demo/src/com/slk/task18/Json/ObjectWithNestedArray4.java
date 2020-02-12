package com.slk.task18.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ObjectWithNestedArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONObject obj = new JSONObject();
		obj.put("name","Rahul");
		obj.put("age", 20);
		
		//System.out.println(obj);
		
		
		
		JSONObject obj2 = new JSONObject();
		obj2.put("Car",obj);
		
		
		JSONArray a = new JSONArray();
		a.add(obj2);
		
		
		//obj.put("cars",a);
		
		System.out.println(a	);
		/*
		JSONObject obj2 = new JSONObject();
		obj2.put("cars",a);
		//obj.put("age", 20);
		
		obj2.put("name", "BMW");
		
		

		JSONArray a2 = new JSONArray();
		a2.add(obj2);
		
		JSONObject obj3 = new JSONObject();
		obj3.put("models",a2);
		
		
		
		
		System.out.println(obj);
		System.out.println(a);
		System.out.println(obj2);
		System.out.println(obj3);
		*/
		
		
	}

}
