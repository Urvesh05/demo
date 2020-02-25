package com.slk.task.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DynamicFile8 
{
	
	
	//Write File 
	//put data into file
	public static void getData() throws IOException 
	{
		//ArrayList 
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tarun");
		list.add("Hari");
		list.add("Tushar");
		list.add("Rahul");
		
		//file create	
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/dynamicFile.txt");
		
		if(file.createNewFile())
		{
			System.out.println("New File Created");
		}
		else 
		
		{
			System.out.println("File Already Exists\n");
		}
		
		try {
			
		    FileOutputStream fos = new FileOutputStream(file);
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    
		    oos.writeObject(list); 
		    oos.close();
		    
		    System.out.println("Write Data in File In to This File Location => "+file.getAbsolutePath());
		   // System.out.println(" ---data is --->"+list);
		} catch(Exception ex) 
		{
		    ex.printStackTrace();
		}	
	}
	

	//Get Data in to file 
	public static void readData() 
	{
		
		System.out.println("\n-----Read Data --------");
		
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/data4.txt");
	
		try {
			
			FileInputStream readData = new FileInputStream(file);
			ObjectInputStream readStream= new ObjectInputStream(readData);
			
			ArrayList< String> list2 = (ArrayList<String>) readStream.readObject();
			readStream.close();
			System.out.println(list2.toString());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		DynamicFile8.getData();
		DynamicFile8.readData();
		
	}

}
