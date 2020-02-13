package com.slk.task18.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class NestedObjectAndArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//json 1
		JSONObject obj = new JSONObject();
		obj.put("Name", "Ravi");
		obj.put("Id",101);
		
		
		//array 1
		JSONArray array = new JSONArray();
		array.add(obj);//Json Store in array
		
		//json 2
		JSONObject obj3 = new JSONObject();
		obj3.put("College","Gtu");
		
		//array 2
		JSONArray array2 = new JSONArray();
		array2.add(obj3);
		array2.add(array);//nested array
		
		//main json object
		JSONObject main = new JSONObject();
		//obj2.put("NastedObject", obj3);
		main.put("Student Details", array);//array 1 store (nested Object)
		main.put("CollegeName", array2);//array 2 store 
		
		
		System.out.println("========Nested Object And Array=========");
		System.out.println(main);
		
		

	}

}
