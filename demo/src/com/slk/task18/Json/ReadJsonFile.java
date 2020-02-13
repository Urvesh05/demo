package com.slk.task18.Json;

import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.slk.task.opps.Student;

public class ReadJsonFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JSONParser parser = new JSONParser();//reading Json data 
		
		try(Reader reader= new FileReader("/home/urvesh.gayakwad/git/demo/demo/jsonfile/student.json")) 
		{
			
			Object jsonObject = parser.parse(reader);
			
			JSONArray studenList =(JSONArray) jsonObject;
			System.out.println(studenList);
			
			Iterator<String> iterator = studenList.iterator();
			
			while (iterator.hasNext()) 
			{
				String string = (String) iterator.next();
				//System.out.println(string);
				
			}
			
			
		} catch (Exception e) {	
			// TODO: handle exception
		}
		
		JSONObject studentObj=student.get("firstName");
		//https://howtodoinjava.com/library/json-simple-read-write-json-examples/
		//https://mkyong.com/java/json-simple-example-read-and-write-json/
		
	}

}
