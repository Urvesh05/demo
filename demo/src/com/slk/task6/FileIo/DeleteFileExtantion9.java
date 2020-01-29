package com.slk.task6.FileIo;

import java.io.File;
import java.io.IOException;

public class DeleteFileExtantion9 {
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String directory="/home/urvesh.gayakwad/git/demo/demo/t";
		String extantion=".txt";
		
		try {
			
			deleteFile(directory,extantion);
			
			System.out.println("Delete File  ");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Not delete file");
			
		}
	}	
	
	public static void deleteFile(String directory, String extantion)throws IOException 
			
	{
		// TODO Auto-generated method stub
		File f = new File(directory);
		for(File file: f.listFiles())
		{
			if(file.getName().endsWith(extantion)&& !file.delete())
			{
				
			throw new IOException();
			}
		
		}	
	}
}
