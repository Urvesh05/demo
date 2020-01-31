package com.slk.task7.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;


public class DynamicReadData4 {

	public static void main(String[] args) {
		
		try 
		{
			
			File file = new File("/home/urvesh.gayakwad/git/demo/demo/hello.txt");
			
			//File assign 
			FileInputStream in  = new FileInputStream(file);
			
			//Convert Object To Byte 
			ObjectInputStream readData = new ObjectInputStream(in);
		
			//Read Data From ArrayList
			ArrayList< Demo> array= new ArrayList<Demo>();
			array=(ArrayList<Demo>) readData.readObject();
			
			//Print Data to ArrayList(Without To String Method)
			Iterator<Demo> iterator = array.iterator();
		
			while (iterator.hasNext()) 
			{
				Demo demo = (Demo) iterator.next();
				
				System.out.println("Id = "+demo.i+ " Name = "+demo.s);
				//System.out.println(demo.s);
				
			}
			
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
