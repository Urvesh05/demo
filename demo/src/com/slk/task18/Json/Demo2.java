package com.slk.task18.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONObject obj = new JSONObject();
		obj.put("firstName","rahul");
		obj.put("Id", 123);
		
		
		JSONArray array = new JSONArray();
		array.add(obj);
		
		
		JSONObject obj2 = new JSONObject();
		obj2.put("student",array);
		
		//obj.put(array, obj); 
		//System.out.println("obj2 "+obj2);
		
		obj2.put("Villege", "surat");
		
		JSONObject obj3 = new JSONObject();
		
		JSONArray ar= new JSONArray();
		ar.add("add");
		
		ar.add(obj2);
		
		System.out.println(obj3);
		System.out.println("arr"+ar);

		/*
		JSONObject obj3 = new JSONObject();
		obj3.put("Villege", "Vlasd");
		
		JSONArray array2 = new JSONArray();
		array2.add(obj3);
		
		JSONObject obj4 = new JSONObject();
		obj4.put("Address", array2);
		
		System.out.println(obj4);
		
		*/
		
		
		
	}

}
