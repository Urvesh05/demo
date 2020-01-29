package com.slk.task6.FileIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileCopy11 {
	
	
	//1.CopyFil in files class
	
	public static void copyFiles() throws IOException 
	{
		File source =new File("/home/urvesh.gayakwad/git/demo/demo/Abc/pqr.txt");
		File dest =new File("/home/urvesh.gayakwad/git/demo/demo/t/copyFile.txt");
		
		if(Files.copy(source.toPath(), dest.toPath(),StandardCopyOption.REPLACE_EXISTING) != null)
		{
			System.out.println("File Copy Successfully ");
		}
		else
		{
			System.out.println("File Not Copy");
		}
		
	}
	
	//2.File Io
	/*
	public static void copyFileIo()
	{
		
		try {
			
			File in= new File("/home/urvesh.gayakwad/git/demo/demo/Abc/pqr.txt");
			File out = new File("/home/urvesh.gayakwad/git/demo/demo/t/CopyForIo.txt");
			
			FileInputStream readfile= new FileInputStream(in);
			FileOutputStream writefile = new FileOutputStream(out);
			
			byte[] arr=new byte[1024];
			int i;
			
			while((i=readfile.read(arr))>0)
			{
				writefile.write(arr, 0, i);
			}
			
			//readfile.delete();
			readfile.close();
			writefile.close();
			
			System.out.println("File Copy");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
*/
	public static void main(String[] args)  throws ClassNotFoundException, IOException{
		// TODO Auto-generated method stub
		
	FileCopy11.copyFiles();
	//FileCopy11.copyFileIo();

	}

}
