package com.slk.task8.FIleCompresion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressFileInZipFormat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			File file = new File("/home/urvesh.gayakwad/git/demo/demo/CompressFile/Abc.zip");
			
			FileOutputStream out = new FileOutputStream(file);//write file
			ZipOutputStream zip = new ZipOutputStream(out);//write data and compress to zip
			
			File file1= new File("/home/urvesh.gayakwad/git/demo/demo/CompressFile/test.txt");
			ZipEntry zipEntry= new ZipEntry(file1.getName());//read file test.txt
			zip.putNextEntry(zipEntry);
			
			
			FileInputStream input = new FileInputStream(file1);//read file test.txt
			
			byte[] buff= new byte[1024];
			int i;
			
			while((i=input.read())!=-1)
			{
				zip.write(buff,0,i);//write data & put data in Abc.zip file 
			}
			
			zip.closeEntry();
			zip.close();
			out.close();
			
			//System.out.println("regular file "+file.getCanonicalPath()+"zip file  path "+file);
			
			System.out.println("File Compress ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//create file 
		/*
		if(!file.exists())
		{
			try {
				file.createNewFile();
				System.out.println("File Created ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	*/	
		
	}

}
