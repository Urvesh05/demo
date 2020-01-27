package com.slk.task6.FileIo;

import java.io.File;
import java.io.IOException;

public class ConstructFilePathExample {
	
	//Construct file path
	public static void constructFilePath()
	{
		
		 String filePath = File.separator + "JavaExamples" + File.separator + "IO";
	     
		    //create new File object
		    File file = new File(filePath);
		   
		    System.out.println("File path is : " + file.getPath());     
	}
	
	

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("====Construct file path File Path Create=====");
		ConstructFilePathExample.constructFilePath();
		
		//All file Path Checked 
		System.out.println("\n========File Path =======");
		
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/pqr.txt");
		printPaths(file);
		
		
		System.out.println("\n========Relative File Path =======");
		
		//Relative Path
		file=new File("h.xsd");
		printPaths(file);
		
		
		
		System.out.println("\n========complex relative path =======");
		//complex relative path
		 file=new File("/home/urvesh.gayakwad/git/demo/../demo/Abc/pqr.txt");
		 printPaths(file);
		 
		 
		 System.out.println("\n========URI File Path=======");
		 
		 //URI Path
		 file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/pqr.txt");
		 printPaths(file);
	
	}
	
	private static void printPaths(File file) throws IOException {
		System.out.println("\nAbsolute Path: " + file.getAbsolutePath());
		System.out.println("\nCanonical Path: " + file.getCanonicalPath());
		System.out.println("\nPath: " + file.getPath());
	}
	
}
