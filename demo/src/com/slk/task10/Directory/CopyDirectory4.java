package com.slk.task10.Directory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyDirectory4 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		
		 //Source directory which you want to copy to new location
        File sourceFolder = new File("/home/urvesh.gayakwad/git/demo/demo/dir11/a");
         
        //Target directory where files should be copied
        File destinationFolder = new File("/home/urvesh.gayakwad/git/demo/demo/dir11/h");
 
        //Call Copy function
        copyFolder(sourceFolder, destinationFolder);
       
   	
	}

	private static void copyFolder(File sourceFolder, File destinationFolder) throws IOException {
		// TODO Auto-generated method stub
		
		
		 //Check if sourceFolder is a directory or file
        //If sourceFolder is file; then copy the file directly to new location
        if (sourceFolder.isDirectory()) 
        {
        	
            //Verify if destinationFolder is already present; If not then create it
            if (!destinationFolder.exists()) 
            {
                destinationFolder.mkdir();
                System.out.println("Directory created :: " + destinationFolder);
            }
            
            
            //Get all files from source directory
            String files[] = sourceFolder.list();
            
             
            //Iterate over all files and copy them to destinationFolder one by one
            for (String file : files) 
            {
            	
                File srcFile = new File(sourceFolder, file);
                File destFile = new File(destinationFolder, file);
                 
                //Recursive function call
                copyFolder(srcFile, destFile);
            }
        }
        else
        {
            //Copy the file content from one place to another 
            Files.copy(sourceFolder.toPath(), destinationFolder.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied :: " + destinationFolder);
        }
		
		
	}
}
		
		
		
		
		
		
		
		/*
		File sourceFolder =new File("/home/urvesh.gayakwad/git/demo/demo/dir11");
		File destinationFolder =new File("/home/urvesh.gayakwad/git/demo/demo/Gzip");
		
		//souce exist
		
		if(!sourceFolder.exists())
		{
				System.out.println("Directory not exist");
				System.exit(0);
				
				System.out.println("hello");
				
		}
		else
		{
			
			copyFolder(sourceFolder,destinationFolder);
		}
		
		System.out.println("Done");
		
		}

	//metho sub
	public static void copyFolder(File src, File dest) throws IOException 
	{
		
		// TODO Auto-generated method stub
		
		if(src.isDirectory())
		{
			
			//if directory not exists, create it
			if(!dest.exists())
			{
				
				dest.mkdir();
				System.out.println("Copy File source "+src+"to "+dest);
				
				
				//list all the directory contents
				String []files=src.list();
				
				for(String file:files)
				{
					//construct the src and dest file structure
					File  srcFile= new File(src,file);
					File destFile = new File(dest,file);
					
					 //recursive copy
					copyFolder(src, dest);
					
				}
				
			}
			else
			{
				//if file, then copy it
	    		//Use bytes stream to support all file types
				
				
				
			
				
					InputStream  in = new FileInputStream(src);
					
					
				
				
				
			
					OutputStream out = new FileOutputStream(dest);
					
				
				
				
				byte[] buffer=new byte[1024];
				
				int i;
				while((i=in.read())!=-1)
				{
					out.write(buffer, 0, i);
				}
				
				
				in.close();
				out.close();
				
				System.out.println("File Copy From "+src+" to "+dest);
			}
		}
		
		
	}

}*/
