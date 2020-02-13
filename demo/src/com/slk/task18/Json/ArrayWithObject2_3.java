package com.slk.task18.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class ArrayWithObject2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONObject obj = new JSONObject();
		
		obj.put("firstName","Hari");
		obj.put("lastName", "Patel");
		
		System.out.println("=======Json Object ========\n");
		System.out.println(obj);
		
		
		System.out.println("\n==========Json Array=======\n");
		JSONArray array = new JSONArray();
		array.add(obj);
		System.out.println(array);
		
		
		System.out.println("\n========Array With Json Object =====");
		JSONObject obj2 = new JSONObject();
		obj2.put("Student",array);
		
		System.out.println(obj2);
		
	}

}
