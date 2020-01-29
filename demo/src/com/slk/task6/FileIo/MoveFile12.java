package com.slk.task6.FileIo;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.StandardCopyOption;

public class MoveFile12 {
	
	
	
	public static void fileMove() throws IOException 
	{
		try {
			
	
				File source =new File("/home/urvesh.gayakwad/git/demo/demo/Abc/ab.txt");
				File dest =new File("/home/urvesh.gayakwad/git/demo/demo/t/new.txt");//name change or not
				
				if(Files.move(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING) != null)
				{
					System.out.println("File Move Successfully ");
				
				}
	//				else if(!dest.exists())
	//				{
	//					System.out.println("File Allready Moved");
	//					
	//				}	
				
				else
				{
					System.out.println("File Not Move");
				}
			
			}
			catch (NoSuchFileException e) 
			{
				System.out.println("file not Found");
			}
			catch (FileAlreadyExistsException e1) 
			{
				System.out.println("File All Ready Exists");
			}
			catch (Exception e) 
			{
			
				e.printStackTrace();
			}
			
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		MoveFile12.fileMove();
	}

}
