package com.slk.task18.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//nested Array
public class ObjectWithNestedArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//obj 1
		JSONObject obj2 = new JSONObject();
		obj2.put("city", "Rajkot");
		
		JSONArray array2= new JSONArray();
		array2.add(obj2);
		
		
		//obj 2 
		JSONObject obj = new JSONObject();
		obj.put("name","Rahul");
		obj.put("age", 20);
		
	
		JSONArray array = new JSONArray();
		array.add(obj);
		array.add(array2);//Nested Array
		
		JSONObject nastedArray= new JSONObject();
		nastedArray.put("Nasted Array", array);
		
		System.out.println("=========Nasted Array======");
		System.out.println(nastedArray);
		
		
	}

}
