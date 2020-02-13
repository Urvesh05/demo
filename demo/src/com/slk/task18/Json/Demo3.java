package com.slk.task18.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject obj3=new JSONObject();
		obj3.put("Villege", "abc");
		obj3.put("city", "surat");
		
	
		
		JSONArray array2= new JSONArray();
		array2.add(obj3);
		
		JSONObject obj1 = new JSONObject();
		obj1.put("StrudentName","urvesh" );
		obj1.put("RollNo", 100);
		obj1.put("Address", array2);
		
		
		JSONArray array = new JSONArray();
		array.add(obj1);
		
		
		JSONObject obj2= new JSONObject();
		obj2.put("Student",array );
		
		System.out.println("======Nasted Array=======");
		System.out.println(obj2);
		
		
		
	}

}
