package com.slk.task19.Jackson;

import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileToMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ObjectMapper mapper = new ObjectMapper();
		
		try {
			
			File file = new File("/home/urvesh.gayakwad/git/demo/demo/jsonfile/user.json");
			
			HashMap<String, Object> map = new ObjectMapper().readValue(file,HashMap.class);
			
			System.out.println("=========json File To Map=======");
			
			System.out.println("name:"+map.get("name"));
			System.out.println("age:"+map.get("age"));
			System.out.println("College:"+map.get("College"));
			//System.out.println("st"+map.get("st"));
			
			//mapper.writeValue( new File("/home/urvesh.gayakwad/git/demo/demo/jsonfile/user.json"),user);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}	
}










//https://javarevisited.blogspot.com/2017/04/how-to-convert-map-to-json-to-hashmap-in-java.html
//https://howtodoinjava.com/jaxb/convert-json-to-java-object-moxy/
//https://www.javaguides.net/2019/07/objectmapper-json-to-java-object.html
//https://mkyong.com/java/how-to-convert-java-object-to-from-json-jackson/?utm_source=mkyong.com&utm_medium=Referral&utm_campaign=afterpost-related&utm_content=link1