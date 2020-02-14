package com.slk.task19.Jackson;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class CreateTreeModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JsonNodeFactory fectory= new JsonNodeFactory(false);//
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode details = fectory.objectNode();//no object create
		
		details.put("name", "rahul");
		details.put("age", 20);
		
		ArrayNode arrayNode = fectory.arrayNode();
		arrayNode.add("java").add("php").add("html");
		details.set("student",arrayNode);
		
		try {
			
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(details));
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
