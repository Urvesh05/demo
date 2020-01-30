package com.slk.task7.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try 
		{
			
			File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/serilization.txt");
			
			//File assign 
			FileInputStream in  = new FileInputStream(file);
			
			//Convert Object To Byte 
			ObjectInputStream readData = new ObjectInputStream(in);
			
			
			//cast of Demo class & read data
			Demo d1 = (Demo)readData.readObject();
			
			
			System.out.println(d1);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
