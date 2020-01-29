package com.slk.task6.FileIo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSize16 {
	
	
	//1. Files Class Using 
	
	public static void filesClass() throws IOException
	{
		
		System.out.println("\n=============Files class =============");
		
		String data="/home/urvesh.gayakwad/git/demo/demo/t/readonly.txt";
		
		Path path = Paths.get(data);
		
		long resutl;
		resutl=Files.size(path);
		System.out.println("file "+path+" Size ="+resutl+" Bytes");

	}
	
	//2. file 
	public static void fileClass()
	{
		System.out.println("\n=============File class =============");
		
		
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/abc.txt");
		
			if(file.exists())
			{
				double bytes =file.length();
				double kb=(bytes/1024);
				//double mb =(kb/1024);
				
				System.out.println("File Path --> "+file.getPath());
				System.out.println("File size is bytes = "+bytes);
				System.out.println("File size in kb = "+kb);
				//System.out.println("File size in mb = "+mb);
			}
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileSize16.filesClass();
		FileSize16.fileClass();
		
		
	}

}
