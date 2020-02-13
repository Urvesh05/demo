package com.slk.task18.Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StudentClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//obj 1 address
		JSONObject address= new JSONObject();
		address.put("city", "Surat");
		address.put("state", "Gujarat");
		
		//array 1 
		JSONArray addressList = new JSONArray();
		addressList.add(address);
		
		
		//obj 2 
		JSONObject student = new JSONObject();
		student.put("studenName", "Rahul");
		student.put("rollNo",21);
		student.put("subject", "Computer");
		student.put("age", 19);
		student.put("sem",6);
		
		//array 2
		JSONArray studentList= new JSONArray();
		studentList.add(student);
		
		//obj 3  to store array 1, 2
		JSONObject studenDetails= new JSONObject();
		studenDetails.put("StudentDetails", studentList);
		studenDetails.put("AddressDetails", addressList);
		
		System.out.println("==========Student Details =========");
		System.out.println(studenDetails);
		

	}

}
