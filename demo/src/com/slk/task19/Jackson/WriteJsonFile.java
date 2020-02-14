package com.slk.task19.Jackson;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJsonFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JSONObject studentDetail = new JSONObject();
	
		studentDetail.put("name", "Jigar");
		studentDetail.put("age", 30	);
		System.out.println(studentDetail);
		
		/*
		JSONArray studentList = new JSONArray();
		studentList.add(studentDetail);
		System.out.println(studentList);
		*/
		
		
		try(FileWriter fileWriter = new FileWriter("/home/urvesh.gayakwad/git/demo/demo/jsonfile/user.json")) 
		{
			
			fileWriter.write(studentDetail.toJSONString());
			fileWriter.flush();System.out.println();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
