package com.slk.task18.Json;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJsonFile9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Student 1
		JSONObject studentDetail = new JSONObject();
		studentDetail.put("firstName", "Jigar");
		studentDetail.put("middelName", "Kamal");
		studentDetail.put("lastName", "Patel");
		
		JSONObject studentObj = new JSONObject();
		studentObj.put("Student1", studentDetail);
		
		
			//Student 2
			JSONObject studentDetail2 = new JSONObject();
			studentDetail2.put("firstName", "Rohan");
			studentDetail2.put("middelName", "Tushar");
			studentDetail2.put("lastName", "Shah");
				
			JSONObject studentObj2 = new JSONObject();
			studentObj2.put("Student2", studentDetail2);
		
		//Add Student to List
		JSONArray studentList = new JSONArray();
		studentList.add(studentObj);
		studentList.add(studentObj2);
		
		
		//write Json File
		try (FileWriter filewrite = new FileWriter("/home/urvesh.gayakwad/git/demo/demo/jsonfile/student.json"))
		{
			
			filewrite.write(studentList.toJSONString());//
			filewrite.flush();
			
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("File Write Successfully !");
		System.out.println(studentList);
		
	}

}
