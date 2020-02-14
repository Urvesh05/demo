package com.slk.task19.Jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrettyPrintJson7 {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper = new ObjectMapper();
		
		String data = "{\"Age\":30,\"Technologies\":[\"Java\",\"Php\",\"Python\"],\"Name\":\"Adithya\"}";
		Object json = mapper.readValue(data, Object.class);
		//String s = mapper.writeValueAsString(data);
		//System.out.println(s);
		
		String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);// Pretty print JSON
		System.out.println(jsonStr);

	}

}
