package com.slk.task19.Jackson;

import java.io.File;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class JsonParsor6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//read data from JsonParser
		try (JsonParser jParser = new JsonFactory().createParser(new File("/home/urvesh.gayakwad/git/demo/demo/jsonfile/user1.json"));)
		{
			
			while(jParser.nextToken()!=JsonToken.END_OBJECT)
			{
				 //get the current token
				String fieldName= jParser.currentName();
				
				//move to next token
				
				  // current token is "name",
                // move to next, which is "name"'s value
				if("name".equals(fieldName))
				{
					jParser.nextToken();
					System.out.println(jParser.getText());
				}
				
				if("age".equals(fieldName))
				{
					jParser.nextToken();
					System.out.println(jParser.getText());
				}
				
				if("msg".equals(fieldName))
				{
					//System.out.println(jParser.getText());
					if(jParser.nextToken()==JsonToken.START_ARRAY)
					{
						// messages is array, loop until token equal to "]"
						
						while(jParser.nextToken()!=JsonToken.END_ARRAY)//traverse array to store data
						{
							System.out.println(jParser.getText());
						}
					}
						
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
