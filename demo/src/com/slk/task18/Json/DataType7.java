package com.slk.task18.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataType7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JSONObject obj = new JSONObject();
		obj.put("Name", null);//null
		obj.put("Age", 20);//Number
		obj.put("Result",true);//Boolean
		obj.put("Gread","A");//string
		
		
		JSONArray array = new JSONArray();
		array.add(obj);
		
		//System.out.println(array);//Array
		
		JSONObject obj2 = new JSONObject();
		obj2.put("Data Type ", array);//Object(obj)
		
		System.out.println("======Data type===== ");
		System.out.println(obj2);
		
		
//		
		
		
	}

}
