package com.slk.task6.FileIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile1 {
	
	
	public static void createFile() //method to create new file.
	{
		
		// 1. Create File
				File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/abc.txt");
				
				try {
						if(file.createNewFile())
						{
								System.out.println("File Is Created");
						}
						else 
						{
							System.out.println("File Already exists");
						}
						
						//Write File
						
						FileWriter write = new FileWriter(file);
						write.write("hello Good Morning");
						write.close();
						
					
					} 
						catch (IOException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		}
		
		
	/*
	 * 
	 // 2.
	// FileOutputStream.write() method automatically create a new file and write content to it.
	public static void createFile2() throws IOException
	{
		String data="file Ccreate by FileInputeSteram";
		
		try {
		
				FileOutputStream out= new FileOutputStream("/home/urvesh.gayakwad/git/demo/demo/Abc/xyz.txt");
				
				
				out.write(data.getBytes());
				out.close();
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	*/
	
	//3. 
	/*
	
	public static void parthClass()//static method in the Paths class (java.nio.file.Paths) named Paths.get().	 
	{
		
		Path path = Paths.get("/home/urvesh.gayakwad/git/demo/demo/Abc/pqr.txt"); //creates Path instance  
	
		try {
				
		Path p=Files.createFile(path); //creates file at specified location  
		
		System.out.println("file Create "+p);
		
			
		}catch(IOException e) 
		{
			e.printStackTrace();
	}
	}*/

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CreateFile1.createFile();
		//CreateFile.createFile2();
		//CreateFile.parthClass();
		
		
	}
}
