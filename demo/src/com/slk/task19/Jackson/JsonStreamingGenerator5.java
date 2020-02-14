package com.slk.task19.Jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonStreamingGenerator5 {
	
	
	public static void writeStriming()
	{
		ObjectMapper mapper = new ObjectMapper();

		 
		 try (JsonGenerator jGenerator = mapper.getFactory().
		 createGenerator( new File("/home/urvesh.gayakwad/git/demo/demo/jsonfile/user1.json") , JsonEncoding.UTF8)) {
       
	        jGenerator.writeStartObject();  //start Object                                // {
	
	        jGenerator.writeStringField("name", "Hari");  				// "name" : "Hari"
	        jGenerator.writeNumberField("age", 18);         			// "age" : 18
	
	        jGenerator.writeFieldName("msg");                          // "messages" :
	
	        jGenerator.writeStartArray(); //start Array                 // [
	
	        jGenerator.writeString("Hello");                           	// "msg 1"
	        jGenerator.writeString("How are ");                         // "msg 2"
	        jGenerator.writeString("you");                            	// "msg 3"
	
	        jGenerator.writeEndArray();  //end aaray                    // ]
	
	        jGenerator.writeEndObject();  //enad object                                  // }
		
	        
	        System.out.println("write File ok");
	        
	    } catch (JsonGenerationException e) 
		 {
	        e.printStackTrace();
	    } catch (JsonMappingException e) 
		 {
	        e.printStackTrace();
	    } catch (IOException e) 
		 {
	        e.printStackTrace();
	    }
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=========write file======\n");
		JsonStreamingGenerator5.writeStriming();
		
		 
	}
}
