package com.slk.task6.FileIo;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class DeleteFile8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/DeleteFile.txt");
		
		if(file.delete())
		{
			System.out.println("ok");
		}else
		{
			System.out.println("not Delete");
		}
		
		*/
		try
		{	
			
			Files.deleteIfExists(Paths.get("/home/urvesh.gayakwad/git/demo/demo/6.txt"));
			System.out.println("test "+Files.deleteIfExists(Paths.get("/home/urvesh.gayakwad/git/demo/demo/6.txt")));
			
		}catch(NoSuchFileException n) 
				{
					n.printStackTrace();
					
					//System.out.println("No such file/directory exists");
				
				}
				catch(DirectoryNotEmptyException e) 
				{ 
					e.printStackTrace();
					
				//System.out.println("Directory is not empty."); 
				}catch(IOException e1) 
				{
					e1.printStackTrace();
					
					//System.out.println("permission ");
				}
		//System.out.println("Delete File");
		}	

}
