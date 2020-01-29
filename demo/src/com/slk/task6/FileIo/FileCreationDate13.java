package com.slk.task6.FileIo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FileCreationDate13 {
	
	
	
	public static void createFile() //method to create new file.
	{
		
		// 1. Create File //2.StringTokenizer  "Runtime.getRuntime().exec" 
				File file = new File("/home/urvesh.gayakwad/git/demo/demo/Abc/getDate1.txt");
				
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
							write.write("hello Good Morning how are you");
							write.close();
							
							
							//Access data and time
							Path path=file.toPath();
							
							BasicFileAttributes fct= Files.readAttributes(path, BasicFileAttributes.class);	
							
							System.out.println("File Creation Time :"+fct.creationTime());//lastAccessTime()),lastModifiedTime()
							
							//System.out.println("File Last Access Modification Time :"+fct.lastModifiedTime());//lastAccessTime()),lastModifiedTime()
							
				} 
						catch (IOException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileCreationDate13.createFile();

	}

}
