package com.slk.task18.Json;

import org.json.simple.JSONObject;

public class ObjectWithNestedObject5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject obj2 = new JSONObject();
		obj2.put("Car1", "BMW");
		obj2.put("Car2", "BMW");
		obj2.put("Car3", "BMW");
		
		
		JSONObject obj = new JSONObject();
		obj.put("name", "urvesh");
		obj.put("age", 25);
		
		//Obj 1 nasted in Obj 2
		obj.put("cars", obj2);
		
		
		System.out.println("=========Nested Object ========");
		
		System.out.println(obj);
		
		
		
		
		

	}

}
