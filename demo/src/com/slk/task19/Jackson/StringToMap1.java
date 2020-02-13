package com.slk.task19.Jackson;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StringToMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		String s="{\"name\":\"Rahul\",\"age\":\"30\"}";

		try {
			
			//convert json String to map
			Map<String,String> map=mapper.readValue(s, Map.class);
			
			//or
			
			//Map<String, String> map1 = mapper.readValue(s,new TypeReference<Map<String, String>>(){});
			
			System.out.println(map);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();	
		}
	}

}
