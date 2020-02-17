package com.slk.task18.Json;

import org.json.simple.JSONObject;
import org.omg.CORBA.OMGVMCID;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject obj = new JSONObject();
		obj.put("xyz", "Hello");
		
		JSONObject obj1 = new JSONObject();
		obj1.put("abc", obj);
		
		JSONObject obj2 = new JSONObject();
		obj2.put("c", 123);
		
		JSONObject obj3 = new JSONObject();
		obj3.put("abc", obj);
		obj3.put("pqr", obj2);
		
		System.out.println(obj3);
	
	}

}
