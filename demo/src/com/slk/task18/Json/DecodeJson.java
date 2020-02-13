package com.slk.task18.Json;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


public class DecodeJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "{\"name\":\"Sajan\",\"age\":40,\"salary\":1000.0}";
		Object obj = JSONValue.parse(s);
		JSONObject jsonObject= (JSONObject) obj;
		
		String name=(String) jsonObject.get("name");
		Long age = (Long) jsonObject.get("age");
		Double salary = (Double) jsonObject.get("salary");
		
		System.out.println(name+  "  "+age+" "+salary);
		
	
	}

}
