package com.slk.task7.Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectToFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		
		//write Data In ObjectOutputStream
		
		Demo2 d = new Demo2("sahu",12);
		
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/serilization.txt");
		
		//Assign file in to this class 
		FileOutputStream st = new FileOutputStream(file);
		
		//write file in Object format
		ObjectOutputStream out = new ObjectOutputStream(st);
		
		out.writeObject(d);
		
		out.flush();
		out.close();
		System.out.println("Write file in Object type data");
		
		//deserilization 
		/*
		FileInputStream in = new FileInputStream(file);
		ObjectInputStream readFile = new ObjectInputStream(in);
		
		
		Demo d1=null;
		
		try {
			
			d1=(Demo) readFile.readObject();
			
			System.out.println(d1);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
	}

}
