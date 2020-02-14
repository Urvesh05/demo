package com.slk.task19.Jackson;

import java.io.File;
import java.io.FileWriter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JecksonTreeModel4 {
	
	
	//Writing JSON Tree using Tree Model
	public static void writingTreeModel() {
		
		try {
			//Create a new ObjectMapper object
			ObjectMapper mapper = new ObjectMapper();
			
			 //Get a JsonGenerator object from ObjectMapper
			JsonGenerator generator= mapper.getFactory().createGenerator(System.out);//print the output in the console.
			
			//Create the rootNode
			JsonNode treeRootNode= mapper.createObjectNode();
			
			
			 //Writing a simple node
			
			((ObjectNode) treeRootNode).put("name","Jigar");
			((ObjectNode) treeRootNode).put("Age",30);
			
			
			/*
			  //Writing a Array
			ArrayNode arrayNode = ((ObjectNode)treeRootNode).putArray("state");
			arrayNode.add("Surat");
			arrayNode.add("vapi");
			
			*/
			
			mapper.writeTree(generator, treeRootNode);
			
				//OR
			//String s= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(treeRootNode);
			//System.out.println(s);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	//read Data
	public static void readTreeModel()
	{
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			
			//JsonNode rootNode = mapper.readTree("/home/urvesh.gayakwad/git/demo/demo/jsonfile/user.json");
					
			JsonNode rootNode = mapper.readTree(new File("/home/urvesh.gayakwad/git/demo/demo/jsonfile/user.json"));	
			  //Reading individual nodes
            JsonNode nameNode = rootNode.path("name");
            System.out.println("Name : "+nameNode.asText());
            
            JsonNode ageNode = rootNode.path("age");
            System.out.println("Age : "+ageNode.asText());
            
      	
		}catch (JsonParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( " ========= write Data========== \n");
		JecksonTreeModel4.writingTreeModel();
		
		System.out.println("\n=======read Data =========\n");
		JecksonTreeModel4.readTreeModel();

	}

}





//https://mkyong.com/java/jackson-tree-model-example/?utm_source=mkyong.com&utm_medium=Referral&utm_campaign=afterpost-related&utm_content=link2