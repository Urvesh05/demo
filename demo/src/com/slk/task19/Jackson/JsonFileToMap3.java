package com.slk.task19.Jackson;

import java.io.File;
import java.io.FilterInputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileToMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ObjectMapper mapper = new ObjectMapper();
		
		//For testing
			User user = createDummyUser();
		try {
			
			mapper.writeValue( new File("/home/urvesh.gayakwad/git/demo/demo/jsonfile/user.json"),user);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
			
	}
	
	
private static User createDummyUser(){
		
		User user = new User();
		
		user.setName("mkyong");
		user.setAge(33);

		List<String> msg = new ArrayList<>();
		msg.add("hello jackson 1");
		msg.add("hello jackson 2");
		msg.add("hello jackson 3");

		user.setMessages(msg);
		
		return user;
		
	}

}

//https://howtodoinjava.com/jaxb/convert-json-to-java-object-moxy/
//https://www.javaguides.net/2019/07/objectmapper-json-to-java-object.html
//https://mkyong.com/java/how-to-convert-java-object-to-from-json-jackson/?utm_source=mkyong.com&utm_medium=Referral&utm_campaign=afterpost-related&utm_content=link1