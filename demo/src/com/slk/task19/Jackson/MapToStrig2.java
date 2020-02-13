package com.slk.task19.Jackson;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapToStrig2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Ganesh");
		map.put("college","Gtu");
		
		try {
			
			//convert map to String
			String s= mapper.writeValueAsString(map);
			
			System.out.println(s);// compact-print
			
//			
//			s= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
//			System.out.println(s);// pretty-print
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
