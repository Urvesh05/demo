package com.slk.task18.Json;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class DemoJsonEncode {
	
	public static void encode()
	{
		JSONObject obj = new JSONObject();
		obj.put("Name",	"Sajan");
		obj.put("age",new Integer(23));
		obj.put("salary", new Double(10000));
		
		System.out.println(	"Json Encode => "+obj);
	}
	
	
	
	public static void encodeMap()
	{
		Map obj = new HashMap();
		obj.put("firstName","Rahul");
		obj.put("lastName", "Patel");
		String jsonText= JSONValue.toJSONString(obj);
		System.out.println(jsonText);
		
		
	}
	
	public static void encodeArray() {
		
		
		JSONArray arr = new JSONArray();  
		  arr.add("Dipak");    
		  arr.add(new Integer(27));    
		  arr.add(new Double(6000));   
		  System.out.print(arr);  
	}
	
	
	private static void decodeJson() {
		
		String s= "{\"name\":\"Sajan\",\"age\":40,\"salary\":10000}";
		Object obj = JSONValue.parse(s);
		JSONObject jsonObject= (JSONObject) obj;
		
		String name=(String) jsonObject.get("name");
		Long age = (Long) jsonObject.get("age");
		Long salary = (Long) jsonObject.get("salary");
		
		System.out.println(name+age+salary);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DemoJsonEncode.encode();
		DemoJsonEncode.encodeMap();
		DemoJsonEncode.encodeArray();	
		DemoJsonEncode.decodeJson();
	}

}
