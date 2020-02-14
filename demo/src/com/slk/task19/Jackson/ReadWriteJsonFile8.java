package com.slk.task19.Jackson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadWriteJsonFile8 {
	
	//Write File
	public static void writeData()
	{
		ObjectMapper mapper = new ObjectMapper();//read & Write json data
		
		try 
		{
			
			FileWriter writer = new FileWriter("/home/urvesh.gayakwad/git/demo/demo/jsonfile/user3.json");
			
			JSONObject object = new JSONObject();//jobject 
			
			object.put("name", "rahul");//add object(data)
			object.put("age",30);
			object.put("city", "surat");
			
			JSONArray jsonArray = new JSONArray();
			jsonArray.add("Gurajat");
			jsonArray.add("MH");
			jsonArray.add("Panjab");
				
			object.put("State", jsonArray);
			
			writer.write(object.toJSONString());//store data in json file (write)
			writer.flush();
			writer.close();
			System.out.println(object);
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	//Read File 
	public static void readFile()
	{
			JSONParser parser = new JSONParser();//Json file Read
		
		try {
			
			FileReader reader = new FileReader("/home/urvesh.gayakwad/git/demo/demo/jsonfile/user3.json");//upload File
			
			Object object =parser.parse(reader);//file convert to Object 
			
			JSONObject jObject =(JSONObject) object;//object store in JsonObject
			
			String name= (String) jObject.get("name");//get json Object
			System.out.println("Name : "+name);
			
			Long age = (Long) jObject.get("age");
			System.out.println("Age : "+age);
			
			String city= (String) jObject.get("city");
			System.out.println("City : "+city);
			
			//Array Show 
			System.out.println("\nState are ....");
			
			JSONArray listOfState= (JSONArray) jObject.get("State");
			Iterator iterator= listOfState.iterator();
			
			while (iterator.hasNext()) {
				//Object object2 = (Object) iterator.next();
				System.out.println(iterator.next());
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=========Write File=======\n");
		ReadWriteJsonFile8.writeData();
		
		System.out.println("\n========Read File =======");
		ReadWriteJsonFile8.readFile();

	}

}


//https://java2blog.com/jsonsimple-example-read-and-write-json/